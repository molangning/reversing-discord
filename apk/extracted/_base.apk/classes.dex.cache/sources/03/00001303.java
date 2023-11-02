package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.codedlinks.GuildInviteDisabledEmbedImpl;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\u0010\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, m14357d2 = {"Lcom/discord/chat/presentation/message/messagepart/GuildInviteDisabledMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "codedLinkIndex", "", "invite", "Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCodedLinkIndex", "()I", "getInvite", "()Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component3", "copy", "copy-u7_MRrM", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;)Lcom/discord/chat/presentation/message/messagepart/GuildInviteDisabledMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class GuildInviteDisabledMessageAccessory extends MessageAccessory {
    private final int codedLinkIndex;
    private final GuildInviteDisabledEmbedImpl invite;
    private final String messageId;

    private GuildInviteDisabledMessageAccessory(String str, int i, GuildInviteDisabledEmbedImpl guildInviteDisabledEmbedImpl) {
        super(str, "guild invite disabled " + i, null);
        this.messageId = str;
        this.codedLinkIndex = i;
        this.invite = guildInviteDisabledEmbedImpl;
    }

    public /* synthetic */ GuildInviteDisabledMessageAccessory(String str, int i, GuildInviteDisabledEmbedImpl guildInviteDisabledEmbedImpl, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, guildInviteDisabledEmbedImpl);
    }

    /* renamed from: copy-u7_MRrM$default */
    public static /* synthetic */ GuildInviteDisabledMessageAccessory m41698copyu7_MRrM$default(GuildInviteDisabledMessageAccessory guildInviteDisabledMessageAccessory, String str, int i, GuildInviteDisabledEmbedImpl guildInviteDisabledEmbedImpl, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = guildInviteDisabledMessageAccessory.mo41659getMessageId3Eiw7ao();
        }
        if ((i2 & 2) != 0) {
            i = guildInviteDisabledMessageAccessory.codedLinkIndex;
        }
        if ((i2 & 4) != 0) {
            guildInviteDisabledEmbedImpl = guildInviteDisabledMessageAccessory.invite;
        }
        return guildInviteDisabledMessageAccessory.m41700copyu7_MRrM(str, i, guildInviteDisabledEmbedImpl);
    }

    /* renamed from: component1-3Eiw7ao */
    public final String m41699component13Eiw7ao() {
        return mo41659getMessageId3Eiw7ao();
    }

    public final int component2() {
        return this.codedLinkIndex;
    }

    public final GuildInviteDisabledEmbedImpl component3() {
        return this.invite;
    }

    /* renamed from: copy-u7_MRrM */
    public final GuildInviteDisabledMessageAccessory m41700copyu7_MRrM(String messageId, int i, GuildInviteDisabledEmbedImpl invite) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(invite, "invite");
        return new GuildInviteDisabledMessageAccessory(messageId, i, invite, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GuildInviteDisabledMessageAccessory) {
            GuildInviteDisabledMessageAccessory guildInviteDisabledMessageAccessory = (GuildInviteDisabledMessageAccessory) obj;
            return MessageId.m42077equalsimpl0(mo41659getMessageId3Eiw7ao(), guildInviteDisabledMessageAccessory.mo41659getMessageId3Eiw7ao()) && this.codedLinkIndex == guildInviteDisabledMessageAccessory.codedLinkIndex && C9612q.m13922c(this.invite, guildInviteDisabledMessageAccessory.invite);
        }
        return false;
    }

    public final int getCodedLinkIndex() {
        return this.codedLinkIndex;
    }

    public final GuildInviteDisabledEmbedImpl getInvite() {
        return this.invite;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41659getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (((MessageId.m42078hashCodeimpl(mo41659getMessageId3Eiw7ao()) * 31) + this.codedLinkIndex) * 31) + this.invite.hashCode();
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(mo41659getMessageId3Eiw7ao());
        int i = this.codedLinkIndex;
        GuildInviteDisabledEmbedImpl guildInviteDisabledEmbedImpl = this.invite;
        return "GuildInviteDisabledMessageAccessory(messageId=" + m42079toStringimpl + ", codedLinkIndex=" + i + ", invite=" + guildInviteDisabledEmbedImpl + ")";
    }
}