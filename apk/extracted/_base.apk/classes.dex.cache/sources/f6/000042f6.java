package p229m7;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p153i8.InterfaceC7440b;
import p153i8.InterfaceC7472x;
import p195k8.C9191p0;
import p229m7.InterfaceC10341s;

/* renamed from: m7.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10324o extends AbstractC10292f<Void> {

    /* renamed from: A */
    private boolean f26986A;

    /* renamed from: s */
    private final InterfaceC10341s f26987s;

    /* renamed from: t */
    private final boolean f26988t;

    /* renamed from: u */
    private final Timeline.C4379c f26989u;

    /* renamed from: v */
    private final Timeline.C4378b f26990v;

    /* renamed from: w */
    private C10325a f26991w;

    /* renamed from: x */
    private C10321n f26992x;

    /* renamed from: y */
    private boolean f26993y;

    /* renamed from: z */
    private boolean f26994z;

    /* renamed from: m7.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10325a extends AbstractC10314l {

        /* renamed from: e */
        public static final Object f26995e = new Object();

        /* renamed from: c */
        private final Object f26996c;

        /* renamed from: d */
        private final Object f26997d;

        private C10325a(Timeline timeline, Object obj, Object obj2) {
            super(timeline);
            this.f26996c = obj;
            this.f26997d = obj2;
        }

        /* renamed from: u */
        public static C10325a m11769u(MediaItem mediaItem) {
            return new C10325a(new C10326b(mediaItem), Timeline.C4379c.f11377r, f26995e);
        }

        /* renamed from: v */
        public static C10325a m11768v(Timeline timeline, Object obj, Object obj2) {
            return new C10325a(timeline, obj, obj2);
        }

        @Override // p229m7.AbstractC10314l, com.google.android.exoplayer2.Timeline
        /* renamed from: b */
        public int mo11758b(Object obj) {
            Object obj2;
            Timeline timeline = this.f26935b;
            if (f26995e.equals(obj) && (obj2 = this.f26997d) != null) {
                obj = obj2;
            }
            return timeline.mo11758b(obj);
        }

        @Override // p229m7.AbstractC10314l, com.google.android.exoplayer2.Timeline
        /* renamed from: g */
        public Timeline.C4378b mo11757g(int i, Timeline.C4378b c4378b, boolean z) {
            this.f26935b.mo11757g(i, c4378b, z);
            if (C9191p0.m16257c(c4378b.f11372b, this.f26997d) && z) {
                c4378b.f11372b = f26995e;
            }
            return c4378b;
        }

        @Override // p229m7.AbstractC10314l, com.google.android.exoplayer2.Timeline
        /* renamed from: m */
        public Object mo11755m(int i) {
            Object mo11755m = this.f26935b.mo11755m(i);
            if (C9191p0.m16257c(mo11755m, this.f26997d)) {
                return f26995e;
            }
            return mo11755m;
        }

        @Override // p229m7.AbstractC10314l, com.google.android.exoplayer2.Timeline
        /* renamed from: o */
        public Timeline.C4379c mo11754o(int i, Timeline.C4379c c4379c, long j) {
            this.f26935b.mo11754o(i, c4379c, j);
            if (C9191p0.m16257c(c4379c.f11379a, this.f26996c)) {
                c4379c.f11379a = Timeline.C4379c.f11377r;
            }
            return c4379c;
        }

        /* renamed from: t */
        public C10325a m11770t(Timeline timeline) {
            return new C10325a(timeline, this.f26996c, this.f26997d);
        }
    }

    /* renamed from: m7.o$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10326b extends Timeline {

        /* renamed from: b */
        private final MediaItem f26998b;

        public C10326b(MediaItem mediaItem) {
            this.f26998b = mediaItem;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: b */
        public int mo11758b(Object obj) {
            return obj == C10325a.f26995e ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: g */
        public Timeline.C4378b mo11757g(int i, Timeline.C4378b c4378b, boolean z) {
            Integer num;
            Object obj = null;
            if (z) {
                num = 0;
            } else {
                num = null;
            }
            if (z) {
                obj = C10325a.f26995e;
            }
            return c4378b.m29722n(num, obj, 0, -9223372036854775807L, 0L);
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: i */
        public int mo11756i() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: m */
        public Object mo11755m(int i) {
            return C10325a.f26995e;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: o */
        public Timeline.C4379c mo11754o(int i, Timeline.C4379c c4379c, long j) {
            c4379c.m29714g(Timeline.C4379c.f11377r, this.f26998b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            c4379c.f11390l = true;
            return c4379c;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: p */
        public int mo11753p() {
            return 1;
        }
    }

    public C10324o(InterfaceC10341s interfaceC10341s, boolean z) {
        boolean z2;
        this.f26987s = interfaceC10341s;
        if (z && interfaceC10341s.mo11727n()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f26988t = z2;
        this.f26989u = new Timeline.C4379c();
        this.f26990v = new Timeline.C4378b();
        Timeline mo11726p = interfaceC10341s.mo11726p();
        if (mo11726p != null) {
            this.f26991w = C10325a.m11768v(mo11726p, null, null);
            this.f26986A = true;
            return;
        }
        this.f26991w = C10325a.m11769u(interfaceC10341s.mo11732e());
    }

    /* renamed from: L */
    private Object m11777L(Object obj) {
        if (this.f26991w.f26997d != null && this.f26991w.f26997d.equals(obj)) {
            return C10325a.f26995e;
        }
        return obj;
    }

    /* renamed from: M */
    private Object m11776M(Object obj) {
        if (this.f26991w.f26997d != null && obj.equals(C10325a.f26995e)) {
            return this.f26991w.f26997d;
        }
        return obj;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* renamed from: Q */
    private void m11772Q(long j) {
        C10321n c10321n = this.f26992x;
        int mo11758b = this.f26991w.mo11758b(c10321n.f26979j.f27016a);
        if (mo11758b == -1) {
            return;
        }
        long j2 = this.f26991w.m29741f(mo11758b, this.f26990v).f11374d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        c10321n.m11783w(j);
    }

    @Override // p229m7.AbstractC10292f, p229m7.AbstractC10277a
    /* renamed from: A */
    public void mo11739A(InterfaceC7472x interfaceC7472x) {
        super.mo11739A(interfaceC7472x);
        if (!this.f26988t) {
            this.f26993y = true;
            m11927J(null, this.f26987s);
        }
    }

    @Override // p229m7.AbstractC10292f, p229m7.AbstractC10277a
    /* renamed from: C */
    public void mo11738C() {
        this.f26994z = false;
        this.f26993y = false;
        super.mo11738C();
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: K */
    public C10321n mo11731g(InterfaceC10341s.C10342a c10342a, InterfaceC7440b interfaceC7440b, long j) {
        C10321n c10321n = new C10321n(c10342a, interfaceC7440b, j);
        c10321n.m11781y(this.f26987s);
        if (this.f26994z) {
            c10321n.m11788e(c10342a.m11723c(m11776M(c10342a.f27016a)));
        } else {
            this.f26992x = c10321n;
            if (!this.f26993y) {
                this.f26993y = true;
                m11927J(null, this.f26987s);
            }
        }
        return c10321n;
    }

    @Override // p229m7.AbstractC10292f
    /* renamed from: N */
    public InterfaceC10341s.C10342a mo11780E(Void r1, InterfaceC10341s.C10342a c10342a) {
        return c10342a.m11723c(m11777L(c10342a.f27016a));
    }

    /* renamed from: O */
    public Timeline m11774O() {
        return this.f26991w;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // p229m7.AbstractC10292f
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo11779I(java.lang.Void r13, p229m7.InterfaceC10341s r14, com.google.android.exoplayer2.Timeline r15) {
        /*
            r12 = this;
            boolean r13 = r12.f26994z
            if (r13 == 0) goto L19
            m7.o$a r13 = r12.f26991w
            m7.o$a r13 = r13.m11770t(r15)
            r12.f26991w = r13
            m7.n r13 = r12.f26992x
            if (r13 == 0) goto Lae
            long r13 = r13.m11787i()
            r12.m11772Q(r13)
            goto Lae
        L19:
            boolean r13 = r15.m29737q()
            if (r13 == 0) goto L36
            boolean r13 = r12.f26986A
            if (r13 == 0) goto L2a
            m7.o$a r13 = r12.f26991w
            m7.o$a r13 = r13.m11770t(r15)
            goto L32
        L2a:
            java.lang.Object r13 = com.google.android.exoplayer2.Timeline.C4379c.f11377r
            java.lang.Object r14 = p229m7.C10324o.C10325a.f26995e
            m7.o$a r13 = p229m7.C10324o.C10325a.m11768v(r15, r13, r14)
        L32:
            r12.f26991w = r13
            goto Lae
        L36:
            com.google.android.exoplayer2.Timeline$c r13 = r12.f26989u
            r14 = 0
            r15.m29738n(r14, r13)
            com.google.android.exoplayer2.Timeline$c r13 = r12.f26989u
            long r0 = r13.m29718c()
            com.google.android.exoplayer2.Timeline$c r13 = r12.f26989u
            java.lang.Object r13 = r13.f11379a
            m7.n r2 = r12.f26992x
            if (r2 == 0) goto L74
            long r2 = r2.m11786p()
            m7.o$a r4 = r12.f26991w
            m7.n r5 = r12.f26992x
            m7.s$a r5 = r5.f26979j
            java.lang.Object r5 = r5.f27016a
            com.google.android.exoplayer2.Timeline$b r6 = r12.f26990v
            r4.mo29711h(r5, r6)
            com.google.android.exoplayer2.Timeline$b r4 = r12.f26990v
            long r4 = r4.m29724l()
            long r4 = r4 + r2
            m7.o$a r2 = r12.f26991w
            com.google.android.exoplayer2.Timeline$c r3 = r12.f26989u
            com.google.android.exoplayer2.Timeline$c r14 = r2.m29738n(r14, r3)
            long r2 = r14.m29718c()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L74
            r10 = r4
            goto L75
        L74:
            r10 = r0
        L75:
            com.google.android.exoplayer2.Timeline$c r7 = r12.f26989u
            com.google.android.exoplayer2.Timeline$b r8 = r12.f26990v
            r9 = 0
            r6 = r15
            android.util.Pair r14 = r6.m29740j(r7, r8, r9, r10)
            java.lang.Object r0 = r14.first
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            boolean r14 = r12.f26986A
            if (r14 == 0) goto L94
            m7.o$a r13 = r12.f26991w
            m7.o$a r13 = r13.m11770t(r15)
            goto L98
        L94:
            m7.o$a r13 = p229m7.C10324o.C10325a.m11768v(r15, r13, r0)
        L98:
            r12.f26991w = r13
            m7.n r13 = r12.f26992x
            if (r13 == 0) goto Lae
            r12.m11772Q(r1)
            m7.s$a r13 = r13.f26979j
            java.lang.Object r14 = r13.f27016a
            java.lang.Object r14 = r12.m11776M(r14)
            m7.s$a r13 = r13.m11723c(r14)
            goto Laf
        Lae:
            r13 = 0
        Laf:
            r14 = 1
            r12.f26986A = r14
            r12.f26994z = r14
            m7.o$a r14 = r12.f26991w
            r12.m11958B(r14)
            if (r13 == 0) goto Lc6
            m7.n r14 = r12.f26992x
            java.lang.Object r14 = p195k8.C9149a.m16448e(r14)
            m7.n r14 = (p229m7.C10321n) r14
            r14.m11788e(r13)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p229m7.C10324o.mo11779I(java.lang.Void, m7.s, com.google.android.exoplayer2.Timeline):void");
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: e */
    public MediaItem mo11732e() {
        return this.f26987s.mo11732e();
    }

    @Override // p229m7.AbstractC10292f, p229m7.InterfaceC10341s
    /* renamed from: m */
    public void mo11728m() {
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: q */
    public void mo11725q(InterfaceC10329p interfaceC10329p) {
        ((C10321n) interfaceC10329p).m11782x();
        if (interfaceC10329p == this.f26992x) {
            this.f26992x = null;
        }
    }
}