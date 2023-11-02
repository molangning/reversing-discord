package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.forums.ForumPostActions;
import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.primitives.MessageId;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BB\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0019\u0010\u001c\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\\\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\fHÖ\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, m14357d2 = {"Lcom/discord/chat/presentation/message/messagepart/ForumPostActionBar;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "postActions", "Lcom/discord/chat/bridge/forums/ForumPostActions;", "reactions", "", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "canAddNewReactions", "", "addNewReactionAccessibilityLabel", "", "reactionsTheme", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "(Ljava/lang/String;Lcom/discord/chat/bridge/forums/ForumPostActions;Ljava/util/List;ZLjava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAddNewReactionAccessibilityLabel", "()Ljava/lang/String;", "getCanAddNewReactions", "()Z", "getMessageId-3Eiw7ao", "Ljava/lang/String;", "getPostActions", "()Lcom/discord/chat/bridge/forums/ForumPostActions;", "getReactions", "()Ljava/util/List;", "getReactionsTheme", "()Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component5", "component6", "copy", "copy-LdU2QRA", "(Ljava/lang/String;Lcom/discord/chat/bridge/forums/ForumPostActions;Ljava/util/List;ZLjava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;)Lcom/discord/chat/presentation/message/messagepart/ForumPostActionBar;", "equals", "other", "", "hashCode", "", "toString", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ForumPostActionBar extends MessageAccessory {
    private final String addNewReactionAccessibilityLabel;
    private final boolean canAddNewReactions;
    private final String messageId;
    private final ForumPostActions postActions;
    private final List<MessageReaction> reactions;
    private final ReactionsTheme reactionsTheme;

    private ForumPostActionBar(String str, ForumPostActions forumPostActions, List<MessageReaction> list, boolean z, String str2, ReactionsTheme reactionsTheme) {
        super(str, "post-actions", null);
        this.messageId = str;
        this.postActions = forumPostActions;
        this.reactions = list;
        this.canAddNewReactions = z;
        this.addNewReactionAccessibilityLabel = str2;
        this.reactionsTheme = reactionsTheme;
    }

    public /* synthetic */ ForumPostActionBar(String str, ForumPostActions forumPostActions, List list, boolean z, String str2, ReactionsTheme reactionsTheme, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, forumPostActions, list, z, str2, reactionsTheme);
    }

    /* renamed from: copy-LdU2QRA$default  reason: not valid java name */
    public static /* synthetic */ ForumPostActionBar m41689copyLdU2QRA$default(ForumPostActionBar forumPostActionBar, String str, ForumPostActions forumPostActions, List list, boolean z, String str2, ReactionsTheme reactionsTheme, int i, Object obj) {
        if ((i & 1) != 0) {
            str = forumPostActionBar.mo41659getMessageId3Eiw7ao();
        }
        if ((i & 2) != 0) {
            forumPostActions = forumPostActionBar.postActions;
        }
        ForumPostActions forumPostActions2 = forumPostActions;
        List<MessageReaction> list2 = list;
        if ((i & 4) != 0) {
            list2 = forumPostActionBar.reactions;
        }
        List list3 = list2;
        if ((i & 8) != 0) {
            z = forumPostActionBar.canAddNewReactions;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str2 = forumPostActionBar.addNewReactionAccessibilityLabel;
        }
        String str3 = str2;
        if ((i & 32) != 0) {
            reactionsTheme = forumPostActionBar.reactionsTheme;
        }
        return forumPostActionBar.m41691copyLdU2QRA(str, forumPostActions2, list3, z2, str3, reactionsTheme);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41690component13Eiw7ao() {
        return mo41659getMessageId3Eiw7ao();
    }

    public final ForumPostActions component2() {
        return this.postActions;
    }

    public final List<MessageReaction> component3() {
        return this.reactions;
    }

    public final boolean component4() {
        return this.canAddNewReactions;
    }

    public final String component5() {
        return this.addNewReactionAccessibilityLabel;
    }

    public final ReactionsTheme component6() {
        return this.reactionsTheme;
    }

    /* renamed from: copy-LdU2QRA  reason: not valid java name */
    public final ForumPostActionBar m41691copyLdU2QRA(String messageId, ForumPostActions postActions, List<MessageReaction> list, boolean z, String addNewReactionAccessibilityLabel, ReactionsTheme reactionsTheme) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(postActions, "postActions");
        C9612q.m13917h(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        return new ForumPostActionBar(messageId, postActions, list, z, addNewReactionAccessibilityLabel, reactionsTheme, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ForumPostActionBar) {
            ForumPostActionBar forumPostActionBar = (ForumPostActionBar) obj;
            return MessageId.m42077equalsimpl0(mo41659getMessageId3Eiw7ao(), forumPostActionBar.mo41659getMessageId3Eiw7ao()) && C9612q.m13922c(this.postActions, forumPostActionBar.postActions) && C9612q.m13922c(this.reactions, forumPostActionBar.reactions) && this.canAddNewReactions == forumPostActionBar.canAddNewReactions && C9612q.m13922c(this.addNewReactionAccessibilityLabel, forumPostActionBar.addNewReactionAccessibilityLabel) && C9612q.m13922c(this.reactionsTheme, forumPostActionBar.reactionsTheme);
        }
        return false;
    }

    public final String getAddNewReactionAccessibilityLabel() {
        return this.addNewReactionAccessibilityLabel;
    }

    public final boolean getCanAddNewReactions() {
        return this.canAddNewReactions;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41659getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final ForumPostActions getPostActions() {
        return this.postActions;
    }

    public final List<MessageReaction> getReactions() {
        return this.reactions;
    }

    public final ReactionsTheme getReactionsTheme() {
        return this.reactionsTheme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m42078hashCodeimpl = ((MessageId.m42078hashCodeimpl(mo41659getMessageId3Eiw7ao()) * 31) + this.postActions.hashCode()) * 31;
        List<MessageReaction> list = this.reactions;
        int hashCode = (m42078hashCodeimpl + (list == null ? 0 : list.hashCode())) * 31;
        boolean z = this.canAddNewReactions;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.addNewReactionAccessibilityLabel.hashCode()) * 31;
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        return hashCode2 + (reactionsTheme != null ? reactionsTheme.hashCode() : 0);
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(mo41659getMessageId3Eiw7ao());
        ForumPostActions forumPostActions = this.postActions;
        List<MessageReaction> list = this.reactions;
        boolean z = this.canAddNewReactions;
        String str = this.addNewReactionAccessibilityLabel;
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        return "ForumPostActionBar(messageId=" + m42079toStringimpl + ", postActions=" + forumPostActions + ", reactions=" + list + ", canAddNewReactions=" + z + ", addNewReactionAccessibilityLabel=" + str + ", reactionsTheme=" + reactionsTheme + ")";
    }
}
