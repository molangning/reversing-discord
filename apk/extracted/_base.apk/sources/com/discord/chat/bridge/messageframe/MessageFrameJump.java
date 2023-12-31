package com.discord.chat.bridge.messageframe;

import com.discord.chat.bridge.messageframe.MessageFrameType;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2560a2;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, m14357d2 = {"Lcom/discord/chat/bridge/messageframe/MessageFrameJump;", "Lcom/discord/chat/bridge/messageframe/MessageFrame;", "seen1", "", "type", "Lcom/discord/chat/bridge/messageframe/MessageFrameType;", "guildName", "", "channelName", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/messageframe/MessageFrameType;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/bridge/messageframe/MessageFrameType;Ljava/lang/String;Ljava/lang/String;)V", "getChannelName", "()Ljava/lang/String;", "getGuildName", "getType", "()Lcom/discord/chat/bridge/messageframe/MessageFrameType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageFrameJump extends MessageFrame {
    public static final Companion Companion = new Companion(null);
    private final String channelName;
    private final String guildName;
    private final MessageFrameType type;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/messageframe/MessageFrameJump$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/messageframe/MessageFrameJump;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MessageFrameJump> serializer() {
            return MessageFrameJump$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MessageFrameJump(int i, MessageFrameType messageFrameType, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (1 != (i & 1)) {
            C2620n1.m32836b(i, 1, MessageFrameJump$$serializer.INSTANCE.getDescriptor());
        }
        this.type = messageFrameType;
        if ((i & 2) == 0) {
            this.guildName = null;
        } else {
            this.guildName = str;
        }
        if ((i & 4) == 0) {
            this.channelName = null;
        } else {
            this.channelName = str2;
        }
    }

    public static /* synthetic */ MessageFrameJump copy$default(MessageFrameJump messageFrameJump, MessageFrameType messageFrameType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            messageFrameType = messageFrameJump.getType();
        }
        if ((i & 2) != 0) {
            str = messageFrameJump.guildName;
        }
        if ((i & 4) != 0) {
            str2 = messageFrameJump.channelName;
        }
        return messageFrameJump.copy(messageFrameType, str, str2);
    }

    public static final void write$Self(MessageFrameJump self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z2 = false;
        output.mo12894i(serialDesc, 0, MessageFrameType.Serializer.INSTANCE, self.getType());
        if (output.mo12879z(serialDesc, 1) || self.guildName != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 1, C2560a2.f7013a, self.guildName);
        }
        if (output.mo12879z(serialDesc, 2) || self.channelName != null) {
            z2 = true;
        }
        if (z2) {
            output.mo12904E(serialDesc, 2, C2560a2.f7013a, self.channelName);
        }
    }

    public final MessageFrameType component1() {
        return getType();
    }

    public final String component2() {
        return this.guildName;
    }

    public final String component3() {
        return this.channelName;
    }

    public final MessageFrameJump copy(MessageFrameType type, String str, String str2) {
        C9612q.m13917h(type, "type");
        return new MessageFrameJump(type, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageFrameJump) {
            MessageFrameJump messageFrameJump = (MessageFrameJump) obj;
            return getType() == messageFrameJump.getType() && C9612q.m13922c(this.guildName, messageFrameJump.guildName) && C9612q.m13922c(this.channelName, messageFrameJump.channelName);
        }
        return false;
    }

    public final String getChannelName() {
        return this.channelName;
    }

    public final String getGuildName() {
        return this.guildName;
    }

    @Override // com.discord.chat.bridge.messageframe.MessageFrame
    public MessageFrameType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = getType().hashCode() * 31;
        String str = this.guildName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.channelName;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        MessageFrameType type = getType();
        String str = this.guildName;
        String str2 = this.channelName;
        return "MessageFrameJump(type=" + type + ", guildName=" + str + ", channelName=" + str2 + ")";
    }

    public /* synthetic */ MessageFrameJump(MessageFrameType messageFrameType, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageFrameType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageFrameJump(MessageFrameType type, String str, String str2) {
        super(null);
        C9612q.m13917h(type, "type");
        this.type = type;
        this.guildName = str;
        this.channelName = str2;
    }
}
