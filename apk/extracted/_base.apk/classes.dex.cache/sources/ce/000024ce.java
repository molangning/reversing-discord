package com.facebook.react.devsupport;

import android.content.Context;
import android.widget.Toast;
import com.facebook.react.C3893R;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaJSExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.common.futures.SimpleSettableFuture;
import com.facebook.react.devsupport.DevSupportManagerBase;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.react.devsupport.interfaces.DevSplitBundleCallback;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.packagerconnection.RequestHandler;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p058d5.C5743a;
import p127h3.C6889c;
import p148i3.C7380a;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class BridgeDevSupportManager extends DevSupportManagerBase {
    private DevLoadingViewManager mDevLoadingViewManager;
    private boolean mIsSamplingProfilerEnabled;
    private ReactInstanceDevHelper mReactInstanceManagerHelper;

    public BridgeDevSupportManager(Context context, ReactInstanceDevHelper reactInstanceDevHelper, String str, boolean z, RedBoxHandler redBoxHandler, DevBundleDownloadListener devBundleDownloadListener, int i, Map<String, RequestHandler> map, SurfaceDelegateFactory surfaceDelegateFactory, DevLoadingViewManager devLoadingViewManager) {
        super(context, reactInstanceDevHelper, str, z, redBoxHandler, devBundleDownloadListener, i, map, surfaceDelegateFactory, devLoadingViewManager);
        String str2;
        String string;
        this.mIsSamplingProfilerEnabled = false;
        this.mReactInstanceManagerHelper = reactInstanceDevHelper;
        this.mDevLoadingViewManager = devLoadingViewManager;
        if (getDevSettings().isStartSamplingProfilerOnInit()) {
            if (!this.mIsSamplingProfilerEnabled) {
                toggleJSSamplingProfiler();
            } else {
                Toast.makeText(context, "JS Sampling Profiler was already running, so did not start the sampling profiler", 1).show();
            }
        }
        if (this.mIsSamplingProfilerEnabled) {
            str2 = "Disable Sampling Profiler";
        } else {
            str2 = "Enable Sampling Profiler";
        }
        addCustomDevOption(str2, new DevOptionHandler() { // from class: com.facebook.react.devsupport.BridgeDevSupportManager.1
            @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
            public void onOptionSelected() {
                BridgeDevSupportManager.this.toggleJSSamplingProfiler();
            }
        });
        if (!getDevSettings().isDeviceDebugEnabled()) {
            if (getDevSettings().isRemoteJSDebugEnabled()) {
                string = context.getString(C3893R.string.catalyst_debug_stop);
            } else {
                string = context.getString(C3893R.string.catalyst_debug);
            }
            addCustomDevOption(string, new DevOptionHandler() { // from class: com.facebook.react.devsupport.BridgeDevSupportManager.2
                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public void onOptionSelected() {
                    BridgeDevSupportManager.this.getDevSettings().setRemoteJSDebugEnabled(!BridgeDevSupportManager.this.getDevSettings().isRemoteJSDebugEnabled());
                    BridgeDevSupportManager.this.handleReloadJS();
                }
            });
        }
    }

    public WebsocketJavaScriptExecutor.JSExecutorConnectCallback getExecutorConnectCallback(final SimpleSettableFuture<Boolean> simpleSettableFuture) {
        return new WebsocketJavaScriptExecutor.JSExecutorConnectCallback() { // from class: com.facebook.react.devsupport.BridgeDevSupportManager.4
            @Override // com.facebook.react.devsupport.WebsocketJavaScriptExecutor.JSExecutorConnectCallback
            public void onFailure(Throwable th2) {
                BridgeDevSupportManager.this.hideDevLoadingView();
                C13677a.m1853k(ReactConstants.TAG, "Failed to connect to debugger!", th2);
                simpleSettableFuture.setException(new IOException(BridgeDevSupportManager.this.getApplicationContext().getString(C3893R.string.catalyst_debug_error), th2));
            }

            @Override // com.facebook.react.devsupport.WebsocketJavaScriptExecutor.JSExecutorConnectCallback
            public void onSuccess() {
                simpleSettableFuture.set(Boolean.TRUE);
                BridgeDevSupportManager.this.hideDevLoadingView();
            }
        };
    }

    private void reloadJSInProxyMode() {
        getDevServerHelper().launchJSDevtools();
        getReactInstanceDevHelper().onReloadWithJSDebugger(new JavaJSExecutor.Factory() { // from class: com.facebook.react.devsupport.BridgeDevSupportManager.5
            @Override // com.facebook.react.bridge.JavaJSExecutor.Factory
            public JavaJSExecutor create() {
                WebsocketJavaScriptExecutor websocketJavaScriptExecutor = new WebsocketJavaScriptExecutor();
                SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
                websocketJavaScriptExecutor.connect(BridgeDevSupportManager.this.getDevServerHelper().getWebsocketProxyURL(), BridgeDevSupportManager.this.getExecutorConnectCallback(simpleSettableFuture));
                try {
                    simpleSettableFuture.get(90L, TimeUnit.SECONDS);
                    return websocketJavaScriptExecutor;
                } catch (InterruptedException e) {
                    e = e;
                    throw new RuntimeException(e);
                } catch (ExecutionException e2) {
                    throw ((Exception) e2.getCause());
                } catch (TimeoutException e3) {
                    e = e3;
                    throw new RuntimeException(e);
                }
            }
        });
    }

    public void toggleJSSamplingProfiler() {
        JavaScriptExecutorFactory javaScriptExecutorFactory = getReactInstanceDevHelper().getJavaScriptExecutorFactory();
        try {
            if (!this.mIsSamplingProfilerEnabled) {
                try {
                    try {
                        javaScriptExecutorFactory.startSamplingProfiler();
                        Toast.makeText(getApplicationContext(), "Starting Sampling Profiler", 0).show();
                    } catch (UnsupportedOperationException unused) {
                        Context applicationContext = getApplicationContext();
                        Toast.makeText(applicationContext, javaScriptExecutorFactory.toString() + " does not support Sampling Profiler", 1).show();
                    }
                    return;
                } finally {
                    this.mIsSamplingProfilerEnabled = true;
                }
            }
            try {
                String path = File.createTempFile("sampling-profiler-trace", ".cpuprofile", getApplicationContext().getCacheDir()).getPath();
                javaScriptExecutorFactory.stopSamplingProfiler(path);
                Context applicationContext2 = getApplicationContext();
                Toast.makeText(applicationContext2, "Saved results from Profiler to " + path, 1).show();
            } catch (IOException unused2) {
                C13677a.m1854j(ReactConstants.TAG, "Could not create temporary file for saving results from Sampling Profiler");
            } catch (UnsupportedOperationException unused3) {
                Context applicationContext3 = getApplicationContext();
                Toast.makeText(applicationContext3, javaScriptExecutorFactory.toString() + "does not support Sampling Profiler", 1).show();
            }
        } finally {
            this.mIsSamplingProfilerEnabled = false;
        }
    }

    public DevLoadingViewManager getDevLoadingViewManager() {
        return this.mDevLoadingViewManager;
    }

    public ReactInstanceDevHelper getReactInstanceManagerHelper() {
        return this.mReactInstanceManagerHelper;
    }

    @Override // com.facebook.react.devsupport.DevSupportManagerBase
    protected String getUniqueTag() {
        return "Bridge";
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void handleReloadJS() {
        UiThreadUtil.assertOnUiThread();
        ReactMarker.logMarker(ReactMarkerConstants.RELOAD, getDevSettings().getPackagerConnectionSettings().getDebugServerHost());
        hideRedboxDialog();
        if (getDevSettings().isRemoteJSDebugEnabled()) {
            C6889c.m21705a().mo21706c(C7380a.f19861c, "RNCore: load from Proxy");
            showDevLoadingViewForRemoteJSEnabled();
            reloadJSInProxyMode();
            return;
        }
        C6889c.m21705a().mo21706c(C7380a.f19861c, "RNCore: load from Server");
        reloadJSFromServer(getDevServerHelper().getDevServerBundleURL((String) C5743a.m24583c(getJSAppBundleName())));
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void loadSplitBundleFromServer(final String str, final DevSplitBundleCallback devSplitBundleCallback) {
        fetchSplitBundleAndCreateBundleLoader(str, new DevSupportManagerBase.CallbackWithBundleLoader() { // from class: com.facebook.react.devsupport.BridgeDevSupportManager.3
            @Override // com.facebook.react.devsupport.DevSupportManagerBase.CallbackWithBundleLoader
            public void onError(String str2, Throwable th2) {
                devSplitBundleCallback.onError(str2, th2);
            }

            @Override // com.facebook.react.devsupport.DevSupportManagerBase.CallbackWithBundleLoader
            public void onSuccess(JSBundleLoader jSBundleLoader) {
                jSBundleLoader.loadScript(BridgeDevSupportManager.this.getCurrentContext().getCatalystInstance());
                ((HMRClient) BridgeDevSupportManager.this.getCurrentContext().getJSModule(HMRClient.class)).registerBundle(BridgeDevSupportManager.this.getDevServerHelper().getDevServerSplitBundleURL(str));
                devSplitBundleCallback.onSuccess();
            }
        });
    }
}