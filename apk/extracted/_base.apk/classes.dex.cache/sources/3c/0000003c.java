package p008a7;

import com.google.android.exoplayer2.Format;
import java.util.List;
import p008a7.InterfaceC0052i0;
import p195k8.C9149a;
import p195k8.C9208y;
import p296q6.C11734c;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11748k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a7.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0060k0 {

    /* renamed from: a */
    private final List<Format> f202a;

    /* renamed from: b */
    private final InterfaceC11732b0[] f203b;

    public C0060k0(List<Format> list) {
        this.f202a = list;
        this.f203b = new InterfaceC11732b0[list.size()];
    }

    /* renamed from: a */
    public void m41273a(long j, C9208y c9208y) {
        if (c9208y.m16097a() < 9) {
            return;
        }
        int m16084n = c9208y.m16084n();
        int m16084n2 = c9208y.m16084n();
        int m16111D = c9208y.m16111D();
        if (m16084n == 434 && m16084n2 == 1195456820 && m16111D == 3) {
            C11734c.m7038b(j, c9208y, this.f203b);
        }
    }

    /* renamed from: b */
    public void m41272b(InterfaceC11748k interfaceC11748k, InterfaceC0052i0.C0056d c0056d) {
        boolean z;
        for (int i = 0; i < this.f203b.length; i++) {
            c0056d.m41289a();
            InterfaceC11732b0 mo3740e = interfaceC11748k.mo3740e(c0056d.m41287c(), 3);
            Format format = this.f202a.get(i);
            String str = format.f11197u;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            } else {
                z = true;
            }
            C9149a.m16451b(z, "Invalid closed caption mime type provided: " + str);
            mo3740e.mo6168c(new Format.C4362b().m29900S(c0056d.m41288b()).m29883e0(str).m29879g0(format.f11189m).m29897V(format.f11188l).m29913F(format.f11183M).m29899T(format.f11199w).m29914E());
            this.f203b[i] = mo3740e;
        }
    }
}