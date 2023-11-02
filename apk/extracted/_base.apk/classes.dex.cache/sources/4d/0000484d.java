package org.webrtc;

import org.webrtc.VideoEncoder;

/* renamed from: org.webrtc.i1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final /* synthetic */ class C11310i1 {
    @CalledByNative
    /* renamed from: a */
    public static long m8303a(VideoEncoder videoEncoder) {
        return 0L;
    }

    @CalledByNative
    /* renamed from: b */
    public static VideoEncoder.EncoderInfo m8302b(VideoEncoder videoEncoder) {
        return new VideoEncoder.EncoderInfo(1, false);
    }

    @CalledByNative
    /* renamed from: c */
    public static VideoEncoder.ResolutionBitrateLimits[] m8301c(VideoEncoder videoEncoder) {
        return new VideoEncoder.ResolutionBitrateLimits[0];
    }

    @CalledByNative
    /* renamed from: d */
    public static boolean m8300d(VideoEncoder videoEncoder) {
        return true;
    }

    @CalledByNative
    /* renamed from: e */
    public static VideoCodecStatus m8299e(VideoEncoder videoEncoder, VideoEncoder.RateControlParameters rateControlParameters) {
        return videoEncoder.setRateAllocation(rateControlParameters.bitrate, (int) Math.ceil(rateControlParameters.framerateFps));
    }
}