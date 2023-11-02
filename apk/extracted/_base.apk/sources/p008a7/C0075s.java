package p008a7;

import com.google.android.exoplayer2.Format;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p008a7.InterfaceC0052i0;
import p151i6.C7402m;
import p193k6.C9062a;
import p195k8.C9149a;
import p195k8.C9207x;
import p195k8.C9208y;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11748k;

/* renamed from: a7.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0075s implements InterfaceC0062m {

    /* renamed from: a */
    private final String f340a;

    /* renamed from: b */
    private final C9208y f341b;

    /* renamed from: c */
    private final C9207x f342c;

    /* renamed from: d */
    private InterfaceC11732b0 f343d;

    /* renamed from: e */
    private String f344e;

    /* renamed from: f */
    private Format f345f;

    /* renamed from: g */
    private int f346g;

    /* renamed from: h */
    private int f347h;

    /* renamed from: i */
    private int f348i;

    /* renamed from: j */
    private int f349j;

    /* renamed from: k */
    private long f350k;

    /* renamed from: l */
    private boolean f351l;

    /* renamed from: m */
    private int f352m;

    /* renamed from: n */
    private int f353n;

    /* renamed from: o */
    private int f354o;

    /* renamed from: p */
    private boolean f355p;

    /* renamed from: q */
    private long f356q;

    /* renamed from: r */
    private int f357r;

    /* renamed from: s */
    private long f358s;

    /* renamed from: t */
    private int f359t;

    /* renamed from: u */
    private String f360u;

    public C0075s(String str) {
        this.f340a = str;
        C9208y c9208y = new C9208y(1024);
        this.f341b = c9208y;
        this.f342c = new C9207x(c9208y.m16094d());
    }

    /* renamed from: b */
    private static long m41226b(C9207x c9207x) {
        return c9207x.m16126h((c9207x.m16126h(2) + 1) * 8);
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    private void m41225g(C9207x c9207x) {
        if (!c9207x.m16127g()) {
            this.f351l = true;
            m41220l(c9207x);
        } else if (!this.f351l) {
            return;
        }
        if (this.f352m == 0) {
            if (this.f353n == 0) {
                m41221k(c9207x, m41222j(c9207x));
                if (this.f355p) {
                    c9207x.m16116r((int) this.f356q);
                    return;
                }
                return;
            }
            throw new C7402m();
        }
        throw new C7402m();
    }

    /* renamed from: h */
    private int m41224h(C9207x c9207x) {
        int m16132b = c9207x.m16132b();
        C9062a.C9064b m16783f = C9062a.m16783f(c9207x, true);
        this.f360u = m16783f.f23780c;
        this.f357r = m16783f.f23778a;
        this.f359t = m16783f.f23779b;
        return m16132b - c9207x.m16132b();
    }

    /* renamed from: i */
    private void m41223i(C9207x c9207x) {
        int m16126h = c9207x.m16126h(3);
        this.f354o = m16126h;
        if (m16126h != 0) {
            if (m16126h != 1) {
                if (m16126h != 3 && m16126h != 4 && m16126h != 5) {
                    if (m16126h != 6 && m16126h != 7) {
                        throw new IllegalStateException();
                    }
                    c9207x.m16116r(1);
                    return;
                }
                c9207x.m16116r(6);
                return;
            }
            c9207x.m16116r(9);
            return;
        }
        c9207x.m16116r(8);
    }

    /* renamed from: j */
    private int m41222j(C9207x c9207x) {
        int m16126h;
        if (this.f354o == 0) {
            int i = 0;
            do {
                m16126h = c9207x.m16126h(8);
                i += m16126h;
            } while (m16126h == 255);
            return i;
        }
        throw new C7402m();
    }

    @RequiresNonNull({"output"})
    /* renamed from: k */
    private void m41221k(C9207x c9207x, int i) {
        int m16129e = c9207x.m16129e();
        if ((m16129e & 7) == 0) {
            this.f341b.m16099P(m16129e >> 3);
        } else {
            c9207x.m16125i(this.f341b.m16094d(), 0, i * 8);
            this.f341b.m16099P(0);
        }
        this.f343d.mo6170a(this.f341b, i);
        this.f343d.mo6162f(this.f350k, 1, i, 0, null);
        this.f350k += this.f358s;
    }

    @RequiresNonNull({"output"})
    /* renamed from: l */
    private void m41220l(C9207x c9207x) {
        int i;
        boolean m16127g;
        int m16126h = c9207x.m16126h(1);
        if (m16126h == 1) {
            i = c9207x.m16126h(1);
        } else {
            i = 0;
        }
        this.f352m = i;
        if (i == 0) {
            if (m16126h == 1) {
                m41226b(c9207x);
            }
            if (c9207x.m16127g()) {
                this.f353n = c9207x.m16126h(6);
                int m16126h2 = c9207x.m16126h(4);
                int m16126h3 = c9207x.m16126h(3);
                if (m16126h2 == 0 && m16126h3 == 0) {
                    if (m16126h == 0) {
                        int m16129e = c9207x.m16129e();
                        int m41224h = m41224h(c9207x);
                        c9207x.m16118p(m16129e);
                        byte[] bArr = new byte[(m41224h + 7) / 8];
                        c9207x.m16125i(bArr, 0, m41224h);
                        Format m29914E = new Format.C4362b().m29900S(this.f344e).m29883e0("audio/mp4a-latm").m29910I(this.f360u).m29911H(this.f359t).m29881f0(this.f357r).m29899T(Collections.singletonList(bArr)).m29897V(this.f340a).m29914E();
                        if (!m29914E.equals(this.f345f)) {
                            this.f345f = m29914E;
                            this.f358s = 1024000000 / m29914E.f11179I;
                            this.f343d.mo6168c(m29914E);
                        }
                    } else {
                        c9207x.m16116r(((int) m41226b(c9207x)) - m41224h(c9207x));
                    }
                    m41223i(c9207x);
                    boolean m16127g2 = c9207x.m16127g();
                    this.f355p = m16127g2;
                    this.f356q = 0L;
                    if (m16127g2) {
                        if (m16126h == 1) {
                            this.f356q = m41226b(c9207x);
                        } else {
                            do {
                                m16127g = c9207x.m16127g();
                                this.f356q = (this.f356q << 8) + c9207x.m16126h(8);
                            } while (m16127g);
                        }
                    }
                    if (c9207x.m16127g()) {
                        c9207x.m16116r(8);
                        return;
                    }
                    return;
                }
                throw new C7402m();
            }
            throw new C7402m();
        }
        throw new C7402m();
    }

    /* renamed from: m */
    private void m41219m(int i) {
        this.f341b.m16103L(i);
        this.f342c.m16120n(this.f341b.m16094d());
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: a */
    public void mo41218a(C9208y c9208y) {
        C9149a.m16445h(this.f343d);
        while (c9208y.m16097a() > 0) {
            int i = this.f346g;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            int min = Math.min(c9208y.m16097a(), this.f348i - this.f347h);
                            c9208y.m16088j(this.f342c.f24230a, this.f347h, min);
                            int i2 = this.f347h + min;
                            this.f347h = i2;
                            if (i2 == this.f348i) {
                                this.f342c.m16118p(0);
                                m41225g(this.f342c);
                                this.f346g = 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        int m16111D = ((this.f349j & (-225)) << 8) | c9208y.m16111D();
                        this.f348i = m16111D;
                        if (m16111D > this.f341b.m16094d().length) {
                            m41219m(this.f348i);
                        }
                        this.f347h = 0;
                        this.f346g = 3;
                    }
                } else {
                    int m16111D2 = c9208y.m16111D();
                    if ((m16111D2 & 224) == 224) {
                        this.f349j = m16111D2;
                        this.f346g = 2;
                    } else if (m16111D2 != 86) {
                        this.f346g = 0;
                    }
                }
            } else if (c9208y.m16111D() == 86) {
                this.f346g = 1;
            }
        }
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: c */
    public void mo41216c() {
        this.f346g = 0;
        this.f351l = false;
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: d */
    public void mo41215d() {
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: e */
    public void mo41214e(InterfaceC11748k interfaceC11748k, InterfaceC0052i0.C0056d c0056d) {
        c0056d.m41289a();
        this.f343d = interfaceC11748k.mo3740e(c0056d.m41287c(), 1);
        this.f344e = c0056d.m41288b();
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: f */
    public void mo41213f(long j, int i) {
        this.f350k = j;
    }
}
