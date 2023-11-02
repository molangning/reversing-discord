package p464zc;

import p136hc.C7058d;

/* renamed from: zc.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14145a {

    /* renamed from: a */
    private final C14146b f36387a = C14146b.f36388f;

    /* renamed from: b */
    private int[] m586b(C14147c c14147c) {
        int m570d = c14147c.m570d();
        int[] iArr = new int[m570d];
        int i = 0;
        for (int i2 = 1; i2 < this.f36387a.m579e() && i < m570d; i2++) {
            if (c14147c.m572b(i2) == 0) {
                iArr[i] = this.f36387a.m577g(i2);
                i++;
            }
        }
        if (i == m570d) {
            return iArr;
        }
        throw C7058d.m21472a();
    }

    /* renamed from: c */
    private int[] m585c(C14147c c14147c, C14147c c14147c2, int[] iArr) {
        int m570d = c14147c2.m570d();
        int[] iArr2 = new int[m570d];
        for (int i = 1; i <= m570d; i++) {
            iArr2[m570d - i] = this.f36387a.m575i(i, c14147c2.m571c(i));
        }
        C14147c c14147c3 = new C14147c(this.f36387a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int m577g = this.f36387a.m577g(iArr[i2]);
            iArr3[i2] = this.f36387a.m575i(this.f36387a.m574j(0, c14147c.m572b(m577g)), this.f36387a.m577g(c14147c3.m572b(m577g)));
        }
        return iArr3;
    }

    /* renamed from: d */
    private C14147c[] m584d(C14147c c14147c, C14147c c14147c2, int i) {
        if (c14147c.m570d() < c14147c2.m570d()) {
            c14147c2 = c14147c;
            c14147c = c14147c2;
        }
        C14147c m578f = this.f36387a.m578f();
        C14147c m580d = this.f36387a.m580d();
        while (true) {
            C14147c c14147c3 = c14147c2;
            c14147c2 = c14147c;
            c14147c = c14147c3;
            C14147c c14147c4 = m580d;
            C14147c c14147c5 = m578f;
            m578f = c14147c4;
            if (c14147c.m570d() >= i / 2) {
                if (!c14147c.m569e()) {
                    C14147c m578f2 = this.f36387a.m578f();
                    int m577g = this.f36387a.m577g(c14147c.m571c(c14147c.m570d()));
                    while (c14147c2.m570d() >= c14147c.m570d() && !c14147c2.m569e()) {
                        int m570d = c14147c2.m570d() - c14147c.m570d();
                        int m575i = this.f36387a.m575i(c14147c2.m571c(c14147c2.m570d()), m577g);
                        m578f2 = m578f2.m573a(this.f36387a.m582b(m570d, m575i));
                        c14147c2 = c14147c2.m564j(c14147c.m566h(m570d, m575i));
                    }
                    m580d = m578f2.m567g(m578f).m564j(c14147c5).m565i();
                } else {
                    throw C7058d.m21472a();
                }
            } else {
                int m571c = m578f.m571c(0);
                if (m571c != 0) {
                    int m577g2 = this.f36387a.m577g(m571c);
                    return new C14147c[]{m578f.m568f(m577g2), c14147c.m568f(m577g2)};
                }
                throw C7058d.m21472a();
            }
        }
    }

    /* renamed from: a */
    public int m587a(int[] iArr, int i, int[] iArr2) {
        C14147c c14147c = new C14147c(this.f36387a, iArr);
        int[] iArr3 = new int[i];
        boolean z = false;
        for (int i2 = i; i2 > 0; i2--) {
            int m572b = c14147c.m572b(this.f36387a.m581c(i2));
            iArr3[i - i2] = m572b;
            if (m572b != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        C14147c m580d = this.f36387a.m580d();
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                int m581c = this.f36387a.m581c((iArr.length - 1) - i3);
                C14146b c14146b = this.f36387a;
                m580d = m580d.m567g(new C14147c(c14146b, new int[]{c14146b.m574j(0, m581c), 1}));
            }
        }
        C14147c[] m584d = m584d(this.f36387a.m582b(i, 1), new C14147c(this.f36387a, iArr3), i);
        C14147c c14147c2 = m584d[0];
        C14147c c14147c3 = m584d[1];
        int[] m586b = m586b(c14147c2);
        int[] m585c = m585c(c14147c3, c14147c2, m586b);
        for (int i4 = 0; i4 < m586b.length; i4++) {
            int length = (iArr.length - 1) - this.f36387a.m576h(m586b[i4]);
            if (length >= 0) {
                iArr[length] = this.f36387a.m574j(iArr[length], m585c[i4]);
            } else {
                throw C7058d.m21472a();
            }
        }
        return m586b.length;
    }
}
