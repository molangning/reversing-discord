package p291q1;

import android.view.Choreographer;
import p073e1.C6043e;
import p073e1.C6062k;

/* renamed from: q1.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class Choreographer$FrameCallbackC11677i extends AbstractC11671c implements Choreographer.FrameCallback {

    /* renamed from: u */
    private C6062k f30456u;

    /* renamed from: m */
    private float f30448m = 1.0f;

    /* renamed from: n */
    private boolean f30449n = false;

    /* renamed from: o */
    private long f30450o = 0;

    /* renamed from: p */
    private float f30451p = 0.0f;

    /* renamed from: q */
    private float f30452q = 0.0f;

    /* renamed from: r */
    private int f30453r = 0;

    /* renamed from: s */
    private float f30454s = -2.14748365E9f;

    /* renamed from: t */
    private float f30455t = 2.14748365E9f;

    /* renamed from: v */
    protected boolean f30457v = false;

    /* renamed from: w */
    private boolean f30458w = false;

    /* renamed from: I */
    private void m7221I() {
        if (this.f30456u == null) {
            return;
        }
        float f = this.f30452q;
        if (f >= this.f30454s && f <= this.f30455t) {
            return;
        }
        throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f30454s), Float.valueOf(this.f30455t), Float.valueOf(this.f30452q)));
    }

    /* renamed from: p */
    private float m7215p() {
        C6062k c6062k = this.f30456u;
        if (c6062k == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / c6062k.m23668i()) / Math.abs(this.f30448m);
    }

    /* renamed from: t */
    private boolean m7211t() {
        return m7212s() < 0.0f;
    }

    /* renamed from: A */
    public void m7229A() {
        m7223G(-m7212s());
    }

    /* renamed from: B */
    public void m7228B(C6062k c6062k) {
        boolean z;
        if (this.f30456u == null) {
            z = true;
        } else {
            z = false;
        }
        this.f30456u = c6062k;
        if (z) {
            m7225E(Math.max(this.f30454s, c6062k.m23661p()), Math.min(this.f30455t, c6062k.m23671f()));
        } else {
            m7225E((int) c6062k.m23661p(), (int) c6062k.m23671f());
        }
        float f = this.f30452q;
        this.f30452q = 0.0f;
        this.f30451p = 0.0f;
        m7227C((int) f);
        m7244j();
    }

    /* renamed from: C */
    public void m7227C(float f) {
        if (this.f30451p == f) {
            return;
        }
        float m7202b = C11679k.m7202b(f, m7213r(), m7214q());
        this.f30451p = m7202b;
        if (this.f30458w) {
            m7202b = (float) Math.floor(m7202b);
        }
        this.f30452q = m7202b;
        this.f30450o = 0L;
        m7244j();
    }

    /* renamed from: D */
    public void m7226D(float f) {
        m7225E(this.f30454s, f);
    }

    /* renamed from: E */
    public void m7225E(float f, float f2) {
        float m23661p;
        float m23671f;
        if (f <= f2) {
            C6062k c6062k = this.f30456u;
            if (c6062k == null) {
                m23661p = -3.4028235E38f;
            } else {
                m23661p = c6062k.m23661p();
            }
            C6062k c6062k2 = this.f30456u;
            if (c6062k2 == null) {
                m23671f = Float.MAX_VALUE;
            } else {
                m23671f = c6062k2.m23671f();
            }
            float m7202b = C11679k.m7202b(f, m23661p, m23671f);
            float m7202b2 = C11679k.m7202b(f2, m23661p, m23671f);
            if (m7202b != this.f30454s || m7202b2 != this.f30455t) {
                this.f30454s = m7202b;
                this.f30455t = m7202b2;
                m7227C((int) C11679k.m7202b(this.f30452q, m7202b, m7202b2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
    }

    /* renamed from: F */
    public void m7224F(int i) {
        m7225E(i, (int) this.f30455t);
    }

    /* renamed from: G */
    public void m7223G(float f) {
        this.f30448m = f;
    }

    /* renamed from: H */
    public void m7222H(boolean z) {
        this.f30458w = z;
    }

    @Override // p291q1.AbstractC11671c
    /* renamed from: b */
    public void mo7220b() {
        super.mo7220b();
        m7249c(m7211t());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        mo7220b();
        m7207x();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        float m7213r;
        float m7214q;
        m7208w();
        if (this.f30456u != null && isRunning()) {
            C6043e.m23828b("LottieValueAnimator#doFrame");
            long j2 = this.f30450o;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float m7215p = ((float) j3) / m7215p();
            float f = this.f30451p;
            if (m7211t()) {
                m7215p = -m7215p;
            }
            float f2 = f + m7215p;
            boolean z = !C11679k.m7200d(f2, m7213r(), m7214q());
            float f3 = this.f30451p;
            float m7202b = C11679k.m7202b(f2, m7213r(), m7214q());
            this.f30451p = m7202b;
            if (this.f30458w) {
                m7202b = (float) Math.floor(m7202b);
            }
            this.f30452q = m7202b;
            this.f30450o = j;
            if (!this.f30458w || this.f30451p != f3) {
                m7244j();
            }
            if (z) {
                if (getRepeatCount() != -1 && this.f30453r >= getRepeatCount()) {
                    if (this.f30448m < 0.0f) {
                        m7214q = m7213r();
                    } else {
                        m7214q = m7214q();
                    }
                    this.f30451p = m7214q;
                    this.f30452q = m7214q;
                    m7207x();
                    m7249c(m7211t());
                } else {
                    m7247e();
                    this.f30453r++;
                    if (getRepeatMode() == 2) {
                        this.f30449n = !this.f30449n;
                        m7229A();
                    } else {
                        if (m7211t()) {
                            m7213r = m7214q();
                        } else {
                            m7213r = m7213r();
                        }
                        this.f30451p = m7213r;
                        this.f30452q = m7213r;
                    }
                    this.f30450o = j;
                }
            }
            m7221I();
            C6043e.m23827c("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float m7213r;
        float m7214q;
        float m7213r2;
        if (this.f30456u == null) {
            return 0.0f;
        }
        if (m7211t()) {
            m7213r = m7214q() - this.f30452q;
            m7214q = m7214q();
            m7213r2 = m7213r();
        } else {
            m7213r = this.f30452q - m7213r();
            m7214q = m7214q();
            m7213r2 = m7213r();
        }
        return m7213r / (m7214q - m7213r2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(m7217m());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        C6062k c6062k = this.f30456u;
        if (c6062k == null) {
            return 0L;
        }
        return c6062k.m23673d();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f30457v;
    }

    /* renamed from: k */
    public void m7219k() {
        this.f30456u = null;
        this.f30454s = -2.14748365E9f;
        this.f30455t = 2.14748365E9f;
    }

    /* renamed from: l */
    public void m7218l() {
        m7207x();
        m7249c(m7211t());
    }

    /* renamed from: m */
    public float m7217m() {
        C6062k c6062k = this.f30456u;
        if (c6062k == null) {
            return 0.0f;
        }
        return (this.f30452q - c6062k.m23661p()) / (this.f30456u.m23671f() - this.f30456u.m23661p());
    }

    /* renamed from: n */
    public float m7216n() {
        return this.f30452q;
    }

    /* renamed from: q */
    public float m7214q() {
        C6062k c6062k = this.f30456u;
        if (c6062k == null) {
            return 0.0f;
        }
        float f = this.f30455t;
        if (f == 2.14748365E9f) {
            return c6062k.m23671f();
        }
        return f;
    }

    /* renamed from: r */
    public float m7213r() {
        C6062k c6062k = this.f30456u;
        if (c6062k == null) {
            return 0.0f;
        }
        float f = this.f30454s;
        if (f == -2.14748365E9f) {
            return c6062k.m23661p();
        }
        return f;
    }

    /* renamed from: s */
    public float m7212s() {
        return this.f30448m;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f30449n) {
            this.f30449n = false;
            m7229A();
        }
    }

    /* renamed from: u */
    public void m7210u() {
        m7207x();
        m7248d();
    }

    /* renamed from: v */
    public void m7209v() {
        float m7213r;
        this.f30457v = true;
        m7245g(m7211t());
        if (m7211t()) {
            m7213r = m7214q();
        } else {
            m7213r = m7213r();
        }
        m7227C((int) m7213r);
        this.f30450o = 0L;
        this.f30453r = 0;
        m7208w();
    }

    /* renamed from: w */
    protected void m7208w() {
        if (isRunning()) {
            m7206y(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* renamed from: x */
    protected void m7207x() {
        m7206y(true);
    }

    /* renamed from: y */
    protected void m7206y(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f30457v = false;
        }
    }

    /* renamed from: z */
    public void m7205z() {
        this.f30457v = true;
        m7208w();
        this.f30450o = 0L;
        if (m7211t() && m7216n() == m7213r()) {
            m7227C(m7214q());
        } else if (!m7211t() && m7216n() == m7214q()) {
            m7227C(m7213r());
        }
        m7246f();
    }
}