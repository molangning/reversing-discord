package p229m7;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import p099f8.InterfaceC6337h;
import p151i6.C7399j;
import p151i6.C7410u;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9200u;
import p228m6.C10271g;
import p229m7.InterfaceC10329p;

/* renamed from: m7.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10287d implements InterfaceC10329p, InterfaceC10329p.InterfaceC10330a {

    /* renamed from: j */
    public final InterfaceC10329p f26804j;

    /* renamed from: k */
    private InterfaceC10329p.InterfaceC10330a f26805k;

    /* renamed from: l */
    private C10288a[] f26806l = new C10288a[0];

    /* renamed from: m */
    private long f26807m;

    /* renamed from: n */
    long f26808n;

    /* renamed from: o */
    long f26809o;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m7.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class C10288a implements InterfaceC10320m0 {

        /* renamed from: j */
        public final InterfaceC10320m0 f26810j;

        /* renamed from: k */
        private boolean f26811k;

        public C10288a(InterfaceC10320m0 interfaceC10320m0) {
            C10287d.this = r1;
            this.f26810j = interfaceC10320m0;
        }

        @Override // p229m7.InterfaceC10320m0
        /* renamed from: a */
        public void mo6236a() {
            this.f26810j.mo6236a();
        }

        /* renamed from: b */
        public void m11937b() {
            this.f26811k = false;
        }

        @Override // p229m7.InterfaceC10320m0
        /* renamed from: e */
        public boolean mo6232e() {
            return !C10287d.this.m11941i() && this.f26810j.mo6232e();
        }

        @Override // p229m7.InterfaceC10320m0
        /* renamed from: i */
        public int mo6231i(C7399j c7399j, C10271g c10271g, boolean z) {
            if (C10287d.this.m11941i()) {
                return -3;
            }
            if (this.f26811k) {
                c10271g.m11986n(4);
                return -4;
            }
            int mo6231i = this.f26810j.mo6231i(c7399j, c10271g, z);
            if (mo6231i == -5) {
                Format format = (Format) C9149a.m16448e(c7399j.f19920b);
                int i = format.f11181K;
                if (i != 0 || format.f11182L != 0) {
                    C10287d c10287d = C10287d.this;
                    int i2 = 0;
                    if (c10287d.f26808n != 0) {
                        i = 0;
                    }
                    if (c10287d.f26809o == Long.MIN_VALUE) {
                        i2 = format.f11182L;
                    }
                    c7399j.f19920b = format.m29926a().m29906M(i).m29905N(i2).m29914E();
                }
                return -5;
            }
            C10287d c10287d2 = C10287d.this;
            long j = c10287d2.f26809o;
            if (j != Long.MIN_VALUE && ((mo6231i == -4 && c10271g.f26745n >= j) || (mo6231i == -3 && c10287d2.mo6194f() == Long.MIN_VALUE && !c10271g.f26744m))) {
                c10271g.mo3126f();
                c10271g.m11986n(4);
                this.f26811k = true;
                return -4;
            }
            return mo6231i;
        }

        @Override // p229m7.InterfaceC10320m0
        /* renamed from: s */
        public int mo6230s(long j) {
            if (C10287d.this.m11941i()) {
                return -3;
            }
            return this.f26810j.mo6230s(j);
        }
    }

    public C10287d(InterfaceC10329p interfaceC10329p, boolean z, long j, long j2) {
        long j3;
        this.f26804j = interfaceC10329p;
        if (z) {
            j3 = j;
        } else {
            j3 = -9223372036854775807L;
        }
        this.f26807m = j3;
        this.f26808n = j;
        this.f26809o = j2;
    }

    /* renamed from: e */
    private C7410u m11942e(long j, C7410u c7410u) {
        long j2;
        long m16225s = C9191p0.m16225s(c7410u.f19931a, 0L, j - this.f26808n);
        long j3 = c7410u.f19932b;
        long j4 = this.f26809o;
        if (j4 == Long.MIN_VALUE) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j4 - j;
        }
        long m16225s2 = C9191p0.m16225s(j3, 0L, j2);
        if (m16225s == c7410u.f19931a && m16225s2 == c7410u.f19932b) {
            return c7410u;
        }
        return new C7410u(m16225s, m16225s2);
    }

    /* renamed from: s */
    private static boolean m11939s(long j, InterfaceC6337h[] interfaceC6337hArr) {
        if (j != 0) {
            for (InterfaceC6337h interfaceC6337h : interfaceC6337hArr) {
                if (interfaceC6337h != null) {
                    Format mo22905p = interfaceC6337h.mo22905p();
                    if (!C9200u.m16169a(mo22905p.f11197u, mo22905p.f11194r)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: b */
    public long mo6201b() {
        long mo6201b = this.f26804j.mo6201b();
        if (mo6201b != Long.MIN_VALUE) {
            long j = this.f26809o;
            if (j == Long.MIN_VALUE || mo6201b < j) {
                return mo6201b;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: c */
    public boolean mo6199c() {
        return this.f26804j.mo6199c();
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: d */
    public boolean mo6197d(long j) {
        return this.f26804j.mo6197d(j);
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: f */
    public long mo6194f() {
        long mo6194f = this.f26804j.mo6194f();
        if (mo6194f != Long.MIN_VALUE) {
            long j = this.f26809o;
            if (j == Long.MIN_VALUE || mo6194f < j) {
                return mo6194f;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: g */
    public long mo6252g(long j, C7410u c7410u) {
        long j2 = this.f26808n;
        if (j == j2) {
            return j2;
        }
        return this.f26804j.mo6252g(j, m11942e(j, c7410u));
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: h */
    public void mo6191h(long j) {
        this.f26804j.mo6191h(j);
    }

    /* renamed from: i */
    boolean m11941i() {
        return this.f26807m != -9223372036854775807L;
    }

    @Override // p229m7.InterfaceC10329p.InterfaceC10330a
    /* renamed from: j */
    public void mo11759j(InterfaceC10329p interfaceC10329p) {
        ((InterfaceC10329p.InterfaceC10330a) C9149a.m16448e(this.f26805k)).mo11759j(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0032, code lost:
        if (r0 > r6) goto L18;
     */
    @Override // p229m7.InterfaceC10329p
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo6250l(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f26807m = r0
            m7.d$a[] r0 = r5.f26806l
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.m11937b()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            m7.p r0 = r5.f26804j
            long r0 = r0.mo6250l(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f26808n
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f26809o
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            p195k8.C9149a.m16447f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p229m7.C10287d.mo6250l(long):long");
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: m */
    public void mo6249m(InterfaceC10329p.InterfaceC10330a interfaceC10330a, long j) {
        this.f26805k = interfaceC10330a;
        this.f26804j.mo6249m(this, j);
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: n */
    public long mo6248n() {
        boolean z;
        if (m11941i()) {
            long j = this.f26807m;
            this.f26807m = -9223372036854775807L;
            long mo6248n = mo6248n();
            if (mo6248n != -9223372036854775807L) {
                return mo6248n;
            }
            return j;
        }
        long mo6248n2 = this.f26804j.mo6248n();
        if (mo6248n2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z2 = true;
        if (mo6248n2 >= this.f26808n) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        long j2 = this.f26809o;
        if (j2 != Long.MIN_VALUE && mo6248n2 > j2) {
            z2 = false;
        }
        C9149a.m16447f(z2);
        return mo6248n2;
    }

    @Override // p229m7.InterfaceC10322n0.InterfaceC10323a
    /* renamed from: p */
    public void mo6251k(InterfaceC10329p interfaceC10329p) {
        ((InterfaceC10329p.InterfaceC10330a) C9149a.m16448e(this.f26805k)).mo6251k(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x005e, code lost:
        if (r2 > r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x006a  */
    @Override // p229m7.InterfaceC10329p
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo6246q(p099f8.InterfaceC6337h[] r13, boolean[] r14, p229m7.InterfaceC10320m0[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            m7.d$a[] r2 = new p229m7.C10287d.C10288a[r2]
            r0.f26806l = r2
            int r2 = r1.length
            m7.m0[] r9 = new p229m7.InterfaceC10320m0[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            m7.d$a[] r3 = r0.f26806l
            r4 = r1[r2]
            m7.d$a r4 = (p229m7.C10287d.C10288a) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            m7.m0 r11 = r4.f26810j
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            m7.p r2 = r0.f26804j
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.mo6246q(r3, r4, r5, r6, r7)
            boolean r4 = r12.m11941i()
            if (r4 == 0) goto L43
            long r4 = r0.f26808n
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            r6 = r13
            boolean r4 = m11939s(r4, r13)
            if (r4 == 0) goto L43
            r4 = r2
            goto L48
        L43:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            r0.f26807m = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L63
            long r4 = r0.f26808n
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L61
            long r4 = r0.f26809o
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L63
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L61
            goto L63
        L61:
            r4 = r10
            goto L64
        L63:
            r4 = 1
        L64:
            p195k8.C9149a.m16447f(r4)
        L67:
            int r4 = r1.length
            if (r10 >= r4) goto L8d
            r4 = r9[r10]
            if (r4 != 0) goto L73
            m7.d$a[] r4 = r0.f26806l
            r4[r10] = r11
            goto L84
        L73:
            m7.d$a[] r5 = r0.f26806l
            r6 = r5[r10]
            if (r6 == 0) goto L7d
            m7.m0 r6 = r6.f26810j
            if (r6 == r4) goto L84
        L7d:
            m7.d$a r6 = new m7.d$a
            r6.<init>(r4)
            r5[r10] = r6
        L84:
            m7.d$a[] r4 = r0.f26806l
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L67
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p229m7.C10287d.mo6246q(f8.h[], boolean[], m7.m0[], boolean[], long):long");
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: r */
    public void mo6245r() {
        this.f26804j.mo6245r();
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: t */
    public TrackGroupArray mo6243t() {
        return this.f26804j.mo6243t();
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: u */
    public void mo6242u(long j, boolean z) {
        this.f26804j.mo6242u(j, z);
    }

    /* renamed from: v */
    public void m11938v(long j, long j2) {
        this.f26808n = j;
        this.f26809o = j2;
    }
}