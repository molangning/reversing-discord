package com.swmansion.rnscreens;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.core.graphics.Insets;
import androidx.core.view.C1326r2;
import androidx.core.view.C1365w0;
import androidx.core.view.InterfaceC1324r0;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewProps;
import com.swmansion.rnscreens.C5623j;
import com.swmansion.rnscreens.C5656x;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b)\u0010\u0010J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0010J!\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ+\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ!\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u001d\u0010\u0016J!\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u001e\u0010\u0016J!\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u001f\u0010\u0016J+\u0010 \u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b \u0010\u001aR\u0016\u0010#\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010&\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0018\u0010(\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010'¨\u0006*"}, m14357d2 = {"Lcom/swmansion/rnscreens/x;", "", "Lcom/swmansion/rnscreens/j;", "screen", "Lcom/swmansion/rnscreens/j$e;", "trait", "j", "i", "h", "", "g", "", ViewProps.COLOR, "k", "", "e", "()V", "f", "d", "Landroid/app/Activity;", "activity", "r", "(Lcom/swmansion/rnscreens/j;Landroid/app/Activity;)V", "Lcom/facebook/react/bridge/ReactContext;", "context", "l", "(Lcom/swmansion/rnscreens/j;Landroid/app/Activity;Lcom/facebook/react/bridge/ReactContext;)V", "t", "u", "n", "p", "q", "v", "b", "Z", "mDidSetOrientation", "c", "mDidSetStatusBarAppearance", "mDidSetNavigationBarAppearance", "Ljava/lang/Integer;", "mDefaultStatusBarColor", "<init>", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5656x {

    /* renamed from: a */
    public static final C5656x f15810a = new C5656x();

    /* renamed from: b */
    private static boolean f15811b;

    /* renamed from: c */
    private static boolean f15812c;

    /* renamed from: d */
    private static boolean f15813d;

    /* renamed from: e */
    private static Integer f15814e;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.swmansion.rnscreens.x$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C5657a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15815a;

        static {
            int[] iArr = new int[C5623j.EnumC5628e.values().length];
            try {
                iArr[C5623j.EnumC5628e.ORIENTATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C5623j.EnumC5628e.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C5623j.EnumC5628e.STYLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C5623j.EnumC5628e.TRANSLUCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C5623j.EnumC5628e.HIDDEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C5623j.EnumC5628e.ANIMATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C5623j.EnumC5628e.NAVIGATION_BAR_COLOR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C5623j.EnumC5628e.NAVIGATION_BAR_HIDDEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f15815a = iArr;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m14357d2 = {"com/swmansion/rnscreens/x$b", "Lcom/facebook/react/bridge/GuardedRunnable;", "", "runGuarded", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.x$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5658b extends GuardedRunnable {

        /* renamed from: j */
        final /* synthetic */ Activity f15816j;

        /* renamed from: k */
        final /* synthetic */ Integer f15817k;

        /* renamed from: l */
        final /* synthetic */ boolean f15818l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5658b(ReactContext reactContext, Activity activity, Integer num, boolean z) {
            super(reactContext);
            this.f15816j = activity;
            this.f15817k = num;
            this.f15818l = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m24797b(Window window, ValueAnimator animator) {
            C9612q.m13917h(animator, "animator");
            Object animatedValue = animator.getAnimatedValue();
            C9612q.m13919f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            window.setStatusBarColor(((Integer) animatedValue).intValue());
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            final Window window = this.f15816j.getWindow();
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), this.f15817k);
            ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.y
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C5656x.C5658b.m24797b(window, valueAnimator);
                }
            });
            if (this.f15818l) {
                ofObject.setDuration(300L).setStartDelay(0L);
            } else {
                ofObject.setDuration(0L).setStartDelay(300L);
            }
            ofObject.start();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\u0004"}, m14357d2 = {"com/swmansion/rnscreens/x$c", "Lcom/facebook/react/bridge/GuardedRunnable;", "", "runGuarded", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.x$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5659c extends GuardedRunnable {

        /* renamed from: j */
        final /* synthetic */ Activity f15819j;

        /* renamed from: k */
        final /* synthetic */ boolean f15820k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5659c(ReactContext reactContext, Activity activity, boolean z) {
            super(reactContext);
            this.f15819j = activity;
            this.f15820k = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final WindowInsetsCompat m24795b(View view, WindowInsetsCompat windowInsetsCompat) {
            WindowInsetsCompat m37213c0 = C1365w0.m37213c0(view, windowInsetsCompat);
            C9612q.m13918g(m37213c0, "onApplyWindowInsets(v, insets)");
            if (Build.VERSION.SDK_INT >= 30) {
                Insets m37741f = m37213c0.m37741f(WindowInsetsCompat.C1163m.m37676f());
                C9612q.m13918g(m37741f, "defaultInsets.getInsets(…Compat.Type.statusBars())");
                return new WindowInsetsCompat.C1152b().m37718b(WindowInsetsCompat.C1163m.m37676f(), Insets.m38192b(m37741f.f3340a, 0, m37741f.f3342c, m37741f.f3343d)).m37719a();
            }
            return m37213c0.m37728s(m37213c0.m37734m(), 0, m37213c0.m37733n(), m37213c0.m37735l());
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        @TargetApi(21)
        public void runGuarded() {
            View decorView = this.f15819j.getWindow().getDecorView();
            C9612q.m13918g(decorView, "activity.window.decorView");
            if (this.f15820k) {
                C1365w0.m37253D0(decorView, new InterfaceC1324r0() { // from class: com.swmansion.rnscreens.z
                    @Override // androidx.core.view.InterfaceC1324r0
                    /* renamed from: a */
                    public final WindowInsetsCompat mo24794a(View view, WindowInsetsCompat windowInsetsCompat) {
                        WindowInsetsCompat m24795b;
                        m24795b = C5656x.C5659c.m24795b(view, windowInsetsCompat);
                        return m24795b;
                    }
                });
            } else {
                C1365w0.m37253D0(decorView, null);
            }
            C1365w0.m37191n0(decorView);
        }
    }

    private C5656x() {
    }

    /* renamed from: g */
    private final boolean m24814g(C5623j c5623j, C5623j.EnumC5628e enumC5628e) {
        switch (C5657a.f15815a[enumC5628e.ordinal()]) {
            case 1:
                if (c5623j.getScreenOrientation() != null) {
                    return true;
                }
                break;
            case 2:
                if (c5623j.getStatusBarColor() != null) {
                    return true;
                }
                break;
            case 3:
                if (c5623j.getStatusBarStyle() != null) {
                    return true;
                }
                break;
            case 4:
                if (c5623j.m24919f() != null) {
                    return true;
                }
                break;
            case 5:
                if (c5623j.m24920e() != null) {
                    return true;
                }
                break;
            case 6:
                if (c5623j.m24921d() != null) {
                    return true;
                }
                break;
            case 7:
                if (c5623j.getNavigationBarColor() != null) {
                    return true;
                }
                break;
            case 8:
                if (c5623j.m24922c() != null) {
                    return true;
                }
                break;
            default:
                throw new C11581q();
        }
        return false;
    }

    /* renamed from: h */
    private final C5623j m24813h(C5623j c5623j, C5623j.EnumC5628e enumC5628e) {
        C5634n fragment;
        if (c5623j != null && (fragment = c5623j.getFragment()) != null) {
            for (C5631l<?> c5631l : fragment.m24882p()) {
                C5623j topScreen = c5631l.getTopScreen();
                C5656x c5656x = f15810a;
                C5623j m24813h = c5656x.m24813h(topScreen, enumC5628e);
                if (m24813h != null) {
                    return m24813h;
                }
                if (topScreen != null && c5656x.m24814g(topScreen, enumC5628e)) {
                    return topScreen;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: i */
    private final C5623j m24812i(C5623j c5623j, C5623j.EnumC5628e enumC5628e) {
        for (ViewParent container = c5623j.getContainer(); container != null; container = container.getParent()) {
            if (container instanceof C5623j) {
                C5623j c5623j2 = (C5623j) container;
                if (m24814g(c5623j2, enumC5628e)) {
                    return c5623j2;
                }
            }
        }
        return null;
    }

    /* renamed from: j */
    private final C5623j m24811j(C5623j c5623j, C5623j.EnumC5628e enumC5628e) {
        C5623j m24813h = m24813h(c5623j, enumC5628e);
        if (m24813h != null) {
            return m24813h;
        }
        if (!m24814g(c5623j, enumC5628e)) {
            return m24812i(c5623j, enumC5628e);
        }
        return c5623j;
    }

    /* renamed from: k */
    private final boolean m24810k(int i) {
        return ((double) 1) - ((((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d)) / ((double) 255)) < 0.5d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m24808m(boolean z, WindowInsetsControllerCompat controller) {
        C9612q.m13917h(controller, "$controller");
        if (z) {
            controller.m37673a(WindowInsetsCompat.C1163m.m37676f());
        } else {
            controller.m37669e(WindowInsetsCompat.C1163m.m37676f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m24806o(Window window, int i) {
        new WindowInsetsControllerCompat(window, window.getDecorView()).m37672b(f15810a.m24810k(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m24802s(Activity activity, String style) {
        C9612q.m13917h(style, "$style");
        View decorView = activity.getWindow().getDecorView();
        C9612q.m13918g(decorView, "activity.window.decorView");
        new WindowInsetsControllerCompat(activity.getWindow(), decorView).m37671c(C9612q.m13922c(style, "dark"));
    }

    /* renamed from: d */
    public final void m24817d() {
        f15813d = true;
    }

    /* renamed from: e */
    public final void m24816e() {
        f15811b = true;
    }

    /* renamed from: f */
    public final void m24815f() {
        f15812c = true;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    /* renamed from: l */
    public final void m24809l(C5623j screen, Activity activity, ReactContext reactContext) {
        Integer num;
        boolean z;
        Boolean m24921d;
        C9612q.m13917h(screen, "screen");
        if (activity != null && reactContext != null) {
            if (f15814e == null) {
                f15814e = Integer.valueOf(activity.getWindow().getStatusBarColor());
            }
            C5623j m24811j = m24811j(screen, C5623j.EnumC5628e.COLOR);
            C5623j m24811j2 = m24811j(screen, C5623j.EnumC5628e.ANIMATED);
            if (m24811j == null || (num = m24811j.getStatusBarColor()) == null) {
                num = f15814e;
            }
            if (m24811j2 != null && (m24921d = m24811j2.m24921d()) != null) {
                z = m24921d.booleanValue();
            } else {
                z = false;
            }
            UiThreadUtil.runOnUiThread(new C5658b(reactContext, activity, num, z));
        }
    }

    /* renamed from: n */
    public final void m24807n(C5623j screen, Activity activity) {
        final boolean z;
        Boolean m24920e;
        C9612q.m13917h(screen, "screen");
        if (activity == null) {
            return;
        }
        C5623j m24811j = m24811j(screen, C5623j.EnumC5628e.HIDDEN);
        if (m24811j != null && (m24920e = m24811j.m24920e()) != null) {
            z = m24920e.booleanValue();
        } else {
            z = false;
        }
        Window window = activity.getWindow();
        final WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.u
            @Override // java.lang.Runnable
            public final void run() {
                C5656x.m24808m(z, windowInsetsControllerCompat);
            }
        });
    }

    /* renamed from: p */
    public final void m24805p(C5623j screen, Activity activity) {
        final int navigationBarColor;
        Integer navigationBarColor2;
        C9612q.m13917h(screen, "screen");
        if (activity == null) {
            return;
        }
        final Window window = activity.getWindow();
        C5623j m24811j = m24811j(screen, C5623j.EnumC5628e.NAVIGATION_BAR_COLOR);
        if (m24811j != null && (navigationBarColor2 = m24811j.getNavigationBarColor()) != null) {
            navigationBarColor = navigationBarColor2.intValue();
        } else {
            navigationBarColor = window.getNavigationBarColor();
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.v
            @Override // java.lang.Runnable
            public final void run() {
                C5656x.m24806o(window, navigationBarColor);
            }
        });
        window.setNavigationBarColor(navigationBarColor);
    }

    /* renamed from: q */
    public final void m24804q(C5623j screen, Activity activity) {
        boolean z;
        Boolean m24922c;
        C9612q.m13917h(screen, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        C5623j m24811j = m24811j(screen, C5623j.EnumC5628e.NAVIGATION_BAR_HIDDEN);
        if (m24811j != null && (m24922c = m24811j.m24922c()) != null) {
            z = m24922c.booleanValue();
        } else {
            z = false;
        }
        C1326r2.m37340b(window, z);
        if (z) {
            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
            windowInsetsControllerCompat.m37673a(WindowInsetsCompat.C1163m.m37677e());
            windowInsetsControllerCompat.m37670d(2);
            return;
        }
        new WindowInsetsControllerCompat(window, window.getDecorView()).m37669e(WindowInsetsCompat.C1163m.m37677e());
    }

    /* renamed from: r */
    public final void m24803r(C5623j screen, Activity activity) {
        int i;
        Integer screenOrientation;
        C9612q.m13917h(screen, "screen");
        if (activity == null) {
            return;
        }
        C5623j m24811j = m24811j(screen, C5623j.EnumC5628e.ORIENTATION);
        if (m24811j != null && (screenOrientation = m24811j.getScreenOrientation()) != null) {
            i = screenOrientation.intValue();
        } else {
            i = -1;
        }
        activity.setRequestedOrientation(i);
    }

    /* renamed from: t */
    public final void m24801t(C5623j screen, final Activity activity, ReactContext reactContext) {
        C9612q.m13917h(screen, "screen");
        if (activity != null && reactContext != null) {
            C5623j m24811j = m24811j(screen, C5623j.EnumC5628e.STYLE);
            final String str = (m24811j == null || (str = m24811j.getStatusBarStyle()) == null) ? "light" : "light";
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.w
                @Override // java.lang.Runnable
                public final void run() {
                    C5656x.m24802s(activity, str);
                }
            });
        }
    }

    /* renamed from: u */
    public final void m24800u(C5623j screen, Activity activity, ReactContext reactContext) {
        boolean z;
        Boolean m24919f;
        C9612q.m13917h(screen, "screen");
        if (activity != null && reactContext != null) {
            C5623j m24811j = m24811j(screen, C5623j.EnumC5628e.TRANSLUCENT);
            if (m24811j != null && (m24919f = m24811j.m24919f()) != null) {
                z = m24919f.booleanValue();
            } else {
                z = false;
            }
            UiThreadUtil.runOnUiThread(new C5659c(reactContext, activity, z));
        }
    }

    /* renamed from: v */
    public final void m24799v(C5623j screen, Activity activity, ReactContext reactContext) {
        C9612q.m13917h(screen, "screen");
        if (f15811b) {
            m24803r(screen, activity);
        }
        if (f15812c) {
            m24809l(screen, activity, reactContext);
            m24801t(screen, activity, reactContext);
            m24800u(screen, activity, reactContext);
            m24807n(screen, activity);
        }
        if (f15813d) {
            m24805p(screen, activity);
            m24804q(screen, activity);
        }
    }
}
