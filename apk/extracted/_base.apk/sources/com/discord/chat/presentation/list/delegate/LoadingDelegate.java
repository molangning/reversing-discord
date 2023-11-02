package com.discord.chat.presentation.list.delegate;

import android.content.Context;
import android.view.ViewGroup;
import com.discord.chat.bridge.row.LoadMoreButton;
import com.discord.chat.bridge.row.LoadingActionType;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.LoadingChatListItem;
import com.discord.chat.presentation.loading.ChatLoadingView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\u0002\u0010\bJ&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0017"}, m14357d2 = {"Lcom/discord/chat/presentation/list/delegate/LoadingDelegate;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/LoadingChatListItem;", "Lcom/discord/chat/presentation/loading/ChatLoadingView;", "eventHandlerProvider", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "(Lkotlin/jvm/functions/Function0;)V", "bindView", "", "view", "item", "metadata", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;", "createView", "parent", "Landroid/view/ViewGroup;", "isForItem", "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.POSITION, "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class LoadingDelegate extends BaseChatListItemDelegate<LoadingChatListItem, ChatLoadingView> {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadingActionType.values().length];
            try {
                iArr[LoadingActionType.LOAD_MORE_BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadingActionType.LOAD_MORE_AFTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingDelegate(Function0<? extends ChatEventHandler> eventHandlerProvider) {
        super(eventHandlerProvider, null, 2, null);
        C9612q.m13917h(eventHandlerProvider, "eventHandlerProvider");
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public boolean isForItem(ChatListItem item, int i) {
        C9612q.m13917h(item, "item");
        return item instanceof LoadingChatListItem;
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public void bindView(ChatLoadingView view, LoadingChatListItem item, BaseChatListItemDelegate.Metadata<ChatLoadingView> metadata) {
        Function0<Unit> loadingDelegate$bindView$1;
        C9612q.m13917h(view, "view");
        C9612q.m13917h(item, "item");
        C9612q.m13917h(metadata, "metadata");
        if (item.isLoading()) {
            view.showProgress();
            return;
        }
        LoadMoreButton button = item.getButton();
        int i = WhenMappings.$EnumSwitchMapping$0[item.getButton().getAction().getType().ordinal()];
        if (i == 1) {
            loadingDelegate$bindView$1 = new LoadingDelegate$bindView$1(getEventHandler());
        } else if (i != 2) {
            throw new C11581q();
        } else {
            loadingDelegate$bindView$1 = new LoadingDelegate$bindView$2(getEventHandler());
        }
        view.showButton(button, loadingDelegate$bindView$1);
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public ChatLoadingView createView(ViewGroup parent) {
        C9612q.m13917h(parent, "parent");
        Context context = parent.getContext();
        C9612q.m13918g(context, "parent.context");
        return new ChatLoadingView(context, null, 2, null);
    }
}
