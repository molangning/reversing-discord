package org.webrtc;

import org.webrtc.VideoEncoder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class VideoEncoderWrapper {
    VideoEncoderWrapper() {
    }

    @CalledByNative
    static VideoEncoder.Callback createEncoderCallback(final long j) {
        return new VideoEncoder.Callback() { // from class: org.webrtc.l1
            @Override // org.webrtc.VideoEncoder.Callback
            public final void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
                VideoEncoderWrapper.nativeOnEncodedFrame(j, encodedImage);
            }
        };
    }

    @CalledByNative
    static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    @CalledByNative
    static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    @CalledByNative
    static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.f29511on;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnEncodedFrame(long j, EncodedImage encodedImage);
}
