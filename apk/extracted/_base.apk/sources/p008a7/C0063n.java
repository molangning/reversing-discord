package p008a7;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import p008a7.InterfaceC0052i0;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9204w;
import p195k8.C9208y;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11748k;

/* renamed from: a7.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0063n implements InterfaceC0062m {

    /* renamed from: q */
    private static final double[] f210q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    private String f211a;

    /* renamed from: b */
    private InterfaceC11732b0 f212b;

    /* renamed from: c */
    private final C0060k0 f213c;

    /* renamed from: d */
    private final C9208y f214d;

    /* renamed from: e */
    private final C0077u f215e;

    /* renamed from: f */
    private final boolean[] f216f;

    /* renamed from: g */
    private final C0064a f217g;

    /* renamed from: h */
    private long f218h;

    /* renamed from: i */
    private boolean f219i;

    /* renamed from: j */
    private boolean f220j;

    /* renamed from: k */
    private long f221k;

    /* renamed from: l */
    private long f222l;

    /* renamed from: m */
    private long f223m;

    /* renamed from: n */
    private long f224n;

    /* renamed from: o */
    private boolean f225o;

    /* renamed from: p */
    private boolean f226p;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a7.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C0064a {

        /* renamed from: e */
        private static final byte[] f227e = {0, 0, 1};

        /* renamed from: a */
        private boolean f228a;

        /* renamed from: b */
        public int f229b;

        /* renamed from: c */
        public int f230c;

        /* renamed from: d */
        public byte[] f231d;

        public C0064a(int i) {
            this.f231d = new byte[i];
        }

        /* renamed from: a */
        public void m41269a(byte[] bArr, int i, int i2) {
            if (!this.f228a) {
                return;
            }
            int i3 = i2 - i;
            byte[] bArr2 = this.f231d;
            int length = bArr2.length;
            int i4 = this.f229b;
            if (length < i4 + i3) {
                this.f231d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f231d, this.f229b, i3);
            this.f229b += i3;
        }

        /* renamed from: b */
        public boolean m41268b(int i, int i2) {
            if (this.f228a) {
                int i3 = this.f229b - i2;
                this.f229b = i3;
                if (this.f230c == 0 && i == 181) {
                    this.f230c = i3;
                } else {
                    this.f228a = false;
                    return true;
                }
            } else if (i == 179) {
                this.f228a = true;
            }
            byte[] bArr = f227e;
            m41269a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: c */
        public void m41267c() {
            this.f228a = false;
            this.f229b = 0;
            this.f230c = 0;
        }
    }

    public C0063n() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair<com.google.android.exoplayer2.Format, java.lang.Long> m41270b(p008a7.C0063n.C0064a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f231d
            int r1 = r8.f229b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 6
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r6 = r4 >> 4
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3d
            r7 = 3
            if (r6 == r7) goto L37
            if (r6 == r1) goto L31
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L31:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L42
        L37:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L42
        L3d:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L42:
            float r6 = (float) r6
            float r1 = r1 / r6
        L44:
            com.google.android.exoplayer2.Format$b r6 = new com.google.android.exoplayer2.Format$b
            r6.<init>()
            com.google.android.exoplayer2.Format$b r9 = r6.m29900S(r9)
            java.lang.String r6 = "video/mpeg2"
            com.google.android.exoplayer2.Format$b r9 = r9.m29883e0(r6)
            com.google.android.exoplayer2.Format$b r9 = r9.m29873j0(r2)
            com.google.android.exoplayer2.Format$b r9 = r9.m29902Q(r4)
            com.google.android.exoplayer2.Format$b r9 = r9.m29891a0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            com.google.android.exoplayer2.Format$b r9 = r9.m29899T(r1)
            com.google.android.exoplayer2.Format r9 = r9.m29914E()
            r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + (-1)
            if (r1 < 0) goto L98
            double[] r2 = p008a7.C0063n.f210q
            int r4 = r2.length
            if (r1 >= r4) goto L98
            r1 = r2[r1]
            int r8 = r8.f230c
            int r8 = r8 + 9
            r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L90
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L90:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto L9a
        L98:
            r0 = 0
        L9a:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p008a7.C0063n.m41270b(a7.n$a, java.lang.String):android.util.Pair");
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: a */
    public void mo41218a(C9208y c9208y) {
        int i;
        int i2;
        C9149a.m16445h(this.f212b);
        int m16093e = c9208y.m16093e();
        int m16092f = c9208y.m16092f();
        byte[] m16094d = c9208y.m16094d();
        this.f218h += c9208y.m16097a();
        this.f212b.mo6170a(c9208y, c9208y.m16097a());
        while (true) {
            int m16142c = C9204w.m16142c(m16094d, m16093e, m16092f, this.f216f);
            if (m16142c == m16092f) {
                break;
            }
            int i3 = m16142c + 3;
            int i4 = c9208y.m16094d()[i3] & 255;
            int i5 = m16142c - m16093e;
            boolean z = false;
            if (!this.f220j) {
                if (i5 > 0) {
                    this.f217g.m41269a(m16094d, m16093e, m16142c);
                }
                if (i5 < 0) {
                    i2 = -i5;
                } else {
                    i2 = 0;
                }
                if (this.f217g.m41268b(i4, i2)) {
                    Pair<Format, Long> m41270b = m41270b(this.f217g, (String) C9149a.m16448e(this.f211a));
                    this.f212b.mo6168c((Format) m41270b.first);
                    this.f221k = ((Long) m41270b.second).longValue();
                    this.f220j = true;
                }
            }
            C0077u c0077u = this.f215e;
            if (c0077u != null) {
                if (i5 > 0) {
                    c0077u.m41210a(m16094d, m16093e, m16142c);
                    i = 0;
                } else {
                    i = -i5;
                }
                if (this.f215e.m41209b(i)) {
                    C0077u c0077u2 = this.f215e;
                    ((C9208y) C9191p0.m16243j(this.f214d)).m16101N(this.f215e.f376d, C9204w.m16134k(c0077u2.f376d, c0077u2.f377e));
                    ((C0060k0) C9191p0.m16243j(this.f213c)).m41273a(this.f224n, this.f214d);
                }
                if (i4 == 178 && c9208y.m16094d()[m16142c + 2] == 1) {
                    this.f215e.m41206e(i4);
                }
            }
            if (i4 != 0 && i4 != 179) {
                if (i4 == 184) {
                    this.f225o = true;
                }
            } else {
                int i6 = m16092f - m16142c;
                if (this.f219i && this.f226p && this.f220j) {
                    this.f212b.mo6162f(this.f224n, this.f225o ? 1 : 0, ((int) (this.f218h - this.f223m)) - i6, i6, null);
                }
                boolean z2 = this.f219i;
                if (!z2 || this.f226p) {
                    this.f223m = this.f218h - i6;
                    long j = this.f222l;
                    if (j == -9223372036854775807L) {
                        if (z2) {
                            j = this.f224n + this.f221k;
                        } else {
                            j = 0;
                        }
                    }
                    this.f224n = j;
                    this.f225o = false;
                    this.f222l = -9223372036854775807L;
                    this.f219i = true;
                }
                if (i4 == 0) {
                    z = true;
                }
                this.f226p = z;
            }
            m16093e = i3;
        }
        if (!this.f220j) {
            this.f217g.m41269a(m16094d, m16093e, m16092f);
        }
        C0077u c0077u3 = this.f215e;
        if (c0077u3 != null) {
            c0077u3.m41210a(m16094d, m16093e, m16092f);
        }
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: c */
    public void mo41216c() {
        C9204w.m16144a(this.f216f);
        this.f217g.m41267c();
        C0077u c0077u = this.f215e;
        if (c0077u != null) {
            c0077u.m41207d();
        }
        this.f218h = 0L;
        this.f219i = false;
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: d */
    public void mo41215d() {
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: e */
    public void mo41214e(InterfaceC11748k interfaceC11748k, InterfaceC0052i0.C0056d c0056d) {
        c0056d.m41289a();
        this.f211a = c0056d.m41288b();
        this.f212b = interfaceC11748k.mo3740e(c0056d.m41287c(), 2);
        C0060k0 c0060k0 = this.f213c;
        if (c0060k0 != null) {
            c0060k0.m41272b(interfaceC11748k, c0056d);
        }
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: f */
    public void mo41213f(long j, int i) {
        this.f222l = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0063n(C0060k0 c0060k0) {
        this.f213c = c0060k0;
        this.f216f = new boolean[4];
        this.f217g = new C0064a(128);
        if (c0060k0 != null) {
            this.f215e = new C0077u(178, 128);
            this.f214d = new C9208y();
            return;
        }
        this.f215e = null;
        this.f214d = null;
    }
}
