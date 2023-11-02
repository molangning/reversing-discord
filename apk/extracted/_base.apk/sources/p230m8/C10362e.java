package p230m8;

import java.util.ArrayList;
import java.util.zip.Inflater;
import p195k8.C9191p0;
import p195k8.C9207x;
import p195k8.C9208y;
import p230m8.C10359d;

/* renamed from: m8.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10362e {
    /* renamed from: a */
    public static C10359d m11664a(byte[] bArr, int i) {
        ArrayList<C10359d.C10360a> arrayList;
        C9208y c9208y = new C9208y(bArr);
        try {
            if (m11662c(c9208y)) {
                arrayList = m11659f(c9208y);
            } else {
                arrayList = m11660e(c9208y);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size != 1) {
            if (size != 2) {
                return null;
            }
            return new C10359d(arrayList.get(0), arrayList.get(1), i);
        }
        return new C10359d(arrayList.get(0), i);
    }

    /* renamed from: b */
    private static int m11663b(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    /* renamed from: c */
    private static boolean m11662c(C9208y c9208y) {
        c9208y.m16098Q(4);
        int m16084n = c9208y.m16084n();
        c9208y.m16099P(0);
        if (m16084n != 1886547818) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static C10359d.C10360a m11661d(C9208y c9208y) {
        int m16084n = c9208y.m16084n();
        if (m16084n > 10000) {
            return null;
        }
        float[] fArr = new float[m16084n];
        for (int i = 0; i < m16084n; i++) {
            fArr[i] = c9208y.m16085m();
        }
        int m16084n2 = c9208y.m16084n();
        if (m16084n2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(m16084n * 2.0d) / log);
        C9207x c9207x = new C9207x(c9208y.m16094d());
        int i2 = 8;
        c9207x.m16118p(c9208y.m16093e() * 8);
        float[] fArr2 = new float[m16084n2 * 5];
        int i3 = 5;
        int[] iArr = new int[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < m16084n2) {
            int i6 = 0;
            while (i6 < i3) {
                int m11663b = iArr[i6] + m11663b(c9207x.m16126h(ceil));
                if (m11663b >= m16084n || m11663b < 0) {
                    return null;
                }
                fArr2[i5] = fArr[m11663b];
                iArr[i6] = m11663b;
                i6++;
                i5++;
                i3 = 5;
            }
            i4++;
            i3 = 5;
        }
        c9207x.m16118p((c9207x.m16129e() + 7) & (-8));
        int i7 = 32;
        int m16126h = c9207x.m16126h(32);
        C10359d.C10361b[] c10361bArr = new C10359d.C10361b[m16126h];
        int i8 = 0;
        while (i8 < m16126h) {
            int m16126h2 = c9207x.m16126h(i2);
            int m16126h3 = c9207x.m16126h(i2);
            int m16126h4 = c9207x.m16126h(i7);
            if (m16126h4 > 128000) {
                return null;
            }
            int ceil2 = (int) Math.ceil(Math.log(m16084n2 * d) / log);
            float[] fArr3 = new float[m16126h4 * 3];
            float[] fArr4 = new float[m16126h4 * 2];
            int i9 = 0;
            for (int i10 = 0; i10 < m16126h4; i10++) {
                i9 += m11663b(c9207x.m16126h(ceil2));
                if (i9 < 0 || i9 >= m16084n2) {
                    return null;
                }
                int i11 = i10 * 3;
                int i12 = i9 * 5;
                fArr3[i11] = fArr2[i12];
                fArr3[i11 + 1] = fArr2[i12 + 1];
                fArr3[i11 + 2] = fArr2[i12 + 2];
                int i13 = i10 * 2;
                fArr4[i13] = fArr2[i12 + 3];
                fArr4[i13 + 1] = fArr2[i12 + 4];
            }
            c10361bArr[i8] = new C10359d.C10361b(m16126h2, fArr3, fArr4, m16126h3);
            i8++;
            i7 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new C10359d.C10360a(c10361bArr);
    }

    /* renamed from: e */
    private static ArrayList<C10359d.C10360a> m11660e(C9208y c9208y) {
        if (c9208y.m16111D() != 0) {
            return null;
        }
        c9208y.m16098Q(7);
        int m16084n = c9208y.m16084n();
        if (m16084n == 1684433976) {
            C9208y c9208y2 = new C9208y();
            Inflater inflater = new Inflater(true);
            try {
                if (!C9191p0.m16234n0(c9208y, c9208y2, inflater)) {
                    return null;
                }
                inflater.end();
                c9208y = c9208y2;
            } finally {
                inflater.end();
            }
        } else if (m16084n != 1918990112) {
            return null;
        }
        return m11658g(c9208y);
    }

    /* renamed from: f */
    private static ArrayList<C10359d.C10360a> m11659f(C9208y c9208y) {
        int m16084n;
        c9208y.m16098Q(8);
        int m16093e = c9208y.m16093e();
        int m16092f = c9208y.m16092f();
        while (m16093e < m16092f && (m16084n = c9208y.m16084n() + m16093e) > m16093e && m16084n <= m16092f) {
            int m16084n2 = c9208y.m16084n();
            if (m16084n2 != 2037673328 && m16084n2 != 1836279920) {
                c9208y.m16099P(m16084n);
                m16093e = m16084n;
            } else {
                c9208y.m16100O(m16084n);
                return m11660e(c9208y);
            }
        }
        return null;
    }

    /* renamed from: g */
    private static ArrayList<C10359d.C10360a> m11658g(C9208y c9208y) {
        ArrayList<C10359d.C10360a> arrayList = new ArrayList<>();
        int m16093e = c9208y.m16093e();
        int m16092f = c9208y.m16092f();
        while (m16093e < m16092f) {
            int m16084n = c9208y.m16084n() + m16093e;
            if (m16084n <= m16093e || m16084n > m16092f) {
                return null;
            }
            if (c9208y.m16084n() == 1835365224) {
                C10359d.C10360a m11661d = m11661d(c9208y);
                if (m11661d == null) {
                    return null;
                }
                arrayList.add(m11661d);
            }
            c9208y.m16099P(m16084n);
            m16093e = m16084n;
        }
        return arrayList;
    }
}
