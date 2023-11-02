package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.AbstractC1466b;

/* renamed from: androidx.dynamicanimation.animation.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1485c {

    /* renamed from: a */
    double f3883a;

    /* renamed from: b */
    double f3884b;

    /* renamed from: c */
    private boolean f3885c;

    /* renamed from: d */
    private double f3886d;

    /* renamed from: e */
    private double f3887e;

    /* renamed from: f */
    private double f3888f;

    /* renamed from: g */
    private double f3889g;

    /* renamed from: h */
    private double f3890h;

    /* renamed from: i */
    private double f3891i;

    /* renamed from: j */
    private final AbstractC1466b.C1481o f3892j;

    public C1485c() {
        this.f3883a = Math.sqrt(1500.0d);
        this.f3884b = 0.5d;
        this.f3885c = false;
        this.f3891i = Double.MAX_VALUE;
        this.f3892j = new AbstractC1466b.C1481o();
    }

    /* renamed from: b */
    private void m36688b() {
        if (this.f3885c) {
            return;
        }
        if (this.f3891i != Double.MAX_VALUE) {
            double d = this.f3884b;
            if (d > 1.0d) {
                double d2 = this.f3883a;
                this.f3888f = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
                double d3 = this.f3884b;
                double d4 = this.f3883a;
                this.f3889g = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
            } else if (d >= 0.0d && d < 1.0d) {
                this.f3890h = this.f3883a * Math.sqrt(1.0d - (d * d));
            }
            this.f3885c = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    /* renamed from: a */
    public float m36689a() {
        return (float) this.f3891i;
    }

    /* renamed from: c */
    public boolean m36687c(float f, float f2) {
        if (Math.abs(f2) < this.f3887e && Math.abs(f - m36689a()) < this.f3886d) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public C1485c m36686d(float f) {
        if (f >= 0.0f) {
            this.f3884b = f;
            this.f3885c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: e */
    public C1485c m36685e(float f) {
        this.f3891i = f;
        return this;
    }

    /* renamed from: f */
    public C1485c m36684f(float f) {
        if (f > 0.0f) {
            this.f3883a = Math.sqrt(f);
            this.f3885c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m36683g(double d) {
        double abs = Math.abs(d);
        this.f3886d = abs;
        this.f3887e = abs * 62.5d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public AbstractC1466b.C1481o m36682h(double d, double d2, long j) {
        double cos;
        double d3;
        m36688b();
        double d4 = j / 1000.0d;
        double d5 = d - this.f3891i;
        double d6 = this.f3884b;
        if (d6 > 1.0d) {
            double d7 = this.f3889g;
            double d8 = this.f3888f;
            double d9 = d5 - (((d7 * d5) - d2) / (d7 - d8));
            double d10 = ((d5 * d7) - d2) / (d7 - d8);
            d3 = (Math.pow(2.718281828459045d, d7 * d4) * d9) + (Math.pow(2.718281828459045d, this.f3888f * d4) * d10);
            double d11 = this.f3889g;
            double pow = d9 * d11 * Math.pow(2.718281828459045d, d11 * d4);
            double d12 = this.f3888f;
            cos = pow + (d10 * d12 * Math.pow(2.718281828459045d, d12 * d4));
        } else if (d6 == 1.0d) {
            double d13 = this.f3883a;
            double d14 = d2 + (d13 * d5);
            double d15 = d5 + (d14 * d4);
            d3 = Math.pow(2.718281828459045d, (-d13) * d4) * d15;
            double pow2 = d15 * Math.pow(2.718281828459045d, (-this.f3883a) * d4);
            double d16 = this.f3883a;
            cos = (d14 * Math.pow(2.718281828459045d, (-d16) * d4)) + (pow2 * (-d16));
        } else {
            double d17 = 1.0d / this.f3890h;
            double d18 = this.f3883a;
            double d19 = d17 * ((d6 * d18 * d5) + d2);
            double pow3 = Math.pow(2.718281828459045d, (-d6) * d18 * d4) * ((Math.cos(this.f3890h * d4) * d5) + (Math.sin(this.f3890h * d4) * d19));
            double d20 = this.f3883a;
            double d21 = this.f3884b;
            double pow4 = Math.pow(2.718281828459045d, (-d21) * d20 * d4);
            double d22 = this.f3890h;
            double sin = (-d22) * d5 * Math.sin(d22 * d4);
            double d23 = this.f3890h;
            cos = ((-d20) * pow3 * d21) + (pow4 * (sin + (d19 * d23 * Math.cos(d23 * d4))));
            d3 = pow3;
        }
        AbstractC1466b.C1481o c1481o = this.f3892j;
        c1481o.f3881a = (float) (d3 + this.f3891i);
        c1481o.f3882b = (float) cos;
        return c1481o;
    }

    public C1485c(float f) {
        this.f3883a = Math.sqrt(1500.0d);
        this.f3884b = 0.5d;
        this.f3885c = false;
        this.f3891i = Double.MAX_VALUE;
        this.f3892j = new AbstractC1466b.C1481o();
        this.f3891i = f;
    }
}
