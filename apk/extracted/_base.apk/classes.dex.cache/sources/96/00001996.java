package com.discord.media.engine.video;

import com.discord.media.engine.video.AttachedVideoSinks;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;
import org.webrtc.VideoFrame;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public /* synthetic */ class AttachedVideoSinks$addSink$1 extends C9609n implements Function1<VideoFrame, Boolean> {
    public AttachedVideoSinks$addSink$1(Object obj) {
        super(1, obj, AttachedVideoSinks.VideoOutputSinks.class, "onFrame", "onFrame(Lorg/webrtc/VideoFrame;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(VideoFrame p0) {
        C9612q.m13917h(p0, "p0");
        return Boolean.valueOf(((AttachedVideoSinks.VideoOutputSinks) this.receiver).onFrame(p0));
    }
}