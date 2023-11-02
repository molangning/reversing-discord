package co.discord.media_engine;

import android.content.Context;
import android.util.AttributeSet;
import co.discord.media_engine.VideoStreamRenderer;
import com.hammerandchisel.libdiscord.Discord;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9553r;
import kotlin.collections.C9560w;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.VideoFrame;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J&\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m14357d2 = {"Lco/discord/media_engine/VideoStreamRenderer;", "Lorg/webrtc/SurfaceViewRenderer;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "streamIdentifier", "", "attachToStream", "", "discord", "Lcom/hammerandchisel/libdiscord/Discord;", "streamId", "events", "Lorg/webrtc/RendererCommon$RendererEvents;", "Muxer", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class VideoStreamRenderer extends SurfaceViewRenderer {
    private static final Muxer Muxer = new Muxer(null);
    @Deprecated
    private static Map<String, Set<VideoStreamRenderer>> streams = new LinkedHashMap();
    private String streamIdentifier;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005J\u001e\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m14357d2 = {"Lco/discord/media_engine/VideoStreamRenderer$Muxer;", "", "()V", "streams", "", "", "", "Lco/discord/media_engine/VideoStreamRenderer;", "addSink", "", "discord", "Lcom/hammerandchisel/libdiscord/Discord;", "sink", "streamId", "removeSink", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class Muxer {
        private Muxer() {
        }

        public /* synthetic */ Muxer(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean addSink$lambda$6$lambda$5(Set sinks, VideoFrame frame) {
            Object m14055U;
            C9612q.m13917h(sinks, "$sinks");
            C9612q.m13917h(frame, "frame");
            synchronized (sinks) {
                m14055U = C9553r.m14055U(sinks);
                VideoStreamRenderer videoStreamRenderer = (VideoStreamRenderer) m14055U;
                if (videoStreamRenderer != null) {
                    videoStreamRenderer.onFrame(frame);
                }
                frame.release();
            }
            return true;
        }

        public final void addSink(Discord discord, VideoStreamRenderer sink, String streamId) {
            final Set m14004g;
            C9612q.m13917h(discord, "discord");
            C9612q.m13917h(sink, "sink");
            C9612q.m13917h(streamId, "streamId");
            synchronized (VideoStreamRenderer.streams) {
                Set set = (Set) VideoStreamRenderer.streams.get(streamId);
                if (set != null) {
                    synchronized (set) {
                        set.add(sink);
                    }
                } else {
                    m14004g = C9560w.m14004g(sink);
                    discord.setVideoOutputSink(streamId, new Discord.VideoFrameCallback() { // from class: co.discord.media_engine.d
                        @Override // com.hammerandchisel.libdiscord.Discord.VideoFrameCallback
                        public final boolean onFrame(VideoFrame videoFrame) {
                            boolean addSink$lambda$6$lambda$5;
                            addSink$lambda$6$lambda$5 = VideoStreamRenderer.Muxer.addSink$lambda$6$lambda$5(m14004g, videoFrame);
                            return addSink$lambda$6$lambda$5;
                        }
                    });
                    VideoStreamRenderer.streams.put(streamId, m14004g);
                    Unit unit = Unit.f25302a;
                }
            }
        }

        public final void removeSink(Discord discord, VideoStreamRenderer sink, String streamId) {
            C9612q.m13917h(discord, "discord");
            C9612q.m13917h(sink, "sink");
            C9612q.m13917h(streamId, "streamId");
            synchronized (VideoStreamRenderer.streams) {
                Set set = (Set) VideoStreamRenderer.streams.get(streamId);
                if (set != null) {
                    synchronized (set) {
                        set.remove(sink);
                        if (set.isEmpty()) {
                            discord.setVideoOutputSink(streamId, null);
                            VideoStreamRenderer.streams.remove(streamId);
                        }
                        Unit unit = Unit.f25302a;
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoStreamRenderer(Context ctx) {
        super(ctx);
        C9612q.m13917h(ctx, "ctx");
        this.streamIdentifier = "";
    }

    public static /* synthetic */ void attachToStream$default(VideoStreamRenderer videoStreamRenderer, Discord discord, String str, RendererCommon.RendererEvents rendererEvents, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: attachToStream");
        }
        if ((i & 4) != 0) {
            rendererEvents = null;
        }
        videoStreamRenderer.attachToStream(discord, str, rendererEvents);
    }

    public final void attachToStream(Discord discord, String str, RendererCommon.RendererEvents rendererEvents) {
        boolean z;
        if (discord == null) {
            return;
        }
        boolean z2 = true;
        if (this.streamIdentifier.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            super.clearImage();
            super.release();
            Muxer.removeSink(discord, this, this.streamIdentifier);
        }
        if (str == null) {
            str = "";
        }
        this.streamIdentifier = str;
        if (str.length() != 0) {
            z2 = false;
        }
        if (!z2) {
            super.init(SharedEglBaseContext.getEglContext(), rendererEvents);
            Muxer.addSink(discord, this, this.streamIdentifier);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoStreamRenderer(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
        C9612q.m13917h(ctx, "ctx");
        C9612q.m13917h(attrs, "attrs");
        this.streamIdentifier = "";
    }
}
