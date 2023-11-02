package p008a7;

import com.google.android.exoplayer2.Format;
import p008a7.InterfaceC0052i0;
import p195k8.C9149a;
import p195k8.C9197r;
import p195k8.C9208y;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11748k;

/* renamed from: a7.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0074r implements InterfaceC0062m {

    /* renamed from: a */
    private final C9208y f334a = new C9208y(10);

    /* renamed from: b */
    private InterfaceC11732b0 f335b;

    /* renamed from: c */
    private boolean f336c;

    /* renamed from: d */
    private long f337d;

    /* renamed from: e */
    private int f338e;

    /* renamed from: f */
    private int f339f;

    @Override // p008a7.InterfaceC0062m
    /* renamed from: a */
    public void mo41218a(C9208y c9208y) {
        C9149a.m16445h(this.f335b);
        if (!this.f336c) {
            return;
        }
        int m16097a = c9208y.m16097a();
        int i = this.f339f;
        if (i < 10) {
            int min = Math.min(m16097a, 10 - i);
            System.arraycopy(c9208y.m16094d(), c9208y.m16093e(), this.f334a.m16094d(), this.f339f, min);
            if (this.f339f + min == 10) {
                this.f334a.m16099P(0);
                if (73 == this.f334a.m16111D() && 68 == this.f334a.m16111D() && 51 == this.f334a.m16111D()) {
                    this.f334a.m16098Q(3);
                    this.f338e = this.f334a.m16112C() + 10;
                } else {
                    C9197r.m16178h("Id3Reader", "Discarding invalid ID3 tag");
                    this.f336c = false;
                    return;
                }
            }
        }
        int min2 = Math.min(m16097a, this.f338e - this.f339f);
        this.f335b.mo6170a(c9208y, min2);
        this.f339f += min2;
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: c */
    public void mo41216c() {
        this.f336c = false;
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: d */
    public void mo41215d() {
        int i;
        C9149a.m16445h(this.f335b);
        if (this.f336c && (i = this.f338e) != 0 && this.f339f == i) {
            this.f335b.mo6162f(this.f337d, 1, i, 0, null);
            this.f336c = false;
        }
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: e */
    public void mo41214e(InterfaceC11748k interfaceC11748k, InterfaceC0052i0.C0056d c0056d) {
        c0056d.m41289a();
        InterfaceC11732b0 mo3740e = interfaceC11748k.mo3740e(c0056d.m41287c(), 5);
        this.f335b = mo3740e;
        mo3740e.mo6168c(new Format.C4362b().m29900S(c0056d.m41288b()).m29883e0("application/id3").m29914E());
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: f */
    public void mo41213f(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f336c = true;
        this.f337d = j;
        this.f338e = 0;
        this.f339f = 0;
    }
}
