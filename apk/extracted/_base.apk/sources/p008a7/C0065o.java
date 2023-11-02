package p008a7;

import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import p008a7.InterfaceC0052i0;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9204w;
import p195k8.C9207x;
import p195k8.C9208y;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11748k;

/* renamed from: a7.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0065o implements InterfaceC0062m {

    /* renamed from: l */
    private static final float[] f232l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    private final C0060k0 f233a;

    /* renamed from: b */
    private final C9208y f234b;

    /* renamed from: c */
    private final boolean[] f235c = new boolean[4];

    /* renamed from: d */
    private final C0066a f236d = new C0066a(128);

    /* renamed from: e */
    private final C0077u f237e;

    /* renamed from: f */
    private C0067b f238f;

    /* renamed from: g */
    private long f239g;

    /* renamed from: h */
    private String f240h;

    /* renamed from: i */
    private InterfaceC11732b0 f241i;

    /* renamed from: j */
    private boolean f242j;

    /* renamed from: k */
    private long f243k;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a7.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C0066a {

        /* renamed from: f */
        private static final byte[] f244f = {0, 0, 1};

        /* renamed from: a */
        private boolean f245a;

        /* renamed from: b */
        private int f246b;

        /* renamed from: c */
        public int f247c;

        /* renamed from: d */
        public int f248d;

        /* renamed from: e */
        public byte[] f249e;

        public C0066a(int i) {
            this.f249e = new byte[i];
        }

        /* renamed from: a */
        public void m41265a(byte[] bArr, int i, int i2) {
            if (!this.f245a) {
                return;
            }
            int i3 = i2 - i;
            byte[] bArr2 = this.f249e;
            int length = bArr2.length;
            int i4 = this.f247c;
            if (length < i4 + i3) {
                this.f249e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f249e, this.f247c, i3);
            this.f247c += i3;
        }

        /* renamed from: b */
        public boolean m41264b(int i, int i2) {
            int i3 = this.f246b;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                if (i == 179 || i == 181) {
                                    this.f247c -= i2;
                                    this.f245a = false;
                                    return true;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else if ((i & 240) != 32) {
                            C9197r.m16178h("H263Reader", "Unexpected start code value");
                            m41263c();
                        } else {
                            this.f248d = this.f247c;
                            this.f246b = 4;
                        }
                    } else if (i > 31) {
                        C9197r.m16178h("H263Reader", "Unexpected start code value");
                        m41263c();
                    } else {
                        this.f246b = 3;
                    }
                } else if (i != 181) {
                    C9197r.m16178h("H263Reader", "Unexpected start code value");
                    m41263c();
                } else {
                    this.f246b = 2;
                }
            } else if (i == 176) {
                this.f246b = 1;
                this.f245a = true;
            }
            byte[] bArr = f244f;
            m41265a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: c */
        public void m41263c() {
            this.f245a = false;
            this.f247c = 0;
            this.f246b = 0;
        }
    }

    /* renamed from: a7.o$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C0067b {

        /* renamed from: a */
        private final InterfaceC11732b0 f250a;

        /* renamed from: b */
        private boolean f251b;

        /* renamed from: c */
        private boolean f252c;

        /* renamed from: d */
        private boolean f253d;

        /* renamed from: e */
        private int f254e;

        /* renamed from: f */
        private int f255f;

        /* renamed from: g */
        private long f256g;

        /* renamed from: h */
        private long f257h;

        public C0067b(InterfaceC11732b0 interfaceC11732b0) {
            this.f250a = interfaceC11732b0;
        }

        /* renamed from: a */
        public void m41262a(byte[] bArr, int i, int i2) {
            boolean z;
            if (this.f252c) {
                int i3 = this.f255f;
                int i4 = (i + 1) - i3;
                if (i4 < i2) {
                    if (((bArr[i4] & 192) >> 6) == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f253d = z;
                    this.f252c = false;
                    return;
                }
                this.f255f = i3 + (i2 - i);
            }
        }

        /* renamed from: b */
        public void m41261b(long j, int i, boolean z) {
            if (this.f254e == 182 && z && this.f251b) {
                boolean z2 = this.f253d;
                this.f250a.mo6162f(this.f257h, z2 ? 1 : 0, (int) (j - this.f256g), i, null);
            }
            if (this.f254e != 179) {
                this.f256g = j;
            }
        }

        /* renamed from: c */
        public void m41260c(int i, long j) {
            boolean z;
            this.f254e = i;
            this.f253d = false;
            boolean z2 = true;
            if (i != 182 && i != 179) {
                z = false;
            } else {
                z = true;
            }
            this.f251b = z;
            if (i != 182) {
                z2 = false;
            }
            this.f252c = z2;
            this.f255f = 0;
            this.f257h = j;
        }

        /* renamed from: d */
        public void m41259d() {
            this.f251b = false;
            this.f252c = false;
            this.f253d = false;
            this.f254e = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0065o(C0060k0 c0060k0) {
        this.f233a = c0060k0;
        if (c0060k0 != null) {
            this.f237e = new C0077u(178, 128);
            this.f234b = new C9208y();
            return;
        }
        this.f237e = null;
        this.f234b = null;
    }

    /* renamed from: b */
    private static Format m41266b(C0066a c0066a, int i, String str) {
        byte[] copyOf = Arrays.copyOf(c0066a.f249e, c0066a.f247c);
        C9207x c9207x = new C9207x(copyOf);
        c9207x.m16115s(i);
        c9207x.m16115s(4);
        c9207x.m16117q();
        c9207x.m16116r(8);
        if (c9207x.m16127g()) {
            c9207x.m16116r(4);
            c9207x.m16116r(3);
        }
        int m16126h = c9207x.m16126h(4);
        float f = 1.0f;
        if (m16126h == 15) {
            int m16126h2 = c9207x.m16126h(8);
            int m16126h3 = c9207x.m16126h(8);
            if (m16126h3 == 0) {
                C9197r.m16178h("H263Reader", "Invalid aspect ratio");
            } else {
                f = m16126h2 / m16126h3;
            }
        } else {
            float[] fArr = f232l;
            if (m16126h < fArr.length) {
                f = fArr[m16126h];
            } else {
                C9197r.m16178h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (c9207x.m16127g()) {
            c9207x.m16116r(2);
            c9207x.m16116r(1);
            if (c9207x.m16127g()) {
                c9207x.m16116r(15);
                c9207x.m16117q();
                c9207x.m16116r(15);
                c9207x.m16117q();
                c9207x.m16116r(15);
                c9207x.m16117q();
                c9207x.m16116r(3);
                c9207x.m16116r(11);
                c9207x.m16117q();
                c9207x.m16116r(15);
                c9207x.m16117q();
            }
        }
        if (c9207x.m16126h(2) != 0) {
            C9197r.m16178h("H263Reader", "Unhandled video object layer shape");
        }
        c9207x.m16117q();
        int m16126h4 = c9207x.m16126h(16);
        c9207x.m16117q();
        if (c9207x.m16127g()) {
            if (m16126h4 == 0) {
                C9197r.m16178h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = m16126h4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                c9207x.m16116r(i2);
            }
        }
        c9207x.m16117q();
        int m16126h5 = c9207x.m16126h(13);
        c9207x.m16117q();
        int m16126h6 = c9207x.m16126h(13);
        c9207x.m16117q();
        c9207x.m16117q();
        return new Format.C4362b().m29900S(str).m29883e0("video/mp4v-es").m29873j0(m16126h5).m29902Q(m16126h6).m29891a0(f).m29899T(Collections.singletonList(copyOf)).m29914E();
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: a */
    public void mo41218a(C9208y c9208y) {
        int i;
        C9149a.m16445h(this.f238f);
        C9149a.m16445h(this.f241i);
        int m16093e = c9208y.m16093e();
        int m16092f = c9208y.m16092f();
        byte[] m16094d = c9208y.m16094d();
        this.f239g += c9208y.m16097a();
        this.f241i.mo6170a(c9208y, c9208y.m16097a());
        while (true) {
            int m16142c = C9204w.m16142c(m16094d, m16093e, m16092f, this.f235c);
            if (m16142c == m16092f) {
                break;
            }
            int i2 = m16142c + 3;
            int i3 = c9208y.m16094d()[i2] & 255;
            int i4 = m16142c - m16093e;
            int i5 = 0;
            if (!this.f242j) {
                if (i4 > 0) {
                    this.f236d.m41265a(m16094d, m16093e, m16142c);
                }
                if (i4 < 0) {
                    i = -i4;
                } else {
                    i = 0;
                }
                if (this.f236d.m41264b(i3, i)) {
                    InterfaceC11732b0 interfaceC11732b0 = this.f241i;
                    C0066a c0066a = this.f236d;
                    interfaceC11732b0.mo6168c(m41266b(c0066a, c0066a.f248d, (String) C9149a.m16448e(this.f240h)));
                    this.f242j = true;
                }
            }
            this.f238f.m41262a(m16094d, m16093e, m16142c);
            C0077u c0077u = this.f237e;
            if (c0077u != null) {
                if (i4 > 0) {
                    c0077u.m41210a(m16094d, m16093e, m16142c);
                } else {
                    i5 = -i4;
                }
                if (this.f237e.m41209b(i5)) {
                    C0077u c0077u2 = this.f237e;
                    ((C9208y) C9191p0.m16243j(this.f234b)).m16101N(this.f237e.f376d, C9204w.m16134k(c0077u2.f376d, c0077u2.f377e));
                    ((C0060k0) C9191p0.m16243j(this.f233a)).m41273a(this.f243k, this.f234b);
                }
                if (i3 == 178 && c9208y.m16094d()[m16142c + 2] == 1) {
                    this.f237e.m41206e(i3);
                }
            }
            int i6 = m16092f - m16142c;
            this.f238f.m41261b(this.f239g - i6, i6, this.f242j);
            this.f238f.m41260c(i3, this.f243k);
            m16093e = i2;
        }
        if (!this.f242j) {
            this.f236d.m41265a(m16094d, m16093e, m16092f);
        }
        this.f238f.m41262a(m16094d, m16093e, m16092f);
        C0077u c0077u3 = this.f237e;
        if (c0077u3 != null) {
            c0077u3.m41210a(m16094d, m16093e, m16092f);
        }
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: c */
    public void mo41216c() {
        C9204w.m16144a(this.f235c);
        this.f236d.m41263c();
        C0067b c0067b = this.f238f;
        if (c0067b != null) {
            c0067b.m41259d();
        }
        C0077u c0077u = this.f237e;
        if (c0077u != null) {
            c0077u.m41207d();
        }
        this.f239g = 0L;
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: d */
    public void mo41215d() {
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: e */
    public void mo41214e(InterfaceC11748k interfaceC11748k, InterfaceC0052i0.C0056d c0056d) {
        c0056d.m41289a();
        this.f240h = c0056d.m41288b();
        InterfaceC11732b0 mo3740e = interfaceC11748k.mo3740e(c0056d.m41287c(), 2);
        this.f241i = mo3740e;
        this.f238f = new C0067b(mo3740e);
        C0060k0 c0060k0 = this.f233a;
        if (c0060k0 != null) {
            c0060k0.m41272b(interfaceC11748k, c0056d);
        }
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: f */
    public void mo41213f(long j, int i) {
        this.f243k = j;
    }
}
