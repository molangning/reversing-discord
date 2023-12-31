package com.discord.chat.presentation.list.delegate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.EmbeddedActivityChatListItem;
import com.discord.chat.presentation.message.EmbeddedActivityMessageView;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\u0002\u0010\bJ&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001b\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, m14357d2 = {"Lcom/discord/chat/presentation/list/delegate/EmbeddedActivityMessageDelegate;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/EmbeddedActivityChatListItem;", "Lcom/discord/chat/presentation/message/EmbeddedActivityMessageView;", "eventHandlerProvider", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "(Lkotlin/jvm/functions/Function0;)V", "getEventHandlerProvider", "()Lkotlin/jvm/functions/Function0;", "bindView", "", "view", "item", "metadata", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;", "bindViewInternal", "createView", "parent", "Landroid/view/ViewGroup;", "isForItem", "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.POSITION, "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EmbeddedActivityMessageDelegate extends BaseChatListItemDelegate<EmbeddedActivityChatListItem, EmbeddedActivityMessageView> {
    private final Function0<ChatEventHandler> eventHandlerProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmbeddedActivityMessageDelegate(Function0<? extends ChatEventHandler> eventHandlerProvider) {
        super(eventHandlerProvider, null, 2, null);
        C9612q.m13917h(eventHandlerProvider, "eventHandlerProvider");
        this.eventHandlerProvider = eventHandlerProvider;
    }

    private final void bindViewInternal(EmbeddedActivityMessageView embeddedActivityMessageView, final EmbeddedActivityChatListItem embeddedActivityChatListItem) {
        embeddedActivityMessageView.setItem(embeddedActivityChatListItem, new View.OnClickListener() { // from class: com.discord.chat.presentation.list.delegate.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmbeddedActivityMessageDelegate.bindViewInternal$lambda$0(EmbeddedActivityMessageDelegate.this, embeddedActivityChatListItem, view);
            }
        }, new View.OnClickListener() { // from class: com.discord.chat.presentation.list.delegate.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmbeddedActivityMessageDelegate.bindViewInternal$lambda$1(EmbeddedActivityMessageDelegate.this, embeddedActivityChatListItem, view);
            }
        });
        ViewGroup.LayoutParams layoutParams = embeddedActivityMessageView.getLayoutParams();
        if (layoutParams != null) {
            RecyclerView.C1772i c1772i = (RecyclerView.C1772i) layoutParams;
            ((ViewGroup.MarginLayoutParams) c1772i).leftMargin = SizeUtilsKt.getDpToPx(12);
            ((ViewGroup.MarginLayoutParams) c1772i).rightMargin = SizeUtilsKt.getDpToPx(4);
            embeddedActivityMessageView.setLayoutParams(c1772i);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
    }

    public static final void bindViewInternal$lambda$0(EmbeddedActivityMessageDelegate this$0, EmbeddedActivityChatListItem item, View view) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(item, "$item");
        this$0.eventHandlerProvider.invoke().onTapJoinEmbeddedActivity(item.getEmbeddedActivityKey());
    }

    public static final void bindViewInternal$lambda$1(EmbeddedActivityMessageDelegate this$0, EmbeddedActivityChatListItem item, View view) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(item, "$item");
        this$0.eventHandlerProvider.invoke().onTapDismissEmbeddedActivity(item.getEmbeddedActivityKey());
    }

    public final Function0<ChatEventHandler> getEventHandlerProvider() {
        return this.eventHandlerProvider;
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public boolean isForItem(ChatListItem item, int i) {
        C9612q.m13917h(item, "item");
        return item instanceof EmbeddedActivityChatListItem;
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public void bindView(EmbeddedActivityMessageView view, EmbeddedActivityChatListItem item, BaseChatListItemDelegate.Metadata<EmbeddedActivityMessageView> metadata) {
        C9612q.m13917h(view, "view");
        C9612q.m13917h(item, "item");
        C9612q.m13917h(metadata, "metadata");
        bindViewInternal(view, item);
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public EmbeddedActivityMessageView createView(ViewGroup parent) {
        C9612q.m13917h(parent, "parent");
        Context context = parent.getContext();
        C9612q.m13918g(context, "parent.context");
        return new EmbeddedActivityMessageView(context, null, 2, null);
    }
}