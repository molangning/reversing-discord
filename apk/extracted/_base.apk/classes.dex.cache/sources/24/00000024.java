package p008a7;

import com.google.android.exoplayer2.Format;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p008a7.InterfaceC0052i0;
import p193k6.C9066b;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9207x;
import p195k8.C9208y;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11748k;

/* renamed from: a7.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0036c implements InterfaceC0062m {

    /* renamed from: a */
    private final C9207x f65a;

    /* renamed from: b */
    private final C9208y f66b;

    /* renamed from: c */
    private final String f67c;

    /* renamed from: d */
    private String f68d;

    /* renamed from: e */
    private InterfaceC11732b0 f69e;

    /* renamed from: f */
    private int f70f;

    /* renamed from: g */
    private int f71g;

    /* renamed from: h */
    private boolean f72h;

    /* renamed from: i */
    private long f73i;

    /* renamed from: j */
    private Format f74j;

    /* renamed from: k */
    private int f75k;

    /* renamed from: l */
    private long f76l;

    public C0036c() {
        this(null);
    }

    /* renamed from: b */
    private boolean m41357b(C9208y c9208y, byte[] bArr, int i) {
        int min = Math.min(c9208y.m16097a(), i - this.f71g);
        c9208y.m16088j(bArr, this.f71g, min);
        int i2 = this.f71g + min;
        this.f71g = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    private void m41356g() {
        this.f65a.m16118p(0);
        C9066b.C9068b m16775e = C9066b.m16775e(this.f65a);
        Format format = this.f74j;
        if (format == null || m16775e.f23790d != format.f11178H || m16775e.f23789c != format.f11179I || !C9191p0.m16257c(m16775e.f23787a, format.f11197u)) {
            Format m29914E = new Format.C4362b().m29900S(this.f68d).m29883e0(m16775e.f23787a).m29911H(m16775e.f23790d).m29881f0(m16775e.f23789c).m29897V(this.f67c).m29914E();
            this.f74j = m29914E;
            this.f69e.mo6168c(m29914E);
        }
        this.f75k = m16775e.f23791e;
        this.f73i = (m16775e.f23792f * 1000000) / this.f74j.f11179I;
    }

    /* renamed from: h */
    private boolean m41355h(C9208y c9208y) {
        while (true) {
            boolean z = false;
            if (c9208y.m16097a() <= 0) {
                return false;
            }
            if (!this.f72h) {
                if (c9208y.m16111D() == 11) {
                    z = true;
                }
                this.f72h = z;
            } else {
                int m16111D = c9208y.m16111D();
                if (m16111D == 119) {
                    this.f72h = false;
                    return true;
                }
                if (m16111D == 11) {
                    z = true;
                }
                this.f72h = z;
            }
        }
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: a */
    public void mo41218a(C9208y c9208y) {
        C9149a.m16445h(this.f69e);
        while (c9208y.m16097a() > 0) {
            int i = this.f70f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(c9208y.m16097a(), this.f75k - this.f71g);
                        this.f69e.mo6170a(c9208y, min);
                        int i2 = this.f71g + min;
                        this.f71g = i2;
                        int i3 = this.f75k;
                        if (i2 == i3) {
                            this.f69e.mo6162f(this.f76l, 1, i3, 0, null);
                            this.f76l += this.f73i;
                            this.f70f = 0;
                        }
                    }
                } else if (m41357b(c9208y, this.f66b.m16094d(), 128)) {
                    m41356g();
                    this.f66b.m16099P(0);
                    this.f69e.mo6170a(this.f66b, 128);
                    this.f70f = 2;
                }
            } else if (m41355h(c9208y)) {
                this.f70f = 1;
                this.f66b.m16094d()[0] = 11;
                this.f66b.m16094d()[1] = 119;
                this.f71g = 2;
            }
        }
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: c */
    public void mo41216c() {
        this.f70f = 0;
        this.f71g = 0;
        this.f72h = false;
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: d */
    public void mo41215d() {
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: e */
    public void mo41214e(InterfaceC11748k interfaceC11748k, InterfaceC0052i0.C0056d c0056d) {
        c0056d.m41289a();
        this.f68d = c0056d.m41288b();
        this.f69e = interfaceC11748k.mo3740e(c0056d.m41287c(), 1);
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: f */
    public void mo41213f(long j, int i) {
        this.f76l = j;
    }

    public C0036c(String str) {
        C9207x c9207x = new C9207x(new byte[128]);
        this.f65a = c9207x;
        this.f66b = new C9208y(c9207x.f24230a);
        this.f70f = 0;
        this.f67c = str;
    }
}