package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.C1365w0;

/* renamed from: androidx.core.widget.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractView$OnTouchListenerC1413a implements View.OnTouchListener {

    /* renamed from: A */
    private static final int f3755A = ViewConfiguration.getTapTimeout();

    /* renamed from: l */
    final View f3758l;

    /* renamed from: m */
    private Runnable f3759m;

    /* renamed from: p */
    private int f3762p;

    /* renamed from: q */
    private int f3763q;

    /* renamed from: u */
    private boolean f3767u;

    /* renamed from: v */
    boolean f3768v;

    /* renamed from: w */
    boolean f3769w;

    /* renamed from: x */
    boolean f3770x;

    /* renamed from: y */
    private boolean f3771y;

    /* renamed from: z */
    private boolean f3772z;

    /* renamed from: j */
    final C1414a f3756j = new C1414a();

    /* renamed from: k */
    private final Interpolator f3757k = new AccelerateInterpolator();

    /* renamed from: n */
    private float[] f3760n = {0.0f, 0.0f};

    /* renamed from: o */
    private float[] f3761o = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: r */
    private float[] f3764r = {0.0f, 0.0f};

    /* renamed from: s */
    private float[] f3765s = {0.0f, 0.0f};

    /* renamed from: t */
    private float[] f3766t = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: androidx.core.widget.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1414a {

        /* renamed from: a */
        private int f3773a;

        /* renamed from: b */
        private int f3774b;

        /* renamed from: c */
        private float f3775c;

        /* renamed from: d */
        private float f3776d;

        /* renamed from: j */
        private float f3782j;

        /* renamed from: k */
        private int f3783k;

        /* renamed from: e */
        private long f3777e = Long.MIN_VALUE;

        /* renamed from: i */
        private long f3781i = -1;

        /* renamed from: f */
        private long f3778f = 0;

        /* renamed from: g */
        private int f3779g = 0;

        /* renamed from: h */
        private int f3780h = 0;

        C1414a() {
        }

        /* renamed from: e */
        private float m36937e(long j) {
            long j2 = this.f3777e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f3781i;
            if (j3 >= 0 && j >= j3) {
                float f = this.f3782j;
                return (1.0f - f) + (f * AbstractView$OnTouchListenerC1413a.m36958e(((float) (j - j3)) / this.f3783k, 0.0f, 1.0f));
            }
            return AbstractView$OnTouchListenerC1413a.m36958e(((float) (j - j2)) / this.f3773a, 0.0f, 1.0f) * 0.5f;
        }

        /* renamed from: g */
        private float m36935g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        public void m36941a() {
            if (this.f3778f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float m36935g = m36935g(m36937e(currentAnimationTimeMillis));
                this.f3778f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f3778f)) * m36935g;
                this.f3779g = (int) (this.f3775c * f);
                this.f3780h = (int) (f * this.f3776d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int m36940b() {
            return this.f3779g;
        }

        /* renamed from: c */
        public int m36939c() {
            return this.f3780h;
        }

        /* renamed from: d */
        public int m36938d() {
            float f = this.f3775c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public int m36936f() {
            float f = this.f3776d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: h */
        public boolean m36934h() {
            if (this.f3781i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f3781i + this.f3783k) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        public void m36933i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3783k = AbstractView$OnTouchListenerC1413a.m36957f((int) (currentAnimationTimeMillis - this.f3777e), 0, this.f3774b);
            this.f3782j = m36937e(currentAnimationTimeMillis);
            this.f3781i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void m36932j(int i) {
            this.f3774b = i;
        }

        /* renamed from: k */
        public void m36931k(int i) {
            this.f3773a = i;
        }

        /* renamed from: l */
        public void m36930l(float f, float f2) {
            this.f3775c = f;
            this.f3776d = f2;
        }

        /* renamed from: m */
        public void m36929m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3777e = currentAnimationTimeMillis;
            this.f3781i = -1L;
            this.f3778f = currentAnimationTimeMillis;
            this.f3782j = 0.5f;
            this.f3779g = 0;
            this.f3780h = 0;
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1415b implements Runnable {
        RunnableC1415b() {
            AbstractView$OnTouchListenerC1413a.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractView$OnTouchListenerC1413a abstractView$OnTouchListenerC1413a = AbstractView$OnTouchListenerC1413a.this;
            if (!abstractView$OnTouchListenerC1413a.f3770x) {
                return;
            }
            if (abstractView$OnTouchListenerC1413a.f3768v) {
                abstractView$OnTouchListenerC1413a.f3768v = false;
                abstractView$OnTouchListenerC1413a.f3756j.m36929m();
            }
            C1414a c1414a = AbstractView$OnTouchListenerC1413a.this.f3756j;
            if (!c1414a.m36934h() && AbstractView$OnTouchListenerC1413a.this.m36943u()) {
                AbstractView$OnTouchListenerC1413a abstractView$OnTouchListenerC1413a2 = AbstractView$OnTouchListenerC1413a.this;
                if (abstractView$OnTouchListenerC1413a2.f3769w) {
                    abstractView$OnTouchListenerC1413a2.f3769w = false;
                    abstractView$OnTouchListenerC1413a2.m36960c();
                }
                c1414a.m36941a();
                AbstractView$OnTouchListenerC1413a.this.mo36893j(c1414a.m36940b(), c1414a.m36939c());
                C1365w0.m37201i0(AbstractView$OnTouchListenerC1413a.this.f3758l, this);
                return;
            }
            AbstractView$OnTouchListenerC1413a.this.f3770x = false;
        }
    }

    public AbstractView$OnTouchListenerC1413a(View view) {
        this.f3758l = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        m36949o(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        m36948p(f3, f3);
        m36952l(1);
        m36950n(Float.MAX_VALUE, Float.MAX_VALUE);
        m36945s(0.2f, 0.2f);
        m36944t(1.0f, 1.0f);
        m36953k(f3755A);
        m36946r(500);
        m36947q(500);
    }

    /* renamed from: d */
    private float m36959d(int i, float f, float f2, float f3) {
        float m36955h = m36955h(this.f3760n[i], f2, this.f3761o[i], f);
        int i2 = (m36955h > 0.0f ? 1 : (m36955h == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f3764r[i];
        float f5 = this.f3765s[i];
        float f6 = this.f3766t[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return m36958e(m36955h * f7, f5, f6);
        }
        return -m36958e((-m36955h) * f7, f5, f6);
    }

    /* renamed from: e */
    static float m36958e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: f */
    static int m36957f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: g */
    private float m36956g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f3762p;
        if (i != 0 && i != 1) {
            if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        } else if (f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.f3770x && i == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    /* renamed from: h */
    private float m36955h(float f, float f2, float f3, float f4) {
        float interpolation;
        float m36958e = m36958e(f * f2, 0.0f, f3);
        float m36956g = m36956g(f2 - f4, m36958e) - m36956g(f4, m36958e);
        if (m36956g < 0.0f) {
            interpolation = -this.f3757k.getInterpolation(-m36956g);
        } else if (m36956g <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f3757k.getInterpolation(m36956g);
        }
        return m36958e(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: i */
    private void m36954i() {
        if (this.f3768v) {
            this.f3770x = false;
        } else {
            this.f3756j.m36933i();
        }
    }

    /* renamed from: v */
    private void m36942v() {
        int i;
        if (this.f3759m == null) {
            this.f3759m = new RunnableC1415b();
        }
        this.f3770x = true;
        this.f3768v = true;
        if (!this.f3767u && (i = this.f3763q) > 0) {
            C1365w0.m37199j0(this.f3758l, this.f3759m, i);
        } else {
            this.f3759m.run();
        }
        this.f3767u = true;
    }

    /* renamed from: a */
    public abstract boolean mo36895a(int i);

    /* renamed from: b */
    public abstract boolean mo36894b(int i);

    /* renamed from: c */
    void m36960c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f3758l.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: j */
    public abstract void mo36893j(int i, int i2);

    /* renamed from: k */
    public AbstractView$OnTouchListenerC1413a m36953k(int i) {
        this.f3763q = i;
        return this;
    }

    /* renamed from: l */
    public AbstractView$OnTouchListenerC1413a m36952l(int i) {
        this.f3762p = i;
        return this;
    }

    /* renamed from: m */
    public AbstractView$OnTouchListenerC1413a m36951m(boolean z) {
        if (this.f3771y && !z) {
            m36954i();
        }
        this.f3771y = z;
        return this;
    }

    /* renamed from: n */
    public AbstractView$OnTouchListenerC1413a m36950n(float f, float f2) {
        float[] fArr = this.f3761o;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: o */
    public AbstractView$OnTouchListenerC1413a m36949o(float f, float f2) {
        float[] fArr = this.f3766t;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f3771y
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.m36954i()
            goto L58
        L1a:
            r5.f3769w = r2
            r5.f3767u = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f3758l
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m36959d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f3758l
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m36959d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f3756j
            r7.m36930l(r0, r6)
            boolean r6 = r5.f3770x
            if (r6 != 0) goto L58
            boolean r6 = r5.m36943u()
            if (r6 == 0) goto L58
            r5.m36942v()
        L58:
            boolean r6 = r5.f3772z
            if (r6 == 0) goto L61
            boolean r6 = r5.f3770x
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractView$OnTouchListenerC1413a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public AbstractView$OnTouchListenerC1413a m36948p(float f, float f2) {
        float[] fArr = this.f3765s;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public AbstractView$OnTouchListenerC1413a m36947q(int i) {
        this.f3756j.m36932j(i);
        return this;
    }

    /* renamed from: r */
    public AbstractView$OnTouchListenerC1413a m36946r(int i) {
        this.f3756j.m36931k(i);
        return this;
    }

    /* renamed from: s */
    public AbstractView$OnTouchListenerC1413a m36945s(float f, float f2) {
        float[] fArr = this.f3760n;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: t */
    public AbstractView$OnTouchListenerC1413a m36944t(float f, float f2) {
        float[] fArr = this.f3764r;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: u */
    boolean m36943u() {
        C1414a c1414a = this.f3756j;
        int m36936f = c1414a.m36936f();
        int m36938d = c1414a.m36938d();
        if ((m36936f != 0 && mo36894b(m36936f)) || (m36938d != 0 && mo36895a(m36938d))) {
            return true;
        }
        return false;
    }
}