package co.discord.media_engine.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import org.webrtc.MediaStreamTrack;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ6\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m14357d2 = {"Lco/discord/media_engine/internal/Outbound;", "", "id", "", MediaStreamTrack.AUDIO_TRACK_KIND, "Lco/discord/media_engine/internal/OutboundAudio;", "videos", "", "Lco/discord/media_engine/internal/OutboundVideo;", "(Ljava/lang/String;Lco/discord/media_engine/internal/OutboundAudio;[Lco/discord/media_engine/internal/OutboundVideo;)V", "getAudio", "()Lco/discord/media_engine/internal/OutboundAudio;", "getId", "()Ljava/lang/String;", "getVideos", "()[Lco/discord/media_engine/internal/OutboundVideo;", "[Lco/discord/media_engine/internal/OutboundVideo;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Lco/discord/media_engine/internal/OutboundAudio;[Lco/discord/media_engine/internal/OutboundVideo;)Lco/discord/media_engine/internal/Outbound;", "equals", "", "other", "hashCode", "", "toString", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class Outbound {
    private final OutboundAudio audio;

    /* renamed from: id */
    private final String f7192id;
    private final OutboundVideo[] videos;

    public Outbound(String id2, OutboundAudio outboundAudio, OutboundVideo[] outboundVideoArr) {
        C9612q.m13917h(id2, "id");
        this.f7192id = id2;
        this.audio = outboundAudio;
        this.videos = outboundVideoArr;
    }

    public static /* synthetic */ Outbound copy$default(Outbound outbound, String str, OutboundAudio outboundAudio, OutboundVideo[] outboundVideoArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = outbound.f7192id;
        }
        if ((i & 2) != 0) {
            outboundAudio = outbound.audio;
        }
        if ((i & 4) != 0) {
            outboundVideoArr = outbound.videos;
        }
        return outbound.copy(str, outboundAudio, outboundVideoArr);
    }

    public final String component1() {
        return this.f7192id;
    }

    public final OutboundAudio component2() {
        return this.audio;
    }

    public final OutboundVideo[] component3() {
        return this.videos;
    }

    public final Outbound copy(String id2, OutboundAudio outboundAudio, OutboundVideo[] outboundVideoArr) {
        C9612q.m13917h(id2, "id");
        return new Outbound(id2, outboundAudio, outboundVideoArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Outbound) {
            Outbound outbound = (Outbound) obj;
            return C9612q.m13922c(this.f7192id, outbound.f7192id) && C9612q.m13922c(this.audio, outbound.audio) && C9612q.m13922c(this.videos, outbound.videos);
        }
        return false;
    }

    public final OutboundAudio getAudio() {
        return this.audio;
    }

    public final String getId() {
        return this.f7192id;
    }

    public final OutboundVideo[] getVideos() {
        return this.videos;
    }

    public int hashCode() {
        int hashCode = this.f7192id.hashCode() * 31;
        OutboundAudio outboundAudio = this.audio;
        int hashCode2 = (hashCode + (outboundAudio == null ? 0 : outboundAudio.hashCode())) * 31;
        OutboundVideo[] outboundVideoArr = this.videos;
        return hashCode2 + (outboundVideoArr != null ? Arrays.hashCode(outboundVideoArr) : 0);
    }

    public String toString() {
        String str = this.f7192id;
        OutboundAudio outboundAudio = this.audio;
        String arrays = Arrays.toString(this.videos);
        return "Outbound(id=" + str + ", audio=" + outboundAudio + ", videos=" + arrays + ")";
    }
}