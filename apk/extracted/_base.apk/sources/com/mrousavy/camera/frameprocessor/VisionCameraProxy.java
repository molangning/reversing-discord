package com.mrousavy.camera.frameprocessor;

import android.util.Log;
import android.view.View;
import androidx.annotation.Keep;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.UIManagerHelper;
import com.mrousavy.camera.C5300d0;
import com.mrousavy.camera.C5313j;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p077e5.InterfaceC6107a;

@Metadata(m14358d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00052\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010#\u001a\u00020\u001c¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J!\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082 J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0015H\u0007R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&"}, m14357d2 = {"Lcom/mrousavy/camera/frameprocessor/VisionCameraProxy;", "", "", "viewId", "Lcom/mrousavy/camera/j;", "c", "", "jsContext", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "jsCallInvokerHolder", "Lcom/mrousavy/camera/frameprocessor/VisionCameraScheduler;", "scheduler", "Lcom/facebook/jni/HybridData;", "initHybrid", "Lcom/mrousavy/camera/frameprocessor/FrameProcessor;", "frameProcessor", "", "setFrameProcessor", "removeFrameProcessor", "", ZeroconfModule.KEY_SERVICE_NAME, "", "options", "Lcom/mrousavy/camera/frameprocessor/FrameProcessorPlugin;", "getFrameProcessorPlugin", "mHybridData", "Lcom/facebook/jni/HybridData;", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "a", "Ljava/lang/ref/WeakReference;", "mContext", "b", "Lcom/mrousavy/camera/frameprocessor/VisionCameraScheduler;", "mScheduler", "context", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class VisionCameraProxy {

    /* renamed from: c */
    public static final C5304a f15077c = new C5304a(null);

    /* renamed from: a */
    private WeakReference<ReactApplicationContext> f15078a;

    /* renamed from: b */
    private VisionCameraScheduler f15079b;
    @InterfaceC6107a
    @Keep
    private HybridData mHybridData;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lcom/mrousavy/camera/frameprocessor/VisionCameraProxy$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.mrousavy.camera.frameprocessor.VisionCameraProxy$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5304a {
        private C5304a() {
        }

        public /* synthetic */ C5304a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        try {
            System.loadLibrary("VisionCamera");
        } catch (UnsatisfiedLinkError e) {
            Log.e("VisionCameraProxy", "Failed to load VisionCamera C++ library!", e);
            throw e;
        }
    }

    public VisionCameraProxy(ReactApplicationContext context) {
        C9612q.m13917h(context, "context");
        CallInvokerHolder jSCallInvokerHolder = context.getCatalystInstance().getJSCallInvokerHolder();
        C9612q.m13919f(jSCallInvokerHolder, "null cannot be cast to non-null type com.facebook.react.turbomodule.core.CallInvokerHolderImpl");
        long j = context.getJavaScriptContextHolder().get();
        this.f15079b = new VisionCameraScheduler();
        this.f15078a = new WeakReference<>(context);
        this.mHybridData = initHybrid(j, (CallInvokerHolderImpl) jSCallInvokerHolder, this.f15079b);
    }

    /* renamed from: c */
    private final C5313j m25520c(int i) {
        StringBuilder sb2;
        String str;
        Log.d("VisionCameraProxy", "Finding view " + i + "...");
        ReactApplicationContext reactApplicationContext = this.f15078a.get();
        C5313j c5313j = null;
        View view = null;
        if (reactApplicationContext != null) {
            UIManager uIManager = UIManagerHelper.getUIManager(reactApplicationContext, i);
            if (uIManager != null) {
                view = uIManager.resolveView(i);
            }
            c5313j = (C5313j) view;
        }
        if (c5313j != null) {
            sb2 = new StringBuilder();
            str = "Found view ";
        } else {
            sb2 = new StringBuilder();
            str = "Couldn't find view ";
        }
        sb2.append(str);
        sb2.append(i);
        sb2.append('!');
        Log.d("VisionCameraProxy", sb2.toString());
        if (c5313j != null) {
            return c5313j;
        }
        throw new C5300d0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m25519d(VisionCameraProxy this$0, int i) {
        C9612q.m13917h(this$0, "this$0");
        this$0.m25520c(i).setFrameProcessor$react_native_vision_camera_release(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m25518e(VisionCameraProxy this$0, int i, FrameProcessor frameProcessor) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(frameProcessor, "$frameProcessor");
        this$0.m25520c(i).setFrameProcessor$react_native_vision_camera_release(frameProcessor);
    }

    private final native HybridData initHybrid(long j, CallInvokerHolderImpl callInvokerHolderImpl, VisionCameraScheduler visionCameraScheduler);

    @InterfaceC6107a
    @Keep
    public final FrameProcessorPlugin getFrameProcessorPlugin(String name, Map<String, ? extends Object> options) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(options, "options");
        FrameProcessorPlugin plugin = FrameProcessorPluginRegistry.getPlugin(name, options);
        C9612q.m13918g(plugin, "getPlugin(name, options)");
        return plugin;
    }

    @InterfaceC6107a
    @Keep
    public final void removeFrameProcessor(final int i) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.mrousavy.camera.frameprocessor.b
            @Override // java.lang.Runnable
            public final void run() {
                VisionCameraProxy.m25519d(VisionCameraProxy.this, i);
            }
        });
    }

    @InterfaceC6107a
    @Keep
    public final void setFrameProcessor(final int i, final FrameProcessor frameProcessor) {
        C9612q.m13917h(frameProcessor, "frameProcessor");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.mrousavy.camera.frameprocessor.a
            @Override // java.lang.Runnable
            public final void run() {
                VisionCameraProxy.m25518e(VisionCameraProxy.this, i, frameProcessor);
            }
        });
    }
}
