package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.codedlinks.EmbeddedActivityInviteEmbedImpl;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0019\u0010\u0012\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, m14357d2 = {"Lcom/discord/chat/presentation/message/messagepart/EmbeddedActivityInviteMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "codedLinkIndex", "", "embeddedActivityInviteEmbed", "Lcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbedImpl;", "constrainedWidth", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbedImpl;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCodedLinkIndex", "()I", "getConstrainedWidth", "getEmbeddedActivityInviteEmbed", "()Lcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbedImpl;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "copy", "copy-AFFcxXc", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbedImpl;I)Lcom/discord/chat/presentation/message/messagepart/EmbeddedActivityInviteMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EmbeddedActivityInviteMessageAccessory extends MessageAccessory {
    private final int codedLinkIndex;
    private final int constrainedWidth;
    private final EmbeddedActivityInviteEmbedImpl embeddedActivityInviteEmbed;
    private final String messageId;

    private EmbeddedActivityInviteMessageAccessory(String str, int i, EmbeddedActivityInviteEmbedImpl embeddedActivityInviteEmbedImpl, int i2) {
        super(str, "embedded activity invite " + i, null);
        this.messageId = str;
        this.codedLinkIndex = i;
        this.embeddedActivityInviteEmbed = embeddedActivityInviteEmbedImpl;
        this.constrainedWidth = i2;
    }

    public /* synthetic */ EmbeddedActivityInviteMessageAccessory(String str, int i, EmbeddedActivityInviteEmbedImpl embeddedActivityInviteEmbedImpl, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, embeddedActivityInviteEmbedImpl, i2);
    }

    /* renamed from: copy-AFFcxXc$default */
    public static /* synthetic */ EmbeddedActivityInviteMessageAccessory m41674copyAFFcxXc$default(EmbeddedActivityInviteMessageAccessory embeddedActivityInviteMessageAccessory, String str, int i, EmbeddedActivityInviteEmbedImpl embeddedActivityInviteEmbedImpl, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = embeddedActivityInviteMessageAccessory.mo41659getMessageId3Eiw7ao();
        }
        if ((i3 & 2) != 0) {
            i = embeddedActivityInviteMessageAccessory.codedLinkIndex;
        }
        if ((i3 & 4) != 0) {
            embeddedActivityInviteEmbedImpl = embeddedActivityInviteMessageAccessory.embeddedActivityInviteEmbed;
        }
        if ((i3 & 8) != 0) {
            i2 = embeddedActivityInviteMessageAccessory.constrainedWidth;
        }
        return embeddedActivityInviteMessageAccessory.m41676copyAFFcxXc(str, i, embeddedActivityInviteEmbedImpl, i2);
    }

    /* renamed from: component1-3Eiw7ao */
    public final String m41675component13Eiw7ao() {
        return mo41659getMessageId3Eiw7ao();
    }

    public final int component2() {
        return this.codedLinkIndex;
    }

    public final EmbeddedActivityInviteEmbedImpl component3() {
        return this.embeddedActivityInviteEmbed;
    }

    public final int component4() {
        return this.constrainedWidth;
    }

    /* renamed from: copy-AFFcxXc */
    public final EmbeddedActivityInviteMessageAccessory m41676copyAFFcxXc(String messageId, int i, EmbeddedActivityInviteEmbedImpl embeddedActivityInviteEmbed, int i2) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(embeddedActivityInviteEmbed, "embeddedActivityInviteEmbed");
        return new EmbeddedActivityInviteMessageAccessory(messageId, i, embeddedActivityInviteEmbed, i2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmbeddedActivityInviteMessageAccessory) {
            EmbeddedActivityInviteMessageAccessory embeddedActivityInviteMessageAccessory = (EmbeddedActivityInviteMessageAccessory) obj;
            return MessageId.m42077equalsimpl0(mo41659getMessageId3Eiw7ao(), embeddedActivityInviteMessageAccessory.mo41659getMessageId3Eiw7ao()) && this.codedLinkIndex == embeddedActivityInviteMessageAccessory.codedLinkIndex && C9612q.m13922c(this.embeddedActivityInviteEmbed, embeddedActivityInviteMessageAccessory.embeddedActivityInviteEmbed) && this.constrainedWidth == embeddedActivityInviteMessageAccessory.constrainedWidth;
        }
        return false;
    }

    public final int getCodedLinkIndex() {
        return this.codedLinkIndex;
    }

    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    public final EmbeddedActivityInviteEmbedImpl getEmbeddedActivityInviteEmbed() {
        return this.embeddedActivityInviteEmbed;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41659getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (((((MessageId.m42078hashCodeimpl(mo41659getMessageId3Eiw7ao()) * 31) + this.codedLinkIndex) * 31) + this.embeddedActivityInviteEmbed.hashCode()) * 31) + this.constrainedWidth;
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(mo41659getMessageId3Eiw7ao());
        int i = this.codedLinkIndex;
        EmbeddedActivityInviteEmbedImpl embeddedActivityInviteEmbedImpl = this.embeddedActivityInviteEmbed;
        int i2 = this.constrainedWidth;
        return "EmbeddedActivityInviteMessageAccessory(messageId=" + m42079toStringimpl + ", codedLinkIndex=" + i + ", embeddedActivityInviteEmbed=" + embeddedActivityInviteEmbedImpl + ", constrainedWidth=" + i2 + ")";
    }
}