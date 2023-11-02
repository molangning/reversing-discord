package org.webrtc;

import org.webrtc.VideoDecoder;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class VideoDecoderWrapper {
    VideoDecoderWrapper() {
    }

    @CalledByNative
    static VideoDecoder.Callback createDecoderCallback(final long j) {
        return new VideoDecoder.Callback() { // from class: org.webrtc.h1
            @Override // org.webrtc.VideoDecoder.Callback
            public final void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
                VideoDecoderWrapper.nativeOnDecodedFrame(j, videoFrame, num, num2);
            }
        };
    }

    public static native void nativeOnDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2);
}