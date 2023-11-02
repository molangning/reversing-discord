package com.discord.chat.presentation.list.delegate;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.messageframe.MessageFrame;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.ChatListAdapter;
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.MessageItem;
import com.discord.chat.presentation.message.MessageView;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007\u0012\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\t0\u0005j\u0002`\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ&\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u0014\u0010\u000e\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\u0004\u0012\u00020\t0\u0005j\u0002`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m14357d2 = {"Lcom/discord/chat/presentation/list/delegate/RegularMessageDelegate;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/MessageItem;", "Lcom/discord/chat/presentation/message/MessageView;", "eventHandlerProvider", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "messageComponentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "Lcom/discord/chat/presentation/list/delegate/MessageComponentProvider;", "messageAccessoriesRecycledViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V", "componentProvider", "getComponentProvider", "()Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "bindView", "", "view", "item", "metadata", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;", "createView", "parent", "Landroid/view/ViewGroup;", "getChainPart", "Lcom/discord/chat/presentation/message/MessageView$ChainPart;", "isForItem", "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.POSITION, "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class RegularMessageDelegate extends BaseChatListItemDelegate<MessageItem, MessageView> {
    private final RecyclerView.RecycledViewPool messageAccessoriesRecycledViewPool;
    private final Function0<ComponentProvider> messageComponentProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularMessageDelegate(Function0<? extends ChatEventHandler> eventHandlerProvider, Function0<ComponentProvider> messageComponentProvider, RecyclerView.RecycledViewPool messageAccessoriesRecycledViewPool) {
        super(eventHandlerProvider, null, 2, null);
        C9612q.m13917h(eventHandlerProvider, "eventHandlerProvider");
        C9612q.m13917h(messageComponentProvider, "messageComponentProvider");
        C9612q.m13917h(messageAccessoriesRecycledViewPool, "messageAccessoriesRecycledViewPool");
        this.messageComponentProvider = messageComponentProvider;
        this.messageAccessoriesRecycledViewPool = messageAccessoriesRecycledViewPool;
    }

    public final MessageView.ChainPart getChainPart(MessageItem messageItem, BaseChatListItemDelegate.Metadata<MessageView> metadata) {
        Object m14053W;
        boolean z;
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = metadata.getHolder().getBindingAdapter();
        C9612q.m13919f(bindingAdapter, "null cannot be cast to non-null type com.discord.chat.presentation.list.ChatListAdapter");
        boolean z2 = true;
        m14053W = C9553r.m14053W(((ChatListAdapter) bindingAdapter).getChatListItems(), metadata.getHolder().getBindingAdapterPosition() - 1);
        ChatListItem chatListItem = (ChatListItem) m14053W;
        if (messageItem.getMessage().getTimestamp() == null) {
            z = true;
        } else {
            z = false;
        }
        if (!(chatListItem instanceof MessageItem) || ((MessageItem) chatListItem).getMessage().getTimestamp() != null) {
            z2 = false;
        }
        if (z2 && !z) {
            return MessageView.ChainPart.START;
        }
        if (z2 && z) {
            return MessageView.ChainPart.MIDDLE;
        }
        if (!z2 && z) {
            return MessageView.ChainPart.END;
        }
        return MessageView.ChainPart.ONLY;
    }

    private final ComponentProvider getComponentProvider() {
        return this.messageComponentProvider.invoke();
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public boolean isForItem(ChatListItem item, int i) {
        C9612q.m13917h(item, "item");
        return item instanceof MessageItem;
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public void bindView(MessageView view, MessageItem item, BaseChatListItemDelegate.Metadata<MessageView> metadata) {
        C9612q.m13917h(view, "view");
        C9612q.m13917h(item, "item");
        C9612q.m13917h(metadata, "metadata");
        Message message = item.getMessage();
        MessageFrame messageFrame = item.getMessageFrame();
        ChatEventHandler eventHandler = getEventHandler();
        ComponentProvider componentProvider = getComponentProvider();
        view.setMessage(message, item.getMessageContext(), messageFrame, eventHandler, componentProvider, new RegularMessageDelegate$bindView$1(this, item, metadata), item.getAllowChildGestures(), item.isHighlight(), item.getRenderContentOnly());
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public MessageView createView(ViewGroup parent) {
        C9612q.m13917h(parent, "parent");
        Context context = parent.getContext();
        C9612q.m13918g(context, "parent.context");
        MessageView messageView = new MessageView(context, null, 2, null);
        messageView.setAccessoriesRecycledViewPool(this.messageAccessoriesRecycledViewPool);
        return messageView;
    }
}