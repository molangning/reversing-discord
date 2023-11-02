package com.facebook.react.devsupport;

import android.content.Context;
import android.os.AsyncTask;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.BundleDownloader;
import com.facebook.react.devsupport.InspectorPackagerConnection;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.packagerconnection.FileIoHandler;
import com.facebook.react.packagerconnection.JSPackagerClient;
import com.facebook.react.packagerconnection.NotificationOnlyHandler;
import com.facebook.react.packagerconnection.ReconnectingWebSocket;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.packagerconnection.RequestOnlyHandler;
import com.facebook.react.packagerconnection.Responder;
import com.facebook.react.util.RNLog;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Sink;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p058d5.C5743a;
import p122gk.C6840m;
import p328rj.InterfaceC12283d;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DevServerHelper {
    private static final String DEBUGGER_MSG_DISABLE = "{ \"id\":1,\"method\":\"Debugger.disable\" }";
    private static final int HTTP_CONNECT_TIMEOUT_MS = 5000;
    public static final String RELOAD_APP_EXTRA_JS_PROXY = "jsproxy";
    private final BundleDownloader mBundleDownloader;
    private InspectorPackagerConnection.BundleStatusProvider mBundlerStatusProvider;
    private final OkHttpClient mClient;
    private InspectorPackagerConnection mInspectorPackagerConnection;
    private final String mPackageName;
    private JSPackagerClient mPackagerClient;
    private final PackagerStatusCheck mPackagerStatusCheck;
    private final DevInternalSettings mSettings;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum BundleType {
        BUNDLE("bundle"),
        MAP("map");
        
        private final String mTypeID;

        BundleType(String str) {
            this.mTypeID = str;
        }

        public String typeID() {
            return this.mTypeID;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface OnServerContentChangeListener {
        void onServerContentChanged();
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface PackagerCommandListener {
        Map<String, RequestHandler> customCommandHandlers();

        void onCaptureHeapCommand(Responder responder);

        void onPackagerConnected();

        void onPackagerDevMenuCommand();

        void onPackagerDisconnected();

        void onPackagerReloadCommand();
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface PackagerCustomCommandProvider {
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface SymbolicationListener {
        void onSymbolicationComplete(Iterable<StackFrame> iterable);
    }

    public DevServerHelper(DevInternalSettings devInternalSettings, String str, InspectorPackagerConnection.BundleStatusProvider bundleStatusProvider) {
        this.mSettings = devInternalSettings;
        this.mBundlerStatusProvider = bundleStatusProvider;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient m8771c = builder.m8769e(5000L, timeUnit).m8775O(0L, timeUnit).m8774P(0L, timeUnit).m8771c();
        this.mClient = m8771c;
        this.mBundleDownloader = new BundleDownloader(m8771c);
        this.mPackagerStatusCheck = new PackagerStatusCheck(m8771c);
        this.mPackageName = str;
    }

    private String createBundleURL(String str, BundleType bundleType, String str2) {
        return createBundleURL(str, bundleType, str2, false, true);
    }

    private String createLaunchJSDevtoolsCommandUrl() {
        return String.format(Locale.US, "http://%s/launch-js-devtools", this.mSettings.getPackagerConnectionSettings().getDebugServerHost());
    }

    private static String createOpenStackFrameURL(String str) {
        return String.format(Locale.US, "http://%s/open-stack-frame", str);
    }

    private static String createResourceURL(String str, String str2) {
        return String.format(Locale.US, "http://%s/%s", str, str2);
    }

    private String createSplitBundleURL(String str, String str2) {
        return createBundleURL(str, BundleType.BUNDLE, str2, true, false);
    }

    private static String createSymbolicateURL(String str) {
        return String.format(Locale.US, "http://%s/symbolicate", str);
    }

    private boolean getDevMode() {
        return this.mSettings.isJSDevModeEnabled();
    }

    private String getHostForJSProxy() {
        String str = (String) C5743a.m24583c(this.mSettings.getPackagerConnectionSettings().getDebugServerHost());
        int lastIndexOf = str.lastIndexOf(58);
        if (lastIndexOf <= -1) {
            return AndroidInfoHelpers.DEVICE_LOCALHOST;
        }
        return AndroidInfoHelpers.DEVICE_LOCALHOST + str.substring(lastIndexOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getInspectorDeviceUrl() {
        return String.format(Locale.US, "http://%s/inspector/device?name=%s&app=%s", this.mSettings.getPackagerConnectionSettings().getInspectorServerHost(), AndroidInfoHelpers.getFriendlyDeviceName(), this.mPackageName);
    }

    private boolean getJSMinifyMode() {
        return this.mSettings.isJSMinifyEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getOpenUrlEndpoint(Context context) {
        return String.format(Locale.US, "http://%s/open-url", AndroidInfoHelpers.getServerHost(context));
    }

    public void closeInspectorConnection() {
        new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                if (DevServerHelper.this.mInspectorPackagerConnection != null) {
                    DevServerHelper.this.mInspectorPackagerConnection.closeQuietly();
                    DevServerHelper.this.mInspectorPackagerConnection = null;
                }
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void closePackagerConnection() {
        new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                if (DevServerHelper.this.mPackagerClient != null) {
                    DevServerHelper.this.mPackagerClient.close();
                    DevServerHelper.this.mPackagerClient = null;
                }
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void disableDebugger() {
        InspectorPackagerConnection inspectorPackagerConnection = this.mInspectorPackagerConnection;
        if (inspectorPackagerConnection != null) {
            inspectorPackagerConnection.sendEventToAllConnections(DEBUGGER_MSG_DISABLE);
        }
    }

    public void downloadBundleFromURL(DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleDownloader.BundleInfo bundleInfo) {
        this.mBundleDownloader.downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo);
    }

    public File downloadBundleResourceFromUrlSync(String str, File file) {
        Sink sink;
        try {
            Response execute = this.mClient.mo8811b(new Request.Builder().m8722l(createResourceURL(this.mSettings.getPackagerConnectionSettings().getDebugServerHost(), str)).m8732b()).execute();
            if (!execute.m8701X()) {
                execute.close();
                return null;
            }
            try {
                sink = C6840m.m21827f(file);
            } catch (Throwable th2) {
                th = th2;
                sink = null;
            }
            try {
                C6840m.m21829d(execute.m8699a().source()).mo8583u0(sink);
                if (sink != null) {
                    sink.close();
                }
                execute.close();
                return file;
            } catch (Throwable th3) {
                th = th3;
                if (sink != null) {
                    sink.close();
                }
                throw th;
            }
        } catch (Exception e) {
            C13677a.m1852l(ReactConstants.TAG, "Failed to fetch resource synchronously - resourcePath: \"%s\", outputFile: \"%s\"", str, file.getAbsolutePath(), e);
            return null;
        }
    }

    public String getDevServerBundleURL(String str) {
        return createBundleURL(str, BundleType.BUNDLE, this.mSettings.getPackagerConnectionSettings().getDebugServerHost());
    }

    public String getDevServerSplitBundleURL(String str) {
        return createSplitBundleURL(str, this.mSettings.getPackagerConnectionSettings().getDebugServerHost());
    }

    public String getJSBundleURLForRemoteDebugging(String str) {
        return createBundleURL(str, BundleType.BUNDLE, getHostForJSProxy());
    }

    public String getSourceMapUrl(String str) {
        return createBundleURL(str, BundleType.MAP);
    }

    public String getSourceUrl(String str) {
        return createBundleURL(str, BundleType.BUNDLE);
    }

    public String getWebsocketProxyURL() {
        return String.format(Locale.US, "ws://%s/debugger-proxy?role=client", this.mSettings.getPackagerConnectionSettings().getDebugServerHost());
    }

    public void isPackagerRunning(PackagerStatusCallback packagerStatusCallback) {
        String debugServerHost = this.mSettings.getPackagerConnectionSettings().getDebugServerHost();
        if (debugServerHost == null) {
            C13677a.m1870H(ReactConstants.TAG, "No packager host configured.");
            packagerStatusCallback.onPackagerStatusFetched(false);
            return;
        }
        this.mPackagerStatusCheck.run(debugServerHost, packagerStatusCallback);
    }

    public void launchJSDevtools() {
        this.mClient.mo8811b(new Request.Builder().m8722l(createLaunchJSDevtoolsCommandUrl()).m8732b()).mo1994i(new InterfaceC12283d() { // from class: com.facebook.react.devsupport.DevServerHelper.8
            @Override // p328rj.InterfaceC12283d
            public void onFailure(Call call, IOException iOException) {
            }

            @Override // p328rj.InterfaceC12283d
            public void onResponse(Call call, Response response) {
            }
        });
    }

    public void openInspectorConnection() {
        if (this.mInspectorPackagerConnection != null) {
            C13677a.m1870H(ReactConstants.TAG, "Inspector connection already open, nooping.");
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper.3
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                public Void doInBackground(Void... voidArr) {
                    DevServerHelper devServerHelper = DevServerHelper.this;
                    devServerHelper.mInspectorPackagerConnection = new InspectorPackagerConnection(devServerHelper.getInspectorDeviceUrl(), DevServerHelper.this.mPackageName, DevServerHelper.this.mBundlerStatusProvider);
                    DevServerHelper.this.mInspectorPackagerConnection.connect();
                    return null;
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void openPackagerConnection(final String str, final PackagerCommandListener packagerCommandListener) {
        if (this.mPackagerClient != null) {
            C13677a.m1870H(ReactConstants.TAG, "Packager connection already open, nooping.");
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                public Void doInBackground(Void... voidArr) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("reload", new NotificationOnlyHandler() { // from class: com.facebook.react.devsupport.DevServerHelper.1.1
                        @Override // com.facebook.react.packagerconnection.NotificationOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                        public void onNotification(Object obj) {
                            packagerCommandListener.onPackagerReloadCommand();
                        }
                    });
                    hashMap.put("devMenu", new NotificationOnlyHandler() { // from class: com.facebook.react.devsupport.DevServerHelper.1.2
                        @Override // com.facebook.react.packagerconnection.NotificationOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                        public void onNotification(Object obj) {
                            packagerCommandListener.onPackagerDevMenuCommand();
                        }
                    });
                    hashMap.put("captureHeap", new RequestOnlyHandler() { // from class: com.facebook.react.devsupport.DevServerHelper.1.3
                        @Override // com.facebook.react.packagerconnection.RequestOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                        public void onRequest(Object obj, Responder responder) {
                            packagerCommandListener.onCaptureHeapCommand(responder);
                        }
                    });
                    Map<String, RequestHandler> customCommandHandlers = packagerCommandListener.customCommandHandlers();
                    if (customCommandHandlers != null) {
                        hashMap.putAll(customCommandHandlers);
                    }
                    hashMap.putAll(new FileIoHandler().handlers());
                    ReconnectingWebSocket.ConnectionCallback connectionCallback = new ReconnectingWebSocket.ConnectionCallback() { // from class: com.facebook.react.devsupport.DevServerHelper.1.4
                        @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback
                        public void onConnected() {
                            packagerCommandListener.onPackagerConnected();
                        }

                        @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback
                        public void onDisconnected() {
                            packagerCommandListener.onPackagerDisconnected();
                        }
                    };
                    DevServerHelper.this.mPackagerClient = new JSPackagerClient(str, DevServerHelper.this.mSettings.getPackagerConnectionSettings(), hashMap, connectionCallback);
                    DevServerHelper.this.mPackagerClient.init();
                    return null;
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void openStackFrameCall(StackFrame stackFrame) {
        ((Call) C5743a.m24583c(this.mClient.mo8811b(new Request.Builder().m8722l(createOpenStackFrameURL(this.mSettings.getPackagerConnectionSettings().getDebugServerHost())).m8726h(RequestBody.create(MediaType.m8839f("application/json"), stackFrame.toJSON().toString())).m8732b()))).mo1994i(new InterfaceC12283d() { // from class: com.facebook.react.devsupport.DevServerHelper.7
            @Override // p328rj.InterfaceC12283d
            public void onFailure(Call call, IOException iOException) {
                C13677a.m1870H(ReactConstants.TAG, "Got IOException when attempting to open stack frame: " + iOException.getMessage());
            }

            @Override // p328rj.InterfaceC12283d
            public void onResponse(Call call, Response response) {
            }
        });
    }

    public void openUrl(final ReactContext reactContext, final String str, final String str2) {
        new AsyncTask<Void, String, Boolean>() { // from class: com.facebook.react.devsupport.DevServerHelper.5
            public boolean doSync() {
                try {
                    String openUrlEndpoint = DevServerHelper.this.getOpenUrlEndpoint(reactContext);
                    new OkHttpClient().mo8811b(new Request.Builder().m8722l(openUrlEndpoint).m8726h(RequestBody.create(MediaType.m8839f("application/json"), new JSONObject().put("url", str).toString())).m8732b()).execute();
                    return true;
                } catch (IOException | JSONException e) {
                    C13677a.m1853k(ReactConstants.TAG, "Failed to open URL" + str, e);
                    return false;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Boolean doInBackground(Void... voidArr) {
                return Boolean.valueOf(doSync());
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public void onPostExecute(Boolean bool) {
                if (bool.booleanValue()) {
                    return;
                }
                RNLog.m30233w(reactContext, str2);
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void symbolicateStackTrace(Iterable<StackFrame> iterable, final SymbolicationListener symbolicationListener) {
        try {
            String createSymbolicateURL = createSymbolicateURL(this.mSettings.getPackagerConnectionSettings().getDebugServerHost());
            JSONArray jSONArray = new JSONArray();
            for (StackFrame stackFrame : iterable) {
                jSONArray.put(stackFrame.toJSON());
            }
            ((Call) C5743a.m24583c(this.mClient.mo8811b(new Request.Builder().m8722l(createSymbolicateURL).m8726h(RequestBody.create(MediaType.m8839f("application/json"), new JSONObject().put("stack", jSONArray).toString())).m8732b()))).mo1994i(new InterfaceC12283d() { // from class: com.facebook.react.devsupport.DevServerHelper.6
                @Override // p328rj.InterfaceC12283d
                public void onFailure(Call call, IOException iOException) {
                    C13677a.m1870H(ReactConstants.TAG, "Got IOException when attempting symbolicate stack trace: " + iOException.getMessage());
                    symbolicationListener.onSymbolicationComplete(null);
                }

                @Override // p328rj.InterfaceC12283d
                public void onResponse(Call call, Response response) {
                    try {
                        symbolicationListener.onSymbolicationComplete(Arrays.asList(StackTraceHelper.convertJsStackTrace(new JSONObject(response.m8699a().string()).getJSONArray("stack"))));
                    } catch (JSONException unused) {
                        symbolicationListener.onSymbolicationComplete(null);
                    }
                }
            });
        } catch (JSONException e) {
            C13677a.m1870H(ReactConstants.TAG, "Got JSONException when attempting symbolicate stack trace: " + e.getMessage());
        }
    }

    private String createBundleURL(String str, BundleType bundleType, String str2, boolean z, boolean z2) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        objArr[0] = str2;
        objArr[1] = str;
        objArr[2] = bundleType.typeID();
        objArr[3] = Boolean.valueOf(getDevMode());
        objArr[4] = Boolean.valueOf(getJSMinifyMode());
        objArr[5] = this.mPackageName;
        objArr[6] = z ? "true" : "false";
        objArr[7] = z2 ? "true" : "false";
        objArr[8] = "";
        return String.format(locale, "http://%s/%s.%s?platform=android&dev=%s&minify=%s&app=%s&modulesOnly=%s&runModule=%s%s", objArr);
    }

    public void downloadBundleFromURL(DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleDownloader.BundleInfo bundleInfo, Request.Builder builder) {
        this.mBundleDownloader.downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo, builder);
    }

    private String createBundleURL(String str, BundleType bundleType) {
        return createBundleURL(str, bundleType, this.mSettings.getPackagerConnectionSettings().getDebugServerHost());
    }
}
