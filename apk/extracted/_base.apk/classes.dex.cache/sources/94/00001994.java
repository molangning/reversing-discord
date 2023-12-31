package com.discord.media.engine.video;

import com.discord.media.engine.MediaEngine;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0006J\u001e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J \u0010\u0013\u001a\u00020\u00072\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m14357d2 = {"Lcom/discord/media/engine/video/AttachedVideoSinks;", "", "()V", "activeSinksChangeCallback", "Lkotlin/Function2;", "", "", "", "streamOutputMap", "", "Lcom/discord/media/engine/video/AttachedVideoSinks$VideoOutputSinks;", "addSink", "mediaEngine", "Lcom/discord/media/engine/MediaEngine;", "sink", "Lorg/webrtc/VideoSink;", "streamId", "anySinksActive", "removeSink", "setActiveSinksChangeCallback", "callback", "VideoOutputSinks", "media_engine_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class AttachedVideoSinks {
    private static Function2<? super String, ? super Boolean, Unit> activeSinksChangeCallback;
    public static final AttachedVideoSinks INSTANCE = new AttachedVideoSinks();
    private static Map<String, VideoOutputSinks> streamOutputMap = new LinkedHashMap();

    @Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m14357d2 = {"Lcom/discord/media/engine/video/AttachedVideoSinks$VideoOutputSinks;", "", "sink", "Lorg/webrtc/VideoSink;", "(Lorg/webrtc/VideoSink;)V", "sinks", "", "add", "", "isEmpty", "onFrame", "frame", "Lorg/webrtc/VideoFrame;", "remove", "media_engine_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class VideoOutputSinks {
        private final Set<VideoSink> sinks;

        public VideoOutputSinks(VideoSink sink) {
            Set<VideoSink> m14004g;
            C9612q.m13917h(sink, "sink");
            m14004g = C9560w.m14004g(sink);
            this.sinks = m14004g;
        }

        public final synchronized boolean add(VideoSink sink) {
            C9612q.m13917h(sink, "sink");
            return this.sinks.add(sink);
        }

        public final synchronized boolean isEmpty() {
            return this.sinks.isEmpty();
        }

        public final synchronized boolean onFrame(VideoFrame frame) {
            C9612q.m13917h(frame, "frame");
            for (VideoSink videoSink : this.sinks) {
                videoSink.onFrame(frame);
            }
            frame.release();
            return true;
        }

        public final synchronized boolean remove(VideoSink sink) {
            C9612q.m13917h(sink, "sink");
            return this.sinks.remove(sink);
        }
    }

    private AttachedVideoSinks() {
    }

    public final synchronized void addSink(MediaEngine mediaEngine, VideoSink sink, String streamId) {
        C9612q.m13917h(mediaEngine, "mediaEngine");
        C9612q.m13917h(sink, "sink");
        C9612q.m13917h(streamId, "streamId");
        VideoOutputSinks videoOutputSinks = streamOutputMap.get(streamId);
        if (videoOutputSinks != null) {
            videoOutputSinks.add(sink);
        } else {
            VideoOutputSinks videoOutputSinks2 = new VideoOutputSinks(sink);
            streamOutputMap.put(streamId, videoOutputSinks2);
            mediaEngine.setVideoOutputSink$media_engine_release(streamId, new AttachedVideoSinks$addSink$1(videoOutputSinks2));
            Function2<? super String, ? super Boolean, Unit> function2 = activeSinksChangeCallback;
            if (function2 != null) {
                function2.invoke(streamId, Boolean.TRUE);
            }
        }
    }

    public final synchronized boolean anySinksActive() {
        return !streamOutputMap.isEmpty();
    }

    public final synchronized void removeSink(MediaEngine mediaEngine, VideoSink sink, String streamId) {
        C9612q.m13917h(mediaEngine, "mediaEngine");
        C9612q.m13917h(sink, "sink");
        C9612q.m13917h(streamId, "streamId");
        VideoOutputSinks videoOutputSinks = streamOutputMap.get(streamId);
        if (videoOutputSinks == null) {
            return;
        }
        synchronized (videoOutputSinks) {
            videoOutputSinks.remove(sink);
            if (videoOutputSinks.isEmpty()) {
                mediaEngine.setVideoOutputSink$media_engine_release(streamId, null);
                streamOutputMap.remove(streamId);
                Function2<? super String, ? super Boolean, Unit> function2 = activeSinksChangeCallback;
                if (function2 != null) {
                    function2.invoke(streamId, Boolean.FALSE);
                }
            }
            Unit unit = Unit.f25302a;
        }
    }

    public final synchronized void setActiveSinksChangeCallback(Function2<? super String, ? super Boolean, Unit> callback) {
        C9612q.m13917h(callback, "callback");
        activeSinksChangeCallback = callback;
    }
}