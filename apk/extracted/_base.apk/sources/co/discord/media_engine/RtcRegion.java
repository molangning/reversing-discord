package co.discord.media_engine;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ(\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m14357d2 = {"Lco/discord/media_engine/RtcRegion;", "", "region", "", "ips", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "getIps", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getRegion", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;[Ljava/lang/String;)Lco/discord/media_engine/RtcRegion;", "equals", "", "other", "hashCode", "", "toString", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class RtcRegion {
    private final String[] ips;
    private final String region;

    public RtcRegion(String region, String[] ips) {
        C9612q.m13917h(region, "region");
        C9612q.m13917h(ips, "ips");
        this.region = region;
        this.ips = ips;
    }

    public static /* synthetic */ RtcRegion copy$default(RtcRegion rtcRegion, String str, String[] strArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rtcRegion.region;
        }
        if ((i & 2) != 0) {
            strArr = rtcRegion.ips;
        }
        return rtcRegion.copy(str, strArr);
    }

    public final String component1() {
        return this.region;
    }

    public final String[] component2() {
        return this.ips;
    }

    public final RtcRegion copy(String region, String[] ips) {
        C9612q.m13917h(region, "region");
        C9612q.m13917h(ips, "ips");
        return new RtcRegion(region, ips);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RtcRegion) {
            RtcRegion rtcRegion = (RtcRegion) obj;
            return C9612q.m13922c(this.region, rtcRegion.region) && C9612q.m13922c(this.ips, rtcRegion.ips);
        }
        return false;
    }

    public final String[] getIps() {
        return this.ips;
    }

    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        return (this.region.hashCode() * 31) + Arrays.hashCode(this.ips);
    }

    public String toString() {
        String str = this.region;
        String arrays = Arrays.toString(this.ips);
        return "RtcRegion(region=" + str + ", ips=" + arrays + ")";
    }
}
