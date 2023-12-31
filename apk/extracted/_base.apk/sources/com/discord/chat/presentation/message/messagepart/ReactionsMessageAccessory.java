package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.primitives.MessageId;
import com.discord.theme.DiscordTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\\\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0019\u0010\"\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0014J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jz\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, m14357d2 = {"Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "reactions", "", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "canAddNewReactions", "", "canAddNewBurstReactions", "addReactionLabel", "", "addNewReactionAccessibilityLabel", "addNewBurstReactionAccessibilityLabel", "reactionsTheme", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "theme", "Lcom/discord/theme/DiscordTheme;", "(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAddNewBurstReactionAccessibilityLabel", "()Ljava/lang/String;", "getAddNewReactionAccessibilityLabel", "getAddReactionLabel", "getCanAddNewBurstReactions", "()Z", "getCanAddNewReactions", "getMessageId-3Eiw7ao", "Ljava/lang/String;", "getReactions", "()Ljava/util/List;", "getReactionsTheme", "()Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "getTheme", "()Lcom/discord/theme/DiscordTheme;", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-IwdeaXA", "(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;)Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;", "equals", "other", "", "hashCode", "", "toString", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ReactionsMessageAccessory extends MessageAccessory {
    private final String addNewBurstReactionAccessibilityLabel;
    private final String addNewReactionAccessibilityLabel;
    private final String addReactionLabel;
    private final boolean canAddNewBurstReactions;
    private final boolean canAddNewReactions;
    private final String messageId;
    private final List<MessageReaction> reactions;
    private final ReactionsTheme reactionsTheme;
    private final DiscordTheme theme;

    public /* synthetic */ ReactionsMessageAccessory(String str, List list, boolean z, boolean z2, String str2, String str3, String str4, ReactionsTheme reactionsTheme, DiscordTheme discordTheme, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, z, z2, str2, str3, str4, reactionsTheme, (i & 256) != 0 ? null : discordTheme, null);
    }

    public /* synthetic */ ReactionsMessageAccessory(String str, List list, boolean z, boolean z2, String str2, String str3, String str4, ReactionsTheme reactionsTheme, DiscordTheme discordTheme, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, z, z2, str2, str3, str4, reactionsTheme, discordTheme);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41733component13Eiw7ao() {
        return mo41659getMessageId3Eiw7ao();
    }

    public final List<MessageReaction> component2() {
        return this.reactions;
    }

    public final boolean component3() {
        return this.canAddNewReactions;
    }

    public final boolean component4() {
        return this.canAddNewBurstReactions;
    }

    public final String component5() {
        return this.addReactionLabel;
    }

    public final String component6() {
        return this.addNewReactionAccessibilityLabel;
    }

    public final String component7() {
        return this.addNewBurstReactionAccessibilityLabel;
    }

    public final ReactionsTheme component8() {
        return this.reactionsTheme;
    }

    public final DiscordTheme component9() {
        return this.theme;
    }

    /* renamed from: copy-IwdeaXA  reason: not valid java name */
    public final ReactionsMessageAccessory m41734copyIwdeaXA(String messageId, List<MessageReaction> reactions, boolean z, boolean z2, String addReactionLabel, String addNewReactionAccessibilityLabel, String addNewBurstReactionAccessibilityLabel, ReactionsTheme reactionsTheme, DiscordTheme discordTheme) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(reactions, "reactions");
        C9612q.m13917h(addReactionLabel, "addReactionLabel");
        C9612q.m13917h(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        C9612q.m13917h(addNewBurstReactionAccessibilityLabel, "addNewBurstReactionAccessibilityLabel");
        return new ReactionsMessageAccessory(messageId, reactions, z, z2, addReactionLabel, addNewReactionAccessibilityLabel, addNewBurstReactionAccessibilityLabel, reactionsTheme, discordTheme, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReactionsMessageAccessory) {
            ReactionsMessageAccessory reactionsMessageAccessory = (ReactionsMessageAccessory) obj;
            return MessageId.m42077equalsimpl0(mo41659getMessageId3Eiw7ao(), reactionsMessageAccessory.mo41659getMessageId3Eiw7ao()) && C9612q.m13922c(this.reactions, reactionsMessageAccessory.reactions) && this.canAddNewReactions == reactionsMessageAccessory.canAddNewReactions && this.canAddNewBurstReactions == reactionsMessageAccessory.canAddNewBurstReactions && C9612q.m13922c(this.addReactionLabel, reactionsMessageAccessory.addReactionLabel) && C9612q.m13922c(this.addNewReactionAccessibilityLabel, reactionsMessageAccessory.addNewReactionAccessibilityLabel) && C9612q.m13922c(this.addNewBurstReactionAccessibilityLabel, reactionsMessageAccessory.addNewBurstReactionAccessibilityLabel) && C9612q.m13922c(this.reactionsTheme, reactionsMessageAccessory.reactionsTheme) && C9612q.m13922c(this.theme, reactionsMessageAccessory.theme);
        }
        return false;
    }

    public final String getAddNewBurstReactionAccessibilityLabel() {
        return this.addNewBurstReactionAccessibilityLabel;
    }

    public final String getAddNewReactionAccessibilityLabel() {
        return this.addNewReactionAccessibilityLabel;
    }

    public final String getAddReactionLabel() {
        return this.addReactionLabel;
    }

    public final boolean getCanAddNewBurstReactions() {
        return this.canAddNewBurstReactions;
    }

    public final boolean getCanAddNewReactions() {
        return this.canAddNewReactions;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41659getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final List<MessageReaction> getReactions() {
        return this.reactions;
    }

    public final ReactionsTheme getReactionsTheme() {
        return this.reactionsTheme;
    }

    public final DiscordTheme getTheme() {
        return this.theme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m42078hashCodeimpl = ((MessageId.m42078hashCodeimpl(mo41659getMessageId3Eiw7ao()) * 31) + this.reactions.hashCode()) * 31;
        boolean z = this.canAddNewReactions;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (m42078hashCodeimpl + i) * 31;
        boolean z2 = this.canAddNewBurstReactions;
        int hashCode = (((((((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.addReactionLabel.hashCode()) * 31) + this.addNewReactionAccessibilityLabel.hashCode()) * 31) + this.addNewBurstReactionAccessibilityLabel.hashCode()) * 31;
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        int hashCode2 = (hashCode + (reactionsTheme == null ? 0 : reactionsTheme.hashCode())) * 31;
        DiscordTheme discordTheme = this.theme;
        return hashCode2 + (discordTheme != null ? discordTheme.hashCode() : 0);
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(mo41659getMessageId3Eiw7ao());
        List<MessageReaction> list = this.reactions;
        boolean z = this.canAddNewReactions;
        boolean z2 = this.canAddNewBurstReactions;
        String str = this.addReactionLabel;
        String str2 = this.addNewReactionAccessibilityLabel;
        String str3 = this.addNewBurstReactionAccessibilityLabel;
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        DiscordTheme discordTheme = this.theme;
        return "ReactionsMessageAccessory(messageId=" + m42079toStringimpl + ", reactions=" + list + ", canAddNewReactions=" + z + ", canAddNewBurstReactions=" + z2 + ", addReactionLabel=" + str + ", addNewReactionAccessibilityLabel=" + str2 + ", addNewBurstReactionAccessibilityLabel=" + str3 + ", reactionsTheme=" + reactionsTheme + ", theme=" + discordTheme + ")";
    }

    private ReactionsMessageAccessory(String str, List<MessageReaction> list, boolean z, boolean z2, String str2, String str3, String str4, ReactionsTheme reactionsTheme, DiscordTheme discordTheme) {
        super(str, "reactions", null);
        this.messageId = str;
        this.reactions = list;
        this.canAddNewReactions = z;
        this.canAddNewBurstReactions = z2;
        this.addReactionLabel = str2;
        this.addNewReactionAccessibilityLabel = str3;
        this.addNewBurstReactionAccessibilityLabel = str4;
        this.reactionsTheme = reactionsTheme;
        this.theme = discordTheme;
    }
}
