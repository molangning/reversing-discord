package co.discord.media_engine.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import org.webrtc.MediaStreamTrack;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m14357d2 = {"Lco/discord/media_engine/internal/Inbound;", "", "id", "", MediaStreamTrack.AUDIO_TRACK_KIND, "Lco/discord/media_engine/internal/InboundAudio;", MediaStreamTrack.VIDEO_TRACK_KIND, "Lco/discord/media_engine/internal/InboundVideo;", "playout", "Lco/discord/media_engine/internal/InboundPlayout;", "(Ljava/lang/String;Lco/discord/media_engine/internal/InboundAudio;Lco/discord/media_engine/internal/InboundVideo;Lco/discord/media_engine/internal/InboundPlayout;)V", "getAudio", "()Lco/discord/media_engine/internal/InboundAudio;", "getId", "()Ljava/lang/String;", "getPlayout", "()Lco/discord/media_engine/internal/InboundPlayout;", "getVideo", "()Lco/discord/media_engine/internal/InboundVideo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class Inbound {
    private final InboundAudio audio;

    /* renamed from: id */
    private final String f7191id;
    private final InboundPlayout playout;
    private final InboundVideo video;

    public Inbound(String id2, InboundAudio audio, InboundVideo inboundVideo, InboundPlayout inboundPlayout) {
        C9612q.m13917h(id2, "id");
        C9612q.m13917h(audio, "audio");
        this.f7191id = id2;
        this.audio = audio;
        this.video = inboundVideo;
        this.playout = inboundPlayout;
    }

    public static /* synthetic */ Inbound copy$default(Inbound inbound, String str, InboundAudio inboundAudio, InboundVideo inboundVideo, InboundPlayout inboundPlayout, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inbound.f7191id;
        }
        if ((i & 2) != 0) {
            inboundAudio = inbound.audio;
        }
        if ((i & 4) != 0) {
            inboundVideo = inbound.video;
        }
        if ((i & 8) != 0) {
            inboundPlayout = inbound.playout;
        }
        return inbound.copy(str, inboundAudio, inboundVideo, inboundPlayout);
    }

    public final String component1() {
        return this.f7191id;
    }

    public final InboundAudio component2() {
        return this.audio;
    }

    public final InboundVideo component3() {
        return this.video;
    }

    public final InboundPlayout component4() {
        return this.playout;
    }

    public final Inbound copy(String id2, InboundAudio audio, InboundVideo inboundVideo, InboundPlayout inboundPlayout) {
        C9612q.m13917h(id2, "id");
        C9612q.m13917h(audio, "audio");
        return new Inbound(id2, audio, inboundVideo, inboundPlayout);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Inbound) {
            Inbound inbound = (Inbound) obj;
            return C9612q.m13922c(this.f7191id, inbound.f7191id) && C9612q.m13922c(this.audio, inbound.audio) && C9612q.m13922c(this.video, inbound.video) && C9612q.m13922c(this.playout, inbound.playout);
        }
        return false;
    }

    public final InboundAudio getAudio() {
        return this.audio;
    }

    public final String getId() {
        return this.f7191id;
    }

    public final InboundPlayout getPlayout() {
        return this.playout;
    }

    public final InboundVideo getVideo() {
        return this.video;
    }

    public int hashCode() {
        int hashCode = ((this.f7191id.hashCode() * 31) + this.audio.hashCode()) * 31;
        InboundVideo inboundVideo = this.video;
        int hashCode2 = (hashCode + (inboundVideo == null ? 0 : inboundVideo.hashCode())) * 31;
        InboundPlayout inboundPlayout = this.playout;
        return hashCode2 + (inboundPlayout != null ? inboundPlayout.hashCode() : 0);
    }

    public String toString() {
        String str = this.f7191id;
        InboundAudio inboundAudio = this.audio;
        InboundVideo inboundVideo = this.video;
        InboundPlayout inboundPlayout = this.playout;
        return "Inbound(id=" + str + ", audio=" + inboundAudio + ", video=" + inboundVideo + ", playout=" + inboundPlayout + ")";
    }
}
