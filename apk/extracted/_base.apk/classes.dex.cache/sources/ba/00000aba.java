package cd;

import cd.C2507j;

/* renamed from: cd.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C2490b {

    /* renamed from: a */
    private final int f6849a;

    /* renamed from: b */
    private final byte[] f6850b;

    private C2490b(int i, byte[] bArr) {
        this.f6849a = i;
        this.f6850b = bArr;
    }

    /* renamed from: b */
    public static C2490b[] m33134b(byte[] bArr, C2507j c2507j, EnumC2503f enumC2503f) {
        int i;
        if (bArr.length == c2507j.m33103h()) {
            C2507j.C2509b m33105f = c2507j.m33105f(enumC2503f);
            C2507j.C2508a[] m33098a = m33105f.m33098a();
            int i2 = 0;
            for (C2507j.C2508a c2508a : m33098a) {
                i2 += c2508a.m33100a();
            }
            C2490b[] c2490bArr = new C2490b[i2];
            int i3 = 0;
            for (C2507j.C2508a c2508a2 : m33098a) {
                int i4 = 0;
                while (i4 < c2508a2.m33100a()) {
                    int m33099b = c2508a2.m33099b();
                    c2490bArr[i3] = new C2490b(m33099b, new byte[m33105f.m33097b() + m33099b]);
                    i4++;
                    i3++;
                }
            }
            int length = c2490bArr[0].f6850b.length;
            int i5 = i2 - 1;
            while (i5 >= 0 && c2490bArr[i5].f6850b.length != length) {
                i5--;
            }
            int i6 = i5 + 1;
            int m33097b = length - m33105f.m33097b();
            int i7 = 0;
            for (int i8 = 0; i8 < m33097b; i8++) {
                int i9 = 0;
                while (i9 < i3) {
                    c2490bArr[i9].f6850b[i8] = bArr[i7];
                    i9++;
                    i7++;
                }
            }
            int i10 = i6;
            while (i10 < i3) {
                c2490bArr[i10].f6850b[m33097b] = bArr[i7];
                i10++;
                i7++;
            }
            int length2 = c2490bArr[0].f6850b.length;
            while (m33097b < length2) {
                int i11 = 0;
                while (i11 < i3) {
                    if (i11 < i6) {
                        i = m33097b;
                    } else {
                        i = m33097b + 1;
                    }
                    c2490bArr[i11].f6850b[i] = bArr[i7];
                    i11++;
                    i7++;
                }
                m33097b++;
            }
            return c2490bArr;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public byte[] m33135a() {
        return this.f6850b;
    }

    /* renamed from: c */
    public int m33133c() {
        return this.f6849a;
    }
}