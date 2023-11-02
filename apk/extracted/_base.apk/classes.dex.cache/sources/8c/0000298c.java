package com.google.android.exoplayer2;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import gb.AbstractC6693s;
import java.util.List;
import p099f8.C6349n;
import p229m7.InterfaceC10341s;

/* renamed from: com.google.android.exoplayer2.r0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4444r0 {

    /* renamed from: s */
    private static final InterfaceC10341s.C10342a f11714s = new InterfaceC10341s.C10342a(new Object());

    /* renamed from: a */
    public final Timeline f11715a;

    /* renamed from: b */
    public final InterfaceC10341s.C10342a f11716b;

    /* renamed from: c */
    public final long f11717c;

    /* renamed from: d */
    public final int f11718d;

    /* renamed from: e */
    public final ExoPlaybackException f11719e;

    /* renamed from: f */
    public final boolean f11720f;

    /* renamed from: g */
    public final TrackGroupArray f11721g;

    /* renamed from: h */
    public final C6349n f11722h;

    /* renamed from: i */
    public final List<Metadata> f11723i;

    /* renamed from: j */
    public final InterfaceC10341s.C10342a f11724j;

    /* renamed from: k */
    public final boolean f11725k;

    /* renamed from: l */
    public final int f11726l;

    /* renamed from: m */
    public final PlaybackParameters f11727m;

    /* renamed from: n */
    public final boolean f11728n;

    /* renamed from: o */
    public final boolean f11729o;

    /* renamed from: p */
    public volatile long f11730p;

    /* renamed from: q */
    public volatile long f11731q;

    /* renamed from: r */
    public volatile long f11732r;

    public C4444r0(Timeline timeline, InterfaceC10341s.C10342a c10342a, long j, int i, ExoPlaybackException exoPlaybackException, boolean z, TrackGroupArray trackGroupArray, C6349n c6349n, List<Metadata> list, InterfaceC10341s.C10342a c10342a2, boolean z2, int i2, PlaybackParameters playbackParameters, long j2, long j3, long j4, boolean z3, boolean z4) {
        this.f11715a = timeline;
        this.f11716b = c10342a;
        this.f11717c = j;
        this.f11718d = i;
        this.f11719e = exoPlaybackException;
        this.f11720f = z;
        this.f11721g = trackGroupArray;
        this.f11722h = c6349n;
        this.f11723i = list;
        this.f11724j = c10342a2;
        this.f11725k = z2;
        this.f11726l = i2;
        this.f11727m = playbackParameters;
        this.f11730p = j2;
        this.f11731q = j3;
        this.f11732r = j4;
        this.f11728n = z3;
        this.f11729o = z4;
    }

    /* renamed from: k */
    public static C4444r0 m29162k(C6349n c6349n) {
        Timeline timeline = Timeline.f11370a;
        InterfaceC10341s.C10342a c10342a = f11714s;
        return new C4444r0(timeline, c10342a, -9223372036854775807L, 1, null, false, TrackGroupArray.f11763m, c6349n, AbstractC6693s.m22131x(), c10342a, false, 0, PlaybackParameters.f11301d, 0L, 0L, 0L, false, false);
    }

    /* renamed from: l */
    public static InterfaceC10341s.C10342a m29161l() {
        return f11714s;
    }

    /* renamed from: a */
    public C4444r0 m29172a(boolean z) {
        return new C4444r0(this.f11715a, this.f11716b, this.f11717c, this.f11718d, this.f11719e, z, this.f11721g, this.f11722h, this.f11723i, this.f11724j, this.f11725k, this.f11726l, this.f11727m, this.f11730p, this.f11731q, this.f11732r, this.f11728n, this.f11729o);
    }

    /* renamed from: b */
    public C4444r0 m29171b(InterfaceC10341s.C10342a c10342a) {
        return new C4444r0(this.f11715a, this.f11716b, this.f11717c, this.f11718d, this.f11719e, this.f11720f, this.f11721g, this.f11722h, this.f11723i, c10342a, this.f11725k, this.f11726l, this.f11727m, this.f11730p, this.f11731q, this.f11732r, this.f11728n, this.f11729o);
    }

    /* renamed from: c */
    public C4444r0 m29170c(InterfaceC10341s.C10342a c10342a, long j, long j2, long j3, TrackGroupArray trackGroupArray, C6349n c6349n, List<Metadata> list) {
        return new C4444r0(this.f11715a, c10342a, j2, this.f11718d, this.f11719e, this.f11720f, trackGroupArray, c6349n, list, this.f11724j, this.f11725k, this.f11726l, this.f11727m, this.f11730p, j3, j, this.f11728n, this.f11729o);
    }

    /* renamed from: d */
    public C4444r0 m29169d(boolean z) {
        return new C4444r0(this.f11715a, this.f11716b, this.f11717c, this.f11718d, this.f11719e, this.f11720f, this.f11721g, this.f11722h, this.f11723i, this.f11724j, this.f11725k, this.f11726l, this.f11727m, this.f11730p, this.f11731q, this.f11732r, z, this.f11729o);
    }

    /* renamed from: e */
    public C4444r0 m29168e(boolean z, int i) {
        return new C4444r0(this.f11715a, this.f11716b, this.f11717c, this.f11718d, this.f11719e, this.f11720f, this.f11721g, this.f11722h, this.f11723i, this.f11724j, z, i, this.f11727m, this.f11730p, this.f11731q, this.f11732r, this.f11728n, this.f11729o);
    }

    /* renamed from: f */
    public C4444r0 m29167f(ExoPlaybackException exoPlaybackException) {
        return new C4444r0(this.f11715a, this.f11716b, this.f11717c, this.f11718d, exoPlaybackException, this.f11720f, this.f11721g, this.f11722h, this.f11723i, this.f11724j, this.f11725k, this.f11726l, this.f11727m, this.f11730p, this.f11731q, this.f11732r, this.f11728n, this.f11729o);
    }

    /* renamed from: g */
    public C4444r0 m29166g(PlaybackParameters playbackParameters) {
        return new C4444r0(this.f11715a, this.f11716b, this.f11717c, this.f11718d, this.f11719e, this.f11720f, this.f11721g, this.f11722h, this.f11723i, this.f11724j, this.f11725k, this.f11726l, playbackParameters, this.f11730p, this.f11731q, this.f11732r, this.f11728n, this.f11729o);
    }

    /* renamed from: h */
    public C4444r0 m29165h(int i) {
        return new C4444r0(this.f11715a, this.f11716b, this.f11717c, i, this.f11719e, this.f11720f, this.f11721g, this.f11722h, this.f11723i, this.f11724j, this.f11725k, this.f11726l, this.f11727m, this.f11730p, this.f11731q, this.f11732r, this.f11728n, this.f11729o);
    }

    /* renamed from: i */
    public C4444r0 m29164i(boolean z) {
        return new C4444r0(this.f11715a, this.f11716b, this.f11717c, this.f11718d, this.f11719e, this.f11720f, this.f11721g, this.f11722h, this.f11723i, this.f11724j, this.f11725k, this.f11726l, this.f11727m, this.f11730p, this.f11731q, this.f11732r, this.f11728n, z);
    }

    /* renamed from: j */
    public C4444r0 m29163j(Timeline timeline) {
        return new C4444r0(timeline, this.f11716b, this.f11717c, this.f11718d, this.f11719e, this.f11720f, this.f11721g, this.f11722h, this.f11723i, this.f11724j, this.f11725k, this.f11726l, this.f11727m, this.f11730p, this.f11731q, this.f11732r, this.f11728n, this.f11729o);
    }
}