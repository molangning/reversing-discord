package com.discord.chat.reactevents;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
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

@Metadata(m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002'(B0\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\nB\u0018\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0019\u0010\u0012\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\rJ*\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J!\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÇ\u0001R\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, m14357d2 = {"Lcom/discord/chat/reactevents/InitiateEditData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "messageId", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-o4g7jtM", "()J", "J", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component2-o4g7jtM", "copy", "copy-pfaIj0E", "(Ljava/lang/String;J)Lcom/discord/chat/reactevents/InitiateEditData;", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class InitiateEditData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final long channelId;
    private final String messageId;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/reactevents/InitiateEditData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/InitiateEditData;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InitiateEditData> serializer() {
            return InitiateEditData$$serializer.INSTANCE;
        }
    }

    private InitiateEditData(int i, String str, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            C2620n1.m32836b(i, 3, InitiateEditData$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.channelId = channelId.m42056unboximpl();
    }

    public /* synthetic */ InitiateEditData(int i, String str, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, channelId, serializationConstructorMarker);
    }

    public /* synthetic */ InitiateEditData(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    /* renamed from: copy-pfaIj0E$default  reason: not valid java name */
    public static /* synthetic */ InitiateEditData m41807copypfaIj0E$default(InitiateEditData initiateEditData, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initiateEditData.messageId;
        }
        if ((i & 2) != 0) {
            j = initiateEditData.channelId;
        }
        return initiateEditData.m41810copypfaIj0E(str, j);
    }

    public static final void write$Self(InitiateEditData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12894i(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m42073boximpl(self.messageId));
        output.mo12894i(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m42047boximpl(self.channelId));
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41808component13Eiw7ao() {
        return this.messageId;
    }

    /* renamed from: component2-o4g7jtM  reason: not valid java name */
    public final long m41809component2o4g7jtM() {
        return this.channelId;
    }

    /* renamed from: copy-pfaIj0E  reason: not valid java name */
    public final InitiateEditData m41810copypfaIj0E(String messageId, long j) {
        C9612q.m13917h(messageId, "messageId");
        return new InitiateEditData(messageId, j, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InitiateEditData) {
            InitiateEditData initiateEditData = (InitiateEditData) obj;
            return MessageId.m42077equalsimpl0(this.messageId, initiateEditData.messageId) && ChannelId.m42051equalsimpl0(this.channelId, initiateEditData.channelId);
        }
        return false;
    }

    /* renamed from: getChannelId-o4g7jtM  reason: not valid java name */
    public final long m41811getChannelIdo4g7jtM() {
        return this.channelId;
    }

    /* renamed from: getMessageId-3Eiw7ao  reason: not valid java name */
    public final String m41812getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (MessageId.m42078hashCodeimpl(this.messageId) * 31) + ChannelId.m42052hashCodeimpl(this.channelId);
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(this.messageId);
        String m42054toStringimpl = ChannelId.m42054toStringimpl(this.channelId);
        return "InitiateEditData(messageId=" + m42079toStringimpl + ", channelId=" + m42054toStringimpl + ")";
    }

    private InitiateEditData(String str, long j) {
        this.messageId = str;
        this.channelId = j;
    }
}
