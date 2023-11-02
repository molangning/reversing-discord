package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.C4415i;
import com.google.android.exoplayer2.C4438q0;
import com.google.android.exoplayer2.C4446s0;
import com.google.android.exoplayer2.InterfaceC4483u0;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.C4382a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import gb.AbstractC6693s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p099f8.AbstractC6347m;
import p099f8.C6349n;
import p099f8.InterfaceC6337h;
import p102fb.InterfaceC6386l;
import p151i6.C7390b;
import p151i6.C7408s;
import p151i6.C7410u;
import p151i6.InterfaceC7401l;
import p151i6.InterfaceC7407r;
import p153i8.InterfaceC7444e;
import p195k8.C9149a;
import p195k8.C9185m0;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.InterfaceC9155c;
import p195k8.InterfaceC9184m;
import p229m7.InterfaceC10320m0;
import p229m7.InterfaceC10327o0;
import p229m7.InterfaceC10329p;
import p229m7.InterfaceC10341s;
import p383v7.C13141m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4406h0 implements Handler.Callback, InterfaceC10329p.InterfaceC10330a, AbstractC6347m.InterfaceC6348a, C4438q0.InterfaceC4442d, C4415i.InterfaceC4416a, C4446s0.InterfaceC4447a {

    /* renamed from: A */
    private final C4432n0 f11548A;

    /* renamed from: B */
    private final C4438q0 f11549B;

    /* renamed from: C */
    private final InterfaceC4417i0 f11550C;

    /* renamed from: D */
    private final long f11551D;

    /* renamed from: E */
    private C7410u f11552E;

    /* renamed from: F */
    private C4444r0 f11553F;

    /* renamed from: G */
    private C4411e f11554G;

    /* renamed from: H */
    private boolean f11555H;

    /* renamed from: I */
    private boolean f11556I;

    /* renamed from: J */
    private boolean f11557J;

    /* renamed from: K */
    private boolean f11558K;

    /* renamed from: L */
    private boolean f11559L;

    /* renamed from: M */
    private int f11560M;

    /* renamed from: N */
    private boolean f11561N;

    /* renamed from: O */
    private boolean f11562O;

    /* renamed from: P */
    private boolean f11563P;

    /* renamed from: Q */
    private boolean f11564Q;

    /* renamed from: R */
    private int f11565R;

    /* renamed from: S */
    private C4414h f11566S;

    /* renamed from: T */
    private long f11567T;

    /* renamed from: U */
    private int f11568U;

    /* renamed from: V */
    private boolean f11569V;

    /* renamed from: W */
    private ExoPlaybackException f11570W;

    /* renamed from: X */
    private long f11571X;

    /* renamed from: j */
    private final InterfaceC4483u0[] f11572j;

    /* renamed from: k */
    private final InterfaceC7407r[] f11573k;

    /* renamed from: l */
    private final AbstractC6347m f11574l;

    /* renamed from: m */
    private final C6349n f11575m;

    /* renamed from: n */
    private final InterfaceC7401l f11576n;

    /* renamed from: o */
    private final InterfaceC7444e f11577o;

    /* renamed from: p */
    private final InterfaceC9184m f11578p;

    /* renamed from: q */
    private final HandlerThread f11579q;

    /* renamed from: r */
    private final Looper f11580r;

    /* renamed from: s */
    private final Timeline.C4379c f11581s;

    /* renamed from: t */
    private final Timeline.C4378b f11582t;

    /* renamed from: u */
    private final long f11583u;

    /* renamed from: v */
    private final boolean f11584v;

    /* renamed from: w */
    private final C4415i f11585w;

    /* renamed from: x */
    private final ArrayList<C4410d> f11586x;

    /* renamed from: y */
    private final InterfaceC9155c f11587y;

    /* renamed from: z */
    private final InterfaceC4412f f11588z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.exoplayer2.h0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4407a implements InterfaceC4483u0.InterfaceC4484a {
        C4407a() {
        }

        @Override // com.google.android.exoplayer2.InterfaceC4483u0.InterfaceC4484a
        /* renamed from: a */
        public void mo28958a() {
            C4406h0.this.f11578p.mo16329h(2);
        }

        @Override // com.google.android.exoplayer2.InterfaceC4483u0.InterfaceC4484a
        /* renamed from: b */
        public void mo28957b(long j) {
            if (j >= 2000) {
                C4406h0.this.f11563P = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.h0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4408b {

        /* renamed from: a */
        private final List<C4438q0.C4441c> f11590a;

        /* renamed from: b */
        private final InterfaceC10327o0 f11591b;

        /* renamed from: c */
        private final int f11592c;

        /* renamed from: d */
        private final long f11593d;

        /* synthetic */ C4408b(List list, InterfaceC10327o0 interfaceC10327o0, int i, long j, C4407a c4407a) {
            this(list, interfaceC10327o0, i, j);
        }

        private C4408b(List<C4438q0.C4441c> list, InterfaceC10327o0 interfaceC10327o0, int i, long j) {
            this.f11590a = list;
            this.f11591b = interfaceC10327o0;
            this.f11592c = i;
            this.f11593d = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.h0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4409c {

        /* renamed from: a */
        public final int f11594a;

        /* renamed from: b */
        public final int f11595b;

        /* renamed from: c */
        public final int f11596c;

        /* renamed from: d */
        public final InterfaceC10327o0 f11597d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.h0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4410d implements Comparable<C4410d> {

        /* renamed from: j */
        public final C4446s0 f11598j;

        /* renamed from: k */
        public int f11599k;

        /* renamed from: l */
        public long f11600l;

        /* renamed from: m */
        public Object f11601m;

        public C4410d(C4446s0 c4446s0) {
            this.f11598j = c4446s0;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C4410d c4410d) {
            boolean z;
            boolean z2;
            Object obj = this.f11601m;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            if (c4410d.f11601m == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (obj == null) {
                    return 1;
                }
                return -1;
            } else if (obj == null) {
                return 0;
            } else {
                int i = this.f11599k - c4410d.f11599k;
                if (i != 0) {
                    return i;
                }
                return C9191p0.m16231p(this.f11600l, c4410d.f11600l);
            }
        }

        /* renamed from: b */
        public void m29298b(int i, long j, Object obj) {
            this.f11599k = i;
            this.f11600l = j;
            this.f11601m = obj;
        }
    }

    /* renamed from: com.google.android.exoplayer2.h0$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4411e {

        /* renamed from: a */
        private boolean f11602a;

        /* renamed from: b */
        public C4444r0 f11603b;

        /* renamed from: c */
        public int f11604c;

        /* renamed from: d */
        public boolean f11605d;

        /* renamed from: e */
        public int f11606e;

        /* renamed from: f */
        public boolean f11607f;

        /* renamed from: g */
        public int f11608g;

        public C4411e(C4444r0 c4444r0) {
            this.f11603b = c4444r0;
        }

        /* renamed from: b */
        public void m29296b(int i) {
            boolean z;
            boolean z2 = this.f11602a;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            this.f11602a = z2 | z;
            this.f11604c += i;
        }

        /* renamed from: c */
        public void m29295c(int i) {
            this.f11602a = true;
            this.f11607f = true;
            this.f11608g = i;
        }

        /* renamed from: d */
        public void m29294d(C4444r0 c4444r0) {
            boolean z;
            boolean z2 = this.f11602a;
            if (this.f11603b != c4444r0) {
                z = true;
            } else {
                z = false;
            }
            this.f11602a = z2 | z;
            this.f11603b = c4444r0;
        }

        /* renamed from: e */
        public void m29293e(int i) {
            boolean z = true;
            if (this.f11605d && this.f11606e != 4) {
                if (i != 4) {
                    z = false;
                }
                C9149a.m16452a(z);
                return;
            }
            this.f11602a = true;
            this.f11605d = true;
            this.f11606e = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.h0$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4412f {
        /* renamed from: a */
        void mo28588a(C4411e c4411e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.h0$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4413g {

        /* renamed from: a */
        public final InterfaceC10341s.C10342a f11609a;

        /* renamed from: b */
        public final long f11610b;

        /* renamed from: c */
        public final long f11611c;

        /* renamed from: d */
        public final boolean f11612d;

        /* renamed from: e */
        public final boolean f11613e;

        /* renamed from: f */
        public final boolean f11614f;

        public C4413g(InterfaceC10341s.C10342a c10342a, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f11609a = c10342a;
            this.f11610b = j;
            this.f11611c = j2;
            this.f11612d = z;
            this.f11613e = z2;
            this.f11614f = z3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.h0$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4414h {

        /* renamed from: a */
        public final Timeline f11615a;

        /* renamed from: b */
        public final int f11616b;

        /* renamed from: c */
        public final long f11617c;

        public C4414h(Timeline timeline, int i, long j) {
            this.f11615a = timeline;
            this.f11616b = i;
            this.f11617c = j;
        }
    }

    public C4406h0(InterfaceC4483u0[] interfaceC4483u0Arr, AbstractC6347m abstractC6347m, C6349n c6349n, InterfaceC7401l interfaceC7401l, InterfaceC7444e interfaceC7444e, int i, boolean z, C4382a c4382a, C7410u c7410u, InterfaceC4417i0 interfaceC4417i0, long j, boolean z2, Looper looper, InterfaceC9155c interfaceC9155c, InterfaceC4412f interfaceC4412f) {
        this.f11588z = interfaceC4412f;
        this.f11572j = interfaceC4483u0Arr;
        this.f11574l = abstractC6347m;
        this.f11575m = c6349n;
        this.f11576n = interfaceC7401l;
        this.f11577o = interfaceC7444e;
        this.f11560M = i;
        this.f11561N = z;
        this.f11552E = c7410u;
        this.f11550C = interfaceC4417i0;
        this.f11551D = j;
        this.f11571X = j;
        this.f11556I = z2;
        this.f11587y = interfaceC9155c;
        this.f11583u = interfaceC7401l.mo20754c();
        this.f11584v = interfaceC7401l.mo20755b();
        C4444r0 m29162k = C4444r0.m29162k(c6349n);
        this.f11553F = m29162k;
        this.f11554G = new C4411e(m29162k);
        this.f11573k = new InterfaceC7407r[interfaceC4483u0Arr.length];
        for (int i2 = 0; i2 < interfaceC4483u0Arr.length; i2++) {
            interfaceC4483u0Arr[i2].setIndex(i2);
            this.f11573k[i2] = interfaceC4483u0Arr[i2].mo28962n();
        }
        this.f11585w = new C4415i(this, interfaceC9155c);
        this.f11586x = new ArrayList<>();
        this.f11581s = new Timeline.C4379c();
        this.f11582t = new Timeline.C4378b();
        abstractC6347m.m22880b(this, interfaceC7444e);
        this.f11569V = true;
        Handler handler = new Handler(looper);
        this.f11548A = new C4432n0(c4382a, handler);
        this.f11549B = new C4438q0(this, c4382a, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f11579q = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f11580r = looper2;
        this.f11578p = interfaceC9155c.mo16372c(looper2, this);
    }

    /* renamed from: A0 */
    private long m29412A0(InterfaceC10341s.C10342a c10342a, long j, boolean z, boolean z2) {
        m29348f1();
        this.f11558K = false;
        if (z2 || this.f11553F.f11718d == 3) {
            m29370V0(2);
        }
        C4423k0 m29219o = this.f11548A.m29219o();
        C4423k0 c4423k0 = m29219o;
        while (c4423k0 != null && !c10342a.equals(c4423k0.f11634f.f11645a)) {
            c4423k0 = c4423k0.m29269j();
        }
        if (z || m29219o != c4423k0 || (c4423k0 != null && c4423k0.m29253z(j) < 0)) {
            for (InterfaceC4483u0 interfaceC4483u0 : this.f11572j) {
                m29328n(interfaceC4483u0);
            }
            if (c4423k0 != null) {
                while (this.f11548A.m29219o() != c4423k0) {
                    this.f11548A.m29232b();
                }
                this.f11548A.m29209y(c4423k0);
                c4423k0.m29255x(0L);
                m29321r();
            }
        }
        if (c4423k0 != null) {
            this.f11548A.m29209y(c4423k0);
            if (!c4423k0.f11632d) {
                c4423k0.f11634f = c4423k0.f11634f.m29251b(j);
            } else {
                long j2 = c4423k0.f11634f.f11649e;
                if (j2 != -9223372036854775807L && j >= j2) {
                    j = Math.max(0L, j2 - 1);
                }
                if (c4423k0.f11633e) {
                    long mo6250l = c4423k0.f11629a.mo6250l(j);
                    c4423k0.f11629a.mo6242u(mo6250l - this.f11583u, this.f11584v);
                    j = mo6250l;
                }
            }
            m29326o0(j);
            m29381Q();
        } else {
            this.f11548A.m29228f();
            m29326o0(j);
        }
        m29405E(false);
        this.f11578p.mo16329h(2);
        return j;
    }

    /* renamed from: B */
    private long m29411B() {
        return m29409C(this.f11553F.f11730p);
    }

    /* renamed from: B0 */
    private void m29410B0(C4446s0 c4446s0) {
        if (c4446s0.m29156e() == -9223372036854775807L) {
            m29408C0(c4446s0);
        } else if (this.f11553F.f11715a.m29737q()) {
            this.f11586x.add(new C4410d(c4446s0));
        } else {
            C4410d c4410d = new C4410d(c4446s0);
            Timeline timeline = this.f11553F.f11715a;
            if (m29322q0(c4410d, timeline, timeline, this.f11560M, this.f11561N, this.f11581s, this.f11582t)) {
                this.f11586x.add(c4410d);
                Collections.sort(this.f11586x);
                return;
            }
            c4446s0.m29150k(false);
        }
    }

    /* renamed from: C */
    private long m29409C(long j) {
        C4423k0 m29224j = this.f11548A.m29224j();
        if (m29224j == null) {
            return 0L;
        }
        return Math.max(0L, j - m29224j.m29254y(this.f11567T));
    }

    /* renamed from: C0 */
    private void m29408C0(C4446s0 c4446s0) {
        if (c4446s0.m29158c() == this.f11580r) {
            m29331m(c4446s0);
            int i = this.f11553F.f11718d;
            if (i == 3 || i == 2) {
                this.f11578p.mo16329h(2);
                return;
            }
            return;
        }
        this.f11578p.mo16332e(15, c4446s0).sendToTarget();
    }

    /* renamed from: D */
    private void m29407D(InterfaceC10329p interfaceC10329p) {
        if (!this.f11548A.m29213u(interfaceC10329p)) {
            return;
        }
        this.f11548A.m29210x(this.f11567T);
        m29381Q();
    }

    /* renamed from: D0 */
    private void m29406D0(final C4446s0 c4446s0) {
        Looper m29158c = c4446s0.m29158c();
        if (!m29158c.getThread().isAlive()) {
            C9197r.m16178h("TAG", "Trying to send message on a dead thread.");
            c4446s0.m29150k(false);
            return;
        }
        this.f11587y.mo16372c(m29158c, null).mo16336a(new Runnable() { // from class: com.google.android.exoplayer2.f0
            @Override // java.lang.Runnable
            public final void run() {
                C4406h0.this.m29383P(c4446s0);
            }
        });
    }

    /* renamed from: E */
    private void m29405E(boolean z) {
        InterfaceC10341s.C10342a c10342a;
        long m29270i;
        C4423k0 m29224j = this.f11548A.m29224j();
        if (m29224j == null) {
            c10342a = this.f11553F.f11716b;
        } else {
            c10342a = m29224j.f11634f.f11645a;
        }
        boolean z2 = !this.f11553F.f11724j.equals(c10342a);
        if (z2) {
            this.f11553F = this.f11553F.m29171b(c10342a);
        }
        C4444r0 c4444r0 = this.f11553F;
        if (m29224j == null) {
            m29270i = c4444r0.f11732r;
        } else {
            m29270i = m29224j.m29270i();
        }
        c4444r0.f11730p = m29270i;
        this.f11553F.f11731q = m29411B();
        if ((z2 || z) && m29224j != null && m29224j.f11632d) {
            m29339i1(m29224j.m29265n(), m29224j.m29264o());
        }
    }

    /* renamed from: E0 */
    private void m29404E0(long j) {
        InterfaceC4483u0[] interfaceC4483u0Arr;
        for (InterfaceC4483u0 interfaceC4483u0 : this.f11572j) {
            if (interfaceC4483u0.mo28961s() != null) {
                m29402F0(interfaceC4483u0, j);
            }
        }
    }

    /* renamed from: F */
    private void m29403F(Timeline timeline) {
        boolean z;
        C4414h c4414h;
        C4413g m29318s0 = m29318s0(timeline, this.f11553F, this.f11566S, this.f11548A, this.f11560M, this.f11561N, this.f11581s, this.f11582t);
        InterfaceC10341s.C10342a c10342a = m29318s0.f11609a;
        long j = m29318s0.f11611c;
        boolean z2 = m29318s0.f11612d;
        long j2 = m29318s0.f11610b;
        if (this.f11553F.f11716b.equals(c10342a) && j2 == this.f11553F.f11732r) {
            z = false;
        } else {
            z = true;
        }
        long j3 = -9223372036854775807L;
        try {
            if (m29318s0.f11613e) {
                if (this.f11553F.f11718d != 1) {
                    m29370V0(4);
                }
                m29330m0(false, false, false, true);
            }
        } catch (Throwable th2) {
            th = th2;
            c4414h = null;
        }
        try {
            if (!z) {
                if (!this.f11548A.m29236E(timeline, this.f11567T, m29307y())) {
                    m29308x0(false);
                }
            } else if (!timeline.m29737q()) {
                for (C4423k0 m29219o = this.f11548A.m29219o(); m29219o != null; m29219o = m29219o.m29269j()) {
                    if (m29219o.f11634f.f11645a.equals(c10342a)) {
                        m29219o.f11634f = this.f11548A.m29217q(timeline, m29219o.f11634f);
                    }
                }
                j2 = m29304z0(c10342a, j2, z2);
            }
            C4444r0 c4444r0 = this.f11553F;
            Timeline timeline2 = c4444r0.f11715a;
            InterfaceC10341s.C10342a c10342a2 = c4444r0.f11716b;
            if (m29318s0.f11614f) {
                j3 = j2;
            }
            m29342h1(timeline, c10342a, timeline2, c10342a2, j3);
            if (z || j != this.f11553F.f11717c) {
                this.f11553F = m29395J(c10342a, j2, j);
            }
            m29327n0();
            m29320r0(timeline, this.f11553F.f11715a);
            this.f11553F = this.f11553F.m29163j(timeline);
            if (!timeline.m29737q()) {
                this.f11566S = null;
            }
            m29405E(false);
        } catch (Throwable th3) {
            th = th3;
            c4414h = null;
            C4444r0 c4444r02 = this.f11553F;
            Timeline timeline3 = c4444r02.f11715a;
            InterfaceC10341s.C10342a c10342a3 = c4444r02.f11716b;
            if (m29318s0.f11614f) {
                j3 = j2;
            }
            C4414h c4414h2 = c4414h;
            m29342h1(timeline, c10342a, timeline3, c10342a3, j3);
            if (z || j != this.f11553F.f11717c) {
                this.f11553F = m29395J(c10342a, j2, j);
            }
            m29327n0();
            m29320r0(timeline, this.f11553F.f11715a);
            this.f11553F = this.f11553F.m29163j(timeline);
            if (!timeline.m29737q()) {
                this.f11566S = c4414h2;
            }
            m29405E(false);
            throw th;
        }
    }

    /* renamed from: F0 */
    private void m29402F0(InterfaceC4483u0 interfaceC4483u0, long j) {
        interfaceC4483u0.mo28966i();
        if (interfaceC4483u0 instanceof C13141m) {
            ((C13141m) interfaceC4483u0).m3112U(j);
        }
    }

    /* renamed from: G */
    private void m29401G(InterfaceC10329p interfaceC10329p) {
        if (!this.f11548A.m29213u(interfaceC10329p)) {
            return;
        }
        C4423k0 m29224j = this.f11548A.m29224j();
        m29224j.m29263p(this.f11585w.mo16172b().f11302a, this.f11553F.f11715a);
        m29339i1(m29224j.m29265n(), m29224j.m29264o());
        if (m29224j == this.f11548A.m29219o()) {
            m29326o0(m29224j.f11634f.f11646b);
            m29321r();
            C4444r0 c4444r0 = this.f11553F;
            this.f11553F = m29395J(c4444r0.f11716b, m29224j.f11634f.f11646b, c4444r0.f11717c);
        }
        m29381Q();
    }

    /* renamed from: G0 */
    private void m29400G0(boolean z, AtomicBoolean atomicBoolean) {
        InterfaceC4483u0[] interfaceC4483u0Arr;
        if (this.f11562O != z) {
            this.f11562O = z;
            if (!z) {
                for (InterfaceC4483u0 interfaceC4483u0 : this.f11572j) {
                    if (!m29389M(interfaceC4483u0)) {
                        interfaceC4483u0.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* renamed from: H */
    private void m29399H(PlaybackParameters playbackParameters, float f, boolean z, boolean z2) {
        InterfaceC4483u0[] interfaceC4483u0Arr;
        if (z) {
            if (z2) {
                this.f11554G.m29296b(1);
            }
            this.f11553F = this.f11553F.m29166g(playbackParameters);
        }
        m29332l1(playbackParameters.f11302a);
        for (InterfaceC4483u0 interfaceC4483u0 : this.f11572j) {
            if (interfaceC4483u0 != null) {
                interfaceC4483u0.mo12360p(f, playbackParameters.f11302a);
            }
        }
    }

    /* renamed from: H0 */
    private void m29398H0(C4408b c4408b) {
        this.f11554G.m29296b(1);
        if (c4408b.f11592c != -1) {
            this.f11566S = new C4414h(new C4481t0(c4408b.f11590a, c4408b.f11591b), c4408b.f11592c, c4408b.f11593d);
        }
        m29403F(this.f11549B.m29205C(c4408b.f11590a, c4408b.f11591b));
    }

    /* renamed from: I */
    private void m29397I(PlaybackParameters playbackParameters, boolean z) {
        m29399H(playbackParameters, playbackParameters.f11302a, true, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: J */
    private C4444r0 m29395J(InterfaceC10341s.C10342a c10342a, long j, long j2) {
        boolean z;
        List list;
        TrackGroupArray trackGroupArray;
        C6349n c6349n;
        TrackGroupArray m29265n;
        C6349n m29264o;
        if (!this.f11569V && j == this.f11553F.f11732r && c10342a.equals(this.f11553F.f11716b)) {
            z = false;
        } else {
            z = true;
        }
        this.f11569V = z;
        m29327n0();
        C4444r0 c4444r0 = this.f11553F;
        TrackGroupArray trackGroupArray2 = c4444r0.f11721g;
        C6349n c6349n2 = c4444r0.f11722h;
        List list2 = c4444r0.f11723i;
        if (this.f11549B.m29185s()) {
            C4423k0 m29219o = this.f11548A.m29219o();
            if (m29219o == null) {
                m29265n = TrackGroupArray.f11763m;
            } else {
                m29265n = m29219o.m29265n();
            }
            if (m29219o == null) {
                m29264o = this.f11575m;
            } else {
                m29264o = m29219o.m29264o();
            }
            List m29315u = m29315u(m29264o.f17990c);
            if (m29219o != null) {
                C4425l0 c4425l0 = m29219o.f11634f;
                if (c4425l0.f11647c != j2) {
                    m29219o.f11634f = c4425l0.m29252a(j2);
                }
            }
            trackGroupArray = m29265n;
            c6349n = m29264o;
            list = m29315u;
        } else if (!c10342a.equals(this.f11553F.f11716b)) {
            TrackGroupArray trackGroupArray3 = TrackGroupArray.f11763m;
            trackGroupArray = trackGroupArray3;
            c6349n = this.f11575m;
            list = AbstractC6693s.m22131x();
        } else {
            list = list2;
            trackGroupArray = trackGroupArray2;
            c6349n = c6349n2;
        }
        return this.f11553F.m29170c(c10342a, j, j2, m29411B(), trackGroupArray, c6349n, list);
    }

    /* renamed from: J0 */
    private void m29394J0(boolean z) {
        if (z == this.f11564Q) {
            return;
        }
        this.f11564Q = z;
        C4444r0 c4444r0 = this.f11553F;
        int i = c4444r0.f11718d;
        if (!z && i != 4 && i != 1) {
            this.f11578p.mo16329h(2);
        } else {
            this.f11553F = c4444r0.m29169d(z);
        }
    }

    /* renamed from: K */
    private boolean m29393K() {
        C4423k0 m29218p = this.f11548A.m29218p();
        if (!m29218p.f11632d) {
            return false;
        }
        int i = 0;
        while (true) {
            InterfaceC4483u0[] interfaceC4483u0Arr = this.f11572j;
            if (i < interfaceC4483u0Arr.length) {
                InterfaceC4483u0 interfaceC4483u0 = interfaceC4483u0Arr[i];
                InterfaceC10320m0 interfaceC10320m0 = m29218p.f11631c[i];
                if (interfaceC4483u0.mo28961s() != interfaceC10320m0 || (interfaceC10320m0 != null && !interfaceC4483u0.mo28968g())) {
                    break;
                }
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K0 */
    private void m29392K0(boolean z) {
        this.f11556I = z;
        m29327n0();
        if (this.f11557J && this.f11548A.m29218p() != this.f11548A.m29219o()) {
            m29308x0(true);
            m29405E(false);
        }
    }

    /* renamed from: L */
    private boolean m29391L() {
        C4423k0 m29224j = this.f11548A.m29224j();
        if (m29224j == null || m29224j.m29268k() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    private static boolean m29389M(InterfaceC4483u0 interfaceC4483u0) {
        return interfaceC4483u0.getState() != 0;
    }

    /* renamed from: M0 */
    private void m29388M0(boolean z, int i, boolean z2, int i2) {
        this.f11554G.m29296b(z2 ? 1 : 0);
        this.f11554G.m29295c(i2);
        this.f11553F = this.f11553F.m29168e(z, i);
        this.f11558K = false;
        m29359b0(z);
        if (!m29364Y0()) {
            m29348f1();
            m29335k1();
            return;
        }
        int i3 = this.f11553F.f11718d;
        if (i3 == 3) {
            m29356c1();
            this.f11578p.mo16329h(2);
        } else if (i3 == 2) {
            this.f11578p.mo16329h(2);
        }
    }

    /* renamed from: N */
    private boolean m29387N() {
        C4423k0 m29219o = this.f11548A.m29219o();
        long j = m29219o.f11634f.f11649e;
        if (m29219o.f11632d && (j == -9223372036854775807L || this.f11553F.f11732r < j || !m29364Y0())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ Boolean m29385O() {
        return Boolean.valueOf(this.f11555H);
    }

    /* renamed from: O0 */
    private void m29384O0(PlaybackParameters playbackParameters) {
        this.f11585w.mo16171f(playbackParameters);
        m29397I(this.f11585w.mo16172b(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m29383P(C4446s0 c4446s0) {
        try {
            m29331m(c4446s0);
        } catch (ExoPlaybackException e) {
            C9197r.m16182d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: Q */
    private void m29381Q() {
        boolean m29366X0 = m29366X0();
        this.f11559L = m29366X0;
        if (m29366X0) {
            this.f11548A.m29224j().m29275d(this.f11567T);
        }
        m29345g1();
    }

    /* renamed from: Q0 */
    private void m29380Q0(int i) {
        this.f11560M = i;
        if (!this.f11548A.m29235F(this.f11553F.f11715a, i)) {
            m29308x0(true);
        }
        m29405E(false);
    }

    /* renamed from: R */
    private void m29379R() {
        this.f11554G.m29294d(this.f11553F);
        if (this.f11554G.f11602a) {
            this.f11588z.mo28588a(this.f11554G);
            this.f11554G = new C4411e(this.f11553F);
        }
    }

    /* renamed from: R0 */
    private void m29378R0(C7410u c7410u) {
        this.f11552E = c7410u;
    }

    /* renamed from: S */
    private boolean m29377S(long j, long j2) {
        if (this.f11564Q && this.f11563P) {
            return false;
        }
        m29312v0(j, j2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090 A[LOOP:1: B:27:0x0074->B:37:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0044 -> B:14:0x0045). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0073 -> B:27:0x0074). Please submit an issue!!! */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m29375T(long r8, long r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C4406h0.m29375T(long, long):void");
    }

    /* renamed from: T0 */
    private void m29374T0(boolean z) {
        this.f11561N = z;
        if (!this.f11548A.m29234G(this.f11553F.f11715a, z)) {
            m29308x0(true);
        }
        m29405E(false);
    }

    /* renamed from: U */
    private void m29373U() {
        C4425l0 m29220n;
        this.f11548A.m29210x(this.f11567T);
        if (this.f11548A.m29238C() && (m29220n = this.f11548A.m29220n(this.f11567T, this.f11553F)) != null) {
            C4423k0 m29227g = this.f11548A.m29227g(this.f11573k, this.f11574l, this.f11576n.mo20752e(), this.f11549B, m29220n, this.f11575m);
            m29227g.f11629a.mo6249m(this, m29220n.f11646b);
            if (this.f11548A.m29219o() == m29227g) {
                m29326o0(m29227g.m29266m());
            }
            m29405E(false);
        }
        if (this.f11559L) {
            this.f11559L = m29391L();
            m29345g1();
            return;
        }
        m29381Q();
    }

    /* renamed from: U0 */
    private void m29372U0(InterfaceC10327o0 interfaceC10327o0) {
        this.f11554G.m29296b(1);
        m29403F(this.f11549B.m29204D(interfaceC10327o0));
    }

    /* renamed from: V */
    private void m29371V() {
        int i;
        boolean z = false;
        while (m29368W0()) {
            if (z) {
                m29379R();
            }
            C4423k0 m29219o = this.f11548A.m29219o();
            C4423k0 m29232b = this.f11548A.m29232b();
            C4425l0 c4425l0 = m29232b.f11634f;
            this.f11553F = m29395J(c4425l0.f11645a, c4425l0.f11646b, c4425l0.f11647c);
            if (m29219o.f11634f.f11650f) {
                i = 0;
            } else {
                i = 3;
            }
            this.f11554G.m29293e(i);
            Timeline timeline = this.f11553F.f11715a;
            m29342h1(timeline, m29232b.f11634f.f11645a, timeline, m29219o.f11634f.f11645a, -9223372036854775807L);
            m29327n0();
            m29335k1();
            z = true;
        }
    }

    /* renamed from: V0 */
    private void m29370V0(int i) {
        C4444r0 c4444r0 = this.f11553F;
        if (c4444r0.f11718d != i) {
            this.f11553F = c4444r0.m29165h(i);
        }
    }

    /* renamed from: W */
    private void m29369W() {
        long j;
        boolean z;
        C4423k0 m29218p = this.f11548A.m29218p();
        if (m29218p == null) {
            return;
        }
        int i = 0;
        if (m29218p.m29269j() != null && !this.f11557J) {
            if (!m29393K()) {
                return;
            }
            if (!m29218p.m29269j().f11632d && this.f11567T < m29218p.m29269j().m29266m()) {
                return;
            }
            C6349n m29264o = m29218p.m29264o();
            C4423k0 m29231c = this.f11548A.m29231c();
            C6349n m29264o2 = m29231c.m29264o();
            if (m29231c.f11632d && m29231c.f11629a.mo6248n() != -9223372036854775807L) {
                m29404E0(m29231c.m29266m());
                return;
            }
            for (int i2 = 0; i2 < this.f11572j.length; i2++) {
                boolean m22873c = m29264o.m22873c(i2);
                boolean m22873c2 = m29264o2.m22873c(i2);
                if (m22873c && !this.f11572j[i2].mo28963m()) {
                    if (this.f11573k[i2].mo20720d() == 7) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C7408s c7408s = m29264o.f17989b[i2];
                    C7408s c7408s2 = m29264o2.f17989b[i2];
                    if (!m22873c2 || !c7408s2.equals(c7408s) || z) {
                        m29402F0(this.f11572j[i2], m29231c.m29266m());
                    }
                }
            }
        } else if (m29218p.f11634f.f11652h || this.f11557J) {
            while (true) {
                InterfaceC4483u0[] interfaceC4483u0Arr = this.f11572j;
                if (i < interfaceC4483u0Arr.length) {
                    InterfaceC4483u0 interfaceC4483u0 = interfaceC4483u0Arr[i];
                    InterfaceC10320m0 interfaceC10320m0 = m29218p.f11631c[i];
                    if (interfaceC10320m0 != null && interfaceC4483u0.mo28961s() == interfaceC10320m0 && interfaceC4483u0.mo28968g()) {
                        long j2 = m29218p.f11634f.f11649e;
                        if (j2 != -9223372036854775807L && j2 != Long.MIN_VALUE) {
                            j = m29218p.m29267l() + m29218p.f11634f.f11649e;
                        } else {
                            j = -9223372036854775807L;
                        }
                        m29402F0(interfaceC4483u0, j);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: W0 */
    private boolean m29368W0() {
        C4423k0 m29219o;
        C4423k0 m29269j;
        if (!m29364Y0() || this.f11557J || (m29219o = this.f11548A.m29219o()) == null || (m29269j = m29219o.m29269j()) == null || this.f11567T < m29269j.m29266m() || !m29269j.f11635g) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    private void m29367X() {
        C4423k0 m29218p = this.f11548A.m29218p();
        if (m29218p != null && this.f11548A.m29219o() != m29218p && !m29218p.f11635g && m29336k0()) {
            m29321r();
        }
    }

    /* renamed from: X0 */
    private boolean m29366X0() {
        long m29254y;
        if (!m29391L()) {
            return false;
        }
        C4423k0 m29224j = this.f11548A.m29224j();
        long m29409C = m29409C(m29224j.m29268k());
        if (m29224j == this.f11548A.m29219o()) {
            m29254y = m29224j.m29254y(this.f11567T);
        } else {
            m29254y = m29224j.m29254y(this.f11567T) - m29224j.f11634f.f11646b;
        }
        return this.f11576n.mo20748i(m29254y, m29409C, this.f11585w.mo16172b().f11302a);
    }

    /* renamed from: Y */
    private void m29365Y() {
        m29403F(this.f11549B.m29195i());
    }

    /* renamed from: Y0 */
    private boolean m29364Y0() {
        C4444r0 c4444r0 = this.f11553F;
        return c4444r0.f11725k && c4444r0.f11726l == 0;
    }

    /* renamed from: Z */
    private void m29363Z(C4409c c4409c) {
        this.f11554G.m29296b(1);
        m29403F(this.f11549B.m29182v(c4409c.f11594a, c4409c.f11595b, c4409c.f11596c, c4409c.f11597d));
    }

    /* renamed from: Z0 */
    private boolean m29362Z0(boolean z) {
        long j;
        boolean z2;
        boolean z3;
        if (this.f11565R == 0) {
            return m29387N();
        }
        if (!z) {
            return false;
        }
        C4444r0 c4444r0 = this.f11553F;
        if (!c4444r0.f11720f) {
            return true;
        }
        if (m29360a1(c4444r0.f11715a, this.f11548A.m29219o().f11634f.f11645a)) {
            j = this.f11550C.mo29282c();
        } else {
            j = -9223372036854775807L;
        }
        long j2 = j;
        C4423k0 m29224j = this.f11548A.m29224j();
        if (m29224j.m29262q() && m29224j.f11634f.f11652h) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m29224j.f11634f.f11645a.m11751b() && !m29224j.f11632d) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 && !z3 && !this.f11576n.mo20753d(m29411B(), this.f11585w.mo16172b().f11302a, this.f11558K, j2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a0 */
    private void m29361a0() {
        InterfaceC6337h[] interfaceC6337hArr;
        for (C4423k0 m29219o = this.f11548A.m29219o(); m29219o != null; m29219o = m29219o.m29269j()) {
            for (InterfaceC6337h interfaceC6337h : m29219o.m29264o().f17990c) {
                if (interfaceC6337h != null) {
                    interfaceC6337h.mo22910g();
                }
            }
        }
    }

    /* renamed from: a1 */
    private boolean m29360a1(Timeline timeline, InterfaceC10341s.C10342a c10342a) {
        if (c10342a.m11751b() || timeline.m29737q()) {
            return false;
        }
        timeline.m29738n(timeline.mo29711h(c10342a.f27016a, this.f11582t).f11373c, this.f11581s);
        if (!this.f11581s.m29715f()) {
            return false;
        }
        Timeline.C4379c c4379c = this.f11581s;
        if (!c4379c.f11387i || c4379c.f11384f == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    /* renamed from: b0 */
    private void m29359b0(boolean z) {
        InterfaceC6337h[] interfaceC6337hArr;
        for (C4423k0 m29219o = this.f11548A.m29219o(); m29219o != null; m29219o = m29219o.m29269j()) {
            for (InterfaceC6337h interfaceC6337h : m29219o.m29264o().f17990c) {
                if (interfaceC6337h != null) {
                    interfaceC6337h.mo22908k(z);
                }
            }
        }
    }

    /* renamed from: b1 */
    private static boolean m29358b1(C4444r0 c4444r0, Timeline.C4378b c4378b, Timeline.C4379c c4379c) {
        InterfaceC10341s.C10342a c10342a = c4444r0.f11716b;
        Timeline timeline = c4444r0.f11715a;
        if (!c10342a.m11751b() && !timeline.m29737q() && !timeline.m29738n(timeline.mo29711h(c10342a.f27016a, c4378b).f11373c, c4379c).f11390l) {
            return false;
        }
        return true;
    }

    /* renamed from: c0 */
    private void m29357c0() {
        InterfaceC6337h[] interfaceC6337hArr;
        for (C4423k0 m29219o = this.f11548A.m29219o(); m29219o != null; m29219o = m29219o.m29269j()) {
            for (InterfaceC6337h interfaceC6337h : m29219o.m29264o().f17990c) {
                if (interfaceC6337h != null) {
                    interfaceC6337h.mo22904r();
                }
            }
        }
    }

    /* renamed from: c1 */
    private void m29356c1() {
        InterfaceC4483u0[] interfaceC4483u0Arr;
        this.f11558K = false;
        this.f11585w.m29288g();
        for (InterfaceC4483u0 interfaceC4483u0 : this.f11572j) {
            if (m29389M(interfaceC4483u0)) {
                interfaceC4483u0.start();
            }
        }
    }

    /* renamed from: e1 */
    private void m29351e1(boolean z, boolean z2) {
        boolean z3;
        if (!z && this.f11562O) {
            z3 = false;
        } else {
            z3 = true;
        }
        m29330m0(z3, false, true, false);
        this.f11554G.m29296b(z2 ? 1 : 0);
        this.f11576n.mo20751f();
        m29370V0(1);
    }

    /* renamed from: f0 */
    private void m29349f0() {
        int i;
        this.f11554G.m29296b(1);
        m29330m0(false, false, false, true);
        this.f11576n.mo20756a();
        if (this.f11553F.f11715a.m29737q()) {
            i = 4;
        } else {
            i = 2;
        }
        m29370V0(i);
        this.f11549B.m29181w(this.f11577o.mo20636c());
        this.f11578p.mo16329h(2);
    }

    /* renamed from: f1 */
    private void m29348f1() {
        InterfaceC4483u0[] interfaceC4483u0Arr;
        this.f11585w.m29287h();
        for (InterfaceC4483u0 interfaceC4483u0 : this.f11572j) {
            if (m29389M(interfaceC4483u0)) {
                m29317t(interfaceC4483u0);
            }
        }
    }

    /* renamed from: g1 */
    private void m29345g1() {
        boolean z;
        C4423k0 m29224j = this.f11548A.m29224j();
        if (!this.f11559L && (m29224j == null || !m29224j.f11629a.mo6199c())) {
            z = false;
        } else {
            z = true;
        }
        C4444r0 c4444r0 = this.f11553F;
        if (z != c4444r0.f11720f) {
            this.f11553F = c4444r0.m29172a(z);
        }
    }

    /* renamed from: h0 */
    private void m29343h0() {
        m29330m0(true, false, true, false);
        this.f11576n.mo20749h();
        m29370V0(1);
        this.f11579q.quit();
        synchronized (this) {
            this.f11555H = true;
            notifyAll();
        }
    }

    /* renamed from: h1 */
    private void m29342h1(Timeline timeline, InterfaceC10341s.C10342a c10342a, Timeline timeline2, InterfaceC10341s.C10342a c10342a2, long j) {
        Object obj;
        if (!timeline.m29737q() && m29360a1(timeline, c10342a)) {
            timeline.m29738n(timeline.mo29711h(c10342a.f27016a, this.f11582t).f11373c, this.f11581s);
            this.f11550C.mo29284a((MediaItem.C4368f) C9191p0.m16243j(this.f11581s.f11389k));
            if (j != -9223372036854775807L) {
                this.f11550C.mo29280e(m29309x(timeline, c10342a.f27016a, j));
                return;
            }
            Object obj2 = this.f11581s.f11379a;
            if (!timeline2.m29737q()) {
                obj = timeline2.m29738n(timeline2.mo29711h(c10342a2.f27016a, this.f11582t).f11373c, this.f11581s).f11379a;
            } else {
                obj = null;
            }
            if (!C9191p0.m16257c(obj, obj2)) {
                this.f11550C.mo29280e(-9223372036854775807L);
                return;
            }
            return;
        }
        float f = this.f11585w.mo16172b().f11302a;
        PlaybackParameters playbackParameters = this.f11553F.f11727m;
        if (f != playbackParameters.f11302a) {
            this.f11585w.mo16171f(playbackParameters);
        }
    }

    /* renamed from: i */
    private void m29341i(C4408b c4408b, int i) {
        this.f11554G.m29296b(1);
        C4438q0 c4438q0 = this.f11549B;
        if (i == -1) {
            i = c4438q0.m29187q();
        }
        m29403F(c4438q0.m29198f(i, c4408b.f11590a, c4408b.f11591b));
    }

    /* renamed from: i0 */
    private void m29340i0(int i, int i2, InterfaceC10327o0 interfaceC10327o0) {
        this.f11554G.m29296b(1);
        m29403F(this.f11549B.m29207A(i, i2, interfaceC10327o0));
    }

    /* renamed from: i1 */
    private void m29339i1(TrackGroupArray trackGroupArray, C6349n c6349n) {
        this.f11576n.mo20750g(this.f11572j, trackGroupArray, c6349n.f17990c);
    }

    /* renamed from: j1 */
    private void m29337j1() {
        if (!this.f11553F.f11715a.m29737q() && this.f11549B.m29185s()) {
            m29373U();
            m29369W();
            m29367X();
            m29371V();
        }
    }

    /* renamed from: k0 */
    private boolean m29336k0() {
        boolean z;
        C4423k0 m29218p = this.f11548A.m29218p();
        C6349n m29264o = m29218p.m29264o();
        int i = 0;
        boolean z2 = false;
        while (true) {
            InterfaceC4483u0[] interfaceC4483u0Arr = this.f11572j;
            if (i < interfaceC4483u0Arr.length) {
                InterfaceC4483u0 interfaceC4483u0 = interfaceC4483u0Arr[i];
                if (m29389M(interfaceC4483u0)) {
                    if (interfaceC4483u0.mo28961s() != m29218p.f11631c[i]) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!m29264o.m22873c(i) || z) {
                        if (!interfaceC4483u0.mo28963m()) {
                            interfaceC4483u0.mo28965k(m29311w(m29264o.f17990c[i]), m29218p.f11631c[i], m29218p.m29266m(), m29218p.m29267l());
                        } else if (interfaceC4483u0.mo3109c()) {
                            m29328n(interfaceC4483u0);
                        } else {
                            z2 = true;
                        }
                    }
                }
                i++;
            } else {
                return !z2;
            }
        }
    }

    /* renamed from: k1 */
    private void m29335k1() {
        long j;
        boolean z;
        C4423k0 m29219o = this.f11548A.m29219o();
        if (m29219o == null) {
            return;
        }
        if (m29219o.f11632d) {
            j = m29219o.f11629a.mo6248n();
        } else {
            j = -9223372036854775807L;
        }
        if (j != -9223372036854775807L) {
            m29326o0(j);
            if (j != this.f11553F.f11732r) {
                C4444r0 c4444r0 = this.f11553F;
                this.f11553F = m29395J(c4444r0.f11716b, j, c4444r0.f11717c);
                this.f11554G.m29293e(4);
            }
        } else {
            C4415i c4415i = this.f11585w;
            if (m29219o != this.f11548A.m29218p()) {
                z = true;
            } else {
                z = false;
            }
            long m29286i = c4415i.m29286i(z);
            this.f11567T = m29286i;
            long m29254y = m29219o.m29254y(m29286i);
            m29375T(this.f11553F.f11732r, m29254y);
            this.f11553F.f11732r = m29254y;
        }
        this.f11553F.f11730p = this.f11548A.m29224j().m29270i();
        this.f11553F.f11731q = m29411B();
        C4444r0 c4444r02 = this.f11553F;
        if (c4444r02.f11725k && c4444r02.f11718d == 3 && m29360a1(c4444r02.f11715a, c4444r02.f11716b) && this.f11553F.f11727m.f11302a == 1.0f) {
            float mo29283b = this.f11550C.mo29283b(m29313v(), m29411B());
            if (this.f11585w.mo16172b().f11302a != mo29283b) {
                this.f11585w.mo16171f(this.f11553F.f11727m.m29842b(mo29283b));
                m29399H(this.f11553F.f11727m, this.f11585w.mo16172b().f11302a, false, false);
            }
        }
    }

    /* renamed from: l */
    private void m29334l(ExoPlaybackException exoPlaybackException) {
        boolean z;
        if (exoPlaybackException.f11169q && exoPlaybackException.f11162j == 1) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        try {
            m29308x0(true);
        } catch (Exception e) {
            exoPlaybackException.addSuppressed(e);
            throw exoPlaybackException;
        }
    }

    /* renamed from: l0 */
    private void m29333l0() {
        float f = this.f11585w.mo16172b().f11302a;
        C4423k0 m29218p = this.f11548A.m29218p();
        boolean z = true;
        for (C4423k0 m29219o = this.f11548A.m29219o(); m29219o != null && m29219o.f11632d; m29219o = m29219o.m29269j()) {
            C6349n m29257v = m29219o.m29257v(f, this.f11553F.f11715a);
            int i = 0;
            if (!m29257v.m22875a(m29219o.m29264o())) {
                if (z) {
                    C4423k0 m29219o2 = this.f11548A.m29219o();
                    boolean m29209y = this.f11548A.m29209y(m29219o2);
                    boolean[] zArr = new boolean[this.f11572j.length];
                    long m29277b = m29219o2.m29277b(m29257v, this.f11553F.f11732r, m29209y, zArr);
                    C4444r0 c4444r0 = this.f11553F;
                    C4444r0 m29395J = m29395J(c4444r0.f11716b, m29277b, c4444r0.f11717c);
                    this.f11553F = m29395J;
                    if (m29395J.f11718d != 4 && m29277b != m29395J.f11732r) {
                        this.f11554G.m29293e(4);
                        m29326o0(m29277b);
                    }
                    boolean[] zArr2 = new boolean[this.f11572j.length];
                    while (true) {
                        InterfaceC4483u0[] interfaceC4483u0Arr = this.f11572j;
                        if (i >= interfaceC4483u0Arr.length) {
                            break;
                        }
                        InterfaceC4483u0 interfaceC4483u0 = interfaceC4483u0Arr[i];
                        boolean m29389M = m29389M(interfaceC4483u0);
                        zArr2[i] = m29389M;
                        InterfaceC10320m0 interfaceC10320m0 = m29219o2.f11631c[i];
                        if (m29389M) {
                            if (interfaceC10320m0 != interfaceC4483u0.mo28961s()) {
                                m29328n(interfaceC4483u0);
                            } else if (zArr[i]) {
                                interfaceC4483u0.mo28959u(this.f11567T);
                            }
                        }
                        i++;
                    }
                    m29319s(zArr2);
                } else {
                    this.f11548A.m29209y(m29219o);
                    if (m29219o.f11632d) {
                        m29219o.m29278a(m29257v, Math.max(m29219o.f11634f.f11646b, m29219o.m29254y(this.f11567T)), false);
                    }
                }
                m29405E(true);
                if (this.f11553F.f11718d != 4) {
                    m29381Q();
                    m29335k1();
                    this.f11578p.mo16329h(2);
                    return;
                }
                return;
            }
            if (m29219o == m29218p) {
                z = false;
            }
        }
    }

    /* renamed from: l1 */
    private void m29332l1(float f) {
        InterfaceC6337h[] interfaceC6337hArr;
        for (C4423k0 m29219o = this.f11548A.m29219o(); m29219o != null; m29219o = m29219o.m29269j()) {
            for (InterfaceC6337h interfaceC6337h : m29219o.m29264o().f17990c) {
                if (interfaceC6337h != null) {
                    interfaceC6337h.mo22911e(f);
                }
            }
        }
    }

    /* renamed from: m */
    private void m29331m(C4446s0 c4446s0) {
        if (c4446s0.m29151j()) {
            return;
        }
        try {
            c4446s0.m29155f().mo11675j(c4446s0.m29153h(), c4446s0.m29157d());
        } finally {
            c4446s0.m29150k(true);
        }
    }

    /* renamed from: m0 */
    private void m29330m0(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        InterfaceC10341s.C10342a c10342a;
        long j2;
        long j3;
        boolean z5;
        ExoPlaybackException exoPlaybackException;
        TrackGroupArray trackGroupArray;
        C6349n c6349n;
        List list;
        this.f11578p.mo16327j(2);
        this.f11558K = false;
        this.f11585w.m29287h();
        this.f11567T = 0L;
        for (InterfaceC4483u0 interfaceC4483u0 : this.f11572j) {
            try {
                m29328n(interfaceC4483u0);
            } catch (ExoPlaybackException | RuntimeException e) {
                C9197r.m16182d("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            for (InterfaceC4483u0 interfaceC4483u02 : this.f11572j) {
                try {
                    interfaceC4483u02.reset();
                } catch (RuntimeException e2) {
                    C9197r.m16182d("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.f11565R = 0;
        C4444r0 c4444r0 = this.f11553F;
        InterfaceC10341s.C10342a c10342a2 = c4444r0.f11716b;
        long j4 = c4444r0.f11732r;
        if (m29358b1(this.f11553F, this.f11582t, this.f11581s)) {
            j = this.f11553F.f11717c;
        } else {
            j = this.f11553F.f11732r;
        }
        if (z2) {
            this.f11566S = null;
            Pair<InterfaceC10341s.C10342a, Long> m29305z = m29305z(this.f11553F.f11715a);
            InterfaceC10341s.C10342a c10342a3 = (InterfaceC10341s.C10342a) m29305z.first;
            long longValue = ((Long) m29305z.second).longValue();
            if (!c10342a3.equals(this.f11553F.f11716b)) {
                z5 = true;
            } else {
                z5 = false;
            }
            c10342a = c10342a3;
            j2 = longValue;
            j3 = -9223372036854775807L;
        } else {
            c10342a = c10342a2;
            j2 = j4;
            j3 = j;
            z5 = false;
        }
        this.f11548A.m29228f();
        this.f11559L = false;
        C4444r0 c4444r02 = this.f11553F;
        Timeline timeline = c4444r02.f11715a;
        int i = c4444r02.f11718d;
        if (z4) {
            exoPlaybackException = null;
        } else {
            exoPlaybackException = c4444r02.f11719e;
        }
        if (z5) {
            trackGroupArray = TrackGroupArray.f11763m;
        } else {
            trackGroupArray = c4444r02.f11721g;
        }
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        if (z5) {
            c6349n = this.f11575m;
        } else {
            c6349n = c4444r02.f11722h;
        }
        C6349n c6349n2 = c6349n;
        if (z5) {
            list = AbstractC6693s.m22131x();
        } else {
            list = c4444r02.f11723i;
        }
        List list2 = list;
        C4444r0 c4444r03 = this.f11553F;
        this.f11553F = new C4444r0(timeline, c10342a, j3, i, exoPlaybackException, false, trackGroupArray2, c6349n2, list2, c10342a, c4444r03.f11725k, c4444r03.f11726l, c4444r03.f11727m, j2, 0L, j2, this.f11564Q, false);
        if (z3) {
            this.f11549B.m29179y();
        }
        this.f11570W = null;
    }

    /* renamed from: m1 */
    private synchronized void m29329m1(InterfaceC6386l<Boolean> interfaceC6386l, long j) {
        long mo16373b = this.f11587y.mo16373b() + j;
        boolean z = false;
        while (!interfaceC6386l.get().booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = mo16373b - this.f11587y.mo16373b();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: n */
    private void m29328n(InterfaceC4483u0 interfaceC4483u0) {
        if (!m29389M(interfaceC4483u0)) {
            return;
        }
        this.f11585w.m29292a(interfaceC4483u0);
        m29317t(interfaceC4483u0);
        interfaceC4483u0.disable();
        this.f11565R--;
    }

    /* renamed from: n0 */
    private void m29327n0() {
        boolean z;
        C4423k0 m29219o = this.f11548A.m29219o();
        if (m29219o != null && m29219o.f11634f.f11651g && this.f11556I) {
            z = true;
        } else {
            z = false;
        }
        this.f11557J = z;
    }

    /* renamed from: o0 */
    private void m29326o0(long j) {
        InterfaceC4483u0[] interfaceC4483u0Arr;
        C4423k0 m29219o = this.f11548A.m29219o();
        if (m29219o != null) {
            j = m29219o.m29253z(j);
        }
        this.f11567T = j;
        this.f11585w.m29290d(j);
        for (InterfaceC4483u0 interfaceC4483u0 : this.f11572j) {
            if (m29389M(interfaceC4483u0)) {
                interfaceC4483u0.mo28959u(this.f11567T);
            }
        }
        m29361a0();
    }

    /* renamed from: p */
    private void m29325p() {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        long mo16374a = this.f11587y.mo16374a();
        m29337j1();
        int i2 = this.f11553F.f11718d;
        if (i2 != 1 && i2 != 4) {
            C4423k0 m29219o = this.f11548A.m29219o();
            if (m29219o == null) {
                m29312v0(mo16374a, 10L);
                return;
            }
            C9185m0.m16326a("doSomeWork");
            m29335k1();
            if (m29219o.f11632d) {
                long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                m29219o.f11629a.mo6242u(this.f11553F.f11732r - this.f11583u, this.f11584v);
                z = true;
                z2 = true;
                int i3 = 0;
                while (true) {
                    InterfaceC4483u0[] interfaceC4483u0Arr = this.f11572j;
                    if (i3 >= interfaceC4483u0Arr.length) {
                        break;
                    }
                    InterfaceC4483u0 interfaceC4483u0 = interfaceC4483u0Arr[i3];
                    if (m29389M(interfaceC4483u0)) {
                        interfaceC4483u0.mo3107r(this.f11567T, elapsedRealtime);
                        if (z && interfaceC4483u0.mo3109c()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (m29219o.f11631c[i3] != interfaceC4483u0.mo28961s()) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z5 && interfaceC4483u0.mo28968g()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (!z5 && !z6 && !interfaceC4483u0.mo3108e() && !interfaceC4483u0.mo3109c()) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        if (z2 && z7) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z7) {
                            interfaceC4483u0.mo28964l();
                        }
                    }
                    i3++;
                }
            } else {
                m29219o.f11629a.mo6245r();
                z = true;
                z2 = true;
            }
            long j = m29219o.f11634f.f11649e;
            if (z && m29219o.f11632d && (j == -9223372036854775807L || j <= this.f11553F.f11732r)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && this.f11557J) {
                this.f11557J = false;
                m29388M0(false, this.f11553F.f11726l, false, 5);
            }
            if (z3 && m29219o.f11634f.f11652h) {
                m29370V0(4);
                m29348f1();
            } else if (this.f11553F.f11718d == 2 && m29362Z0(z2)) {
                m29370V0(3);
                this.f11570W = null;
                if (m29364Y0()) {
                    m29356c1();
                }
            } else if (this.f11553F.f11718d == 3 && (this.f11565R != 0 ? !z2 : !m29387N())) {
                this.f11558K = m29364Y0();
                m29370V0(2);
                if (this.f11558K) {
                    m29357c0();
                    this.f11550C.mo29281d();
                }
                m29348f1();
            }
            if (this.f11553F.f11718d == 2) {
                int i4 = 0;
                while (true) {
                    InterfaceC4483u0[] interfaceC4483u0Arr2 = this.f11572j;
                    if (i4 >= interfaceC4483u0Arr2.length) {
                        break;
                    }
                    if (m29389M(interfaceC4483u0Arr2[i4]) && this.f11572j[i4].mo28961s() == m29219o.f11631c[i4]) {
                        this.f11572j[i4].mo28964l();
                    }
                    i4++;
                }
                C4444r0 c4444r0 = this.f11553F;
                if (!c4444r0.f11720f && c4444r0.f11731q < 500000 && m29391L()) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            }
            boolean z8 = this.f11564Q;
            C4444r0 c4444r02 = this.f11553F;
            if (z8 != c4444r02.f11728n) {
                this.f11553F = c4444r02.m29169d(z8);
            }
            if ((m29364Y0() && this.f11553F.f11718d == 3) || (i = this.f11553F.f11718d) == 2) {
                z4 = !m29377S(mo16374a, 10L);
            } else {
                if (this.f11565R != 0 && i != 4) {
                    m29312v0(mo16374a, 1000L);
                } else {
                    this.f11578p.mo16327j(2);
                }
                z4 = false;
            }
            C4444r0 c4444r03 = this.f11553F;
            if (c4444r03.f11729o != z4) {
                this.f11553F = c4444r03.m29164i(z4);
            }
            this.f11563P = false;
            C9185m0.m16324c();
            return;
        }
        this.f11578p.mo16327j(2);
    }

    /* renamed from: p0 */
    private static void m29324p0(Timeline timeline, C4410d c4410d, Timeline.C4379c c4379c, Timeline.C4378b c4378b) {
        long j;
        int i = timeline.m29738n(timeline.mo29711h(c4410d.f11601m, c4378b).f11373c, c4379c).f11392n;
        Object obj = timeline.mo11757g(i, c4378b, true).f11372b;
        long j2 = c4378b.f11374d;
        if (j2 != -9223372036854775807L) {
            j = j2 - 1;
        } else {
            j = Long.MAX_VALUE;
        }
        c4410d.m29298b(i, j, obj);
    }

    /* renamed from: q */
    private void m29323q(int i, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        InterfaceC4483u0 interfaceC4483u0 = this.f11572j[i];
        if (m29389M(interfaceC4483u0)) {
            return;
        }
        C4423k0 m29218p = this.f11548A.m29218p();
        if (m29218p == this.f11548A.m29219o()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C6349n m29264o = m29218p.m29264o();
        C7408s c7408s = m29264o.f17989b[i];
        Format[] m29311w = m29311w(m29264o.f17990c[i]);
        if (m29364Y0() && this.f11553F.f11718d == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z && z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f11565R++;
        interfaceC4483u0.mo28967h(c7408s, m29311w, m29218p.f11631c[i], this.f11567T, z4, z2, m29218p.m29266m(), m29218p.m29267l());
        interfaceC4483u0.mo11675j(103, new C4407a());
        this.f11585w.m29291c(interfaceC4483u0);
        if (z3) {
            interfaceC4483u0.start();
        }
    }

    /* renamed from: q0 */
    private static boolean m29322q0(C4410d c4410d, Timeline timeline, Timeline timeline2, int i, boolean z, Timeline.C4379c c4379c, Timeline.C4378b c4378b) {
        long m20792c;
        Object obj = c4410d.f11601m;
        if (obj == null) {
            if (c4410d.f11598j.m29156e() == Long.MIN_VALUE) {
                m20792c = -9223372036854775807L;
            } else {
                m20792c = C7390b.m20792c(c4410d.f11598j.m29156e());
            }
            Pair<Object, Long> m29316t0 = m29316t0(timeline, new C4414h(c4410d.f11598j.m29154g(), c4410d.f11598j.m29152i(), m20792c), false, i, z, c4379c, c4378b);
            if (m29316t0 == null) {
                return false;
            }
            c4410d.m29298b(timeline.mo11758b(m29316t0.first), ((Long) m29316t0.second).longValue(), m29316t0.first);
            if (c4410d.f11598j.m29156e() == Long.MIN_VALUE) {
                m29324p0(timeline, c4410d, c4379c, c4378b);
            }
            return true;
        }
        int mo11758b = timeline.mo11758b(obj);
        if (mo11758b == -1) {
            return false;
        }
        if (c4410d.f11598j.m29156e() == Long.MIN_VALUE) {
            m29324p0(timeline, c4410d, c4379c, c4378b);
            return true;
        }
        c4410d.f11599k = mo11758b;
        timeline2.mo29711h(c4410d.f11601m, c4378b);
        if (timeline2.m29738n(c4378b.f11373c, c4379c).f11390l) {
            Pair<Object, Long> m29740j = timeline.m29740j(c4379c, c4378b, timeline.mo29711h(c4410d.f11601m, c4378b).f11373c, c4410d.f11600l + c4378b.m29724l());
            c4410d.m29298b(timeline.mo11758b(m29740j.first), ((Long) m29740j.second).longValue(), m29740j.first);
        }
        return true;
    }

    /* renamed from: r */
    private void m29321r() {
        m29319s(new boolean[this.f11572j.length]);
    }

    /* renamed from: r0 */
    private void m29320r0(Timeline timeline, Timeline timeline2) {
        if (timeline.m29737q() && timeline2.m29737q()) {
            return;
        }
        for (int size = this.f11586x.size() - 1; size >= 0; size--) {
            if (!m29322q0(this.f11586x.get(size), timeline, timeline2, this.f11560M, this.f11561N, this.f11581s, this.f11582t)) {
                this.f11586x.get(size).f11598j.m29150k(false);
                this.f11586x.remove(size);
            }
        }
        Collections.sort(this.f11586x);
    }

    /* renamed from: s */
    private void m29319s(boolean[] zArr) {
        C4423k0 m29218p = this.f11548A.m29218p();
        C6349n m29264o = m29218p.m29264o();
        for (int i = 0; i < this.f11572j.length; i++) {
            if (!m29264o.m22873c(i)) {
                this.f11572j[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.f11572j.length; i2++) {
            if (m29264o.m22873c(i2)) {
                m29323q(i2, zArr[i2]);
            }
        }
        m29218p.f11635g = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016e  */
    /* renamed from: s0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.exoplayer2.C4406h0.C4413g m29318s0(com.google.android.exoplayer2.Timeline r21, com.google.android.exoplayer2.C4444r0 r22, com.google.android.exoplayer2.C4406h0.C4414h r23, com.google.android.exoplayer2.C4432n0 r24, int r25, boolean r26, com.google.android.exoplayer2.Timeline.C4379c r27, com.google.android.exoplayer2.Timeline.C4378b r28) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C4406h0.m29318s0(com.google.android.exoplayer2.Timeline, com.google.android.exoplayer2.r0, com.google.android.exoplayer2.h0$h, com.google.android.exoplayer2.n0, int, boolean, com.google.android.exoplayer2.Timeline$c, com.google.android.exoplayer2.Timeline$b):com.google.android.exoplayer2.h0$g");
    }

    /* renamed from: t */
    private void m29317t(InterfaceC4483u0 interfaceC4483u0) {
        if (interfaceC4483u0.getState() == 2) {
            interfaceC4483u0.stop();
        }
    }

    /* renamed from: t0 */
    private static Pair<Object, Long> m29316t0(Timeline timeline, C4414h c4414h, boolean z, int i, boolean z2, Timeline.C4379c c4379c, Timeline.C4378b c4378b) {
        Timeline timeline2;
        Pair<Object, Long> m29740j;
        Object m29314u0;
        Timeline timeline3 = c4414h.f11615a;
        if (timeline.m29737q()) {
            return null;
        }
        if (timeline3.m29737q()) {
            timeline2 = timeline;
        } else {
            timeline2 = timeline3;
        }
        try {
            m29740j = timeline2.m29740j(c4379c, c4378b, c4414h.f11616b, c4414h.f11617c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (timeline.equals(timeline2)) {
            return m29740j;
        }
        if (timeline.mo11758b(m29740j.first) != -1) {
            timeline2.mo29711h(m29740j.first, c4378b);
            if (timeline2.m29738n(c4378b.f11373c, c4379c).f11390l) {
                return timeline.m29740j(c4379c, c4378b, timeline.mo29711h(m29740j.first, c4378b).f11373c, c4414h.f11617c);
            }
            return m29740j;
        }
        if (z && (m29314u0 = m29314u0(c4379c, c4378b, i, z2, m29740j.first, timeline2, timeline)) != null) {
            return timeline.m29740j(c4379c, c4378b, timeline.mo29711h(m29314u0, c4378b).f11373c, -9223372036854775807L);
        }
        return null;
    }

    /* renamed from: u */
    private AbstractC6693s<Metadata> m29315u(InterfaceC6337h[] interfaceC6337hArr) {
        AbstractC6693s.C6694a c6694a = new AbstractC6693s.C6694a();
        boolean z = false;
        for (InterfaceC6337h interfaceC6337h : interfaceC6337hArr) {
            if (interfaceC6337h != null) {
                Metadata metadata = interfaceC6337h.mo22891c(0).f11195s;
                if (metadata == null) {
                    c6694a.m22128d(new Metadata(new Metadata.InterfaceC4429b[0]));
                } else {
                    c6694a.m22128d(metadata);
                    z = true;
                }
            }
        }
        if (z) {
            return c6694a.m22127e();
        }
        return AbstractC6693s.m22131x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0 */
    public static Object m29314u0(Timeline.C4379c c4379c, Timeline.C4378b c4378b, int i, boolean z, Object obj, Timeline timeline, Timeline timeline2) {
        int mo11758b = timeline.mo11758b(obj);
        int mo11756i = timeline.mo11756i();
        int i2 = mo11758b;
        int i3 = -1;
        for (int i4 = 0; i4 < mo11756i && i3 == -1; i4++) {
            i2 = timeline.m29742d(i2, c4378b, c4379c, i, z);
            if (i2 == -1) {
                break;
            }
            i3 = timeline2.mo11758b(timeline.mo11755m(i2));
        }
        if (i3 == -1) {
            return null;
        }
        return timeline2.mo11755m(i3);
    }

    /* renamed from: v */
    private long m29313v() {
        C4444r0 c4444r0 = this.f11553F;
        return m29309x(c4444r0.f11715a, c4444r0.f11716b.f27016a, c4444r0.f11732r);
    }

    /* renamed from: v0 */
    private void m29312v0(long j, long j2) {
        this.f11578p.mo16327j(2);
        this.f11578p.mo16328i(2, j + j2);
    }

    /* renamed from: w */
    private static Format[] m29311w(InterfaceC6337h interfaceC6337h) {
        int i;
        if (interfaceC6337h != null) {
            i = interfaceC6337h.length();
        } else {
            i = 0;
        }
        Format[] formatArr = new Format[i];
        for (int i2 = 0; i2 < i; i2++) {
            formatArr[i2] = interfaceC6337h.mo22891c(i2);
        }
        return formatArr;
    }

    /* renamed from: x */
    private long m29309x(Timeline timeline, Object obj, long j) {
        timeline.m29738n(timeline.mo29711h(obj, this.f11582t).f11373c, this.f11581s);
        Timeline.C4379c c4379c = this.f11581s;
        if (c4379c.f11384f != -9223372036854775807L && c4379c.m29715f()) {
            Timeline.C4379c c4379c2 = this.f11581s;
            if (c4379c2.f11387i) {
                return C7390b.m20792c(c4379c2.m29720a() - this.f11581s.f11384f) - (j + this.f11582t.m29724l());
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: x0 */
    private void m29308x0(boolean z) {
        InterfaceC10341s.C10342a c10342a = this.f11548A.m29219o().f11634f.f11645a;
        long m29412A0 = m29412A0(c10342a, this.f11553F.f11732r, true, false);
        if (m29412A0 != this.f11553F.f11732r) {
            this.f11553F = m29395J(c10342a, m29412A0, this.f11553F.f11717c);
            if (z) {
                this.f11554G.m29293e(4);
            }
        }
    }

    /* renamed from: y */
    private long m29307y() {
        C4423k0 m29218p = this.f11548A.m29218p();
        if (m29218p == null) {
            return 0L;
        }
        long m29267l = m29218p.m29267l();
        if (!m29218p.f11632d) {
            return m29267l;
        }
        int i = 0;
        while (true) {
            InterfaceC4483u0[] interfaceC4483u0Arr = this.f11572j;
            if (i < interfaceC4483u0Arr.length) {
                if (m29389M(interfaceC4483u0Arr[i]) && this.f11572j[i].mo28961s() == m29218p.f11631c[i]) {
                    long mo28960t = this.f11572j[i].mo28960t();
                    if (mo28960t == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    m29267l = Math.max(mo28960t, m29267l);
                }
                i++;
            } else {
                return m29267l;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m29306y0(com.google.android.exoplayer2.C4406h0.C4414h r19) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C4406h0.m29306y0(com.google.android.exoplayer2.h0$h):void");
    }

    /* renamed from: z */
    private Pair<InterfaceC10341s.C10342a, Long> m29305z(Timeline timeline) {
        long j = 0;
        if (timeline.m29737q()) {
            return Pair.create(C4444r0.m29161l(), 0L);
        }
        Pair<Object, Long> m29740j = timeline.m29740j(this.f11581s, this.f11582t, timeline.mo11844a(this.f11561N), -9223372036854775807L);
        InterfaceC10341s.C10342a m29208z = this.f11548A.m29208z(timeline, m29740j.first, 0L);
        long longValue = ((Long) m29740j.second).longValue();
        if (m29208z.m11751b()) {
            timeline.mo29711h(m29208z.f27016a, this.f11582t);
            if (m29208z.f27018c == this.f11582t.m29727i(m29208z.f27017b)) {
                j = this.f11582t.m29729g();
            }
            longValue = j;
        }
        return Pair.create(m29208z, Long.valueOf(longValue));
    }

    /* renamed from: z0 */
    private long m29304z0(InterfaceC10341s.C10342a c10342a, long j, boolean z) {
        boolean z2;
        if (this.f11548A.m29219o() != this.f11548A.m29218p()) {
            z2 = true;
        } else {
            z2 = false;
        }
        return m29412A0(c10342a, j, z2, z);
    }

    /* renamed from: A */
    public Looper m29413A() {
        return this.f11580r;
    }

    /* renamed from: I0 */
    public void m29396I0(List<C4438q0.C4441c> list, int i, long j, InterfaceC10327o0 interfaceC10327o0) {
        this.f11578p.mo16332e(17, new C4408b(list, interfaceC10327o0, i, j, null)).sendToTarget();
    }

    /* renamed from: L0 */
    public void m29390L0(boolean z, int i) {
        this.f11578p.mo16330g(1, z ? 1 : 0, i).sendToTarget();
    }

    /* renamed from: N0 */
    public void m29386N0(PlaybackParameters playbackParameters) {
        this.f11578p.mo16332e(4, playbackParameters).sendToTarget();
    }

    /* renamed from: P0 */
    public void m29382P0(int i) {
        this.f11578p.mo16330g(11, i, 0).sendToTarget();
    }

    /* renamed from: S0 */
    public void m29376S0(boolean z) {
        this.f11578p.mo16330g(12, z ? 1 : 0, 0).sendToTarget();
    }

    @Override // p099f8.AbstractC6347m.InterfaceC6348a
    /* renamed from: b */
    public void mo22876b() {
        this.f11578p.mo16329h(10);
    }

    @Override // com.google.android.exoplayer2.C4438q0.InterfaceC4442d
    /* renamed from: c */
    public void mo29173c() {
        this.f11578p.mo16329h(22);
    }

    @Override // com.google.android.exoplayer2.C4446s0.InterfaceC4447a
    /* renamed from: d */
    public synchronized void mo29146d(C4446s0 c4446s0) {
        if (!this.f11555H && this.f11579q.isAlive()) {
            this.f11578p.mo16332e(14, c4446s0).sendToTarget();
            return;
        }
        C9197r.m16178h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        c4446s0.m29150k(false);
    }

    @Override // p229m7.InterfaceC10322n0.InterfaceC10323a
    /* renamed from: d0 */
    public void mo6251k(InterfaceC10329p interfaceC10329p) {
        this.f11578p.mo16332e(9, interfaceC10329p).sendToTarget();
    }

    /* renamed from: d1 */
    public void m29354d1() {
        this.f11578p.mo16335b(6).sendToTarget();
    }

    /* renamed from: e0 */
    public void m29352e0() {
        this.f11578p.mo16335b(0).sendToTarget();
    }

    /* renamed from: g0 */
    public synchronized boolean m29346g0() {
        if (!this.f11555H && this.f11579q.isAlive()) {
            this.f11578p.mo16329h(7);
            m29329m1(new InterfaceC6386l() { // from class: com.google.android.exoplayer2.g0
                @Override // p102fb.InterfaceC6386l
                public final Object get() {
                    Boolean m29385O;
                    m29385O = C4406h0.this.m29385O();
                    return m29385O;
                }
            }, this.f11551D);
            return this.f11555H;
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        C4423k0 m29218p;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        try {
            switch (message.what) {
                case 0:
                    m29349f0();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m29388M0(z, message.arg2, true, 1);
                    break;
                case 2:
                    m29325p();
                    break;
                case 3:
                    m29306y0((C4414h) message.obj);
                    break;
                case 4:
                    m29384O0((PlaybackParameters) message.obj);
                    break;
                case 5:
                    m29378R0((C7410u) message.obj);
                    break;
                case 6:
                    m29351e1(false, true);
                    break;
                case 7:
                    m29343h0();
                    return true;
                case 8:
                    m29401G((InterfaceC10329p) message.obj);
                    break;
                case 9:
                    m29407D((InterfaceC10329p) message.obj);
                    break;
                case 10:
                    m29333l0();
                    break;
                case 11:
                    m29380Q0(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    m29374T0(z2);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    m29400G0(z3, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    m29410B0((C4446s0) message.obj);
                    break;
                case 15:
                    m29406D0((C4446s0) message.obj);
                    break;
                case 16:
                    m29397I((PlaybackParameters) message.obj, false);
                    break;
                case 17:
                    m29398H0((C4408b) message.obj);
                    break;
                case 18:
                    m29341i((C4408b) message.obj, message.arg1);
                    break;
                case 19:
                    m29363Z((C4409c) message.obj);
                    break;
                case 20:
                    m29340i0(message.arg1, message.arg2, (InterfaceC10327o0) message.obj);
                    break;
                case 21:
                    m29372U0((InterfaceC10327o0) message.obj);
                    break;
                case 22:
                    m29365Y();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    m29392K0(z4);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    m29394J0(z5);
                    break;
                case 25:
                    m29334l((ExoPlaybackException) message.obj);
                    break;
                default:
                    return false;
            }
            m29379R();
        } catch (ExoPlaybackException e) {
            e = e;
            if (e.f11162j == 1 && (m29218p = this.f11548A.m29218p()) != null) {
                e = e.m29934a(m29218p.f11634f.f11645a);
            }
            if (e.f11169q && this.f11570W == null) {
                C9197r.m16177i("ExoPlayerImplInternal", "Recoverable playback error", e);
                this.f11570W = e;
                Message mo16332e = this.f11578p.mo16332e(25, e);
                mo16332e.getTarget().sendMessageAtFrontOfQueue(mo16332e);
            } else {
                ExoPlaybackException exoPlaybackException = this.f11570W;
                if (exoPlaybackException != null) {
                    e.addSuppressed(exoPlaybackException);
                    this.f11570W = null;
                }
                C9197r.m16182d("ExoPlayerImplInternal", "Playback error", e);
                m29351e1(true, false);
                this.f11553F = this.f11553F.m29167f(e);
            }
            m29379R();
        } catch (IOException e2) {
            ExoPlaybackException m29931d = ExoPlaybackException.m29931d(e2);
            C4423k0 m29219o = this.f11548A.m29219o();
            if (m29219o != null) {
                m29931d = m29931d.m29934a(m29219o.f11634f.f11645a);
            }
            C9197r.m16182d("ExoPlayerImplInternal", "Playback error", m29931d);
            m29351e1(false, false);
            this.f11553F = this.f11553F.m29167f(m29931d);
            m29379R();
        } catch (RuntimeException e3) {
            ExoPlaybackException m29930e = ExoPlaybackException.m29930e(e3);
            C9197r.m16182d("ExoPlayerImplInternal", "Playback error", m29930e);
            m29351e1(true, false);
            this.f11553F = this.f11553F.m29167f(m29930e);
            m29379R();
        }
        return true;
    }

    @Override // p229m7.InterfaceC10329p.InterfaceC10330a
    /* renamed from: j */
    public void mo11759j(InterfaceC10329p interfaceC10329p) {
        this.f11578p.mo16332e(8, interfaceC10329p).sendToTarget();
    }

    /* renamed from: j0 */
    public void m29338j0(int i, int i2, InterfaceC10327o0 interfaceC10327o0) {
        this.f11578p.mo16333d(20, i, i2, interfaceC10327o0).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.C4415i.InterfaceC4416a
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        this.f11578p.mo16332e(16, playbackParameters).sendToTarget();
    }

    /* renamed from: w0 */
    public void m29310w0(Timeline timeline, int i, long j) {
        this.f11578p.mo16332e(3, new C4414h(timeline, i, j)).sendToTarget();
    }
}
