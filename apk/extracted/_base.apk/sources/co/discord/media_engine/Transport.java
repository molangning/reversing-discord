package co.discord.media_engine;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0015J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0016\u00101\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J°\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u0003HÖ\u0001J\t\u0010A\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b#\u0010\u001cR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b$\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b(\u0010\u001fR\u001b\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b,\u0010\u001f¨\u0006B"}, m14357d2 = {"Lco/discord/media_engine/Transport;", "", "availableOutgoingBitrate", "", "bytesReceived", "", "bytesSent", "inboundBitrateEstimate", "localAddress", "", "outboundBitrateEstimate", "pacerDelay", "packetsReceived", "packetsSent", "ping", "decryptionFailures", "receiverBitrateEstimate", "receiverReports", "", "Lco/discord/media_engine/ReceiverReport;", "routingFailures", "(IJJLjava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;JJILjava/lang/Integer;Ljava/lang/Long;[Lco/discord/media_engine/ReceiverReport;Ljava/lang/Long;)V", "getAvailableOutgoingBitrate", "()I", "getBytesReceived", "()J", "getBytesSent", "getDecryptionFailures", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInboundBitrateEstimate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLocalAddress", "()Ljava/lang/String;", "getOutboundBitrateEstimate", "getPacerDelay", "getPacketsReceived", "getPacketsSent", "getPing", "getReceiverBitrateEstimate", "getReceiverReports", "()[Lco/discord/media_engine/ReceiverReport;", "[Lco/discord/media_engine/ReceiverReport;", "getRoutingFailures", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IJJLjava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;JJILjava/lang/Integer;Ljava/lang/Long;[Lco/discord/media_engine/ReceiverReport;Ljava/lang/Long;)Lco/discord/media_engine/Transport;", "equals", "", "other", "hashCode", "toString", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class Transport {
    private final int availableOutgoingBitrate;
    private final long bytesReceived;
    private final long bytesSent;
    private final Integer decryptionFailures;
    private final Long inboundBitrateEstimate;
    private final String localAddress;
    private final Integer outboundBitrateEstimate;
    private final Long pacerDelay;
    private final long packetsReceived;
    private final long packetsSent;
    private final int ping;
    private final Long receiverBitrateEstimate;
    private final ReceiverReport[] receiverReports;
    private final Long routingFailures;

    public Transport(int i, long j, long j2, Long l, String str, Integer num, Long l2, long j3, long j4, int i2, Integer num2, Long l3, ReceiverReport[] receiverReportArr, Long l4) {
        this.availableOutgoingBitrate = i;
        this.bytesReceived = j;
        this.bytesSent = j2;
        this.inboundBitrateEstimate = l;
        this.localAddress = str;
        this.outboundBitrateEstimate = num;
        this.pacerDelay = l2;
        this.packetsReceived = j3;
        this.packetsSent = j4;
        this.ping = i2;
        this.decryptionFailures = num2;
        this.receiverBitrateEstimate = l3;
        this.receiverReports = receiverReportArr;
        this.routingFailures = l4;
    }

    public final int component1() {
        return this.availableOutgoingBitrate;
    }

    public final int component10() {
        return this.ping;
    }

    public final Integer component11() {
        return this.decryptionFailures;
    }

    public final Long component12() {
        return this.receiverBitrateEstimate;
    }

    public final ReceiverReport[] component13() {
        return this.receiverReports;
    }

    public final Long component14() {
        return this.routingFailures;
    }

    public final long component2() {
        return this.bytesReceived;
    }

    public final long component3() {
        return this.bytesSent;
    }

    public final Long component4() {
        return this.inboundBitrateEstimate;
    }

    public final String component5() {
        return this.localAddress;
    }

    public final Integer component6() {
        return this.outboundBitrateEstimate;
    }

    public final Long component7() {
        return this.pacerDelay;
    }

    public final long component8() {
        return this.packetsReceived;
    }

    public final long component9() {
        return this.packetsSent;
    }

    public final Transport copy(int i, long j, long j2, Long l, String str, Integer num, Long l2, long j3, long j4, int i2, Integer num2, Long l3, ReceiverReport[] receiverReportArr, Long l4) {
        return new Transport(i, j, j2, l, str, num, l2, j3, j4, i2, num2, l3, receiverReportArr, l4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Transport) {
            Transport transport = (Transport) obj;
            return this.availableOutgoingBitrate == transport.availableOutgoingBitrate && this.bytesReceived == transport.bytesReceived && this.bytesSent == transport.bytesSent && C9612q.m13922c(this.inboundBitrateEstimate, transport.inboundBitrateEstimate) && C9612q.m13922c(this.localAddress, transport.localAddress) && C9612q.m13922c(this.outboundBitrateEstimate, transport.outboundBitrateEstimate) && C9612q.m13922c(this.pacerDelay, transport.pacerDelay) && this.packetsReceived == transport.packetsReceived && this.packetsSent == transport.packetsSent && this.ping == transport.ping && C9612q.m13922c(this.decryptionFailures, transport.decryptionFailures) && C9612q.m13922c(this.receiverBitrateEstimate, transport.receiverBitrateEstimate) && C9612q.m13922c(this.receiverReports, transport.receiverReports) && C9612q.m13922c(this.routingFailures, transport.routingFailures);
        }
        return false;
    }

    public final int getAvailableOutgoingBitrate() {
        return this.availableOutgoingBitrate;
    }

    public final long getBytesReceived() {
        return this.bytesReceived;
    }

    public final long getBytesSent() {
        return this.bytesSent;
    }

    public final Integer getDecryptionFailures() {
        return this.decryptionFailures;
    }

    public final Long getInboundBitrateEstimate() {
        return this.inboundBitrateEstimate;
    }

    public final String getLocalAddress() {
        return this.localAddress;
    }

    public final Integer getOutboundBitrateEstimate() {
        return this.outboundBitrateEstimate;
    }

    public final Long getPacerDelay() {
        return this.pacerDelay;
    }

    public final long getPacketsReceived() {
        return this.packetsReceived;
    }

    public final long getPacketsSent() {
        return this.packetsSent;
    }

    public final int getPing() {
        return this.ping;
    }

    public final Long getReceiverBitrateEstimate() {
        return this.receiverBitrateEstimate;
    }

    public final ReceiverReport[] getReceiverReports() {
        return this.receiverReports;
    }

    public final Long getRoutingFailures() {
        return this.routingFailures;
    }

    public int hashCode() {
        int m32716a = ((((this.availableOutgoingBitrate * 31) + C2689b.m32716a(this.bytesReceived)) * 31) + C2689b.m32716a(this.bytesSent)) * 31;
        Long l = this.inboundBitrateEstimate;
        int hashCode = (m32716a + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.localAddress;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.outboundBitrateEstimate;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.pacerDelay;
        int hashCode4 = (((((((hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31) + C2689b.m32716a(this.packetsReceived)) * 31) + C2689b.m32716a(this.packetsSent)) * 31) + this.ping) * 31;
        Integer num2 = this.decryptionFailures;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l3 = this.receiverBitrateEstimate;
        int hashCode6 = (hashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        ReceiverReport[] receiverReportArr = this.receiverReports;
        int hashCode7 = (hashCode6 + (receiverReportArr == null ? 0 : Arrays.hashCode(receiverReportArr))) * 31;
        Long l4 = this.routingFailures;
        return hashCode7 + (l4 != null ? l4.hashCode() : 0);
    }

    public String toString() {
        int i = this.availableOutgoingBitrate;
        long j = this.bytesReceived;
        long j2 = this.bytesSent;
        Long l = this.inboundBitrateEstimate;
        String str = this.localAddress;
        Integer num = this.outboundBitrateEstimate;
        Long l2 = this.pacerDelay;
        long j3 = this.packetsReceived;
        long j4 = this.packetsSent;
        int i2 = this.ping;
        Integer num2 = this.decryptionFailures;
        Long l3 = this.receiverBitrateEstimate;
        String arrays = Arrays.toString(this.receiverReports);
        Long l4 = this.routingFailures;
        return "Transport(availableOutgoingBitrate=" + i + ", bytesReceived=" + j + ", bytesSent=" + j2 + ", inboundBitrateEstimate=" + l + ", localAddress=" + str + ", outboundBitrateEstimate=" + num + ", pacerDelay=" + l2 + ", packetsReceived=" + j3 + ", packetsSent=" + j4 + ", ping=" + i2 + ", decryptionFailures=" + num2 + ", receiverBitrateEstimate=" + l3 + ", receiverReports=" + arrays + ", routingFailures=" + l4 + ")";
    }
}
