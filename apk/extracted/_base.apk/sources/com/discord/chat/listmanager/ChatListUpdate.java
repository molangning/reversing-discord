package com.discord.chat.listmanager;

import com.discord.chat.presentation.list.item.ChatListItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, m14357d2 = {"Lcom/discord/chat/listmanager/ChatListUpdate;", "", "items", "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "action", "Lcom/discord/chat/listmanager/ChatListAction;", "listOperations", "Lcom/discord/chat/listmanager/ListOperation;", "(Ljava/util/List;Lcom/discord/chat/listmanager/ChatListAction;Ljava/util/List;)V", "getAction", "()Lcom/discord/chat/listmanager/ChatListAction;", "getItems", "()Ljava/util/List;", "getListOperations", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatListUpdate {
    private final ChatListAction action;
    private final List<ChatListItem> items;
    private final List<ListOperation> listOperations;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatListUpdate(List<? extends ChatListItem> items, ChatListAction action, List<? extends ListOperation> list) {
        C9612q.m13917h(items, "items");
        C9612q.m13917h(action, "action");
        this.items = items;
        this.action = action;
        this.listOperations = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatListUpdate copy$default(ChatListUpdate chatListUpdate, List list, ChatListAction chatListAction, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chatListUpdate.items;
        }
        if ((i & 2) != 0) {
            chatListAction = chatListUpdate.action;
        }
        if ((i & 4) != 0) {
            list2 = chatListUpdate.listOperations;
        }
        return chatListUpdate.copy(list, chatListAction, list2);
    }

    public final List<ChatListItem> component1() {
        return this.items;
    }

    public final ChatListAction component2() {
        return this.action;
    }

    public final List<ListOperation> component3() {
        return this.listOperations;
    }

    public final ChatListUpdate copy(List<? extends ChatListItem> items, ChatListAction action, List<? extends ListOperation> list) {
        C9612q.m13917h(items, "items");
        C9612q.m13917h(action, "action");
        return new ChatListUpdate(items, action, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatListUpdate) {
            ChatListUpdate chatListUpdate = (ChatListUpdate) obj;
            return C9612q.m13922c(this.items, chatListUpdate.items) && C9612q.m13922c(this.action, chatListUpdate.action) && C9612q.m13922c(this.listOperations, chatListUpdate.listOperations);
        }
        return false;
    }

    public final ChatListAction getAction() {
        return this.action;
    }

    public final List<ChatListItem> getItems() {
        return this.items;
    }

    public final List<ListOperation> getListOperations() {
        return this.listOperations;
    }

    public int hashCode() {
        int hashCode = ((this.items.hashCode() * 31) + this.action.hashCode()) * 31;
        List<ListOperation> list = this.listOperations;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        List<ChatListItem> list = this.items;
        ChatListAction chatListAction = this.action;
        List<ListOperation> list2 = this.listOperations;
        return "ChatListUpdate(items=" + list + ", action=" + chatListAction + ", listOperations=" + list2 + ")";
    }
}
