package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p145i0.C7372a;
import p356u.C12810e;

/* renamed from: androidx.core.view.t2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1340t2 {

    /* renamed from: a */
    private C1350e f3659a;

    /* renamed from: androidx.core.view.t2$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC1342b {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        WindowInsets mDispachedInsets;
        private final int mDispatchMode;

        public AbstractC1342b(int i) {
            this.mDispatchMode = i;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }

        public void onEnd(C1340t2 c1340t2) {
        }

        public void onPrepare(C1340t2 c1340t2) {
        }

        public abstract WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List<C1340t2> list);

        public C1341a onStart(C1340t2 c1340t2, C1341a c1341a) {
            return c1341a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.t2$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1343c extends C1350e {

        /* renamed from: e */
        private static final Interpolator f3662e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: f */
        private static final Interpolator f3663f = new C7372a();

        /* renamed from: g */
        private static final Interpolator f3664g = new DecelerateInterpolator();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.core.view.t2$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class View$OnApplyWindowInsetsListenerC1344a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            final AbstractC1342b f3665a;

            /* renamed from: b */
            private WindowInsetsCompat f3666b;

            /* renamed from: androidx.core.view.t2$c$a$a */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
            class C1345a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a */
                final /* synthetic */ C1340t2 f3667a;

                /* renamed from: b */
                final /* synthetic */ WindowInsetsCompat f3668b;

                /* renamed from: c */
                final /* synthetic */ WindowInsetsCompat f3669c;

                /* renamed from: d */
                final /* synthetic */ int f3670d;

                /* renamed from: e */
                final /* synthetic */ View f3671e;

                C1345a(C1340t2 c1340t2, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i, View view) {
                    this.f3667a = c1340t2;
                    this.f3668b = windowInsetsCompat;
                    this.f3669c = windowInsetsCompat2;
                    this.f3670d = i;
                    this.f3671e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f3667a.m37313d(valueAnimator.getAnimatedFraction());
                    C1343c.m37301j(this.f3671e, C1343c.m37297n(this.f3668b, this.f3669c, this.f3667a.m37315b(), this.f3670d), Collections.singletonList(this.f3667a));
                }
            }

            /* renamed from: androidx.core.view.t2$c$a$b */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
            class C1346b extends AnimatorListenerAdapter {

                /* renamed from: a */
                final /* synthetic */ C1340t2 f3673a;

                /* renamed from: b */
                final /* synthetic */ View f3674b;

                C1346b(C1340t2 c1340t2, View view) {
                    this.f3673a = c1340t2;
                    this.f3674b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f3673a.m37313d(1.0f);
                    C1343c.m37303h(this.f3674b, this.f3673a);
                }
            }

            /* renamed from: androidx.core.view.t2$c$a$c */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
            class RunnableC1347c implements Runnable {

                /* renamed from: j */
                final /* synthetic */ View f3676j;

                /* renamed from: k */
                final /* synthetic */ C1340t2 f3677k;

                /* renamed from: l */
                final /* synthetic */ C1341a f3678l;

                /* renamed from: m */
                final /* synthetic */ ValueAnimator f3679m;

                RunnableC1347c(View view, C1340t2 c1340t2, C1341a c1341a, ValueAnimator valueAnimator) {
                    this.f3676j = view;
                    this.f3677k = c1340t2;
                    this.f3678l = c1341a;
                    this.f3679m = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C1343c.m37300k(this.f3676j, this.f3677k, this.f3678l);
                    this.f3679m.start();
                }
            }

            View$OnApplyWindowInsetsListenerC1344a(View view, AbstractC1342b abstractC1342b) {
                WindowInsetsCompat windowInsetsCompat;
                this.f3665a = abstractC1342b;
                WindowInsetsCompat m37244I = C1365w0.m37244I(view);
                if (m37244I != null) {
                    windowInsetsCompat = new WindowInsetsCompat.C1152b(m37244I).m37719a();
                } else {
                    windowInsetsCompat = null;
                }
                this.f3666b = windowInsetsCompat;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f3666b = WindowInsetsCompat.m37721z(windowInsets, view);
                    return C1343c.m37299l(view, windowInsets);
                }
                WindowInsetsCompat m37721z = WindowInsetsCompat.m37721z(windowInsets, view);
                if (this.f3666b == null) {
                    this.f3666b = C1365w0.m37244I(view);
                }
                if (this.f3666b == null) {
                    this.f3666b = m37721z;
                    return C1343c.m37299l(view, windowInsets);
                }
                AbstractC1342b m37298m = C1343c.m37298m(view);
                if (m37298m != null && Objects.equals(m37298m.mDispachedInsets, windowInsets)) {
                    return C1343c.m37299l(view, windowInsets);
                }
                int m37307d = C1343c.m37307d(m37721z, this.f3666b);
                if (m37307d == 0) {
                    return C1343c.m37299l(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat = this.f3666b;
                C1340t2 c1340t2 = new C1340t2(m37307d, C1343c.m37305f(m37307d, m37721z, windowInsetsCompat), 160L);
                c1340t2.m37313d(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c1340t2.m37316a());
                C1341a m37306e = C1343c.m37306e(m37721z, windowInsetsCompat, m37307d);
                C1343c.m37302i(view, c1340t2, windowInsets, false);
                duration.addUpdateListener(new C1345a(c1340t2, m37721z, windowInsetsCompat, m37307d, view));
                duration.addListener(new C1346b(c1340t2, view));
                ViewTreeObserver$OnPreDrawListenerC1354u0.m37280a(view, new RunnableC1347c(view, c1340t2, m37306e, duration));
                this.f3666b = m37721z;
                return C1343c.m37299l(view, windowInsets);
            }
        }

        C1343c(int i, Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: d */
        static int m37307d(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!windowInsetsCompat.m37741f(i2).equals(windowInsetsCompat2.m37741f(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        /* renamed from: e */
        static C1341a m37306e(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i) {
            Insets m37741f = windowInsetsCompat.m37741f(i);
            Insets m37741f2 = windowInsetsCompat2.m37741f(i);
            return new C1341a(Insets.m38192b(Math.min(m37741f.f3340a, m37741f2.f3340a), Math.min(m37741f.f3341b, m37741f2.f3341b), Math.min(m37741f.f3342c, m37741f2.f3342c), Math.min(m37741f.f3343d, m37741f2.f3343d)), Insets.m38192b(Math.max(m37741f.f3340a, m37741f2.f3340a), Math.max(m37741f.f3341b, m37741f2.f3341b), Math.max(m37741f.f3342c, m37741f2.f3342c), Math.max(m37741f.f3343d, m37741f2.f3343d)));
        }

        /* renamed from: f */
        static Interpolator m37305f(int i, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2) {
            if ((i & 8) != 0) {
                if (windowInsetsCompat.m37741f(WindowInsetsCompat.C1163m.m37680b()).f3343d > windowInsetsCompat2.m37741f(WindowInsetsCompat.C1163m.m37680b()).f3343d) {
                    return f3662e;
                }
                return f3663f;
            }
            return f3664g;
        }

        /* renamed from: g */
        private static View.OnApplyWindowInsetsListener m37304g(View view, AbstractC1342b abstractC1342b) {
            return new View$OnApplyWindowInsetsListenerC1344a(view, abstractC1342b);
        }

        /* renamed from: h */
        static void m37303h(View view, C1340t2 c1340t2) {
            AbstractC1342b m37298m = m37298m(view);
            if (m37298m != null) {
                m37298m.onEnd(c1340t2);
                if (m37298m.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m37303h(viewGroup.getChildAt(i), c1340t2);
                }
            }
        }

        /* renamed from: i */
        static void m37302i(View view, C1340t2 c1340t2, WindowInsets windowInsets, boolean z) {
            AbstractC1342b m37298m = m37298m(view);
            if (m37298m != null) {
                m37298m.mDispachedInsets = windowInsets;
                if (!z) {
                    m37298m.onPrepare(c1340t2);
                    if (m37298m.getDispatchMode() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m37302i(viewGroup.getChildAt(i), c1340t2, windowInsets, z);
                }
            }
        }

        /* renamed from: j */
        static void m37301j(View view, WindowInsetsCompat windowInsetsCompat, List<C1340t2> list) {
            AbstractC1342b m37298m = m37298m(view);
            if (m37298m != null) {
                windowInsetsCompat = m37298m.onProgress(windowInsetsCompat, list);
                if (m37298m.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m37301j(viewGroup.getChildAt(i), windowInsetsCompat, list);
                }
            }
        }

        /* renamed from: k */
        static void m37300k(View view, C1340t2 c1340t2, C1341a c1341a) {
            AbstractC1342b m37298m = m37298m(view);
            if (m37298m != null) {
                m37298m.onStart(c1340t2, c1341a);
                if (m37298m.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m37300k(viewGroup.getChildAt(i), c1340t2, c1341a);
                }
            }
        }

        /* renamed from: l */
        static WindowInsets m37299l(View view, WindowInsets windowInsets) {
            if (view.getTag(C12810e.f33222Z) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: m */
        static AbstractC1342b m37298m(View view) {
            Object tag = view.getTag(C12810e.f33236g0);
            if (tag instanceof View$OnApplyWindowInsetsListenerC1344a) {
                return ((View$OnApplyWindowInsetsListenerC1344a) tag).f3665a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: n */
        static WindowInsetsCompat m37297n(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, float f, int i) {
            WindowInsetsCompat.C1152b c1152b = new WindowInsetsCompat.C1152b(windowInsetsCompat);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    c1152b.m37718b(i2, windowInsetsCompat.m37741f(i2));
                } else {
                    Insets m37741f = windowInsetsCompat.m37741f(i2);
                    Insets m37741f2 = windowInsetsCompat2.m37741f(i2);
                    float f2 = 1.0f - f;
                    c1152b.m37718b(i2, WindowInsetsCompat.m37730q(m37741f, (int) (((m37741f.f3340a - m37741f2.f3340a) * f2) + 0.5d), (int) (((m37741f.f3341b - m37741f2.f3341b) * f2) + 0.5d), (int) (((m37741f.f3342c - m37741f2.f3342c) * f2) + 0.5d), (int) (((m37741f.f3343d - m37741f2.f3343d) * f2) + 0.5d)));
                }
            }
            return c1152b.m37719a();
        }

        /* renamed from: o */
        static void m37296o(View view, AbstractC1342b abstractC1342b) {
            Object tag = view.getTag(C12810e.f33222Z);
            if (abstractC1342b == null) {
                view.setTag(C12810e.f33236g0, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener m37304g = m37304g(view, abstractC1342b);
            view.setTag(C12810e.f33236g0, m37304g);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(m37304g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.t2$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1350e {

        /* renamed from: a */
        private final int f3686a;

        /* renamed from: b */
        private float f3687b;

        /* renamed from: c */
        private final Interpolator f3688c;

        /* renamed from: d */
        private final long f3689d;

        C1350e(int i, Interpolator interpolator, long j) {
            this.f3686a = i;
            this.f3688c = interpolator;
            this.f3689d = j;
        }

        /* renamed from: a */
        public long mo37290a() {
            return this.f3689d;
        }

        /* renamed from: b */
        public float mo37289b() {
            Interpolator interpolator = this.f3688c;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.f3687b);
            }
            return this.f3687b;
        }

        /* renamed from: c */
        public void mo37288c(float f) {
            this.f3687b = f;
        }
    }

    public C1340t2(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3659a = new C1348d(i, interpolator, j);
        } else {
            this.f3659a = new C1343c(i, interpolator, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m37314c(View view, AbstractC1342b abstractC1342b) {
        if (Build.VERSION.SDK_INT >= 30) {
            C1348d.m37292g(view, abstractC1342b);
        } else {
            C1343c.m37296o(view, abstractC1342b);
        }
    }

    /* renamed from: e */
    static C1340t2 m37312e(WindowInsetsAnimation windowInsetsAnimation) {
        return new C1340t2(windowInsetsAnimation);
    }

    /* renamed from: a */
    public long m37316a() {
        return this.f3659a.mo37290a();
    }

    /* renamed from: b */
    public float m37315b() {
        return this.f3659a.mo37289b();
    }

    /* renamed from: d */
    public void m37313d(float f) {
        this.f3659a.mo37288c(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.t2$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1348d extends C1350e {

        /* renamed from: e */
        private final WindowInsetsAnimation f3681e;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.core.view.t2$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C1349a extends WindowInsetsAnimation.Callback {

            /* renamed from: a */
            private final AbstractC1342b f3682a;

            /* renamed from: b */
            private List<C1340t2> f3683b;

            /* renamed from: c */
            private ArrayList<C1340t2> f3684c;

            /* renamed from: d */
            private final HashMap<WindowInsetsAnimation, C1340t2> f3685d;

            C1349a(AbstractC1342b abstractC1342b) {
                super(abstractC1342b.getDispatchMode());
                this.f3685d = new HashMap<>();
                this.f3682a = abstractC1342b;
            }

            /* renamed from: a */
            private C1340t2 m37291a(WindowInsetsAnimation windowInsetsAnimation) {
                C1340t2 c1340t2 = this.f3685d.get(windowInsetsAnimation);
                if (c1340t2 == null) {
                    C1340t2 m37312e = C1340t2.m37312e(windowInsetsAnimation);
                    this.f3685d.put(windowInsetsAnimation, m37312e);
                    return m37312e;
                }
                return c1340t2;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f3682a.onEnd(m37291a(windowInsetsAnimation));
                this.f3685d.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f3682a.onPrepare(m37291a(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                float fraction;
                ArrayList<C1340t2> arrayList = this.f3684c;
                if (arrayList == null) {
                    ArrayList<C1340t2> arrayList2 = new ArrayList<>(list.size());
                    this.f3684c = arrayList2;
                    this.f3683b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    C1340t2 m37291a = m37291a(windowInsetsAnimation);
                    fraction = windowInsetsAnimation.getFraction();
                    m37291a.m37313d(fraction);
                    this.f3684c.add(m37291a);
                }
                return this.f3682a.onProgress(WindowInsetsCompat.m37722y(windowInsets), this.f3683b).m37723x();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f3682a.onStart(m37291a(windowInsetsAnimation), C1341a.m37308d(bounds)).m37309c();
            }
        }

        C1348d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f3681e = windowInsetsAnimation;
        }

        /* renamed from: d */
        public static WindowInsetsAnimation.Bounds m37295d(C1341a c1341a) {
            return new WindowInsetsAnimation.Bounds(c1341a.m37311a().m38189e(), c1341a.m37310b().m38189e());
        }

        /* renamed from: e */
        public static Insets m37294e(WindowInsetsAnimation.Bounds bounds) {
            android.graphics.Insets upperBound;
            upperBound = bounds.getUpperBound();
            return Insets.m38190d(upperBound);
        }

        /* renamed from: f */
        public static Insets m37293f(WindowInsetsAnimation.Bounds bounds) {
            android.graphics.Insets lowerBound;
            lowerBound = bounds.getLowerBound();
            return Insets.m38190d(lowerBound);
        }

        /* renamed from: g */
        public static void m37292g(View view, AbstractC1342b abstractC1342b) {
            C1349a c1349a;
            if (abstractC1342b != null) {
                c1349a = new C1349a(abstractC1342b);
            } else {
                c1349a = null;
            }
            view.setWindowInsetsAnimationCallback(c1349a);
        }

        @Override // androidx.core.view.C1340t2.C1350e
        /* renamed from: a */
        public long mo37290a() {
            long durationMillis;
            durationMillis = this.f3681e.getDurationMillis();
            return durationMillis;
        }

        @Override // androidx.core.view.C1340t2.C1350e
        /* renamed from: b */
        public float mo37289b() {
            float interpolatedFraction;
            interpolatedFraction = this.f3681e.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // androidx.core.view.C1340t2.C1350e
        /* renamed from: c */
        public void mo37288c(float f) {
            this.f3681e.setFraction(f);
        }

        C1348d(int i, Interpolator interpolator, long j) {
            this(new WindowInsetsAnimation(i, interpolator, j));
        }
    }

    /* renamed from: androidx.core.view.t2$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1341a {

        /* renamed from: a */
        private final Insets f3660a;

        /* renamed from: b */
        private final Insets f3661b;

        public C1341a(Insets insets, Insets insets2) {
            this.f3660a = insets;
            this.f3661b = insets2;
        }

        /* renamed from: d */
        public static C1341a m37308d(WindowInsetsAnimation.Bounds bounds) {
            return new C1341a(bounds);
        }

        /* renamed from: a */
        public Insets m37311a() {
            return this.f3660a;
        }

        /* renamed from: b */
        public Insets m37310b() {
            return this.f3661b;
        }

        /* renamed from: c */
        public WindowInsetsAnimation.Bounds m37309c() {
            return C1348d.m37295d(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f3660a + " upper=" + this.f3661b + "}";
        }

        private C1341a(WindowInsetsAnimation.Bounds bounds) {
            this.f3660a = C1348d.m37293f(bounds);
            this.f3661b = C1348d.m37294e(bounds);
        }
    }

    private C1340t2(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3659a = new C1348d(windowInsetsAnimation);
        }
    }
}
