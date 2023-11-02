package org.webrtc;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public interface VideoEncoderFactory {

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface VideoEncoderSelector {
        @CalledByNative("VideoEncoderSelector")
        VideoCodecInfo onAvailableBitrate(int i);

        @CalledByNative("VideoEncoderSelector")
        void onCurrentEncoder(VideoCodecInfo videoCodecInfo);

        @CalledByNative("VideoEncoderSelector")
        VideoCodecInfo onEncoderBroken();

        @CalledByNative("VideoEncoderSelector")
        VideoCodecInfo onResolutionChange(int i, int i2);
    }

    @CalledByNative
    VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo);

    @CalledByNative
    VideoEncoderSelector getEncoderSelector();

    @CalledByNative
    VideoCodecInfo[] getImplementations();

    @CalledByNative
    VideoCodecInfo[] getSupportedCodecs();
}