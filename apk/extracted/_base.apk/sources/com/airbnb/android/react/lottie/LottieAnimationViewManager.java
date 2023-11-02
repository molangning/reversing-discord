package com.airbnb.android.react.lottie;

import android.animation.Animator;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p073e1.C6053j;
import p073e1.C6062k;
import p073e1.InterfaceC6065l0;
import p073e1.InterfaceC6069n0;

@Metadata(m14358d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b=\u0010>J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0016\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000eH\u0016J\"\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\u001d\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0007J\u001a\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010!\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0007H\u0007J!\u0010#\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b#\u0010$J\u0018\u0010'\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0007J\u0018\u0010*\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0007J\u0018\u0010,\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u001bH\u0007J\u0018\u0010.\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u001bH\u0007J\u001a\u00100\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u00102\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u001bH\u0007J\u001a\u00104\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0011H\u0007J\u001a\u00106\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u00010\u0011H\u0007J\u001a\u00108\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u00109\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006?"}, m14357d2 = {"Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Le1/j;", "view", "Lcom/airbnb/android/react/lottie/h;", "getOrCreatePropertyManager", "", "", "", "getExportedViewConstants", "getName", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "", "getExportedCustomDirectEventTypeConstants", "commandName", "Lcom/facebook/react/bridge/ReadableArray;", "args", "", "receiveCommand", ZeroconfModule.KEY_SERVICE_NAME, "setSourceName", "json", "setSourceJson", "urlString", "setSourceURL", "", "cacheComposition", "setCacheComposition", ViewProps.RESIZE_MODE, "setResizeMode", "renderMode", "setRenderMode", "hardwareAccelerationAndroid", "setHardwareAccelerationAndroid", "(Le1/j;Ljava/lang/Boolean;)V", "", "progress", "setProgress", "", "speed", "setSpeed", "loop", "setLoop", "autoPlay", "setAutoPlay", "imageAssetsFolder", "setImageAssetsFolder", "enableMergePaths", "setEnableMergePaths", "colorFilters", "setColorFilters", "textFilters", "setTextFilters", "uri", "setSourceDotLottie", "onAfterUpdateTransaction", "Ljava/util/WeakHashMap;", "propManagersMap", "Ljava/util/WeakHashMap;", "<init>", "()V", "lottie-react-native_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class LottieAnimationViewManager extends SimpleViewManager<C6053j> {
    private final WeakHashMap<C6053j, C2706h> propManagersMap = new WeakHashMap<>();

    @Metadata(m14358d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, m14357d2 = {"com/airbnb/android/react/lottie/LottieAnimationViewManager$a", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "lottie-react-native_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.airbnb.android.react.lottie.LottieAnimationViewManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C2697a implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C6053j f7209a;

        C2697a(C6053j c6053j) {
            this.f7209a = c6053j;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            C9612q.m13917h(animation, "animation");
            C2704g.m32674r(this.f7209a, true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            C9612q.m13917h(animation, "animation");
            C2704g.m32674r(this.f7209a, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            C9612q.m13917h(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            C9612q.m13917h(animation, "animation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$0(C6053j view, Throwable it) {
        C9612q.m13917h(view, "$view");
        C9612q.m13918g(it, "it");
        C2704g.m32676p(view, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$1(C6053j view, C6062k c6062k) {
        C9612q.m13917h(view, "$view");
        C2704g.m32675q(view);
    }

    private final C2706h getOrCreatePropertyManager(C6053j c6053j) {
        C2706h c2706h = this.propManagersMap.get(c6053j);
        if (c2706h == null) {
            C2706h c2706h2 = new C2706h(c6053j);
            this.propManagersMap.put(c6053j, c2706h2);
            return c2706h2;
        }
        return c2706h;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return C2704g.m32686f();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return C2704g.m32685g();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "LottieAnimationView";
    }

    @ReactProp(name = "autoPlay")
    public final void setAutoPlay(C6053j view, boolean z) {
        C9612q.m13917h(view, "view");
        C2704g.m32673s(z, getOrCreatePropertyManager(view));
    }

    @ReactProp(name = "cacheComposition")
    public final void setCacheComposition(C6053j c6053j, boolean z) {
        C9612q.m13920e(c6053j);
        C2704g.m32672t(c6053j, z);
    }

    @ReactProp(name = "colorFilters")
    public final void setColorFilters(C6053j view, ReadableArray readableArray) {
        C9612q.m13917h(view, "view");
        C2704g.m32671u(readableArray, getOrCreatePropertyManager(view));
    }

    @ReactProp(name = "enableMergePathsAndroidForKitKatAndAbove")
    public final void setEnableMergePaths(C6053j view, boolean z) {
        C9612q.m13917h(view, "view");
        C2704g.m32670v(z, getOrCreatePropertyManager(view));
    }

    @ReactProp(name = "hardwareAccelerationAndroid")
    public final void setHardwareAccelerationAndroid(C6053j view, Boolean bool) {
        C9612q.m13917h(view, "view");
        C9612q.m13920e(bool);
        C2704g.m32669w(bool.booleanValue(), getOrCreatePropertyManager(view));
    }

    @ReactProp(name = "imageAssetsFolder")
    public final void setImageAssetsFolder(C6053j view, String str) {
        C9612q.m13917h(view, "view");
        C2704g.m32668x(str, getOrCreatePropertyManager(view));
    }

    @ReactProp(name = "loop")
    public final void setLoop(C6053j view, boolean z) {
        C9612q.m13917h(view, "view");
        C2704g.m32667y(z, getOrCreatePropertyManager(view));
    }

    @ReactProp(name = "progress")
    public final void setProgress(C6053j view, float f) {
        C9612q.m13917h(view, "view");
        C2704g.m32666z(f, getOrCreatePropertyManager(view));
    }

    @ReactProp(name = "renderMode")
    public final void setRenderMode(C6053j view, String str) {
        C9612q.m13917h(view, "view");
        C2704g.m32699A(str, getOrCreatePropertyManager(view));
    }

    @ReactProp(name = ViewProps.RESIZE_MODE)
    public final void setResizeMode(C6053j view, String str) {
        C9612q.m13917h(view, "view");
        C2704g.m32698B(str, getOrCreatePropertyManager(view));
    }

    @ReactProp(name = "sourceDotLottieURI")
    public final void setSourceDotLottie(C6053j view, String str) {
        C9612q.m13917h(view, "view");
        C2704g.m32697C(str, getOrCreatePropertyManager(view));
    }

    @ReactProp(name = "sourceJson")
    public final void setSourceJson(C6053j view, String str) {
        C9612q.m13917h(view, "view");
        C2704g.m32696D(str, getOrCreatePropertyManager(view));
    }

    @ReactProp(name = "sourceName")
    public final void setSourceName(C6053j view, String str) {
        C9612q.m13917h(view, "view");
        C2704g.m32695E(str, getOrCreatePropertyManager(view));
    }

    @ReactProp(name = "sourceURL")
    public final void setSourceURL(C6053j view, String str) {
        C9612q.m13917h(view, "view");
        C2704g.m32694F(str, getOrCreatePropertyManager(view));
    }

    @ReactProp(name = "speed")
    public final void setSpeed(C6053j view, double d) {
        C9612q.m13917h(view, "view");
        C2704g.m32693G(d, getOrCreatePropertyManager(view));
    }

    @ReactProp(name = "textFiltersAndroid")
    public final void setTextFilters(C6053j view, ReadableArray readableArray) {
        C9612q.m13917h(view, "view");
        C2704g.m32692H(readableArray, getOrCreatePropertyManager(view));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C6053j createViewInstance(ThemedReactContext context) {
        C9612q.m13917h(context, "context");
        final C6053j m32687e = C2704g.m32687e(context);
        m32687e.setFailureListener(new InterfaceC6065l0() { // from class: com.airbnb.android.react.lottie.a
            @Override // p073e1.InterfaceC6065l0
            public final void onResult(Object obj) {
                LottieAnimationViewManager.createViewInstance$lambda$0(C6053j.this, (Throwable) obj);
            }
        });
        m32687e.m23810j(new InterfaceC6069n0() { // from class: com.airbnb.android.react.lottie.b
            @Override // p073e1.InterfaceC6069n0
            /* renamed from: a */
            public final void mo23648a(C6062k c6062k) {
                LottieAnimationViewManager.createViewInstance$lambda$1(C6053j.this, c6062k);
            }
        });
        m32687e.m23811i(new C2697a(m32687e));
        return m32687e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C6053j view) {
        C9612q.m13917h(view, "view");
        super.onAfterUpdateTransaction((LottieAnimationViewManager) view);
        getOrCreatePropertyManager(view).m32665a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C6053j view, String commandName, ReadableArray readableArray) {
        C9612q.m13917h(view, "view");
        C9612q.m13917h(commandName, "commandName");
        switch (commandName.hashCode()) {
            case -934426579:
                if (commandName.equals("resume")) {
                    C2704g.m32678n(view);
                    return;
                }
                return;
            case 3443508:
                if (commandName.equals("play")) {
                    C2704g.m32682j(view, readableArray != null ? readableArray.getInt(0) : -1, readableArray != null ? readableArray.getInt(1) : -1);
                    return;
                }
                return;
            case 106440182:
                if (commandName.equals("pause")) {
                    C2704g.m32684h(view);
                    return;
                }
                return;
            case 108404047:
                if (commandName.equals("reset")) {
                    C2704g.m32680l(view);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
