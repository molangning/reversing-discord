package com.discord.chat.presentation.message.decorations;

import com.discord.chat.bridge.BackgroundHighlight;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.MessageItem;
import com.discord.chat.presentation.list.item.SystemMessageItem;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m14357d2 = {"getBackgroundHighlight", "Lcom/discord/chat/bridge/BackgroundHighlight;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "chat_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class BackgroundHighlightDecorationKt {
    public static final BackgroundHighlight getBackgroundHighlight(ChatListItem chatListItem) {
        if (chatListItem instanceof MessageItem) {
            return ((MessageItem) chatListItem).getBackgroundHighlight();
        }
        if (chatListItem instanceof SystemMessageItem) {
            return ((SystemMessageItem) chatListItem).getBackgroundHighlight();
        }
        return null;
    }
}