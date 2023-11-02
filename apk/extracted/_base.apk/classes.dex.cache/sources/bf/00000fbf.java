package com.discord.chat.bridge.contentnode;

import com.discord.chat.bridge.MessageType;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
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

@Metadata(m14358d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000278BX\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010ø\u0001\u0000¢\u0006\u0002\u0010\u0011BP\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b J\u001b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0014J\u0019\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b$J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0019\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b'J^\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001J!\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206HÇ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/CommandOnClick;", "", "seen1", "", "action", "", "userId", "Lcom/discord/primitives/UserId;", "messageId", "Lcom/discord/primitives/MessageId;", "applicationUserId", "messageType", "Lcom/discord/chat/bridge/MessageType;", "messageChannelId", "Lcom/discord/primitives/ChannelId;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAction", "()Ljava/lang/String;", "getApplicationUserId-wUX8bhU", "()Lcom/discord/primitives/UserId;", "getMessageChannelId-qMVnFVQ", "()Lcom/discord/primitives/ChannelId;", "getMessageId-N_6c4I0", "Ljava/lang/String;", "getMessageType", "()Lcom/discord/chat/bridge/MessageType;", "getUserId-wUX8bhU", "component1", "component2", "component2-wUX8bhU", "component3", "component3-N_6c4I0", "component4", "component4-wUX8bhU", "component5", "component6", "component6-qMVnFVQ", "copy", "copy-jIMHauk", "(Ljava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;)Lcom/discord/chat/bridge/contentnode/CommandOnClick;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class CommandOnClick {
    public static final Companion Companion = new Companion(null);
    private final String action;
    private final UserId applicationUserId;
    private final ChannelId messageChannelId;
    private final String messageId;
    private final MessageType messageType;
    private final UserId userId;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/CommandOnClick$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/CommandOnClick;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommandOnClick> serializer() {
            return CommandOnClick$$serializer.INSTANCE;
        }
    }

    private CommandOnClick(int i, String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            C2620n1.m32836b(i, 0, CommandOnClick$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.action = null;
        } else {
            this.action = str;
        }
        if ((i & 2) == 0) {
            this.userId = null;
        } else {
            this.userId = userId;
        }
        if ((i & 4) == 0) {
            this.messageId = null;
        } else {
            this.messageId = str2;
        }
        if ((i & 8) == 0) {
            this.applicationUserId = null;
        } else {
            this.applicationUserId = userId2;
        }
        if ((i & 16) == 0) {
            this.messageType = null;
        } else {
            this.messageType = messageType;
        }
        if ((i & 32) == 0) {
            this.messageChannelId = null;
        } else {
            this.messageChannelId = channelId;
        }
    }

    public /* synthetic */ CommandOnClick(int i, String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, userId, str2, userId2, messageType, channelId, serializationConstructorMarker);
    }

    public /* synthetic */ CommandOnClick(String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, userId, str2, userId2, messageType, channelId);
    }

    /* renamed from: copy-jIMHauk$default */
    public static /* synthetic */ CommandOnClick m41466copyjIMHauk$default(CommandOnClick commandOnClick, String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commandOnClick.action;
        }
        if ((i & 2) != 0) {
            userId = commandOnClick.userId;
        }
        UserId userId3 = userId;
        if ((i & 4) != 0) {
            str2 = commandOnClick.messageId;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            userId2 = commandOnClick.applicationUserId;
        }
        UserId userId4 = userId2;
        if ((i & 16) != 0) {
            messageType = commandOnClick.messageType;
        }
        MessageType messageType2 = messageType;
        if ((i & 32) != 0) {
            channelId = commandOnClick.messageChannelId;
        }
        return commandOnClick.m41471copyjIMHauk(str, userId3, str3, userId4, messageType2, channelId);
    }

    public static final void write$Self(CommandOnClick self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        MessageId messageId;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z6 = false;
        if (output.mo12879z(serialDesc, 0) || self.action != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 0, C2560a2.f7013a, self.action);
        }
        if (output.mo12879z(serialDesc, 1) || self.userId != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12904E(serialDesc, 1, UserId$$serializer.INSTANCE, self.userId);
        }
        if (output.mo12879z(serialDesc, 2) || self.messageId != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            MessageId$$serializer messageId$$serializer = MessageId$$serializer.INSTANCE;
            String str = self.messageId;
            if (str != null) {
                messageId = MessageId.m42073boximpl(str);
            } else {
                messageId = null;
            }
            output.mo12904E(serialDesc, 2, messageId$$serializer, messageId);
        }
        if (output.mo12879z(serialDesc, 3) || self.applicationUserId != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            output.mo12904E(serialDesc, 3, UserId$$serializer.INSTANCE, self.applicationUserId);
        }
        if (output.mo12879z(serialDesc, 4) || self.messageType != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            output.mo12904E(serialDesc, 4, MessageType.Serializer.INSTANCE, self.messageType);
        }
        if (output.mo12879z(serialDesc, 5) || self.messageChannelId != null) {
            z6 = true;
        }
        if (z6) {
            output.mo12904E(serialDesc, 5, ChannelId$$serializer.INSTANCE, self.messageChannelId);
        }
    }

    public final String component1() {
        return this.action;
    }

    /* renamed from: component2-wUX8bhU */
    public final UserId m41467component2wUX8bhU() {
        return this.userId;
    }

    /* renamed from: component3-N_6c4I0 */
    public final String m41468component3N_6c4I0() {
        return this.messageId;
    }

    /* renamed from: component4-wUX8bhU */
    public final UserId m41469component4wUX8bhU() {
        return this.applicationUserId;
    }

    public final MessageType component5() {
        return this.messageType;
    }

    /* renamed from: component6-qMVnFVQ */
    public final ChannelId m41470component6qMVnFVQ() {
        return this.messageChannelId;
    }

    /* renamed from: copy-jIMHauk */
    public final CommandOnClick m41471copyjIMHauk(String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId) {
        return new CommandOnClick(str, userId, str2, userId2, messageType, channelId, null);
    }

    public boolean equals(Object obj) {
        boolean m42077equalsimpl0;
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommandOnClick) {
            CommandOnClick commandOnClick = (CommandOnClick) obj;
            if (C9612q.m13922c(this.action, commandOnClick.action) && C9612q.m13922c(this.userId, commandOnClick.userId)) {
                String str = this.messageId;
                String str2 = commandOnClick.messageId;
                if (str == null) {
                    if (str2 == null) {
                        m42077equalsimpl0 = true;
                    }
                    m42077equalsimpl0 = false;
                } else {
                    if (str2 != null) {
                        m42077equalsimpl0 = MessageId.m42077equalsimpl0(str, str2);
                    }
                    m42077equalsimpl0 = false;
                }
                return m42077equalsimpl0 && C9612q.m13922c(this.applicationUserId, commandOnClick.applicationUserId) && this.messageType == commandOnClick.messageType && C9612q.m13922c(this.messageChannelId, commandOnClick.messageChannelId);
            }
            return false;
        }
        return false;
    }

    public final String getAction() {
        return this.action;
    }

    /* renamed from: getApplicationUserId-wUX8bhU */
    public final UserId m41472getApplicationUserIdwUX8bhU() {
        return this.applicationUserId;
    }

    /* renamed from: getMessageChannelId-qMVnFVQ */
    public final ChannelId m41473getMessageChannelIdqMVnFVQ() {
        return this.messageChannelId;
    }

    /* renamed from: getMessageId-N_6c4I0 */
    public final String m41474getMessageIdN_6c4I0() {
        return this.messageId;
    }

    public final MessageType getMessageType() {
        return this.messageType;
    }

    /* renamed from: getUserId-wUX8bhU */
    public final UserId m41475getUserIdwUX8bhU() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.action;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UserId userId = this.userId;
        int m42116hashCodeimpl = (hashCode + (userId == null ? 0 : UserId.m42116hashCodeimpl(userId.m42120unboximpl()))) * 31;
        String str2 = this.messageId;
        int m42078hashCodeimpl = (m42116hashCodeimpl + (str2 == null ? 0 : MessageId.m42078hashCodeimpl(str2))) * 31;
        UserId userId2 = this.applicationUserId;
        int m42116hashCodeimpl2 = (m42078hashCodeimpl + (userId2 == null ? 0 : UserId.m42116hashCodeimpl(userId2.m42120unboximpl()))) * 31;
        MessageType messageType = this.messageType;
        int hashCode2 = (m42116hashCodeimpl2 + (messageType == null ? 0 : messageType.hashCode())) * 31;
        ChannelId channelId = this.messageChannelId;
        return hashCode2 + (channelId != null ? ChannelId.m42052hashCodeimpl(channelId.m42056unboximpl()) : 0);
    }

    public String toString() {
        String str = this.action;
        UserId userId = this.userId;
        String str2 = this.messageId;
        String m42079toStringimpl = str2 == null ? "null" : MessageId.m42079toStringimpl(str2);
        UserId userId2 = this.applicationUserId;
        MessageType messageType = this.messageType;
        ChannelId channelId = this.messageChannelId;
        return "CommandOnClick(action=" + str + ", userId=" + userId + ", messageId=" + m42079toStringimpl + ", applicationUserId=" + userId2 + ", messageType=" + messageType + ", messageChannelId=" + channelId + ")";
    }

    private CommandOnClick(String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId) {
        this.action = str;
        this.userId = userId;
        this.messageId = str2;
        this.applicationUserId = userId2;
        this.messageType = messageType;
        this.messageChannelId = channelId;
    }

    public /* synthetic */ CommandOnClick(String str, UserId userId, String str2, UserId userId2, MessageType messageType, ChannelId channelId, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : userId2, (i & 16) != 0 ? null : messageType, (i & 32) == 0 ? channelId : null, null);
    }
}