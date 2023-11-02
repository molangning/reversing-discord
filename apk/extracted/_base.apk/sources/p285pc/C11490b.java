package p285pc;

import p285pc.C11495e;

/* renamed from: pc.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C11490b {

    /* renamed from: a */
    private final int f29818a;

    /* renamed from: b */
    private final byte[] f29819b;

    private C11490b(int i, byte[] bArr) {
        this.f29818a = i;
        this.f29819b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C11490b[] m7999b(byte[] bArr, C11495e c11495e) {
        boolean z;
        int i;
        int i2;
        C11495e.C11498c m7983d = c11495e.m7983d();
        C11495e.C11497b[] m7975a = m7983d.m7975a();
        int i3 = 0;
        for (C11495e.C11497b c11497b : m7975a) {
            i3 += c11497b.m7977a();
        }
        C11490b[] c11490bArr = new C11490b[i3];
        int i4 = 0;
        for (C11495e.C11497b c11497b2 : m7975a) {
            int i5 = 0;
            while (i5 < c11497b2.m7977a()) {
                int m7976b = c11497b2.m7976b();
                c11490bArr[i4] = new C11490b(m7976b, new byte[m7983d.m7974b() + m7976b]);
                i5++;
                i4++;
            }
        }
        int length = c11490bArr[0].f29819b.length - m7983d.m7974b();
        int i6 = length - 1;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = 0;
            while (i9 < i4) {
                c11490bArr[i9].f29819b[i8] = bArr[i7];
                i9++;
                i7++;
            }
        }
        if (c11495e.m7978i() == 24) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        } else {
            i = i4;
        }
        int i10 = 0;
        while (i10 < i) {
            c11490bArr[i10].f29819b[i6] = bArr[i7];
            i10++;
            i7++;
        }
        int length2 = c11490bArr[0].f29819b.length;
        while (length < length2) {
            int i11 = 0;
            while (i11 < i4) {
                if (z) {
                    i2 = (i11 + 8) % i4;
                } else {
                    i2 = i11;
                }
                c11490bArr[i2].f29819b[(z && i2 > 7) ? length - 1 : length] = bArr[i7];
                i11++;
                i7++;
            }
            length++;
        }
        if (i7 == bArr.length) {
            return c11490bArr;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] m8000a() {
        return this.f29819b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m7998c() {
        return this.f29818a;
    }
}
