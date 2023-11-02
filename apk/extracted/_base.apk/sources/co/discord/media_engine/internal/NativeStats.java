package co.discord.media_engine.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\rJD\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u001b\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m14357d2 = {"Lco/discord/media_engine/internal/NativeStats;", "", "transport", "Lco/discord/media_engine/internal/Transport;", "outbound", "Lco/discord/media_engine/internal/Outbound;", "screenshare", "Lco/discord/media_engine/internal/Screenshare;", "inbound", "", "Lco/discord/media_engine/internal/Inbound;", "(Lco/discord/media_engine/internal/Transport;Lco/discord/media_engine/internal/Outbound;Lco/discord/media_engine/internal/Screenshare;[Lco/discord/media_engine/internal/Inbound;)V", "getInbound", "()[Lco/discord/media_engine/internal/Inbound;", "[Lco/discord/media_engine/internal/Inbound;", "getOutbound", "()Lco/discord/media_engine/internal/Outbound;", "getScreenshare", "()Lco/discord/media_engine/internal/Screenshare;", "getTransport", "()Lco/discord/media_engine/internal/Transport;", "component1", "component2", "component3", "component4", "copy", "(Lco/discord/media_engine/internal/Transport;Lco/discord/media_engine/internal/Outbound;Lco/discord/media_engine/internal/Screenshare;[Lco/discord/media_engine/internal/Inbound;)Lco/discord/media_engine/internal/NativeStats;", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class NativeStats {
    private final Inbound[] inbound;
    private final Outbound outbound;
    private final Screenshare screenshare;
    private final Transport transport;

    public NativeStats(Transport transport, Outbound outbound, Screenshare screenshare, Inbound[] inboundArr) {
        this.transport = transport;
        this.outbound = outbound;
        this.screenshare = screenshare;
        this.inbound = inboundArr;
    }

    public static /* synthetic */ NativeStats copy$default(NativeStats nativeStats, Transport transport, Outbound outbound, Screenshare screenshare, Inbound[] inboundArr, int i, Object obj) {
        if ((i & 1) != 0) {
            transport = nativeStats.transport;
        }
        if ((i & 2) != 0) {
            outbound = nativeStats.outbound;
        }
        if ((i & 4) != 0) {
            screenshare = nativeStats.screenshare;
        }
        if ((i & 8) != 0) {
            inboundArr = nativeStats.inbound;
        }
        return nativeStats.copy(transport, outbound, screenshare, inboundArr);
    }

    public final Transport component1() {
        return this.transport;
    }

    public final Outbound component2() {
        return this.outbound;
    }

    public final Screenshare component3() {
        return this.screenshare;
    }

    public final Inbound[] component4() {
        return this.inbound;
    }

    public final NativeStats copy(Transport transport, Outbound outbound, Screenshare screenshare, Inbound[] inboundArr) {
        return new NativeStats(transport, outbound, screenshare, inboundArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NativeStats) {
            NativeStats nativeStats = (NativeStats) obj;
            return C9612q.m13922c(this.transport, nativeStats.transport) && C9612q.m13922c(this.outbound, nativeStats.outbound) && C9612q.m13922c(this.screenshare, nativeStats.screenshare) && C9612q.m13922c(this.inbound, nativeStats.inbound);
        }
        return false;
    }

    public final Inbound[] getInbound() {
        return this.inbound;
    }

    public final Outbound getOutbound() {
        return this.outbound;
    }

    public final Screenshare getScreenshare() {
        return this.screenshare;
    }

    public final Transport getTransport() {
        return this.transport;
    }

    public int hashCode() {
        Transport transport = this.transport;
        int hashCode = (transport == null ? 0 : transport.hashCode()) * 31;
        Outbound outbound = this.outbound;
        int hashCode2 = (hashCode + (outbound == null ? 0 : outbound.hashCode())) * 31;
        Screenshare screenshare = this.screenshare;
        int hashCode3 = (hashCode2 + (screenshare == null ? 0 : screenshare.hashCode())) * 31;
        Inbound[] inboundArr = this.inbound;
        return hashCode3 + (inboundArr != null ? Arrays.hashCode(inboundArr) : 0);
    }

    public String toString() {
        Transport transport = this.transport;
        Outbound outbound = this.outbound;
        Screenshare screenshare = this.screenshare;
        String arrays = Arrays.toString(this.inbound);
        return "NativeStats(transport=" + transport + ", outbound=" + outbound + ", screenshare=" + screenshare + ", inbound=" + arrays + ")";
    }
}
