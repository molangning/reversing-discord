package com.discord.chat.presentation.list.delegate;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.facebook.react.uimanager.ViewProps;
import com.hannesdorfmann.adapterdelegates4.AdapterDelegate;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@kotlin.Metadata(m14358d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u0005:\u0001+B/\u0012\u0010\u0010!\u001a\f\u0012\u0004\u0012\u00020\u001f0\u001ej\u0002` \u0012\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00130#¢\u0006\u0004\b)\u0010*J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH&J\u0017\u0010\u000e\u001a\u00028\u00012\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0004J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\fH\u0004J4\u0010\u001d\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0006H\u0004R\u001e\u0010!\u001a\f\u0012\u0004\u0012\u00020\u001f0\u001ej\u0002` 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00130#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u001f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006,"}, m14357d2 = {"Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "T", "Landroid/view/View;", "V", "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;", "", "item", "", ViewProps.POSITION, "", "isForItem", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "view", "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;", "metadata", "", "bindView", "(Landroid/view/View;Lcom/discord/chat/presentation/list/item/ChatListItem;Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;)V", "items", "isForViewType", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onCreateViewHolder", "holder", "", "payloads", "onBindViewHolder", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "eventHandlerProvider", "Lkotlin/jvm/functions/Function0;", "Lkotlin/Function1;", "initBlock", "Lkotlin/jvm/functions/Function1;", "getEventHandler", "()Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Metadata", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class BaseChatListItemDelegate<T extends ChatListItem, V extends View> extends AdapterDelegate<List<? extends ChatListItem>> {
    private final Function0<ChatEventHandler> eventHandlerProvider;
    private final Function1<V, Unit> initBlock;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.Metadata(m14358d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005*\u0002H\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m14357d2 = {"<anonymous>", "", "T", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "V", "Landroid/view/View;", "invoke", "(Landroid/view/View;)V"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C29541 extends AbstractC9614s implements Function1<V, Unit> {
        public static final C29541 INSTANCE = new C29541();

        C29541() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((C29541) ((View) obj));
            return Unit.f25302a;
        }

        public final void invoke(V v) {
            C9612q.m13917h(v, "$this$null");
            v.setLayoutParams(new RecyclerView.C1772i(-1, -2));
        }
    }

    @kotlin.Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0003B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J?\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, m14357d2 = {"Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;", "V", "Landroid/view/View;", "", "holder", "Lcom/discord/chat/presentation/list/delegate/ChatListItemViewHolder;", "items", "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "payloads", "(Lcom/discord/chat/presentation/list/delegate/ChatListItemViewHolder;Ljava/util/List;Ljava/util/List;)V", "getHolder", "()Lcom/discord/chat/presentation/list/delegate/ChatListItemViewHolder;", "getItems", "()Ljava/util/List;", "getPayloads", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Metadata<V extends View> {
        private final ChatListItemViewHolder<V> holder;
        private final List<ChatListItem> items;
        private final List<Object> payloads;

        /* JADX WARN: Multi-variable type inference failed */
        public Metadata(ChatListItemViewHolder<V> holder, List<? extends ChatListItem> items, List<? extends Object> payloads) {
            C9612q.m13917h(holder, "holder");
            C9612q.m13917h(items, "items");
            C9612q.m13917h(payloads, "payloads");
            this.holder = holder;
            this.items = items;
            this.payloads = payloads;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Metadata copy$default(Metadata metadata, ChatListItemViewHolder chatListItemViewHolder, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                chatListItemViewHolder = metadata.holder;
            }
            if ((i & 2) != 0) {
                list = metadata.items;
            }
            if ((i & 4) != 0) {
                list2 = metadata.payloads;
            }
            return metadata.copy(chatListItemViewHolder, list, list2);
        }

        public final ChatListItemViewHolder<V> component1() {
            return this.holder;
        }

        public final List<ChatListItem> component2() {
            return this.items;
        }

        public final List<Object> component3() {
            return this.payloads;
        }

        public final Metadata<V> copy(ChatListItemViewHolder<V> holder, List<? extends ChatListItem> items, List<? extends Object> payloads) {
            C9612q.m13917h(holder, "holder");
            C9612q.m13917h(items, "items");
            C9612q.m13917h(payloads, "payloads");
            return new Metadata<>(holder, items, payloads);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Metadata) {
                Metadata metadata = (Metadata) obj;
                return C9612q.m13922c(this.holder, metadata.holder) && C9612q.m13922c(this.items, metadata.items) && C9612q.m13922c(this.payloads, metadata.payloads);
            }
            return false;
        }

        public final ChatListItemViewHolder<V> getHolder() {
            return this.holder;
        }

        public final List<ChatListItem> getItems() {
            return this.items;
        }

        public final List<Object> getPayloads() {
            return this.payloads;
        }

        public int hashCode() {
            return (((this.holder.hashCode() * 31) + this.items.hashCode()) * 31) + this.payloads.hashCode();
        }

        public String toString() {
            ChatListItemViewHolder<V> chatListItemViewHolder = this.holder;
            List<ChatListItem> list = this.items;
            List<Object> list2 = this.payloads;
            return "Metadata(holder=" + chatListItemViewHolder + ", items=" + list + ", payloads=" + list2 + ")";
        }
    }

    public /* synthetic */ BaseChatListItemDelegate(Function0 function0, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i & 2) != 0 ? C29541.INSTANCE : function1);
    }

    public abstract void bindView(V v, T t, Metadata<V> metadata);

    public abstract V createView(ViewGroup viewGroup);

    /* JADX INFO: Access modifiers changed from: protected */
    public final ChatEventHandler getEventHandler() {
        return this.eventHandlerProvider.invoke();
    }

    public abstract boolean isForItem(ChatListItem chatListItem, int i);

    @Override // com.hannesdorfmann.adapterdelegates4.AdapterDelegate
    public /* bridge */ /* synthetic */ void onBindViewHolder(List<? extends ChatListItem> list, int i, RecyclerView.ViewHolder viewHolder, List list2) {
        onBindViewHolder2(list, i, viewHolder, (List<? extends Object>) list2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.hannesdorfmann.adapterdelegates4.AdapterDelegate
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
        C9612q.m13917h(parent, "parent");
        V createView = createView(parent);
        this.initBlock.invoke(createView);
        return new ChatListItemViewHolder(createView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.hannesdorfmann.adapterdelegates4.AdapterDelegate
    public final boolean isForViewType(List<? extends ChatListItem> items, int i) {
        C9612q.m13917h(items, "items");
        return isForItem(items.get(i), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    protected final void onBindViewHolder2(List<? extends ChatListItem> items, int i, RecyclerView.ViewHolder holder, List<? extends Object> payloads) {
        C9612q.m13917h(items, "items");
        C9612q.m13917h(holder, "holder");
        C9612q.m13917h(payloads, "payloads");
        ChatListItemViewHolder chatListItemViewHolder = (ChatListItemViewHolder) holder;
        ChatListItem chatListItem = items.get(i);
        C9612q.m13919f(chatListItem, "null cannot be cast to non-null type T of com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate");
        Metadata metadata = new Metadata(chatListItemViewHolder, items, payloads);
        bindView(chatListItemViewHolder.getView(), chatListItem, metadata);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseChatListItemDelegate(Function0<? extends ChatEventHandler> eventHandlerProvider, Function1<? super V, Unit> initBlock) {
        C9612q.m13917h(eventHandlerProvider, "eventHandlerProvider");
        C9612q.m13917h(initBlock, "initBlock");
        this.eventHandlerProvider = eventHandlerProvider;
        this.initBlock = initBlock;
    }
}
