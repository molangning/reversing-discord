package com.discord.chat.presentation.list.delegate;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.PortalViewChatListItem;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\u0002\u0010\bJ&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0017"}, m14357d2 = {"Lcom/discord/chat/presentation/list/delegate/PortalViewDelegate;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;", "Landroid/widget/FrameLayout;", "eventHandlerProvider", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "(Lkotlin/jvm/functions/Function0;)V", "bindView", "", "view", "item", "metadata", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;", "createView", "parent", "Landroid/view/ViewGroup;", "isForItem", "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.POSITION, "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PortalViewDelegate extends BaseChatListItemDelegate<PortalViewChatListItem, FrameLayout> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortalViewDelegate(Function0<? extends ChatEventHandler> eventHandlerProvider) {
        super(eventHandlerProvider, null, 2, null);
        C9612q.m13917h(eventHandlerProvider, "eventHandlerProvider");
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public boolean isForItem(ChatListItem item, int i) {
        C9612q.m13917h(item, "item");
        return item instanceof PortalViewChatListItem;
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public void bindView(FrameLayout view, PortalViewChatListItem item, BaseChatListItemDelegate.Metadata<FrameLayout> metadata) {
        C9612q.m13917h(view, "view");
        C9612q.m13917h(item, "item");
        C9612q.m13917h(metadata, "metadata");
        item.getView().setVisibility(0);
        if (item.getView().getParent() != null) {
            ViewParent parent = item.getView().getParent();
            C9612q.m13919f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(item.getView());
        }
        if (item.getMeasuredDimensions() != null) {
            Pair<Integer, Integer> measuredDimensions = item.getMeasuredDimensions();
            int intValue = measuredDimensions.m14351a().intValue();
            int intValue2 = measuredDimensions.m14350b().intValue();
            View view2 = item.getView();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = intValue;
                layoutParams.height = intValue2;
                view2.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        view.removeAllViews();
        view.addView(item.getView());
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public FrameLayout createView(ViewGroup parent) {
        C9612q.m13917h(parent, "parent");
        return new FrameLayout(parent.getContext());
    }
}
