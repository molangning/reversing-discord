package org.webrtc;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public interface VideoDecoder {

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface Callback {
        void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2);
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        public DecodeInfo(boolean z, long j) {
            this.isMissingFrames = z;
            this.renderTimeMs = j;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class Settings {
        public final int height;
        public final int numberOfCores;
        public final int width;

        @CalledByNative("Settings")
        public Settings(int i, int i2, int i3) {
            this.numberOfCores = i;
            this.width = i2;
            this.height = i3;
        }
    }

    @CalledByNative
    long createNativeVideoDecoder();

    @CalledByNative
    VideoCodecStatus decode(EncodedImage encodedImage, DecodeInfo decodeInfo);

    @CalledByNative
    String getImplementationName();

    @CalledByNative
    VideoCodecStatus initDecode(Settings settings, Callback callback);

    @CalledByNative
    VideoCodecStatus release();
}
