package p285pc;

import lc.C10120b;
import p136hc.C7060f;

/* renamed from: pc.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C11489a {

    /* renamed from: a */
    private final C10120b f29815a;

    /* renamed from: b */
    private final C10120b f29816b;

    /* renamed from: c */
    private final C11495e f29817c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11489a(C10120b c10120b) {
        int m12249j = c10120b.m12249j();
        if (m12249j >= 8 && m12249j <= 144 && (m12249j & 1) == 0) {
            this.f29817c = m8001j(c10120b);
            C10120b m8010a = m8010a(c10120b);
            this.f29815a = m8010a;
            this.f29816b = new C10120b(m8010a.m12246m(), m8010a.m12249j());
            return;
        }
        throw C7060f.m21471a();
    }

    /* renamed from: a */
    private C10120b m8010a(C10120b c10120b) {
        int m7981f = this.f29817c.m7981f();
        int m7982e = this.f29817c.m7982e();
        if (c10120b.m12249j() == m7981f) {
            int m7984c = this.f29817c.m7984c();
            int m7985b = this.f29817c.m7985b();
            int i = m7981f / m7984c;
            int i2 = m7982e / m7985b;
            C10120b c10120b2 = new C10120b(i2 * m7985b, i * m7984c);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * m7984c;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * m7985b;
                    for (int i7 = 0; i7 < m7984c; i7++) {
                        int i8 = ((m7984c + 2) * i3) + 1 + i7;
                        int i9 = i4 + i7;
                        for (int i10 = 0; i10 < m7985b; i10++) {
                            if (c10120b.m12252e(((m7985b + 2) * i5) + 1 + i10, i8)) {
                                c10120b2.m12244p(i6 + i10, i9);
                            }
                        }
                    }
                }
            }
            return c10120b2;
        }
        throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
    }

    /* renamed from: d */
    private int m8007d(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m8003h(i3, 0, i, i2) ? 1 : 0) << 1;
        if (m8003h(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m8003h(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m8003h(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (m8003h(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (m8003h(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (m8003h(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (m8003h(3, i8, i, i2)) {
            return i11 | 1;
        }
        return i11;
    }

    /* renamed from: e */
    private int m8006e(int i, int i2) {
        int i3 = (m8003h(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (m8003h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m8003h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m8003h(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m8003h(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (m8003h(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (m8003h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (m8003h(1, i9, i, i2)) {
            return i10 | 1;
        }
        return i10;
    }

    /* renamed from: f */
    private int m8005f(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m8003h(i3, 0, i, i2) ? 1 : 0) << 1;
        int i5 = i2 - 1;
        if (m8003h(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (m8003h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (m8003h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (m8003h(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (m8003h(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m8003h(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m8003h(1, i5, i, i2)) {
            return i13 | 1;
        }
        return i13;
    }

    /* renamed from: g */
    private int m8004g(int i, int i2) {
        int i3 = (m8003h(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (m8003h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m8003h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m8003h(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (m8003h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (m8003h(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (m8003h(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (m8003h(3, i7, i, i2)) {
            return i10 | 1;
        }
        return i10;
    }

    /* renamed from: h */
    private boolean m8003h(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f29816b.m12244p(i2, i);
        return this.f29815a.m12252e(i2, i);
    }

    /* renamed from: i */
    private int m8002i(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (m8003h(i5, i6, i3, i4) ? 1 : 0) << 1;
        int i8 = i2 - 1;
        if (m8003h(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (m8003h(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (m8003h(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m8003h(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m8003h(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m8003h(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (m8003h(i, i2, i3, i4)) {
            return i15 | 1;
        }
        return i15;
    }

    /* renamed from: j */
    private static C11495e m8001j(C10120b c10120b) {
        return C11495e.m7979h(c10120b.m12249j(), c10120b.m12246m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C11495e m8009b() {
        return this.f29817c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] m8008c() {
        byte[] bArr = new byte[this.f29817c.m7980g()];
        int m12249j = this.f29815a.m12249j();
        int m12246m = this.f29815a.m12246m();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 4;
        while (true) {
            if (i3 == m12249j && i == 0 && !z) {
                bArr[i2] = (byte) m8007d(m12249j, m12246m);
                i3 -= 2;
                i += 2;
                i2++;
                z = true;
            } else {
                int i4 = m12249j - 2;
                if (i3 == i4 && i == 0 && (m12246m & 3) != 0 && !z2) {
                    bArr[i2] = (byte) m8006e(m12249j, m12246m);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z2 = true;
                } else if (i3 == m12249j + 4 && i == 2 && (m12246m & 7) == 0 && !z3) {
                    bArr[i2] = (byte) m8005f(m12249j, m12246m);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z3 = true;
                } else if (i3 == i4 && i == 0 && (m12246m & 7) == 4 && !z4) {
                    bArr[i2] = (byte) m8004g(m12249j, m12246m);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z4 = true;
                } else {
                    do {
                        if (i3 < m12249j && i >= 0 && !this.f29816b.m12252e(i, i3)) {
                            bArr[i2] = (byte) m8002i(i3, i, m12249j, m12246m);
                            i2++;
                        }
                        i3 -= 2;
                        i += 2;
                        if (i3 < 0) {
                            break;
                        }
                    } while (i < m12246m);
                    int i5 = i3 + 1;
                    int i6 = i + 3;
                    do {
                        if (i5 >= 0 && i6 < m12246m && !this.f29816b.m12252e(i6, i5)) {
                            bArr[i2] = (byte) m8002i(i5, i6, m12249j, m12246m);
                            i2++;
                        }
                        i5 += 2;
                        i6 -= 2;
                        if (i5 >= m12249j) {
                            break;
                        }
                    } while (i6 >= 0);
                    i3 = i5 + 3;
                    i = i6 + 1;
                }
            }
            if (i3 >= m12249j && i >= m12246m) {
                break;
            }
        }
        if (i2 == this.f29817c.m7980g()) {
            return bArr;
        }
        throw C7060f.m21471a();
    }
}
