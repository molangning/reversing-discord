package androidx.core.content.res;

/* renamed from: androidx.core.content.res.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class C0993m {

    /* renamed from: k */
    static final C0993m f3328k = m38194k(C0968b.f3294c, (float) ((C0968b.m38294h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    private final float f3329a;

    /* renamed from: b */
    private final float f3330b;

    /* renamed from: c */
    private final float f3331c;

    /* renamed from: d */
    private final float f3332d;

    /* renamed from: e */
    private final float f3333e;

    /* renamed from: f */
    private final float f3334f;

    /* renamed from: g */
    private final float[] f3335g;

    /* renamed from: h */
    private final float f3336h;

    /* renamed from: i */
    private final float f3337i;

    /* renamed from: j */
    private final float f3338j;

    private C0993m(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f3334f = f;
        this.f3329a = f2;
        this.f3330b = f3;
        this.f3331c = f4;
        this.f3332d = f5;
        this.f3333e = f6;
        this.f3335g = fArr;
        this.f3336h = f7;
        this.f3337i = f8;
        this.f3338j = f9;
    }

    /* renamed from: k */
    static C0993m m38194k(float[] fArr, float f, float f2, float f3, boolean z) {
        float m38298d;
        float exp;
        float[][] fArr2 = C0968b.f3292a;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = (fArr3[0] * f4) + (fArr3[1] * f5) + (fArr3[2] * f6);
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[0] * f4) + (fArr4[1] * f5) + (fArr4[2] * f6);
        float[] fArr5 = fArr2[2];
        float f9 = (f4 * fArr5[0]) + (f5 * fArr5[1]) + (f6 * fArr5[2]);
        float f10 = (f3 / 10.0f) + 0.8f;
        if (f10 >= 0.9d) {
            m38298d = C0968b.m38298d(0.59f, 0.69f, (f10 - 0.9f) * 10.0f);
        } else {
            m38298d = C0968b.m38298d(0.525f, 0.59f, (f10 - 0.8f) * 10.0f);
        }
        float f11 = m38298d;
        if (z) {
            exp = 1.0f;
        } else {
            exp = (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f10;
        }
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp};
        float f12 = 1.0f / ((5.0f * f) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float cbrt = (f13 * f) + (0.1f * f14 * f14 * ((float) Math.cbrt(f * 5.0d)));
        float m38294h = C0968b.m38294h(f2) / fArr[1];
        double d2 = m38294h;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f9) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f8) / 100.0d, 0.42d), pow2};
        float f15 = fArr7[0];
        float f16 = fArr7[1];
        return new C0993m(m38294h, ((((f15 * 400.0f) / (f15 + 27.13f)) * 2.0f) + ((f16 * 400.0f) / (f16 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, f11, f10, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public float m38204a() {
        return this.f3329a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float m38203b() {
        return this.f3332d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m38202c() {
        return this.f3336h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m38201d() {
        return this.f3337i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m38200e() {
        return this.f3334f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public float m38199f() {
        return this.f3330b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public float m38198g() {
        return this.f3333e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public float m38197h() {
        return this.f3331c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float[] m38196i() {
        return this.f3335g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m38195j() {
        return this.f3338j;
    }
}
