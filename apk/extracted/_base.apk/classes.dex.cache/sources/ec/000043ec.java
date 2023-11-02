package nc;

/* renamed from: nc.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10570c {

    /* renamed from: a */
    private final C10568a f27588a;

    public C10570c(C10568a c10568a) {
        this.f27588a = c10568a;
    }

    /* renamed from: b */
    private int[] m11202b(C10569b c10569b) {
        int m11208d = c10569b.m11208d();
        int i = 0;
        if (m11208d == 1) {
            return new int[]{c10569b.m11209c(1)};
        }
        int[] iArr = new int[m11208d];
        for (int i2 = 1; i2 < this.f27588a.m11216f() && i < m11208d; i2++) {
            if (c10569b.m11210b(i2) == 0) {
                iArr[i] = this.f27588a.m11214h(i2);
                i++;
            }
        }
        if (i == m11208d) {
            return iArr;
        }
        throw new C10571d("Error locator degree does not match number of roots");
    }

    /* renamed from: c */
    private int[] m11201c(C10569b c10569b, int[] iArr) {
        int i;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int m11214h = this.f27588a.m11214h(iArr[i2]);
            int i3 = 1;
            for (int i4 = 0; i4 < length; i4++) {
                if (i2 != i4) {
                    int m11212j = this.f27588a.m11212j(iArr[i4], m11214h);
                    if ((m11212j & 1) == 0) {
                        i = m11212j | 1;
                    } else {
                        i = m11212j & (-2);
                    }
                    i3 = this.f27588a.m11212j(i3, i);
                }
            }
            iArr2[i2] = this.f27588a.m11212j(c10569b.m11210b(m11214h), this.f27588a.m11214h(i3));
            if (this.f27588a.m11218d() != 0) {
                iArr2[i2] = this.f27588a.m11212j(iArr2[i2], m11214h);
            }
        }
        return iArr2;
    }

    /* renamed from: d */
    private C10569b[] m11200d(C10569b c10569b, C10569b c10569b2, int i) {
        if (c10569b.m11208d() < c10569b2.m11208d()) {
            c10569b2 = c10569b;
            c10569b = c10569b2;
        }
        C10569b m11215g = this.f27588a.m11215g();
        C10569b m11217e = this.f27588a.m11217e();
        do {
            C10569b c10569b3 = c10569b2;
            c10569b2 = c10569b;
            c10569b = c10569b3;
            C10569b c10569b4 = m11217e;
            C10569b c10569b5 = m11215g;
            m11215g = c10569b4;
            if (c10569b.m11208d() >= i / 2) {
                if (!c10569b.m11207e()) {
                    C10569b m11215g2 = this.f27588a.m11215g();
                    int m11214h = this.f27588a.m11214h(c10569b.m11209c(c10569b.m11208d()));
                    while (c10569b2.m11208d() >= c10569b.m11208d() && !c10569b2.m11207e()) {
                        int m11208d = c10569b2.m11208d() - c10569b.m11208d();
                        int m11212j = this.f27588a.m11212j(c10569b2.m11209c(c10569b2.m11208d()), m11214h);
                        m11215g2 = m11215g2.m11211a(this.f27588a.m11220b(m11208d, m11212j));
                        c10569b2 = c10569b2.m11211a(c10569b.m11204h(m11208d, m11212j));
                    }
                    m11217e = m11215g2.m11205g(m11215g).m11211a(c10569b5);
                } else {
                    throw new C10571d("r_{i-1} was zero");
                }
            } else {
                int m11209c = m11215g.m11209c(0);
                if (m11209c != 0) {
                    int m11214h2 = this.f27588a.m11214h(m11209c);
                    return new C10569b[]{m11215g.m11206f(m11214h2), c10569b.m11206f(m11214h2)};
                }
                throw new C10571d("sigmaTilde(0) was zero");
            }
        } while (c10569b2.m11208d() < c10569b.m11208d());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    /* renamed from: a */
    public void m11203a(int[] iArr, int i) {
        C10569b c10569b = new C10569b(this.f27588a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            C10568a c10568a = this.f27588a;
            int m11210b = c10569b.m11210b(c10568a.m11219c(c10568a.m11218d() + i2));
            iArr2[(i - 1) - i2] = m11210b;
            if (m11210b != 0) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        C10569b[] m11200d = m11200d(this.f27588a.m11220b(i, 1), new C10569b(this.f27588a, iArr2), i);
        C10569b c10569b2 = m11200d[0];
        C10569b c10569b3 = m11200d[1];
        int[] m11202b = m11202b(c10569b2);
        int[] m11201c = m11201c(c10569b3, m11202b);
        for (int i3 = 0; i3 < m11202b.length; i3++) {
            int length = (iArr.length - 1) - this.f27588a.m11213i(m11202b[i3]);
            if (length >= 0) {
                iArr[length] = C10568a.m11221a(iArr[length], m11201c[i3]);
            } else {
                throw new C10571d("Bad error location");
            }
        }
    }
}