package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.ephemeral.EphemeralIndication;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, m14357d2 = {"Lcom/discord/chat/presentation/message/messagepart/EphemeralIndicationMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "ephemeralIndication", "Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;", "(Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEphemeralIndication", "()Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "copy", "copy-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;)Lcom/discord/chat/presentation/message/messagepart/EphemeralIndicationMessageAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EphemeralIndicationMessageAccessory extends MessageAccessory {
    private final EphemeralIndication ephemeralIndication;
    private final String messageId;

    private EphemeralIndicationMessageAccessory(String str, EphemeralIndication ephemeralIndication) {
        super(str, "ephemeral indication", null);
        this.messageId = str;
        this.ephemeralIndication = ephemeralIndication;
    }

    public /* synthetic */ EphemeralIndicationMessageAccessory(String str, EphemeralIndication ephemeralIndication, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, ephemeralIndication);
    }

    /* renamed from: copy-ntcYbpo$default */
    public static /* synthetic */ EphemeralIndicationMessageAccessory m41677copyntcYbpo$default(EphemeralIndicationMessageAccessory ephemeralIndicationMessageAccessory, String str, EphemeralIndication ephemeralIndication, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ephemeralIndicationMessageAccessory.mo41659getMessageId3Eiw7ao();
        }
        if ((i & 2) != 0) {
            ephemeralIndication = ephemeralIndicationMessageAccessory.ephemeralIndication;
        }
        return ephemeralIndicationMessageAccessory.m41679copyntcYbpo(str, ephemeralIndication);
    }

    /* renamed from: component1-3Eiw7ao */
    public final String m41678component13Eiw7ao() {
        return mo41659getMessageId3Eiw7ao();
    }

    public final EphemeralIndication component2() {
        return this.ephemeralIndication;
    }

    /* renamed from: copy-ntcYbpo */
    public final EphemeralIndicationMessageAccessory m41679copyntcYbpo(String messageId, EphemeralIndication ephemeralIndication) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(ephemeralIndication, "ephemeralIndication");
        return new EphemeralIndicationMessageAccessory(messageId, ephemeralIndication, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EphemeralIndicationMessageAccessory) {
            EphemeralIndicationMessageAccessory ephemeralIndicationMessageAccessory = (EphemeralIndicationMessageAccessory) obj;
            return MessageId.m42077equalsimpl0(mo41659getMessageId3Eiw7ao(), ephemeralIndicationMessageAccessory.mo41659getMessageId3Eiw7ao()) && C9612q.m13922c(this.ephemeralIndication, ephemeralIndicationMessageAccessory.ephemeralIndication);
        }
        return false;
    }

    public final EphemeralIndication getEphemeralIndication() {
        return this.ephemeralIndication;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41659getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (MessageId.m42078hashCodeimpl(mo41659getMessageId3Eiw7ao()) * 31) + this.ephemeralIndication.hashCode();
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(mo41659getMessageId3Eiw7ao());
        EphemeralIndication ephemeralIndication = this.ephemeralIndication;
        return "EphemeralIndicationMessageAccessory(messageId=" + m42079toStringimpl + ", ephemeralIndication=" + ephemeralIndication + ")";
    }
}