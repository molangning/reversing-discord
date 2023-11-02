package org.webrtc;

import org.webrtc.VideoProcessor;

/* renamed from: org.webrtc.u1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final /* synthetic */ class C11346u1 {
    /* renamed from: a */
    public static void m8271a(VideoProcessor videoProcessor, VideoFrame videoFrame, VideoProcessor.FrameAdaptationParameters frameAdaptationParameters) {
        VideoFrame m8270b = m8270b(videoFrame, frameAdaptationParameters);
        if (m8270b != null) {
            videoProcessor.onFrameCaptured(m8270b);
            m8270b.release();
        }
    }

    /* renamed from: b */
    public static VideoFrame m8270b(VideoFrame videoFrame, VideoProcessor.FrameAdaptationParameters frameAdaptationParameters) {
        if (frameAdaptationParameters.drop) {
            return null;
        }
        return new VideoFrame(videoFrame.getBuffer().cropAndScale(frameAdaptationParameters.cropX, frameAdaptationParameters.cropY, frameAdaptationParameters.cropWidth, frameAdaptationParameters.cropHeight, frameAdaptationParameters.scaleWidth, frameAdaptationParameters.scaleHeight), videoFrame.getRotation(), frameAdaptationParameters.timestampNs);
    }
}