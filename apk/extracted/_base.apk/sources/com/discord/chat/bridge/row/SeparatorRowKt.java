package com.discord.chat.bridge.row;

import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.SeparatorChatListItem;
import com.discord.chat.presentation.list.item.SummarySeparatorChatListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m14357d2 = {"toSeparatorChatListItem", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "Lcom/discord/chat/bridge/row/SeparatorRow;", "chat_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SeparatorRowKt {
    public static final ChatListItem toSeparatorChatListItem(SeparatorRow separatorRow) {
        C9612q.m13917h(separatorRow, "<this>");
        if (separatorRow.getSummary() != null) {
            return new SummarySeparatorChatListItem(separatorRow.getColor(), separatorRow.getSummary(), C9612q.m13922c(separatorRow.isBeforeContent(), Boolean.TRUE));
        }
        return new SeparatorChatListItem(separatorRow.getColor(), separatorRow.getText());
    }
}
