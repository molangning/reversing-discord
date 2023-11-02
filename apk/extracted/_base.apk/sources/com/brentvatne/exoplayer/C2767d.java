package com.brentvatne.exoplayer;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.C0946a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.p049ui.SubtitleView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.util.List;
import p151i6.C7404o;
import p213l8.C10086p;
import p213l8.InterfaceC10087q;
import p383v7.C13127b;
import p383v7.InterfaceC13140l;

@TargetApi(16)
/* renamed from: com.brentvatne.exoplayer.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C2767d extends FrameLayout {

    /* renamed from: j */
    private View f7440j;

    /* renamed from: k */
    private final View f7441k;

    /* renamed from: l */
    private final SubtitleView f7442l;

    /* renamed from: m */
    private final C2764a f7443m;

    /* renamed from: n */
    private final C2769b f7444n;

    /* renamed from: o */
    private SimpleExoPlayer f7445o;

    /* renamed from: p */
    private Context f7446p;

    /* renamed from: q */
    private ViewGroup.LayoutParams f7447q;

    /* renamed from: r */
    private boolean f7448r;

    /* renamed from: s */
    private boolean f7449s;

    /* renamed from: t */
    private final Runnable f7450t;

    /* renamed from: com.brentvatne.exoplayer.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2768a implements Runnable {
        RunnableC2768a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2767d c2767d = C2767d.this;
            c2767d.measure(View.MeasureSpec.makeMeasureSpec(c2767d.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(C2767d.this.getHeight(), 1073741824));
            C2767d c2767d2 = C2767d.this;
            c2767d2.layout(c2767d2.getLeft(), C2767d.this.getTop(), C2767d.this.getRight(), C2767d.this.getBottom());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.brentvatne.exoplayer.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class C2769b implements InterfaceC10087q, InterfaceC13140l, Player.InterfaceC4371a {
        private C2769b() {
        }

        @Override // p213l8.InterfaceC10087q
        /* renamed from: d */
        public void mo12310d(int i, int i2, int i3, float f) {
            boolean z;
            float f2;
            if (C2767d.this.f7443m.getAspectRatio() == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            C2764a c2764a = C2767d.this.f7443m;
            if (i2 == 0) {
                f2 = 1.0f;
            } else {
                f2 = (i * f) / i2;
            }
            c2764a.setAspectRatio(f2);
            if (z) {
                C2767d c2767d = C2767d.this;
                c2767d.post(c2767d.f7450t);
            }
        }

        @Override // p213l8.InterfaceC10087q
        /* renamed from: e */
        public void mo12309e() {
            C2767d.this.f7441k.setVisibility(4);
        }

        @Override // p213l8.InterfaceC10087q
        /* renamed from: f */
        public /* synthetic */ void mo12308f(int i, int i2) {
            C10086p.m12311a(this, i, i2);
        }

        @Override // p383v7.InterfaceC13140l
        /* renamed from: n */
        public void mo3124n(List<C13127b> list) {
            C2767d.this.f7442l.mo3124n(list);
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
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
            C7404o.m20744d(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
            C7404o.m20743e(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public void onLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
            C7404o.m20741g(this, mediaItem, i);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            C7404o.m20740h(this, z, i);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onPlaybackStateChanged(int i) {
            C7404o.m20738j(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            C7404o.m20737k(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public void onPlayerStateChanged(boolean z, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public void onPositionDiscontinuity(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public void onRepeatModeChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public void onSeekProcessed() {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onStaticMetadataChanged(List list) {
            C7404o.m20730r(this, list);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
            C7404o.m20729s(this, timeline, i);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public void onTimelineChanged(Timeline timeline, Object obj, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            C2767d.this.m32416i();
        }
    }

    public C2767d(Context context) {
        this(context, null);
    }

    /* renamed from: f */
    private void m32419f() {
        View view = this.f7440j;
        if (view instanceof TextureView) {
            this.f7445o.mo29830J((TextureView) view);
        } else if (view instanceof SurfaceView) {
            this.f7445o.mo29817U((SurfaceView) view);
        }
    }

    /* renamed from: h */
    private void m32417h() {
        View view = this.f7440j;
        if (view instanceof TextureView) {
            this.f7445o.mo29770z((TextureView) view);
        } else if (view instanceof SurfaceView) {
            this.f7445o.mo29792j((SurfaceView) view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m32416i() {
        SimpleExoPlayer simpleExoPlayer = this.f7445o;
        if (simpleExoPlayer == null) {
            return;
        }
        TrackSelectionArray mo29531A = simpleExoPlayer.mo29531A();
        for (int i = 0; i < mo29531A.f11998a; i++) {
            if (this.f7445o.mo29529B(i) == 2 && mo29531A.m28969a(i) != null) {
                return;
            }
        }
        this.f7441k.setVisibility(0);
    }

    /* renamed from: j */
    private void m32415j() {
        this.f7441k.setVisibility(this.f7449s ? 4 : 0);
    }

    /* renamed from: k */
    private void m32414k() {
        View surfaceView;
        if (this.f7448r) {
            surfaceView = new TextureView(this.f7446p);
        } else {
            surfaceView = new SurfaceView(this.f7446p);
        }
        surfaceView.setLayoutParams(this.f7447q);
        this.f7440j = surfaceView;
        if (this.f7443m.getChildAt(0) != null) {
            this.f7443m.removeViewAt(0);
        }
        this.f7443m.addView(this.f7440j, 0, this.f7447q);
        if (this.f7445o != null) {
            m32417h();
        }
    }

    /* renamed from: g */
    public void m32418g() {
        this.f7443m.m32431a();
    }

    public View getVideoSurfaceView() {
        return this.f7440j;
    }

    public void setHideShutterView(boolean z) {
        this.f7449s = z;
        m32415j();
    }

    public void setPlayer(SimpleExoPlayer simpleExoPlayer) {
        SimpleExoPlayer simpleExoPlayer2 = this.f7445o;
        if (simpleExoPlayer2 == simpleExoPlayer) {
            return;
        }
        if (simpleExoPlayer2 != null) {
            simpleExoPlayer2.mo29774x(this.f7444n);
            this.f7445o.mo29795i(this.f7444n);
            this.f7445o.mo29466k(this.f7444n);
            m32419f();
        }
        this.f7445o = simpleExoPlayer;
        this.f7441k.setVisibility(0);
        if (simpleExoPlayer != null) {
            m32417h();
            simpleExoPlayer.mo29833H(this.f7444n);
            simpleExoPlayer.mo29514K(this.f7444n);
            simpleExoPlayer.mo29838D(this.f7444n);
        }
    }

    public void setResizeMode(int i) {
        if (this.f7443m.getResizeMode() != i) {
            this.f7443m.setResizeMode(i);
            post(this.f7450t);
        }
    }

    public void setUseTextureView(boolean z) {
        if (z != this.f7448r) {
            this.f7448r = z;
            m32414k();
        }
    }

    public C2767d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2767d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7448r = true;
        this.f7449s = false;
        this.f7450t = new RunnableC2768a();
        this.f7446p = context;
        this.f7447q = new ViewGroup.LayoutParams(-1, -1);
        this.f7444n = new C2769b();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        C2764a c2764a = new C2764a(context);
        this.f7443m = c2764a;
        c2764a.setLayoutParams(layoutParams);
        View view = new View(getContext());
        this.f7441k = view;
        view.setLayoutParams(this.f7447q);
        view.setBackgroundColor(C0946a.m38401c(context, 17170444));
        SubtitleView subtitleView = new SubtitleView(context);
        this.f7442l = subtitleView;
        subtitleView.setLayoutParams(this.f7447q);
        subtitleView.m28839d();
        subtitleView.m28838e();
        m32414k();
        c2764a.addView(view, 1, this.f7447q);
        c2764a.addView(subtitleView, 2, this.f7447q);
        addViewInLayout(c2764a, 0, layoutParams);
    }
}
