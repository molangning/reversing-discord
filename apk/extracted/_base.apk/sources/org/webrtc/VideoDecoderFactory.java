package org.webrtc;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public interface VideoDecoderFactory {
    @CalledByNative
    VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo);

    @CalledByNative
    VideoCodecInfo[] getSupportedCodecs();
}
