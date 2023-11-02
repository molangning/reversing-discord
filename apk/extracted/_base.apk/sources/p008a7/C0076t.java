package p008a7;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p008a7.InterfaceC0052i0;
import p193k6.C9103k0;
import p195k8.C9149a;
import p195k8.C9208y;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11748k;

/* renamed from: a7.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0076t implements InterfaceC0062m {

    /* renamed from: a */
    private final C9208y f361a;

    /* renamed from: b */
    private final C9103k0.C9104a f362b;

    /* renamed from: c */
    private final String f363c;

    /* renamed from: d */
    private InterfaceC11732b0 f364d;

    /* renamed from: e */
    private String f365e;

    /* renamed from: f */
    private int f366f;

    /* renamed from: g */
    private int f367g;

    /* renamed from: h */
    private boolean f368h;

    /* renamed from: i */
    private boolean f369i;

    /* renamed from: j */
    private long f370j;

    /* renamed from: k */
    private int f371k;

    /* renamed from: l */
    private long f372l;

    public C0076t() {
        this(null);
    }

    /* renamed from: b */
    private void m41217b(C9208y c9208y) {
        boolean z;
        boolean z2;
        byte[] m16094d = c9208y.m16094d();
        int m16092f = c9208y.m16092f();
        for (int m16093e = c9208y.m16093e(); m16093e < m16092f; m16093e++) {
            byte b = m16094d[m16093e];
            if ((b & 255) == 255) {
                z = true;
            } else {
                z = false;
            }
            if (this.f369i && (b & 224) == 224) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f369i = z;
            if (z2) {
                c9208y.m16099P(m16093e + 1);
                this.f369i = false;
                this.f361a.m16094d()[1] = m16094d[m16093e];
                this.f367g = 2;
                this.f366f = 1;
                return;
            }
        }
        c9208y.m16099P(m16092f);
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    private void m41212g(C9208y c9208y) {
        int min = Math.min(c9208y.m16097a(), this.f371k - this.f367g);
        this.f364d.mo6170a(c9208y, min);
        int i = this.f367g + min;
        this.f367g = i;
        int i2 = this.f371k;
        if (i < i2) {
            return;
        }
        this.f364d.mo6162f(this.f372l, 1, i2, 0, null);
        this.f372l += this.f370j;
        this.f367g = 0;
        this.f366f = 0;
    }

    @RequiresNonNull({"output"})
    /* renamed from: h */
    private void m41211h(C9208y c9208y) {
        int min = Math.min(c9208y.m16097a(), 4 - this.f367g);
        c9208y.m16088j(this.f361a.m16094d(), this.f367g, min);
        int i = this.f367g + min;
        this.f367g = i;
        if (i < 4) {
            return;
        }
        this.f361a.m16099P(0);
        if (!this.f362b.m16646a(this.f361a.m16084n())) {
            this.f367g = 0;
            this.f366f = 1;
            return;
        }
        C9103k0.C9104a c9104a = this.f362b;
        this.f371k = c9104a.f23925c;
        if (!this.f368h) {
            this.f370j = (c9104a.f23929g * 1000000) / c9104a.f23926d;
            this.f364d.mo6168c(new Format.C4362b().m29900S(this.f365e).m29883e0(this.f362b.f23924b).m29896W(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT).m29911H(this.f362b.f23927e).m29881f0(this.f362b.f23926d).m29897V(this.f363c).m29914E());
            this.f368h = true;
        }
        this.f361a.m16099P(0);
        this.f364d.mo6170a(this.f361a, 4);
        this.f366f = 2;
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: a */
    public void mo41218a(C9208y c9208y) {
        C9149a.m16445h(this.f364d);
        while (c9208y.m16097a() > 0) {
            int i = this.f366f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        m41212g(c9208y);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    m41211h(c9208y);
                }
            } else {
                m41217b(c9208y);
            }
        }
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: c */
    public void mo41216c() {
        this.f366f = 0;
        this.f367g = 0;
        this.f369i = false;
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: d */
    public void mo41215d() {
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: e */
    public void mo41214e(InterfaceC11748k interfaceC11748k, InterfaceC0052i0.C0056d c0056d) {
        c0056d.m41289a();
        this.f365e = c0056d.m41288b();
        this.f364d = interfaceC11748k.mo3740e(c0056d.m41287c(), 1);
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: f */
    public void mo41213f(long j, int i) {
        this.f372l = j;
    }

    public C0076t(String str) {
        this.f366f = 0;
        C9208y c9208y = new C9208y(4);
        this.f361a = c9208y;
        c9208y.m16094d()[0] = -1;
        this.f362b = new C9103k0.C9104a();
        this.f363c = str;
    }
}
