package lc;

import java.lang.reflect.Array;
import p136hc.AbstractC7056b;
import p136hc.AbstractC7062h;

/* renamed from: lc.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10128j extends C10126h {

    /* renamed from: e */
    private C10120b f26418e;

    public C10128j(AbstractC7062h abstractC7062h) {
        super(abstractC7062h);
    }

    /* renamed from: i */
    private static int[][] m12211i(byte[] bArr, int i, int i2, int i3, int i4) {
        char c;
        int i5 = 8;
        int i6 = i4 - 8;
        int i7 = i3 - 8;
        char c2 = 2;
        boolean z = true;
        int i8 = 0;
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, i2, i);
        int i9 = 0;
        while (i9 < i2) {
            int i10 = i9 << 3;
            if (i10 > i6) {
                i10 = i6;
            }
            int i11 = i8;
            while (i11 < i) {
                int i12 = i11 << 3;
                if (i12 > i7) {
                    i12 = i7;
                }
                int i13 = (i10 * i3) + i12;
                int i14 = i8;
                int i15 = i14;
                int i16 = i15;
                int i17 = 255;
                while (i14 < i5) {
                    int i18 = i16;
                    int i19 = 0;
                    while (i19 < i5) {
                        int i20 = bArr[i13 + i19] & 255;
                        i15 += i20;
                        if (i20 < i17) {
                            i17 = i20;
                        }
                        if (i20 > i18) {
                            i18 = i20;
                        }
                        i19++;
                        i5 = 8;
                    }
                    if (i18 - i17 <= 24) {
                        i14++;
                        i13 += i3;
                        i16 = i18;
                        z = true;
                        i5 = 8;
                    }
                    while (true) {
                        i14++;
                        i13 += i3;
                        if (i14 < 8) {
                            int i21 = 0;
                            for (int i22 = 8; i21 < i22; i22 = 8) {
                                i15 += bArr[i13 + i21] & 255;
                                i21++;
                            }
                        }
                    }
                    i14++;
                    i13 += i3;
                    i16 = i18;
                    z = true;
                    i5 = 8;
                }
                boolean z2 = z;
                int i23 = i15 >> 6;
                if (i16 - i17 <= 24) {
                    i23 = i17 / 2;
                    if (i9 > 0 && i11 > 0) {
                        int[] iArr2 = iArr[i9 - 1];
                        int i24 = i11 - 1;
                        c = 2;
                        int i25 = ((iArr2[i11] + (iArr[i9][i24] * 2)) + iArr2[i24]) / 4;
                        if (i17 < i25) {
                            i23 = i25;
                        }
                        iArr[i9][i11] = i23;
                        i11++;
                        z = z2;
                        c2 = c;
                        i5 = 8;
                        i8 = 0;
                    }
                }
                c = 2;
                iArr[i9][i11] = i23;
                i11++;
                z = z2;
                c2 = c;
                i5 = 8;
                i8 = 0;
            }
            i9++;
            i5 = 8;
            i8 = 0;
        }
        return iArr;
    }

    /* renamed from: j */
    private static void m12210j(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, C10120b c10120b) {
        int i5;
        int i6;
        int i7 = i4 - 8;
        int i8 = i3 - 8;
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = i9 << 3;
            if (i10 > i7) {
                i5 = i7;
            } else {
                i5 = i10;
            }
            int m12209k = m12209k(i9, 2, i2 - 3);
            for (int i11 = 0; i11 < i; i11++) {
                int i12 = i11 << 3;
                if (i12 > i8) {
                    i6 = i8;
                } else {
                    i6 = i12;
                }
                int m12209k2 = m12209k(i11, 2, i - 3);
                int i13 = 0;
                for (int i14 = -2; i14 <= 2; i14++) {
                    int[] iArr2 = iArr[m12209k + i14];
                    i13 += iArr2[m12209k2 - 2] + iArr2[m12209k2 - 1] + iArr2[m12209k2] + iArr2[m12209k2 + 1] + iArr2[m12209k2 + 2];
                }
                m12208l(bArr, i6, i5, i13 / 25, i3, c10120b);
            }
        }
    }

    /* renamed from: k */
    private static int m12209k(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: l */
    private static void m12208l(byte[] bArr, int i, int i2, int i3, int i4, C10120b c10120b) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    c10120b.m12244p(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    @Override // p136hc.AbstractC7056b
    /* renamed from: a */
    public AbstractC7056b mo12213a(AbstractC7062h abstractC7062h) {
        return new C10128j(abstractC7062h);
    }

    @Override // lc.C10126h, p136hc.AbstractC7056b
    /* renamed from: b */
    public C10120b mo12212b() {
        C10120b c10120b = this.f26418e;
        if (c10120b != null) {
            return c10120b;
        }
        AbstractC7062h m21480e = m21480e();
        int m21468d = m21480e.m21468d();
        int m21469a = m21480e.m21469a();
        if (m21468d >= 40 && m21469a >= 40) {
            byte[] mo21460b = m21480e.mo21460b();
            int i = m21468d >> 3;
            if ((m21468d & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = m21469a >> 3;
            if ((m21469a & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] m12211i = m12211i(mo21460b, i2, i4, m21468d, m21469a);
            C10120b c10120b2 = new C10120b(m21468d, m21469a);
            m12210j(mo21460b, i2, i4, m21468d, m21469a, m12211i, c10120b2);
            this.f26418e = c10120b2;
        } else {
            this.f26418e = super.mo12212b();
        }
        return this.f26418e;
    }
}