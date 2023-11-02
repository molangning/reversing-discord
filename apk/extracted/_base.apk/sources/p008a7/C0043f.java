package p008a7;

import com.google.android.exoplayer2.Format;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p008a7.InterfaceC0052i0;
import p193k6.C9070c;
import p195k8.C9149a;
import p195k8.C9207x;
import p195k8.C9208y;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11748k;

/* renamed from: a7.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0043f implements InterfaceC0062m {

    /* renamed from: a */
    private final C9207x f93a;

    /* renamed from: b */
    private final C9208y f94b;

    /* renamed from: c */
    private final String f95c;

    /* renamed from: d */
    private String f96d;

    /* renamed from: e */
    private InterfaceC11732b0 f97e;

    /* renamed from: f */
    private int f98f;

    /* renamed from: g */
    private int f99g;

    /* renamed from: h */
    private boolean f100h;

    /* renamed from: i */
    private boolean f101i;

    /* renamed from: j */
    private long f102j;

    /* renamed from: k */
    private Format f103k;

    /* renamed from: l */
    private int f104l;

    /* renamed from: m */
    private long f105m;

    public C0043f() {
        this(null);
    }

    /* renamed from: b */
    private boolean m41349b(C9208y c9208y, byte[] bArr, int i) {
        int min = Math.min(c9208y.m16097a(), i - this.f99g);
        c9208y.m16088j(bArr, this.f99g, min);
        int i2 = this.f99g + min;
        this.f99g = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    private void m41348g() {
        this.f93a.m16118p(0);
        C9070c.C9072b m16766d = C9070c.m16766d(this.f93a);
        Format format = this.f103k;
        if (format == null || m16766d.f23796c != format.f11178H || m16766d.f23795b != format.f11179I || !"audio/ac4".equals(format.f11197u)) {
            Format m29914E = new Format.C4362b().m29900S(this.f96d).m29883e0("audio/ac4").m29911H(m16766d.f23796c).m29881f0(m16766d.f23795b).m29897V(this.f95c).m29914E();
            this.f103k = m29914E;
            this.f97e.mo6168c(m29914E);
        }
        this.f104l = m16766d.f23797d;
        this.f102j = (m16766d.f23798e * 1000000) / this.f103k.f11179I;
    }

    /* renamed from: h */
    private boolean m41347h(C9208y c9208y) {
        boolean z;
        int m16111D;
        boolean z2;
        while (true) {
            z = false;
            if (c9208y.m16097a() <= 0) {
                return false;
            }
            if (!this.f100h) {
                if (c9208y.m16111D() == 172) {
                    z = true;
                }
                this.f100h = z;
            } else {
                m16111D = c9208y.m16111D();
                if (m16111D == 172) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f100h = z2;
                if (m16111D == 64 || m16111D == 65) {
                    break;
                }
            }
        }
        if (m16111D == 65) {
            z = true;
        }
        this.f101i = z;
        return true;
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: a */
    public void mo41218a(C9208y c9208y) {
        int i;
        C9149a.m16445h(this.f97e);
        while (c9208y.m16097a() > 0) {
            int i2 = this.f98f;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(c9208y.m16097a(), this.f104l - this.f99g);
                        this.f97e.mo6170a(c9208y, min);
                        int i3 = this.f99g + min;
                        this.f99g = i3;
                        int i4 = this.f104l;
                        if (i3 == i4) {
                            this.f97e.mo6162f(this.f105m, 1, i4, 0, null);
                            this.f105m += this.f102j;
                            this.f98f = 0;
                        }
                    }
                } else if (m41349b(c9208y, this.f94b.m16094d(), 16)) {
                    m41348g();
                    this.f94b.m16099P(0);
                    this.f97e.mo6170a(this.f94b, 16);
                    this.f98f = 2;
                }
            } else if (m41347h(c9208y)) {
                this.f98f = 1;
                this.f94b.m16094d()[0] = -84;
                byte[] m16094d = this.f94b.m16094d();
                if (this.f101i) {
                    i = 65;
                } else {
                    i = 64;
                }
                m16094d[1] = (byte) i;
                this.f99g = 2;
            }
        }
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: c */
    public void mo41216c() {
        this.f98f = 0;
        this.f99g = 0;
        this.f100h = false;
        this.f101i = false;
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: d */
    public void mo41215d() {
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: e */
    public void mo41214e(InterfaceC11748k interfaceC11748k, InterfaceC0052i0.C0056d c0056d) {
        c0056d.m41289a();
        this.f96d = c0056d.m41288b();
        this.f97e = interfaceC11748k.mo3740e(c0056d.m41287c(), 1);
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: f */
    public void mo41213f(long j, int i) {
        this.f105m = j;
    }

    public C0043f(String str) {
        C9207x c9207x = new C9207x(new byte[16]);
        this.f93a = c9207x;
        this.f94b = new C9208y(c9207x.f24230a);
        this.f98f = 0;
        this.f99g = 0;
        this.f100h = false;
        this.f101i = false;
        this.f95c = str;
    }
}
