package p348t6;

import com.google.android.exoplayer2.Format;
import p195k8.C9204w;
import p195k8.C9208y;
import p213l8.C10061a;
import p296q6.InterfaceC11732b0;
import p348t6.AbstractC12599e;

/* renamed from: t6.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12601f extends AbstractC12599e {

    /* renamed from: b */
    private final C9208y f32690b;

    /* renamed from: c */
    private final C9208y f32691c;

    /* renamed from: d */
    private int f32692d;

    /* renamed from: e */
    private boolean f32693e;

    /* renamed from: f */
    private boolean f32694f;

    /* renamed from: g */
    private int f32695g;

    public C12601f(InterfaceC11732b0 interfaceC11732b0) {
        super(interfaceC11732b0);
        this.f32690b = new C9208y(C9204w.f24210a);
        this.f32691c = new C9208y(4);
    }

    @Override // p348t6.AbstractC12599e
    /* renamed from: b */
    protected boolean mo4727b(C9208y c9208y) {
        int m16111D = c9208y.m16111D();
        int i = (m16111D >> 4) & 15;
        int i2 = m16111D & 15;
        if (i2 == 7) {
            this.f32695g = i;
            if (i != 5) {
                return true;
            }
            return false;
        }
        throw new AbstractC12599e.C12600a("Video format not supported: " + i2);
    }

    @Override // p348t6.AbstractC12599e
    /* renamed from: c */
    protected boolean mo4726c(C9208y c9208y, long j) {
        int i;
        int m16111D = c9208y.m16111D();
        long m16083o = j + (c9208y.m16083o() * 1000);
        if (m16111D == 0 && !this.f32693e) {
            C9208y c9208y2 = new C9208y(new byte[c9208y.m16097a()]);
            c9208y.m16088j(c9208y2.m16094d(), 0, c9208y.m16097a());
            C10061a m12469b = C10061a.m12469b(c9208y2);
            this.f32692d = m12469b.f26158b;
            this.f32689a.mo6168c(new Format.C4362b().m29883e0("video/avc").m29910I(m12469b.f26162f).m29873j0(m12469b.f26159c).m29902Q(m12469b.f26160d).m29891a0(m12469b.f26161e).m29899T(m12469b.f26157a).m29914E());
            this.f32693e = true;
            return false;
        } else if (m16111D != 1 || !this.f32693e) {
            return false;
        } else {
            if (this.f32695g == 1) {
                i = 1;
            } else {
                i = 0;
            }
            if (!this.f32694f && i == 0) {
                return false;
            }
            byte[] m16094d = this.f32691c.m16094d();
            m16094d[0] = 0;
            m16094d[1] = 0;
            m16094d[2] = 0;
            int i2 = 4 - this.f32692d;
            int i3 = 0;
            while (c9208y.m16097a() > 0) {
                c9208y.m16088j(this.f32691c.m16094d(), i2, this.f32692d);
                this.f32691c.m16099P(0);
                int m16107H = this.f32691c.m16107H();
                this.f32690b.m16099P(0);
                this.f32689a.mo6170a(this.f32690b, 4);
                this.f32689a.mo6170a(c9208y, m16107H);
                i3 = i3 + 4 + m16107H;
            }
            this.f32689a.mo6162f(m16083o, i, i3, 0, null);
            this.f32694f = true;
            return true;
        }
    }
}
