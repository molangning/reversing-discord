package p230m8;

import p195k8.C9149a;

/* renamed from: m8.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10359d {

    /* renamed from: a */
    public final C10360a f27100a;

    /* renamed from: b */
    public final C10360a f27101b;

    /* renamed from: c */
    public final int f27102c;

    /* renamed from: d */
    public final boolean f27103d;

    /* renamed from: m8.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10360a {

        /* renamed from: a */
        private final C10361b[] f27104a;

        public C10360a(C10361b... c10361bArr) {
            this.f27104a = c10361bArr;
        }

        /* renamed from: a */
        public C10361b m11667a(int i) {
            return this.f27104a[i];
        }

        /* renamed from: b */
        public int m11666b() {
            return this.f27104a.length;
        }
    }

    /* renamed from: m8.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10361b {

        /* renamed from: a */
        public final int f27105a;

        /* renamed from: b */
        public final int f27106b;

        /* renamed from: c */
        public final float[] f27107c;

        /* renamed from: d */
        public final float[] f27108d;

        public C10361b(int i, float[] fArr, float[] fArr2, int i2) {
            boolean z;
            this.f27105a = i;
            if (fArr.length * 2 == fArr2.length * 3) {
                z = true;
            } else {
                z = false;
            }
            C9149a.m16452a(z);
            this.f27107c = fArr;
            this.f27108d = fArr2;
            this.f27106b = i2;
        }

        /* renamed from: a */
        public int m11665a() {
            return this.f27107c.length / 3;
        }
    }

    public C10359d(C10360a c10360a, int i) {
        this(c10360a, c10360a, i);
    }

    /* renamed from: a */
    public static C10359d m11669a(float f, int i, int i2, float f2, float f3, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        float f4;
        int i5;
        int i6;
        int i7;
        float[] fArr;
        int i8;
        int i9 = i;
        int i10 = i2;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        if (i9 >= 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9149a.m16452a(z2);
        if (i10 >= 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        C9149a.m16452a(z3);
        if (f2 > 0.0f && f2 <= 180.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        C9149a.m16452a(z4);
        if (f3 > 0.0f && f3 <= 360.0f) {
            z5 = true;
        } else {
            z5 = false;
        }
        C9149a.m16452a(z5);
        float radians = (float) Math.toRadians(f2);
        float radians2 = (float) Math.toRadians(f3);
        float f5 = radians / i9;
        float f6 = radians2 / i10;
        int i11 = i10 + 1;
        int i12 = ((i11 * 2) + 2) * i9;
        float[] fArr2 = new float[i12 * 3];
        float[] fArr3 = new float[i12 * 2];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i9) {
            float f7 = radians / 2.0f;
            float f8 = (i13 * f5) - f7;
            int i16 = i13 + 1;
            float f9 = (i16 * f5) - f7;
            int i17 = 0;
            while (i17 < i11) {
                float f10 = f8;
                int i18 = i16;
                int i19 = 0;
                int i20 = 2;
                while (i19 < i20) {
                    if (i19 == 0) {
                        f4 = f10;
                        i4 = i11;
                    } else {
                        i4 = i11;
                        f4 = f9;
                    }
                    float f11 = i17 * f6;
                    float f12 = f6;
                    int i21 = i14 + 1;
                    int i22 = i17;
                    double d = f;
                    float f13 = f5;
                    double d2 = (f11 + 3.1415927f) - (radians2 / 2.0f);
                    int i23 = i19;
                    double d3 = f4;
                    float[] fArr4 = fArr3;
                    float f14 = f9;
                    fArr2[i14] = -((float) (Math.sin(d2) * d * Math.cos(d3)));
                    int i24 = i21 + 1;
                    int i25 = i13;
                    fArr2[i21] = (float) (d * Math.sin(d3));
                    int i26 = i24 + 1;
                    fArr2[i24] = (float) (d * Math.cos(d2) * Math.cos(d3));
                    int i27 = i15 + 1;
                    fArr4[i15] = f11 / radians2;
                    int i28 = i27 + 1;
                    fArr4[i27] = ((i25 + i23) * f13) / radians;
                    if (i22 == 0 && i23 == 0) {
                        i5 = i2;
                        i6 = i22;
                        i7 = i23;
                    } else {
                        i5 = i2;
                        i6 = i22;
                        i7 = i23;
                        if (i6 != i5 || i7 != 1) {
                            fArr = fArr4;
                            i8 = 2;
                            i15 = i28;
                            i14 = i26;
                            i19 = i7 + 1;
                            i10 = i5;
                            i17 = i6;
                            fArr3 = fArr;
                            i20 = i8;
                            i13 = i25;
                            i11 = i4;
                            f6 = f12;
                            f5 = f13;
                            f9 = f14;
                        }
                    }
                    System.arraycopy(fArr2, i26 - 3, fArr2, i26, 3);
                    i26 += 3;
                    fArr = fArr4;
                    i8 = 2;
                    System.arraycopy(fArr, i28 - 2, fArr, i28, 2);
                    i28 += 2;
                    i15 = i28;
                    i14 = i26;
                    i19 = i7 + 1;
                    i10 = i5;
                    i17 = i6;
                    fArr3 = fArr;
                    i20 = i8;
                    i13 = i25;
                    i11 = i4;
                    f6 = f12;
                    f5 = f13;
                    f9 = f14;
                }
                float f15 = f5;
                int i29 = i17;
                int i30 = i10;
                int i31 = i29 + 1;
                f8 = f10;
                i16 = i18;
                i11 = i11;
                f5 = f15;
                f9 = f9;
                i10 = i30;
                i17 = i31;
            }
            i9 = i;
            i13 = i16;
        }
        return new C10359d(new C10360a(new C10361b(0, fArr2, fArr3, 1)), i3);
    }

    /* renamed from: b */
    public static C10359d m11668b(int i) {
        return m11669a(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public C10359d(C10360a c10360a, C10360a c10360a2, int i) {
        this.f27100a = c10360a;
        this.f27101b = c10360a2;
        this.f27102c = i;
        this.f27103d = c10360a == c10360a2;
    }
}