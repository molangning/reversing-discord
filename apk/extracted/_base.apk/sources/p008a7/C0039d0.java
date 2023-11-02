package p008a7;

import com.google.android.exoplayer2.Format;
import java.util.List;
import p008a7.InterfaceC0052i0;
import p195k8.C9149a;
import p195k8.C9208y;
import p296q6.C11734c;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11748k;

/* renamed from: a7.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0039d0 {

    /* renamed from: a */
    private final List<Format> f83a;

    /* renamed from: b */
    private final InterfaceC11732b0[] f84b;

    public C0039d0(List<Format> list) {
        this.f83a = list;
        this.f84b = new InterfaceC11732b0[list.size()];
    }

    /* renamed from: a */
    public void m41354a(long j, C9208y c9208y) {
        C11734c.m7039a(j, c9208y, this.f84b);
    }

    /* renamed from: b */
    public void m41353b(InterfaceC11748k interfaceC11748k, InterfaceC0052i0.C0056d c0056d) {
        boolean z;
        for (int i = 0; i < this.f84b.length; i++) {
            c0056d.m41289a();
            InterfaceC11732b0 mo3740e = interfaceC11748k.mo3740e(c0056d.m41287c(), 3);
            Format format = this.f83a.get(i);
            String str = format.f11197u;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            } else {
                z = true;
            }
            C9149a.m16451b(z, "Invalid closed caption mime type provided: " + str);
            String str2 = format.f11186j;
            if (str2 == null) {
                str2 = c0056d.m41288b();
            }
            mo3740e.mo6168c(new Format.C4362b().m29900S(str2).m29883e0(str).m29879g0(format.f11189m).m29897V(format.f11188l).m29913F(format.f11183M).m29899T(format.f11199w).m29914E());
            this.f84b[i] = mo3740e;
        }
    }
}
