package com.discord.media.engine;

import com.discord.p047native.engine.NativeEngine;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import org.webrtc.VideoFrame;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "videoFrame", "Lorg/webrtc/VideoFrame;", "onFrame"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class MediaEngine$setVideoOutputSink$1$1 implements NativeEngine.VideoFrameCallback {
    final /* synthetic */ Function1<VideoFrame, Boolean> $callback;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaEngine$setVideoOutputSink$1$1(Function1<? super VideoFrame, Boolean> function1) {
        this.$callback = function1;
    }

    @Override // com.discord.p047native.engine.NativeEngine.VideoFrameCallback
    public final boolean onFrame(VideoFrame videoFrame) {
        C9612q.m13917h(videoFrame, "videoFrame");
        return this.$callback.invoke(videoFrame).booleanValue();
    }
}
