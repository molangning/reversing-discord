package p289q;

import java.util.ArrayList;
import java.util.Iterator;
import p289q.C11657d;
import p289q.C11665h;

/* renamed from: q.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C11654b implements C11657d.InterfaceC11658a {

    /* renamed from: e */
    public InterfaceC11655a f30353e;

    /* renamed from: a */
    C11665h f30349a = null;

    /* renamed from: b */
    float f30350b = 0.0f;

    /* renamed from: c */
    boolean f30351c = false;

    /* renamed from: d */
    ArrayList<C11665h> f30352d = new ArrayList<>();

    /* renamed from: f */
    boolean f30354f = false;

    /* renamed from: q.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC11655a {
        /* renamed from: a */
        void mo7269a(C11665h c11665h, float f);

        /* renamed from: b */
        C11665h mo7268b(int i);

        /* renamed from: c */
        void mo7267c();

        void clear();

        /* renamed from: d */
        float mo7266d(C11665h c11665h);

        /* renamed from: e */
        float mo7265e(C11654b c11654b, boolean z);

        /* renamed from: f */
        int mo7264f();

        /* renamed from: g */
        float mo7263g(C11665h c11665h, boolean z);

        /* renamed from: h */
        boolean mo7262h(C11665h c11665h);

        /* renamed from: i */
        float mo7261i(int i);

        /* renamed from: j */
        void mo7260j(C11665h c11665h, float f, boolean z);

        /* renamed from: k */
        void mo7259k(float f);
    }

    public C11654b() {
    }

    /* renamed from: v */
    private boolean m7326v(C11665h c11665h, C11657d c11657d) {
        return c11665h.f30406m <= 1;
    }

    /* renamed from: x */
    private C11665h m7324x(boolean[] zArr, C11665h c11665h) {
        C11665h.EnumC11666a enumC11666a;
        int mo7264f = this.f30353e.mo7264f();
        C11665h c11665h2 = null;
        float f = 0.0f;
        for (int i = 0; i < mo7264f; i++) {
            float mo7261i = this.f30353e.mo7261i(i);
            if (mo7261i < 0.0f) {
                C11665h mo7268b = this.f30353e.mo7268b(i);
                if ((zArr == null || !zArr[mo7268b.f30396c]) && mo7268b != c11665h && (((enumC11666a = mo7268b.f30403j) == C11665h.EnumC11666a.SLACK || enumC11666a == C11665h.EnumC11666a.ERROR) && mo7261i < f)) {
                    f = mo7261i;
                    c11665h2 = mo7268b;
                }
            }
        }
        return c11665h2;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String m7347A() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p289q.C11654b.m7347A():java.lang.String");
    }

    /* renamed from: B */
    public void m7346B(C11657d c11657d, C11665h c11665h, boolean z) {
        if (!c11665h.f30400g) {
            return;
        }
        this.f30350b += c11665h.f30399f * this.f30353e.mo7266d(c11665h);
        this.f30353e.mo7263g(c11665h, z);
        if (z) {
            c11665h.m7274c(this);
        }
    }

    /* renamed from: C */
    public void mo7288C(C11654b c11654b, boolean z) {
        this.f30350b += c11654b.f30350b * this.f30353e.mo7265e(c11654b, z);
        if (z) {
            c11654b.f30349a.m7274c(this);
        }
    }

    /* renamed from: D */
    public void m7345D(C11657d c11657d) {
        if (c11657d.f30369f.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int mo7264f = this.f30353e.mo7264f();
            for (int i = 0; i < mo7264f; i++) {
                C11665h mo7268b = this.f30353e.mo7268b(i);
                if (mo7268b.f30397d != -1 || mo7268b.f30400g) {
                    this.f30352d.add(mo7268b);
                }
            }
            if (this.f30352d.size() > 0) {
                Iterator<C11665h> it = this.f30352d.iterator();
                while (it.hasNext()) {
                    C11665h next = it.next();
                    if (next.f30400g) {
                        m7346B(c11657d, next, true);
                    } else {
                        mo7288C(c11657d.f30369f[next.f30397d], true);
                    }
                }
                this.f30352d.clear();
            } else {
                z = true;
            }
        }
    }

    @Override // p289q.C11657d.InterfaceC11658a
    /* renamed from: a */
    public void mo7290a(C11657d.InterfaceC11658a interfaceC11658a) {
        if (interfaceC11658a instanceof C11654b) {
            C11654b c11654b = (C11654b) interfaceC11658a;
            this.f30349a = null;
            this.f30353e.clear();
            for (int i = 0; i < c11654b.f30353e.mo7264f(); i++) {
                this.f30353e.mo7260j(c11654b.f30353e.mo7268b(i), c11654b.f30353e.mo7261i(i), true);
            }
        }
    }

    @Override // p289q.C11657d.InterfaceC11658a
    /* renamed from: b */
    public void mo7284b(C11665h c11665h) {
        int i = c11665h.f30398e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f30353e.mo7269a(c11665h, f);
    }

    @Override // p289q.C11657d.InterfaceC11658a
    /* renamed from: c */
    public C11665h mo7283c(C11657d c11657d, boolean[] zArr) {
        return m7324x(zArr, null);
    }

    @Override // p289q.C11657d.InterfaceC11658a
    public void clear() {
        this.f30353e.clear();
        this.f30349a = null;
        this.f30350b = 0.0f;
    }

    /* renamed from: d */
    public C11654b m7344d(C11657d c11657d, int i) {
        this.f30353e.mo7269a(c11657d.m7302o(i, "ep"), 1.0f);
        this.f30353e.mo7269a(c11657d.m7302o(i, "em"), -1.0f);
        return this;
    }

    /* renamed from: e */
    public C11654b m7343e(C11665h c11665h, int i) {
        this.f30353e.mo7269a(c11665h, i);
        return this;
    }

    /* renamed from: f */
    public boolean m7342f(C11657d c11657d) {
        boolean z;
        C11665h m7341g = m7341g(c11657d);
        if (m7341g == null) {
            z = true;
        } else {
            m7323y(m7341g);
            z = false;
        }
        if (this.f30353e.mo7264f() == 0) {
            this.f30354f = true;
        }
        return z;
    }

    /* renamed from: g */
    C11665h m7341g(C11657d c11657d) {
        boolean m7326v;
        boolean m7326v2;
        int mo7264f = this.f30353e.mo7264f();
        C11665h c11665h = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        C11665h c11665h2 = null;
        for (int i = 0; i < mo7264f; i++) {
            float mo7261i = this.f30353e.mo7261i(i);
            C11665h mo7268b = this.f30353e.mo7268b(i);
            if (mo7268b.f30403j == C11665h.EnumC11666a.UNRESTRICTED) {
                if (c11665h == null) {
                    m7326v2 = m7326v(mo7268b, c11657d);
                } else if (f > mo7261i) {
                    m7326v2 = m7326v(mo7268b, c11657d);
                } else if (!z && m7326v(mo7268b, c11657d)) {
                    f = mo7261i;
                    c11665h = mo7268b;
                    z = true;
                }
                z = m7326v2;
                f = mo7261i;
                c11665h = mo7268b;
            } else if (c11665h == null && mo7261i < 0.0f) {
                if (c11665h2 == null) {
                    m7326v = m7326v(mo7268b, c11657d);
                } else if (f2 > mo7261i) {
                    m7326v = m7326v(mo7268b, c11657d);
                } else if (!z2 && m7326v(mo7268b, c11657d)) {
                    f2 = mo7261i;
                    c11665h2 = mo7268b;
                    z2 = true;
                }
                z2 = m7326v;
                f2 = mo7261i;
                c11665h2 = mo7268b;
            }
        }
        if (c11665h != null) {
            return c11665h;
        }
        return c11665h2;
    }

    @Override // p289q.C11657d.InterfaceC11658a
    public C11665h getKey() {
        return this.f30349a;
    }

    /* renamed from: h */
    public C11654b m7340h(C11665h c11665h, C11665h c11665h2, int i, float f, C11665h c11665h3, C11665h c11665h4, int i2) {
        if (c11665h2 == c11665h3) {
            this.f30353e.mo7269a(c11665h, 1.0f);
            this.f30353e.mo7269a(c11665h4, 1.0f);
            this.f30353e.mo7269a(c11665h2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f30353e.mo7269a(c11665h, 1.0f);
            this.f30353e.mo7269a(c11665h2, -1.0f);
            this.f30353e.mo7269a(c11665h3, -1.0f);
            this.f30353e.mo7269a(c11665h4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f30350b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            this.f30353e.mo7269a(c11665h, -1.0f);
            this.f30353e.mo7269a(c11665h2, 1.0f);
            this.f30350b = i;
        } else if (f >= 1.0f) {
            this.f30353e.mo7269a(c11665h4, -1.0f);
            this.f30353e.mo7269a(c11665h3, 1.0f);
            this.f30350b = -i2;
        } else {
            float f2 = 1.0f - f;
            this.f30353e.mo7269a(c11665h, f2 * 1.0f);
            this.f30353e.mo7269a(c11665h2, f2 * (-1.0f));
            this.f30353e.mo7269a(c11665h3, (-1.0f) * f);
            this.f30353e.mo7269a(c11665h4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f30350b = ((-i) * f2) + (i2 * f);
            }
        }
        return this;
    }

    /* renamed from: i */
    public C11654b m7339i(C11665h c11665h, int i) {
        this.f30349a = c11665h;
        float f = i;
        c11665h.f30399f = f;
        this.f30350b = f;
        this.f30354f = true;
        return this;
    }

    /* renamed from: j */
    public C11654b m7338j(C11665h c11665h, C11665h c11665h2, float f) {
        this.f30353e.mo7269a(c11665h, -1.0f);
        this.f30353e.mo7269a(c11665h2, f);
        return this;
    }

    /* renamed from: k */
    public C11654b m7337k(C11665h c11665h, C11665h c11665h2, C11665h c11665h3, C11665h c11665h4, float f) {
        this.f30353e.mo7269a(c11665h, -1.0f);
        this.f30353e.mo7269a(c11665h2, 1.0f);
        this.f30353e.mo7269a(c11665h3, f);
        this.f30353e.mo7269a(c11665h4, -f);
        return this;
    }

    /* renamed from: l */
    public C11654b m7336l(float f, float f2, float f3, C11665h c11665h, C11665h c11665h2, C11665h c11665h3, C11665h c11665h4) {
        this.f30350b = 0.0f;
        if (f2 != 0.0f && f != f3) {
            if (f == 0.0f) {
                this.f30353e.mo7269a(c11665h, 1.0f);
                this.f30353e.mo7269a(c11665h2, -1.0f);
            } else if (f3 == 0.0f) {
                this.f30353e.mo7269a(c11665h3, 1.0f);
                this.f30353e.mo7269a(c11665h4, -1.0f);
            } else {
                float f4 = (f / f2) / (f3 / f2);
                this.f30353e.mo7269a(c11665h, 1.0f);
                this.f30353e.mo7269a(c11665h2, -1.0f);
                this.f30353e.mo7269a(c11665h4, f4);
                this.f30353e.mo7269a(c11665h3, -f4);
            }
        } else {
            this.f30353e.mo7269a(c11665h, 1.0f);
            this.f30353e.mo7269a(c11665h2, -1.0f);
            this.f30353e.mo7269a(c11665h4, 1.0f);
            this.f30353e.mo7269a(c11665h3, -1.0f);
        }
        return this;
    }

    /* renamed from: m */
    public C11654b m7335m(C11665h c11665h, int i) {
        if (i < 0) {
            this.f30350b = i * (-1);
            this.f30353e.mo7269a(c11665h, 1.0f);
        } else {
            this.f30350b = i;
            this.f30353e.mo7269a(c11665h, -1.0f);
        }
        return this;
    }

    /* renamed from: n */
    public C11654b m7334n(C11665h c11665h, C11665h c11665h2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f30350b = i;
        }
        if (!z) {
            this.f30353e.mo7269a(c11665h, -1.0f);
            this.f30353e.mo7269a(c11665h2, 1.0f);
        } else {
            this.f30353e.mo7269a(c11665h, 1.0f);
            this.f30353e.mo7269a(c11665h2, -1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C11654b m7333o(C11665h c11665h, C11665h c11665h2, C11665h c11665h3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f30350b = i;
        }
        if (!z) {
            this.f30353e.mo7269a(c11665h, -1.0f);
            this.f30353e.mo7269a(c11665h2, 1.0f);
            this.f30353e.mo7269a(c11665h3, 1.0f);
        } else {
            this.f30353e.mo7269a(c11665h, 1.0f);
            this.f30353e.mo7269a(c11665h2, -1.0f);
            this.f30353e.mo7269a(c11665h3, -1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C11654b m7332p(C11665h c11665h, C11665h c11665h2, C11665h c11665h3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f30350b = i;
        }
        if (!z) {
            this.f30353e.mo7269a(c11665h, -1.0f);
            this.f30353e.mo7269a(c11665h2, 1.0f);
            this.f30353e.mo7269a(c11665h3, -1.0f);
        } else {
            this.f30353e.mo7269a(c11665h, 1.0f);
            this.f30353e.mo7269a(c11665h2, -1.0f);
            this.f30353e.mo7269a(c11665h3, 1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public C11654b m7331q(C11665h c11665h, C11665h c11665h2, C11665h c11665h3, C11665h c11665h4, float f) {
        this.f30353e.mo7269a(c11665h3, 0.5f);
        this.f30353e.mo7269a(c11665h4, 0.5f);
        this.f30353e.mo7269a(c11665h, -0.5f);
        this.f30353e.mo7269a(c11665h2, -0.5f);
        this.f30350b = -f;
        return this;
    }

    /* renamed from: r */
    public void m7330r() {
        float f = this.f30350b;
        if (f < 0.0f) {
            this.f30350b = f * (-1.0f);
            this.f30353e.mo7267c();
        }
    }

    /* renamed from: s */
    public boolean m7329s() {
        C11665h c11665h = this.f30349a;
        return c11665h != null && (c11665h.f30403j == C11665h.EnumC11666a.UNRESTRICTED || this.f30350b >= 0.0f);
    }

    /* renamed from: t */
    public boolean m7328t(C11665h c11665h) {
        return this.f30353e.mo7262h(c11665h);
    }

    public String toString() {
        return m7347A();
    }

    /* renamed from: u */
    public boolean m7327u() {
        return this.f30349a == null && this.f30350b == 0.0f && this.f30353e.mo7264f() == 0;
    }

    /* renamed from: w */
    public C11665h m7325w(C11665h c11665h) {
        return m7324x(null, c11665h);
    }

    /* renamed from: y */
    public void m7323y(C11665h c11665h) {
        C11665h c11665h2 = this.f30349a;
        if (c11665h2 != null) {
            this.f30353e.mo7269a(c11665h2, -1.0f);
            this.f30349a = null;
        }
        float mo7263g = this.f30353e.mo7263g(c11665h, true) * (-1.0f);
        this.f30349a = c11665h;
        if (mo7263g == 1.0f) {
            return;
        }
        this.f30350b /= mo7263g;
        this.f30353e.mo7259k(mo7263g);
    }

    /* renamed from: z */
    public void m7322z() {
        this.f30349a = null;
        this.f30353e.clear();
        this.f30350b = 0.0f;
        this.f30354f = false;
    }

    public C11654b(C11656c c11656c) {
        this.f30353e = new C11653a(this, c11656c);
    }
}