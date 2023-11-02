package com.discord.chat.presentation.list.delegate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.SummarySeparatorChatListItem;
import com.discord.chat.presentation.separator.SummarySeparatorView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\u0002\u0010\bJ&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0017"}, m14357d2 = {"Lcom/discord/chat/presentation/list/delegate/SummarySeparatorDelegate;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/SummarySeparatorChatListItem;", "Lcom/discord/chat/presentation/separator/SummarySeparatorView;", "eventHandlerProvider", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "(Lkotlin/jvm/functions/Function0;)V", "bindView", "", "view", "item", "metadata", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;", "createView", "parent", "Landroid/view/ViewGroup;", "isForItem", "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.POSITION, "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SummarySeparatorDelegate extends BaseChatListItemDelegate<SummarySeparatorChatListItem, SummarySeparatorView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummarySeparatorDelegate(Function0<? extends ChatEventHandler> eventHandlerProvider) {
        super(eventHandlerProvider, null, 2, null);
        C9612q.m13917h(eventHandlerProvider, "eventHandlerProvider");
    }

    public static final void bindView$lambda$2$lambda$0(SummarySeparatorDelegate this$0, SummarySeparatorChatListItem item, View view) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(item, "$item");
        this$0.getEventHandler().mo41608onTapSummarysekaTiM(item.getSummary().m41564getChannelIdo4g7jtM(), item.m41625getCurrentMsgId3Eiw7ao(), item.getSummary().getId());
    }

    public static final void bindView$lambda$2$lambda$1(SummarySeparatorDelegate this$0, SummarySeparatorChatListItem item, View view) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(item, "$item");
        this$0.getEventHandler().mo41609onTapSummaryJumpsekaTiM(item.getSummary().m41564getChannelIdo4g7jtM(), item.m41626getJumpToMsgId3Eiw7ao(), item.getSummary().getId());
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public boolean isForItem(ChatListItem item, int i) {
        C9612q.m13917h(item, "item");
        return item instanceof SummarySeparatorChatListItem;
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public void bindView(SummarySeparatorView view, final SummarySeparatorChatListItem item, BaseChatListItemDelegate.Metadata<SummarySeparatorView> metadata) {
        C9612q.m13917h(view, "view");
        C9612q.m13917h(item, "item");
        C9612q.m13917h(metadata, "metadata");
        view.setDividerColor(item.getColor());
        view.setText(item.getText());
        view.setIsBeforeContent(item.isBeforeContent());
        view.setMoreActionsHandler(new View.OnClickListener() { // from class: com.discord.chat.presentation.list.delegate.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SummarySeparatorDelegate.bindView$lambda$2$lambda$0(SummarySeparatorDelegate.this, item, view2);
            }
        });
        view.setJumpToBottomHandler(new View.OnClickListener() { // from class: com.discord.chat.presentation.list.delegate.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SummarySeparatorDelegate.bindView$lambda$2$lambda$1(SummarySeparatorDelegate.this, item, view2);
            }
        });
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public SummarySeparatorView createView(ViewGroup parent) {
        C9612q.m13917h(parent, "parent");
        Context context = parent.getContext();
        C9612q.m13918g(context, "parent.context");
        return new SummarySeparatorView(context, null, 2, null);
    }
}