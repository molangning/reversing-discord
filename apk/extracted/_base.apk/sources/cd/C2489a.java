package cd;

import lc.C10120b;
import p136hc.C7060f;

/* renamed from: cd.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C2489a {

    /* renamed from: a */
    private final C10120b f6845a;

    /* renamed from: b */
    private C2507j f6846b;

    /* renamed from: c */
    private C2504g f6847c;

    /* renamed from: d */
    private boolean f6848d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2489a(C10120b c10120b) {
        int m12249j = c10120b.m12249j();
        if (m12249j >= 21 && (m12249j & 3) == 1) {
            this.f6845a = c10120b;
            return;
        }
        throw C7060f.m21471a();
    }

    /* renamed from: a */
    private int m33142a(int i, int i2, int i3) {
        return this.f6848d ? this.f6845a.m12252e(i2, i) : this.f6845a.m12252e(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m33141b() {
        int i = 0;
        while (i < this.f6845a.m12246m()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f6845a.m12249j(); i3++) {
                if (this.f6845a.m12252e(i, i3) != this.f6845a.m12252e(i3, i)) {
                    this.f6845a.m12253d(i3, i);
                    this.f6845a.m12253d(i, i3);
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] m33140c() {
        int i;
        C2504g m33139d = m33139d();
        C2507j m33138e = m33138e();
        EnumC2491c enumC2491c = EnumC2491c.values()[m33139d.m33116c()];
        int m12249j = this.f6845a.m12249j();
        enumC2491c.m33132b(this.f6845a, m12249j);
        C10120b m33110a = m33138e.m33110a();
        byte[] bArr = new byte[m33138e.m33103h()];
        int i2 = m12249j - 1;
        boolean z = true;
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 > 0) {
            if (i3 == 6) {
                i3--;
            }
            for (int i7 = 0; i7 < m12249j; i7++) {
                if (z) {
                    i = i2 - i7;
                } else {
                    i = i7;
                }
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i3 - i8;
                    if (!m33110a.m12252e(i9, i)) {
                        i5++;
                        i6 <<= 1;
                        if (this.f6845a.m12252e(i9, i)) {
                            i6 |= 1;
                        }
                        if (i5 == 8) {
                            bArr[i4] = (byte) i6;
                            i4++;
                            i5 = 0;
                            i6 = 0;
                        }
                    }
                }
            }
            z = !z;
            i3 -= 2;
        }
        if (i4 == m33138e.m33103h()) {
            return bArr;
        }
        throw C7060f.m21471a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C2504g m33139d() {
        C2504g c2504g = this.f6847c;
        if (c2504g != null) {
            return c2504g;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = m33142a(i3, 8, i2);
        }
        int m33142a = m33142a(8, 7, m33142a(8, 8, m33142a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            m33142a = m33142a(8, i4, m33142a);
        }
        int m12249j = this.f6845a.m12249j();
        int i5 = m12249j - 7;
        for (int i6 = m12249j - 1; i6 >= i5; i6--) {
            i = m33142a(8, i6, i);
        }
        for (int i7 = m12249j - 8; i7 < m12249j; i7++) {
            i = m33142a(i7, 8, i);
        }
        C2504g m33118a = C2504g.m33118a(m33142a, i);
        this.f6847c = m33118a;
        if (m33118a != null) {
            return m33118a;
        }
        throw C7060f.m21471a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C2507j m33138e() {
        C2507j c2507j = this.f6846b;
        if (c2507j != null) {
            return c2507j;
        }
        int m12249j = this.f6845a.m12249j();
        int i = (m12249j - 17) / 4;
        if (i <= 6) {
            return C2507j.m33102i(i);
        }
        int i2 = m12249j - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = m12249j - 9; i6 >= i2; i6--) {
                i4 = m33142a(i6, i5, i4);
            }
        }
        C2507j m33108c = C2507j.m33108c(i4);
        if (m33108c != null && m33108c.m33106e() == m12249j) {
            this.f6846b = m33108c;
            return m33108c;
        }
        for (int i7 = 5; i7 >= 0; i7--) {
            for (int i8 = m12249j - 9; i8 >= i2; i8--) {
                i3 = m33142a(i7, i8, i3);
            }
        }
        C2507j m33108c2 = C2507j.m33108c(i3);
        if (m33108c2 != null && m33108c2.m33106e() == m12249j) {
            this.f6846b = m33108c2;
            return m33108c2;
        }
        throw C7060f.m21471a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m33137f() {
        if (this.f6847c == null) {
            return;
        }
        EnumC2491c.values()[this.f6847c.m33116c()].m33132b(this.f6845a, this.f6845a.m12249j());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m33136g(boolean z) {
        this.f6846b = null;
        this.f6847c = null;
        this.f6848d = z;
    }
}
