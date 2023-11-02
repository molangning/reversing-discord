package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.policynotice.SafetyPolicyNoticeEmbed;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\bJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, m14357d2 = {"Lcom/discord/chat/presentation/message/messagepart/SafetyPolicyNoticeMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "safetyPolicyNoticeEmbed", "Lcom/discord/chat/bridge/policynotice/SafetyPolicyNoticeEmbed;", "(Ljava/lang/String;Lcom/discord/chat/bridge/policynotice/SafetyPolicyNoticeEmbed;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getSafetyPolicyNoticeEmbed", "()Lcom/discord/chat/bridge/policynotice/SafetyPolicyNoticeEmbed;", "component1", "component1-3Eiw7ao", "component2", "copy", "copy-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/policynotice/SafetyPolicyNoticeEmbed;)Lcom/discord/chat/presentation/message/messagepart/SafetyPolicyNoticeMessageAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SafetyPolicyNoticeMessageAccessory extends MessageAccessory {
    private final String messageId;
    private final SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed;

    private SafetyPolicyNoticeMessageAccessory(String str, SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed) {
        super(str, "safety policy notice embed", null);
        this.messageId = str;
        this.safetyPolicyNoticeEmbed = safetyPolicyNoticeEmbed;
    }

    public /* synthetic */ SafetyPolicyNoticeMessageAccessory(String str, SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, safetyPolicyNoticeEmbed);
    }

    /* renamed from: copy-ntcYbpo$default */
    public static /* synthetic */ SafetyPolicyNoticeMessageAccessory m41738copyntcYbpo$default(SafetyPolicyNoticeMessageAccessory safetyPolicyNoticeMessageAccessory, String str, SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed, int i, Object obj) {
        if ((i & 1) != 0) {
            str = safetyPolicyNoticeMessageAccessory.mo41659getMessageId3Eiw7ao();
        }
        if ((i & 2) != 0) {
            safetyPolicyNoticeEmbed = safetyPolicyNoticeMessageAccessory.safetyPolicyNoticeEmbed;
        }
        return safetyPolicyNoticeMessageAccessory.m41740copyntcYbpo(str, safetyPolicyNoticeEmbed);
    }

    /* renamed from: component1-3Eiw7ao */
    public final String m41739component13Eiw7ao() {
        return mo41659getMessageId3Eiw7ao();
    }

    public final SafetyPolicyNoticeEmbed component2() {
        return this.safetyPolicyNoticeEmbed;
    }

    /* renamed from: copy-ntcYbpo */
    public final SafetyPolicyNoticeMessageAccessory m41740copyntcYbpo(String messageId, SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(safetyPolicyNoticeEmbed, "safetyPolicyNoticeEmbed");
        return new SafetyPolicyNoticeMessageAccessory(messageId, safetyPolicyNoticeEmbed, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SafetyPolicyNoticeMessageAccessory) {
            SafetyPolicyNoticeMessageAccessory safetyPolicyNoticeMessageAccessory = (SafetyPolicyNoticeMessageAccessory) obj;
            return MessageId.m42077equalsimpl0(mo41659getMessageId3Eiw7ao(), safetyPolicyNoticeMessageAccessory.mo41659getMessageId3Eiw7ao()) && C9612q.m13922c(this.safetyPolicyNoticeEmbed, safetyPolicyNoticeMessageAccessory.safetyPolicyNoticeEmbed);
        }
        return false;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41659getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final SafetyPolicyNoticeEmbed getSafetyPolicyNoticeEmbed() {
        return this.safetyPolicyNoticeEmbed;
    }

    public int hashCode() {
        return (MessageId.m42078hashCodeimpl(mo41659getMessageId3Eiw7ao()) * 31) + this.safetyPolicyNoticeEmbed.hashCode();
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(mo41659getMessageId3Eiw7ao());
        SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed = this.safetyPolicyNoticeEmbed;
        return "SafetyPolicyNoticeMessageAccessory(messageId=" + m42079toStringimpl + ", safetyPolicyNoticeEmbed=" + safetyPolicyNoticeEmbed + ")";
    }
}