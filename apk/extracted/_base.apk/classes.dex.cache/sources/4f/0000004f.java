package p008a7;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p008a7.InterfaceC0052i0;
import p195k8.C9149a;
import p195k8.C9183l0;
import p195k8.C9197r;
import p195k8.C9207x;
import p195k8.C9208y;
import p296q6.InterfaceC11748k;

/* renamed from: a7.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0079w implements InterfaceC0052i0 {

    /* renamed from: a */
    private final InterfaceC0062m f381a;

    /* renamed from: b */
    private final C9207x f382b = new C9207x(new byte[10]);

    /* renamed from: c */
    private int f383c = 0;

    /* renamed from: d */
    private int f384d;

    /* renamed from: e */
    private C9183l0 f385e;

    /* renamed from: f */
    private boolean f386f;

    /* renamed from: g */
    private boolean f387g;

    /* renamed from: h */
    private boolean f388h;

    /* renamed from: i */
    private int f389i;

    /* renamed from: j */
    private int f390j;

    /* renamed from: k */
    private boolean f391k;

    /* renamed from: l */
    private long f392l;

    public C0079w(InterfaceC0062m interfaceC0062m) {
        this.f381a = interfaceC0062m;
    }

    /* renamed from: d */
    private boolean m41199d(C9208y c9208y, byte[] bArr, int i) {
        int min = Math.min(c9208y.m16097a(), i - this.f384d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c9208y.m16098Q(min);
        } else {
            c9208y.m16088j(bArr, this.f384d, min);
        }
        int i2 = this.f384d + min;
        this.f384d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m41198e() {
        this.f382b.m16118p(0);
        int m16126h = this.f382b.m16126h(24);
        if (m16126h != 1) {
            C9197r.m16178h("PesReader", "Unexpected start code prefix: " + m16126h);
            this.f390j = -1;
            return false;
        }
        this.f382b.m16116r(8);
        int m16126h2 = this.f382b.m16126h(16);
        this.f382b.m16116r(5);
        this.f391k = this.f382b.m16127g();
        this.f382b.m16116r(2);
        this.f386f = this.f382b.m16127g();
        this.f387g = this.f382b.m16127g();
        this.f382b.m16116r(6);
        int m16126h3 = this.f382b.m16126h(8);
        this.f389i = m16126h3;
        if (m16126h2 == 0) {
            this.f390j = -1;
        } else {
            int i = ((m16126h2 + 6) - 9) - m16126h3;
            this.f390j = i;
            if (i < 0) {
                C9197r.m16178h("PesReader", "Found negative packet payload size: " + this.f390j);
                this.f390j = -1;
            }
        }
        return true;
    }

    @RequiresNonNull({"timestampAdjuster"})
    /* renamed from: f */
    private void m41197f() {
        this.f382b.m16118p(0);
        this.f392l = -9223372036854775807L;
        if (this.f386f) {
            this.f382b.m16116r(4);
            this.f382b.m16116r(1);
            this.f382b.m16116r(1);
            long m16126h = (this.f382b.m16126h(3) << 30) | (this.f382b.m16126h(15) << 15) | this.f382b.m16126h(15);
            this.f382b.m16116r(1);
            if (!this.f388h && this.f387g) {
                this.f382b.m16116r(4);
                this.f382b.m16116r(1);
                this.f382b.m16116r(1);
                this.f382b.m16116r(1);
                this.f385e.m16345b((this.f382b.m16126h(3) << 30) | (this.f382b.m16126h(15) << 15) | this.f382b.m16126h(15));
                this.f388h = true;
            }
            this.f392l = this.f385e.m16345b(m16126h);
        }
    }

    /* renamed from: g */
    private void m41196g(int i) {
        this.f383c = i;
        this.f384d = 0;
    }

    @Override // p008a7.InterfaceC0052i0
    /* renamed from: a */
    public final void mo41202a(C9208y c9208y, int i) {
        C9149a.m16445h(this.f385e);
        if ((i & 1) != 0) {
            int i2 = this.f383c;
            if (i2 != 0 && i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (this.f390j != -1) {
                            C9197r.m16178h("PesReader", "Unexpected start indicator: expected " + this.f390j + " more bytes");
                        }
                        this.f381a.mo41215d();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    C9197r.m16178h("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            m41196g(1);
        }
        while (c9208y.m16097a() > 0) {
            int i3 = this.f383c;
            if (i3 != 0) {
                int i4 = 0;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            int m16097a = c9208y.m16097a();
                            int i5 = this.f390j;
                            if (i5 != -1) {
                                i4 = m16097a - i5;
                            }
                            if (i4 > 0) {
                                m16097a -= i4;
                                c9208y.m16100O(c9208y.m16093e() + m16097a);
                            }
                            this.f381a.mo41218a(c9208y);
                            int i6 = this.f390j;
                            if (i6 != -1) {
                                int i7 = i6 - m16097a;
                                this.f390j = i7;
                                if (i7 == 0) {
                                    this.f381a.mo41215d();
                                    m41196g(1);
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (m41199d(c9208y, this.f382b.f24230a, Math.min(10, this.f389i)) && m41199d(c9208y, null, this.f389i)) {
                            m41197f();
                            if (this.f391k) {
                                i4 = 4;
                            }
                            i |= i4;
                            this.f381a.mo41213f(this.f392l, i);
                            m41196g(3);
                        }
                    }
                } else if (m41199d(c9208y, this.f382b.f24230a, 9)) {
                    if (m41198e()) {
                        i4 = 2;
                    }
                    m41196g(i4);
                }
            } else {
                c9208y.m16098Q(c9208y.m16097a());
            }
        }
    }

    @Override // p008a7.InterfaceC0052i0
    /* renamed from: b */
    public void mo41201b(C9183l0 c9183l0, InterfaceC11748k interfaceC11748k, InterfaceC0052i0.C0056d c0056d) {
        this.f385e = c9183l0;
        this.f381a.mo41214e(interfaceC11748k, c0056d);
    }

    @Override // p008a7.InterfaceC0052i0
    /* renamed from: c */
    public final void mo41200c() {
        this.f383c = 0;
        this.f384d = 0;
        this.f388h = false;
        this.f381a.mo41216c();
    }
}