package p008a7;

import p008a7.InterfaceC0052i0;
import p195k8.C9183l0;
import p195k8.C9191p0;
import p195k8.C9208y;
import p296q6.InterfaceC11748k;

/* renamed from: a7.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0037c0 implements InterfaceC0052i0 {

    /* renamed from: a */
    private final InterfaceC0035b0 f77a;

    /* renamed from: b */
    private final C9208y f78b = new C9208y(32);

    /* renamed from: c */
    private int f79c;

    /* renamed from: d */
    private int f80d;

    /* renamed from: e */
    private boolean f81e;

    /* renamed from: f */
    private boolean f82f;

    public C0037c0(InterfaceC0035b0 interfaceC0035b0) {
        this.f77a = interfaceC0035b0;
    }

    @Override // p008a7.InterfaceC0052i0
    /* renamed from: a */
    public void mo41202a(C9208y c9208y, int i) {
        boolean z;
        int i2;
        boolean z2;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = c9208y.m16093e() + c9208y.m16111D();
        } else {
            i2 = -1;
        }
        if (this.f82f) {
            if (!z) {
                return;
            }
            this.f82f = false;
            c9208y.m16099P(i2);
            this.f80d = 0;
        }
        while (c9208y.m16097a() > 0) {
            int i3 = this.f80d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int m16111D = c9208y.m16111D();
                    c9208y.m16099P(c9208y.m16093e() - 1);
                    if (m16111D == 255) {
                        this.f82f = true;
                        return;
                    }
                }
                int min = Math.min(c9208y.m16097a(), 3 - this.f80d);
                c9208y.m16088j(this.f78b.m16094d(), this.f80d, min);
                int i4 = this.f80d + min;
                this.f80d = i4;
                if (i4 == 3) {
                    this.f78b.m16099P(0);
                    this.f78b.m16100O(3);
                    this.f78b.m16098Q(1);
                    int m16111D2 = this.f78b.m16111D();
                    int m16111D3 = this.f78b.m16111D();
                    if ((m16111D2 & 128) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f81e = z2;
                    this.f79c = (((m16111D2 & 15) << 8) | m16111D3) + 3;
                    int m16096b = this.f78b.m16096b();
                    int i5 = this.f79c;
                    if (m16096b < i5) {
                        this.f78b.m16095c(Math.min(4098, Math.max(i5, this.f78b.m16096b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(c9208y.m16097a(), this.f79c - this.f80d);
                c9208y.m16088j(this.f78b.m16094d(), this.f80d, min2);
                int i6 = this.f80d + min2;
                this.f80d = i6;
                int i7 = this.f79c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.f81e) {
                        if (C9191p0.m16221u(this.f78b.m16094d(), 0, this.f79c, -1) != 0) {
                            this.f82f = true;
                            return;
                        }
                        this.f78b.m16100O(this.f79c - 4);
                    } else {
                        this.f78b.m16100O(i7);
                    }
                    this.f78b.m16099P(0);
                    this.f77a.mo41205a(this.f78b);
                    this.f80d = 0;
                }
            }
        }
    }

    @Override // p008a7.InterfaceC0052i0
    /* renamed from: b */
    public void mo41201b(C9183l0 c9183l0, InterfaceC11748k interfaceC11748k, InterfaceC0052i0.C0056d c0056d) {
        this.f77a.mo41204b(c9183l0, interfaceC11748k, c0056d);
        this.f82f = true;
    }

    @Override // p008a7.InterfaceC0052i0
    /* renamed from: c */
    public void mo41200c() {
        this.f82f = true;
    }
}