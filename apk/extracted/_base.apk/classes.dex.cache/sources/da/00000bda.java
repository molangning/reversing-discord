package com.airbnb.android.react.lottie;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.C1365w0;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9654p;
import p073e1.C6053j;
import p073e1.EnumC6090w0;

@Metadata(m14358d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bD\u0010BJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000fH\u0007J \u0010\u0015\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0007J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J\u001a\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J\u001a\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J\u001a\u0010\"\u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J\u0018\u0010$\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0007H\u0007J\u001a\u0010&\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J\u001a\u0010(\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J\u0018\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J\u0018\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J\u0018\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J\u0018\u00102\u001a\u00020\t2\u0006\u00101\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J\u0018\u00104\u001a\u00020\t2\u0006\u00103\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J\u0018\u00106\u001a\u00020\t2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J\u001a\u00108\u001a\u00020\t2\b\u00107\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J\u001a\u0010;\u001a\u00020\t2\b\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J\u001a\u0010=\u001a\u00020\t2\b\u0010<\u001a\u0004\u0018\u0001092\u0006\u0010\u001b\u001a\u00020\u001aH\u0007R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010>8FX\u0087\u0004¢\u0006\f\u0012\u0004\bA\u0010B\u001a\u0004\b?\u0010@¨\u0006E"}, m14357d2 = {"Lcom/airbnb/android/react/lottie/g;", "", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "Le1/j;", "e", "view", "", "isCancelled", "", "r", "", "error", "p", "q", "", "", "f", "", "startFrame", "endFrame", "j", "l", "h", "n", ZeroconfModule.KEY_SERVICE_NAME, "Lcom/airbnb/android/react/lottie/h;", "viewManager", "E", "json", "D", "urlString", "F", "uri", "C", "cacheComposition", "t", ViewProps.RESIZE_MODE, "B", "renderMode", "A", "hardwareAccelerationAndroid", "w", "", "progress", "z", "", "speed", "G", "loop", "y", "autoPlay", "s", "enableMergePaths", "v", "imageAssetsFolder", "x", "Lcom/facebook/react/bridge/ReadableArray;", "colorFilters", "u", "textFilters", "H", "", "g", "()Ljava/util/Map;", "getExportedViewConstants$annotations", "()V", "exportedViewConstants", "<init>", "lottie-react-native_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.airbnb.android.react.lottie.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C2704g {

    /* renamed from: a */
    public static final C2704g f7218a = new C2704g();

    @Metadata(m14358d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m14357d2 = {"com/airbnb/android/react/lottie/g$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "lottie-react-native_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.airbnb.android.react.lottie.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class View$OnAttachStateChangeListenerC2705a implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC2705a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            C9612q.m13917h(v, "v");
            C6053j c6053j = (C6053j) v;
            c6053j.setProgress(0.0f);
            c6053j.playAnimation();
            c6053j.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            C9612q.m13917h(v, "v");
            ((C6053j) v).removeOnAttachStateChangeListener(this);
        }
    }

    private C2704g() {
    }

    /* renamed from: A */
    public static final void m32699A(String str, C2706h viewManager) {
        EnumC6090w0 enumC6090w0;
        C9612q.m13917h(viewManager, "viewManager");
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 165298699) {
                if (hashCode != 899536360) {
                    if (hashCode == 2101957031 && str.equals("SOFTWARE")) {
                        enumC6090w0 = EnumC6090w0.SOFTWARE;
                    }
                } else if (str.equals("HARDWARE")) {
                    enumC6090w0 = EnumC6090w0.HARDWARE;
                }
            } else if (str.equals("AUTOMATIC")) {
                enumC6090w0 = EnumC6090w0.AUTOMATIC;
            }
            viewManager.m32653m(enumC6090w0);
        }
        enumC6090w0 = null;
        viewManager.m32653m(enumC6090w0);
    }

    /* renamed from: B */
    public static final void m32698B(String str, C2706h viewManager) {
        ImageView.ScaleType scaleType;
        C9612q.m13917h(viewManager, "viewManager");
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1364013995) {
                if (hashCode != 94852023) {
                    if (hashCode == 951526612 && str.equals("contain")) {
                        scaleType = ImageView.ScaleType.FIT_CENTER;
                    }
                } else if (str.equals("cover")) {
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
            } else if (str.equals("center")) {
                scaleType = ImageView.ScaleType.CENTER_INSIDE;
            }
            viewManager.m32652n(scaleType);
        }
        scaleType = null;
        viewManager.m32652n(scaleType);
    }

    /* renamed from: C */
    public static final void m32697C(String str, C2706h viewManager) {
        C9612q.m13917h(viewManager, "viewManager");
        viewManager.m32651o(str);
        viewManager.m32665a();
    }

    /* renamed from: D */
    public static final void m32696D(String str, C2706h viewManager) {
        C9612q.m13917h(viewManager, "viewManager");
        viewManager.m32663c(str);
        viewManager.m32665a();
    }

    /* renamed from: E */
    public static final void m32695E(String str, C2706h viewManager) {
        boolean m13731M;
        C9612q.m13917h(viewManager, "viewManager");
        boolean z = false;
        if (str != null) {
            m13731M = C9654p.m13731M(str, ".", false, 2, null);
            if (!m13731M) {
                z = true;
            }
        }
        if (z) {
            str = str + ".json";
        }
        viewManager.m32662d(str);
        viewManager.m32665a();
    }

    /* renamed from: F */
    public static final void m32694F(String str, C2706h viewManager) {
        C9612q.m13917h(viewManager, "viewManager");
        viewManager.m32661e(str);
        viewManager.m32665a();
    }

    /* renamed from: G */
    public static final void m32693G(double d, C2706h viewManager) {
        C9612q.m13917h(viewManager, "viewManager");
        viewManager.m32650p(Float.valueOf((float) d));
    }

    /* renamed from: H */
    public static final void m32692H(ReadableArray readableArray, C2706h viewManager) {
        C9612q.m13917h(viewManager, "viewManager");
        viewManager.m32649q(readableArray);
    }

    /* renamed from: e */
    public static final C6053j m32687e(ThemedReactContext context) {
        C9612q.m13917h(context, "context");
        C6053j c6053j = new C6053j(context);
        c6053j.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        return c6053j;
    }

    /* renamed from: f */
    public static final Map<String, Object> m32686f() {
        Map<String, Object> m30468of = MapBuilder.m30468of("topAnimationFinish", MapBuilder.m30470of("registrationName", "onAnimationFinish"), "topAnimationFailureEvent", MapBuilder.m30470of("registrationName", "onAnimationFailure"), "topAnimationLoadedEvent", MapBuilder.m30470of("registrationName", "onAnimationLoaded"));
        C9612q.m13918g(m30468of, "of(\n            OnAnimat…mationLoaded\"),\n        )");
        return m30468of;
    }

    /* renamed from: g */
    public static final Map<String, Object> m32685g() {
        Map<String, Object> build = MapBuilder.builder().put("VERSION", 1).build();
        C9612q.m13918g(build, "builder<String, Any>()\n …, 1)\n            .build()");
        return build;
    }

    /* renamed from: h */
    public static final void m32684h(final C6053j view) {
        C9612q.m13917h(view, "view");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.airbnb.android.react.lottie.d
            @Override // java.lang.Runnable
            public final void run() {
                C2704g.m32683i(C6053j.this);
            }
        });
    }

    /* renamed from: i */
    public static final void m32683i(C6053j view) {
        C9612q.m13917h(view, "$view");
        if (C1365w0.m37225T(view)) {
            view.pauseAnimation();
        }
    }

    /* renamed from: j */
    public static final void m32682j(final C6053j view, final int i, final int i2) {
        C9612q.m13917h(view, "view");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.airbnb.android.react.lottie.c
            @Override // java.lang.Runnable
            public final void run() {
                C2704g.m32681k(i, i2, view);
            }
        });
    }

    /* renamed from: k */
    public static final void m32681k(int i, int i2, C6053j view) {
        C9612q.m13917h(view, "$view");
        if (i != -1 && i2 != -1) {
            if (i > i2) {
                view.m23819C(i2, i);
                if (view.getSpeed() > 0.0f) {
                    view.m23796x();
                }
            } else {
                view.m23819C(i, i2);
                if (view.getSpeed() < 0.0f) {
                    view.m23796x();
                }
            }
        }
        if (C1365w0.m37225T(view)) {
            view.setProgress(0.0f);
            view.playAnimation();
            return;
        }
        view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2705a());
    }

    /* renamed from: l */
    public static final void m32680l(final C6053j view) {
        C9612q.m13917h(view, "view");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.airbnb.android.react.lottie.e
            @Override // java.lang.Runnable
            public final void run() {
                C2704g.m32679m(C6053j.this);
            }
        });
    }

    /* renamed from: m */
    public static final void m32679m(C6053j view) {
        C9612q.m13917h(view, "$view");
        if (C1365w0.m37225T(view)) {
            view.m23808l();
            view.setProgress(0.0f);
        }
    }

    /* renamed from: n */
    public static final void m32678n(final C6053j view) {
        C9612q.m13917h(view, "view");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.airbnb.android.react.lottie.f
            @Override // java.lang.Runnable
            public final void run() {
                C2704g.m32677o(C6053j.this);
            }
        });
    }

    /* renamed from: o */
    public static final void m32677o(C6053j view) {
        C9612q.m13917h(view, "$view");
        if (C1365w0.m37225T(view)) {
            view.m23797w();
        }
    }

    /* renamed from: p */
    public static final void m32676p(C6053j view, Throwable error) {
        C9612q.m13917h(view, "view");
        C9612q.m13917h(error, "error");
        Context context = view.getContext();
        C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new C2708j(themedReactContext.getSurfaceId(), view.getId(), error));
        }
    }

    /* renamed from: q */
    public static final void m32675q(C6053j view) {
        C9612q.m13917h(view, "view");
        Context context = view.getContext();
        C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new C2712l(themedReactContext.getSurfaceId(), view.getId()));
        }
    }

    /* renamed from: r */
    public static final void m32674r(C6053j view, boolean z) {
        C9612q.m13917h(view, "view");
        Context context = view.getContext();
        C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new C2710k(themedReactContext.getSurfaceId(), view.getId(), z));
        }
    }

    /* renamed from: s */
    public static final void m32673s(boolean z, C2706h viewManager) {
        C9612q.m13917h(viewManager, "viewManager");
        viewManager.m32660f(Boolean.valueOf(z));
    }

    /* renamed from: t */
    public static final void m32672t(C6053j view, boolean z) {
        C9612q.m13917h(view, "view");
        view.setCacheComposition(z);
    }

    /* renamed from: u */
    public static final void m32671u(ReadableArray readableArray, C2706h viewManager) {
        C9612q.m13917h(viewManager, "viewManager");
        viewManager.m32659g(readableArray);
    }

    /* renamed from: v */
    public static final void m32670v(boolean z, C2706h viewManager) {
        C9612q.m13917h(viewManager, "viewManager");
        viewManager.m32658h(Boolean.valueOf(z));
    }

    /* renamed from: w */
    public static final void m32669w(boolean z, C2706h viewManager) {
        C9612q.m13917h(viewManager, "viewManager");
        int i = 1;
        if (z) {
            i = 2;
        }
        viewManager.m32656j(i);
    }

    /* renamed from: x */
    public static final void m32668x(String str, C2706h viewManager) {
        C9612q.m13917h(viewManager, "viewManager");
        viewManager.m32657i(str);
    }

    /* renamed from: y */
    public static final void m32667y(boolean z, C2706h viewManager) {
        C9612q.m13917h(viewManager, "viewManager");
        viewManager.m32655k(Boolean.valueOf(z));
    }

    /* renamed from: z */
    public static final void m32666z(float f, C2706h viewManager) {
        C9612q.m13917h(viewManager, "viewManager");
        viewManager.m32654l(Float.valueOf(f));
    }
}