package p289q;

import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.widgets.C0654d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;
import p289q.C11665h;

/* renamed from: q.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C11657d {

    /* renamed from: q */
    private static int f30359q = 1000;

    /* renamed from: r */
    public static Metrics f30360r = null;

    /* renamed from: s */
    public static boolean f30361s = true;

    /* renamed from: t */
    public static long f30362t;

    /* renamed from: u */
    public static long f30363u;

    /* renamed from: c */
    private InterfaceC11658a f30366c;

    /* renamed from: f */
    C11654b[] f30369f;

    /* renamed from: m */
    final C11656c f30376m;

    /* renamed from: p */
    private InterfaceC11658a f30379p;

    /* renamed from: a */
    int f30364a = 0;

    /* renamed from: b */
    private HashMap<String, C11665h> f30365b = null;

    /* renamed from: d */
    private int f30367d = 32;

    /* renamed from: e */
    private int f30368e = 32;

    /* renamed from: g */
    public boolean f30370g = false;

    /* renamed from: h */
    public boolean f30371h = false;

    /* renamed from: i */
    private boolean[] f30372i = new boolean[32];

    /* renamed from: j */
    int f30373j = 1;

    /* renamed from: k */
    int f30374k = 0;

    /* renamed from: l */
    private int f30375l = 32;

    /* renamed from: n */
    private C11665h[] f30377n = new C11665h[f30359q];

    /* renamed from: o */
    private int f30378o = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC11658a {
        /* renamed from: a */
        void mo7290a(InterfaceC11658a interfaceC11658a);

        /* renamed from: b */
        void mo7284b(C11665h c11665h);

        /* renamed from: c */
        C11665h mo7283c(C11657d c11657d, boolean[] zArr);

        void clear();

        C11665h getKey();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C11659b extends C11654b {
        public C11659b(C11656c c11656c) {
            this.f30353e = new C11667i(this, c11656c);
        }
    }

    public C11657d() {
        this.f30369f = null;
        this.f30369f = new C11654b[32];
        m7318D();
        C11656c c11656c = new C11656c();
        this.f30376m = c11656c;
        this.f30366c = new C11662g(c11656c);
        if (f30361s) {
            this.f30379p = new C11659b(c11656c);
        } else {
            this.f30379p = new C11654b(c11656c);
        }
    }

    /* renamed from: C */
    private final int m7319C(InterfaceC11658a interfaceC11658a, boolean z) {
        Metrics metrics = f30360r;
        if (metrics != null) {
            metrics.f2194h++;
        }
        for (int i = 0; i < this.f30373j; i++) {
            this.f30372i[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            Metrics metrics2 = f30360r;
            if (metrics2 != null) {
                metrics2.f2195i++;
            }
            i2++;
            if (i2 >= this.f30373j * 2) {
                return i2;
            }
            if (interfaceC11658a.getKey() != null) {
                this.f30372i[interfaceC11658a.getKey().f30396c] = true;
            }
            C11665h mo7283c = interfaceC11658a.mo7283c(this, this.f30372i);
            if (mo7283c != null) {
                boolean[] zArr = this.f30372i;
                int i3 = mo7283c.f30396c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (mo7283c != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f30374k; i5++) {
                    C11654b c11654b = this.f30369f[i5];
                    if (c11654b.f30349a.f30403j != C11665h.EnumC11666a.UNRESTRICTED && !c11654b.f30354f && c11654b.m7328t(mo7283c)) {
                        float mo7266d = c11654b.f30353e.mo7266d(mo7283c);
                        if (mo7266d < 0.0f) {
                            float f2 = (-c11654b.f30350b) / mo7266d;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C11654b c11654b2 = this.f30369f[i4];
                    c11654b2.f30349a.f30397d = -1;
                    Metrics metrics3 = f30360r;
                    if (metrics3 != null) {
                        metrics3.f2196j++;
                    }
                    c11654b2.m7323y(mo7283c);
                    C11665h c11665h = c11654b2.f30349a;
                    c11665h.f30397d = i4;
                    c11665h.m7270g(c11654b2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: D */
    private void m7318D() {
        int i = 0;
        if (f30361s) {
            while (true) {
                C11654b[] c11654bArr = this.f30369f;
                if (i < c11654bArr.length) {
                    C11654b c11654b = c11654bArr[i];
                    if (c11654b != null) {
                        this.f30376m.f30355a.release(c11654b);
                    }
                    this.f30369f[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                C11654b[] c11654bArr2 = this.f30369f;
                if (i < c11654bArr2.length) {
                    C11654b c11654b2 = c11654bArr2[i];
                    if (c11654b2 != null) {
                        this.f30376m.f30356b.release(c11654b2);
                    }
                    this.f30369f[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private C11665h m7316a(C11665h.EnumC11666a enumC11666a, String str) {
        C11665h acquire = this.f30376m.f30357c.acquire();
        if (acquire == null) {
            acquire = new C11665h(enumC11666a, str);
            acquire.m7271f(enumC11666a, str);
        } else {
            acquire.m7273d();
            acquire.m7271f(enumC11666a, str);
        }
        int i = this.f30378o;
        int i2 = f30359q;
        if (i >= i2) {
            int i3 = i2 * 2;
            f30359q = i3;
            this.f30377n = (C11665h[]) Arrays.copyOf(this.f30377n, i3);
        }
        C11665h[] c11665hArr = this.f30377n;
        int i4 = this.f30378o;
        this.f30378o = i4 + 1;
        c11665hArr[i4] = acquire;
        return acquire;
    }

    /* renamed from: l */
    private final void m7305l(C11654b c11654b) {
        if (f30361s) {
            C11654b c11654b2 = this.f30369f[this.f30374k];
            if (c11654b2 != null) {
                this.f30376m.f30355a.release(c11654b2);
            }
        } else {
            C11654b c11654b3 = this.f30369f[this.f30374k];
            if (c11654b3 != null) {
                this.f30376m.f30356b.release(c11654b3);
            }
        }
        C11654b[] c11654bArr = this.f30369f;
        int i = this.f30374k;
        c11654bArr[i] = c11654b;
        C11665h c11665h = c11654b.f30349a;
        c11665h.f30397d = i;
        this.f30374k = i + 1;
        c11665h.m7270g(c11654b);
    }

    /* renamed from: n */
    private void m7303n() {
        for (int i = 0; i < this.f30374k; i++) {
            C11654b c11654b = this.f30369f[i];
            c11654b.f30349a.f30399f = c11654b.f30350b;
        }
    }

    /* renamed from: s */
    public static C11654b m7298s(C11657d c11657d, C11665h c11665h, C11665h c11665h2, float f) {
        return c11657d.m7299r().m7338j(c11665h, c11665h2, f);
    }

    /* renamed from: u */
    private int m7296u(InterfaceC11658a interfaceC11658a) {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i < this.f30374k) {
                C11654b c11654b = this.f30369f[i];
                if (c11654b.f30349a.f30403j != C11665h.EnumC11666a.UNRESTRICTED && c11654b.f30350b < 0.0f) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                Metrics metrics = f30360r;
                if (metrics != null) {
                    metrics.f2197k++;
                }
                i2++;
                float f2 = Float.MAX_VALUE;
                int i3 = -1;
                int i4 = -1;
                int i5 = 0;
                int i6 = 0;
                while (i5 < this.f30374k) {
                    C11654b c11654b2 = this.f30369f[i5];
                    if (c11654b2.f30349a.f30403j != C11665h.EnumC11666a.UNRESTRICTED && !c11654b2.f30354f && c11654b2.f30350b < f) {
                        int i7 = 1;
                        while (i7 < this.f30373j) {
                            C11665h c11665h = this.f30376m.f30358d[i7];
                            float mo7266d = c11654b2.f30353e.mo7266d(c11665h);
                            if (mo7266d > f) {
                                for (int i8 = 0; i8 < 9; i8++) {
                                    float f3 = c11665h.f30401h[i8] / mo7266d;
                                    if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                        i4 = i7;
                                        i6 = i8;
                                        f2 = f3;
                                        i3 = i5;
                                    }
                                }
                            }
                            i7++;
                            f = 0.0f;
                        }
                    }
                    i5++;
                    f = 0.0f;
                }
                if (i3 != -1) {
                    C11654b c11654b3 = this.f30369f[i3];
                    c11654b3.f30349a.f30397d = -1;
                    Metrics metrics2 = f30360r;
                    if (metrics2 != null) {
                        metrics2.f2196j++;
                    }
                    c11654b3.m7323y(this.f30376m.f30358d[i4]);
                    C11665h c11665h2 = c11654b3.f30349a;
                    c11665h2.f30397d = i3;
                    c11665h2.m7270g(c11654b3);
                } else {
                    z2 = true;
                }
                if (i2 > this.f30373j / 2) {
                    z2 = true;
                }
                f = 0.0f;
            }
            return i2;
        }
        return 0;
    }

    /* renamed from: x */
    public static Metrics m7293x() {
        return f30360r;
    }

    /* renamed from: z */
    private void m7291z() {
        int i = this.f30367d * 2;
        this.f30367d = i;
        this.f30369f = (C11654b[]) Arrays.copyOf(this.f30369f, i);
        C11656c c11656c = this.f30376m;
        c11656c.f30358d = (C11665h[]) Arrays.copyOf(c11656c.f30358d, this.f30367d);
        int i2 = this.f30367d;
        this.f30372i = new boolean[i2];
        this.f30368e = i2;
        this.f30375l = i2;
        Metrics metrics = f30360r;
        if (metrics != null) {
            metrics.f2190d++;
            metrics.f2201o = Math.max(metrics.f2201o, i2);
            Metrics metrics2 = f30360r;
            metrics2.f2211y = metrics2.f2201o;
        }
    }

    /* renamed from: A */
    public void m7321A() {
        Metrics metrics = f30360r;
        if (metrics != null) {
            metrics.f2191e++;
        }
        if (!this.f30370g && !this.f30371h) {
            m7320B(this.f30366c);
            return;
        }
        if (metrics != null) {
            metrics.f2203q++;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < this.f30374k) {
                if (!this.f30369f[i].f30354f) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            m7320B(this.f30366c);
            return;
        }
        Metrics metrics2 = f30360r;
        if (metrics2 != null) {
            metrics2.f2202p++;
        }
        m7303n();
    }

    /* renamed from: B */
    void m7320B(InterfaceC11658a interfaceC11658a) {
        Metrics metrics = f30360r;
        if (metrics != null) {
            metrics.f2206t++;
            metrics.f2207u = Math.max(metrics.f2207u, this.f30373j);
            Metrics metrics2 = f30360r;
            metrics2.f2208v = Math.max(metrics2.f2208v, this.f30374k);
        }
        m7296u(interfaceC11658a);
        m7319C(interfaceC11658a, false);
        m7303n();
    }

    /* renamed from: E */
    public void m7317E() {
        C11656c c11656c;
        int i = 0;
        while (true) {
            c11656c = this.f30376m;
            C11665h[] c11665hArr = c11656c.f30358d;
            if (i >= c11665hArr.length) {
                break;
            }
            C11665h c11665h = c11665hArr[i];
            if (c11665h != null) {
                c11665h.m7273d();
            }
            i++;
        }
        c11656c.f30357c.mo7289a(this.f30377n, this.f30378o);
        this.f30378o = 0;
        Arrays.fill(this.f30376m.f30358d, (Object) null);
        HashMap<String, C11665h> hashMap = this.f30365b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f30364a = 0;
        this.f30366c.clear();
        this.f30373j = 1;
        for (int i2 = 0; i2 < this.f30374k; i2++) {
            this.f30369f[i2].f30351c = false;
        }
        m7318D();
        this.f30374k = 0;
        if (f30361s) {
            this.f30379p = new C11659b(this.f30376m);
        } else {
            this.f30379p = new C11654b(this.f30376m);
        }
    }

    /* renamed from: b */
    public void m7315b(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f, int i) {
        C0654d.EnumC0656b enumC0656b = C0654d.EnumC0656b.LEFT;
        C11665h m7300q = m7300q(constraintWidget.mo39299k(enumC0656b));
        C0654d.EnumC0656b enumC0656b2 = C0654d.EnumC0656b.TOP;
        C11665h m7300q2 = m7300q(constraintWidget.mo39299k(enumC0656b2));
        C0654d.EnumC0656b enumC0656b3 = C0654d.EnumC0656b.RIGHT;
        C11665h m7300q3 = m7300q(constraintWidget.mo39299k(enumC0656b3));
        C0654d.EnumC0656b enumC0656b4 = C0654d.EnumC0656b.BOTTOM;
        C11665h m7300q4 = m7300q(constraintWidget.mo39299k(enumC0656b4));
        C11665h m7300q5 = m7300q(constraintWidget2.mo39299k(enumC0656b));
        C11665h m7300q6 = m7300q(constraintWidget2.mo39299k(enumC0656b2));
        C11665h m7300q7 = m7300q(constraintWidget2.mo39299k(enumC0656b3));
        C11665h m7300q8 = m7300q(constraintWidget2.mo39299k(enumC0656b4));
        C11654b m7299r = m7299r();
        double d = f;
        double d2 = i;
        m7299r.m7331q(m7300q2, m7300q4, m7300q6, m7300q8, (float) (Math.sin(d) * d2));
        m7313d(m7299r);
        C11654b m7299r2 = m7299r();
        m7299r2.m7331q(m7300q, m7300q3, m7300q5, m7300q7, (float) (Math.cos(d) * d2));
        m7313d(m7299r2);
    }

    /* renamed from: c */
    public void m7314c(C11665h c11665h, C11665h c11665h2, int i, float f, C11665h c11665h3, C11665h c11665h4, int i2, int i3) {
        C11654b m7299r = m7299r();
        m7299r.m7340h(c11665h, c11665h2, i, f, c11665h3, c11665h4, i2);
        if (i3 != 8) {
            m7299r.m7344d(this, i3);
        }
        m7313d(m7299r);
    }

    /* renamed from: d */
    public void m7313d(C11654b c11654b) {
        C11665h m7325w;
        if (c11654b == null) {
            return;
        }
        Metrics metrics = f30360r;
        if (metrics != null) {
            metrics.f2192f++;
            if (c11654b.f30354f) {
                metrics.f2193g++;
            }
        }
        boolean z = true;
        if (this.f30374k + 1 >= this.f30375l || this.f30373j + 1 >= this.f30368e) {
            m7291z();
        }
        boolean z2 = false;
        if (!c11654b.f30354f) {
            c11654b.m7345D(this);
            if (c11654b.m7327u()) {
                return;
            }
            c11654b.m7330r();
            if (c11654b.m7342f(this)) {
                C11665h m7301p = m7301p();
                c11654b.f30349a = m7301p;
                m7305l(c11654b);
                this.f30379p.mo7290a(c11654b);
                m7319C(this.f30379p, true);
                if (m7301p.f30397d == -1) {
                    if (c11654b.f30349a == m7301p && (m7325w = c11654b.m7325w(m7301p)) != null) {
                        Metrics metrics2 = f30360r;
                        if (metrics2 != null) {
                            metrics2.f2196j++;
                        }
                        c11654b.m7323y(m7325w);
                    }
                    if (!c11654b.f30354f) {
                        c11654b.f30349a.m7270g(c11654b);
                    }
                    this.f30374k--;
                }
            } else {
                z = false;
            }
            if (!c11654b.m7329s()) {
                return;
            }
            z2 = z;
        }
        if (!z2) {
            m7305l(c11654b);
        }
    }

    /* renamed from: e */
    public C11654b m7312e(C11665h c11665h, C11665h c11665h2, int i, int i2) {
        if (i2 == 8 && c11665h2.f30400g && c11665h.f30397d == -1) {
            c11665h.m7272e(this, c11665h2.f30399f + i);
            return null;
        }
        C11654b m7299r = m7299r();
        m7299r.m7334n(c11665h, c11665h2, i);
        if (i2 != 8) {
            m7299r.m7344d(this, i2);
        }
        m7313d(m7299r);
        return m7299r;
    }

    /* renamed from: f */
    public void m7311f(C11665h c11665h, int i) {
        int i2 = c11665h.f30397d;
        if (i2 == -1) {
            c11665h.m7272e(this, i);
        } else if (i2 != -1) {
            C11654b c11654b = this.f30369f[i2];
            if (c11654b.f30354f) {
                c11654b.f30350b = i;
            } else if (c11654b.f30353e.mo7264f() == 0) {
                c11654b.f30354f = true;
                c11654b.f30350b = i;
            } else {
                C11654b m7299r = m7299r();
                m7299r.m7335m(c11665h, i);
                m7313d(m7299r);
            }
        } else {
            C11654b m7299r2 = m7299r();
            m7299r2.m7339i(c11665h, i);
            m7313d(m7299r2);
        }
    }

    /* renamed from: g */
    public void m7310g(C11665h c11665h, C11665h c11665h2, int i, boolean z) {
        C11654b m7299r = m7299r();
        C11665h m7297t = m7297t();
        m7297t.f30398e = 0;
        m7299r.m7333o(c11665h, c11665h2, m7297t, i);
        m7313d(m7299r);
    }

    /* renamed from: h */
    public void m7309h(C11665h c11665h, C11665h c11665h2, int i, int i2) {
        C11654b m7299r = m7299r();
        C11665h m7297t = m7297t();
        m7297t.f30398e = 0;
        m7299r.m7333o(c11665h, c11665h2, m7297t, i);
        if (i2 != 8) {
            m7304m(m7299r, (int) (m7299r.f30353e.mo7266d(m7297t) * (-1.0f)), i2);
        }
        m7313d(m7299r);
    }

    /* renamed from: i */
    public void m7308i(C11665h c11665h, C11665h c11665h2, int i, boolean z) {
        C11654b m7299r = m7299r();
        C11665h m7297t = m7297t();
        m7297t.f30398e = 0;
        m7299r.m7332p(c11665h, c11665h2, m7297t, i);
        m7313d(m7299r);
    }

    /* renamed from: j */
    public void m7307j(C11665h c11665h, C11665h c11665h2, int i, int i2) {
        C11654b m7299r = m7299r();
        C11665h m7297t = m7297t();
        m7297t.f30398e = 0;
        m7299r.m7332p(c11665h, c11665h2, m7297t, i);
        if (i2 != 8) {
            m7304m(m7299r, (int) (m7299r.f30353e.mo7266d(m7297t) * (-1.0f)), i2);
        }
        m7313d(m7299r);
    }

    /* renamed from: k */
    public void m7306k(C11665h c11665h, C11665h c11665h2, C11665h c11665h3, C11665h c11665h4, float f, int i) {
        C11654b m7299r = m7299r();
        m7299r.m7337k(c11665h, c11665h2, c11665h3, c11665h4, f);
        if (i != 8) {
            m7299r.m7344d(this, i);
        }
        m7313d(m7299r);
    }

    /* renamed from: m */
    void m7304m(C11654b c11654b, int i, int i2) {
        c11654b.m7343e(m7302o(i2, null), i);
    }

    /* renamed from: o */
    public C11665h m7302o(int i, String str) {
        Metrics metrics = f30360r;
        if (metrics != null) {
            metrics.f2198l++;
        }
        if (this.f30373j + 1 >= this.f30368e) {
            m7291z();
        }
        C11665h m7316a = m7316a(C11665h.EnumC11666a.ERROR, str);
        int i2 = this.f30364a + 1;
        this.f30364a = i2;
        this.f30373j++;
        m7316a.f30396c = i2;
        m7316a.f30398e = i;
        this.f30376m.f30358d[i2] = m7316a;
        this.f30366c.mo7284b(m7316a);
        return m7316a;
    }

    /* renamed from: p */
    public C11665h m7301p() {
        Metrics metrics = f30360r;
        if (metrics != null) {
            metrics.f2200n++;
        }
        if (this.f30373j + 1 >= this.f30368e) {
            m7291z();
        }
        C11665h m7316a = m7316a(C11665h.EnumC11666a.SLACK, null);
        int i = this.f30364a + 1;
        this.f30364a = i;
        this.f30373j++;
        m7316a.f30396c = i;
        this.f30376m.f30358d[i] = m7316a;
        return m7316a;
    }

    /* renamed from: q */
    public C11665h m7300q(Object obj) {
        C11665h c11665h = null;
        if (obj == null) {
            return null;
        }
        if (this.f30373j + 1 >= this.f30368e) {
            m7291z();
        }
        if (obj instanceof C0654d) {
            C0654d c0654d = (C0654d) obj;
            c11665h = c0654d.m39318e();
            if (c11665h == null) {
                c0654d.m39311l(this.f30376m);
                c11665h = c0654d.m39318e();
            }
            int i = c11665h.f30396c;
            if (i == -1 || i > this.f30364a || this.f30376m.f30358d[i] == null) {
                if (i != -1) {
                    c11665h.m7273d();
                }
                int i2 = this.f30364a + 1;
                this.f30364a = i2;
                this.f30373j++;
                c11665h.f30396c = i2;
                c11665h.f30403j = C11665h.EnumC11666a.UNRESTRICTED;
                this.f30376m.f30358d[i2] = c11665h;
            }
        }
        return c11665h;
    }

    /* renamed from: r */
    public C11654b m7299r() {
        C11654b acquire;
        if (f30361s) {
            acquire = this.f30376m.f30355a.acquire();
            if (acquire == null) {
                acquire = new C11659b(this.f30376m);
                f30363u++;
            } else {
                acquire.m7322z();
            }
        } else {
            acquire = this.f30376m.f30356b.acquire();
            if (acquire == null) {
                acquire = new C11654b(this.f30376m);
                f30362t++;
            } else {
                acquire.m7322z();
            }
        }
        C11665h.m7275b();
        return acquire;
    }

    /* renamed from: t */
    public C11665h m7297t() {
        Metrics metrics = f30360r;
        if (metrics != null) {
            metrics.f2199m++;
        }
        if (this.f30373j + 1 >= this.f30368e) {
            m7291z();
        }
        C11665h m7316a = m7316a(C11665h.EnumC11666a.SLACK, null);
        int i = this.f30364a + 1;
        this.f30364a = i;
        this.f30373j++;
        m7316a.f30396c = i;
        this.f30376m.f30358d[i] = m7316a;
        return m7316a;
    }

    /* renamed from: v */
    public void m7295v(Metrics metrics) {
        f30360r = metrics;
    }

    /* renamed from: w */
    public C11656c m7294w() {
        return this.f30376m;
    }

    /* renamed from: y */
    public int m7292y(Object obj) {
        C11665h m39318e = ((C0654d) obj).m39318e();
        if (m39318e != null) {
            return (int) (m39318e.f30399f + 0.5f);
        }
        return 0;
    }
}
