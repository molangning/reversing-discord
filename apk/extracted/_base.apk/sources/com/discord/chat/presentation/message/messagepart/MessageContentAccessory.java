package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.truncation.Truncation;
import com.discord.fonts.DiscordFont;
import com.discord.primitives.MessageId;
import com.discord.theme.DiscordTheme;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u008a\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0019\u00101\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010 J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u00108\u001a\u00020\u0018HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\t\u0010>\u001a\u00020\u000bHÆ\u0003J\t\u0010?\u001a\u00020\u000bHÆ\u0003J\t\u0010@\u001a\u00020\u000fHÆ\u0003J°\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u0013\u0010D\u001a\u00020\u00072\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020\u000bHÖ\u0001J\t\u0010H\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010'\u001a\u0004\b&\u0010 R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b/\u00100\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006I"}, m14357d2 = {"Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "messageContent", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "shouldAnimateEmoji", "", "shouldShowRoleDot", "shouldShowRoleOnName", "bottomSpacingPx", "", "linkColor", "messageTextColor", "messageFont", "Lcom/discord/fonts/DiscordFont;", "textSizeSp", "boldLinkText", "constrainedWidth", "editedLabel", "", "truncation", "Lcom/discord/chat/bridge/truncation/Truncation;", "theme", "Lcom/discord/theme/DiscordTheme;", "(Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;ZZZIIILcom/discord/fonts/DiscordFont;IZILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBoldLinkText", "()Z", "getBottomSpacingPx", "()I", "getConstrainedWidth", "getEditedLabel", "()Ljava/lang/String;", "getLinkColor", "getMessageContent", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getMessageFont", "()Lcom/discord/fonts/DiscordFont;", "getMessageId-3Eiw7ao", "Ljava/lang/String;", "getMessageTextColor", "getShouldAnimateEmoji", "getShouldShowRoleDot", "getShouldShowRoleOnName", "getTextSizeSp", "getTheme", "()Lcom/discord/theme/DiscordTheme;", "getTruncation", "()Lcom/discord/chat/bridge/truncation/Truncation;", "component1", "component1-3Eiw7ao", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-UwkiYZs", "(Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;ZZZIIILcom/discord/fonts/DiscordFont;IZILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;)Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;", "equals", "other", "", "hashCode", "toString", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageContentAccessory extends MessageAccessory {
    private final boolean boldLinkText;
    private final int bottomSpacingPx;
    private final int constrainedWidth;
    private final String editedLabel;
    private final int linkColor;
    private final StructurableText messageContent;
    private final DiscordFont messageFont;
    private final String messageId;
    private final int messageTextColor;
    private final boolean shouldAnimateEmoji;
    private final boolean shouldShowRoleDot;
    private final boolean shouldShowRoleOnName;
    private final int textSizeSp;
    private final DiscordTheme theme;
    private final Truncation truncation;

    public /* synthetic */ MessageContentAccessory(String str, StructurableText structurableText, boolean z, boolean z2, boolean z3, int i, int i2, int i3, DiscordFont discordFont, int i4, boolean z4, int i5, String str2, Truncation truncation, DiscordTheme discordTheme, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, structurableText, z, z2, z3, i, i2, i3, discordFont, i4, z4, i5, str2, (i6 & 8192) != 0 ? null : truncation, (i6 & 16384) != 0 ? ThemeManagerKt.getTheme() : discordTheme, null);
    }

    public /* synthetic */ MessageContentAccessory(String str, StructurableText structurableText, boolean z, boolean z2, boolean z3, int i, int i2, int i3, DiscordFont discordFont, int i4, boolean z4, int i5, String str2, Truncation truncation, DiscordTheme discordTheme, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, structurableText, z, z2, z3, i, i2, i3, discordFont, i4, z4, i5, str2, truncation, discordTheme);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41722component13Eiw7ao() {
        return mo41659getMessageId3Eiw7ao();
    }

    public final int component10() {
        return this.textSizeSp;
    }

    public final boolean component11() {
        return this.boldLinkText;
    }

    public final int component12() {
        return this.constrainedWidth;
    }

    public final String component13() {
        return this.editedLabel;
    }

    public final Truncation component14() {
        return this.truncation;
    }

    public final DiscordTheme component15() {
        return this.theme;
    }

    public final StructurableText component2() {
        return this.messageContent;
    }

    public final boolean component3() {
        return this.shouldAnimateEmoji;
    }

    public final boolean component4() {
        return this.shouldShowRoleDot;
    }

    public final boolean component5() {
        return this.shouldShowRoleOnName;
    }

    public final int component6() {
        return this.bottomSpacingPx;
    }

    public final int component7() {
        return this.linkColor;
    }

    public final int component8() {
        return this.messageTextColor;
    }

    public final DiscordFont component9() {
        return this.messageFont;
    }

    /* renamed from: copy-UwkiYZs  reason: not valid java name */
    public final MessageContentAccessory m41723copyUwkiYZs(String messageId, StructurableText messageContent, boolean z, boolean z2, boolean z3, int i, int i2, int i3, DiscordFont messageFont, int i4, boolean z4, int i5, String str, Truncation truncation, DiscordTheme theme) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(messageContent, "messageContent");
        C9612q.m13917h(messageFont, "messageFont");
        C9612q.m13917h(theme, "theme");
        return new MessageContentAccessory(messageId, messageContent, z, z2, z3, i, i2, i3, messageFont, i4, z4, i5, str, truncation, theme, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageContentAccessory) {
            MessageContentAccessory messageContentAccessory = (MessageContentAccessory) obj;
            return MessageId.m42077equalsimpl0(mo41659getMessageId3Eiw7ao(), messageContentAccessory.mo41659getMessageId3Eiw7ao()) && C9612q.m13922c(this.messageContent, messageContentAccessory.messageContent) && this.shouldAnimateEmoji == messageContentAccessory.shouldAnimateEmoji && this.shouldShowRoleDot == messageContentAccessory.shouldShowRoleDot && this.shouldShowRoleOnName == messageContentAccessory.shouldShowRoleOnName && this.bottomSpacingPx == messageContentAccessory.bottomSpacingPx && this.linkColor == messageContentAccessory.linkColor && this.messageTextColor == messageContentAccessory.messageTextColor && this.messageFont == messageContentAccessory.messageFont && this.textSizeSp == messageContentAccessory.textSizeSp && this.boldLinkText == messageContentAccessory.boldLinkText && this.constrainedWidth == messageContentAccessory.constrainedWidth && C9612q.m13922c(this.editedLabel, messageContentAccessory.editedLabel) && C9612q.m13922c(this.truncation, messageContentAccessory.truncation) && C9612q.m13922c(this.theme, messageContentAccessory.theme);
        }
        return false;
    }

    public final boolean getBoldLinkText() {
        return this.boldLinkText;
    }

    public final int getBottomSpacingPx() {
        return this.bottomSpacingPx;
    }

    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    public final String getEditedLabel() {
        return this.editedLabel;
    }

    public final int getLinkColor() {
        return this.linkColor;
    }

    public final StructurableText getMessageContent() {
        return this.messageContent;
    }

    public final DiscordFont getMessageFont() {
        return this.messageFont;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41659getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final int getMessageTextColor() {
        return this.messageTextColor;
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

    public final int getTextSizeSp() {
        return this.textSizeSp;
    }

    public final DiscordTheme getTheme() {
        return this.theme;
    }

    public final Truncation getTruncation() {
        return this.truncation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m42078hashCodeimpl = ((MessageId.m42078hashCodeimpl(mo41659getMessageId3Eiw7ao()) * 31) + this.messageContent.hashCode()) * 31;
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
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int hashCode = (((((((((((i4 + i5) * 31) + this.bottomSpacingPx) * 31) + this.linkColor) * 31) + this.messageTextColor) * 31) + this.messageFont.hashCode()) * 31) + this.textSizeSp) * 31;
        boolean z4 = this.boldLinkText;
        int i6 = (((hashCode + (z4 ? 1 : z4 ? 1 : 0)) * 31) + this.constrainedWidth) * 31;
        String str = this.editedLabel;
        int hashCode2 = (i6 + (str == null ? 0 : str.hashCode())) * 31;
        Truncation truncation = this.truncation;
        return ((hashCode2 + (truncation != null ? truncation.hashCode() : 0)) * 31) + this.theme.hashCode();
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(mo41659getMessageId3Eiw7ao());
        StructurableText structurableText = this.messageContent;
        boolean z = this.shouldAnimateEmoji;
        boolean z2 = this.shouldShowRoleDot;
        boolean z3 = this.shouldShowRoleOnName;
        int i = this.bottomSpacingPx;
        int i2 = this.linkColor;
        int i3 = this.messageTextColor;
        DiscordFont discordFont = this.messageFont;
        int i4 = this.textSizeSp;
        boolean z4 = this.boldLinkText;
        int i5 = this.constrainedWidth;
        String str = this.editedLabel;
        Truncation truncation = this.truncation;
        DiscordTheme discordTheme = this.theme;
        return "MessageContentAccessory(messageId=" + m42079toStringimpl + ", messageContent=" + structurableText + ", shouldAnimateEmoji=" + z + ", shouldShowRoleDot=" + z2 + ", shouldShowRoleOnName=" + z3 + ", bottomSpacingPx=" + i + ", linkColor=" + i2 + ", messageTextColor=" + i3 + ", messageFont=" + discordFont + ", textSizeSp=" + i4 + ", boldLinkText=" + z4 + ", constrainedWidth=" + i5 + ", editedLabel=" + str + ", truncation=" + truncation + ", theme=" + discordTheme + ")";
    }

    private MessageContentAccessory(String str, StructurableText structurableText, boolean z, boolean z2, boolean z3, int i, int i2, int i3, DiscordFont discordFont, int i4, boolean z4, int i5, String str2, Truncation truncation, DiscordTheme discordTheme) {
        super(str, "message content", null);
        this.messageId = str;
        this.messageContent = structurableText;
        this.shouldAnimateEmoji = z;
        this.shouldShowRoleDot = z2;
        this.shouldShowRoleOnName = z3;
        this.bottomSpacingPx = i;
        this.linkColor = i2;
        this.messageTextColor = i3;
        this.messageFont = discordFont;
        this.textSizeSp = i4;
        this.boldLinkText = z4;
        this.constrainedWidth = i5;
        this.editedLabel = str2;
        this.truncation = truncation;
        this.theme = discordTheme;
    }
}
