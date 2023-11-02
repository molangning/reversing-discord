package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.codedlinks.GuildEventInviteEmbedImpl;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\u0018\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0012J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003JR\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, m14357d2 = {"Lcom/discord/chat/presentation/message/messagepart/GuildEventInviteMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "codedLinkIndex", "", "invite", "Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;", "shouldAnimateEmoji", "", "shouldShowRoleDot", "shouldShowRoleOnName", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;ZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCodedLinkIndex", "()I", "getInvite", "()Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getShouldAnimateEmoji", "()Z", "getShouldShowRoleDot", "getShouldShowRoleOnName", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component5", "component6", "copy", "copy-LdU2QRA", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;ZZZ)Lcom/discord/chat/presentation/message/messagepart/GuildEventInviteMessageAccessory;", "equals", "other", "", "hashCode", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class GuildEventInviteMessageAccessory extends MessageAccessory {
    private final int codedLinkIndex;
    private final GuildEventInviteEmbedImpl invite;
    private final String messageId;
    private final boolean shouldAnimateEmoji;
    private final boolean shouldShowRoleDot;
    private final boolean shouldShowRoleOnName;

    private GuildEventInviteMessageAccessory(String str, int i, GuildEventInviteEmbedImpl guildEventInviteEmbedImpl, boolean z, boolean z2, boolean z3) {
        super(str, "guild scheduled event invite " + i, null);
        this.messageId = str;
        this.codedLinkIndex = i;
        this.invite = guildEventInviteEmbedImpl;
        this.shouldAnimateEmoji = z;
        this.shouldShowRoleDot = z2;
        this.shouldShowRoleOnName = z3;
    }

    public /* synthetic */ GuildEventInviteMessageAccessory(String str, int i, GuildEventInviteEmbedImpl guildEventInviteEmbedImpl, boolean z, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, guildEventInviteEmbedImpl, z, z2, z3);
    }

    /* renamed from: copy-LdU2QRA$default */
    public static /* synthetic */ GuildEventInviteMessageAccessory m41695copyLdU2QRA$default(GuildEventInviteMessageAccessory guildEventInviteMessageAccessory, String str, int i, GuildEventInviteEmbedImpl guildEventInviteEmbedImpl, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = guildEventInviteMessageAccessory.mo41659getMessageId3Eiw7ao();
        }
        if ((i2 & 2) != 0) {
            i = guildEventInviteMessageAccessory.codedLinkIndex;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            guildEventInviteEmbedImpl = guildEventInviteMessageAccessory.invite;
        }
        GuildEventInviteEmbedImpl guildEventInviteEmbedImpl2 = guildEventInviteEmbedImpl;
        if ((i2 & 8) != 0) {
            z = guildEventInviteMessageAccessory.shouldAnimateEmoji;
        }
        boolean z4 = z;
        if ((i2 & 16) != 0) {
            z2 = guildEventInviteMessageAccessory.shouldShowRoleDot;
        }
        boolean z5 = z2;
        if ((i2 & 32) != 0) {
            z3 = guildEventInviteMessageAccessory.shouldShowRoleOnName;
        }
        return guildEventInviteMessageAccessory.m41697copyLdU2QRA(str, i3, guildEventInviteEmbedImpl2, z4, z5, z3);
    }

    /* renamed from: component1-3Eiw7ao */
    public final String m41696component13Eiw7ao() {
        return mo41659getMessageId3Eiw7ao();
    }

    public final int component2() {
        return this.codedLinkIndex;
    }

    public final GuildEventInviteEmbedImpl component3() {
        return this.invite;
    }

    public final boolean component4() {
        return this.shouldAnimateEmoji;
    }

    public final boolean component5() {
        return this.shouldShowRoleDot;
    }

    public final boolean component6() {
        return this.shouldShowRoleOnName;
    }

    /* renamed from: copy-LdU2QRA */
    public final GuildEventInviteMessageAccessory m41697copyLdU2QRA(String messageId, int i, GuildEventInviteEmbedImpl invite, boolean z, boolean z2, boolean z3) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(invite, "invite");
        return new GuildEventInviteMessageAccessory(messageId, i, invite, z, z2, z3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GuildEventInviteMessageAccessory) {
            GuildEventInviteMessageAccessory guildEventInviteMessageAccessory = (GuildEventInviteMessageAccessory) obj;
            return MessageId.m42077equalsimpl0(mo41659getMessageId3Eiw7ao(), guildEventInviteMessageAccessory.mo41659getMessageId3Eiw7ao()) && this.codedLinkIndex == guildEventInviteMessageAccessory.codedLinkIndex && C9612q.m13922c(this.invite, guildEventInviteMessageAccessory.invite) && this.shouldAnimateEmoji == guildEventInviteMessageAccessory.shouldAnimateEmoji && this.shouldShowRoleDot == guildEventInviteMessageAccessory.shouldShowRoleDot && this.shouldShowRoleOnName == guildEventInviteMessageAccessory.shouldShowRoleOnName;
        }
        return false;
    }

    public final int getCodedLinkIndex() {
        return this.codedLinkIndex;
    }

    public final GuildEventInviteEmbedImpl getInvite() {
        return this.invite;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41659getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final boolean getShouldAnimateEmoji() {
        return this.shouldAnimateEmoji;
    }

    public final boolean getShouldShowRoleDot() {
        return this.shouldShowRoleDot;
    }

    public final boolean getShouldShowRoleOnName() {
        return this.shouldShowRoleOnName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m42078hashCodeimpl = ((((MessageId.m42078hashCodeimpl(mo41659getMessageId3Eiw7ao()) * 31) + this.codedLinkIndex) * 31) + this.invite.hashCode()) * 31;
        boolean z = this.shouldAnimateEmoji;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (m42078hashCodeimpl + i) * 31;
        boolean z2 = this.shouldShowRoleDot;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.shouldShowRoleOnName;
        return i4 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(mo41659getMessageId3Eiw7ao());
        int i = this.codedLinkIndex;
        GuildEventInviteEmbedImpl guildEventInviteEmbedImpl = this.invite;
        boolean z = this.shouldAnimateEmoji;
        boolean z2 = this.shouldShowRoleDot;
        boolean z3 = this.shouldShowRoleOnName;
        return "GuildEventInviteMessageAccessory(messageId=" + m42079toStringimpl + ", codedLinkIndex=" + i + ", invite=" + guildEventInviteEmbedImpl + ", shouldAnimateEmoji=" + z + ", shouldShowRoleDot=" + z2 + ", shouldShowRoleOnName=" + z3 + ")";
    }
}