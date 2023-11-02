package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import p099f8.AbstractC6347m;
import p099f8.C6349n;
import p099f8.InterfaceC6337h;
import p151i6.InterfaceC7407r;
import p153i8.InterfaceC7440b;
import p195k8.C9149a;
import p195k8.C9197r;
import p229m7.C10287d;
import p229m7.C10311k;
import p229m7.InterfaceC10320m0;
import p229m7.InterfaceC10329p;
import p229m7.InterfaceC10341s;

/* renamed from: com.google.android.exoplayer2.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4423k0 {

    /* renamed from: a */
    public final InterfaceC10329p f11629a;

    /* renamed from: b */
    public final Object f11630b;

    /* renamed from: c */
    public final InterfaceC10320m0[] f11631c;

    /* renamed from: d */
    public boolean f11632d;

    /* renamed from: e */
    public boolean f11633e;

    /* renamed from: f */
    public C4425l0 f11634f;

    /* renamed from: g */
    public boolean f11635g;

    /* renamed from: h */
    private final boolean[] f11636h;

    /* renamed from: i */
    private final InterfaceC7407r[] f11637i;

    /* renamed from: j */
    private final AbstractC6347m f11638j;

    /* renamed from: k */
    private final C4438q0 f11639k;

    /* renamed from: l */
    private C4423k0 f11640l;

    /* renamed from: m */
    private TrackGroupArray f11641m;

    /* renamed from: n */
    private C6349n f11642n;

    /* renamed from: o */
    private long f11643o;

    public C4423k0(InterfaceC7407r[] interfaceC7407rArr, long j, AbstractC6347m abstractC6347m, InterfaceC7440b interfaceC7440b, C4438q0 c4438q0, C4425l0 c4425l0, C6349n c6349n) {
        this.f11637i = interfaceC7407rArr;
        this.f11643o = j;
        this.f11638j = abstractC6347m;
        this.f11639k = c4438q0;
        InterfaceC10341s.C10342a c10342a = c4425l0.f11645a;
        this.f11630b = c10342a.f27016a;
        this.f11634f = c4425l0;
        this.f11641m = TrackGroupArray.f11763m;
        this.f11642n = c6349n;
        this.f11631c = new InterfaceC10320m0[interfaceC7407rArr.length];
        this.f11636h = new boolean[interfaceC7407rArr.length];
        this.f11629a = m29274e(c10342a, c4438q0, interfaceC7440b, c4425l0.f11646b, c4425l0.f11648d);
    }

    /* renamed from: c */
    private void m29276c(InterfaceC10320m0[] interfaceC10320m0Arr) {
        int i = 0;
        while (true) {
            InterfaceC7407r[] interfaceC7407rArr = this.f11637i;
            if (i < interfaceC7407rArr.length) {
                if (interfaceC7407rArr[i].mo20720d() == 7 && this.f11642n.m22873c(i)) {
                    interfaceC10320m0Arr[i] = new C10311k();
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    private static InterfaceC10329p m29274e(InterfaceC10341s.C10342a c10342a, C4438q0 c4438q0, InterfaceC7440b interfaceC7440b, long j, long j2) {
        InterfaceC10329p m29196h = c4438q0.m29196h(c10342a, interfaceC7440b, j);
        if (j2 != -9223372036854775807L && j2 != Long.MIN_VALUE) {
            return new C10287d(m29196h, true, 0L, j2);
        }
        return m29196h;
    }

    /* renamed from: f */
    private void m29273f() {
        if (!m29261r()) {
            return;
        }
        int i = 0;
        while (true) {
            C6349n c6349n = this.f11642n;
            if (i < c6349n.f17988a) {
                boolean m22873c = c6349n.m22873c(i);
                InterfaceC6337h interfaceC6337h = this.f11642n.f17990c[i];
                if (m22873c && interfaceC6337h != null) {
                    interfaceC6337h.disable();
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    private void m29272g(InterfaceC10320m0[] interfaceC10320m0Arr) {
        int i = 0;
        while (true) {
            InterfaceC7407r[] interfaceC7407rArr = this.f11637i;
            if (i < interfaceC7407rArr.length) {
                if (interfaceC7407rArr[i].mo20720d() == 7) {
                    interfaceC10320m0Arr[i] = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    private void m29271h() {
        if (!m29261r()) {
            return;
        }
        int i = 0;
        while (true) {
            C6349n c6349n = this.f11642n;
            if (i < c6349n.f17988a) {
                boolean m22873c = c6349n.m22873c(i);
                InterfaceC6337h interfaceC6337h = this.f11642n.f17990c[i];
                if (m22873c && interfaceC6337h != null) {
                    interfaceC6337h.enable();
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: r */
    private boolean m29261r() {
        return this.f11640l == null;
    }

    /* renamed from: u */
    private static void m29258u(long j, C4438q0 c4438q0, InterfaceC10329p interfaceC10329p) {
        try {
            if (j != -9223372036854775807L && j != Long.MIN_VALUE) {
                c4438q0.m29178z(((C10287d) interfaceC10329p).f26804j);
            } else {
                c4438q0.m29178z(interfaceC10329p);
            }
        } catch (RuntimeException e) {
            C9197r.m16182d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* renamed from: a */
    public long m29278a(C6349n c6349n, long j, boolean z) {
        return m29277b(c6349n, j, z, new boolean[this.f11637i.length]);
    }

    /* renamed from: b */
    public long m29277b(C6349n c6349n, long j, boolean z, boolean[] zArr) {
        boolean z2;
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= c6349n.f17988a) {
                break;
            }
            boolean[] zArr2 = this.f11636h;
            if (z || !c6349n.m22874b(this.f11642n, i)) {
                z3 = false;
            }
            zArr2[i] = z3;
            i++;
        }
        m29272g(this.f11631c);
        m29273f();
        this.f11642n = c6349n;
        m29271h();
        long mo6246q = this.f11629a.mo6246q(c6349n.f17990c, this.f11636h, this.f11631c, zArr, j);
        m29276c(this.f11631c);
        this.f11633e = false;
        int i2 = 0;
        while (true) {
            InterfaceC10320m0[] interfaceC10320m0Arr = this.f11631c;
            if (i2 < interfaceC10320m0Arr.length) {
                if (interfaceC10320m0Arr[i2] != null) {
                    C9149a.m16447f(c6349n.m22873c(i2));
                    if (this.f11637i[i2].mo20720d() != 7) {
                        this.f11633e = true;
                    }
                } else {
                    if (c6349n.f17990c[i2] == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C9149a.m16447f(z2);
                }
                i2++;
            } else {
                return mo6246q;
            }
        }
    }

    /* renamed from: d */
    public void m29275d(long j) {
        C9149a.m16447f(m29261r());
        this.f11629a.mo6197d(m29254y(j));
    }

    /* renamed from: i */
    public long m29270i() {
        long j;
        if (!this.f11632d) {
            return this.f11634f.f11646b;
        }
        if (this.f11633e) {
            j = this.f11629a.mo6194f();
        } else {
            j = Long.MIN_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return this.f11634f.f11649e;
        }
        return j;
    }

    /* renamed from: j */
    public C4423k0 m29269j() {
        return this.f11640l;
    }

    /* renamed from: k */
    public long m29268k() {
        if (this.f11632d) {
            return this.f11629a.mo6201b();
        }
        return 0L;
    }

    /* renamed from: l */
    public long m29267l() {
        return this.f11643o;
    }

    /* renamed from: m */
    public long m29266m() {
        return this.f11634f.f11646b + this.f11643o;
    }

    /* renamed from: n */
    public TrackGroupArray m29265n() {
        return this.f11641m;
    }

    /* renamed from: o */
    public C6349n m29264o() {
        return this.f11642n;
    }

    /* renamed from: p */
    public void m29263p(float f, Timeline timeline) {
        this.f11632d = true;
        this.f11641m = this.f11629a.mo6243t();
        C6349n m29257v = m29257v(f, timeline);
        C4425l0 c4425l0 = this.f11634f;
        long j = c4425l0.f11646b;
        long j2 = c4425l0.f11649e;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long m29278a = m29278a(m29257v, j, false);
        long j3 = this.f11643o;
        C4425l0 c4425l02 = this.f11634f;
        this.f11643o = j3 + (c4425l02.f11646b - m29278a);
        this.f11634f = c4425l02.m29251b(m29278a);
    }

    /* renamed from: q */
    public boolean m29262q() {
        if (this.f11632d && (!this.f11633e || this.f11629a.mo6194f() == Long.MIN_VALUE)) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public void m29260s(long j) {
        C9149a.m16447f(m29261r());
        if (this.f11632d) {
            this.f11629a.mo6191h(m29254y(j));
        }
    }

    /* renamed from: t */
    public void m29259t() {
        m29273f();
        m29258u(this.f11634f.f11648d, this.f11639k, this.f11629a);
    }

    /* renamed from: v */
    public C6349n m29257v(float f, Timeline timeline) {
        InterfaceC6337h[] interfaceC6337hArr;
        C6349n mo22877e = this.f11638j.mo22877e(this.f11637i, m29265n(), this.f11634f.f11645a, timeline);
        for (InterfaceC6337h interfaceC6337h : mo22877e.f17990c) {
            if (interfaceC6337h != null) {
                interfaceC6337h.mo22911e(f);
            }
        }
        return mo22877e;
    }

    /* renamed from: w */
    public void m29256w(C4423k0 c4423k0) {
        if (c4423k0 == this.f11640l) {
            return;
        }
        m29273f();
        this.f11640l = c4423k0;
        m29271h();
    }

    /* renamed from: x */
    public void m29255x(long j) {
        this.f11643o = j;
    }

    /* renamed from: y */
    public long m29254y(long j) {
        return j - m29267l();
    }

    /* renamed from: z */
    public long m29253z(long j) {
        return j + m29267l();
    }
}