package com.discord.media_player.reactevents;

import co.discord.media_engine.C2689b;
import co.discord.media_engine.C2690c;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#HÇ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006&"}, m14357d2 = {"Lcom/discord/media_player/reactevents/MediaPlayerProgress;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "id", "", "time", "", "duration", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDJJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(DJJ)V", "getDuration", "()J", "getId", "()D", "getTime", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "media_player_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaPlayerProgress implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final long duration;

    /* renamed from: id */
    private final double f8914id;
    private final long time;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/media_player/reactevents/MediaPlayerProgress$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media_player/reactevents/MediaPlayerProgress;", "media_player_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MediaPlayerProgress> serializer() {
            return MediaPlayerProgress$$serializer.INSTANCE;
        }
    }

    public MediaPlayerProgress(double d, long j, long j2) {
        this.f8914id = d;
        this.time = j;
        this.duration = j2;
    }

    public static /* synthetic */ MediaPlayerProgress copy$default(MediaPlayerProgress mediaPlayerProgress, double d, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = mediaPlayerProgress.f8914id;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            j = mediaPlayerProgress.time;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = mediaPlayerProgress.duration;
        }
        return mediaPlayerProgress.copy(d2, j3, j2);
    }

    public static final void write$Self(MediaPlayerProgress self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12906C(serialDesc, 0, self.f8914id);
        output.mo12905D(serialDesc, 1, self.time);
        output.mo12905D(serialDesc, 2, self.duration);
    }

    public final double component1() {
        return this.f8914id;
    }

    public final long component2() {
        return this.time;
    }

    public final long component3() {
        return this.duration;
    }

    public final MediaPlayerProgress copy(double d, long j, long j2) {
        return new MediaPlayerProgress(d, j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaPlayerProgress) {
            MediaPlayerProgress mediaPlayerProgress = (MediaPlayerProgress) obj;
            return Double.compare(this.f8914id, mediaPlayerProgress.f8914id) == 0 && this.time == mediaPlayerProgress.time && this.duration == mediaPlayerProgress.duration;
        }
        return false;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final double getId() {
        return this.f8914id;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((C2690c.m32715a(this.f8914id) * 31) + C2689b.m32716a(this.time)) * 31) + C2689b.m32716a(this.duration);
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        double d = this.f8914id;
        long j = this.time;
        long j2 = this.duration;
        return "MediaPlayerProgress(id=" + d + ", time=" + j + ", duration=" + j2 + ")";
    }

    public /* synthetic */ MediaPlayerProgress(int i, double d, long j, long j2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            C2620n1.m32836b(i, 7, MediaPlayerProgress$$serializer.INSTANCE.getDescriptor());
        }
        this.f8914id = d;
        this.time = j;
        this.duration = j2;
    }
}
