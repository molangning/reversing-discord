package co.discord.media_engine.internal;

import androidx.recyclerview.widget.RecyclerView;
import co.discord.media_engine.C2689b;
import co.discord.media_engine.C2690c;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\bK\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001Bå\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\b\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\t\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\n\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010\u0012\n\u0010\u0012\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u0013\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u0014\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u0015\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u0016\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u0017\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u0018\u001a\u00060\u000fj\u0002`\u0019\u0012\n\u0010\u001a\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u001b\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\n\u0010 \u001a\u00060\u000fj\u0002`\u0010\u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\n\u0010%\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010&\u001a\u00060\u000fj\u0002`\u0010\u0012\n\u0010'\u001a\u00060\u000fj\u0002`\u0010\u0012\n\u0010(\u001a\u00060\u000fj\u0002`\u0010\u0012\n\u0010)\u001a\u00060\u000fj\u0002`\u0010\u0012\n\u0010*\u001a\u00060\u000fj\u0002`\u0010\u0012\n\u0010+\u001a\u00060,j\u0002`-¢\u0006\u0002\u0010.J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\r\u0010X\u001a\u00060\u000fj\u0002`\u0010HÆ\u0003J\r\u0010Y\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\r\u0010Z\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\r\u0010[\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\r\u0010\\\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\r\u0010]\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\r\u0010^\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\r\u0010_\u001a\u00060\u000fj\u0002`\u0019HÆ\u0003J\r\u0010`\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\r\u0010a\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\r\u0010b\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\t\u0010c\u001a\u00020\u001dHÆ\u0003J\t\u0010d\u001a\u00020\u001fHÆ\u0003J\r\u0010e\u001a\u00060\u000fj\u0002`\u0010HÆ\u0003J\t\u0010f\u001a\u00020\"HÆ\u0003J\t\u0010g\u001a\u00020\"HÆ\u0003J\t\u0010h\u001a\u00020\u0005HÆ\u0003J\r\u0010i\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\r\u0010j\u001a\u00060\u000fj\u0002`\u0010HÆ\u0003J\r\u0010k\u001a\u00060\u000fj\u0002`\u0010HÆ\u0003J\r\u0010l\u001a\u00060\u000fj\u0002`\u0010HÆ\u0003J\r\u0010m\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\r\u0010n\u001a\u00060\u000fj\u0002`\u0010HÆ\u0003J\r\u0010o\u001a\u00060\u000fj\u0002`\u0010HÆ\u0003J\r\u0010p\u001a\u00060,j\u0002`-HÆ\u0003J\r\u0010q\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\r\u0010r\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\r\u0010s\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\t\u0010t\u001a\u00020\u0003HÆ\u0003J\t\u0010u\u001a\u00020\rHÆ\u0003J\r\u0010v\u001a\u00060\u000fj\u0002`\u0010HÆ\u0003J©\u0003\u0010w\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\b\u0002\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\f\b\u0002\u0010\b\u001a\u00060\u0005j\u0002`\u00062\f\b\u0002\u0010\t\u001a\u00060\u0005j\u0002`\u00062\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\f\b\u0002\u0010\u000e\u001a\u00060\u000fj\u0002`\u00102\f\b\u0002\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\f\b\u0002\u0010\u0012\u001a\u00060\u0005j\u0002`\u00062\f\b\u0002\u0010\u0013\u001a\u00060\u0005j\u0002`\u00062\f\b\u0002\u0010\u0014\u001a\u00060\u0005j\u0002`\u00062\f\b\u0002\u0010\u0015\u001a\u00060\u0005j\u0002`\u00062\f\b\u0002\u0010\u0016\u001a\u00060\u0005j\u0002`\u00062\f\b\u0002\u0010\u0017\u001a\u00060\u0005j\u0002`\u00062\f\b\u0002\u0010\u0018\u001a\u00060\u000fj\u0002`\u00192\f\b\u0002\u0010\u001a\u001a\u00060\u0005j\u0002`\u00062\f\b\u0002\u0010\u001b\u001a\u00060\u0005j\u0002`\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\f\b\u0002\u0010 \u001a\u00060\u000fj\u0002`\u00102\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u00052\f\b\u0002\u0010%\u001a\u00060\u0005j\u0002`\u00062\f\b\u0002\u0010&\u001a\u00060\u000fj\u0002`\u00102\f\b\u0002\u0010'\u001a\u00060\u000fj\u0002`\u00102\f\b\u0002\u0010(\u001a\u00060\u000fj\u0002`\u00102\f\b\u0002\u0010)\u001a\u00060\u000fj\u0002`\u00102\f\b\u0002\u0010*\u001a\u00060\u000fj\u0002`\u00102\f\b\u0002\u0010+\u001a\u00060,j\u0002`-HÆ\u0001J\u0013\u0010x\u001a\u00020y2\b\u0010z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010{\u001a\u00020\u0005HÖ\u0001J\t\u0010|\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0015\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0015\u0010\b\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b4\u00102R\u0015\u0010\n\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b5\u00102R\u0015\u0010\t\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b6\u00102R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u00100R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0015\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0015\u0010\u0012\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b<\u00102R\u0015\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010¢\u0006\b\n\u0000\u001a\u0004\b=\u0010;R\u0015\u0010&\u001a\u00060\u000fj\u0002`\u0010¢\u0006\b\n\u0000\u001a\u0004\b>\u0010;R\u0015\u0010\u0013\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b?\u00102R\u0015\u0010\u0014\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b@\u00102R\u0015\u0010\u0015\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\bA\u00102R\u0015\u0010\u0016\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\bB\u00102R\u0015\u0010\u0017\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\bC\u00102R\u0015\u0010'\u001a\u00060\u000fj\u0002`\u0010¢\u0006\b\n\u0000\u001a\u0004\bD\u0010;R\u0015\u0010\u0018\u001a\u00060\u000fj\u0002`\u0019¢\u0006\b\n\u0000\u001a\u0004\bE\u0010;R\u0015\u0010\u001a\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\bF\u00102R\u0015\u0010\u001b\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\bG\u00102R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0015\u0010 \u001a\u00060\u000fj\u0002`\u0010¢\u0006\b\n\u0000\u001a\u0004\bL\u0010;R\u0015\u0010+\u001a\u00060,j\u0002`-¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0011\u0010#\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010PR\u0011\u0010$\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bR\u00102R\u0015\u0010*\u001a\u00060\u000fj\u0002`\u0010¢\u0006\b\n\u0000\u001a\u0004\bS\u0010;R\u0015\u0010(\u001a\u00060\u000fj\u0002`\u0010¢\u0006\b\n\u0000\u001a\u0004\bT\u0010;R\u0015\u0010)\u001a\u00060\u000fj\u0002`\u0010¢\u0006\b\n\u0000\u001a\u0004\bU\u0010;R\u0015\u0010%\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\bV\u00102¨\u0006}"}, m14357d2 = {"Lco/discord/media_engine/internal/InboundVideo;", "", "codecName", "", "codecPayloadType", "", "Lco/discord/media_engine/internal/I32;", "currentDelay", "currentPayloadType", "decodeFrameRate", "decode", "decoderImplementationName", "frameCounts", "Lco/discord/media_engine/internal/FrameCounts;", "framesDecoded", "", "Lco/discord/media_engine/internal/U32;", "framesRendered", "framesDropped", "height", "jitterBuffer", "maxDecode", "minPlayoutDelay", "networkFrameRate", "qpSum", "Lco/discord/media_engine/internal/I64;", "renderDelay", "renderFrameRate", "rtcpStats", "Lco/discord/media_engine/internal/InboundRtcpStats;", "rtpStats", "Lco/discord/media_engine/internal/InboundRtpStats;", "ssrc", "syncOffset", "", "targetDelay", "totalBitrate", "width", "freezeCount", "pauseCount", "totalFreezesDuration", "totalPausesDuration", "totalFramesDuration", "sumOfSquaredFramesDurations", "", "Lco/discord/media_engine/internal/F64;", "(Ljava/lang/String;IIIIILjava/lang/String;Lco/discord/media_engine/internal/FrameCounts;JJIIIIIIJIILco/discord/media_engine/internal/InboundRtcpStats;Lco/discord/media_engine/internal/InboundRtpStats;JFFIIJJJJJD)V", "getCodecName", "()Ljava/lang/String;", "getCodecPayloadType", "()I", "getCurrentDelay", "getCurrentPayloadType", "getDecode", "getDecodeFrameRate", "getDecoderImplementationName", "getFrameCounts", "()Lco/discord/media_engine/internal/FrameCounts;", "getFramesDecoded", "()J", "getFramesDropped", "getFramesRendered", "getFreezeCount", "getHeight", "getJitterBuffer", "getMaxDecode", "getMinPlayoutDelay", "getNetworkFrameRate", "getPauseCount", "getQpSum", "getRenderDelay", "getRenderFrameRate", "getRtcpStats", "()Lco/discord/media_engine/internal/InboundRtcpStats;", "getRtpStats", "()Lco/discord/media_engine/internal/InboundRtpStats;", "getSsrc", "getSumOfSquaredFramesDurations", "()D", "getSyncOffset", "()F", "getTargetDelay", "getTotalBitrate", "getTotalFramesDuration", "getTotalFreezesDuration", "getTotalPausesDuration", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class InboundVideo {
    private final String codecName;
    private final int codecPayloadType;
    private final int currentDelay;
    private final int currentPayloadType;
    private final int decode;
    private final int decodeFrameRate;
    private final String decoderImplementationName;
    private final FrameCounts frameCounts;
    private final long framesDecoded;
    private final int framesDropped;
    private final long framesRendered;
    private final long freezeCount;
    private final int height;
    private final int jitterBuffer;
    private final int maxDecode;
    private final int minPlayoutDelay;
    private final int networkFrameRate;
    private final long pauseCount;
    private final long qpSum;
    private final int renderDelay;
    private final int renderFrameRate;
    private final InboundRtcpStats rtcpStats;
    private final InboundRtpStats rtpStats;
    private final long ssrc;
    private final double sumOfSquaredFramesDurations;
    private final float syncOffset;
    private final float targetDelay;
    private final int totalBitrate;
    private final long totalFramesDuration;
    private final long totalFreezesDuration;
    private final long totalPausesDuration;
    private final int width;

    public InboundVideo(String codecName, int i, int i2, int i3, int i4, int i5, String decoderImplementationName, FrameCounts frameCounts, long j, long j2, int i6, int i7, int i8, int i9, int i10, int i11, long j3, int i12, int i13, InboundRtcpStats rtcpStats, InboundRtpStats rtpStats, long j4, float f, float f2, int i14, int i15, long j5, long j6, long j7, long j8, long j9, double d) {
        C9612q.m13917h(codecName, "codecName");
        C9612q.m13917h(decoderImplementationName, "decoderImplementationName");
        C9612q.m13917h(frameCounts, "frameCounts");
        C9612q.m13917h(rtcpStats, "rtcpStats");
        C9612q.m13917h(rtpStats, "rtpStats");
        this.codecName = codecName;
        this.codecPayloadType = i;
        this.currentDelay = i2;
        this.currentPayloadType = i3;
        this.decodeFrameRate = i4;
        this.decode = i5;
        this.decoderImplementationName = decoderImplementationName;
        this.frameCounts = frameCounts;
        this.framesDecoded = j;
        this.framesRendered = j2;
        this.framesDropped = i6;
        this.height = i7;
        this.jitterBuffer = i8;
        this.maxDecode = i9;
        this.minPlayoutDelay = i10;
        this.networkFrameRate = i11;
        this.qpSum = j3;
        this.renderDelay = i12;
        this.renderFrameRate = i13;
        this.rtcpStats = rtcpStats;
        this.rtpStats = rtpStats;
        this.ssrc = j4;
        this.syncOffset = f;
        this.targetDelay = f2;
        this.totalBitrate = i14;
        this.width = i15;
        this.freezeCount = j5;
        this.pauseCount = j6;
        this.totalFreezesDuration = j7;
        this.totalPausesDuration = j8;
        this.totalFramesDuration = j9;
        this.sumOfSquaredFramesDurations = d;
    }

    public static /* synthetic */ InboundVideo copy$default(InboundVideo inboundVideo, String str, int i, int i2, int i3, int i4, int i5, String str2, FrameCounts frameCounts, long j, long j2, int i6, int i7, int i8, int i9, int i10, int i11, long j3, int i12, int i13, InboundRtcpStats inboundRtcpStats, InboundRtpStats inboundRtpStats, long j4, float f, float f2, int i14, int i15, long j5, long j6, long j7, long j8, long j9, double d, int i16, Object obj) {
        String str3 = (i16 & 1) != 0 ? inboundVideo.codecName : str;
        int i17 = (i16 & 2) != 0 ? inboundVideo.codecPayloadType : i;
        int i18 = (i16 & 4) != 0 ? inboundVideo.currentDelay : i2;
        int i19 = (i16 & 8) != 0 ? inboundVideo.currentPayloadType : i3;
        int i20 = (i16 & 16) != 0 ? inboundVideo.decodeFrameRate : i4;
        int i21 = (i16 & 32) != 0 ? inboundVideo.decode : i5;
        String str4 = (i16 & 64) != 0 ? inboundVideo.decoderImplementationName : str2;
        FrameCounts frameCounts2 = (i16 & 128) != 0 ? inboundVideo.frameCounts : frameCounts;
        long j10 = (i16 & 256) != 0 ? inboundVideo.framesDecoded : j;
        long j11 = (i16 & 512) != 0 ? inboundVideo.framesRendered : j2;
        int i22 = (i16 & 1024) != 0 ? inboundVideo.framesDropped : i6;
        int i23 = (i16 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? inboundVideo.height : i7;
        int i24 = (i16 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? inboundVideo.jitterBuffer : i8;
        int i25 = (i16 & 8192) != 0 ? inboundVideo.maxDecode : i9;
        int i26 = (i16 & 16384) != 0 ? inboundVideo.minPlayoutDelay : i10;
        int i27 = i22;
        int i28 = (i16 & 32768) != 0 ? inboundVideo.networkFrameRate : i11;
        long j12 = (i16 & 65536) != 0 ? inboundVideo.qpSum : j3;
        int i29 = (i16 & 131072) != 0 ? inboundVideo.renderDelay : i12;
        return inboundVideo.copy(str3, i17, i18, i19, i20, i21, str4, frameCounts2, j10, j11, i27, i23, i24, i25, i26, i28, j12, i29, (262144 & i16) != 0 ? inboundVideo.renderFrameRate : i13, (i16 & 524288) != 0 ? inboundVideo.rtcpStats : inboundRtcpStats, (i16 & 1048576) != 0 ? inboundVideo.rtpStats : inboundRtpStats, (i16 & 2097152) != 0 ? inboundVideo.ssrc : j4, (i16 & 4194304) != 0 ? inboundVideo.syncOffset : f, (8388608 & i16) != 0 ? inboundVideo.targetDelay : f2, (i16 & 16777216) != 0 ? inboundVideo.totalBitrate : i14, (i16 & 33554432) != 0 ? inboundVideo.width : i15, (i16 & 67108864) != 0 ? inboundVideo.freezeCount : j5, (i16 & 134217728) != 0 ? inboundVideo.pauseCount : j6, (i16 & 268435456) != 0 ? inboundVideo.totalFreezesDuration : j7, (i16 & 536870912) != 0 ? inboundVideo.totalPausesDuration : j8, (i16 & 1073741824) != 0 ? inboundVideo.totalFramesDuration : j9, (i16 & Integer.MIN_VALUE) != 0 ? inboundVideo.sumOfSquaredFramesDurations : d);
    }

    public final String component1() {
        return this.codecName;
    }

    public final long component10() {
        return this.framesRendered;
    }

    public final int component11() {
        return this.framesDropped;
    }

    public final int component12() {
        return this.height;
    }

    public final int component13() {
        return this.jitterBuffer;
    }

    public final int component14() {
        return this.maxDecode;
    }

    public final int component15() {
        return this.minPlayoutDelay;
    }

    public final int component16() {
        return this.networkFrameRate;
    }

    public final long component17() {
        return this.qpSum;
    }

    public final int component18() {
        return this.renderDelay;
    }

    public final int component19() {
        return this.renderFrameRate;
    }

    public final int component2() {
        return this.codecPayloadType;
    }

    public final InboundRtcpStats component20() {
        return this.rtcpStats;
    }

    public final InboundRtpStats component21() {
        return this.rtpStats;
    }

    public final long component22() {
        return this.ssrc;
    }

    public final float component23() {
        return this.syncOffset;
    }

    public final float component24() {
        return this.targetDelay;
    }

    public final int component25() {
        return this.totalBitrate;
    }

    public final int component26() {
        return this.width;
    }

    public final long component27() {
        return this.freezeCount;
    }

    public final long component28() {
        return this.pauseCount;
    }

    public final long component29() {
        return this.totalFreezesDuration;
    }

    public final int component3() {
        return this.currentDelay;
    }

    public final long component30() {
        return this.totalPausesDuration;
    }

    public final long component31() {
        return this.totalFramesDuration;
    }

    public final double component32() {
        return this.sumOfSquaredFramesDurations;
    }

    public final int component4() {
        return this.currentPayloadType;
    }

    public final int component5() {
        return this.decodeFrameRate;
    }

    public final int component6() {
        return this.decode;
    }

    public final String component7() {
        return this.decoderImplementationName;
    }

    public final FrameCounts component8() {
        return this.frameCounts;
    }

    public final long component9() {
        return this.framesDecoded;
    }

    public final InboundVideo copy(String codecName, int i, int i2, int i3, int i4, int i5, String decoderImplementationName, FrameCounts frameCounts, long j, long j2, int i6, int i7, int i8, int i9, int i10, int i11, long j3, int i12, int i13, InboundRtcpStats rtcpStats, InboundRtpStats rtpStats, long j4, float f, float f2, int i14, int i15, long j5, long j6, long j7, long j8, long j9, double d) {
        C9612q.m13917h(codecName, "codecName");
        C9612q.m13917h(decoderImplementationName, "decoderImplementationName");
        C9612q.m13917h(frameCounts, "frameCounts");
        C9612q.m13917h(rtcpStats, "rtcpStats");
        C9612q.m13917h(rtpStats, "rtpStats");
        return new InboundVideo(codecName, i, i2, i3, i4, i5, decoderImplementationName, frameCounts, j, j2, i6, i7, i8, i9, i10, i11, j3, i12, i13, rtcpStats, rtpStats, j4, f, f2, i14, i15, j5, j6, j7, j8, j9, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InboundVideo) {
            InboundVideo inboundVideo = (InboundVideo) obj;
            return C9612q.m13922c(this.codecName, inboundVideo.codecName) && this.codecPayloadType == inboundVideo.codecPayloadType && this.currentDelay == inboundVideo.currentDelay && this.currentPayloadType == inboundVideo.currentPayloadType && this.decodeFrameRate == inboundVideo.decodeFrameRate && this.decode == inboundVideo.decode && C9612q.m13922c(this.decoderImplementationName, inboundVideo.decoderImplementationName) && C9612q.m13922c(this.frameCounts, inboundVideo.frameCounts) && this.framesDecoded == inboundVideo.framesDecoded && this.framesRendered == inboundVideo.framesRendered && this.framesDropped == inboundVideo.framesDropped && this.height == inboundVideo.height && this.jitterBuffer == inboundVideo.jitterBuffer && this.maxDecode == inboundVideo.maxDecode && this.minPlayoutDelay == inboundVideo.minPlayoutDelay && this.networkFrameRate == inboundVideo.networkFrameRate && this.qpSum == inboundVideo.qpSum && this.renderDelay == inboundVideo.renderDelay && this.renderFrameRate == inboundVideo.renderFrameRate && C9612q.m13922c(this.rtcpStats, inboundVideo.rtcpStats) && C9612q.m13922c(this.rtpStats, inboundVideo.rtpStats) && this.ssrc == inboundVideo.ssrc && Float.compare(this.syncOffset, inboundVideo.syncOffset) == 0 && Float.compare(this.targetDelay, inboundVideo.targetDelay) == 0 && this.totalBitrate == inboundVideo.totalBitrate && this.width == inboundVideo.width && this.freezeCount == inboundVideo.freezeCount && this.pauseCount == inboundVideo.pauseCount && this.totalFreezesDuration == inboundVideo.totalFreezesDuration && this.totalPausesDuration == inboundVideo.totalPausesDuration && this.totalFramesDuration == inboundVideo.totalFramesDuration && Double.compare(this.sumOfSquaredFramesDurations, inboundVideo.sumOfSquaredFramesDurations) == 0;
        }
        return false;
    }

    public final String getCodecName() {
        return this.codecName;
    }

    public final int getCodecPayloadType() {
        return this.codecPayloadType;
    }

    public final int getCurrentDelay() {
        return this.currentDelay;
    }

    public final int getCurrentPayloadType() {
        return this.currentPayloadType;
    }

    public final int getDecode() {
        return this.decode;
    }

    public final int getDecodeFrameRate() {
        return this.decodeFrameRate;
    }

    public final String getDecoderImplementationName() {
        return this.decoderImplementationName;
    }

    public final FrameCounts getFrameCounts() {
        return this.frameCounts;
    }

    public final long getFramesDecoded() {
        return this.framesDecoded;
    }

    public final int getFramesDropped() {
        return this.framesDropped;
    }

    public final long getFramesRendered() {
        return this.framesRendered;
    }

    public final long getFreezeCount() {
        return this.freezeCount;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getJitterBuffer() {
        return this.jitterBuffer;
    }

    public final int getMaxDecode() {
        return this.maxDecode;
    }

    public final int getMinPlayoutDelay() {
        return this.minPlayoutDelay;
    }

    public final int getNetworkFrameRate() {
        return this.networkFrameRate;
    }

    public final long getPauseCount() {
        return this.pauseCount;
    }

    public final long getQpSum() {
        return this.qpSum;
    }

    public final int getRenderDelay() {
        return this.renderDelay;
    }

    public final int getRenderFrameRate() {
        return this.renderFrameRate;
    }

    public final InboundRtcpStats getRtcpStats() {
        return this.rtcpStats;
    }

    public final InboundRtpStats getRtpStats() {
        return this.rtpStats;
    }

    public final long getSsrc() {
        return this.ssrc;
    }

    public final double getSumOfSquaredFramesDurations() {
        return this.sumOfSquaredFramesDurations;
    }

    public final float getSyncOffset() {
        return this.syncOffset;
    }

    public final float getTargetDelay() {
        return this.targetDelay;
    }

    public final int getTotalBitrate() {
        return this.totalBitrate;
    }

    public final long getTotalFramesDuration() {
        return this.totalFramesDuration;
    }

    public final long getTotalFreezesDuration() {
        return this.totalFreezesDuration;
    }

    public final long getTotalPausesDuration() {
        return this.totalPausesDuration;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.codecName.hashCode() * 31) + this.codecPayloadType) * 31) + this.currentDelay) * 31) + this.currentPayloadType) * 31) + this.decodeFrameRate) * 31) + this.decode) * 31) + this.decoderImplementationName.hashCode()) * 31) + this.frameCounts.hashCode()) * 31) + C2689b.m32716a(this.framesDecoded)) * 31) + C2689b.m32716a(this.framesRendered)) * 31) + this.framesDropped) * 31) + this.height) * 31) + this.jitterBuffer) * 31) + this.maxDecode) * 31) + this.minPlayoutDelay) * 31) + this.networkFrameRate) * 31) + C2689b.m32716a(this.qpSum)) * 31) + this.renderDelay) * 31) + this.renderFrameRate) * 31) + this.rtcpStats.hashCode()) * 31) + this.rtpStats.hashCode()) * 31) + C2689b.m32716a(this.ssrc)) * 31) + Float.floatToIntBits(this.syncOffset)) * 31) + Float.floatToIntBits(this.targetDelay)) * 31) + this.totalBitrate) * 31) + this.width) * 31) + C2689b.m32716a(this.freezeCount)) * 31) + C2689b.m32716a(this.pauseCount)) * 31) + C2689b.m32716a(this.totalFreezesDuration)) * 31) + C2689b.m32716a(this.totalPausesDuration)) * 31) + C2689b.m32716a(this.totalFramesDuration)) * 31) + C2690c.m32715a(this.sumOfSquaredFramesDurations);
    }

    public String toString() {
        String str = this.codecName;
        int i = this.codecPayloadType;
        int i2 = this.currentDelay;
        int i3 = this.currentPayloadType;
        int i4 = this.decodeFrameRate;
        int i5 = this.decode;
        String str2 = this.decoderImplementationName;
        FrameCounts frameCounts = this.frameCounts;
        long j = this.framesDecoded;
        long j2 = this.framesRendered;
        int i6 = this.framesDropped;
        int i7 = this.height;
        int i8 = this.jitterBuffer;
        int i9 = this.maxDecode;
        int i10 = this.minPlayoutDelay;
        int i11 = this.networkFrameRate;
        long j3 = this.qpSum;
        int i12 = this.renderDelay;
        int i13 = this.renderFrameRate;
        InboundRtcpStats inboundRtcpStats = this.rtcpStats;
        InboundRtpStats inboundRtpStats = this.rtpStats;
        long j4 = this.ssrc;
        float f = this.syncOffset;
        float f2 = this.targetDelay;
        int i14 = this.totalBitrate;
        int i15 = this.width;
        long j5 = this.freezeCount;
        long j6 = this.pauseCount;
        long j7 = this.totalFreezesDuration;
        long j8 = this.totalPausesDuration;
        long j9 = this.totalFramesDuration;
        double d = this.sumOfSquaredFramesDurations;
        return "InboundVideo(codecName=" + str + ", codecPayloadType=" + i + ", currentDelay=" + i2 + ", currentPayloadType=" + i3 + ", decodeFrameRate=" + i4 + ", decode=" + i5 + ", decoderImplementationName=" + str2 + ", frameCounts=" + frameCounts + ", framesDecoded=" + j + ", framesRendered=" + j2 + ", framesDropped=" + i6 + ", height=" + i7 + ", jitterBuffer=" + i8 + ", maxDecode=" + i9 + ", minPlayoutDelay=" + i10 + ", networkFrameRate=" + i11 + ", qpSum=" + j3 + ", renderDelay=" + i12 + ", renderFrameRate=" + i13 + ", rtcpStats=" + inboundRtcpStats + ", rtpStats=" + inboundRtpStats + ", ssrc=" + j4 + ", syncOffset=" + f + ", targetDelay=" + f2 + ", totalBitrate=" + i14 + ", width=" + i15 + ", freezeCount=" + j5 + ", pauseCount=" + j6 + ", totalFreezesDuration=" + j7 + ", totalPausesDuration=" + j8 + ", totalFramesDuration=" + j9 + ", sumOfSquaredFramesDurations=" + d + ")";
    }
}
