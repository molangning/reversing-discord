package p445yc;

import java.lang.reflect.Array;
import mc.C10434a;
import p424xc.C13777a;

/* renamed from: yc.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13982i {

    /* renamed from: a */
    private static final float[][] f35984a = (float[][]) Array.newInstance(Float.TYPE, C13777a.f35516b.length, 8);

    static {
        int i;
        int i2 = 0;
        while (true) {
            int[] iArr = C13777a.f35516b;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                int i4 = i3 & 1;
                int i5 = 0;
                while (i5 < 8) {
                    float f = 0.0f;
                    while (true) {
                        i = i3 & 1;
                        if (i == i4) {
                            f += 1.0f;
                            i3 >>= 1;
                        }
                    }
                    f35984a[i2][(8 - i5) - 1] = f / 17.0f;
                    i5++;
                    i4 = i;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static int m987a(int[] iArr) {
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j2 = j << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j = j2 | i3;
            }
        }
        return (int) j;
    }

    /* renamed from: b */
    private static int m986b(int[] iArr) {
        int m11568d = C10434a.m11568d(iArr);
        float[] fArr = new float[8];
        if (m11568d > 1) {
            for (int i = 0; i < 8; i++) {
                fArr[i] = iArr[i] / m11568d;
            }
        }
        float f = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = f35984a;
            if (i3 < fArr2.length) {
                float[] fArr3 = fArr2[i3];
                float f2 = 0.0f;
                for (int i4 = 0; i4 < 8; i4++) {
                    float f3 = fArr3[i4] - fArr[i4];
                    f2 += f3 * f3;
                    if (f2 >= f) {
                        break;
                    }
                }
                if (f2 < f) {
                    i2 = C13777a.f35516b[i3];
                    f = f2;
                }
                i3++;
            } else {
                return i2;
            }
        }
    }

    /* renamed from: c */
    private static int m985c(int[] iArr) {
        int m987a = m987a(iArr);
        if (C13777a.m1569a(m987a) == -1) {
            return -1;
        }
        return m987a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m984d(int[] iArr) {
        int m985c = m985c(m983e(iArr));
        if (m985c != -1) {
            return m985c;
        }
        return m986b(iArr);
    }

    /* renamed from: e */
    private static int[] m983e(int[] iArr) {
        float m11568d = C10434a.m11568d(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            float f = (m11568d / 34.0f) + ((i3 * m11568d) / 17.0f);
            int i4 = iArr[i2];
            if (i + i4 <= f) {
                i += i4;
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }
}
