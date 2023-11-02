package co.discord.media_engine;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b=\b\u0086\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0002\u0010!J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\fHÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\fHÆ\u0003J\t\u0010D\u001a\u00020\u0015HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\fHÆ\u0003J\t\u0010H\u001a\u00020\fHÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\r\u0010K\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u001fHÆ\u0003J\t\u0010O\u001a\u00020\u001fHÆ\u0003J\t\u0010P\u001a\u00020\bHÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\fHÆ\u0003J\t\u0010T\u001a\u00020\u000eHÆ\u0003J\t\u0010U\u001a\u00020\fHÆ\u0003J\t\u0010V\u001a\u00020\fHÆ\u0003Jó\u0001\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001fHÆ\u0001J\u0013\u0010X\u001a\u00020\u001f2\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Z\u001a\u00020\fHÖ\u0001J\t\u0010[\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0013\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010 \u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0019\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0011\u0010\u0018\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010)R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010)R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010)R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010)R\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010)R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b>\u0010)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010/¨\u0006\\"}, m14357d2 = {"Lco/discord/media_engine/OutboundRtpVideo;", "", "type", "", "ssrc", "", "Lco/discord/media_engine/U32;", "codec", "Lco/discord/media_engine/StatsCodec;", "bytesSent", "packetsSent", "packetsLost", "", "fractionLost", "", "bitrate", "bitrateTarget", "encodeUsage", "encoderImplementationName", "averageEncodeTime", "resolution", "Lco/discord/media_engine/Resolution;", "framesSent", "framesEncoded", "frameRateInput", "frameRateEncode", "firCount", "nackCount", "pliCount", "qpSum", "bandwidthLimitedResolution", "", "cpuLimitedResolution", "(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJIFIIILjava/lang/String;ILco/discord/media_engine/Resolution;JJIIJJJJZZ)V", "getAverageEncodeTime", "()I", "getBandwidthLimitedResolution", "()Z", "getBitrate", "getBitrateTarget", "getBytesSent", "()J", "getCodec", "()Lco/discord/media_engine/StatsCodec;", "getCpuLimitedResolution", "getEncodeUsage", "getEncoderImplementationName", "()Ljava/lang/String;", "getFirCount", "getFractionLost", "()F", "getFrameRateEncode", "getFrameRateInput", "getFramesEncoded", "getFramesSent", "getNackCount", "getPacketsLost", "getPacketsSent", "getPliCount", "getQpSum", "getResolution", "()Lco/discord/media_engine/Resolution;", "getSsrc", "getType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class OutboundRtpVideo {
    private final int averageEncodeTime;
    private final boolean bandwidthLimitedResolution;
    private final int bitrate;
    private final int bitrateTarget;
    private final long bytesSent;
    private final StatsCodec codec;
    private final boolean cpuLimitedResolution;
    private final int encodeUsage;
    private final String encoderImplementationName;
    private final long firCount;
    private final float fractionLost;
    private final int frameRateEncode;
    private final int frameRateInput;
    private final long framesEncoded;
    private final long framesSent;
    private final long nackCount;
    private final int packetsLost;
    private final long packetsSent;
    private final long pliCount;
    private final long qpSum;
    private final Resolution resolution;
    private final long ssrc;
    private final String type;

    public OutboundRtpVideo(String type, long j, StatsCodec codec, long j2, long j3, int i, float f, int i2, int i3, int i4, String encoderImplementationName, int i5, Resolution resolution, long j4, long j5, int i6, int i7, long j6, long j7, long j8, long j9, boolean z, boolean z2) {
        C9612q.m13917h(type, "type");
        C9612q.m13917h(codec, "codec");
        C9612q.m13917h(encoderImplementationName, "encoderImplementationName");
        C9612q.m13917h(resolution, "resolution");
        this.type = type;
        this.ssrc = j;
        this.codec = codec;
        this.bytesSent = j2;
        this.packetsSent = j3;
        this.packetsLost = i;
        this.fractionLost = f;
        this.bitrate = i2;
        this.bitrateTarget = i3;
        this.encodeUsage = i4;
        this.encoderImplementationName = encoderImplementationName;
        this.averageEncodeTime = i5;
        this.resolution = resolution;
        this.framesSent = j4;
        this.framesEncoded = j5;
        this.frameRateInput = i6;
        this.frameRateEncode = i7;
        this.firCount = j6;
        this.nackCount = j7;
        this.pliCount = j8;
        this.qpSum = j9;
        this.bandwidthLimitedResolution = z;
        this.cpuLimitedResolution = z2;
    }

    public static /* synthetic */ OutboundRtpVideo copy$default(OutboundRtpVideo outboundRtpVideo, String str, long j, StatsCodec statsCodec, long j2, long j3, int i, float f, int i2, int i3, int i4, String str2, int i5, Resolution resolution, long j4, long j5, int i6, int i7, long j6, long j7, long j8, long j9, boolean z, boolean z2, int i8, Object obj) {
        String str3 = (i8 & 1) != 0 ? outboundRtpVideo.type : str;
        long j10 = (i8 & 2) != 0 ? outboundRtpVideo.ssrc : j;
        StatsCodec statsCodec2 = (i8 & 4) != 0 ? outboundRtpVideo.codec : statsCodec;
        long j11 = (i8 & 8) != 0 ? outboundRtpVideo.bytesSent : j2;
        long j12 = (i8 & 16) != 0 ? outboundRtpVideo.packetsSent : j3;
        int i9 = (i8 & 32) != 0 ? outboundRtpVideo.packetsLost : i;
        float f2 = (i8 & 64) != 0 ? outboundRtpVideo.fractionLost : f;
        int i10 = (i8 & 128) != 0 ? outboundRtpVideo.bitrate : i2;
        int i11 = (i8 & 256) != 0 ? outboundRtpVideo.bitrateTarget : i3;
        int i12 = (i8 & 512) != 0 ? outboundRtpVideo.encodeUsage : i4;
        return outboundRtpVideo.copy(str3, j10, statsCodec2, j11, j12, i9, f2, i10, i11, i12, (i8 & 1024) != 0 ? outboundRtpVideo.encoderImplementationName : str2, (i8 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? outboundRtpVideo.averageEncodeTime : i5, (i8 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? outboundRtpVideo.resolution : resolution, (i8 & 8192) != 0 ? outboundRtpVideo.framesSent : j4, (i8 & 16384) != 0 ? outboundRtpVideo.framesEncoded : j5, (i8 & 32768) != 0 ? outboundRtpVideo.frameRateInput : i6, (65536 & i8) != 0 ? outboundRtpVideo.frameRateEncode : i7, (i8 & 131072) != 0 ? outboundRtpVideo.firCount : j6, (i8 & 262144) != 0 ? outboundRtpVideo.nackCount : j7, (i8 & 524288) != 0 ? outboundRtpVideo.pliCount : j8, (i8 & 1048576) != 0 ? outboundRtpVideo.qpSum : j9, (i8 & 2097152) != 0 ? outboundRtpVideo.bandwidthLimitedResolution : z, (i8 & 4194304) != 0 ? outboundRtpVideo.cpuLimitedResolution : z2);
    }

    public final String component1() {
        return this.type;
    }

    public final int component10() {
        return this.encodeUsage;
    }

    public final String component11() {
        return this.encoderImplementationName;
    }

    public final int component12() {
        return this.averageEncodeTime;
    }

    public final Resolution component13() {
        return this.resolution;
    }

    public final long component14() {
        return this.framesSent;
    }

    public final long component15() {
        return this.framesEncoded;
    }

    public final int component16() {
        return this.frameRateInput;
    }

    public final int component17() {
        return this.frameRateEncode;
    }

    public final long component18() {
        return this.firCount;
    }

    public final long component19() {
        return this.nackCount;
    }

    public final long component2() {
        return this.ssrc;
    }

    public final long component20() {
        return this.pliCount;
    }

    public final long component21() {
        return this.qpSum;
    }

    public final boolean component22() {
        return this.bandwidthLimitedResolution;
    }

    public final boolean component23() {
        return this.cpuLimitedResolution;
    }

    public final StatsCodec component3() {
        return this.codec;
    }

    public final long component4() {
        return this.bytesSent;
    }

    public final long component5() {
        return this.packetsSent;
    }

    public final int component6() {
        return this.packetsLost;
    }

    public final float component7() {
        return this.fractionLost;
    }

    public final int component8() {
        return this.bitrate;
    }

    public final int component9() {
        return this.bitrateTarget;
    }

    public final OutboundRtpVideo copy(String type, long j, StatsCodec codec, long j2, long j3, int i, float f, int i2, int i3, int i4, String encoderImplementationName, int i5, Resolution resolution, long j4, long j5, int i6, int i7, long j6, long j7, long j8, long j9, boolean z, boolean z2) {
        C9612q.m13917h(type, "type");
        C9612q.m13917h(codec, "codec");
        C9612q.m13917h(encoderImplementationName, "encoderImplementationName");
        C9612q.m13917h(resolution, "resolution");
        return new OutboundRtpVideo(type, j, codec, j2, j3, i, f, i2, i3, i4, encoderImplementationName, i5, resolution, j4, j5, i6, i7, j6, j7, j8, j9, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OutboundRtpVideo) {
            OutboundRtpVideo outboundRtpVideo = (OutboundRtpVideo) obj;
            return C9612q.m13922c(this.type, outboundRtpVideo.type) && this.ssrc == outboundRtpVideo.ssrc && C9612q.m13922c(this.codec, outboundRtpVideo.codec) && this.bytesSent == outboundRtpVideo.bytesSent && this.packetsSent == outboundRtpVideo.packetsSent && this.packetsLost == outboundRtpVideo.packetsLost && Float.compare(this.fractionLost, outboundRtpVideo.fractionLost) == 0 && this.bitrate == outboundRtpVideo.bitrate && this.bitrateTarget == outboundRtpVideo.bitrateTarget && this.encodeUsage == outboundRtpVideo.encodeUsage && C9612q.m13922c(this.encoderImplementationName, outboundRtpVideo.encoderImplementationName) && this.averageEncodeTime == outboundRtpVideo.averageEncodeTime && C9612q.m13922c(this.resolution, outboundRtpVideo.resolution) && this.framesSent == outboundRtpVideo.framesSent && this.framesEncoded == outboundRtpVideo.framesEncoded && this.frameRateInput == outboundRtpVideo.frameRateInput && this.frameRateEncode == outboundRtpVideo.frameRateEncode && this.firCount == outboundRtpVideo.firCount && this.nackCount == outboundRtpVideo.nackCount && this.pliCount == outboundRtpVideo.pliCount && this.qpSum == outboundRtpVideo.qpSum && this.bandwidthLimitedResolution == outboundRtpVideo.bandwidthLimitedResolution && this.cpuLimitedResolution == outboundRtpVideo.cpuLimitedResolution;
        }
        return false;
    }

    public final int getAverageEncodeTime() {
        return this.averageEncodeTime;
    }

    public final boolean getBandwidthLimitedResolution() {
        return this.bandwidthLimitedResolution;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getBitrateTarget() {
        return this.bitrateTarget;
    }

    public final long getBytesSent() {
        return this.bytesSent;
    }

    public final StatsCodec getCodec() {
        return this.codec;
    }

    public final boolean getCpuLimitedResolution() {
        return this.cpuLimitedResolution;
    }

    public final int getEncodeUsage() {
        return this.encodeUsage;
    }

    public final String getEncoderImplementationName() {
        return this.encoderImplementationName;
    }

    public final long getFirCount() {
        return this.firCount;
    }

    public final float getFractionLost() {
        return this.fractionLost;
    }

    public final int getFrameRateEncode() {
        return this.frameRateEncode;
    }

    public final int getFrameRateInput() {
        return this.frameRateInput;
    }

    public final long getFramesEncoded() {
        return this.framesEncoded;
    }

    public final long getFramesSent() {
        return this.framesSent;
    }

    public final long getNackCount() {
        return this.nackCount;
    }

    public final int getPacketsLost() {
        return this.packetsLost;
    }

    public final long getPacketsSent() {
        return this.packetsSent;
    }

    public final long getPliCount() {
        return this.pliCount;
    }

    public final long getQpSum() {
        return this.qpSum;
    }

    public final Resolution getResolution() {
        return this.resolution;
    }

    public final long getSsrc() {
        return this.ssrc;
    }

    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((this.type.hashCode() * 31) + C2689b.m32716a(this.ssrc)) * 31) + this.codec.hashCode()) * 31) + C2689b.m32716a(this.bytesSent)) * 31) + C2689b.m32716a(this.packetsSent)) * 31) + this.packetsLost) * 31) + Float.floatToIntBits(this.fractionLost)) * 31) + this.bitrate) * 31) + this.bitrateTarget) * 31) + this.encodeUsage) * 31) + this.encoderImplementationName.hashCode()) * 31) + this.averageEncodeTime) * 31) + this.resolution.hashCode()) * 31) + C2689b.m32716a(this.framesSent)) * 31) + C2689b.m32716a(this.framesEncoded)) * 31) + this.frameRateInput) * 31) + this.frameRateEncode) * 31) + C2689b.m32716a(this.firCount)) * 31) + C2689b.m32716a(this.nackCount)) * 31) + C2689b.m32716a(this.pliCount)) * 31) + C2689b.m32716a(this.qpSum)) * 31;
        boolean z = this.bandwidthLimitedResolution;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.cpuLimitedResolution;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.type;
        long j = this.ssrc;
        StatsCodec statsCodec = this.codec;
        long j2 = this.bytesSent;
        long j3 = this.packetsSent;
        int i = this.packetsLost;
        float f = this.fractionLost;
        int i2 = this.bitrate;
        int i3 = this.bitrateTarget;
        int i4 = this.encodeUsage;
        String str2 = this.encoderImplementationName;
        int i5 = this.averageEncodeTime;
        Resolution resolution = this.resolution;
        long j4 = this.framesSent;
        long j5 = this.framesEncoded;
        int i6 = this.frameRateInput;
        int i7 = this.frameRateEncode;
        long j6 = this.firCount;
        long j7 = this.nackCount;
        long j8 = this.pliCount;
        long j9 = this.qpSum;
        boolean z = this.bandwidthLimitedResolution;
        boolean z2 = this.cpuLimitedResolution;
        return "OutboundRtpVideo(type=" + str + ", ssrc=" + j + ", codec=" + statsCodec + ", bytesSent=" + j2 + ", packetsSent=" + j3 + ", packetsLost=" + i + ", fractionLost=" + f + ", bitrate=" + i2 + ", bitrateTarget=" + i3 + ", encodeUsage=" + i4 + ", encoderImplementationName=" + str2 + ", averageEncodeTime=" + i5 + ", resolution=" + resolution + ", framesSent=" + j4 + ", framesEncoded=" + j5 + ", frameRateInput=" + i6 + ", frameRateEncode=" + i7 + ", firCount=" + j6 + ", nackCount=" + j7 + ", pliCount=" + j8 + ", qpSum=" + j9 + ", bandwidthLimitedResolution=" + z + ", cpuLimitedResolution=" + z2 + ")";
    }
}
