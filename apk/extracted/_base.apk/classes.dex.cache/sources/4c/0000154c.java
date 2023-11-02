package com.discord.chat.reactevents;

import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2590h;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B?\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J:\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J!\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÇ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013¨\u0006*"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapInviteEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "messageId", "", "index", "primary", "", "secondary", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;)V", "getIndex", "()I", "getMessageId", "()Ljava/lang/String;", "getPrimary", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSecondary", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;)Lcom/discord/chat/reactevents/TapInviteEvent;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TapInviteEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final int index;
    private final String messageId;
    private final Boolean primary;
    private final Boolean secondary;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapInviteEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapInviteEvent;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapInviteEvent> serializer() {
            return TapInviteEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TapInviteEvent(int i, String str, int i2, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            C2620n1.m32836b(i, 15, TapInviteEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.index = i2;
        this.primary = bool;
        this.secondary = bool2;
    }

    public static /* synthetic */ TapInviteEvent copy$default(TapInviteEvent tapInviteEvent, String str, int i, Boolean bool, Boolean bool2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tapInviteEvent.messageId;
        }
        if ((i2 & 2) != 0) {
            i = tapInviteEvent.index;
        }
        if ((i2 & 4) != 0) {
            bool = tapInviteEvent.primary;
        }
        if ((i2 & 8) != 0) {
            bool2 = tapInviteEvent.secondary;
        }
        return tapInviteEvent.copy(str, i, bool, bool2);
    }

    public static final void write$Self(TapInviteEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12880y(serialDesc, 0, self.messageId);
        output.mo12882w(serialDesc, 1, self.index);
        C2590h c2590h = C2590h.f7055a;
        output.mo12904E(serialDesc, 2, c2590h, self.primary);
        output.mo12904E(serialDesc, 3, c2590h, self.secondary);
    }

    public final String component1() {
        return this.messageId;
    }

    public final int component2() {
        return this.index;
    }

    public final Boolean component3() {
        return this.primary;
    }

    public final Boolean component4() {
        return this.secondary;
    }

    public final TapInviteEvent copy(String messageId, int i, Boolean bool, Boolean bool2) {
        C9612q.m13917h(messageId, "messageId");
        return new TapInviteEvent(messageId, i, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TapInviteEvent) {
            TapInviteEvent tapInviteEvent = (TapInviteEvent) obj;
            return C9612q.m13922c(this.messageId, tapInviteEvent.messageId) && this.index == tapInviteEvent.index && C9612q.m13922c(this.primary, tapInviteEvent.primary) && C9612q.m13922c(this.secondary, tapInviteEvent.secondary);
        }
        return false;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final Boolean getPrimary() {
        return this.primary;
    }

    public final Boolean getSecondary() {
        return this.secondary;
    }

    public int hashCode() {
        int hashCode = ((this.messageId.hashCode() * 31) + this.index) * 31;
        Boolean bool = this.primary;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.secondary;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = this.messageId;
        int i = this.index;
        Boolean bool = this.primary;
        Boolean bool2 = this.secondary;
        return "TapInviteEvent(messageId=" + str + ", index=" + i + ", primary=" + bool + ", secondary=" + bool2 + ")";
    }

    public TapInviteEvent(String messageId, int i, Boolean bool, Boolean bool2) {
        C9612q.m13917h(messageId, "messageId");
        this.messageId = messageId;
        this.index = i;
        this.primary = bool;
        this.secondary = bool2;
    }
}