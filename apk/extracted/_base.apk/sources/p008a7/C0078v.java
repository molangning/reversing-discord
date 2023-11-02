package p008a7;

import com.google.android.exoplayer2.Format;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p008a7.InterfaceC0052i0;
import p195k8.C9149a;
import p195k8.C9183l0;
import p195k8.C9191p0;
import p195k8.C9208y;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11748k;

/* renamed from: a7.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0078v implements InterfaceC0035b0 {

    /* renamed from: a */
    private Format f378a;

    /* renamed from: b */
    private C9183l0 f379b;

    /* renamed from: c */
    private InterfaceC11732b0 f380c;

    public C0078v(String str) {
        this.f378a = new Format.C4362b().m29883e0(str).m29914E();
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    /* renamed from: c */
    private void m41203c() {
        C9149a.m16445h(this.f379b);
        C9191p0.m16243j(this.f380c);
    }

    @Override // p008a7.InterfaceC0035b0
    /* renamed from: a */
    public void mo41205a(C9208y c9208y) {
        m41203c();
        long m16342e = this.f379b.m16342e();
        if (m16342e == -9223372036854775807L) {
            return;
        }
        Format format = this.f378a;
        if (m16342e != format.f11201y) {
            Format m29914E = format.m29926a().m29875i0(m16342e).m29914E();
            this.f378a = m29914E;
            this.f380c.mo6168c(m29914E);
        }
        int m16097a = c9208y.m16097a();
        this.f380c.mo6170a(c9208y, m16097a);
        this.f380c.mo6162f(this.f379b.m16343d(), 1, m16097a, 0, null);
    }

    @Override // p008a7.InterfaceC0035b0
    /* renamed from: b */
    public void mo41204b(C9183l0 c9183l0, InterfaceC11748k interfaceC11748k, InterfaceC0052i0.C0056d c0056d) {
        this.f379b = c9183l0;
        c0056d.m41289a();
        InterfaceC11732b0 mo3740e = interfaceC11748k.mo3740e(c0056d.m41287c(), 5);
        this.f380c = mo3740e;
        mo3740e.mo6168c(this.f378a);
    }
}
