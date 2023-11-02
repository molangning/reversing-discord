package p336s6;

import android.net.Uri;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Map;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9208y;
import p296q6.C11752n;
import p296q6.C11754p;
import p296q6.C11756q;
import p296q6.C11758r;
import p296q6.C11759s;
import p296q6.C11765x;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11753o;
import p296q6.InterfaceC11766y;

/* renamed from: s6.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12406d implements InterfaceC11746i {

    /* renamed from: o */
    public static final InterfaceC11753o f32204o = new InterfaceC11753o() { // from class: s6.c
        @Override // p296q6.InterfaceC11753o
        /* renamed from: a */
        public /* synthetic */ InterfaceC11746i[] mo1203a(Uri uri, Map map) {
            return C11752n.m7006a(this, uri, map);
        }

        @Override // p296q6.InterfaceC11753o
        /* renamed from: b */
        public final InterfaceC11746i[] mo1202b() {
            InterfaceC11746i[] m5397j;
            m5397j = C12406d.m5397j();
            return m5397j;
        }
    };

    /* renamed from: a */
    private final byte[] f32205a;

    /* renamed from: b */
    private final C9208y f32206b;

    /* renamed from: c */
    private final boolean f32207c;

    /* renamed from: d */
    private final C11754p.C11755a f32208d;

    /* renamed from: e */
    private InterfaceC11748k f32209e;

    /* renamed from: f */
    private InterfaceC11732b0 f32210f;

    /* renamed from: g */
    private int f32211g;

    /* renamed from: h */
    private Metadata f32212h;

    /* renamed from: i */
    private C11759s f32213i;

    /* renamed from: j */
    private int f32214j;

    /* renamed from: k */
    private int f32215k;

    /* renamed from: l */
    private C12402b f32216l;

    /* renamed from: m */
    private int f32217m;

    /* renamed from: n */
    private long f32218n;

    public C12406d() {
        this(0);
    }

    /* renamed from: f */
    private long m5401f(C9208y c9208y, boolean z) {
        boolean z2;
        C9149a.m16448e(this.f32213i);
        int m16093e = c9208y.m16093e();
        while (m16093e <= c9208y.m16092f() - 16) {
            c9208y.m16099P(m16093e);
            if (C11754p.m7001d(c9208y, this.f32213i, this.f32215k, this.f32208d)) {
                c9208y.m16099P(m16093e);
                return this.f32208d.f30641a;
            }
            m16093e++;
        }
        if (z) {
            while (m16093e <= c9208y.m16092f() - this.f32214j) {
                c9208y.m16099P(m16093e);
                boolean z3 = false;
                try {
                    z2 = C11754p.m7001d(c9208y, this.f32213i, this.f32215k, this.f32208d);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (c9208y.m16093e() <= c9208y.m16092f()) {
                    z3 = z2;
                }
                if (z3) {
                    c9208y.m16099P(m16093e);
                    return this.f32208d.f30641a;
                }
                m16093e++;
            }
            c9208y.m16099P(c9208y.m16092f());
            return -1L;
        }
        c9208y.m16099P(m16093e);
        return -1L;
    }

    /* renamed from: g */
    private void m5400g(InterfaceC11747j interfaceC11747j) {
        this.f32215k = C11756q.m6993b(interfaceC11747j);
        ((InterfaceC11748k) C9191p0.m16243j(this.f32209e)).mo3739i(m5399h(interfaceC11747j.getPosition(), interfaceC11747j.getLength()));
        this.f32211g = 5;
    }

    /* renamed from: h */
    private InterfaceC11766y m5399h(long j, long j2) {
        C9149a.m16448e(this.f32213i);
        C11759s c11759s = this.f32213i;
        if (c11759s.f30655k != null) {
            return new C11758r(c11759s, j);
        }
        if (j2 != -1 && c11759s.f30654j > 0) {
            C12402b c12402b = new C12402b(c11759s, this.f32215k, j, j2);
            this.f32216l = c12402b;
            return c12402b.m7078b();
        }
        return new InterfaceC11766y.C11768b(c11759s.m6976g());
    }

    /* renamed from: i */
    private void m5398i(InterfaceC11747j interfaceC11747j) {
        byte[] bArr = this.f32205a;
        interfaceC11747j.mo6963n(bArr, 0, bArr.length);
        interfaceC11747j.mo6969e();
        this.f32211g = 2;
    }

    /* renamed from: j */
    public static /* synthetic */ InterfaceC11746i[] m5397j() {
        return new InterfaceC11746i[]{new C12406d()};
    }

    /* renamed from: k */
    private void m5396k() {
        ((InterfaceC11732b0) C9191p0.m16243j(this.f32210f)).mo6162f((this.f32218n * 1000000) / ((C11759s) C9191p0.m16243j(this.f32213i)).f30649e, 1, this.f32217m, 0, null);
    }

    /* renamed from: l */
    private int m5395l(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        boolean z;
        C9149a.m16448e(this.f32210f);
        C9149a.m16448e(this.f32213i);
        C12402b c12402b = this.f32216l;
        if (c12402b != null && c12402b.m7076d()) {
            return this.f32216l.m7077c(interfaceC11747j, c11765x);
        }
        if (this.f32218n == -1) {
            this.f32218n = C11754p.m6996i(interfaceC11747j, this.f32213i);
            return 0;
        }
        int m16092f = this.f32206b.m16092f();
        if (m16092f < 32768) {
            int read = interfaceC11747j.read(this.f32206b.m16094d(), m16092f, 32768 - m16092f);
            if (read == -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f32206b.m16100O(m16092f + read);
            } else if (this.f32206b.m16097a() == 0) {
                m5396k();
                return -1;
            }
        } else {
            z = false;
        }
        int m16093e = this.f32206b.m16093e();
        int i = this.f32217m;
        int i2 = this.f32214j;
        if (i < i2) {
            C9208y c9208y = this.f32206b;
            c9208y.m16098Q(Math.min(i2 - i, c9208y.m16097a()));
        }
        long m5401f = m5401f(this.f32206b, z);
        int m16093e2 = this.f32206b.m16093e() - m16093e;
        this.f32206b.m16099P(m16093e);
        this.f32210f.mo6170a(this.f32206b, m16093e2);
        this.f32217m += m16093e2;
        if (m5401f != -1) {
            m5396k();
            this.f32217m = 0;
            this.f32218n = m5401f;
        }
        if (this.f32206b.m16097a() < 16) {
            int m16097a = this.f32206b.m16097a();
            System.arraycopy(this.f32206b.m16094d(), this.f32206b.m16093e(), this.f32206b.m16094d(), 0, m16097a);
            this.f32206b.m16099P(0);
            this.f32206b.m16100O(m16097a);
        }
        return 0;
    }

    /* renamed from: m */
    private void m5394m(InterfaceC11747j interfaceC11747j) {
        this.f32212h = C11756q.m6991d(interfaceC11747j, !this.f32207c);
        this.f32211g = 1;
    }

    /* renamed from: n */
    private void m5393n(InterfaceC11747j interfaceC11747j) {
        C11756q.C11757a c11757a = new C11756q.C11757a(this.f32213i);
        boolean z = false;
        while (!z) {
            z = C11756q.m6990e(interfaceC11747j, c11757a);
            this.f32213i = (C11759s) C9191p0.m16243j(c11757a.f30642a);
        }
        C9149a.m16448e(this.f32213i);
        this.f32214j = Math.max(this.f32213i.f30647c, 6);
        ((InterfaceC11732b0) C9191p0.m16243j(this.f32210f)).mo6168c(this.f32213i.m6975h(this.f32205a, this.f32212h));
        this.f32211g = 4;
    }

    /* renamed from: o */
    private void m5392o(InterfaceC11747j interfaceC11747j) {
        C11756q.m6985j(interfaceC11747j);
        this.f32211g = 3;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: a */
    public void mo663a(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f32211g = 0;
        } else {
            C12402b c12402b = this.f32216l;
            if (c12402b != null) {
                c12402b.m7072h(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.f32218n = j3;
        this.f32217m = 0;
        this.f32206b.m16103L(0);
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: b */
    public void mo662b(InterfaceC11748k interfaceC11748k) {
        this.f32209e = interfaceC11748k;
        this.f32210f = interfaceC11748k.mo3740e(0, 1);
        interfaceC11748k.mo3738s();
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: d */
    public int mo660d(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        int i = this.f32211g;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return m5395l(interfaceC11747j, c11765x);
                            }
                            throw new IllegalStateException();
                        }
                        m5400g(interfaceC11747j);
                        return 0;
                    }
                    m5393n(interfaceC11747j);
                    return 0;
                }
                m5392o(interfaceC11747j);
                return 0;
            }
            m5398i(interfaceC11747j);
            return 0;
        }
        m5394m(interfaceC11747j);
        return 0;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: e */
    public boolean mo659e(InterfaceC11747j interfaceC11747j) {
        C11756q.m6992c(interfaceC11747j, false);
        return C11756q.m6994a(interfaceC11747j);
    }

    @Override // p296q6.InterfaceC11746i
    public void release() {
    }

    public C12406d(int i) {
        this.f32205a = new byte[42];
        this.f32206b = new C9208y(new byte[32768], 0);
        this.f32207c = (i & 1) != 0;
        this.f32208d = new C11754p.C11755a();
        this.f32211g = 0;
    }
}