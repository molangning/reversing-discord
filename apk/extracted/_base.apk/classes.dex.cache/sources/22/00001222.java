package com.discord.chat.presentation.list.delegate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate;
import com.discord.chat.presentation.list.item.CallSystemMessageItem;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.message.system.CallSystemMessageView;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\u0002\u0010\bJ&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0016\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¨\u0006\u001b"}, m14357d2 = {"Lcom/discord/chat/presentation/list/delegate/CallSystemMessageDelegate;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/CallSystemMessageItem;", "Lcom/discord/chat/presentation/message/system/CallSystemMessageView;", "eventHandlerProvider", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "(Lkotlin/jvm/functions/Function0;)V", "bindView", "", "view", "item", "metadata", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;", "bindViewInternal", "createAndBindStandaloneView", "parent", "Landroid/view/ViewGroup;", "message", "Lcom/discord/chat/bridge/Message;", "createView", "isForItem", "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", ViewProps.POSITION, "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class CallSystemMessageDelegate extends BaseChatListItemDelegate<CallSystemMessageItem, CallSystemMessageView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallSystemMessageDelegate(Function0<? extends ChatEventHandler> eventHandlerProvider) {
        super(eventHandlerProvider, null, 2, null);
        C9612q.m13917h(eventHandlerProvider, "eventHandlerProvider");
    }

    private final void bindViewInternal(CallSystemMessageView callSystemMessageView, final CallSystemMessageItem callSystemMessageItem) {
        ViewGroup.LayoutParams layoutParams = callSystemMessageView.getLayoutParams();
        if (layoutParams != null) {
            RecyclerView.C1772i c1772i = (RecyclerView.C1772i) layoutParams;
            ((ViewGroup.MarginLayoutParams) c1772i).leftMargin = SizeUtilsKt.getDpToPx(12);
            ((ViewGroup.MarginLayoutParams) c1772i).rightMargin = SizeUtilsKt.getDpToPx(12);
            callSystemMessageView.setLayoutParams(c1772i);
            callSystemMessageView.setMessage(callSystemMessageItem.getMessage());
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(callSystemMessageView, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.list.delegate.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CallSystemMessageDelegate.bindViewInternal$lambda$2(CallSystemMessageDelegate.this, callSystemMessageItem, view);
                }
            }, 1, null);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
    }

    public static final void bindViewInternal$lambda$2(CallSystemMessageDelegate this$0, CallSystemMessageItem item, View view) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(item, "$item");
        this$0.getEventHandler().mo41588onTapCallpfaIj0E(item.getMessage().m41436getId3Eiw7ao(), item.getMessage().m41434getChannelIdo4g7jtM());
    }

    public final CallSystemMessageView createAndBindStandaloneView(ViewGroup parent, Message message) {
        C9612q.m13917h(parent, "parent");
        C9612q.m13917h(message, "message");
        CallSystemMessageView createView = createView(parent);
        bindViewInternal(createView, new CallSystemMessageItem(message));
        return createView;
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public boolean isForItem(ChatListItem item, int i) {
        C9612q.m13917h(item, "item");
        return item instanceof CallSystemMessageItem;
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public void bindView(CallSystemMessageView view, CallSystemMessageItem item, BaseChatListItemDelegate.Metadata<CallSystemMessageView> metadata) {
        C9612q.m13917h(view, "view");
        C9612q.m13917h(item, "item");
        C9612q.m13917h(metadata, "metadata");
        bindViewInternal(view, item);
    }

    @Override // com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
    public CallSystemMessageView createView(ViewGroup parent) {
        C9612q.m13917h(parent, "parent");
        Context context = parent.getContext();
        C9612q.m13918g(context, "parent.context");
        return new CallSystemMessageView(context, null, 2, null);
    }
}