package org.webrtc;

import org.webrtc.EncodedImage;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public interface VideoEncoder {

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class BitrateAllocation {
        public final int[][] bitratesBbs;

        @CalledByNative("BitrateAllocation")
        public BitrateAllocation(int[][] iArr) {
            this.bitratesBbs = iArr;
        }

        public int getSum() {
            int[][] iArr;
            int i = 0;
            for (int[] iArr2 : this.bitratesBbs) {
                for (int i2 : iArr2) {
                    i += i2;
                }
            }
            return i;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface Callback {
        void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo);
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class Capabilities {
        public final boolean lossNotification;

        @CalledByNative("Capabilities")
        public Capabilities(boolean z) {
            this.lossNotification = z;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class CodecSpecificInfo {
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class CodecSpecificInfoAV1 extends CodecSpecificInfo {
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class CodecSpecificInfoH264 extends CodecSpecificInfo {
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class CodecSpecificInfoVP8 extends CodecSpecificInfo {
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class CodecSpecificInfoVP9 extends CodecSpecificInfo {
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class EncodeInfo {
        public final EncodedImage.FrameType[] frameTypes;

        @CalledByNative("EncodeInfo")
        public EncodeInfo(EncodedImage.FrameType[] frameTypeArr) {
            this.frameTypes = frameTypeArr;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class EncoderInfo {
        public final boolean applyAlignmentToAllSimulcastLayers;
        public final int requestedResolutionAlignment;

        public EncoderInfo(int i, boolean z) {
            this.requestedResolutionAlignment = i;
            this.applyAlignmentToAllSimulcastLayers = z;
        }

        @CalledByNative("EncoderInfo")
        public boolean getApplyAlignmentToAllSimulcastLayers() {
            return this.applyAlignmentToAllSimulcastLayers;
        }

        @CalledByNative("EncoderInfo")
        public int getRequestedResolutionAlignment() {
            return this.requestedResolutionAlignment;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class RateControlParameters {
        public final BitrateAllocation bitrate;
        public final double framerateFps;

        @CalledByNative("RateControlParameters")
        public RateControlParameters(BitrateAllocation bitrateAllocation, double d) {
            this.bitrate = bitrateAllocation;
            this.framerateFps = d;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class ResolutionBitrateLimits {
        public final int frameSizePixels;
        public final int maxBitrateBps;
        public final int minBitrateBps;
        public final int minStartBitrateBps;

        public ResolutionBitrateLimits(int i, int i2, int i3, int i4) {
            this.frameSizePixels = i;
            this.minStartBitrateBps = i2;
            this.minBitrateBps = i3;
            this.maxBitrateBps = i4;
        }

        @CalledByNative("ResolutionBitrateLimits")
        public int getFrameSizePixels() {
            return this.frameSizePixels;
        }

        @CalledByNative("ResolutionBitrateLimits")
        public int getMaxBitrateBps() {
            return this.maxBitrateBps;
        }

        @CalledByNative("ResolutionBitrateLimits")
        public int getMinBitrateBps() {
            return this.minBitrateBps;
        }

        @CalledByNative("ResolutionBitrateLimits")
        public int getMinStartBitrateBps() {
            return this.minStartBitrateBps;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class Settings {
        public final boolean automaticResizeOn;
        public final Capabilities capabilities;
        public final int height;
        public final int maxFramerate;
        public final int numberOfCores;
        public final int numberOfSimulcastStreams;
        public final int startBitrate;
        public final int width;

        @Deprecated
        public Settings(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
            this(i, i2, i3, i4, i5, i6, z, new Capabilities(false));
        }

        @CalledByNative("Settings")
        public Settings(int i, int i2, int i3, int i4, int i5, int i6, boolean z, Capabilities capabilities) {
            this.numberOfCores = i;
            this.width = i2;
            this.height = i3;
            this.startBitrate = i4;
            this.maxFramerate = i5;
            this.numberOfSimulcastStreams = i6;
            this.automaticResizeOn = z;
            this.capabilities = capabilities;
        }
    }

    @CalledByNative
    long createNativeVideoEncoder();

    @CalledByNative
    VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo);

    @CalledByNative
    EncoderInfo getEncoderInfo();

    @CalledByNative
    String getImplementationName();

    @CalledByNative
    ResolutionBitrateLimits[] getResolutionBitrateLimits();

    @CalledByNative
    ScalingSettings getScalingSettings();

    @CalledByNative
    VideoCodecStatus initEncode(Settings settings, Callback callback);

    @CalledByNative
    boolean isHardwareEncoder();

    @CalledByNative
    VideoCodecStatus release();

    VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i);

    @CalledByNative
    VideoCodecStatus setRates(RateControlParameters rateControlParameters);

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();
        public final Integer high;
        public final Integer low;

        /* renamed from: on */
        public final boolean f29511on;

        public ScalingSettings(int i, int i2) {
            this.f29511on = true;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }

        public String toString() {
            if (this.f29511on) {
                Integer num = this.low;
                Integer num2 = this.high;
                return "[ " + num + ", " + num2 + " ]";
            }
            return "OFF";
        }

        private ScalingSettings() {
            this.f29511on = false;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z) {
            this.f29511on = z;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z, int i, int i2) {
            this.f29511on = z;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }
    }
}