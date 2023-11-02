package p008a7;

import com.google.android.exoplayer2.Format;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p008a7.InterfaceC0052i0;
import p193k6.C9095h0;
import p195k8.C9149a;
import p195k8.C9208y;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11748k;

/* renamed from: a7.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0059k implements InterfaceC0062m {

    /* renamed from: b */
    private final String f192b;

    /* renamed from: c */
    private String f193c;

    /* renamed from: d */
    private InterfaceC11732b0 f194d;

    /* renamed from: f */
    private int f196f;

    /* renamed from: g */
    private int f197g;

    /* renamed from: h */
    private long f198h;

    /* renamed from: i */
    private Format f199i;

    /* renamed from: j */
    private int f200j;

    /* renamed from: k */
    private long f201k;

    /* renamed from: a */
    private final C9208y f191a = new C9208y(new byte[18]);

    /* renamed from: e */
    private int f195e = 0;

    public C0059k(String str) {
        this.f192b = str;
    }

    /* renamed from: b */
    private boolean m41276b(C9208y c9208y, byte[] bArr, int i) {
        int min = Math.min(c9208y.m16097a(), i - this.f196f);
        c9208y.m16088j(bArr, this.f196f, min);
        int i2 = this.f196f + min;
        this.f196f = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    private void m41275g() {
        byte[] m16094d = this.f191a.m16094d();
        if (this.f199i == null) {
            Format m16673g = C9095h0.m16673g(m16094d, this.f193c, this.f192b, null);
            this.f199i = m16673g;
            this.f194d.mo6168c(m16673g);
        }
        this.f200j = C9095h0.m16679a(m16094d);
        this.f198h = (int) ((C9095h0.m16674f(m16094d) * 1000000) / this.f199i.f11179I);
    }

    /* renamed from: h */
    private boolean m41274h(C9208y c9208y) {
        while (c9208y.m16097a() > 0) {
            int i = this.f197g << 8;
            this.f197g = i;
            int m16111D = i | c9208y.m16111D();
            this.f197g = m16111D;
            if (C9095h0.m16676d(m16111D)) {
                byte[] m16094d = this.f191a.m16094d();
                int i2 = this.f197g;
                m16094d[0] = (byte) ((i2 >> 24) & 255);
                m16094d[1] = (byte) ((i2 >> 16) & 255);
                m16094d[2] = (byte) ((i2 >> 8) & 255);
                m16094d[3] = (byte) (i2 & 255);
                this.f196f = 4;
                this.f197g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: a */
    public void mo41218a(C9208y c9208y) {
        C9149a.m16445h(this.f194d);
        while (c9208y.m16097a() > 0) {
            int i = this.f195e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(c9208y.m16097a(), this.f200j - this.f196f);
                        this.f194d.mo6170a(c9208y, min);
                        int i2 = this.f196f + min;
                        this.f196f = i2;
                        int i3 = this.f200j;
                        if (i2 == i3) {
                            this.f194d.mo6162f(this.f201k, 1, i3, 0, null);
                            this.f201k += this.f198h;
                            this.f195e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (m41276b(c9208y, this.f191a.m16094d(), 18)) {
                    m41275g();
                    this.f191a.m16099P(0);
                    this.f194d.mo6170a(this.f191a, 18);
                    this.f195e = 2;
                }
            } else if (m41274h(c9208y)) {
                this.f195e = 1;
            }
        }
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: c */
    public void mo41216c() {
        this.f195e = 0;
        this.f196f = 0;
        this.f197g = 0;
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: d */
    public void mo41215d() {
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: e */
    public void mo41214e(InterfaceC11748k interfaceC11748k, InterfaceC0052i0.C0056d c0056d) {
        c0056d.m41289a();
        this.f193c = c0056d.m41288b();
        this.f194d = interfaceC11748k.mo3740e(c0056d.m41287c(), 1);
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: f */
    public void mo41213f(long j, int i) {
        this.f201k = j;
    }
}
