package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.util.List;
import p195k8.C9203v;
import p213l8.InterfaceC10081m;
import p213l8.InterfaceC10087q;
import p230m8.InterfaceC10356a;
import p383v7.C13127b;
import p383v7.InterfaceC13140l;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface Player {

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Events extends C9203v {
        @Override // p195k8.C9203v
        /* renamed from: b */
        public boolean mo16148b(int i) {
            return super.mo16148b(i);
        }

        @Override // p195k8.C9203v
        /* renamed from: c */
        public boolean mo16147c(int... iArr) {
            return super.mo16147c(iArr);
        }
    }

    /* renamed from: com.google.android.exoplayer2.Player$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4371a {
        void onEvents(Player player, Events events);

        void onExperimentalOffloadSchedulingEnabledChanged(boolean z);

        void onExperimentalSleepingForOffloadChanged(boolean z);

        void onIsLoadingChanged(boolean z);

        void onIsPlayingChanged(boolean z);

        @Deprecated
        void onLoadingChanged(boolean z);

        void onMediaItemTransition(MediaItem mediaItem, int i);

        void onPlayWhenReadyChanged(boolean z, int i);

        void onPlaybackParametersChanged(PlaybackParameters playbackParameters);

        void onPlaybackStateChanged(int i);

        void onPlaybackSuppressionReasonChanged(int i);

        void onPlayerError(ExoPlaybackException exoPlaybackException);

        @Deprecated
        void onPlayerStateChanged(boolean z, int i);

        void onPositionDiscontinuity(int i);

        void onRepeatModeChanged(int i);

        @Deprecated
        void onSeekProcessed();

        void onShuffleModeEnabledChanged(boolean z);

        void onStaticMetadataChanged(List<Metadata> list);

        void onTimelineChanged(Timeline timeline, int i);

        @Deprecated
        void onTimelineChanged(Timeline timeline, Object obj, int i);

        void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray);
    }

    /* renamed from: com.google.android.exoplayer2.Player$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4372b {
        /* renamed from: D */
        void mo29838D(InterfaceC13140l interfaceC13140l);

        /* renamed from: q */
        List<C13127b> mo29783q();

        /* renamed from: x */
        void mo29774x(InterfaceC13140l interfaceC13140l);
    }

    /* renamed from: com.google.android.exoplayer2.Player$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4373c {
        /* renamed from: H */
        void mo29833H(InterfaceC10087q interfaceC10087q);

        /* renamed from: J */
        void mo29830J(TextureView textureView);

        /* renamed from: R */
        void mo29821R(InterfaceC10081m interfaceC10081m);

        /* renamed from: U */
        void mo29817U(SurfaceView surfaceView);

        /* renamed from: a */
        void mo29810a(Surface surface);

        /* renamed from: f */
        void mo29802f(Surface surface);

        /* renamed from: i */
        void mo29795i(InterfaceC10087q interfaceC10087q);

        /* renamed from: j */
        void mo29792j(SurfaceView surfaceView);

        /* renamed from: p */
        void mo29785p(InterfaceC10081m interfaceC10081m);

        /* renamed from: s */
        void mo29780s(InterfaceC10356a interfaceC10356a);

        /* renamed from: y */
        void mo29772y(InterfaceC10356a interfaceC10356a);

        /* renamed from: z */
        void mo29770z(TextureView textureView);
    }

    /* renamed from: A */
    TrackSelectionArray mo29531A();

    /* renamed from: B */
    int mo29529B(int i);

    /* renamed from: C */
    InterfaceC4372b mo29527C();

    /* renamed from: E */
    void mo29524E(int i, long j);

    /* renamed from: F */
    boolean mo29522F();

    /* renamed from: G */
    void mo29520G(boolean z);

    /* renamed from: I */
    int mo29517I();

    /* renamed from: K */
    void mo29514K(InterfaceC4371a interfaceC4371a);

    /* renamed from: L */
    int mo29512L();

    /* renamed from: M */
    long mo29510M();

    /* renamed from: N */
    int mo29539N();

    /* renamed from: O */
    long mo29507O();

    /* renamed from: P */
    int mo29505P();

    /* renamed from: Q */
    boolean mo29538Q();

    /* renamed from: S */
    void mo29501S(int i);

    /* renamed from: T */
    int mo29537T();

    /* renamed from: V */
    int mo29497V();

    /* renamed from: W */
    boolean mo29495W();

    /* renamed from: X */
    long mo29493X();

    /* renamed from: Y */
    long mo29491Y();

    /* renamed from: b */
    PlaybackParameters mo29487b();

    /* renamed from: c */
    void mo29485c();

    /* renamed from: d */
    boolean mo29483d();

    /* renamed from: e */
    long mo29480e();

    /* renamed from: g */
    List<Metadata> mo29475g();

    long getDuration();

    /* renamed from: h */
    boolean mo29532h();

    boolean hasNext();

    boolean hasPrevious();

    /* renamed from: k */
    void mo29466k(InterfaceC4371a interfaceC4371a);

    /* renamed from: l */
    int mo29463l();

    /* renamed from: m */
    ExoPlaybackException mo29460m();

    /* renamed from: n */
    void mo29457n(boolean z);

    /* renamed from: o */
    InterfaceC4373c mo29454o();

    /* renamed from: r */
    int mo29447r();

    /* renamed from: t */
    int mo29442t();

    /* renamed from: u */
    TrackGroupArray mo29440u();

    /* renamed from: v */
    Timeline mo29438v();

    /* renamed from: w */
    Looper mo29436w();
}