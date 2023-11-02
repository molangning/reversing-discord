package lc;

/* renamed from: lc.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10129k {

    /* renamed from: a */
    private final float f26419a;

    /* renamed from: b */
    private final float f26420b;

    /* renamed from: c */
    private final float f26421c;

    /* renamed from: d */
    private final float f26422d;

    /* renamed from: e */
    private final float f26423e;

    /* renamed from: f */
    private final float f26424f;

    /* renamed from: g */
    private final float f26425g;

    /* renamed from: h */
    private final float f26426h;

    /* renamed from: i */
    private final float f26427i;

    private C10129k(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f26419a = f;
        this.f26420b = f4;
        this.f26421c = f7;
        this.f26422d = f2;
        this.f26423e = f5;
        this.f26424f = f8;
        this.f26425g = f3;
        this.f26426h = f6;
        this.f26427i = f9;
    }

    /* renamed from: b */
    public static C10129k m12206b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return m12204d(f9, f10, f11, f12, f13, f14, f15, f16).m12203e(m12205c(f, f2, f3, f4, f5, f6, f7, f8));
    }

    /* renamed from: c */
    public static C10129k m12205c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m12204d(f, f2, f3, f4, f5, f6, f7, f8).m12207a();
    }

    /* renamed from: d */
    public static C10129k m12204d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new C10129k(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new C10129k((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f17 * f8), f2, f16, f17, 1.0f);
    }

    /* renamed from: a */
    C10129k m12207a() {
        float f = this.f26423e;
        float f2 = this.f26427i;
        float f3 = this.f26424f;
        float f4 = this.f26426h;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = this.f26425g;
        float f7 = this.f26422d;
        float f8 = (f3 * f6) - (f7 * f2);
        float f9 = (f7 * f4) - (f * f6);
        float f10 = this.f26421c;
        float f11 = this.f26420b;
        float f12 = (f10 * f4) - (f11 * f2);
        float f13 = this.f26419a;
        return new C10129k(f5, f8, f9, f12, (f2 * f13) - (f10 * f6), (f6 * f11) - (f4 * f13), (f11 * f3) - (f10 * f), (f10 * f7) - (f3 * f13), (f13 * f) - (f11 * f7));
    }

    /* renamed from: e */
    C10129k m12203e(C10129k c10129k) {
        float f = this.f26419a;
        float f2 = c10129k.f26419a;
        float f3 = this.f26422d;
        float f4 = c10129k.f26420b;
        float f5 = this.f26425g;
        float f6 = c10129k.f26421c;
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = c10129k.f26422d;
        float f9 = c10129k.f26423e;
        float f10 = c10129k.f26424f;
        float f11 = (f * f8) + (f3 * f9) + (f5 * f10);
        float f12 = c10129k.f26425g;
        float f13 = c10129k.f26426h;
        float f14 = c10129k.f26427i;
        float f15 = (f * f12) + (f3 * f13) + (f5 * f14);
        float f16 = this.f26420b;
        float f17 = this.f26423e;
        float f18 = this.f26426h;
        float f19 = (f18 * f14) + (f16 * f12) + (f17 * f13);
        float f20 = this.f26421c;
        float f21 = this.f26424f;
        float f22 = (f2 * f20) + (f4 * f21);
        float f23 = this.f26427i;
        return new C10129k(f7, f11, f15, (f16 * f2) + (f17 * f4) + (f18 * f6), (f16 * f8) + (f17 * f9) + (f18 * f10), f19, (f6 * f23) + f22, (f8 * f20) + (f9 * f21) + (f10 * f23), (f20 * f12) + (f21 * f13) + (f23 * f14));
    }

    /* renamed from: f */
    public void m12202f(float[] fArr) {
        int length = fArr.length;
        float f = this.f26419a;
        float f2 = this.f26420b;
        float f3 = this.f26421c;
        float f4 = this.f26422d;
        float f5 = this.f26423e;
        float f6 = this.f26424f;
        float f7 = this.f26425g;
        float f8 = this.f26426h;
        float f9 = this.f26427i;
        for (int i = 0; i < length; i += 2) {
            float f10 = fArr[i];
            int i2 = i + 1;
            float f11 = fArr[i2];
            float f12 = (f3 * f10) + (f6 * f11) + f9;
            fArr[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr[i2] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
        }
    }
}
