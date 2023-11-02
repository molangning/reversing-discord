package co.discord.media_engine.internal;

import co.discord.media_engine.C2689b;
import co.discord.media_engine.ReceiverReport;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0006\u0012\n\u0010\u0007\u001a\u00060\u0003j\u0002`\b\u0012\n\u0010\t\u001a\u00060\nj\u0002`\u000b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\n\u0010\r\u001a\u00060\u0003j\u0002`\b\u0012\n\u0010\u000e\u001a\u00060\u0003j\u0002`\u0006\u0012\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u0006\u0012\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u0006\u0012\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0006\u0012\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0006\u0012\n\u0010\u0013\u001a\u00060\nj\u0002`\u000b\u0012\n\u0010\u0014\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0002\u0010\u001aJ\r\u0010/\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u00100\u001a\u00060\u0003j\u0002`\u0006HÆ\u0003J\r\u00101\u001a\u00060\u0003j\u0002`\u0006HÆ\u0003J\r\u00102\u001a\u00060\nj\u0002`\u000bHÆ\u0003J\r\u00103\u001a\u00060\nj\u0002`\u000bHÆ\u0003J\t\u00104\u001a\u00020\u0016HÆ\u0003J\u0016\u00105\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010*J\r\u00106\u001a\u00060\u0003j\u0002`\u0006HÆ\u0003J\r\u00107\u001a\u00060\u0003j\u0002`\bHÆ\u0003J\r\u00108\u001a\u00060\nj\u0002`\u000bHÆ\u0003J\r\u00109\u001a\u00060\nj\u0002`\u000bHÆ\u0003J\r\u0010:\u001a\u00060\u0003j\u0002`\bHÆ\u0003J\r\u0010;\u001a\u00060\u0003j\u0002`\u0006HÆ\u0003J\r\u0010<\u001a\u00060\u0003j\u0002`\u0006HÆ\u0003J\r\u0010=\u001a\u00060\u0003j\u0002`\u0006HÆ\u0003Jà\u0001\u0010>\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00062\f\b\u0002\u0010\u0007\u001a\u00060\u0003j\u0002`\b2\f\b\u0002\u0010\t\u001a\u00060\nj\u0002`\u000b2\f\b\u0002\u0010\f\u001a\u00060\nj\u0002`\u000b2\f\b\u0002\u0010\r\u001a\u00060\u0003j\u0002`\b2\f\b\u0002\u0010\u000e\u001a\u00060\u0003j\u0002`\u00062\f\b\u0002\u0010\u000f\u001a\u00060\u0003j\u0002`\u00062\f\b\u0002\u0010\u0010\u001a\u00060\u0003j\u0002`\u00062\f\b\u0002\u0010\u0011\u001a\u00060\u0003j\u0002`\u00062\f\b\u0002\u0010\u0012\u001a\u00060\u0003j\u0002`\u00062\f\b\u0002\u0010\u0013\u001a\u00060\nj\u0002`\u000b2\f\b\u0002\u0010\u0014\u001a\u00060\nj\u0002`\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0001¢\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\nHÖ\u0001J\t\u0010D\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u000e\u001a\u00060\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u000f\u001a\u00060\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0015\u0010\u0007\u001a\u00060\u0003j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\t\u001a\u00060\nj\u0002`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0015\u0010\u0012\u001a\u00060\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0015\u0010\u0010\u001a\u00060\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0015\u0010\u0011\u001a\u00060\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0015\u0010\r\u001a\u00060\u0003j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u001b\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0015\u0010\u0005\u001a\u00060\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0015\u0010\u0013\u001a\u00060\nj\u0002`\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0015\u0010\u0014\u001a\u00060\nj\u0002`\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#¨\u0006E"}, m14357d2 = {"Lco/discord/media_engine/internal/Transport;", "", "decryptionFailures", "", "Lco/discord/media_engine/internal/U32;", "routingFailures", "Lco/discord/media_engine/internal/I64;", "inboundBitrateEstimate", "Lco/discord/media_engine/internal/U64;", "maxPaddingBitrate", "", "Lco/discord/media_engine/internal/I32;", "outboundBitrateEstimate", "receiverBitrateEstimate", "bytesReceived", "bytesSent", "packetsReceived", "packetsSent", "pacerDelay", "rtt", "sendBandwidth", "localAddress", "", "receiverReports", "", "Lco/discord/media_engine/ReceiverReport;", "(JJJIIJJJJJJIILjava/lang/String;[Lco/discord/media_engine/ReceiverReport;)V", "getBytesReceived", "()J", "getBytesSent", "getDecryptionFailures", "getInboundBitrateEstimate", "getLocalAddress", "()Ljava/lang/String;", "getMaxPaddingBitrate", "()I", "getOutboundBitrateEstimate", "getPacerDelay", "getPacketsReceived", "getPacketsSent", "getReceiverBitrateEstimate", "getReceiverReports", "()[Lco/discord/media_engine/ReceiverReport;", "[Lco/discord/media_engine/ReceiverReport;", "getRoutingFailures", "getRtt", "getSendBandwidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJJIIJJJJJJIILjava/lang/String;[Lco/discord/media_engine/ReceiverReport;)Lco/discord/media_engine/internal/Transport;", "equals", "", "other", "hashCode", "toString", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class Transport {
    private final long bytesReceived;
    private final long bytesSent;
    private final long decryptionFailures;
    private final long inboundBitrateEstimate;
    private final String localAddress;
    private final int maxPaddingBitrate;
    private final int outboundBitrateEstimate;
    private final long pacerDelay;
    private final long packetsReceived;
    private final long packetsSent;
    private final long receiverBitrateEstimate;
    private final ReceiverReport[] receiverReports;
    private final long routingFailures;
    private final int rtt;
    private final int sendBandwidth;

    public Transport(long j, long j2, long j3, int i, int i2, long j4, long j5, long j6, long j7, long j8, long j9, int i3, int i4, String localAddress, ReceiverReport[] receiverReportArr) {
        C9612q.m13917h(localAddress, "localAddress");
        this.decryptionFailures = j;
        this.routingFailures = j2;
        this.inboundBitrateEstimate = j3;
        this.maxPaddingBitrate = i;
        this.outboundBitrateEstimate = i2;
        this.receiverBitrateEstimate = j4;
        this.bytesReceived = j5;
        this.bytesSent = j6;
        this.packetsReceived = j7;
        this.packetsSent = j8;
        this.pacerDelay = j9;
        this.rtt = i3;
        this.sendBandwidth = i4;
        this.localAddress = localAddress;
        this.receiverReports = receiverReportArr;
    }

    public final long component1() {
        return this.decryptionFailures;
    }

    public final long component10() {
        return this.packetsSent;
    }

    public final long component11() {
        return this.pacerDelay;
    }

    public final int component12() {
        return this.rtt;
    }

    public final int component13() {
        return this.sendBandwidth;
    }

    public final String component14() {
        return this.localAddress;
    }

    public final ReceiverReport[] component15() {
        return this.receiverReports;
    }

    public final long component2() {
        return this.routingFailures;
    }

    public final long component3() {
        return this.inboundBitrateEstimate;
    }

    public final int component4() {
        return this.maxPaddingBitrate;
    }

    public final int component5() {
        return this.outboundBitrateEstimate;
    }

    public final long component6() {
        return this.receiverBitrateEstimate;
    }

    public final long component7() {
        return this.bytesReceived;
    }

    public final long component8() {
        return this.bytesSent;
    }

    public final long component9() {
        return this.packetsReceived;
    }

    public final Transport copy(long j, long j2, long j3, int i, int i2, long j4, long j5, long j6, long j7, long j8, long j9, int i3, int i4, String localAddress, ReceiverReport[] receiverReportArr) {
        C9612q.m13917h(localAddress, "localAddress");
        return new Transport(j, j2, j3, i, i2, j4, j5, j6, j7, j8, j9, i3, i4, localAddress, receiverReportArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Transport) {
            Transport transport = (Transport) obj;
            return this.decryptionFailures == transport.decryptionFailures && this.routingFailures == transport.routingFailures && this.inboundBitrateEstimate == transport.inboundBitrateEstimate && this.maxPaddingBitrate == transport.maxPaddingBitrate && this.outboundBitrateEstimate == transport.outboundBitrateEstimate && this.receiverBitrateEstimate == transport.receiverBitrateEstimate && this.bytesReceived == transport.bytesReceived && this.bytesSent == transport.bytesSent && this.packetsReceived == transport.packetsReceived && this.packetsSent == transport.packetsSent && this.pacerDelay == transport.pacerDelay && this.rtt == transport.rtt && this.sendBandwidth == transport.sendBandwidth && C9612q.m13922c(this.localAddress, transport.localAddress) && C9612q.m13922c(this.receiverReports, transport.receiverReports);
        }
        return false;
    }

    public final long getBytesReceived() {
        return this.bytesReceived;
    }

    public final long getBytesSent() {
        return this.bytesSent;
    }

    public final long getDecryptionFailures() {
        return this.decryptionFailures;
    }

    public final long getInboundBitrateEstimate() {
        return this.inboundBitrateEstimate;
    }

    public final String getLocalAddress() {
        return this.localAddress;
    }

    public final int getMaxPaddingBitrate() {
        return this.maxPaddingBitrate;
    }

    public final int getOutboundBitrateEstimate() {
        return this.outboundBitrateEstimate;
    }

    public final long getPacerDelay() {
        return this.pacerDelay;
    }

    public final long getPacketsReceived() {
        return this.packetsReceived;
    }

    public final long getPacketsSent() {
        return this.packetsSent;
    }

    public final long getReceiverBitrateEstimate() {
        return this.receiverBitrateEstimate;
    }

    public final ReceiverReport[] getReceiverReports() {
        return this.receiverReports;
    }

    public final long getRoutingFailures() {
        return this.routingFailures;
    }

    public final int getRtt() {
        return this.rtt;
    }

    public final int getSendBandwidth() {
        return this.sendBandwidth;
    }

    public int hashCode() {
        int m32716a = ((((((((((((((((((((((((((C2689b.m32716a(this.decryptionFailures) * 31) + C2689b.m32716a(this.routingFailures)) * 31) + C2689b.m32716a(this.inboundBitrateEstimate)) * 31) + this.maxPaddingBitrate) * 31) + this.outboundBitrateEstimate) * 31) + C2689b.m32716a(this.receiverBitrateEstimate)) * 31) + C2689b.m32716a(this.bytesReceived)) * 31) + C2689b.m32716a(this.bytesSent)) * 31) + C2689b.m32716a(this.packetsReceived)) * 31) + C2689b.m32716a(this.packetsSent)) * 31) + C2689b.m32716a(this.pacerDelay)) * 31) + this.rtt) * 31) + this.sendBandwidth) * 31) + this.localAddress.hashCode()) * 31;
        ReceiverReport[] receiverReportArr = this.receiverReports;
        return m32716a + (receiverReportArr == null ? 0 : Arrays.hashCode(receiverReportArr));
    }

    public String toString() {
        long j = this.decryptionFailures;
        long j2 = this.routingFailures;
        long j3 = this.inboundBitrateEstimate;
        int i = this.maxPaddingBitrate;
        int i2 = this.outboundBitrateEstimate;
        long j4 = this.receiverBitrateEstimate;
        long j5 = this.bytesReceived;
        long j6 = this.bytesSent;
        long j7 = this.packetsReceived;
        long j8 = this.packetsSent;
        long j9 = this.pacerDelay;
        int i3 = this.rtt;
        int i4 = this.sendBandwidth;
        String str = this.localAddress;
        String arrays = Arrays.toString(this.receiverReports);
        return "Transport(decryptionFailures=" + j + ", routingFailures=" + j2 + ", inboundBitrateEstimate=" + j3 + ", maxPaddingBitrate=" + i + ", outboundBitrateEstimate=" + i2 + ", receiverBitrateEstimate=" + j4 + ", bytesReceived=" + j5 + ", bytesSent=" + j6 + ", packetsReceived=" + j7 + ", packetsSent=" + j8 + ", pacerDelay=" + j9 + ", rtt=" + i3 + ", sendBandwidth=" + i4 + ", localAddress=" + str + ", receiverReports=" + arrays + ")";
    }
}
