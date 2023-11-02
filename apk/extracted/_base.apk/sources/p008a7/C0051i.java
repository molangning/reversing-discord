package p008a7;

import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p008a7.InterfaceC0052i0;
import p193k6.C9062a;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9207x;
import p195k8.C9208y;
import p296q6.C11745h;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11748k;

/* renamed from: a7.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0051i implements InterfaceC0062m {

    /* renamed from: v */
    private static final byte[] f155v = {73, 68, 51};

    /* renamed from: a */
    private final boolean f156a;

    /* renamed from: b */
    private final C9207x f157b;

    /* renamed from: c */
    private final C9208y f158c;

    /* renamed from: d */
    private final String f159d;

    /* renamed from: e */
    private String f160e;

    /* renamed from: f */
    private InterfaceC11732b0 f161f;

    /* renamed from: g */
    private InterfaceC11732b0 f162g;

    /* renamed from: h */
    private int f163h;

    /* renamed from: i */
    private int f164i;

    /* renamed from: j */
    private int f165j;

    /* renamed from: k */
    private boolean f166k;

    /* renamed from: l */
    private boolean f167l;

    /* renamed from: m */
    private int f168m;

    /* renamed from: n */
    private int f169n;

    /* renamed from: o */
    private int f170o;

    /* renamed from: p */
    private boolean f171p;

    /* renamed from: q */
    private long f172q;

    /* renamed from: r */
    private int f173r;

    /* renamed from: s */
    private long f174s;

    /* renamed from: t */
    private InterfaceC11732b0 f175t;

    /* renamed from: u */
    private long f176u;

    public C0051i(boolean z) {
        this(z, null);
    }

    @EnsuresNonNull({"output", "currentOutput", "id3Output"})
    /* renamed from: b */
    private void m41307b() {
        C9149a.m16448e(this.f161f);
        C9191p0.m16243j(this.f175t);
        C9191p0.m16243j(this.f162g);
    }

    /* renamed from: g */
    private void m41306g(C9208y c9208y) {
        if (c9208y.m16097a() == 0) {
            return;
        }
        this.f157b.f24230a[0] = c9208y.m16094d()[c9208y.m16093e()];
        this.f157b.m16118p(2);
        int m16126h = this.f157b.m16126h(4);
        int i = this.f169n;
        if (i != -1 && m16126h != i) {
            m41296q();
            return;
        }
        if (!this.f167l) {
            this.f167l = true;
            this.f168m = this.f170o;
            this.f169n = m16126h;
        }
        m41293t();
    }

    /* renamed from: h */
    private boolean m41305h(C9208y c9208y, int i) {
        c9208y.m16099P(i + 1);
        if (!m41290w(c9208y, this.f157b.f24230a, 1)) {
            return false;
        }
        this.f157b.m16118p(4);
        int m16126h = this.f157b.m16126h(1);
        int i2 = this.f168m;
        if (i2 != -1 && m16126h != i2) {
            return false;
        }
        if (this.f169n != -1) {
            if (!m41290w(c9208y, this.f157b.f24230a, 1)) {
                return true;
            }
            this.f157b.m16118p(2);
            if (this.f157b.m16126h(4) != this.f169n) {
                return false;
            }
            c9208y.m16099P(i + 2);
        }
        if (!m41290w(c9208y, this.f157b.f24230a, 4)) {
            return true;
        }
        this.f157b.m16118p(14);
        int m16126h2 = this.f157b.m16126h(13);
        if (m16126h2 < 7) {
            return false;
        }
        byte[] m16094d = c9208y.m16094d();
        int m16092f = c9208y.m16092f();
        int i3 = i + m16126h2;
        if (i3 >= m16092f) {
            return true;
        }
        byte b = m16094d[i3];
        if (b == -1) {
            int i4 = i3 + 1;
            if (i4 == m16092f) {
                return true;
            }
            if (m41301l((byte) -1, m16094d[i4]) && ((m16094d[i4] & 8) >> 3) == m16126h) {
                return true;
            }
            return false;
        } else if (b != 73) {
            return false;
        } else {
            int i5 = i3 + 1;
            if (i5 == m16092f) {
                return true;
            }
            if (m16094d[i5] != 68) {
                return false;
            }
            int i6 = i3 + 2;
            if (i6 == m16092f || m16094d[i6] == 51) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: i */
    private boolean m41304i(C9208y c9208y, byte[] bArr, int i) {
        int min = Math.min(c9208y.m16097a(), i - this.f164i);
        c9208y.m16088j(bArr, this.f164i, min);
        int i2 = this.f164i + min;
        this.f164i = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m41303j(C9208y c9208y) {
        byte[] m16094d = c9208y.m16094d();
        int m16093e = c9208y.m16093e();
        int m16092f = c9208y.m16092f();
        while (m16093e < m16092f) {
            int i = m16093e + 1;
            int i2 = m16094d[m16093e] & 255;
            if (this.f165j == 512 && m41301l((byte) -1, (byte) i2) && (this.f167l || m41305h(c9208y, i - 2))) {
                this.f170o = (i2 & 8) >> 3;
                boolean z = true;
                if ((i2 & 1) != 0) {
                    z = false;
                }
                this.f166k = z;
                if (!this.f167l) {
                    m41295r();
                } else {
                    m41293t();
                }
                c9208y.m16099P(i);
                return;
            }
            int i3 = this.f165j;
            int i4 = i2 | i3;
            if (i4 != 329) {
                if (i4 != 511) {
                    if (i4 != 836) {
                        if (i4 != 1075) {
                            if (i3 != 256) {
                                this.f165j = 256;
                                i--;
                            }
                        } else {
                            m41292u();
                            c9208y.m16099P(i);
                            return;
                        }
                    } else {
                        this.f165j = 1024;
                    }
                } else {
                    this.f165j = 512;
                }
            } else {
                this.f165j = 768;
            }
            m16093e = i;
        }
        c9208y.m16099P(m16093e);
    }

    /* renamed from: l */
    private boolean m41301l(byte b, byte b2) {
        return m41300m(((b & 255) << 8) | (b2 & 255));
    }

    /* renamed from: m */
    public static boolean m41300m(int i) {
        return (i & 65526) == 65520;
    }

    @RequiresNonNull({"output"})
    /* renamed from: n */
    private void m41299n() {
        this.f157b.m16118p(0);
        if (!this.f171p) {
            int m16126h = this.f157b.m16126h(2) + 1;
            if (m16126h != 2) {
                C9197r.m16178h("AdtsReader", "Detected audio object type: " + m16126h + ", but assuming AAC LC.");
                m16126h = 2;
            }
            this.f157b.m16116r(5);
            byte[] m16787b = C9062a.m16787b(m16126h, this.f169n, this.f157b.m16126h(3));
            C9062a.C9064b m16782g = C9062a.m16782g(m16787b);
            Format m29914E = new Format.C4362b().m29900S(this.f160e).m29883e0("audio/mp4a-latm").m29910I(m16782g.f23780c).m29911H(m16782g.f23779b).m29881f0(m16782g.f23778a).m29899T(Collections.singletonList(m16787b)).m29897V(this.f159d).m29914E();
            this.f172q = 1024000000 / m29914E.f11179I;
            this.f161f.mo6168c(m29914E);
            this.f171p = true;
        } else {
            this.f157b.m16116r(10);
        }
        this.f157b.m16116r(4);
        int m16126h2 = (this.f157b.m16126h(13) - 2) - 5;
        if (this.f166k) {
            m16126h2 -= 2;
        }
        m41291v(this.f161f, this.f172q, 0, m16126h2);
    }

    @RequiresNonNull({"id3Output"})
    /* renamed from: o */
    private void m41298o() {
        this.f162g.mo6170a(this.f158c, 10);
        this.f158c.m16099P(6);
        m41291v(this.f162g, 0L, 10, this.f158c.m16112C() + 10);
    }

    @RequiresNonNull({"currentOutput"})
    /* renamed from: p */
    private void m41297p(C9208y c9208y) {
        int min = Math.min(c9208y.m16097a(), this.f173r - this.f164i);
        this.f175t.mo6170a(c9208y, min);
        int i = this.f164i + min;
        this.f164i = i;
        int i2 = this.f173r;
        if (i == i2) {
            this.f175t.mo6162f(this.f174s, 1, i2, 0, null);
            this.f174s += this.f176u;
            m41294s();
        }
    }

    /* renamed from: q */
    private void m41296q() {
        this.f167l = false;
        m41294s();
    }

    /* renamed from: r */
    private void m41295r() {
        this.f163h = 1;
        this.f164i = 0;
    }

    /* renamed from: s */
    private void m41294s() {
        this.f163h = 0;
        this.f164i = 0;
        this.f165j = 256;
    }

    /* renamed from: t */
    private void m41293t() {
        this.f163h = 3;
        this.f164i = 0;
    }

    /* renamed from: u */
    private void m41292u() {
        this.f163h = 2;
        this.f164i = f155v.length;
        this.f173r = 0;
        this.f158c.m16099P(0);
    }

    /* renamed from: v */
    private void m41291v(InterfaceC11732b0 interfaceC11732b0, long j, int i, int i2) {
        this.f163h = 4;
        this.f164i = i;
        this.f175t = interfaceC11732b0;
        this.f176u = j;
        this.f173r = i2;
    }

    /* renamed from: w */
    private boolean m41290w(C9208y c9208y, byte[] bArr, int i) {
        if (c9208y.m16097a() < i) {
            return false;
        }
        c9208y.m16088j(bArr, 0, i);
        return true;
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: a */
    public void mo41218a(C9208y c9208y) {
        int i;
        m41307b();
        while (c9208y.m16097a() > 0) {
            int i2 = this.f163h;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                m41297p(c9208y);
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f166k) {
                                i = 7;
                            } else {
                                i = 5;
                            }
                            if (m41304i(c9208y, this.f157b.f24230a, i)) {
                                m41299n();
                            }
                        }
                    } else if (m41304i(c9208y, this.f158c.m16094d(), 10)) {
                        m41298o();
                    }
                } else {
                    m41306g(c9208y);
                }
            } else {
                m41303j(c9208y);
            }
        }
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: c */
    public void mo41216c() {
        m41296q();
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: d */
    public void mo41215d() {
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: e */
    public void mo41214e(InterfaceC11748k interfaceC11748k, InterfaceC0052i0.C0056d c0056d) {
        c0056d.m41289a();
        this.f160e = c0056d.m41288b();
        InterfaceC11732b0 mo3740e = interfaceC11748k.mo3740e(c0056d.m41287c(), 1);
        this.f161f = mo3740e;
        this.f175t = mo3740e;
        if (this.f156a) {
            c0056d.m41289a();
            InterfaceC11732b0 mo3740e2 = interfaceC11748k.mo3740e(c0056d.m41287c(), 5);
            this.f162g = mo3740e2;
            mo3740e2.mo6168c(new Format.C4362b().m29900S(c0056d.m41288b()).m29883e0("application/id3").m29914E());
            return;
        }
        this.f162g = new C11745h();
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: f */
    public void mo41213f(long j, int i) {
        this.f174s = j;
    }

    /* renamed from: k */
    public long m41302k() {
        return this.f172q;
    }

    public C0051i(boolean z, String str) {
        this.f157b = new C9207x(new byte[7]);
        this.f158c = new C9208y(Arrays.copyOf(f155v, 10));
        m41294s();
        this.f168m = -1;
        this.f169n = -1;
        this.f172q = -9223372036854775807L;
        this.f156a = z;
        this.f159d = str;
    }
}
