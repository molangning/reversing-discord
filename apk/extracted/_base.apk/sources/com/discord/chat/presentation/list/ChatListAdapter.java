package com.discord.chat.presentation.list;

import com.discord.chat.presentation.list.item.ChatListItem;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&¨\u0006\b"}, m14357d2 = {"Lcom/discord/chat/presentation/list/ChatListAdapter;", "", "getChatListItem", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.POSITION, "", "getChatListItems", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public interface ChatListAdapter {
    ChatListItem getChatListItem(int i);

    List<ChatListItem> getChatListItems();
}
