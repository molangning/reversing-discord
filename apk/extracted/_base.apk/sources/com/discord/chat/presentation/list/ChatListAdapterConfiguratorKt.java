package com.discord.chat.presentation.list;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.delegate.AutomodSystemMessageDelegate;
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate;
import com.discord.chat.presentation.list.delegate.BlockedGroupDelegate;
import com.discord.chat.presentation.list.delegate.CallSystemMessageDelegate;
import com.discord.chat.presentation.list.delegate.DeserializationErrorDelegate;
import com.discord.chat.presentation.list.delegate.DeserializationErrorMessageDelegate;
import com.discord.chat.presentation.list.delegate.EmbeddedActivityMessageDelegate;
import com.discord.chat.presentation.list.delegate.LoadingDelegate;
import com.discord.chat.presentation.list.delegate.PortalViewDelegate;
import com.discord.chat.presentation.list.delegate.RegularMessageDelegate;
import com.discord.chat.presentation.list.delegate.SeparatorDelegate;
import com.discord.chat.presentation.list.delegate.SummarySeparatorDelegate;
import com.discord.chat.presentation.list.delegate.SystemMessageDelegate;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.hannesdorfmann.adapterdelegates4.AdapterDelegatesManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000D\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aj\u0010\u0000\u001a&\u0012\u001c\u0012\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0004\u0012\u0006\b\u0001\u0012\u00020\u00050\u00030\u0002\u0012\u0004\u0012\u00020\u00060\u00012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\b2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r2\u0010\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000bj\u0002`\u00102\u0006\u0010\u0011\u001a\u00020\u0012¨\u0006\u0013"}, m14357d2 = {"chatListAdapterConfigurator", "", "Ljava/lang/Class;", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "Landroid/view/View;", "", "delegatesManager", "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;", "", "eventHandlerProvider", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "messageComponentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "Lcom/discord/chat/presentation/list/delegate/MessageComponentProvider;", "messageAccessoriesRecycledViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "chat_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatListAdapterConfiguratorKt {
    public static final Map<Class<? extends BaseChatListItemDelegate<? extends ChatListItem, ? extends View>>, Integer> chatListAdapterConfigurator(AdapterDelegatesManager<List<ChatListItem>> delegatesManager, Function0<? extends ChatEventHandler> eventHandlerProvider, Function0<ComponentProvider> messageComponentProvider, RecyclerView.RecycledViewPool messageAccessoriesRecycledViewPool) {
        List<BaseChatListItemDelegate> m14101l;
        C9612q.m13917h(delegatesManager, "delegatesManager");
        C9612q.m13917h(eventHandlerProvider, "eventHandlerProvider");
        C9612q.m13917h(messageComponentProvider, "messageComponentProvider");
        C9612q.m13917h(messageAccessoriesRecycledViewPool, "messageAccessoriesRecycledViewPool");
        HashMap hashMap = new HashMap();
        m14101l = C9545j.m14101l(new RegularMessageDelegate(eventHandlerProvider, messageComponentProvider, messageAccessoriesRecycledViewPool), new SystemMessageDelegate(eventHandlerProvider, messageAccessoriesRecycledViewPool), new AutomodSystemMessageDelegate(eventHandlerProvider, messageComponentProvider, messageAccessoriesRecycledViewPool), new CallSystemMessageDelegate(eventHandlerProvider), new EmbeddedActivityMessageDelegate(eventHandlerProvider), new SeparatorDelegate(eventHandlerProvider), new SummarySeparatorDelegate(eventHandlerProvider), new LoadingDelegate(eventHandlerProvider), new BlockedGroupDelegate(eventHandlerProvider, messageComponentProvider), new PortalViewDelegate(eventHandlerProvider), new DeserializationErrorMessageDelegate(eventHandlerProvider), new DeserializationErrorDelegate(eventHandlerProvider));
        for (BaseChatListItemDelegate baseChatListItemDelegate : m14101l) {
            delegatesManager.m26104c(baseChatListItemDelegate);
            hashMap.put(baseChatListItemDelegate.getClass(), Integer.valueOf(delegatesManager.m26101f(baseChatListItemDelegate)));
        }
        return hashMap;
    }
}
