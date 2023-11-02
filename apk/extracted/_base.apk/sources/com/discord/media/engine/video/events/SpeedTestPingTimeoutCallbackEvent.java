package com.discord.media.engine.video.events;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
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

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002()BC\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001J!\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006*"}, m14357d2 = {"Lcom/discord/media/engine/video/events/SpeedTestPingTimeoutCallbackEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "connectionId", "server", "", ZeroconfModule.KEY_SERVICE_PORT, "seq", "timeout", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/lang/String;III)V", "getConnectionId", "()I", "getPort", "getSeq", "getServer", "()Ljava/lang/String;", "getTimeout", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "media_engine_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class SpeedTestPingTimeoutCallbackEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final int connectionId;
    private final int port;
    private final int seq;
    private final String server;
    private final int timeout;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/media/engine/video/events/SpeedTestPingTimeoutCallbackEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media/engine/video/events/SpeedTestPingTimeoutCallbackEvent;", "media_engine_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpeedTestPingTimeoutCallbackEvent> serializer() {
            return SpeedTestPingTimeoutCallbackEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpeedTestPingTimeoutCallbackEvent(int i, int i2, String str, int i3, int i4, int i5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            C2620n1.m32836b(i, 31, SpeedTestPingTimeoutCallbackEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.connectionId = i2;
        this.server = str;
        this.port = i3;
        this.seq = i4;
        this.timeout = i5;
    }

    public static /* synthetic */ SpeedTestPingTimeoutCallbackEvent copy$default(SpeedTestPingTimeoutCallbackEvent speedTestPingTimeoutCallbackEvent, int i, String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = speedTestPingTimeoutCallbackEvent.connectionId;
        }
        if ((i5 & 2) != 0) {
            str = speedTestPingTimeoutCallbackEvent.server;
        }
        String str2 = str;
        if ((i5 & 4) != 0) {
            i2 = speedTestPingTimeoutCallbackEvent.port;
        }
        int i6 = i2;
        if ((i5 & 8) != 0) {
            i3 = speedTestPingTimeoutCallbackEvent.seq;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = speedTestPingTimeoutCallbackEvent.timeout;
        }
        return speedTestPingTimeoutCallbackEvent.copy(i, str2, i6, i7, i4);
    }

    public static final void write$Self(SpeedTestPingTimeoutCallbackEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12882w(serialDesc, 0, self.connectionId);
        output.mo12880y(serialDesc, 1, self.server);
        output.mo12882w(serialDesc, 2, self.port);
        output.mo12882w(serialDesc, 3, self.seq);
        output.mo12882w(serialDesc, 4, self.timeout);
    }

    public final int component1() {
        return this.connectionId;
    }

    public final String component2() {
        return this.server;
    }

    public final int component3() {
        return this.port;
    }

    public final int component4() {
        return this.seq;
    }

    public final int component5() {
        return this.timeout;
    }

    public final SpeedTestPingTimeoutCallbackEvent copy(int i, String server, int i2, int i3, int i4) {
        C9612q.m13917h(server, "server");
        return new SpeedTestPingTimeoutCallbackEvent(i, server, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SpeedTestPingTimeoutCallbackEvent) {
            SpeedTestPingTimeoutCallbackEvent speedTestPingTimeoutCallbackEvent = (SpeedTestPingTimeoutCallbackEvent) obj;
            return this.connectionId == speedTestPingTimeoutCallbackEvent.connectionId && C9612q.m13922c(this.server, speedTestPingTimeoutCallbackEvent.server) && this.port == speedTestPingTimeoutCallbackEvent.port && this.seq == speedTestPingTimeoutCallbackEvent.seq && this.timeout == speedTestPingTimeoutCallbackEvent.timeout;
        }
        return false;
    }

    public final int getConnectionId() {
        return this.connectionId;
    }

    public final int getPort() {
        return this.port;
    }

    public final int getSeq() {
        return this.seq;
    }

    public final String getServer() {
        return this.server;
    }

    public final int getTimeout() {
        return this.timeout;
    }

    public int hashCode() {
        return (((((((this.connectionId * 31) + this.server.hashCode()) * 31) + this.port) * 31) + this.seq) * 31) + this.timeout;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        int i = this.connectionId;
        String str = this.server;
        int i2 = this.port;
        int i3 = this.seq;
        int i4 = this.timeout;
        return "SpeedTestPingTimeoutCallbackEvent(connectionId=" + i + ", server=" + str + ", port=" + i2 + ", seq=" + i3 + ", timeout=" + i4 + ")";
    }

    public SpeedTestPingTimeoutCallbackEvent(int i, String server, int i2, int i3, int i4) {
        C9612q.m13917h(server, "server");
        this.connectionId = i;
        this.server = server;
        this.port = i2;
        this.seq = i3;
        this.timeout = i4;
    }
}
