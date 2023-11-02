package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.RootView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.C11504d;
import pe.C11510g;

@Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00072\u00020\u0001:\u0002\u0010\u0014B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010#\u001a\u00020\u001a¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0016\u0010 \u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006&"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;", "", "", "i", "h", "", "disallowIntercept", "g", "Landroid/view/MotionEvent;", "ev", "c", "", "viewTag", "blockNativeResponder", "e", "Lcom/facebook/react/bridge/ReactContext;", "a", "Lcom/facebook/react/bridge/ReactContext;", "context", "Lpe/g;", "b", "Lpe/g;", "orchestrator", "Lpe/d;", "Lpe/d;", "jsGestureHandler", "Landroid/view/ViewGroup;", "d", "Landroid/view/ViewGroup;", "()Landroid/view/ViewGroup;", "rootView", "Z", "shouldIntercept", "f", "passingTouch", "wrappedView", "<init>", "(Lcom/facebook/react/bridge/ReactContext;Landroid/view/ViewGroup;)V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class RNGestureHandlerRootHelper {

    /* renamed from: g */
    public static final C5548a f15556g = new C5548a(null);

    /* renamed from: a */
    private final ReactContext f15557a;

    /* renamed from: b */
    private final C11510g f15558b;

    /* renamed from: c */
    private final C11504d<?> f15559c;

    /* renamed from: d */
    private final ViewGroup f15560d;

    /* renamed from: e */
    private boolean f15561e;

    /* renamed from: f */
    private boolean f15562f;

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper$a;", "", "Landroid/view/ViewGroup;", "viewGroup", "b", "", "MIN_ALPHA_FOR_TOUCH", "F", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerRootHelper$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5548a {
        private C5548a() {
        }

        public /* synthetic */ C5548a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final ViewGroup m25037b(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            ViewParent viewParent = viewGroup;
            while (viewParent != null && !(viewParent instanceof RootView)) {
                viewParent = viewParent.getParent();
            }
            if (viewParent != null) {
                return (ViewGroup) viewParent;
            }
            throw new IllegalStateException(("View " + viewGroup + " has not been mounted under ReactRootView").toString());
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0000R\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0014¨\u0006\u000b"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper$b;", "Lpe/d;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;", "Landroid/view/MotionEvent;", "event", "sourceEvent", "", "e0", "d0", "<init>", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;)V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerRootHelper$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class C5549b extends C11504d<C5549b> {
        public C5549b() {
        }

        @Override // pe.C11504d
        /* renamed from: d0 */
        protected void mo7715d0() {
            RNGestureHandlerRootHelper.this.f15561e = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setAction(3);
            if (RNGestureHandlerRootHelper.this.m25044d() instanceof RootView) {
                ((RootView) RNGestureHandlerRootHelper.this.m25044d()).onChildStartedNativeGesture(obtain);
            }
        }

        @Override // pe.C11504d
        /* renamed from: e0 */
        protected void mo7714e0(MotionEvent event, MotionEvent sourceEvent) {
            C9612q.m13917h(event, "event");
            C9612q.m13917h(sourceEvent, "sourceEvent");
            if (m7943O() == 0) {
                m7913n();
                RNGestureHandlerRootHelper.this.f15561e = false;
            }
            if (event.getActionMasked() == 1) {
                m7891z();
            }
        }
    }

    public RNGestureHandlerRootHelper(ReactContext context, ViewGroup wrappedView) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(wrappedView, "wrappedView");
        this.f15557a = context;
        UiThreadUtil.assertOnUiThread();
        int id2 = wrappedView.getId();
        if (id2 >= 1) {
            NativeModule nativeModule = context.getNativeModule(RNGestureHandlerModule.class);
            C9612q.m13920e(nativeModule);
            RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
            C5559h registry = rNGestureHandlerModule.getRegistry();
            ViewGroup m25037b = f15556g.m25037b(wrappedView);
            this.f15560d = m25037b;
            Log.i(ReactConstants.TAG, "[GESTURE HANDLER] Initialize gesture handler for root view " + m25037b);
            C11510g c11510g = new C11510g(wrappedView, registry, new C5565l());
            c11510g.m7843z(0.1f);
            this.f15558b = c11510g;
            C5549b c5549b = new C5549b();
            c5549b.m7964A0(-id2);
            this.f15559c = c5549b;
            registry.m25013j(c5549b);
            registry.m25020c(c5549b.m7942P(), id2, 3);
            rNGestureHandlerModule.registerRootHelper(this);
            return;
        }
        throw new IllegalStateException(("Expect view tag to be set for " + wrappedView).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m25042f(RNGestureHandlerRootHelper this$0) {
        C9612q.m13917h(this$0, "this$0");
        this$0.m25039i();
    }

    /* renamed from: i */
    private final void m25039i() {
        C11504d<?> c11504d = this.f15559c;
        if (c11504d != null && c11504d.m7943O() == 2) {
            c11504d.m7920i();
            c11504d.m7891z();
        }
    }

    /* renamed from: c */
    public final boolean m25045c(MotionEvent ev) {
        C9612q.m13917h(ev, "ev");
        this.f15562f = true;
        C11510g c11510g = this.f15558b;
        C9612q.m13920e(c11510g);
        c11510g.m7847v(ev);
        this.f15562f = false;
        return this.f15561e;
    }

    /* renamed from: d */
    public final ViewGroup m25044d() {
        return this.f15560d;
    }

    /* renamed from: e */
    public final void m25043e(int i, boolean z) {
        if (z) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.i
                @Override // java.lang.Runnable
                public final void run() {
                    RNGestureHandlerRootHelper.m25042f(RNGestureHandlerRootHelper.this);
                }
            });
        }
    }

    /* renamed from: g */
    public final void m25041g(boolean z) {
        if (this.f15558b != null && !this.f15562f) {
            m25039i();
        }
    }

    /* renamed from: h */
    public final void m25040h() {
        Log.i(ReactConstants.TAG, "[GESTURE HANDLER] Tearing down gesture handler registered for root view " + this.f15560d);
        NativeModule nativeModule = this.f15557a.getNativeModule(RNGestureHandlerModule.class);
        C9612q.m13920e(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        C5559h registry = rNGestureHandlerModule.getRegistry();
        C11504d<?> c11504d = this.f15559c;
        C9612q.m13920e(c11504d);
        registry.m25016g(c11504d.m7942P());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }
}
