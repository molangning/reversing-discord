package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.exoplayer2.C4406h0;
import com.google.android.exoplayer2.C4438q0;
import com.google.android.exoplayer2.C4446s0;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.C4382a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import gb.AbstractC6693s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p099f8.AbstractC6347m;
import p099f8.C6349n;
import p099f8.InterfaceC6337h;
import p102fb.InterfaceC6386l;
import p151i6.C7390b;
import p151i6.C7397h;
import p151i6.C7398i;
import p151i6.C7400k;
import p151i6.C7408s;
import p151i6.C7410u;
import p151i6.InterfaceC7401l;
import p153i8.InterfaceC7444e;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9192q;
import p195k8.C9197r;
import p195k8.C9203v;
import p195k8.InterfaceC9155c;
import p195k8.InterfaceC9184m;
import p229m7.InterfaceC10278a0;
import p229m7.InterfaceC10327o0;
import p229m7.InterfaceC10341s;

/* renamed from: com.google.android.exoplayer2.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4397e0 extends AbstractC4396e {

    /* renamed from: A */
    private int f11474A;

    /* renamed from: B */
    private int f11475B;

    /* renamed from: C */
    private long f11476C;

    /* renamed from: b */
    final C6349n f11477b;

    /* renamed from: c */
    private final InterfaceC4483u0[] f11478c;

    /* renamed from: d */
    private final AbstractC6347m f11479d;

    /* renamed from: e */
    private final InterfaceC9184m f11480e;

    /* renamed from: f */
    private final C4406h0.InterfaceC4412f f11481f;

    /* renamed from: g */
    private final C4406h0 f11482g;

    /* renamed from: h */
    private final C9192q<Player.InterfaceC4371a, Player.Events> f11483h;

    /* renamed from: i */
    private final Timeline.C4378b f11484i;

    /* renamed from: j */
    private final List<C4398a> f11485j;

    /* renamed from: k */
    private final boolean f11486k;

    /* renamed from: l */
    private final InterfaceC10278a0 f11487l;

    /* renamed from: m */
    private final C4382a f11488m;

    /* renamed from: n */
    private final Looper f11489n;

    /* renamed from: o */
    private final InterfaceC7444e f11490o;

    /* renamed from: p */
    private final InterfaceC9155c f11491p;

    /* renamed from: q */
    private int f11492q;

    /* renamed from: r */
    private boolean f11493r;

    /* renamed from: s */
    private int f11494s;

    /* renamed from: t */
    private boolean f11495t;

    /* renamed from: u */
    private int f11496u;

    /* renamed from: v */
    private int f11497v;

    /* renamed from: w */
    private C7410u f11498w;

    /* renamed from: x */
    private InterfaceC10327o0 f11499x;

    /* renamed from: y */
    private boolean f11500y;

    /* renamed from: z */
    private C4444r0 f11501z;

    /* renamed from: com.google.android.exoplayer2.e0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4398a implements InterfaceC4434o0 {

        /* renamed from: a */
        private final Object f11502a;

        /* renamed from: b */
        private Timeline f11503b;

        public C4398a(Object obj, Timeline timeline) {
            this.f11502a = obj;
            this.f11503b = timeline;
        }

        @Override // com.google.android.exoplayer2.InterfaceC4434o0
        /* renamed from: a */
        public Object mo29176a() {
            return this.f11502a;
        }

        @Override // com.google.android.exoplayer2.InterfaceC4434o0
        /* renamed from: b */
        public Timeline mo29175b() {
            return this.f11503b;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public C4397e0(InterfaceC4483u0[] interfaceC4483u0Arr, AbstractC6347m abstractC6347m, InterfaceC10278a0 interfaceC10278a0, InterfaceC7401l interfaceC7401l, InterfaceC7444e interfaceC7444e, C4382a c4382a, boolean z, C7410u c7410u, InterfaceC4417i0 interfaceC4417i0, long j, boolean z2, InterfaceC9155c interfaceC9155c, Looper looper, Player player) {
        C9197r.m16180f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.13.3] [" + C9191p0.f24175e + "]");
        C9149a.m16447f(interfaceC4483u0Arr.length > 0);
        this.f11478c = (InterfaceC4483u0[]) C9149a.m16448e(interfaceC4483u0Arr);
        this.f11479d = (AbstractC6347m) C9149a.m16448e(abstractC6347m);
        this.f11487l = interfaceC10278a0;
        this.f11490o = interfaceC7444e;
        this.f11488m = c4382a;
        this.f11486k = z;
        this.f11498w = c7410u;
        this.f11500y = z2;
        this.f11489n = looper;
        this.f11491p = interfaceC9155c;
        this.f11492q = 0;
        final Player player2 = player != null ? player : this;
        this.f11483h = new C9192q<>(looper, interfaceC9155c, new InterfaceC6386l() { // from class: i6.f
            @Override // p102fb.InterfaceC6386l
            public final Object get() {
                return new Player.Events();
            }
        }, new C9192q.InterfaceC9194b() { // from class: com.google.android.exoplayer2.t
            @Override // p195k8.C9192q.InterfaceC9194b
            /* renamed from: a */
            public final void mo16197a(Object obj, C9203v c9203v) {
                ((Player.InterfaceC4371a) obj).onEvents(Player.this, (Player.Events) c9203v);
            }
        });
        this.f11485j = new ArrayList();
        this.f11499x = new InterfaceC10327o0.C10328a(0);
        C6349n c6349n = new C6349n(new C7408s[interfaceC4483u0Arr.length], new InterfaceC6337h[interfaceC4483u0Arr.length], null);
        this.f11477b = c6349n;
        this.f11484i = new Timeline.C4378b();
        this.f11474A = -1;
        this.f11480e = interfaceC9155c.mo16372c(looper, null);
        C4406h0.InterfaceC4412f interfaceC4412f = new C4406h0.InterfaceC4412f() { // from class: com.google.android.exoplayer2.x
            @Override // com.google.android.exoplayer2.C4406h0.InterfaceC4412f
            /* renamed from: a */
            public final void mo28588a(C4406h0.C4411e c4411e) {
                C4397e0.this.m29511L0(c4411e);
            }
        };
        this.f11481f = interfaceC4412f;
        this.f11501z = C4444r0.m29162k(c6349n);
        if (c4382a != null) {
            c4382a.m29637Y1(player2, looper);
            mo29514K(c4382a);
            interfaceC7444e.mo20634f(new Handler(looper), c4382a);
        }
        this.f11482g = new C4406h0(interfaceC4483u0Arr, abstractC6347m, c6349n, interfaceC7401l, interfaceC7444e, this.f11492q, this.f11493r, c4382a, c7410u, interfaceC4417i0, j, z2, looper, interfaceC9155c, interfaceC4412f);
    }

    /* renamed from: B0 */
    private Pair<Boolean, Integer> m29528B0(C4444r0 c4444r0, C4444r0 c4444r02, boolean z, int i, boolean z2) {
        Timeline timeline = c4444r02.f11715a;
        Timeline timeline2 = c4444r0.f11715a;
        if (timeline2.m29737q() && timeline.m29737q()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i2 = 3;
        if (timeline2.m29737q() != timeline.m29737q()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        Object obj = timeline.m29738n(timeline.mo29711h(c4444r02.f11716b.f27016a, this.f11484i).f11373c, this.f11473a).f11379a;
        Object obj2 = timeline2.m29738n(timeline2.mo29711h(c4444r0.f11716b.f27016a, this.f11484i).f11373c, this.f11473a).f11379a;
        int i3 = this.f11473a.f11391m;
        if (!obj.equals(obj2)) {
            if (z && i == 0) {
                i2 = 1;
            } else if (z && i == 1) {
                i2 = 2;
            } else if (!z2) {
                throw new IllegalStateException();
            }
            return new Pair<>(Boolean.TRUE, Integer.valueOf(i2));
        } else if (z && i == 0 && timeline2.mo11758b(c4444r0.f11716b.f27016a) == i3) {
            return new Pair<>(Boolean.TRUE, 0);
        } else {
            return new Pair<>(Boolean.FALSE, -1);
        }
    }

    /* renamed from: D0 */
    private int m29525D0() {
        if (this.f11501z.f11715a.m29737q()) {
            return this.f11474A;
        }
        C4444r0 c4444r0 = this.f11501z;
        return c4444r0.f11715a.mo29711h(c4444r0.f11716b.f27016a, this.f11484i).f11373c;
    }

    /* renamed from: E0 */
    private Pair<Object, Long> m29523E0(Timeline timeline, Timeline timeline2) {
        boolean z;
        long mo29510M = mo29510M();
        int i = -1;
        if (!timeline.m29737q() && !timeline2.m29737q()) {
            Pair<Object, Long> m29740j = timeline.m29740j(this.f11473a, this.f11484i, mo29463l(), C7390b.m20792c(mo29510M));
            Object obj = ((Pair) C9191p0.m16243j(m29740j)).first;
            if (timeline2.mo11758b(obj) != -1) {
                return m29740j;
            }
            Object m29314u0 = C4406h0.m29314u0(this.f11473a, this.f11484i, this.f11492q, this.f11493r, obj, timeline, timeline2);
            if (m29314u0 != null) {
                timeline2.mo29711h(m29314u0, this.f11484i);
                int i2 = this.f11484i.f11373c;
                return m29521F0(timeline2, i2, timeline2.m29738n(i2, this.f11473a).m29719b());
            }
            return m29521F0(timeline2, -1, -9223372036854775807L);
        }
        if (!timeline.m29737q() && timeline2.m29737q()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = m29525D0();
        }
        if (z) {
            mo29510M = -9223372036854775807L;
        }
        return m29521F0(timeline2, i, mo29510M);
    }

    /* renamed from: F0 */
    private Pair<Object, Long> m29521F0(Timeline timeline, int i, long j) {
        if (timeline.m29737q()) {
            this.f11474A = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f11476C = j;
            this.f11475B = 0;
            return null;
        }
        if (i == -1 || i >= timeline.mo11753p()) {
            i = timeline.mo11844a(this.f11493r);
            j = timeline.m29738n(i, this.f11473a).m29719b();
        }
        return timeline.m29740j(this.f11473a, this.f11484i, i, C7390b.m20792c(j));
    }

    /* renamed from: H0 */
    public void m29513K0(C4406h0.C4411e c4411e) {
        int i = this.f11494s - c4411e.f11604c;
        this.f11494s = i;
        boolean z = true;
        if (c4411e.f11605d) {
            this.f11495t = true;
            this.f11496u = c4411e.f11606e;
        }
        if (c4411e.f11607f) {
            this.f11497v = c4411e.f11608g;
        }
        if (i == 0) {
            Timeline timeline = c4411e.f11603b.f11715a;
            if (!this.f11501z.f11715a.m29737q() && timeline.m29737q()) {
                this.f11474A = -1;
                this.f11476C = 0L;
                this.f11475B = 0;
            }
            if (!timeline.m29737q()) {
                List<Timeline> m28975E = ((C4481t0) timeline).m28975E();
                if (m28975E.size() != this.f11485j.size()) {
                    z = false;
                }
                C9149a.m16447f(z);
                for (int i2 = 0; i2 < m28975E.size(); i2++) {
                    this.f11485j.get(i2).f11503b = m28975E.get(i2);
                }
            }
            boolean z2 = this.f11495t;
            this.f11495t = false;
            m29443s1(c4411e.f11603b, z2, this.f11496u, 1, this.f11497v, false);
        }
    }

    /* renamed from: I0 */
    private static boolean m29516I0(C4444r0 c4444r0) {
        return c4444r0.f11718d == 3 && c4444r0.f11725k && c4444r0.f11726l == 0;
    }

    /* renamed from: L0 */
    public /* synthetic */ void m29511L0(final C4406h0.C4411e c4411e) {
        this.f11480e.mo16336a(new Runnable() { // from class: com.google.android.exoplayer2.u
            @Override // java.lang.Runnable
            public final void run() {
                C4397e0.this.m29513K0(c4411e);
            }
        });
    }

    /* renamed from: M0 */
    public static /* synthetic */ void m29509M0(Player.InterfaceC4371a interfaceC4371a) {
        interfaceC4371a.onPlayerError(ExoPlaybackException.m29933b(new C7398i(1)));
    }

    /* renamed from: P0 */
    public static /* synthetic */ void m29504P0(C4444r0 c4444r0, TrackSelectionArray trackSelectionArray, Player.InterfaceC4371a interfaceC4371a) {
        interfaceC4371a.onTracksChanged(c4444r0.f11721g, trackSelectionArray);
    }

    /* renamed from: Q0 */
    public static /* synthetic */ void m29503Q0(C4444r0 c4444r0, Player.InterfaceC4371a interfaceC4371a) {
        interfaceC4371a.onStaticMetadataChanged(c4444r0.f11723i);
    }

    /* renamed from: R0 */
    public static /* synthetic */ void m29502R0(C4444r0 c4444r0, Player.InterfaceC4371a interfaceC4371a) {
        interfaceC4371a.onIsLoadingChanged(c4444r0.f11720f);
    }

    /* renamed from: S0 */
    public static /* synthetic */ void m29500S0(C4444r0 c4444r0, Player.InterfaceC4371a interfaceC4371a) {
        interfaceC4371a.onPlayerStateChanged(c4444r0.f11725k, c4444r0.f11718d);
    }

    /* renamed from: T0 */
    public static /* synthetic */ void m29499T0(C4444r0 c4444r0, Player.InterfaceC4371a interfaceC4371a) {
        interfaceC4371a.onPlaybackStateChanged(c4444r0.f11718d);
    }

    /* renamed from: U0 */
    public static /* synthetic */ void m29498U0(C4444r0 c4444r0, int i, Player.InterfaceC4371a interfaceC4371a) {
        interfaceC4371a.onPlayWhenReadyChanged(c4444r0.f11725k, i);
    }

    /* renamed from: V0 */
    public static /* synthetic */ void m29496V0(C4444r0 c4444r0, Player.InterfaceC4371a interfaceC4371a) {
        interfaceC4371a.onPlaybackSuppressionReasonChanged(c4444r0.f11726l);
    }

    /* renamed from: W0 */
    public static /* synthetic */ void m29494W0(C4444r0 c4444r0, Player.InterfaceC4371a interfaceC4371a) {
        interfaceC4371a.onIsPlayingChanged(m29516I0(c4444r0));
    }

    /* renamed from: X0 */
    public static /* synthetic */ void m29492X0(C4444r0 c4444r0, Player.InterfaceC4371a interfaceC4371a) {
        interfaceC4371a.onPlaybackParametersChanged(c4444r0.f11727m);
    }

    /* renamed from: Y0 */
    public static /* synthetic */ void m29490Y0(C4444r0 c4444r0, Player.InterfaceC4371a interfaceC4371a) {
        interfaceC4371a.onExperimentalOffloadSchedulingEnabledChanged(c4444r0.f11728n);
    }

    /* renamed from: Z0 */
    public static /* synthetic */ void m29489Z0(C4444r0 c4444r0, Player.InterfaceC4371a interfaceC4371a) {
        interfaceC4371a.onExperimentalSleepingForOffloadChanged(c4444r0.f11729o);
    }

    /* renamed from: a1 */
    public static /* synthetic */ void m29488a1(C4444r0 c4444r0, int i, Player.InterfaceC4371a interfaceC4371a) {
        interfaceC4371a.onTimelineChanged(c4444r0.f11715a, i);
    }

    /* renamed from: d1 */
    public static /* synthetic */ void m29481d1(C4444r0 c4444r0, Player.InterfaceC4371a interfaceC4371a) {
        interfaceC4371a.onPlayerError(c4444r0.f11719e);
    }

    /* renamed from: e1 */
    private C4444r0 m29478e1(C4444r0 c4444r0, Timeline timeline, Pair<Object, Long> pair) {
        boolean z;
        InterfaceC10341s.C10342a c10342a;
        TrackGroupArray trackGroupArray;
        C6349n c6349n;
        List<Metadata> list;
        int i;
        long j;
        if (!timeline.m29737q() && pair == null) {
            z = false;
        } else {
            z = true;
        }
        C9149a.m16452a(z);
        Timeline timeline2 = c4444r0.f11715a;
        C4444r0 m29163j = c4444r0.m29163j(timeline);
        if (timeline.m29737q()) {
            InterfaceC10341s.C10342a m29161l = C4444r0.m29161l();
            C4444r0 m29171b = m29163j.m29170c(m29161l, C7390b.m20792c(this.f11476C), C7390b.m20792c(this.f11476C), 0L, TrackGroupArray.f11763m, this.f11477b, AbstractC6693s.m22131x()).m29171b(m29161l);
            m29171b.f11730p = m29171b.f11732r;
            return m29171b;
        }
        Object obj = m29163j.f11716b.f27016a;
        boolean z2 = !obj.equals(((Pair) C9191p0.m16243j(pair)).first);
        if (z2) {
            c10342a = new InterfaceC10341s.C10342a(pair.first);
        } else {
            c10342a = m29163j.f11716b;
        }
        InterfaceC10341s.C10342a c10342a2 = c10342a;
        long longValue = ((Long) pair.second).longValue();
        long m20792c = C7390b.m20792c(mo29510M());
        if (!timeline2.m29737q()) {
            m20792c -= timeline2.mo29711h(obj, this.f11484i).m29724l();
        }
        if (!z2 && longValue >= m20792c) {
            if (i == 0) {
                int mo11758b = timeline.mo11758b(m29163j.f11724j.f27016a);
                if (mo11758b == -1 || timeline.m29741f(mo11758b, this.f11484i).f11373c != timeline.mo29711h(c10342a2.f27016a, this.f11484i).f11373c) {
                    timeline.mo29711h(c10342a2.f27016a, this.f11484i);
                    if (c10342a2.m11751b()) {
                        j = this.f11484i.m29734b(c10342a2.f27017b, c10342a2.f27018c);
                    } else {
                        j = this.f11484i.f11374d;
                    }
                    C4444r0 m29171b2 = m29163j.m29170c(c10342a2, m29163j.f11732r, m29163j.f11732r, j - m29163j.f11732r, m29163j.f11721g, m29163j.f11722h, m29163j.f11723i).m29171b(c10342a2);
                    m29171b2.f11730p = j;
                    return m29171b2;
                }
                return m29163j;
            }
            C9149a.m16447f(!c10342a2.m11751b());
            long max = Math.max(0L, m29163j.f11731q - (longValue - m20792c));
            long j2 = m29163j.f11730p;
            if (m29163j.f11724j.equals(m29163j.f11716b)) {
                j2 = longValue + max;
            }
            C4444r0 m29170c = m29163j.m29170c(c10342a2, longValue, longValue, max, m29163j.f11721g, m29163j.f11722h, m29163j.f11723i);
            m29170c.f11730p = j2;
            return m29170c;
        }
        C9149a.m16447f(!c10342a2.m11751b());
        if (z2) {
            trackGroupArray = TrackGroupArray.f11763m;
        } else {
            trackGroupArray = m29163j.f11721g;
        }
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        if (z2) {
            c6349n = this.f11477b;
        } else {
            c6349n = m29163j.f11722h;
        }
        C6349n c6349n2 = c6349n;
        if (z2) {
            list = AbstractC6693s.m22131x();
        } else {
            list = m29163j.f11723i;
        }
        C4444r0 m29171b3 = m29163j.m29170c(c10342a2, longValue, longValue, 0L, trackGroupArray2, c6349n2, list).m29171b(c10342a2);
        m29171b3.f11730p = longValue;
        return m29171b3;
    }

    /* renamed from: f1 */
    private long m29476f1(InterfaceC10341s.C10342a c10342a, long j) {
        long m20791d = C7390b.m20791d(j);
        this.f11501z.f11715a.mo29711h(c10342a.f27016a, this.f11484i);
        return m20791d + this.f11484i.m29725k();
    }

    /* renamed from: h1 */
    private C4444r0 m29471h1(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i >= 0 && i2 >= i && i2 <= this.f11485j.size()) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        int mo29463l = mo29463l();
        Timeline mo29438v = mo29438v();
        int size = this.f11485j.size();
        this.f11494s++;
        m29469i1(i, i2);
        Timeline m29432z0 = m29432z0();
        C4444r0 m29478e1 = m29478e1(this.f11501z, m29432z0, m29523E0(mo29438v, m29432z0));
        int i3 = m29478e1.f11718d;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && mo29463l >= m29478e1.f11715a.mo11753p()) {
            z2 = true;
        }
        if (z2) {
            m29478e1 = m29478e1.m29165h(4);
        }
        this.f11482g.m29338j0(i, i2, this.f11499x);
        return m29478e1;
    }

    /* renamed from: i1 */
    private void m29469i1(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.f11485j.remove(i3);
        }
        this.f11499x = this.f11499x.mo11767a(i, i2);
    }

    /* renamed from: n1 */
    private void m29455n1(List<InterfaceC10341s> list, int i, long j, boolean z) {
        int i2 = i;
        int m29525D0 = m29525D0();
        long mo29491Y = mo29491Y();
        this.f11494s++;
        if (!this.f11485j.isEmpty()) {
            m29469i1(0, this.f11485j.size());
        }
        List<C4438q0.C4441c> m29433y0 = m29433y0(0, list);
        Timeline m29432z0 = m29432z0();
        if (!m29432z0.m29737q() && i2 >= m29432z0.mo11753p()) {
            throw new C7400k(m29432z0, i2, j);
        }
        long j2 = j;
        if (z) {
            i2 = m29432z0.mo11844a(this.f11493r);
            j2 = -9223372036854775807L;
        } else if (i2 == -1) {
            i2 = m29525D0;
            j2 = mo29491Y;
        }
        C4444r0 m29478e1 = m29478e1(this.f11501z, m29432z0, m29521F0(m29432z0, i2, j2));
        int i3 = m29478e1.f11718d;
        if (i2 != -1 && i3 != 1) {
            i3 = (m29432z0.m29737q() || i2 >= m29432z0.mo11753p()) ? 4 : 2;
        }
        C4444r0 m29165h = m29478e1.m29165h(i3);
        this.f11482g.m29396I0(m29433y0, i2, C7390b.m20792c(j2), this.f11499x);
        m29443s1(m29165h, false, 4, 0, 1, false);
    }

    /* renamed from: s1 */
    private void m29443s1(final C4444r0 c4444r0, boolean z, final int i, final int i2, final int i3, boolean z2) {
        final MediaItem mediaItem;
        C4444r0 c4444r02 = this.f11501z;
        this.f11501z = c4444r0;
        Pair<Boolean, Integer> m29528B0 = m29528B0(c4444r0, c4444r02, z, i, !c4444r02.f11715a.equals(c4444r0.f11715a));
        boolean booleanValue = ((Boolean) m29528B0.first).booleanValue();
        final int intValue = ((Integer) m29528B0.second).intValue();
        if (!c4444r02.f11715a.equals(c4444r0.f11715a)) {
            this.f11483h.m16201i(0, new C9192q.InterfaceC9193a() { // from class: com.google.android.exoplayer2.y
                @Override // p195k8.C9192q.InterfaceC9193a
                public final void invoke(Object obj) {
                    C4397e0.m29488a1(C4444r0.this, i2, (Player.InterfaceC4371a) obj);
                }
            });
        }
        if (z) {
            this.f11483h.m16201i(12, new C9192q.InterfaceC9193a() { // from class: com.google.android.exoplayer2.j
                @Override // p195k8.C9192q.InterfaceC9193a
                public final void invoke(Object obj) {
                    ((Player.InterfaceC4371a) obj).onPositionDiscontinuity(i);
                }
            });
        }
        if (booleanValue) {
            if (!c4444r0.f11715a.m29737q()) {
                mediaItem = c4444r0.f11715a.m29738n(c4444r0.f11715a.mo29711h(c4444r0.f11716b.f27016a, this.f11484i).f11373c, this.f11473a).f11381c;
            } else {
                mediaItem = null;
            }
            this.f11483h.m16201i(1, new C9192q.InterfaceC9193a() { // from class: com.google.android.exoplayer2.k
                @Override // p195k8.C9192q.InterfaceC9193a
                public final void invoke(Object obj) {
                    ((Player.InterfaceC4371a) obj).onMediaItemTransition(MediaItem.this, intValue);
                }
            });
        }
        ExoPlaybackException exoPlaybackException = c4444r02.f11719e;
        ExoPlaybackException exoPlaybackException2 = c4444r0.f11719e;
        if (exoPlaybackException != exoPlaybackException2 && exoPlaybackException2 != null) {
            this.f11483h.m16201i(11, new C9192q.InterfaceC9193a() { // from class: com.google.android.exoplayer2.l
                @Override // p195k8.C9192q.InterfaceC9193a
                public final void invoke(Object obj) {
                    C4397e0.m29481d1(C4444r0.this, (Player.InterfaceC4371a) obj);
                }
            });
        }
        C6349n c6349n = c4444r02.f11722h;
        C6349n c6349n2 = c4444r0.f11722h;
        if (c6349n != c6349n2) {
            this.f11479d.mo22878d(c6349n2.f17991d);
            final TrackSelectionArray trackSelectionArray = new TrackSelectionArray(c4444r0.f11722h.f17990c);
            this.f11483h.m16201i(2, new C9192q.InterfaceC9193a() { // from class: com.google.android.exoplayer2.m
                @Override // p195k8.C9192q.InterfaceC9193a
                public final void invoke(Object obj) {
                    C4397e0.m29504P0(C4444r0.this, trackSelectionArray, (Player.InterfaceC4371a) obj);
                }
            });
        }
        if (!c4444r02.f11723i.equals(c4444r0.f11723i)) {
            this.f11483h.m16201i(3, new C9192q.InterfaceC9193a() { // from class: com.google.android.exoplayer2.n
                @Override // p195k8.C9192q.InterfaceC9193a
                public final void invoke(Object obj) {
                    C4397e0.m29503Q0(C4444r0.this, (Player.InterfaceC4371a) obj);
                }
            });
        }
        if (c4444r02.f11720f != c4444r0.f11720f) {
            this.f11483h.m16201i(4, new C9192q.InterfaceC9193a() { // from class: com.google.android.exoplayer2.o
                @Override // p195k8.C9192q.InterfaceC9193a
                public final void invoke(Object obj) {
                    C4397e0.m29502R0(C4444r0.this, (Player.InterfaceC4371a) obj);
                }
            });
        }
        if (c4444r02.f11718d != c4444r0.f11718d || c4444r02.f11725k != c4444r0.f11725k) {
            this.f11483h.m16201i(-1, new C9192q.InterfaceC9193a() { // from class: com.google.android.exoplayer2.p
                @Override // p195k8.C9192q.InterfaceC9193a
                public final void invoke(Object obj) {
                    C4397e0.m29500S0(C4444r0.this, (Player.InterfaceC4371a) obj);
                }
            });
        }
        if (c4444r02.f11718d != c4444r0.f11718d) {
            this.f11483h.m16201i(5, new C9192q.InterfaceC9193a() { // from class: com.google.android.exoplayer2.q
                @Override // p195k8.C9192q.InterfaceC9193a
                public final void invoke(Object obj) {
                    C4397e0.m29499T0(C4444r0.this, (Player.InterfaceC4371a) obj);
                }
            });
        }
        if (c4444r02.f11725k != c4444r0.f11725k) {
            this.f11483h.m16201i(6, new C9192q.InterfaceC9193a() { // from class: com.google.android.exoplayer2.r
                @Override // p195k8.C9192q.InterfaceC9193a
                public final void invoke(Object obj) {
                    C4397e0.m29498U0(C4444r0.this, i3, (Player.InterfaceC4371a) obj);
                }
            });
        }
        if (c4444r02.f11726l != c4444r0.f11726l) {
            this.f11483h.m16201i(7, new C9192q.InterfaceC9193a() { // from class: com.google.android.exoplayer2.z
                @Override // p195k8.C9192q.InterfaceC9193a
                public final void invoke(Object obj) {
                    C4397e0.m29496V0(C4444r0.this, (Player.InterfaceC4371a) obj);
                }
            });
        }
        if (m29516I0(c4444r02) != m29516I0(c4444r0)) {
            this.f11483h.m16201i(8, new C9192q.InterfaceC9193a() { // from class: com.google.android.exoplayer2.a0
                @Override // p195k8.C9192q.InterfaceC9193a
                public final void invoke(Object obj) {
                    C4397e0.m29494W0(C4444r0.this, (Player.InterfaceC4371a) obj);
                }
            });
        }
        if (!c4444r02.f11727m.equals(c4444r0.f11727m)) {
            this.f11483h.m16201i(13, new C9192q.InterfaceC9193a() { // from class: com.google.android.exoplayer2.b0
                @Override // p195k8.C9192q.InterfaceC9193a
                public final void invoke(Object obj) {
                    C4397e0.m29492X0(C4444r0.this, (Player.InterfaceC4371a) obj);
                }
            });
        }
        if (z2) {
            this.f11483h.m16201i(-1, new C9192q.InterfaceC9193a() { // from class: i6.g
                @Override // p195k8.C9192q.InterfaceC9193a
                public final void invoke(Object obj) {
                    ((Player.InterfaceC4371a) obj).onSeekProcessed();
                }
            });
        }
        if (c4444r02.f11728n != c4444r0.f11728n) {
            this.f11483h.m16201i(-1, new C9192q.InterfaceC9193a() { // from class: com.google.android.exoplayer2.c0
                @Override // p195k8.C9192q.InterfaceC9193a
                public final void invoke(Object obj) {
                    C4397e0.m29490Y0(C4444r0.this, (Player.InterfaceC4371a) obj);
                }
            });
        }
        if (c4444r02.f11729o != c4444r0.f11729o) {
            this.f11483h.m16201i(-1, new C9192q.InterfaceC9193a() { // from class: com.google.android.exoplayer2.d0
                @Override // p195k8.C9192q.InterfaceC9193a
                public final void invoke(Object obj) {
                    C4397e0.m29489Z0(C4444r0.this, (Player.InterfaceC4371a) obj);
                }
            });
        }
        this.f11483h.m16205e();
    }

    /* renamed from: y0 */
    private List<C4438q0.C4441c> m29433y0(int i, List<InterfaceC10341s> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C4438q0.C4441c c4441c = new C4438q0.C4441c(list.get(i2), this.f11486k);
            arrayList.add(c4441c);
            this.f11485j.add(i2 + i, new C4398a(c4441c.f11708b, c4441c.f11707a.m11774O()));
        }
        this.f11499x = this.f11499x.mo11761g(i, arrayList.size());
        return arrayList;
    }

    /* renamed from: z0 */
    private Timeline m29432z0() {
        return new C4481t0(this.f11485j, this.f11499x);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: A */
    public TrackSelectionArray mo29531A() {
        return new TrackSelectionArray(this.f11501z.f11722h.f17990c);
    }

    /* renamed from: A0 */
    public C4446s0 m29530A0(C4446s0.InterfaceC4448b interfaceC4448b) {
        return new C4446s0(this.f11482g, interfaceC4448b, this.f11501z.f11715a, mo29463l(), this.f11491p, this.f11482g.m29413A());
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: B */
    public int mo29529B(int i) {
        return this.f11478c[i].mo20720d();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: C */
    public Player.InterfaceC4372b mo29527C() {
        return null;
    }

    /* renamed from: C0 */
    public boolean m29526C0() {
        return this.f11501z.f11729o;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: E */
    public void mo29524E(int i, long j) {
        Timeline timeline = this.f11501z.f11715a;
        if (i >= 0 && (timeline.m29737q() || i < timeline.mo11753p())) {
            int i2 = 1;
            this.f11494s++;
            if (mo29483d()) {
                C9197r.m16178h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C4406h0.C4411e c4411e = new C4406h0.C4411e(this.f11501z);
                c4411e.m29296b(1);
                this.f11481f.mo28588a(c4411e);
                return;
            }
            if (mo29505P() != 1) {
                i2 = 2;
            }
            C4444r0 m29478e1 = m29478e1(this.f11501z.m29165h(i2), timeline, m29521F0(timeline, i, j));
            this.f11482g.m29310w0(timeline, i, C7390b.m20792c(j));
            m29443s1(m29478e1, true, 1, 0, 1, true);
            return;
        }
        throw new C7400k(timeline, i, j);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: F */
    public boolean mo29522F() {
        return this.f11501z.f11725k;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: G */
    public void mo29520G(final boolean z) {
        if (this.f11493r != z) {
            this.f11493r = z;
            this.f11482g.m29376S0(z);
            this.f11483h.m16198l(10, new C9192q.InterfaceC9193a() { // from class: com.google.android.exoplayer2.v
                @Override // p195k8.C9192q.InterfaceC9193a
                public final void invoke(Object obj) {
                    ((Player.InterfaceC4371a) obj).onShuffleModeEnabledChanged(z);
                }
            });
        }
    }

    /* renamed from: G0 */
    public int m29519G0() {
        return this.f11478c.length;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: I */
    public int mo29517I() {
        if (this.f11501z.f11715a.m29737q()) {
            return this.f11475B;
        }
        C4444r0 c4444r0 = this.f11501z;
        return c4444r0.f11715a.mo11758b(c4444r0.f11716b.f27016a);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: K */
    public void mo29514K(Player.InterfaceC4371a interfaceC4371a) {
        this.f11483h.m16207c(interfaceC4371a);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: L */
    public int mo29512L() {
        if (mo29483d()) {
            return this.f11501z.f11716b.f27018c;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: M */
    public long mo29510M() {
        if (mo29483d()) {
            C4444r0 c4444r0 = this.f11501z;
            c4444r0.f11715a.mo29711h(c4444r0.f11716b.f27016a, this.f11484i);
            C4444r0 c4444r02 = this.f11501z;
            if (c4444r02.f11717c == -9223372036854775807L) {
                return c4444r02.f11715a.m29738n(mo29463l(), this.f11473a).m29719b();
            }
            return this.f11484i.m29725k() + C7390b.m20791d(this.f11501z.f11717c);
        }
        return mo29491Y();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: O */
    public long mo29507O() {
        if (mo29483d()) {
            C4444r0 c4444r0 = this.f11501z;
            if (c4444r0.f11724j.equals(c4444r0.f11716b)) {
                return C7390b.m20791d(this.f11501z.f11730p);
            }
            return getDuration();
        }
        return mo29493X();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: P */
    public int mo29505P() {
        return this.f11501z.f11718d;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: S */
    public void mo29501S(final int i) {
        if (this.f11492q != i) {
            this.f11492q = i;
            this.f11482g.m29382P0(i);
            this.f11483h.m16198l(9, new C9192q.InterfaceC9193a() { // from class: com.google.android.exoplayer2.s
                @Override // p195k8.C9192q.InterfaceC9193a
                public final void invoke(Object obj) {
                    ((Player.InterfaceC4371a) obj).onRepeatModeChanged(i);
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: V */
    public int mo29497V() {
        return this.f11492q;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: W */
    public boolean mo29495W() {
        return this.f11493r;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: X */
    public long mo29493X() {
        if (this.f11501z.f11715a.m29737q()) {
            return this.f11476C;
        }
        C4444r0 c4444r0 = this.f11501z;
        if (c4444r0.f11724j.f27019d != c4444r0.f11716b.f27019d) {
            return c4444r0.f11715a.m29738n(mo29463l(), this.f11473a).m29717d();
        }
        long j = c4444r0.f11730p;
        if (this.f11501z.f11724j.m11751b()) {
            C4444r0 c4444r02 = this.f11501z;
            Timeline.C4378b mo29711h = c4444r02.f11715a.mo29711h(c4444r02.f11724j.f27016a, this.f11484i);
            long m29730f = mo29711h.m29730f(this.f11501z.f11724j.f27017b);
            if (m29730f == Long.MIN_VALUE) {
                j = mo29711h.f11374d;
            } else {
                j = m29730f;
            }
        }
        return m29476f1(this.f11501z.f11724j, j);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: Y */
    public long mo29491Y() {
        if (this.f11501z.f11715a.m29737q()) {
            return this.f11476C;
        }
        if (this.f11501z.f11716b.m11751b()) {
            return C7390b.m20791d(this.f11501z.f11732r);
        }
        C4444r0 c4444r0 = this.f11501z;
        return m29476f1(c4444r0.f11716b, c4444r0.f11732r);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: b */
    public PlaybackParameters mo29487b() {
        return this.f11501z.f11727m;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: c */
    public void mo29485c() {
        int i;
        C4444r0 c4444r0 = this.f11501z;
        if (c4444r0.f11718d != 1) {
            return;
        }
        C4444r0 m29167f = c4444r0.m29167f(null);
        if (m29167f.f11715a.m29737q()) {
            i = 4;
        } else {
            i = 2;
        }
        C4444r0 m29165h = m29167f.m29165h(i);
        this.f11494s++;
        this.f11482g.m29352e0();
        m29443s1(m29165h, false, 4, 1, 1, false);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: d */
    public boolean mo29483d() {
        return this.f11501z.f11716b.m11751b();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: e */
    public long mo29480e() {
        return C7390b.m20791d(this.f11501z.f11731q);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: g */
    public List<Metadata> mo29475g() {
        return this.f11501z.f11723i;
    }

    /* renamed from: g1 */
    public void m29473g1() {
        C9197r.m16180f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.13.3] [" + C9191p0.f24175e + "] [" + C7397h.m20759b() + "]");
        if (!this.f11482g.m29346g0()) {
            this.f11483h.m16198l(11, new C9192q.InterfaceC9193a() { // from class: com.google.android.exoplayer2.w
                @Override // p195k8.C9192q.InterfaceC9193a
                public final void invoke(Object obj) {
                    C4397e0.m29509M0((Player.InterfaceC4371a) obj);
                }
            });
        }
        this.f11483h.m16200j();
        this.f11480e.mo16331f(null);
        C4382a c4382a = this.f11488m;
        if (c4382a != null) {
            this.f11490o.mo20637a(c4382a);
        }
        C4444r0 m29165h = this.f11501z.m29165h(1);
        this.f11501z = m29165h;
        C4444r0 m29171b = m29165h.m29171b(m29165h.f11716b);
        this.f11501z = m29171b;
        m29171b.f11730p = m29171b.f11732r;
        this.f11501z.f11731q = 0L;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getDuration() {
        if (mo29483d()) {
            C4444r0 c4444r0 = this.f11501z;
            InterfaceC10341s.C10342a c10342a = c4444r0.f11716b;
            c4444r0.f11715a.mo29711h(c10342a.f27016a, this.f11484i);
            return C7390b.m20791d(this.f11484i.m29734b(c10342a.f27017b, c10342a.f27018c));
        }
        return m29535a0();
    }

    /* renamed from: j1 */
    public void m29467j1(InterfaceC10341s interfaceC10341s) {
        m29464k1(Collections.singletonList(interfaceC10341s));
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: k */
    public void mo29466k(Player.InterfaceC4371a interfaceC4371a) {
        this.f11483h.m16199k(interfaceC4371a);
    }

    /* renamed from: k1 */
    public void m29464k1(List<InterfaceC10341s> list) {
        m29458m1(list, true);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: l */
    public int mo29463l() {
        int m29525D0 = m29525D0();
        if (m29525D0 == -1) {
            return 0;
        }
        return m29525D0;
    }

    /* renamed from: l1 */
    public void m29461l1(List<InterfaceC10341s> list, int i, long j) {
        m29455n1(list, i, j, false);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: m */
    public ExoPlaybackException mo29460m() {
        return this.f11501z.f11719e;
    }

    /* renamed from: m1 */
    public void m29458m1(List<InterfaceC10341s> list, boolean z) {
        m29455n1(list, -1, -9223372036854775807L, z);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: n */
    public void mo29457n(boolean z) {
        m29452o1(z, 0, 1);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: o */
    public Player.InterfaceC4373c mo29454o() {
        return null;
    }

    /* renamed from: o1 */
    public void m29452o1(boolean z, int i, int i2) {
        C4444r0 c4444r0 = this.f11501z;
        if (c4444r0.f11725k == z && c4444r0.f11726l == i) {
            return;
        }
        this.f11494s++;
        C4444r0 m29168e = c4444r0.m29168e(z, i);
        this.f11482g.m29390L0(z, i);
        m29443s1(m29168e, false, 4, 0, i2, false);
    }

    /* renamed from: p1 */
    public void m29450p1(PlaybackParameters playbackParameters) {
        if (playbackParameters == null) {
            playbackParameters = PlaybackParameters.f11301d;
        }
        if (this.f11501z.f11727m.equals(playbackParameters)) {
            return;
        }
        C4444r0 m29166g = this.f11501z.m29166g(playbackParameters);
        this.f11494s++;
        this.f11482g.m29386N0(playbackParameters);
        m29443s1(m29166g, false, 4, 0, 1, false);
    }

    /* renamed from: q1 */
    public void m29448q1(boolean z) {
        m29445r1(z, null);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: r */
    public int mo29447r() {
        if (mo29483d()) {
            return this.f11501z.f11716b.f27017b;
        }
        return -1;
    }

    /* renamed from: r1 */
    public void m29445r1(boolean z, ExoPlaybackException exoPlaybackException) {
        C4444r0 m29171b;
        if (z) {
            m29171b = m29471h1(0, this.f11485j.size()).m29167f(null);
        } else {
            C4444r0 c4444r0 = this.f11501z;
            m29171b = c4444r0.m29171b(c4444r0.f11716b);
            m29171b.f11730p = m29171b.f11732r;
            m29171b.f11731q = 0L;
        }
        C4444r0 m29165h = m29171b.m29165h(1);
        if (exoPlaybackException != null) {
            m29165h = m29165h.m29167f(exoPlaybackException);
        }
        this.f11494s++;
        this.f11482g.m29354d1();
        m29443s1(m29165h, false, 4, 0, 1, false);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: t */
    public int mo29442t() {
        return this.f11501z.f11726l;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: u */
    public TrackGroupArray mo29440u() {
        return this.f11501z.f11721g;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: v */
    public Timeline mo29438v() {
        return this.f11501z.f11715a;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: w */
    public Looper mo29436w() {
        return this.f11489n;
    }
}