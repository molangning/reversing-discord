package com.discord.chat.presentation.list.item;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11577n;
import pf.EnumC11580p;

@Metadata(m14358d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u0082\u0001\r\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m14357d2 = {"Lcom/discord/chat/presentation/list/item/ChatListItem;", "", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "recyclerItemId", "", "getRecyclerItemId", "()J", "recyclerItemId$delegate", "Lkotlin/Lazy;", "Lcom/discord/chat/presentation/list/item/AutomodSystemMessageItem;", "Lcom/discord/chat/presentation/list/item/BlockedGroupChatListItem;", "Lcom/discord/chat/presentation/list/item/CallSystemMessageItem;", "Lcom/discord/chat/presentation/list/item/DeserializationErrorChatListItem;", "Lcom/discord/chat/presentation/list/item/DeserializationErrorMessageItem;", "Lcom/discord/chat/presentation/list/item/EmbeddedActivityChatListItem;", "Lcom/discord/chat/presentation/list/item/LoadingChatListItem;", "Lcom/discord/chat/presentation/list/item/MessageBundleItem;", "Lcom/discord/chat/presentation/list/item/MessageItem;", "Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;", "Lcom/discord/chat/presentation/list/item/SeparatorChatListItem;", "Lcom/discord/chat/presentation/list/item/SummarySeparatorChatListItem;", "Lcom/discord/chat/presentation/list/item/SystemMessageItem;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class ChatListItem {

    /* renamed from: id */
    private final String f8392id;
    private final Lazy recyclerItemId$delegate;

    private ChatListItem(String str) {
        Lazy m7600b;
        this.f8392id = str;
        m7600b = C11577n.m7600b(EnumC11580p.NONE, new ChatListItem$recyclerItemId$2(this));
        this.recyclerItemId$delegate = m7600b;
    }

    public /* synthetic */ ChatListItem(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String getId() {
        return this.f8392id;
    }

    public final long getRecyclerItemId() {
        return ((Number) this.recyclerItemId$delegate.getValue()).longValue();
    }
}