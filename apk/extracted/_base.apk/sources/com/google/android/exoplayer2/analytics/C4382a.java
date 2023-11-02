package com.google.android.exoplayer2.analytics;

import android.os.Looper;
import android.util.SparseArray;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.C4382a;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.reactnativecommunity.webview.RNCWebViewManager;
import gb.AbstractC6693s;
import gb.AbstractC6701u;
import gb.C6712x;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p102fb.C6377g;
import p102fb.InterfaceC6386l;
import p151i6.C7390b;
import p151i6.C7404o;
import p153i8.InterfaceC7444e;
import p193k6.InterfaceC9115q;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9192q;
import p195k8.C9203v;
import p195k8.InterfaceC9155c;
import p213l8.InterfaceC10062a0;
import p229m7.C10332q;
import p229m7.InterfaceC10341s;
import p229m7.InterfaceC10353z;
import p259o6.InterfaceC11045v;

/* renamed from: com.google.android.exoplayer2.analytics.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4382a implements Player.InterfaceC4371a, InterfaceC9115q, InterfaceC10062a0, InterfaceC10353z, InterfaceC7444e.InterfaceC7445a, InterfaceC11045v {

    /* renamed from: j */
    private final InterfaceC9155c f11411j;

    /* renamed from: k */
    private final Timeline.C4378b f11412k;

    /* renamed from: l */
    private final Timeline.C4379c f11413l;

    /* renamed from: m */
    private final C4383a f11414m;

    /* renamed from: n */
    private final SparseArray<AnalyticsListener.EventTime> f11415n;

    /* renamed from: o */
    private C9192q<AnalyticsListener, AnalyticsListener.Events> f11416o;

    /* renamed from: p */
    private Player f11417p;

    /* renamed from: q */
    private boolean f11418q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.analytics.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4383a {

        /* renamed from: a */
        private final Timeline.C4378b f11419a;

        /* renamed from: b */
        private AbstractC6693s<InterfaceC10341s.C10342a> f11420b = AbstractC6693s.m22131x();

        /* renamed from: c */
        private AbstractC6701u<InterfaceC10341s.C10342a, Timeline> f11421c = AbstractC6701u.m22104k();

        /* renamed from: d */
        private InterfaceC10341s.C10342a f11422d;

        /* renamed from: e */
        private InterfaceC10341s.C10342a f11423e;

        /* renamed from: f */
        private InterfaceC10341s.C10342a f11424f;

        public C4383a(Timeline.C4378b c4378b) {
            this.f11419a = c4378b;
        }

        /* renamed from: b */
        private void m29580b(AbstractC6701u.C6702a<InterfaceC10341s.C10342a, Timeline> c6702a, InterfaceC10341s.C10342a c10342a, Timeline timeline) {
            if (c10342a == null) {
                return;
            }
            if (timeline.mo11758b(c10342a.f27016a) != -1) {
                c6702a.m22100c(c10342a, timeline);
                return;
            }
            Timeline timeline2 = this.f11421c.get(c10342a);
            if (timeline2 != null) {
                c6702a.m22100c(c10342a, timeline2);
            }
        }

        /* renamed from: c */
        private static InterfaceC10341s.C10342a m29579c(Player player, AbstractC6693s<InterfaceC10341s.C10342a> abstractC6693s, InterfaceC10341s.C10342a c10342a, Timeline.C4378b c4378b) {
            Object mo11755m;
            int i;
            Timeline mo29438v = player.mo29438v();
            int mo29517I = player.mo29517I();
            if (mo29438v.m29737q()) {
                mo11755m = null;
            } else {
                mo11755m = mo29438v.mo11755m(mo29517I);
            }
            if (!player.mo29483d() && !mo29438v.m29737q()) {
                i = mo29438v.m29741f(mo29517I, c4378b).m29732d(C7390b.m20792c(player.mo29491Y()) - c4378b.m29724l());
            } else {
                i = -1;
            }
            for (int i2 = 0; i2 < abstractC6693s.size(); i2++) {
                InterfaceC10341s.C10342a c10342a2 = abstractC6693s.get(i2);
                if (m29573i(c10342a2, mo11755m, player.mo29483d(), player.mo29447r(), player.mo29512L(), i)) {
                    return c10342a2;
                }
            }
            if (abstractC6693s.isEmpty() && c10342a != null) {
                if (m29573i(c10342a, mo11755m, player.mo29483d(), player.mo29447r(), player.mo29512L(), i)) {
                    return c10342a;
                }
            }
            return null;
        }

        /* renamed from: i */
        private static boolean m29573i(InterfaceC10341s.C10342a c10342a, Object obj, boolean z, int i, int i2, int i3) {
            if (!c10342a.f27016a.equals(obj)) {
                return false;
            }
            if ((!z || c10342a.f27017b != i || c10342a.f27018c != i2) && (z || c10342a.f27017b != -1 || c10342a.f27020e != i3)) {
                return false;
            }
            return true;
        }

        /* renamed from: m */
        private void m29569m(Timeline timeline) {
            AbstractC6701u.C6702a<InterfaceC10341s.C10342a, Timeline> m22113a = AbstractC6701u.m22113a();
            if (this.f11420b.isEmpty()) {
                m29580b(m22113a, this.f11423e, timeline);
                if (!C6377g.m22845a(this.f11424f, this.f11423e)) {
                    m29580b(m22113a, this.f11424f, timeline);
                }
                if (!C6377g.m22845a(this.f11422d, this.f11423e) && !C6377g.m22845a(this.f11422d, this.f11424f)) {
                    m29580b(m22113a, this.f11422d, timeline);
                }
            } else {
                for (int i = 0; i < this.f11420b.size(); i++) {
                    m29580b(m22113a, this.f11420b.get(i), timeline);
                }
                if (!this.f11420b.contains(this.f11422d)) {
                    m29580b(m22113a, this.f11422d, timeline);
                }
            }
            this.f11421c = m22113a.m22102a();
        }

        /* renamed from: d */
        public InterfaceC10341s.C10342a m29578d() {
            return this.f11422d;
        }

        /* renamed from: e */
        public InterfaceC10341s.C10342a m29577e() {
            if (this.f11420b.isEmpty()) {
                return null;
            }
            return (InterfaceC10341s.C10342a) C6712x.m22059c(this.f11420b);
        }

        /* renamed from: f */
        public Timeline m29576f(InterfaceC10341s.C10342a c10342a) {
            return this.f11421c.get(c10342a);
        }

        /* renamed from: g */
        public InterfaceC10341s.C10342a m29575g() {
            return this.f11423e;
        }

        /* renamed from: h */
        public InterfaceC10341s.C10342a m29574h() {
            return this.f11424f;
        }

        /* renamed from: j */
        public void m29572j(Player player) {
            this.f11422d = m29579c(player, this.f11420b, this.f11423e, this.f11419a);
        }

        /* renamed from: k */
        public void m29571k(List<InterfaceC10341s.C10342a> list, InterfaceC10341s.C10342a c10342a, Player player) {
            this.f11420b = AbstractC6693s.m22134u(list);
            if (!list.isEmpty()) {
                this.f11423e = list.get(0);
                this.f11424f = (InterfaceC10341s.C10342a) C9149a.m16448e(c10342a);
            }
            if (this.f11422d == null) {
                this.f11422d = m29579c(player, this.f11420b, this.f11423e, this.f11419a);
            }
            m29569m(player.mo29438v());
        }

        /* renamed from: l */
        public void m29570l(Player player) {
            this.f11422d = m29579c(player, this.f11420b, this.f11423e, this.f11419a);
            m29569m(player.mo29438v());
        }
    }

    public C4382a(InterfaceC9155c interfaceC9155c) {
        this.f11411j = (InterfaceC9155c) C9149a.m16448e(interfaceC9155c);
        this.f11416o = new C9192q<>(C9191p0.m16283P(), interfaceC9155c, new InterfaceC6386l() { // from class: j6.a
            @Override // p102fb.InterfaceC6386l
            public final Object get() {
                return new AnalyticsListener.Events();
            }
        }, new C9192q.InterfaceC9194b() { // from class: j6.l
            @Override // p195k8.C9192q.InterfaceC9194b
            /* renamed from: a */
            public final void mo16197a(Object obj, C9203v c9203v) {
                C4382a.m29665P0((AnalyticsListener) obj, (AnalyticsListener.Events) c9203v);
            }
        });
        Timeline.C4378b c4378b = new Timeline.C4378b();
        this.f11412k = c4378b;
        this.f11413l = new Timeline.C4379c();
        this.f11414m = new C4383a(c4378b);
        this.f11415n = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H1 */
    public static /* synthetic */ void m29688H1(AnalyticsListener.EventTime eventTime, String str, long j, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j);
        analyticsListener.onDecoderInitialized(eventTime, 2, str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J1 */
    public static /* synthetic */ void m29682J1(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDisabled(eventTime, decoderCounters);
        analyticsListener.onDecoderDisabled(eventTime, 2, decoderCounters);
    }

    /* renamed from: K0 */
    private AnalyticsListener.EventTime m29680K0(InterfaceC10341s.C10342a c10342a) {
        Timeline m29576f;
        boolean z;
        C9149a.m16448e(this.f11417p);
        if (c10342a == null) {
            m29576f = null;
        } else {
            m29576f = this.f11414m.m29576f(c10342a);
        }
        if (c10342a != null && m29576f != null) {
            return m29683J0(m29576f, m29576f.mo29711h(c10342a.f27016a, this.f11412k).f11373c, c10342a);
        }
        int mo29463l = this.f11417p.mo29463l();
        Timeline mo29438v = this.f11417p.mo29438v();
        if (mo29463l < mo29438v.mo11753p()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            mo29438v = Timeline.f11370a;
        }
        return m29683J0(mo29438v, mo29463l, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K1 */
    public static /* synthetic */ void m29679K1(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoEnabled(eventTime, decoderCounters);
        analyticsListener.onDecoderEnabled(eventTime, 2, decoderCounters);
    }

    /* renamed from: L0 */
    private AnalyticsListener.EventTime m29677L0() {
        return m29680K0(this.f11414m.m29577e());
    }

    /* renamed from: M0 */
    private AnalyticsListener.EventTime m29674M0(int i, InterfaceC10341s.C10342a c10342a) {
        C9149a.m16448e(this.f11417p);
        boolean z = true;
        if (c10342a != null) {
            if (this.f11414m.m29576f(c10342a) == null) {
                z = false;
            }
            if (z) {
                return m29680K0(c10342a);
            }
            return m29683J0(Timeline.f11370a, i, c10342a);
        }
        Timeline mo29438v = this.f11417p.mo29438v();
        if (i >= mo29438v.mo11753p()) {
            z = false;
        }
        if (!z) {
            mo29438v = Timeline.f11370a;
        }
        return m29683J0(mo29438v, i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M1 */
    public static /* synthetic */ void m29673M1(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoInputFormatChanged(eventTime, format, decoderReuseEvaluation);
        analyticsListener.onDecoderInputFormatChanged(eventTime, 2, format);
    }

    /* renamed from: N0 */
    private AnalyticsListener.EventTime m29671N0() {
        return m29680K0(this.f11414m.m29575g());
    }

    /* renamed from: O0 */
    private AnalyticsListener.EventTime m29668O0() {
        return m29680K0(this.f11414m.m29574h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public static /* synthetic */ void m29665P0(AnalyticsListener analyticsListener, AnalyticsListener.Events events) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q1 */
    public /* synthetic */ void m29661Q1(Player player, AnalyticsListener analyticsListener, AnalyticsListener.Events events) {
        events.m29707f(this.f11415n);
        analyticsListener.onEvents(player, events);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public static /* synthetic */ void m29659R0(AnalyticsListener.EventTime eventTime, String str, long j, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j);
        analyticsListener.onDecoderInitialized(eventTime, 1, str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public static /* synthetic */ void m29653T0(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDisabled(eventTime, decoderCounters);
        analyticsListener.onDecoderDisabled(eventTime, 1, decoderCounters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public static /* synthetic */ void m29650U0(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioEnabled(eventTime, decoderCounters);
        analyticsListener.onDecoderEnabled(eventTime, 1, decoderCounters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V0 */
    public static /* synthetic */ void m29647V0(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioInputFormatChanged(eventTime, format, decoderReuseEvaluation);
        analyticsListener.onDecoderInputFormatChanged(eventTime, 1, format);
    }

    @Override // p229m7.InterfaceC10353z
    /* renamed from: A */
    public final void mo11717A(int i, InterfaceC10341s.C10342a c10342a, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime m29674M0 = m29674M0(i, c10342a);
        m29640X1(m29674M0, RNCWebViewManager.COMMAND_CLEAR_CACHE, new C9192q.InterfaceC9193a() { // from class: j6.q0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadCompleted(AnalyticsListener.EventTime.this, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // p229m7.InterfaceC10353z
    /* renamed from: B */
    public final void mo11716B(int i, InterfaceC10341s.C10342a c10342a, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime m29674M0 = m29674M0(i, c10342a);
        m29640X1(m29674M0, 1004, new C9192q.InterfaceC9193a() { // from class: j6.f0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDownstreamFormatChanged(AnalyticsListener.EventTime.this, mediaLoadData);
            }
        });
    }

    @Override // p193k6.InterfaceC9115q
    /* renamed from: C */
    public final void mo16603C(final int i, final long j, final long j2) {
        final AnalyticsListener.EventTime m29668O0 = m29668O0();
        m29640X1(m29668O0, 1012, new C9192q.InterfaceC9193a() { // from class: j6.t0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioUnderrun(AnalyticsListener.EventTime.this, i, j, j2);
            }
        });
    }

    @Override // p259o6.InterfaceC11045v
    /* renamed from: D */
    public final void mo9295D(int i, InterfaceC10341s.C10342a c10342a, final Exception exc) {
        final AnalyticsListener.EventTime m29674M0 = m29674M0(i, c10342a);
        m29640X1(m29674M0, 1032, new C9192q.InterfaceC9193a() { // from class: j6.p0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmSessionManagerError(AnalyticsListener.EventTime.this, exc);
            }
        });
    }

    @Override // p213l8.InterfaceC10062a0
    /* renamed from: E */
    public final void mo12468E(final long j, final int i) {
        final AnalyticsListener.EventTime m29671N0 = m29671N0();
        m29640X1(m29671N0, 1026, new C9192q.InterfaceC9193a() { // from class: j6.m
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoFrameProcessingOffset(AnalyticsListener.EventTime.this, j, i);
            }
        });
    }

    /* renamed from: H0 */
    public void m29689H0(AnalyticsListener analyticsListener) {
        C9149a.m16448e(analyticsListener);
        this.f11416o.m16207c(analyticsListener);
    }

    /* renamed from: I0 */
    protected final AnalyticsListener.EventTime m29686I0() {
        return m29680K0(this.f11414m.m29578d());
    }

    @RequiresNonNull({"player"})
    /* renamed from: J0 */
    protected final AnalyticsListener.EventTime m29683J0(Timeline timeline, int i, InterfaceC10341s.C10342a c10342a) {
        InterfaceC10341s.C10342a c10342a2;
        boolean z;
        long mo29510M;
        if (timeline.m29737q()) {
            c10342a2 = null;
        } else {
            c10342a2 = c10342a;
        }
        long mo16373b = this.f11411j.mo16373b();
        boolean z2 = true;
        if (timeline.equals(this.f11417p.mo29438v()) && i == this.f11417p.mo29463l()) {
            z = true;
        } else {
            z = false;
        }
        long j = 0;
        if (c10342a2 != null && c10342a2.m11751b()) {
            if (!z || this.f11417p.mo29447r() != c10342a2.f27017b || this.f11417p.mo29512L() != c10342a2.f27018c) {
                z2 = false;
            }
            if (z2) {
                j = this.f11417p.mo29491Y();
            }
        } else if (z) {
            mo29510M = this.f11417p.mo29510M();
            return new AnalyticsListener.EventTime(mo16373b, timeline, i, c10342a2, mo29510M, this.f11417p.mo29438v(), this.f11417p.mo29463l(), this.f11414m.m29578d(), this.f11417p.mo29491Y(), this.f11417p.mo29480e());
        } else if (!timeline.m29737q()) {
            j = timeline.m29738n(i, this.f11413l).m29719b();
        }
        mo29510M = j;
        return new AnalyticsListener.EventTime(mo16373b, timeline, i, c10342a2, mo29510M, this.f11417p.mo29438v(), this.f11417p.mo29463l(), this.f11414m.m29578d(), this.f11417p.mo29491Y(), this.f11417p.mo29480e());
    }

    /* renamed from: R1 */
    public final void m29658R1() {
        if (!this.f11418q) {
            final AnalyticsListener.EventTime m29686I0 = m29686I0();
            this.f11418q = true;
            m29640X1(m29686I0, -1, new C9192q.InterfaceC9193a() { // from class: j6.y0
                @Override // p195k8.C9192q.InterfaceC9193a
                public final void invoke(Object obj) {
                    ((AnalyticsListener) obj).onSeekStarted(AnalyticsListener.EventTime.this);
                }
            });
        }
    }

    /* renamed from: S1 */
    public final void m29655S1(final Metadata metadata) {
        final AnalyticsListener.EventTime m29686I0 = m29686I0();
        m29640X1(m29686I0, 1007, new C9192q.InterfaceC9193a() { // from class: j6.w
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMetadata(AnalyticsListener.EventTime.this, metadata);
            }
        });
    }

    /* renamed from: T1 */
    public void m29652T1(final int i, final int i2) {
        final AnalyticsListener.EventTime m29668O0 = m29668O0();
        m29640X1(m29668O0, 1029, new C9192q.InterfaceC9193a() { // from class: j6.h0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSurfaceSizeChanged(AnalyticsListener.EventTime.this, i, i2);
            }
        });
    }

    /* renamed from: U1 */
    public final void m29649U1(final float f) {
        final AnalyticsListener.EventTime m29668O0 = m29668O0();
        m29640X1(m29668O0, 1019, new C9192q.InterfaceC9193a() { // from class: j6.s0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVolumeChanged(AnalyticsListener.EventTime.this, f);
            }
        });
    }

    /* renamed from: V1 */
    public void m29646V1() {
        final AnalyticsListener.EventTime m29686I0 = m29686I0();
        this.f11415n.put(1036, m29686I0);
        this.f11416o.m16202h(1036, new C9192q.InterfaceC9193a() { // from class: j6.y
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerReleased(AnalyticsListener.EventTime.this);
            }
        });
    }

    /* renamed from: W1 */
    public final void m29643W1() {
    }

    /* renamed from: X1 */
    protected final void m29640X1(AnalyticsListener.EventTime eventTime, int i, C9192q.InterfaceC9193a<AnalyticsListener> interfaceC9193a) {
        this.f11415n.put(i, eventTime);
        this.f11416o.m16198l(i, interfaceC9193a);
    }

    /* renamed from: Y1 */
    public void m29637Y1(final Player player, Looper looper) {
        boolean z;
        if (this.f11417p != null && !this.f11414m.f11420b.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        C9149a.m16447f(z);
        this.f11417p = (Player) C9149a.m16448e(player);
        this.f11416o = this.f11416o.m16206d(looper, new C9192q.InterfaceC9194b() { // from class: j6.z0
            @Override // p195k8.C9192q.InterfaceC9194b
            /* renamed from: a */
            public final void mo16197a(Object obj, C9203v c9203v) {
                C4382a.this.m29661Q1(player, (AnalyticsListener) obj, (AnalyticsListener.Events) c9203v);
            }
        });
    }

    /* renamed from: Z1 */
    public final void m29634Z1(List<InterfaceC10341s.C10342a> list, InterfaceC10341s.C10342a c10342a) {
        this.f11414m.m29571k(list, c10342a, (Player) C9149a.m16448e(this.f11417p));
    }

    @Override // p193k6.InterfaceC9115q
    /* renamed from: a */
    public final void mo16602a(final boolean z) {
        final AnalyticsListener.EventTime m29668O0 = m29668O0();
        m29640X1(m29668O0, 1017, new C9192q.InterfaceC9193a() { // from class: j6.l0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSkipSilenceEnabledChanged(AnalyticsListener.EventTime.this, z);
            }
        });
    }

    @Override // p229m7.InterfaceC10353z
    /* renamed from: b */
    public final void mo11715b(int i, InterfaceC10341s.C10342a c10342a, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime m29674M0 = m29674M0(i, c10342a);
        m29640X1(m29674M0, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, new C9192q.InterfaceC9193a() { // from class: j6.s
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadStarted(AnalyticsListener.EventTime.this, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // p193k6.InterfaceC9115q
    /* renamed from: c */
    public final void mo16601c(final Exception exc) {
        final AnalyticsListener.EventTime m29668O0 = m29668O0();
        m29640X1(m29668O0, 1018, new C9192q.InterfaceC9193a() { // from class: j6.b0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioSinkError(AnalyticsListener.EventTime.this, exc);
            }
        });
    }

    @Override // p213l8.InterfaceC10062a0
    /* renamed from: d */
    public final void mo12467d(final int i, final int i2, final int i3, final float f) {
        final AnalyticsListener.EventTime m29668O0 = m29668O0();
        m29640X1(m29668O0, 1028, new C9192q.InterfaceC9193a() { // from class: j6.v
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoSizeChanged(AnalyticsListener.EventTime.this, i, i2, i3, f);
            }
        });
    }

    @Override // p259o6.InterfaceC11045v
    /* renamed from: e */
    public final void mo9294e(int i, InterfaceC10341s.C10342a c10342a) {
        final AnalyticsListener.EventTime m29674M0 = m29674M0(i, c10342a);
        m29640X1(m29674M0, 1035, new C9192q.InterfaceC9193a() { // from class: j6.r0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmSessionReleased(AnalyticsListener.EventTime.this);
            }
        });
    }

    @Override // p213l8.InterfaceC10062a0
    /* renamed from: f */
    public final void mo12466f(final String str) {
        final AnalyticsListener.EventTime m29668O0 = m29668O0();
        m29640X1(m29668O0, 1024, new C9192q.InterfaceC9193a() { // from class: j6.g
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoDecoderReleased(AnalyticsListener.EventTime.this, str);
            }
        });
    }

    @Override // p193k6.InterfaceC9115q
    /* renamed from: g */
    public final void mo16600g(final DecoderCounters decoderCounters) {
        final AnalyticsListener.EventTime m29668O0 = m29668O0();
        m29640X1(m29668O0, 1008, new C9192q.InterfaceC9193a() { // from class: j6.p
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                C4382a.m29650U0(AnalyticsListener.EventTime.this, decoderCounters, (AnalyticsListener) obj);
            }
        });
    }

    @Override // p213l8.InterfaceC10062a0
    /* renamed from: h */
    public final void mo12465h(final String str, long j, final long j2) {
        final AnalyticsListener.EventTime m29668O0 = m29668O0();
        m29640X1(m29668O0, 1021, new C9192q.InterfaceC9193a() { // from class: j6.k0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                C4382a.m29688H1(AnalyticsListener.EventTime.this, str, j2, (AnalyticsListener) obj);
            }
        });
    }

    @Override // p229m7.InterfaceC10353z
    /* renamed from: i */
    public final void mo11714i(int i, InterfaceC10341s.C10342a c10342a, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z) {
        final AnalyticsListener.EventTime m29674M0 = m29674M0(i, c10342a);
        m29640X1(m29674M0, 1003, new C9192q.InterfaceC9193a() { // from class: j6.o0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadError(AnalyticsListener.EventTime.this, loadEventInfo, mediaLoadData, iOException, z);
            }
        });
    }

    @Override // p213l8.InterfaceC10062a0
    /* renamed from: j */
    public final void mo12464j(final Surface surface) {
        final AnalyticsListener.EventTime m29668O0 = m29668O0();
        m29640X1(m29668O0, 1027, new C9192q.InterfaceC9193a() { // from class: j6.j
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onRenderedFirstFrame(AnalyticsListener.EventTime.this, surface);
            }
        });
    }

    @Override // p153i8.InterfaceC7444e.InterfaceC7445a
    /* renamed from: k */
    public final void mo20664k(final int i, final long j, final long j2) {
        final AnalyticsListener.EventTime m29677L0 = m29677L0();
        m29640X1(m29677L0, 1006, new C9192q.InterfaceC9193a() { // from class: j6.a1
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onBandwidthEstimate(AnalyticsListener.EventTime.this, i, j, j2);
            }
        });
    }

    @Override // p193k6.InterfaceC9115q
    /* renamed from: l */
    public final void mo16599l(final String str) {
        final AnalyticsListener.EventTime m29668O0 = m29668O0();
        m29640X1(m29668O0, 1013, new C9192q.InterfaceC9193a() { // from class: j6.z
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioDecoderReleased(AnalyticsListener.EventTime.this, str);
            }
        });
    }

    @Override // p193k6.InterfaceC9115q
    /* renamed from: m */
    public final void mo16598m(final String str, long j, final long j2) {
        final AnalyticsListener.EventTime m29668O0 = m29668O0();
        m29640X1(m29668O0, 1009, new C9192q.InterfaceC9193a() { // from class: j6.u
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                C4382a.m29659R0(AnalyticsListener.EventTime.this, str, j2, (AnalyticsListener) obj);
            }
        });
    }

    @Override // p229m7.InterfaceC10353z
    /* renamed from: n */
    public final void mo11713n(int i, InterfaceC10341s.C10342a c10342a, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime m29674M0 = m29674M0(i, c10342a);
        m29640X1(m29674M0, 1005, new C9192q.InterfaceC9193a() { // from class: j6.x0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onUpstreamDiscarded(AnalyticsListener.EventTime.this, mediaLoadData);
            }
        });
    }

    @Override // p229m7.InterfaceC10353z
    /* renamed from: o */
    public final void mo11712o(int i, InterfaceC10341s.C10342a c10342a, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime m29674M0 = m29674M0(i, c10342a);
        m29640X1(m29674M0, RNCWebViewManager.COMMAND_CLEAR_HISTORY, new C9192q.InterfaceC9193a() { // from class: j6.m0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadCanceled(AnalyticsListener.EventTime.this, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public /* synthetic */ void onEvents(Player player, Player.Events events) {
        C7404o.m20747a(this, player, events);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public /* synthetic */ void onExperimentalOffloadSchedulingEnabledChanged(boolean z) {
        C7404o.m20746b(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public /* synthetic */ void onExperimentalSleepingForOffloadChanged(boolean z) {
        C7404o.m20745c(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public final void onIsLoadingChanged(final boolean z) {
        final AnalyticsListener.EventTime m29686I0 = m29686I0();
        m29640X1(m29686I0, 4, new C9192q.InterfaceC9193a() { // from class: j6.c0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onIsLoadingChanged(AnalyticsListener.EventTime.this, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public void onIsPlayingChanged(final boolean z) {
        final AnalyticsListener.EventTime m29686I0 = m29686I0();
        m29640X1(m29686I0, 8, new C9192q.InterfaceC9193a() { // from class: j6.g0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onIsPlayingChanged(AnalyticsListener.EventTime.this, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public /* synthetic */ void onLoadingChanged(boolean z) {
        C7404o.m20742f(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public final void onMediaItemTransition(final MediaItem mediaItem, final int i) {
        final AnalyticsListener.EventTime m29686I0 = m29686I0();
        m29640X1(m29686I0, 1, new C9192q.InterfaceC9193a() { // from class: j6.t
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMediaItemTransition(AnalyticsListener.EventTime.this, mediaItem, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public final void onPlayWhenReadyChanged(final boolean z, final int i) {
        final AnalyticsListener.EventTime m29686I0 = m29686I0();
        m29640X1(m29686I0, 6, new C9192q.InterfaceC9193a() { // from class: j6.d
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayWhenReadyChanged(AnalyticsListener.EventTime.this, z, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public final void onPlaybackParametersChanged(final PlaybackParameters playbackParameters) {
        final AnalyticsListener.EventTime m29686I0 = m29686I0();
        m29640X1(m29686I0, 13, new C9192q.InterfaceC9193a() { // from class: j6.a0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackParametersChanged(AnalyticsListener.EventTime.this, playbackParameters);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public final void onPlaybackStateChanged(final int i) {
        final AnalyticsListener.EventTime m29686I0 = m29686I0();
        m29640X1(m29686I0, 5, new C9192q.InterfaceC9193a() { // from class: j6.e0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackStateChanged(AnalyticsListener.EventTime.this, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public final void onPlaybackSuppressionReasonChanged(final int i) {
        final AnalyticsListener.EventTime m29686I0 = m29686I0();
        m29640X1(m29686I0, 7, new C9192q.InterfaceC9193a() { // from class: j6.c1
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime.this, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public final void onPlayerError(final ExoPlaybackException exoPlaybackException) {
        final AnalyticsListener.EventTime m29686I0;
        C10332q c10332q = exoPlaybackException.f11168p;
        if (c10332q != null) {
            m29686I0 = m29680K0(new InterfaceC10341s.C10342a(c10332q));
        } else {
            m29686I0 = m29686I0();
        }
        m29640X1(m29686I0, 11, new C9192q.InterfaceC9193a() { // from class: j6.q
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerError(AnalyticsListener.EventTime.this, exoPlaybackException);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public final void onPlayerStateChanged(final boolean z, final int i) {
        final AnalyticsListener.EventTime m29686I0 = m29686I0();
        m29640X1(m29686I0, -1, new C9192q.InterfaceC9193a() { // from class: j6.f
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerStateChanged(AnalyticsListener.EventTime.this, z, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public final void onPositionDiscontinuity(final int i) {
        if (i == 1) {
            this.f11418q = false;
        }
        this.f11414m.m29572j((Player) C9149a.m16448e(this.f11417p));
        final AnalyticsListener.EventTime m29686I0 = m29686I0();
        m29640X1(m29686I0, 12, new C9192q.InterfaceC9193a() { // from class: j6.k
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPositionDiscontinuity(AnalyticsListener.EventTime.this, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public final void onRepeatModeChanged(final int i) {
        final AnalyticsListener.EventTime m29686I0 = m29686I0();
        m29640X1(m29686I0, 9, new C9192q.InterfaceC9193a() { // from class: j6.e
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onRepeatModeChanged(AnalyticsListener.EventTime.this, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public final void onSeekProcessed() {
        final AnalyticsListener.EventTime m29686I0 = m29686I0();
        m29640X1(m29686I0, -1, new C9192q.InterfaceC9193a() { // from class: j6.b1
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSeekProcessed(AnalyticsListener.EventTime.this);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public final void onShuffleModeEnabledChanged(final boolean z) {
        final AnalyticsListener.EventTime m29686I0 = m29686I0();
        m29640X1(m29686I0, 10, new C9192q.InterfaceC9193a() { // from class: j6.o
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onShuffleModeChanged(AnalyticsListener.EventTime.this, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public final void onStaticMetadataChanged(final List<Metadata> list) {
        final AnalyticsListener.EventTime m29686I0 = m29686I0();
        m29640X1(m29686I0, 3, new C9192q.InterfaceC9193a() { // from class: j6.r
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onStaticMetadataChanged(AnalyticsListener.EventTime.this, list);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public final void onTimelineChanged(Timeline timeline, final int i) {
        this.f11414m.m29570l((Player) C9149a.m16448e(this.f11417p));
        final AnalyticsListener.EventTime m29686I0 = m29686I0();
        m29640X1(m29686I0, 0, new C9192q.InterfaceC9193a() { // from class: j6.h
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onTimelineChanged(AnalyticsListener.EventTime.this, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public /* synthetic */ void onTimelineChanged(Timeline timeline, Object obj, int i) {
        C7404o.m20728t(this, timeline, obj, i);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public final void onTracksChanged(final TrackGroupArray trackGroupArray, final TrackSelectionArray trackSelectionArray) {
        final AnalyticsListener.EventTime m29686I0 = m29686I0();
        m29640X1(m29686I0, 2, new C9192q.InterfaceC9193a() { // from class: j6.j0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onTracksChanged(AnalyticsListener.EventTime.this, trackGroupArray, trackSelectionArray);
            }
        });
    }

    @Override // p213l8.InterfaceC10062a0
    /* renamed from: p */
    public final void mo12463p(final Format format, final DecoderReuseEvaluation decoderReuseEvaluation) {
        final AnalyticsListener.EventTime m29668O0 = m29668O0();
        m29640X1(m29668O0, 1022, new C9192q.InterfaceC9193a() { // from class: j6.i
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                C4382a.m29673M1(AnalyticsListener.EventTime.this, format, decoderReuseEvaluation, (AnalyticsListener) obj);
            }
        });
    }

    @Override // p193k6.InterfaceC9115q
    /* renamed from: q */
    public final void mo16597q(final long j) {
        final AnalyticsListener.EventTime m29668O0 = m29668O0();
        m29640X1(m29668O0, 1011, new C9192q.InterfaceC9193a() { // from class: j6.i0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioPositionAdvancing(AnalyticsListener.EventTime.this, j);
            }
        });
    }

    @Override // p213l8.InterfaceC10062a0
    /* renamed from: r */
    public final void mo12462r(final DecoderCounters decoderCounters) {
        final AnalyticsListener.EventTime m29671N0 = m29671N0();
        m29640X1(m29671N0, 1025, new C9192q.InterfaceC9193a() { // from class: j6.x
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                C4382a.m29682J1(AnalyticsListener.EventTime.this, decoderCounters, (AnalyticsListener) obj);
            }
        });
    }

    @Override // p193k6.InterfaceC9115q
    /* renamed from: s */
    public final void mo16596s(final DecoderCounters decoderCounters) {
        final AnalyticsListener.EventTime m29671N0 = m29671N0();
        m29640X1(m29671N0, 1014, new C9192q.InterfaceC9193a() { // from class: j6.b
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                C4382a.m29653T0(AnalyticsListener.EventTime.this, decoderCounters, (AnalyticsListener) obj);
            }
        });
    }

    @Override // p259o6.InterfaceC11045v
    /* renamed from: t */
    public final void mo9293t(int i, InterfaceC10341s.C10342a c10342a) {
        final AnalyticsListener.EventTime m29674M0 = m29674M0(i, c10342a);
        m29640X1(m29674M0, 1033, new C9192q.InterfaceC9193a() { // from class: j6.w0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysRestored(AnalyticsListener.EventTime.this);
            }
        });
    }

    @Override // p259o6.InterfaceC11045v
    /* renamed from: u */
    public final void mo9292u(int i, InterfaceC10341s.C10342a c10342a) {
        final AnalyticsListener.EventTime m29674M0 = m29674M0(i, c10342a);
        m29640X1(m29674M0, 1030, new C9192q.InterfaceC9193a() { // from class: j6.n0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmSessionAcquired(AnalyticsListener.EventTime.this);
            }
        });
    }

    @Override // p259o6.InterfaceC11045v
    /* renamed from: v */
    public final void mo9291v(int i, InterfaceC10341s.C10342a c10342a) {
        final AnalyticsListener.EventTime m29674M0 = m29674M0(i, c10342a);
        m29640X1(m29674M0, 1034, new C9192q.InterfaceC9193a() { // from class: j6.u0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysRemoved(AnalyticsListener.EventTime.this);
            }
        });
    }

    @Override // p213l8.InterfaceC10062a0
    /* renamed from: w */
    public final void mo12461w(final int i, final long j) {
        final AnalyticsListener.EventTime m29671N0 = m29671N0();
        m29640X1(m29671N0, 1023, new C9192q.InterfaceC9193a() { // from class: j6.c
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDroppedVideoFrames(AnalyticsListener.EventTime.this, i, j);
            }
        });
    }

    @Override // p193k6.InterfaceC9115q
    /* renamed from: x */
    public final void mo16595x(final Format format, final DecoderReuseEvaluation decoderReuseEvaluation) {
        final AnalyticsListener.EventTime m29668O0 = m29668O0();
        m29640X1(m29668O0, 1010, new C9192q.InterfaceC9193a() { // from class: j6.n
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                C4382a.m29647V0(AnalyticsListener.EventTime.this, format, decoderReuseEvaluation, (AnalyticsListener) obj);
            }
        });
    }

    @Override // p213l8.InterfaceC10062a0
    /* renamed from: y */
    public final void mo12460y(final DecoderCounters decoderCounters) {
        final AnalyticsListener.EventTime m29668O0 = m29668O0();
        m29640X1(m29668O0, 1020, new C9192q.InterfaceC9193a() { // from class: j6.d0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                C4382a.m29679K1(AnalyticsListener.EventTime.this, decoderCounters, (AnalyticsListener) obj);
            }
        });
    }

    @Override // p259o6.InterfaceC11045v
    /* renamed from: z */
    public final void mo9290z(int i, InterfaceC10341s.C10342a c10342a) {
        final AnalyticsListener.EventTime m29674M0 = m29674M0(i, c10342a);
        m29640X1(m29674M0, 1031, new C9192q.InterfaceC9193a() { // from class: j6.v0
            @Override // p195k8.C9192q.InterfaceC9193a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysLoaded(AnalyticsListener.EventTime.this);
            }
        });
    }
}
