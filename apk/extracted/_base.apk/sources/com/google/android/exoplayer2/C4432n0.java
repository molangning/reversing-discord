package com.google.android.exoplayer2;

import android.os.Handler;
import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.C4382a;
import gb.AbstractC6693s;
import p195k8.C9149a;
import p229m7.InterfaceC10329p;
import p229m7.InterfaceC10341s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.n0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4432n0 {

    /* renamed from: a */
    private final Timeline.C4378b f11672a = new Timeline.C4378b();

    /* renamed from: b */
    private final Timeline.C4379c f11673b = new Timeline.C4379c();

    /* renamed from: c */
    private final C4382a f11674c;

    /* renamed from: d */
    private final Handler f11675d;

    /* renamed from: e */
    private long f11676e;

    /* renamed from: f */
    private int f11677f;

    /* renamed from: g */
    private boolean f11678g;

    /* renamed from: h */
    private C4423k0 f11679h;

    /* renamed from: i */
    private C4423k0 f11680i;

    /* renamed from: j */
    private C4423k0 f11681j;

    /* renamed from: k */
    private int f11682k;

    /* renamed from: l */
    private Object f11683l;

    /* renamed from: m */
    private long f11684m;

    public C4432n0(C4382a c4382a, Handler handler) {
        this.f11674c = c4382a;
        this.f11675d = handler;
    }

    /* renamed from: A */
    private static InterfaceC10341s.C10342a m29240A(Timeline timeline, Object obj, long j, long j2, Timeline.C4378b c4378b) {
        timeline.mo29711h(obj, c4378b);
        int m29731e = c4378b.m29731e(j);
        if (m29731e == -1) {
            return new InterfaceC10341s.C10342a(obj, j2, c4378b.m29732d(j));
        }
        return new InterfaceC10341s.C10342a(obj, m29731e, c4378b.m29727i(m29731e), j2);
    }

    /* renamed from: B */
    private long m29239B(Timeline timeline, Object obj) {
        int mo11758b;
        int i = timeline.mo29711h(obj, this.f11672a).f11373c;
        Object obj2 = this.f11683l;
        if (obj2 != null && (mo11758b = timeline.mo11758b(obj2)) != -1 && timeline.m29741f(mo11758b, this.f11672a).f11373c == i) {
            return this.f11684m;
        }
        for (C4423k0 c4423k0 = this.f11679h; c4423k0 != null; c4423k0 = c4423k0.m29269j()) {
            if (c4423k0.f11630b.equals(obj)) {
                return c4423k0.f11634f.f11645a.f27019d;
            }
        }
        for (C4423k0 c4423k02 = this.f11679h; c4423k02 != null; c4423k02 = c4423k02.m29269j()) {
            int mo11758b2 = timeline.mo11758b(c4423k02.f11630b);
            if (mo11758b2 != -1 && timeline.m29741f(mo11758b2, this.f11672a).f11373c == i) {
                return c4423k02.f11634f.f11645a.f27019d;
            }
        }
        long j = this.f11676e;
        this.f11676e = 1 + j;
        if (this.f11679h == null) {
            this.f11683l = obj;
            this.f11684m = j;
        }
        return j;
    }

    /* renamed from: D */
    private boolean m29237D(Timeline timeline) {
        C4423k0 c4423k0 = this.f11679h;
        if (c4423k0 == null) {
            return true;
        }
        int mo11758b = timeline.mo11758b(c4423k0.f11630b);
        while (true) {
            mo11758b = timeline.m29742d(mo11758b, this.f11672a, this.f11673b, this.f11677f, this.f11678g);
            while (c4423k0.m29269j() != null && !c4423k0.f11634f.f11650f) {
                c4423k0 = c4423k0.m29269j();
            }
            C4423k0 m29269j = c4423k0.m29269j();
            if (mo11758b == -1 || m29269j == null || timeline.mo11758b(m29269j.f11630b) != mo11758b) {
                break;
            }
            c4423k0 = m29269j;
        }
        boolean m29209y = m29209y(c4423k0);
        c4423k0.f11634f = m29217q(timeline, c4423k0.f11634f);
        return !m29209y;
    }

    /* renamed from: d */
    private boolean m29230d(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    /* renamed from: e */
    private boolean m29229e(C4425l0 c4425l0, C4425l0 c4425l02) {
        return c4425l0.f11646b == c4425l02.f11646b && c4425l0.f11645a.equals(c4425l02.f11645a);
    }

    /* renamed from: h */
    private C4425l0 m29226h(C4444r0 c4444r0) {
        return m29223k(c4444r0.f11715a, c4444r0.f11716b, c4444r0.f11717c, c4444r0.f11732r);
    }

    /* renamed from: i */
    private C4425l0 m29225i(Timeline timeline, C4423k0 c4423k0, long j) {
        long j2;
        C4425l0 c4425l0 = c4423k0.f11634f;
        long m29267l = (c4423k0.m29267l() + c4425l0.f11649e) - j;
        if (c4425l0.f11650f) {
            long j3 = 0;
            int m29742d = timeline.m29742d(timeline.mo11758b(c4425l0.f11645a.f27016a), this.f11672a, this.f11673b, this.f11677f, this.f11678g);
            if (m29742d == -1) {
                return null;
            }
            int i = timeline.mo11757g(m29742d, this.f11672a, true).f11373c;
            Object obj = this.f11672a.f11372b;
            long j4 = c4425l0.f11645a.f27019d;
            if (timeline.m29738n(i, this.f11673b).f11391m == m29742d) {
                Pair<Object, Long> m29739k = timeline.m29739k(this.f11673b, this.f11672a, i, -9223372036854775807L, Math.max(0L, m29267l));
                if (m29739k == null) {
                    return null;
                }
                obj = m29739k.first;
                long longValue = ((Long) m29739k.second).longValue();
                C4423k0 m29269j = c4423k0.m29269j();
                if (m29269j != null && m29269j.f11630b.equals(obj)) {
                    j4 = m29269j.f11634f.f11645a.f27019d;
                } else {
                    j4 = this.f11676e;
                    this.f11676e = 1 + j4;
                }
                j2 = longValue;
                j3 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            return m29223k(timeline, m29240A(timeline, obj, j2, j4, this.f11672a), j3, j2);
        }
        InterfaceC10341s.C10342a c10342a = c4425l0.f11645a;
        timeline.mo29711h(c10342a.f27016a, this.f11672a);
        if (c10342a.m11751b()) {
            int i2 = c10342a.f27017b;
            int m29735a = this.f11672a.m29735a(i2);
            if (m29735a == -1) {
                return null;
            }
            int m29726j = this.f11672a.m29726j(i2, c10342a.f27018c);
            if (m29726j < m29735a) {
                return m29222l(timeline, c10342a.f27016a, i2, m29726j, c4425l0.f11647c, c10342a.f27019d);
            }
            long j5 = c4425l0.f11647c;
            if (j5 == -9223372036854775807L) {
                Timeline.C4379c c4379c = this.f11673b;
                Timeline.C4378b c4378b = this.f11672a;
                Pair<Object, Long> m29739k2 = timeline.m29739k(c4379c, c4378b, c4378b.f11373c, -9223372036854775807L, Math.max(0L, m29267l));
                if (m29739k2 == null) {
                    return null;
                }
                j5 = ((Long) m29739k2.second).longValue();
            }
            return m29221m(timeline, c10342a.f27016a, j5, c4425l0.f11647c, c10342a.f27019d);
        }
        int m29731e = this.f11672a.m29731e(c4425l0.f11648d);
        if (m29731e == -1) {
            Object obj2 = c10342a.f27016a;
            long j6 = c4425l0.f11649e;
            return m29221m(timeline, obj2, j6, j6, c10342a.f27019d);
        }
        return m29222l(timeline, c10342a.f27016a, m29731e, this.f11672a.m29727i(m29731e), c4425l0.f11649e, c10342a.f27019d);
    }

    /* renamed from: k */
    private C4425l0 m29223k(Timeline timeline, InterfaceC10341s.C10342a c10342a, long j, long j2) {
        timeline.mo29711h(c10342a.f27016a, this.f11672a);
        if (c10342a.m11751b()) {
            return m29222l(timeline, c10342a.f27016a, c10342a.f27017b, c10342a.f27018c, j, c10342a.f27019d);
        }
        return m29221m(timeline, c10342a.f27016a, j2, j, c10342a.f27019d);
    }

    /* renamed from: l */
    private C4425l0 m29222l(Timeline timeline, Object obj, int i, int i2, long j, long j2) {
        long j3;
        long j4;
        InterfaceC10341s.C10342a c10342a = new InterfaceC10341s.C10342a(obj, i, i2, j2);
        long m29734b = timeline.mo29711h(c10342a.f27016a, this.f11672a).m29734b(c10342a.f27017b, c10342a.f27018c);
        if (i2 == this.f11672a.m29727i(i)) {
            j3 = this.f11672a.m29729g();
        } else {
            j3 = 0;
        }
        if (m29734b != -9223372036854775807L && j3 >= m29734b) {
            j4 = Math.max(0L, m29734b - 1);
        } else {
            j4 = j3;
        }
        return new C4425l0(c10342a, j4, j, -9223372036854775807L, m29734b, false, false, false);
    }

    /* renamed from: m */
    private C4425l0 m29221m(Timeline timeline, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6 = j;
        timeline.mo29711h(obj, this.f11672a);
        int m29732d = this.f11672a.m29732d(j6);
        InterfaceC10341s.C10342a c10342a = new InterfaceC10341s.C10342a(obj, j3, m29732d);
        boolean m29216r = m29216r(c10342a);
        boolean m29214t = m29214t(timeline, c10342a);
        boolean m29215s = m29215s(timeline, c10342a, m29216r);
        if (m29732d != -1) {
            j4 = this.f11672a.m29730f(m29732d);
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L && j4 != Long.MIN_VALUE) {
            j5 = j4;
        } else {
            j5 = this.f11672a.f11374d;
        }
        if (j5 != -9223372036854775807L && j6 >= j5) {
            j6 = Math.max(0L, j5 - 1);
        }
        return new C4425l0(c10342a, j6, j2, j4, j5, m29216r, m29214t, m29215s);
    }

    /* renamed from: r */
    private boolean m29216r(InterfaceC10341s.C10342a c10342a) {
        return !c10342a.m11751b() && c10342a.f27020e == -1;
    }

    /* renamed from: s */
    private boolean m29215s(Timeline timeline, InterfaceC10341s.C10342a c10342a, boolean z) {
        int mo11758b = timeline.mo11758b(c10342a.f27016a);
        if (!timeline.m29738n(timeline.m29741f(mo11758b, this.f11672a).f11373c, this.f11673b).f11387i && timeline.m29736r(mo11758b, this.f11672a, this.f11673b, this.f11677f, this.f11678g) && z) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private boolean m29214t(Timeline timeline, InterfaceC10341s.C10342a c10342a) {
        if (!m29216r(c10342a)) {
            return false;
        }
        int i = timeline.mo29711h(c10342a.f27016a, this.f11672a).f11373c;
        if (timeline.m29738n(i, this.f11673b).f11392n != timeline.mo11758b(c10342a.f27016a)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m29212v(AbstractC6693s.C6694a c6694a, InterfaceC10341s.C10342a c10342a) {
        this.f11674c.m29634Z1(c6694a.m22127e(), c10342a);
    }

    /* renamed from: w */
    private void m29211w() {
        final InterfaceC10341s.C10342a c10342a;
        if (this.f11674c != null) {
            final AbstractC6693s.C6694a m22136s = AbstractC6693s.m22136s();
            for (C4423k0 c4423k0 = this.f11679h; c4423k0 != null; c4423k0 = c4423k0.m29269j()) {
                m22136s.m22128d(c4423k0.f11634f.f11645a);
            }
            C4423k0 c4423k02 = this.f11680i;
            if (c4423k02 == null) {
                c10342a = null;
            } else {
                c10342a = c4423k02.f11634f.f11645a;
            }
            this.f11675d.post(new Runnable() { // from class: com.google.android.exoplayer2.m0
                @Override // java.lang.Runnable
                public final void run() {
                    C4432n0.this.m29212v(m22136s, c10342a);
                }
            });
        }
    }

    /* renamed from: C */
    public boolean m29238C() {
        C4423k0 c4423k0 = this.f11681j;
        if (c4423k0 != null && (c4423k0.f11634f.f11652h || !c4423k0.m29262q() || this.f11681j.f11634f.f11649e == -9223372036854775807L || this.f11682k >= 100)) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public boolean m29236E(Timeline timeline, long j, long j2) {
        C4425l0 c4425l0;
        long m29253z;
        boolean z;
        C4423k0 c4423k0 = null;
        for (C4423k0 c4423k02 = this.f11679h; c4423k02 != null; c4423k02 = c4423k02.m29269j()) {
            C4425l0 c4425l02 = c4423k02.f11634f;
            if (c4423k0 == null) {
                c4425l0 = m29217q(timeline, c4425l02);
            } else {
                C4425l0 m29225i = m29225i(timeline, c4423k0, j);
                if (m29225i == null) {
                    return !m29209y(c4423k0);
                }
                if (!m29229e(c4425l02, m29225i)) {
                    return !m29209y(c4423k0);
                }
                c4425l0 = m29225i;
            }
            c4423k02.f11634f = c4425l0.m29252a(c4425l02.f11647c);
            if (!m29230d(c4425l02.f11649e, c4425l0.f11649e)) {
                long j3 = c4425l0.f11649e;
                if (j3 == -9223372036854775807L) {
                    m29253z = Long.MAX_VALUE;
                } else {
                    m29253z = c4423k02.m29253z(j3);
                }
                if (c4423k02 == this.f11680i && (j2 == Long.MIN_VALUE || j2 >= m29253z)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!m29209y(c4423k02) && !z) {
                    return true;
                }
                return false;
            }
            c4423k0 = c4423k02;
        }
        return true;
    }

    /* renamed from: F */
    public boolean m29235F(Timeline timeline, int i) {
        this.f11677f = i;
        return m29237D(timeline);
    }

    /* renamed from: G */
    public boolean m29234G(Timeline timeline, boolean z) {
        this.f11678g = z;
        return m29237D(timeline);
    }

    /* renamed from: b */
    public C4423k0 m29232b() {
        C4423k0 c4423k0 = this.f11679h;
        if (c4423k0 == null) {
            return null;
        }
        if (c4423k0 == this.f11680i) {
            this.f11680i = c4423k0.m29269j();
        }
        this.f11679h.m29259t();
        int i = this.f11682k - 1;
        this.f11682k = i;
        if (i == 0) {
            this.f11681j = null;
            C4423k0 c4423k02 = this.f11679h;
            this.f11683l = c4423k02.f11630b;
            this.f11684m = c4423k02.f11634f.f11645a.f27019d;
        }
        this.f11679h = this.f11679h.m29269j();
        m29211w();
        return this.f11679h;
    }

    /* renamed from: c */
    public C4423k0 m29231c() {
        boolean z;
        C4423k0 c4423k0 = this.f11680i;
        if (c4423k0 != null && c4423k0.m29269j() != null) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        this.f11680i = this.f11680i.m29269j();
        m29211w();
        return this.f11680i;
    }

    /* renamed from: f */
    public void m29228f() {
        if (this.f11682k == 0) {
            return;
        }
        C4423k0 c4423k0 = (C4423k0) C9149a.m16445h(this.f11679h);
        this.f11683l = c4423k0.f11630b;
        this.f11684m = c4423k0.f11634f.f11645a.f27019d;
        while (c4423k0 != null) {
            c4423k0.m29259t();
            c4423k0 = c4423k0.m29269j();
        }
        this.f11679h = null;
        this.f11681j = null;
        this.f11680i = null;
        this.f11682k = 0;
        m29211w();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r1 != (-9223372036854775807L)) goto L7;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.C4423k0 m29227g(p151i6.InterfaceC7407r[] r12, p099f8.AbstractC6347m r13, p153i8.InterfaceC7440b r14, com.google.android.exoplayer2.C4438q0 r15, com.google.android.exoplayer2.C4425l0 r16, p099f8.C6349n r17) {
        /*
            r11 = this;
            r0 = r11
            r8 = r16
            com.google.android.exoplayer2.k0 r1 = r0.f11681j
            if (r1 != 0) goto L1e
            m7.s$a r1 = r8.f11645a
            boolean r1 = r1.m11751b()
            if (r1 == 0) goto L1b
            long r1 = r8.f11647c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L1b
            goto L2c
        L1b:
            r1 = 0
            goto L2c
        L1e:
            long r1 = r1.m29267l()
            com.google.android.exoplayer2.k0 r3 = r0.f11681j
            com.google.android.exoplayer2.l0 r3 = r3.f11634f
            long r3 = r3.f11649e
            long r1 = r1 + r3
            long r3 = r8.f11646b
            long r1 = r1 - r3
        L2c:
            r3 = r1
            com.google.android.exoplayer2.k0 r10 = new com.google.android.exoplayer2.k0
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            com.google.android.exoplayer2.k0 r1 = r0.f11681j
            if (r1 == 0) goto L43
            r1.m29256w(r10)
            goto L47
        L43:
            r0.f11679h = r10
            r0.f11680i = r10
        L47:
            r1 = 0
            r0.f11683l = r1
            r0.f11681j = r10
            int r1 = r0.f11682k
            int r1 = r1 + 1
            r0.f11682k = r1
            r11.m29211w()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C4432n0.m29227g(i6.r[], f8.m, i8.b, com.google.android.exoplayer2.q0, com.google.android.exoplayer2.l0, f8.n):com.google.android.exoplayer2.k0");
    }

    /* renamed from: j */
    public C4423k0 m29224j() {
        return this.f11681j;
    }

    /* renamed from: n */
    public C4425l0 m29220n(long j, C4444r0 c4444r0) {
        C4423k0 c4423k0 = this.f11681j;
        if (c4423k0 == null) {
            return m29226h(c4444r0);
        }
        return m29225i(c4444r0.f11715a, c4423k0, j);
    }

    /* renamed from: o */
    public C4423k0 m29219o() {
        return this.f11679h;
    }

    /* renamed from: p */
    public C4423k0 m29218p() {
        return this.f11680i;
    }

    /* renamed from: q */
    public C4425l0 m29217q(Timeline timeline, C4425l0 c4425l0) {
        long j;
        InterfaceC10341s.C10342a c10342a = c4425l0.f11645a;
        boolean m29216r = m29216r(c10342a);
        boolean m29214t = m29214t(timeline, c10342a);
        boolean m29215s = m29215s(timeline, c10342a, m29216r);
        timeline.mo29711h(c4425l0.f11645a.f27016a, this.f11672a);
        if (c10342a.m11751b()) {
            j = this.f11672a.m29734b(c10342a.f27017b, c10342a.f27018c);
        } else {
            j = c4425l0.f11648d;
            if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
                j = this.f11672a.m29728h();
            }
        }
        return new C4425l0(c10342a, c4425l0.f11646b, c4425l0.f11647c, c4425l0.f11648d, j, m29216r, m29214t, m29215s);
    }

    /* renamed from: u */
    public boolean m29213u(InterfaceC10329p interfaceC10329p) {
        C4423k0 c4423k0 = this.f11681j;
        return c4423k0 != null && c4423k0.f11629a == interfaceC10329p;
    }

    /* renamed from: x */
    public void m29210x(long j) {
        C4423k0 c4423k0 = this.f11681j;
        if (c4423k0 != null) {
            c4423k0.m29260s(j);
        }
    }

    /* renamed from: y */
    public boolean m29209y(C4423k0 c4423k0) {
        boolean z;
        boolean z2 = false;
        if (c4423k0 != null) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        if (c4423k0.equals(this.f11681j)) {
            return false;
        }
        this.f11681j = c4423k0;
        while (c4423k0.m29269j() != null) {
            c4423k0 = c4423k0.m29269j();
            if (c4423k0 == this.f11680i) {
                this.f11680i = this.f11679h;
                z2 = true;
            }
            c4423k0.m29259t();
            this.f11682k--;
        }
        this.f11681j.m29256w(null);
        m29211w();
        return z2;
    }

    /* renamed from: z */
    public InterfaceC10341s.C10342a m29208z(Timeline timeline, Object obj, long j) {
        return m29240A(timeline, obj, j, m29239B(timeline, obj), this.f11672a);
    }
}
