package co.discord.media_engine;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\f\u0012\"\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e`\f¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J%\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\fHÆ\u0003J%\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e`\fHÆ\u0003Jy\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072$\b\u0002\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\f2$\b\u0002\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e`\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\nHÖ\u0001R-\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R-\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e`\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, m14357d2 = {"Lco/discord/media_engine/Stats;", "", "transport", "Lco/discord/media_engine/Transport;", "outboundRtpAudio", "Lco/discord/media_engine/OutboundRtpAudio;", "outboundRtpVideo", "Lco/discord/media_engine/OutboundRtpVideo;", "inboundRtpAudio", "Ljava/util/HashMap;", "", "Lco/discord/media_engine/InboundRtpAudio;", "Lkotlin/collections/HashMap;", "inboundRtpVideo", "Lco/discord/media_engine/InboundRtpVideo;", "(Lco/discord/media_engine/Transport;Lco/discord/media_engine/OutboundRtpAudio;Lco/discord/media_engine/OutboundRtpVideo;Ljava/util/HashMap;Ljava/util/HashMap;)V", "getInboundRtpAudio", "()Ljava/util/HashMap;", "getInboundRtpVideo", "getOutboundRtpAudio", "()Lco/discord/media_engine/OutboundRtpAudio;", "getOutboundRtpVideo", "()Lco/discord/media_engine/OutboundRtpVideo;", "getTransport", "()Lco/discord/media_engine/Transport;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class Stats {
    private final HashMap<String, InboundRtpAudio> inboundRtpAudio;
    private final HashMap<String, InboundRtpVideo> inboundRtpVideo;
    private final OutboundRtpAudio outboundRtpAudio;
    private final OutboundRtpVideo outboundRtpVideo;
    private final Transport transport;

    public Stats(Transport transport, OutboundRtpAudio outboundRtpAudio, OutboundRtpVideo outboundRtpVideo, HashMap<String, InboundRtpAudio> inboundRtpAudio, HashMap<String, InboundRtpVideo> inboundRtpVideo) {
        C9612q.m13917h(inboundRtpAudio, "inboundRtpAudio");
        C9612q.m13917h(inboundRtpVideo, "inboundRtpVideo");
        this.transport = transport;
        this.outboundRtpAudio = outboundRtpAudio;
        this.outboundRtpVideo = outboundRtpVideo;
        this.inboundRtpAudio = inboundRtpAudio;
        this.inboundRtpVideo = inboundRtpVideo;
    }

    public static /* synthetic */ Stats copy$default(Stats stats, Transport transport, OutboundRtpAudio outboundRtpAudio, OutboundRtpVideo outboundRtpVideo, HashMap hashMap, HashMap hashMap2, int i, Object obj) {
        if ((i & 1) != 0) {
            transport = stats.transport;
        }
        if ((i & 2) != 0) {
            outboundRtpAudio = stats.outboundRtpAudio;
        }
        OutboundRtpAudio outboundRtpAudio2 = outboundRtpAudio;
        if ((i & 4) != 0) {
            outboundRtpVideo = stats.outboundRtpVideo;
        }
        OutboundRtpVideo outboundRtpVideo2 = outboundRtpVideo;
        HashMap<String, InboundRtpAudio> hashMap3 = hashMap;
        if ((i & 8) != 0) {
            hashMap3 = stats.inboundRtpAudio;
        }
        HashMap hashMap4 = hashMap3;
        HashMap<String, InboundRtpVideo> hashMap5 = hashMap2;
        if ((i & 16) != 0) {
            hashMap5 = stats.inboundRtpVideo;
        }
        return stats.copy(transport, outboundRtpAudio2, outboundRtpVideo2, hashMap4, hashMap5);
    }

    public final Transport component1() {
        return this.transport;
    }

    public final OutboundRtpAudio component2() {
        return this.outboundRtpAudio;
    }

    public final OutboundRtpVideo component3() {
        return this.outboundRtpVideo;
    }

    public final HashMap<String, InboundRtpAudio> component4() {
        return this.inboundRtpAudio;
    }

    public final HashMap<String, InboundRtpVideo> component5() {
        return this.inboundRtpVideo;
    }

    public final Stats copy(Transport transport, OutboundRtpAudio outboundRtpAudio, OutboundRtpVideo outboundRtpVideo, HashMap<String, InboundRtpAudio> inboundRtpAudio, HashMap<String, InboundRtpVideo> inboundRtpVideo) {
        C9612q.m13917h(inboundRtpAudio, "inboundRtpAudio");
        C9612q.m13917h(inboundRtpVideo, "inboundRtpVideo");
        return new Stats(transport, outboundRtpAudio, outboundRtpVideo, inboundRtpAudio, inboundRtpVideo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Stats) {
            Stats stats = (Stats) obj;
            return C9612q.m13922c(this.transport, stats.transport) && C9612q.m13922c(this.outboundRtpAudio, stats.outboundRtpAudio) && C9612q.m13922c(this.outboundRtpVideo, stats.outboundRtpVideo) && C9612q.m13922c(this.inboundRtpAudio, stats.inboundRtpAudio) && C9612q.m13922c(this.inboundRtpVideo, stats.inboundRtpVideo);
        }
        return false;
    }

    public final HashMap<String, InboundRtpAudio> getInboundRtpAudio() {
        return this.inboundRtpAudio;
    }

    public final HashMap<String, InboundRtpVideo> getInboundRtpVideo() {
        return this.inboundRtpVideo;
    }

    public final OutboundRtpAudio getOutboundRtpAudio() {
        return this.outboundRtpAudio;
    }

    public final OutboundRtpVideo getOutboundRtpVideo() {
        return this.outboundRtpVideo;
    }

    public final Transport getTransport() {
        return this.transport;
    }

    public int hashCode() {
        Transport transport = this.transport;
        int hashCode = (transport == null ? 0 : transport.hashCode()) * 31;
        OutboundRtpAudio outboundRtpAudio = this.outboundRtpAudio;
        int hashCode2 = (hashCode + (outboundRtpAudio == null ? 0 : outboundRtpAudio.hashCode())) * 31;
        OutboundRtpVideo outboundRtpVideo = this.outboundRtpVideo;
        return ((((hashCode2 + (outboundRtpVideo != null ? outboundRtpVideo.hashCode() : 0)) * 31) + this.inboundRtpAudio.hashCode()) * 31) + this.inboundRtpVideo.hashCode();
    }

    public String toString() {
        Transport transport = this.transport;
        OutboundRtpAudio outboundRtpAudio = this.outboundRtpAudio;
        OutboundRtpVideo outboundRtpVideo = this.outboundRtpVideo;
        HashMap<String, InboundRtpAudio> hashMap = this.inboundRtpAudio;
        HashMap<String, InboundRtpVideo> hashMap2 = this.inboundRtpVideo;
        return "Stats(transport=" + transport + ", outboundRtpAudio=" + outboundRtpAudio + ", outboundRtpVideo=" + outboundRtpVideo + ", inboundRtpAudio=" + hashMap + ", inboundRtpVideo=" + hashMap2 + ")";
    }
}