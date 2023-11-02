package com.discord.media_player;

import android.content.Context;
import android.view.Surface;
import com.discord.logging.Log;
import com.discord.media_player.MediaPlayerView;
import com.discord.resource_usage.DeviceResourceUsageRecorder;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p151i6.C7392d;
import p151i6.C7404o;
import p172j6.C8809d1;
import p229m7.C10306i0;

@Metadata(m14358d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 52\u00020\u0001:\u0003567B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u0016H\u0007J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0016H\u0007J\u0006\u0010\u001d\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010!\u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\u001fJ\b\u0010#\u001a\u00020\nH\u0007J\b\u0010$\u001a\u00020\nH\u0007JF\u0010%\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010&\u001a\u00020\u001f2\b\b\u0002\u0010'\u001a\u00020\u001f2\b\b\u0002\u0010(\u001a\u00020\u001b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0007J\b\u0010-\u001a\u00020\nH\u0007J\u000e\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u001bJ\u0010\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\tH\u0002J\u0010\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\u0016H\u0007J\u0006\u00104\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u00068"}, m14357d2 = {"Lcom/discord/media_player/MediaPlayer;", "", "exoPlayer", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "dataSourceFactory", "Lcom/google/android/exoplayer2/upstream/DataSource$Factory;", "(Lcom/google/android/exoplayer2/SimpleExoPlayer;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V", "eventListener", "Lkotlin/Function1;", "Lcom/discord/media_player/MediaPlayer$Event;", "", "getEventListener", "()Lkotlin/jvm/functions/Function1;", "setEventListener", "(Lkotlin/jvm/functions/Function1;)V", "mediaSource", "Lcom/discord/media_player/MediaSource;", "getMediaSource", "()Lcom/discord/media_player/MediaSource;", "setMediaSource", "(Lcom/discord/media_player/MediaSource;)V", "volumeListener", "", "getVolumeListener", "setVolumeListener", "bufferedPercentage", "currentPositionMs", "", "currentPositionPercentage", "durationMs", "hasEnded", "", "hasError", "isMuted", "isPlaying", "pause", "play", "preparePlayer", "autoPlayWhenReady", "loopMedia", "initialSeekPositionMs", "playerView", "Lcom/discord/media_player/MediaPlayerView;", "playerControlView", "Lcom/discord/media_player/MediaPlayerView$ControlView;", "reset", "seekTo", "positionMs", "setEvent", "event", "setVolume", "volume", "shouldPlay", "Companion", "Event", "Factory", "media_player_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaPlayer {
    private static final int BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 5000;
    private static final int BUFFER_FOR_PLAYBACK_MS = 2500;
    public static final Companion Companion = new Companion(null);
    private static final int MAX_BUFFER_MS = 30000;
    private static final int MIN_BUFFER_MS = 10000;
    private final DataSource.Factory dataSourceFactory;
    private Function1<? super Event, Unit> eventListener;
    private final SimpleExoPlayer exoPlayer;
    private MediaSource mediaSource;
    private Function1<? super Float, Unit> volumeListener;

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m14357d2 = {"Lcom/discord/media_player/MediaPlayer$Companion;", "", "()V", "BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS", "", "BUFFER_FOR_PLAYBACK_MS", "MAX_BUFFER_MS", "MIN_BUFFER_MS", "media_player_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, m14357d2 = {"Lcom/discord/media_player/MediaPlayer$Event;", "", "()V", "BufferEnd", "BufferStart", "Paused", "PlaybackEnded", "PlaybackError", "StartedPlaying", "Lcom/discord/media_player/MediaPlayer$Event$BufferEnd;", "Lcom/discord/media_player/MediaPlayer$Event$BufferStart;", "Lcom/discord/media_player/MediaPlayer$Event$Paused;", "Lcom/discord/media_player/MediaPlayer$Event$PlaybackEnded;", "Lcom/discord/media_player/MediaPlayer$Event$PlaybackError;", "Lcom/discord/media_player/MediaPlayer$Event$StartedPlaying;", "media_player_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static abstract class Event {

        @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m14357d2 = {"Lcom/discord/media_player/MediaPlayer$Event$BufferEnd;", "Lcom/discord/media_player/MediaPlayer$Event;", "()V", "media_player_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class BufferEnd extends Event {
            public static final BufferEnd INSTANCE = new BufferEnd();

            private BufferEnd() {
                super(null);
            }
        }

        @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m14357d2 = {"Lcom/discord/media_player/MediaPlayer$Event$BufferStart;", "Lcom/discord/media_player/MediaPlayer$Event;", "()V", "media_player_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class BufferStart extends Event {
            public static final BufferStart INSTANCE = new BufferStart();

            private BufferStart() {
                super(null);
            }
        }

        @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m14357d2 = {"Lcom/discord/media_player/MediaPlayer$Event$Paused;", "Lcom/discord/media_player/MediaPlayer$Event;", "()V", "media_player_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class Paused extends Event {
            public static final Paused INSTANCE = new Paused();

            private Paused() {
                super(null);
            }
        }

        @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m14357d2 = {"Lcom/discord/media_player/MediaPlayer$Event$PlaybackEnded;", "Lcom/discord/media_player/MediaPlayer$Event;", "()V", "media_player_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class PlaybackEnded extends Event {
            public static final PlaybackEnded INSTANCE = new PlaybackEnded();

            private PlaybackEnded() {
                super(null);
            }
        }

        @Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m14357d2 = {"Lcom/discord/media_player/MediaPlayer$Event$PlaybackError;", "Lcom/discord/media_player/MediaPlayer$Event;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "media_player_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class PlaybackError extends Event {
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlaybackError(Exception exception) {
                super(null);
                C9612q.m13917h(exception, "exception");
                this.exception = exception;
            }

            public static /* synthetic */ PlaybackError copy$default(PlaybackError playbackError, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = playbackError.exception;
                }
                return playbackError.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final PlaybackError copy(Exception exception) {
                C9612q.m13917h(exception, "exception");
                return new PlaybackError(exception);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PlaybackError) && C9612q.m13922c(this.exception, ((PlaybackError) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                Exception exc = this.exception;
                return "PlaybackError(exception=" + exc + ")";
            }
        }

        @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m14357d2 = {"Lcom/discord/media_player/MediaPlayer$Event$StartedPlaying;", "Lcom/discord/media_player/MediaPlayer$Event;", "()V", "media_player_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class StartedPlaying extends Event {
            public static final StartedPlaying INSTANCE = new StartedPlaying();

            private StartedPlaying() {
                super(null);
            }
        }

        private Event() {
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/media_player/MediaPlayer$Factory;", "", "()V", "create", "Lcom/discord/media_player/MediaPlayer;", "context", "Landroid/content/Context;", "media_player_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Factory {
        public static final Factory INSTANCE = new Factory();

        private Factory() {
        }

        public final MediaPlayer create(Context context) {
            C9612q.m13917h(context, "context");
            C7392d m20774a = new C7392d.C7393a().m20771d(MediaPlayer.MIN_BUFFER_MS, MediaPlayer.MAX_BUFFER_MS, MediaPlayer.BUFFER_FOR_PLAYBACK_MS, MediaPlayer.BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS).m20774a();
            C9612q.m13918g(m20774a, "Builder()\n              …\n                .build()");
            SimpleExoPlayer m29746w = new SimpleExoPlayer.C4375b(context).m29744y(m20774a).m29746w();
            C9612q.m13918g(m29746w, "Builder(context)\n       …\n                .build()");
            return new MediaPlayer(m29746w, CacheDataSourceFactory.Companion.getInstance());
        }
    }

    public MediaPlayer(SimpleExoPlayer exoPlayer, DataSource.Factory dataSourceFactory) {
        C9612q.m13917h(exoPlayer, "exoPlayer");
        C9612q.m13917h(dataSourceFactory, "dataSourceFactory");
        this.exoPlayer = exoPlayer;
        this.dataSourceFactory = dataSourceFactory;
        this.eventListener = MediaPlayer$eventListener$1.INSTANCE;
        this.volumeListener = MediaPlayer$volumeListener$1.INSTANCE;
        exoPlayer.mo29514K(new Player.InterfaceC4371a() { // from class: com.discord.media_player.MediaPlayer.1
            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            public /* bridge */ /* synthetic */ void onEvents(Player player, Player.Events events) {
                C7404o.m20747a(this, player, events);
            }

            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            public /* bridge */ /* synthetic */ void onExperimentalOffloadSchedulingEnabledChanged(boolean z) {
                C7404o.m20746b(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            public /* bridge */ /* synthetic */ void onExperimentalSleepingForOffloadChanged(boolean z) {
                C7404o.m20745c(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
                C7404o.m20744d(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            public void onIsPlayingChanged(boolean z) {
                C7404o.m20743e(this, z);
                if (z) {
                    MediaPlayer.this.setEvent(Event.StartedPlaying.INSTANCE);
                } else if (MediaPlayer.this.exoPlayer.mo29505P() != 4) {
                    MediaPlayer.this.setEvent(Event.Paused.INSTANCE);
                }
            }

            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
                C7404o.m20742f(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            public /* bridge */ /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
                C7404o.m20741g(this, mediaItem, i);
            }

            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
                C7404o.m20740h(this, z, i);
            }

            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
                C7404o.m20739i(this, playbackParameters);
            }

            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            public void onPlaybackStateChanged(int i) {
                C7404o.m20738j(this, i);
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            MediaPlayer.this.setEvent(Event.PlaybackEnded.INSTANCE);
                            return;
                        }
                        return;
                    }
                    MediaPlayer.this.setEvent(Event.BufferEnd.INSTANCE);
                    return;
                }
                MediaPlayer.this.setEvent(Event.BufferStart.INSTANCE);
            }

            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
                C7404o.m20737k(this, i);
            }

            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            public void onPlayerError(ExoPlaybackException error) {
                String str;
                C9612q.m13917h(error, "error");
                C7404o.m20736l(this, error);
                MediaPlayer.this.setEvent(new Event.PlaybackError(error));
                Log log = Log.INSTANCE;
                String simpleName = C32901.class.getSimpleName();
                C9612q.m13918g(simpleName, "javaClass.simpleName");
                MediaSource mediaSource = MediaPlayer.this.getMediaSource();
                if (mediaSource != null) {
                    str = mediaSource.getFeatureTag();
                } else {
                    str = null;
                }
                log.m31912e(simpleName, "Playback error for feature: " + str, error);
            }

            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            @Deprecated
            public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
                C7404o.m20735m(this, z, i);
            }

            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
                C7404o.m20734n(this, i);
            }

            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
                C7404o.m20733o(this, i);
            }

            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            @Deprecated
            public /* bridge */ /* synthetic */ void onSeekProcessed() {
                C7404o.m20732p(this);
            }

            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
                C7404o.m20731q(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            public /* bridge */ /* synthetic */ void onStaticMetadataChanged(List list) {
                C7404o.m20730r(this, list);
            }

            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
                C7404o.m20729s(this, timeline, i);
            }

            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            @Deprecated
            public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, Object obj, int i) {
                C7404o.m20728t(this, timeline, obj, i);
            }

            @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
            public /* bridge */ /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
                C7404o.m20727u(this, trackGroupArray, trackSelectionArray);
            }
        });
        exoPlayer.m29836E0(new AnalyticsListener() { // from class: com.discord.media_player.MediaPlayer.2
            public /* bridge */ /* synthetic */ void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
                C8809d1.m17193a(this, eventTime, audioAttributes);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
                C8809d1.m17191b(this, eventTime, str, j);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
                C8809d1.m17189c(this, eventTime, str);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
                C8809d1.m17187d(this, eventTime, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
                C8809d1.m17185e(this, eventTime, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            @Deprecated
            public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format) {
                C8809d1.m17183f(this, eventTime, format);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
                C8809d1.m17181g(this, eventTime, format, decoderReuseEvaluation);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onAudioPositionAdvancing(AnalyticsListener.EventTime eventTime, long j) {
                C8809d1.m17179h(this, eventTime, j);
            }

            public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(AnalyticsListener.EventTime eventTime, int i) {
                C8809d1.m17178i(this, eventTime, i);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onAudioSinkError(AnalyticsListener.EventTime eventTime, Exception exc) {
                C8809d1.m17177j(this, eventTime, exc);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
                C8809d1.m17176k(this, eventTime, i, j, j2);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
                C8809d1.m17175l(this, eventTime, i, j, j2);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            @Deprecated
            public /* bridge */ /* synthetic */ void onDecoderDisabled(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
                C8809d1.m17174m(this, eventTime, i, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            @Deprecated
            public /* bridge */ /* synthetic */ void onDecoderEnabled(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
                C8809d1.m17173n(this, eventTime, i, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            @Deprecated
            public /* bridge */ /* synthetic */ void onDecoderInitialized(AnalyticsListener.EventTime eventTime, int i, String str, long j) {
                C8809d1.m17172o(this, eventTime, i, str, j);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            @Deprecated
            public /* bridge */ /* synthetic */ void onDecoderInputFormatChanged(AnalyticsListener.EventTime eventTime, int i, Format format) {
                C8809d1.m17171p(this, eventTime, i, format);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
                C8809d1.m17170q(this, eventTime, mediaLoadData);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
                C8809d1.m17169r(this, eventTime);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
                C8809d1.m17168s(this, eventTime);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
                C8809d1.m17167t(this, eventTime);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
                C8809d1.m17166u(this, eventTime);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
                C8809d1.m17165v(this, eventTime, exc);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
                C8809d1.m17164w(this, eventTime);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i, long j) {
                C8809d1.m17163x(this, eventTime, i, j);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onEvents(Player player, AnalyticsListener.Events events) {
                C8809d1.m17162y(this, player, events);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
                C8809d1.m17161z(this, eventTime, z);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
                C8809d1.m17219A(this, eventTime, z);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public void onLoadCanceled(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
                C9612q.m13917h(eventTime, "eventTime");
                C9612q.m13917h(loadEventInfo, "loadEventInfo");
                C9612q.m13917h(mediaLoadData, "mediaLoadData");
                if (loadEventInfo.f11752d.isEmpty()) {
                    return;
                }
                DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.Companion;
                companion.setMediaPlayerBytesReceived(companion.getMediaPlayerBytesReceived() + loadEventInfo.f11755g);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public void onLoadCompleted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
                C9612q.m13917h(eventTime, "eventTime");
                C9612q.m13917h(loadEventInfo, "loadEventInfo");
                C9612q.m13917h(mediaLoadData, "mediaLoadData");
                if (loadEventInfo.f11752d.isEmpty()) {
                    return;
                }
                DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.Companion;
                companion.setMediaPlayerBytesReceived(companion.getMediaPlayerBytesReceived() + loadEventInfo.f11755g);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException error, boolean z) {
                C9612q.m13917h(eventTime, "eventTime");
                C9612q.m13917h(loadEventInfo, "loadEventInfo");
                C9612q.m13917h(mediaLoadData, "mediaLoadData");
                C9612q.m13917h(error, "error");
                if (loadEventInfo.f11752d.isEmpty()) {
                    return;
                }
                DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.Companion;
                companion.setMediaPlayerBytesReceived(companion.getMediaPlayerBytesReceived() + loadEventInfo.f11755g);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
                C8809d1.m17218B(this, eventTime, loadEventInfo, mediaLoadData);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
                C8809d1.m17217C(this, eventTime, z);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onMediaItemTransition(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i) {
                C8809d1.m17216D(this, eventTime, mediaItem, i);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onMetadata(AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.metadata.Metadata metadata) {
                C8809d1.m17215E(this, eventTime, metadata);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
                C8809d1.m17214F(this, eventTime, z, i);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
                C8809d1.m17213G(this, eventTime, playbackParameters);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int i) {
                C8809d1.m17212H(this, eventTime, i);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i) {
                C8809d1.m17211I(this, eventTime, i);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onPlayerError(AnalyticsListener.EventTime eventTime, ExoPlaybackException exoPlaybackException) {
                C8809d1.m17210J(this, eventTime, exoPlaybackException);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onPlayerReleased(AnalyticsListener.EventTime eventTime) {
                C8809d1.m17209K(this, eventTime);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            @Deprecated
            public /* bridge */ /* synthetic */ void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
                C8809d1.m17208L(this, eventTime, z, i);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
                C8809d1.m17207M(this, eventTime, i);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Surface surface) {
                C8809d1.m17206N(this, eventTime, surface);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i) {
                C8809d1.m17205O(this, eventTime, i);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            @Deprecated
            public /* bridge */ /* synthetic */ void onSeekProcessed(AnalyticsListener.EventTime eventTime) {
                C8809d1.m17204P(this, eventTime);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onSeekStarted(AnalyticsListener.EventTime eventTime) {
                C8809d1.m17203Q(this, eventTime);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z) {
                C8809d1.m17202R(this, eventTime, z);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean z) {
                C8809d1.m17201S(this, eventTime, z);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onStaticMetadataChanged(AnalyticsListener.EventTime eventTime, List list) {
                C8809d1.m17200T(this, eventTime, list);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2) {
                C8809d1.m17199U(this, eventTime, i, i2);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i) {
                C8809d1.m17198V(this, eventTime, i);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onTracksChanged(AnalyticsListener.EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
                C8809d1.m17197W(this, eventTime, trackGroupArray, trackSelectionArray);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
                C8809d1.m17196X(this, eventTime, mediaLoadData);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
                C8809d1.m17195Y(this, eventTime, str, j);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
                C8809d1.m17194Z(this, eventTime, str);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
                C8809d1.m17192a0(this, eventTime, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
                C8809d1.m17190b0(this, eventTime, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onVideoFrameProcessingOffset(AnalyticsListener.EventTime eventTime, long j, int i) {
                C8809d1.m17188c0(this, eventTime, j, i);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            @Deprecated
            public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format) {
                C8809d1.m17186d0(this, eventTime, format);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
                C8809d1.m17184e0(this, eventTime, format, decoderReuseEvaluation);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
                C8809d1.m17182f0(this, eventTime, i, i2, i3, f);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f) {
                C8809d1.m17180g0(this, eventTime, f);
            }
        });
    }

    public final synchronized void setEvent(Event event) {
        this.eventListener.invoke(event);
    }

    public final float bufferedPercentage() {
        return this.exoPlayer.m29536Z() / 100.0f;
    }

    public final long currentPositionMs() {
        return this.exoPlayer.mo29491Y();
    }

    public final float currentPositionPercentage() {
        return ((float) currentPositionMs()) / ((float) durationMs());
    }

    public final long durationMs() {
        return this.exoPlayer.getDuration();
    }

    public final Function1<Event, Unit> getEventListener() {
        return this.eventListener;
    }

    public final MediaSource getMediaSource() {
        return this.mediaSource;
    }

    public final Function1<Float, Unit> getVolumeListener() {
        return this.volumeListener;
    }

    public final boolean hasEnded() {
        return this.exoPlayer.mo29505P() == 4;
    }

    public final boolean hasError() {
        return this.exoPlayer.mo29460m() != null;
    }

    public final boolean isMuted() {
        return this.exoPlayer.m29825N0() == 0.0f;
    }

    public final boolean isPlaying() {
        return this.exoPlayer.mo29538Q();
    }

    public final void pause() {
        this.exoPlayer.mo29457n(false);
    }

    public final void play() {
        this.exoPlayer.mo29457n(true);
    }

    public final void preparePlayer(MediaSource mediaSource, boolean z, boolean z2, long j, MediaPlayerView mediaPlayerView, MediaPlayerView.ControlView controlView) {
        C9612q.m13917h(mediaSource, "mediaSource");
        this.mediaSource = mediaSource;
        this.exoPlayer.m29808b1(1);
        C10306i0.C10308b c10308b = new C10306i0.C10308b(this.dataSourceFactory);
        String sourceUrl = mediaSource.getSourceUrl();
        C9612q.m13920e(sourceUrl);
        C10306i0 m11869c = c10308b.m11869c(MediaItem.m29855b(sourceUrl));
        C9612q.m13918g(m11869c, "Factory(dataSourceFactor…mediaSource.sourceUrl!!))");
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        simpleExoPlayer.m29813X0(m11869c);
        simpleExoPlayer.m29533c0(j);
        simpleExoPlayer.mo29501S(z2 ? 1 : 0);
        simpleExoPlayer.mo29485c();
        if (mediaPlayerView != null) {
            mediaPlayerView.setPlayer$media_player_release(this.exoPlayer);
        }
        if (controlView != null) {
            controlView.setPlayer$media_player_release(this.exoPlayer);
        }
        if (z) {
            play();
        }
    }

    public final void reset() {
        seekTo(0L);
        this.exoPlayer.mo29457n(false);
    }

    public final void seekTo(long j) {
        this.exoPlayer.m29533c0(j);
    }

    public final void setEventListener(Function1<? super Event, Unit> function1) {
        C9612q.m13917h(function1, "<set-?>");
        this.eventListener = function1;
    }

    public final void setMediaSource(MediaSource mediaSource) {
        this.mediaSource = mediaSource;
    }

    public final void setVolume(float f) {
        this.exoPlayer.m29803e1(f);
        this.volumeListener.invoke(Float.valueOf(f));
    }

    public final void setVolumeListener(Function1<? super Float, Unit> function1) {
        C9612q.m13917h(function1, "<set-?>");
        this.volumeListener = function1;
    }

    public final boolean shouldPlay() {
        return this.exoPlayer.mo29522F();
    }
}