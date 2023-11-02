package com.discord.chat.presentation.root;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.SwipeActionsType;
import com.discord.chat.bridge.messageframe.MessageFrame;
import com.discord.chat.bridge.messageframe.MessageFrameType;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.chat.bridge.row.MessageRow;
import com.discord.chat.bridge.truncation.Truncation;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m14357d2 = {"getMessageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "Lcom/discord/chat/bridge/row/MessageRow;", "chat_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageContextKt {
    public static final MessageContext getMessageContext(MessageRow messageRow) {
        MessageFrameType messageFrameType;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C9612q.m13917h(messageRow, "<this>");
        MessageFrame messageFrame = messageRow.getMessageFrame();
        if (messageFrame != null) {
            messageFrameType = messageFrame.getType();
        } else {
            messageFrameType = null;
        }
        if (messageFrameType == MessageFrameType.JUMP_MESSAGE_FRAME) {
            z = true;
        } else {
            z = false;
        }
        Boolean canAddNewReactions = messageRow.getCanAddNewReactions();
        Boolean bool = Boolean.TRUE;
        boolean m13922c = C9612q.m13922c(canAddNewReactions, bool);
        String addReactionLabel = messageRow.getAddReactionLabel();
        String str = "";
        if (addReactionLabel == null) {
            addReactionLabel = "";
        }
        String addNewReactionAccessibilityLabel = messageRow.getAddNewReactionAccessibilityLabel();
        if (addNewReactionAccessibilityLabel == null) {
            addNewReactionAccessibilityLabel = "";
        }
        String addNewBurstReactionAccessibilityLabel = messageRow.getAddNewBurstReactionAccessibilityLabel();
        if (addNewBurstReactionAccessibilityLabel != null) {
            str = addNewBurstReactionAccessibilityLabel;
        }
        ReactionsTheme reactionsTheme = messageRow.getReactionsTheme();
        Truncation truncation = messageRow.getTruncation();
        if ((messageRow.getMessage() instanceof Message) && C9612q.m13922c(((Message) messageRow.getMessage()).getUseAttachmentGridLayout(), bool)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((messageRow.getMessage() instanceof Message) && C9612q.m13922c(((Message) messageRow.getMessage()).getUseAttachmentUploadPreview(), bool)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (messageRow.getSwipeActions() != SwipeActionsType.REPLY && messageRow.getSwipeActions() != SwipeActionsType.REPLY_EDIT) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (messageRow.getSwipeActions() == SwipeActionsType.REPLY_EDIT) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((messageRow.getMessage() instanceof Message) && C9612q.m13922c(((Message) messageRow.getMessage()).getUseAddBurstReaction(), bool)) {
            z6 = true;
        } else {
            z6 = false;
        }
        return new MessageContext(z, m13922c, addReactionLabel, addNewReactionAccessibilityLabel, str, reactionsTheme, truncation, z2, z3, z4, z5, z6, null, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, null);
    }
}
