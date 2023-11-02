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
import p045cj.C2560a2;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+B:\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000bø\u0001\u0000¢\u0006\u0002\u0010\fB\"\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u0015\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0012J\u0019\u0010\u0017\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J6\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\tHÖ\u0001J!\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)HÇ\u0001R\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapTagData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "messageId", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "tagType", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-o4g7jtM", "()J", "J", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getTagType", "component1", "component1-3Eiw7ao", "component2", "component2-o4g7jtM", "component3", "copy", "copy-Eqy5D80", "(Ljava/lang/String;JLjava/lang/String;)Lcom/discord/chat/reactevents/TapTagData;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TapTagData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final long channelId;
    private final String messageId;
    private final String tagType;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapTagData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapTagData;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapTagData> serializer() {
            return TapTagData$$serializer.INSTANCE;
        }
    }

    private TapTagData(int i, String str, ChannelId channelId, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            C2620n1.m32836b(i, 7, TapTagData$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.channelId = channelId.m42056unboximpl();
        this.tagType = str2;
    }

    public /* synthetic */ TapTagData(int i, String str, ChannelId channelId, String str2, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, channelId, str2, serializationConstructorMarker);
    }

    public /* synthetic */ TapTagData(String str, long j, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2);
    }

    /* renamed from: copy-Eqy5D80$default  reason: not valid java name */
    public static /* synthetic */ TapTagData m41893copyEqy5D80$default(TapTagData tapTagData, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapTagData.messageId;
        }
        if ((i & 2) != 0) {
            j = tapTagData.channelId;
        }
        if ((i & 4) != 0) {
            str2 = tapTagData.tagType;
        }
        return tapTagData.m41896copyEqy5D80(str, j, str2);
    }

    public static final void write$Self(TapTagData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12894i(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m42073boximpl(self.messageId));
        output.mo12894i(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m42047boximpl(self.channelId));
        output.mo12904E(serialDesc, 2, C2560a2.f7013a, self.tagType);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41894component13Eiw7ao() {
        return this.messageId;
    }

    /* renamed from: component2-o4g7jtM  reason: not valid java name */
    public final long m41895component2o4g7jtM() {
        return this.channelId;
    }

    public final String component3() {
        return this.tagType;
    }

    /* renamed from: copy-Eqy5D80  reason: not valid java name */
    public final TapTagData m41896copyEqy5D80(String messageId, long j, String str) {
        C9612q.m13917h(messageId, "messageId");
        return new TapTagData(messageId, j, str, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TapTagData) {
            TapTagData tapTagData = (TapTagData) obj;
            return MessageId.m42077equalsimpl0(this.messageId, tapTagData.messageId) && ChannelId.m42051equalsimpl0(this.channelId, tapTagData.channelId) && C9612q.m13922c(this.tagType, tapTagData.tagType);
        }
        return false;
    }

    /* renamed from: getChannelId-o4g7jtM  reason: not valid java name */
    public final long m41897getChannelIdo4g7jtM() {
        return this.channelId;
    }

    /* renamed from: getMessageId-3Eiw7ao  reason: not valid java name */
    public final String m41898getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final String getTagType() {
        return this.tagType;
    }

    public int hashCode() {
        int m42078hashCodeimpl = ((MessageId.m42078hashCodeimpl(this.messageId) * 31) + ChannelId.m42052hashCodeimpl(this.channelId)) * 31;
        String str = this.tagType;
        return m42078hashCodeimpl + (str == null ? 0 : str.hashCode());
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(this.messageId);
        String m42054toStringimpl = ChannelId.m42054toStringimpl(this.channelId);
        String str = this.tagType;
        return "TapTagData(messageId=" + m42079toStringimpl + ", channelId=" + m42054toStringimpl + ", tagType=" + str + ")";
    }

    private TapTagData(String str, long j, String str2) {
        this.messageId = str;
        this.channelId = j;
        this.tagType = str2;
    }
}
