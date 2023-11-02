package p008a7;

import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;
import p008a7.InterfaceC0052i0;
import p195k8.C9208y;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11748k;

/* renamed from: a7.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0061l implements InterfaceC0062m {

    /* renamed from: a */
    private final List<InterfaceC0052i0.C0053a> f204a;

    /* renamed from: b */
    private final InterfaceC11732b0[] f205b;

    /* renamed from: c */
    private boolean f206c;

    /* renamed from: d */
    private int f207d;

    /* renamed from: e */
    private int f208e;

    /* renamed from: f */
    private long f209f;

    public C0061l(List<InterfaceC0052i0.C0053a> list) {
        this.f204a = list;
        this.f205b = new InterfaceC11732b0[list.size()];
    }

    /* renamed from: b */
    private boolean m41271b(C9208y c9208y, int i) {
        if (c9208y.m16097a() == 0) {
            return false;
        }
        if (c9208y.m16111D() != i) {
            this.f206c = false;
        }
        this.f207d--;
        return this.f206c;
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: a */
    public void mo41218a(C9208y c9208y) {
        InterfaceC11732b0[] interfaceC11732b0Arr;
        if (this.f206c) {
            if (this.f207d == 2 && !m41271b(c9208y, 32)) {
                return;
            }
            if (this.f207d == 1 && !m41271b(c9208y, 0)) {
                return;
            }
            int m16093e = c9208y.m16093e();
            int m16097a = c9208y.m16097a();
            for (InterfaceC11732b0 interfaceC11732b0 : this.f205b) {
                c9208y.m16099P(m16093e);
                interfaceC11732b0.mo6170a(c9208y, m16097a);
            }
            this.f208e += m16097a;
        }
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: c */
    public void mo41216c() {
        this.f206c = false;
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: d */
    public void mo41215d() {
        if (this.f206c) {
            for (InterfaceC11732b0 interfaceC11732b0 : this.f205b) {
                interfaceC11732b0.mo6162f(this.f209f, 1, this.f208e, 0, null);
            }
            this.f206c = false;
        }
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: e */
    public void mo41214e(InterfaceC11748k interfaceC11748k, InterfaceC0052i0.C0056d c0056d) {
        for (int i = 0; i < this.f205b.length; i++) {
            InterfaceC0052i0.C0053a c0053a = this.f204a.get(i);
            c0056d.m41289a();
            InterfaceC11732b0 mo3740e = interfaceC11748k.mo3740e(c0056d.m41287c(), 3);
            mo3740e.mo6168c(new Format.C4362b().m29900S(c0056d.m41288b()).m29883e0("application/dvbsubs").m29899T(Collections.singletonList(c0053a.f179c)).m29897V(c0053a.f177a).m29914E());
            this.f205b[i] = mo3740e;
        }
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: f */
    public void mo41213f(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f206c = true;
        this.f209f = j;
        this.f208e = 0;
        this.f207d = 2;
    }
}
