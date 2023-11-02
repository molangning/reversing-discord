package p363u6;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import p173j7.C8856b;
import p195k8.C9149a;
import p195k8.C9208y;
import p296q6.C11765x;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11766y;
import p418x6.C13713k;

/* renamed from: u6.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12871a implements InterfaceC11746i {

    /* renamed from: b */
    private InterfaceC11748k f33497b;

    /* renamed from: c */
    private int f33498c;

    /* renamed from: d */
    private int f33499d;

    /* renamed from: e */
    private int f33500e;

    /* renamed from: g */
    private C8856b f33502g;

    /* renamed from: h */
    private InterfaceC11747j f33503h;

    /* renamed from: i */
    private C12874c f33504i;

    /* renamed from: j */
    private C13713k f33505j;

    /* renamed from: a */
    private final C9208y f33496a = new C9208y(6);

    /* renamed from: f */
    private long f33501f = -1;

    /* renamed from: c */
    private void m3753c(InterfaceC11747j interfaceC11747j) {
        this.f33496a.m16103L(2);
        interfaceC11747j.mo6963n(this.f33496a.m16094d(), 0, 2);
        interfaceC11747j.mo6967i(this.f33496a.m16105J() - 2);
    }

    /* renamed from: f */
    private void m3752f() {
        m3750h(new Metadata.InterfaceC4429b[0]);
        ((InterfaceC11748k) C9149a.m16448e(this.f33497b)).mo3738s();
        this.f33497b.mo3739i(new InterfaceC11766y.C11768b(-9223372036854775807L));
        this.f33498c = 6;
    }

    /* renamed from: g */
    private static C8856b m3751g(String str, long j) {
        C12872b m3737a;
        if (j == -1 || (m3737a = C12877e.m3737a(str)) == null) {
            return null;
        }
        return m3737a.m3743a(j);
    }

    /* renamed from: h */
    private void m3750h(Metadata.InterfaceC4429b... interfaceC4429bArr) {
        ((InterfaceC11748k) C9149a.m16448e(this.f33497b)).mo3740e(1024, 4).mo6168c(new Format.C4362b().m29895X(new Metadata(interfaceC4429bArr)).m29914E());
    }

    /* renamed from: i */
    private int m3749i(InterfaceC11747j interfaceC11747j) {
        this.f33496a.m16103L(2);
        interfaceC11747j.mo6963n(this.f33496a.m16094d(), 0, 2);
        return this.f33496a.m16105J();
    }

    /* renamed from: j */
    private void m3748j(InterfaceC11747j interfaceC11747j) {
        this.f33496a.m16103L(2);
        interfaceC11747j.readFully(this.f33496a.m16094d(), 0, 2);
        int m16105J = this.f33496a.m16105J();
        this.f33499d = m16105J;
        if (m16105J == 65498) {
            if (this.f33501f != -1) {
                this.f33498c = 4;
            } else {
                m3752f();
            }
        } else if ((m16105J < 65488 || m16105J > 65497) && m16105J != 65281) {
            this.f33498c = 1;
        }
    }

    /* renamed from: k */
    private void m3747k(InterfaceC11747j interfaceC11747j) {
        String m16074x;
        if (this.f33499d == 65505) {
            C9208y c9208y = new C9208y(this.f33500e);
            interfaceC11747j.readFully(c9208y.m16094d(), 0, this.f33500e);
            if (this.f33502g == null && "http://ns.adobe.com/xap/1.0/".equals(c9208y.m16074x()) && (m16074x = c9208y.m16074x()) != null) {
                C8856b m3751g = m3751g(m16074x, interfaceC11747j.getLength());
                this.f33502g = m3751g;
                if (m3751g != null) {
                    this.f33501f = m3751g.f23235m;
                }
            }
        } else {
            interfaceC11747j.mo6965k(this.f33500e);
        }
        this.f33498c = 0;
    }

    /* renamed from: l */
    private void m3746l(InterfaceC11747j interfaceC11747j) {
        this.f33496a.m16103L(2);
        interfaceC11747j.readFully(this.f33496a.m16094d(), 0, 2);
        this.f33500e = this.f33496a.m16105J() - 2;
        this.f33498c = 2;
    }

    /* renamed from: m */
    private void m3745m(InterfaceC11747j interfaceC11747j) {
        if (!interfaceC11747j.mo6970c(this.f33496a.m16094d(), 0, 1, true)) {
            m3752f();
            return;
        }
        interfaceC11747j.mo6969e();
        if (this.f33505j == null) {
            this.f33505j = new C13713k();
        }
        C12874c c12874c = new C12874c(interfaceC11747j, this.f33501f);
        this.f33504i = c12874c;
        if (this.f33505j.mo659e(c12874c)) {
            this.f33505j.mo662b(new C12875d(this.f33501f, (InterfaceC11748k) C9149a.m16448e(this.f33497b)));
            m3744n();
            return;
        }
        m3752f();
    }

    /* renamed from: n */
    private void m3744n() {
        m3750h((Metadata.InterfaceC4429b) C9149a.m16448e(this.f33502g));
        this.f33498c = 5;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: a */
    public void mo663a(long j, long j2) {
        if (j == 0) {
            this.f33498c = 0;
            this.f33505j = null;
        } else if (this.f33498c == 5) {
            ((C13713k) C9149a.m16448e(this.f33505j)).mo663a(j, j2);
        }
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: b */
    public void mo662b(InterfaceC11748k interfaceC11748k) {
        this.f33497b = interfaceC11748k;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: d */
    public int mo660d(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        int i = this.f33498c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i == 6) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.f33504i == null || interfaceC11747j != this.f33503h) {
                            this.f33503h = interfaceC11747j;
                            this.f33504i = new C12874c(interfaceC11747j, this.f33501f);
                        }
                        int mo660d = ((C13713k) C9149a.m16448e(this.f33505j)).mo660d(this.f33504i, c11765x);
                        if (mo660d == 1) {
                            c11765x.f30668a += this.f33501f;
                        }
                        return mo660d;
                    }
                    long position = interfaceC11747j.getPosition();
                    long j = this.f33501f;
                    if (position != j) {
                        c11765x.f30668a = j;
                        return 1;
                    }
                    m3745m(interfaceC11747j);
                    return 0;
                }
                m3747k(interfaceC11747j);
                return 0;
            }
            m3746l(interfaceC11747j);
            return 0;
        }
        m3748j(interfaceC11747j);
        return 0;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: e */
    public boolean mo659e(InterfaceC11747j interfaceC11747j) {
        if (m3749i(interfaceC11747j) != 65496) {
            return false;
        }
        int m3749i = m3749i(interfaceC11747j);
        this.f33499d = m3749i;
        if (m3749i == 65504) {
            m3753c(interfaceC11747j);
            this.f33499d = m3749i(interfaceC11747j);
        }
        if (this.f33499d != 65505) {
            return false;
        }
        interfaceC11747j.mo6967i(2);
        this.f33496a.m16103L(6);
        interfaceC11747j.mo6963n(this.f33496a.m16094d(), 0, 6);
        if (this.f33496a.m16109F() != 1165519206 || this.f33496a.m16105J() != 0) {
            return false;
        }
        return true;
    }

    @Override // p296q6.InterfaceC11746i
    public void release() {
        C13713k c13713k = this.f33505j;
        if (c13713k != null) {
            c13713k.release();
        }
    }
}