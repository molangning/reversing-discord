package p008a7;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p008a7.InterfaceC0052i0;
import p195k8.C9149a;
import p195k8.C9157d;
import p195k8.C9191p0;
import p195k8.C9204w;
import p195k8.C9208y;
import p195k8.C9209z;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11748k;

/* renamed from: a7.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0068p implements InterfaceC0062m {

    /* renamed from: a */
    private final C0039d0 f258a;

    /* renamed from: b */
    private final boolean f259b;

    /* renamed from: c */
    private final boolean f260c;

    /* renamed from: g */
    private long f264g;

    /* renamed from: i */
    private String f266i;

    /* renamed from: j */
    private InterfaceC11732b0 f267j;

    /* renamed from: k */
    private C0070b f268k;

    /* renamed from: l */
    private boolean f269l;

    /* renamed from: m */
    private long f270m;

    /* renamed from: n */
    private boolean f271n;

    /* renamed from: h */
    private final boolean[] f265h = new boolean[3];

    /* renamed from: d */
    private final C0077u f261d = new C0077u(7, 128);

    /* renamed from: e */
    private final C0077u f262e = new C0077u(8, 128);

    /* renamed from: f */
    private final C0077u f263f = new C0077u(6, 128);

    /* renamed from: o */
    private final C9208y f272o = new C9208y();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a7.p$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C0070b {

        /* renamed from: a */
        private final InterfaceC11732b0 f273a;

        /* renamed from: b */
        private final boolean f274b;

        /* renamed from: c */
        private final boolean f275c;

        /* renamed from: f */
        private final C9209z f278f;

        /* renamed from: g */
        private byte[] f279g;

        /* renamed from: h */
        private int f280h;

        /* renamed from: i */
        private int f281i;

        /* renamed from: j */
        private long f282j;

        /* renamed from: k */
        private boolean f283k;

        /* renamed from: l */
        private long f284l;

        /* renamed from: o */
        private boolean f287o;

        /* renamed from: p */
        private long f288p;

        /* renamed from: q */
        private long f289q;

        /* renamed from: r */
        private boolean f290r;

        /* renamed from: d */
        private final SparseArray<C9204w.C9206b> f276d = new SparseArray<>();

        /* renamed from: e */
        private final SparseArray<C9204w.C9205a> f277e = new SparseArray<>();

        /* renamed from: m */
        private C0071a f285m = new C0071a();

        /* renamed from: n */
        private C0071a f286n = new C0071a();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a7.p$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static final class C0071a {

            /* renamed from: a */
            private boolean f291a;

            /* renamed from: b */
            private boolean f292b;

            /* renamed from: c */
            private C9204w.C9206b f293c;

            /* renamed from: d */
            private int f294d;

            /* renamed from: e */
            private int f295e;

            /* renamed from: f */
            private int f296f;

            /* renamed from: g */
            private int f297g;

            /* renamed from: h */
            private boolean f298h;

            /* renamed from: i */
            private boolean f299i;

            /* renamed from: j */
            private boolean f300j;

            /* renamed from: k */
            private boolean f301k;

            /* renamed from: l */
            private int f302l;

            /* renamed from: m */
            private int f303m;

            /* renamed from: n */
            private int f304n;

            /* renamed from: o */
            private int f305o;

            /* renamed from: p */
            private int f306p;

            private C0071a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: c */
            public boolean m41244c(C0071a c0071a) {
                int i;
                int i2;
                int i3;
                boolean z;
                if (!this.f291a) {
                    return false;
                }
                if (!c0071a.f291a) {
                    return true;
                }
                C9204w.C9206b c9206b = (C9204w.C9206b) C9149a.m16445h(this.f293c);
                C9204w.C9206b c9206b2 = (C9204w.C9206b) C9149a.m16445h(c0071a.f293c);
                if (this.f296f == c0071a.f296f && this.f297g == c0071a.f297g && this.f298h == c0071a.f298h && ((!this.f299i || !c0071a.f299i || this.f300j == c0071a.f300j) && (((i = this.f294d) == (i2 = c0071a.f294d) || (i != 0 && i2 != 0)) && (((i3 = c9206b.f24227k) != 0 || c9206b2.f24227k != 0 || (this.f303m == c0071a.f303m && this.f304n == c0071a.f304n)) && ((i3 != 1 || c9206b2.f24227k != 1 || (this.f305o == c0071a.f305o && this.f306p == c0071a.f306p)) && (z = this.f301k) == c0071a.f301k && (!z || this.f302l == c0071a.f302l)))))) {
                    return false;
                }
                return true;
            }

            /* renamed from: b */
            public void m41245b() {
                this.f292b = false;
                this.f291a = false;
            }

            /* renamed from: d */
            public boolean m41243d() {
                int i;
                return this.f292b && ((i = this.f295e) == 7 || i == 2);
            }

            /* renamed from: e */
            public void m41242e(C9204w.C9206b c9206b, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f293c = c9206b;
                this.f294d = i;
                this.f295e = i2;
                this.f296f = i3;
                this.f297g = i4;
                this.f298h = z;
                this.f299i = z2;
                this.f300j = z3;
                this.f301k = z4;
                this.f302l = i5;
                this.f303m = i6;
                this.f304n = i7;
                this.f305o = i8;
                this.f306p = i9;
                this.f291a = true;
                this.f292b = true;
            }

            /* renamed from: f */
            public void m41241f(int i) {
                this.f295e = i;
                this.f292b = true;
            }
        }

        public C0070b(InterfaceC11732b0 interfaceC11732b0, boolean z, boolean z2) {
            this.f273a = interfaceC11732b0;
            this.f274b = z;
            this.f275c = z2;
            byte[] bArr = new byte[128];
            this.f279g = bArr;
            this.f278f = new C9209z(bArr, 0, 0);
            m41248g();
        }

        /* renamed from: d */
        private void m41251d(int i) {
            boolean z = this.f290r;
            this.f273a.mo6162f(this.f289q, z ? 1 : 0, (int) (this.f282j - this.f288p), i, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0152  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m41254a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 414
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p008a7.C0068p.C0070b.m41254a(byte[], int, int):void");
        }

        /* renamed from: b */
        public boolean m41253b(long j, int i, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.f281i == 9 || (this.f275c && this.f286n.m41244c(this.f285m))) {
                if (z && this.f287o) {
                    m41251d(i + ((int) (j - this.f282j)));
                }
                this.f288p = this.f282j;
                this.f289q = this.f284l;
                this.f290r = false;
                this.f287o = true;
            }
            if (this.f274b) {
                z2 = this.f286n.m41243d();
            }
            boolean z4 = this.f290r;
            int i2 = this.f281i;
            if (i2 == 5 || (z2 && i2 == 1)) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            this.f290r = z5;
            return z5;
        }

        /* renamed from: c */
        public boolean m41252c() {
            return this.f275c;
        }

        /* renamed from: e */
        public void m41250e(C9204w.C9205a c9205a) {
            this.f277e.append(c9205a.f24214a, c9205a);
        }

        /* renamed from: f */
        public void m41249f(C9204w.C9206b c9206b) {
            this.f276d.append(c9206b.f24220d, c9206b);
        }

        /* renamed from: g */
        public void m41248g() {
            this.f283k = false;
            this.f287o = false;
            this.f286n.m41245b();
        }

        /* renamed from: h */
        public void m41247h(long j, int i, long j2) {
            this.f281i = i;
            this.f284l = j2;
            this.f282j = j;
            if (!this.f274b || i != 1) {
                if (this.f275c) {
                    if (i != 5 && i != 1 && i != 2) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C0071a c0071a = this.f285m;
            this.f285m = this.f286n;
            this.f286n = c0071a;
            c0071a.m41245b();
            this.f280h = 0;
            this.f283k = true;
        }
    }

    public C0068p(C0039d0 c0039d0, boolean z, boolean z2) {
        this.f258a = c0039d0;
        this.f259b = z;
        this.f260c = z2;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    /* renamed from: b */
    private void m41258b() {
        C9149a.m16445h(this.f267j);
        C9191p0.m16243j(this.f268k);
    }

    @RequiresNonNull({"output", "sampleReader"})
    /* renamed from: g */
    private void m41257g(long j, int i, int i2, long j2) {
        if (!this.f269l || this.f268k.m41252c()) {
            this.f261d.m41209b(i2);
            this.f262e.m41209b(i2);
            if (!this.f269l) {
                if (this.f261d.m41208c() && this.f262e.m41208c()) {
                    ArrayList arrayList = new ArrayList();
                    C0077u c0077u = this.f261d;
                    arrayList.add(Arrays.copyOf(c0077u.f376d, c0077u.f377e));
                    C0077u c0077u2 = this.f262e;
                    arrayList.add(Arrays.copyOf(c0077u2.f376d, c0077u2.f377e));
                    C0077u c0077u3 = this.f261d;
                    C9204w.C9206b m16136i = C9204w.m16136i(c0077u3.f376d, 3, c0077u3.f377e);
                    C0077u c0077u4 = this.f262e;
                    C9204w.C9205a m16137h = C9204w.m16137h(c0077u4.f376d, 3, c0077u4.f377e);
                    this.f267j.mo6168c(new Format.C4362b().m29900S(this.f266i).m29883e0("video/avc").m29910I(C9157d.m16431a(m16136i.f24217a, m16136i.f24218b, m16136i.f24219c)).m29873j0(m16136i.f24221e).m29902Q(m16136i.f24222f).m29891a0(m16136i.f24223g).m29899T(arrayList).m29914E());
                    this.f269l = true;
                    this.f268k.m41249f(m16136i);
                    this.f268k.m41250e(m16137h);
                    this.f261d.m41207d();
                    this.f262e.m41207d();
                }
            } else if (this.f261d.m41208c()) {
                C0077u c0077u5 = this.f261d;
                this.f268k.m41249f(C9204w.m16136i(c0077u5.f376d, 3, c0077u5.f377e));
                this.f261d.m41207d();
            } else if (this.f262e.m41208c()) {
                C0077u c0077u6 = this.f262e;
                this.f268k.m41250e(C9204w.m16137h(c0077u6.f376d, 3, c0077u6.f377e));
                this.f262e.m41207d();
            }
        }
        if (this.f263f.m41209b(i2)) {
            C0077u c0077u7 = this.f263f;
            this.f272o.m16101N(this.f263f.f376d, C9204w.m16134k(c0077u7.f376d, c0077u7.f377e));
            this.f272o.m16099P(4);
            this.f258a.m41354a(j2, this.f272o);
        }
        if (this.f268k.m41253b(j, i, this.f269l, this.f271n)) {
            this.f271n = false;
        }
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: h */
    private void m41256h(byte[] bArr, int i, int i2) {
        if (!this.f269l || this.f268k.m41252c()) {
            this.f261d.m41210a(bArr, i, i2);
            this.f262e.m41210a(bArr, i, i2);
        }
        this.f263f.m41210a(bArr, i, i2);
        this.f268k.m41254a(bArr, i, i2);
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: i */
    private void m41255i(long j, int i, long j2) {
        if (!this.f269l || this.f268k.m41252c()) {
            this.f261d.m41206e(i);
            this.f262e.m41206e(i);
        }
        this.f263f.m41206e(i);
        this.f268k.m41247h(j, i, j2);
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: a */
    public void mo41218a(C9208y c9208y) {
        int i;
        m41258b();
        int m16093e = c9208y.m16093e();
        int m16092f = c9208y.m16092f();
        byte[] m16094d = c9208y.m16094d();
        this.f264g += c9208y.m16097a();
        this.f267j.mo6170a(c9208y, c9208y.m16097a());
        while (true) {
            int m16142c = C9204w.m16142c(m16094d, m16093e, m16092f, this.f265h);
            if (m16142c == m16092f) {
                m41256h(m16094d, m16093e, m16092f);
                return;
            }
            int m16139f = C9204w.m16139f(m16094d, m16142c);
            int i2 = m16142c - m16093e;
            if (i2 > 0) {
                m41256h(m16094d, m16093e, m16142c);
            }
            int i3 = m16092f - m16142c;
            long j = this.f264g - i3;
            if (i2 < 0) {
                i = -i2;
            } else {
                i = 0;
            }
            m41257g(j, i3, i, this.f270m);
            m41255i(j, m16139f, this.f270m);
            m16093e = m16142c + 3;
        }
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: c */
    public void mo41216c() {
        this.f264g = 0L;
        this.f271n = false;
        C9204w.m16144a(this.f265h);
        this.f261d.m41207d();
        this.f262e.m41207d();
        this.f263f.m41207d();
        C0070b c0070b = this.f268k;
        if (c0070b != null) {
            c0070b.m41248g();
        }
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: d */
    public void mo41215d() {
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: e */
    public void mo41214e(InterfaceC11748k interfaceC11748k, InterfaceC0052i0.C0056d c0056d) {
        c0056d.m41289a();
        this.f266i = c0056d.m41288b();
        InterfaceC11732b0 mo3740e = interfaceC11748k.mo3740e(c0056d.m41287c(), 2);
        this.f267j = mo3740e;
        this.f268k = new C0070b(mo3740e, this.f259b, this.f260c);
        this.f258a.m41353b(interfaceC11748k, c0056d);
    }

    @Override // p008a7.InterfaceC0062m
    /* renamed from: f */
    public void mo41213f(long j, int i) {
        boolean z;
        this.f270m = j;
        boolean z2 = this.f271n;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f271n = z2 | z;
    }
}
