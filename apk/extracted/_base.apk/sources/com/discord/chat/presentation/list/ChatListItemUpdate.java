package com.discord.chat.presentation.list;

import com.discord.chat.listmanager.ListOperation;
import com.discord.chat.presentation.list.item.ChatListItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\rJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JU\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\bHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m14357d2 = {"Lcom/discord/chat/presentation/list/ChatListItemUpdate;", "Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;", "items", "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "listOperations", "Lcom/discord/chat/listmanager/ListOperation;", "updateId", "", "preCommit", "Lkotlin/Function0;", "", "postCommit", "(Ljava/util/List;Ljava/util/List;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getItems", "()Ljava/util/List;", "getListOperations", "getPostCommit", "()Lkotlin/jvm/functions/Function0;", "getPreCommit", "getUpdateId", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatListItemUpdate extends ChannelChatListAdapterUpdate {
    private final List<ChatListItem> items;
    private final List<ListOperation> listOperations;
    private final Function0<Unit> postCommit;
    private final Function0<Unit> preCommit;
    private final int updateId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatListItemUpdate(List<? extends ChatListItem> items, List<? extends ListOperation> list, int i, Function0<Unit> preCommit, Function0<Unit> postCommit) {
        super(i, preCommit, postCommit, null);
        C9612q.m13917h(items, "items");
        C9612q.m13917h(preCommit, "preCommit");
        C9612q.m13917h(postCommit, "postCommit");
        this.items = items;
        this.listOperations = list;
        this.updateId = i;
        this.preCommit = preCommit;
        this.postCommit = postCommit;
    }

    public static /* synthetic */ ChatListItemUpdate copy$default(ChatListItemUpdate chatListItemUpdate, List list, List list2, int i, Function0 function0, Function0 function02, int i2, Object obj) {
        List<ChatListItem> list3 = list;
        if ((i2 & 1) != 0) {
            list3 = chatListItemUpdate.items;
        }
        List<ListOperation> list4 = list2;
        if ((i2 & 2) != 0) {
            list4 = chatListItemUpdate.listOperations;
        }
        List list5 = list4;
        if ((i2 & 4) != 0) {
            i = chatListItemUpdate.getUpdateId();
        }
        int i3 = i;
        Function0<Unit> function03 = function0;
        if ((i2 & 8) != 0) {
            function03 = chatListItemUpdate.getPreCommit();
        }
        Function0 function04 = function03;
        Function0<Unit> function05 = function02;
        if ((i2 & 16) != 0) {
            function05 = chatListItemUpdate.getPostCommit();
        }
        return chatListItemUpdate.copy(list3, list5, i3, function04, function05);
    }

    public final List<ChatListItem> component1() {
        return this.items;
    }

    public final List<ListOperation> component2() {
        return this.listOperations;
    }

    public final int component3() {
        return getUpdateId();
    }

    public final Function0<Unit> component4() {
        return getPreCommit();
    }

    public final Function0<Unit> component5() {
        return getPostCommit();
    }

    public final ChatListItemUpdate copy(List<? extends ChatListItem> items, List<? extends ListOperation> list, int i, Function0<Unit> preCommit, Function0<Unit> postCommit) {
        C9612q.m13917h(items, "items");
        C9612q.m13917h(preCommit, "preCommit");
        C9612q.m13917h(postCommit, "postCommit");
        return new ChatListItemUpdate(items, list, i, preCommit, postCommit);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatListItemUpdate) {
            ChatListItemUpdate chatListItemUpdate = (ChatListItemUpdate) obj;
            return C9612q.m13922c(this.items, chatListItemUpdate.items) && C9612q.m13922c(this.listOperations, chatListItemUpdate.listOperations) && getUpdateId() == chatListItemUpdate.getUpdateId() && C9612q.m13922c(getPreCommit(), chatListItemUpdate.getPreCommit()) && C9612q.m13922c(getPostCommit(), chatListItemUpdate.getPostCommit());
        }
        return false;
    }

    public final List<ChatListItem> getItems() {
        return this.items;
    }

    public final List<ListOperation> getListOperations() {
        return this.listOperations;
    }

    @Override // com.discord.chat.presentation.list.ChannelChatListAdapterUpdate
    public Function0<Unit> getPostCommit() {
        return this.postCommit;
    }

    @Override // com.discord.chat.presentation.list.ChannelChatListAdapterUpdate
    public Function0<Unit> getPreCommit() {
        return this.preCommit;
    }

    @Override // com.discord.chat.presentation.list.ChannelChatListAdapterUpdate
    public int getUpdateId() {
        return this.updateId;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        List<ListOperation> list = this.listOperations;
        return ((((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + getUpdateId()) * 31) + getPreCommit().hashCode()) * 31) + getPostCommit().hashCode();
    }

    public String toString() {
        List<ChatListItem> list = this.items;
        List<ListOperation> list2 = this.listOperations;
        int updateId = getUpdateId();
        Function0<Unit> preCommit = getPreCommit();
        Function0<Unit> postCommit = getPostCommit();
        return "ChatListItemUpdate(items=" + list + ", listOperations=" + list2 + ", updateId=" + updateId + ", preCommit=" + preCommit + ", postCommit=" + postCommit + ")";
    }
}
