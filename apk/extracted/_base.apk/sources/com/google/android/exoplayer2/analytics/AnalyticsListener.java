package com.google.android.exoplayer2.analytics;

import android.util.SparseArray;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.io.IOException;
import java.util.List;
import p102fb.C6377g;
import p195k8.C9149a;
import p195k8.C9203v;
import p229m7.InterfaceC10341s;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface AnalyticsListener {

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class EventTime {

        /* renamed from: a */
        public final long f11400a;

        /* renamed from: b */
        public final Timeline f11401b;

        /* renamed from: c */
        public final int f11402c;

        /* renamed from: d */
        public final InterfaceC10341s.C10342a f11403d;

        /* renamed from: e */
        public final long f11404e;

        /* renamed from: f */
        public final Timeline f11405f;

        /* renamed from: g */
        public final int f11406g;

        /* renamed from: h */
        public final InterfaceC10341s.C10342a f11407h;

        /* renamed from: i */
        public final long f11408i;

        /* renamed from: j */
        public final long f11409j;

        public EventTime(long j, Timeline timeline, int i, InterfaceC10341s.C10342a c10342a, long j2, Timeline timeline2, int i2, InterfaceC10341s.C10342a c10342a2, long j3, long j4) {
            this.f11400a = j;
            this.f11401b = timeline;
            this.f11402c = i;
            this.f11403d = c10342a;
            this.f11404e = j2;
            this.f11405f = timeline2;
            this.f11406g = i2;
            this.f11407h = c10342a2;
            this.f11408i = j3;
            this.f11409j = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTime.class != obj.getClass()) {
                return false;
            }
            EventTime eventTime = (EventTime) obj;
            if (this.f11400a == eventTime.f11400a && this.f11402c == eventTime.f11402c && this.f11404e == eventTime.f11404e && this.f11406g == eventTime.f11406g && this.f11408i == eventTime.f11408i && this.f11409j == eventTime.f11409j && C6377g.m22845a(this.f11401b, eventTime.f11401b) && C6377g.m22845a(this.f11403d, eventTime.f11403d) && C6377g.m22845a(this.f11405f, eventTime.f11405f) && C6377g.m22845a(this.f11407h, eventTime.f11407h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C6377g.m22844b(Long.valueOf(this.f11400a), this.f11401b, Integer.valueOf(this.f11402c), this.f11403d, Long.valueOf(this.f11404e), this.f11405f, Integer.valueOf(this.f11406g), this.f11407h, Long.valueOf(this.f11408i), Long.valueOf(this.f11409j));
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Events extends C9203v {

        /* renamed from: b */
        private final SparseArray<EventTime> f11410b = new SparseArray<>(0);

        @Override // p195k8.C9203v
        /* renamed from: b */
        public boolean mo16148b(int i) {
            return super.mo16148b(i);
        }

        @Override // p195k8.C9203v
        /* renamed from: d */
        public int mo16146d(int i) {
            return super.mo16146d(i);
        }

        /* renamed from: f */
        public void m29707f(SparseArray<EventTime> sparseArray) {
            this.f11410b.clear();
            for (int i = 0; i < m16145e(); i++) {
                int mo16146d = mo16146d(i);
                this.f11410b.append(mo16146d, (EventTime) C9149a.m16448e(sparseArray.get(mo16146d)));
            }
        }
    }

    void onAudioDecoderInitialized(EventTime eventTime, String str, long j);

    void onAudioDecoderReleased(EventTime eventTime, String str);

    void onAudioDisabled(EventTime eventTime, DecoderCounters decoderCounters);

    void onAudioEnabled(EventTime eventTime, DecoderCounters decoderCounters);

    @Deprecated
    void onAudioInputFormatChanged(EventTime eventTime, Format format);

    void onAudioInputFormatChanged(EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation);

    void onAudioPositionAdvancing(EventTime eventTime, long j);

    void onAudioSinkError(EventTime eventTime, Exception exc);

    void onAudioUnderrun(EventTime eventTime, int i, long j, long j2);

    void onBandwidthEstimate(EventTime eventTime, int i, long j, long j2);

    @Deprecated
    void onDecoderDisabled(EventTime eventTime, int i, DecoderCounters decoderCounters);

    @Deprecated
    void onDecoderEnabled(EventTime eventTime, int i, DecoderCounters decoderCounters);

    @Deprecated
    void onDecoderInitialized(EventTime eventTime, int i, String str, long j);

    @Deprecated
    void onDecoderInputFormatChanged(EventTime eventTime, int i, Format format);

    void onDownstreamFormatChanged(EventTime eventTime, MediaLoadData mediaLoadData);

    void onDrmKeysLoaded(EventTime eventTime);

    void onDrmKeysRemoved(EventTime eventTime);

    void onDrmKeysRestored(EventTime eventTime);

    void onDrmSessionAcquired(EventTime eventTime);

    void onDrmSessionManagerError(EventTime eventTime, Exception exc);

    void onDrmSessionReleased(EventTime eventTime);

    void onDroppedVideoFrames(EventTime eventTime, int i, long j);

    void onEvents(Player player, Events events);

    void onIsLoadingChanged(EventTime eventTime, boolean z);

    void onIsPlayingChanged(EventTime eventTime, boolean z);

    void onLoadCanceled(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadCompleted(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadError(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z);

    void onLoadStarted(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    @Deprecated
    void onLoadingChanged(EventTime eventTime, boolean z);

    void onMediaItemTransition(EventTime eventTime, MediaItem mediaItem, int i);

    void onMetadata(EventTime eventTime, Metadata metadata);

    void onPlayWhenReadyChanged(EventTime eventTime, boolean z, int i);

    void onPlaybackParametersChanged(EventTime eventTime, PlaybackParameters playbackParameters);

    void onPlaybackStateChanged(EventTime eventTime, int i);

    void onPlaybackSuppressionReasonChanged(EventTime eventTime, int i);

    void onPlayerError(EventTime eventTime, ExoPlaybackException exoPlaybackException);

    void onPlayerReleased(EventTime eventTime);

    @Deprecated
    void onPlayerStateChanged(EventTime eventTime, boolean z, int i);

    void onPositionDiscontinuity(EventTime eventTime, int i);

    void onRenderedFirstFrame(EventTime eventTime, Surface surface);

    void onRepeatModeChanged(EventTime eventTime, int i);

    @Deprecated
    void onSeekProcessed(EventTime eventTime);

    void onSeekStarted(EventTime eventTime);

    void onShuffleModeChanged(EventTime eventTime, boolean z);

    void onSkipSilenceEnabledChanged(EventTime eventTime, boolean z);

    void onStaticMetadataChanged(EventTime eventTime, List<Metadata> list);

    void onSurfaceSizeChanged(EventTime eventTime, int i, int i2);

    void onTimelineChanged(EventTime eventTime, int i);

    void onTracksChanged(EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray);

    void onUpstreamDiscarded(EventTime eventTime, MediaLoadData mediaLoadData);

    void onVideoDecoderInitialized(EventTime eventTime, String str, long j);

    void onVideoDecoderReleased(EventTime eventTime, String str);

    void onVideoDisabled(EventTime eventTime, DecoderCounters decoderCounters);

    void onVideoEnabled(EventTime eventTime, DecoderCounters decoderCounters);

    void onVideoFrameProcessingOffset(EventTime eventTime, long j, int i);

    @Deprecated
    void onVideoInputFormatChanged(EventTime eventTime, Format format);

    void onVideoInputFormatChanged(EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation);

    void onVideoSizeChanged(EventTime eventTime, int i, int i2, int i3, float f);

    void onVolumeChanged(EventTime eventTime, float f);
}
