package com.discord.chat.presentation.list;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.discord.chat.listmanager.ChatListAction;
import com.discord.chat.listmanager.ChatListUpdate;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.ChatScrollStateObserver;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.SeparatorChatListItem;
import com.discord.chat.presentation.list.item.SummarySeparatorChatListItem;
import com.discord.chat.presentation.root.ChatView;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.recycler_view.scroller.Scroller;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.Ref$BooleanRef;

@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatListView$onChatListUpdate$1$2 extends AbstractC9614s implements Function0<Unit> {
    final /* synthetic */ ChatListUpdate $update;
    final /* synthetic */ Ref$BooleanRef $wasAtBottom;
    final /* synthetic */ ChatListView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListView$onChatListUpdate$1$2(ChatListUpdate chatListUpdate, ChatListView chatListView, Ref$BooleanRef ref$BooleanRef) {
        super(0);
        this.$update = chatListUpdate;
        this.this$0 = chatListView;
        this.$wasAtBottom = ref$BooleanRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2() {
        ChatScrollStateObserver chatScrollStateObserver;
        Object m14053W;
        Scroller.TargetAlignment targetAlignment;
        ChatScrollStateObserver chatScrollStateObserver2;
        LinearLayoutManager linearLayoutManager;
        LinearLayoutManager linearLayoutManager2;
        boolean z;
        LinearLayoutManager linearLayoutManager3;
        ChatEventHandler chatEventHandler;
        ChatEventHandler chatEventHandler2;
        if (!(this.$update.getAction() instanceof ChatListAction.Clear)) {
            chatScrollStateObserver2 = this.this$0.scrollStateObserver;
            chatScrollStateObserver2.startWatching(this.this$0, ChatScrollStateObserver.EmitMode.NO);
            linearLayoutManager = this.this$0.linearLayoutManager;
            int m35820i2 = linearLayoutManager.m35820i2();
            linearLayoutManager2 = this.this$0.linearLayoutManager;
            int m35817l2 = linearLayoutManager2.m35817l2();
            z = this.this$0.isFirstLayout;
            if (z && m35820i2 >= 0 && m35817l2 >= 0) {
                this.this$0.isFirstLayout = false;
                linearLayoutManager3 = this.this$0.linearLayoutManager;
                ChatEventHandler chatEventHandler3 = null;
                if (linearLayoutManager3.m35805x2()) {
                    chatEventHandler2 = this.this$0.eventHandler;
                    if (chatEventHandler2 == null) {
                        C9612q.m13900y("eventHandler");
                    } else {
                        chatEventHandler3 = chatEventHandler2;
                    }
                    chatEventHandler3.onFirstLayout(m35817l2, m35820i2);
                } else {
                    chatEventHandler = this.this$0.eventHandler;
                    if (chatEventHandler == null) {
                        C9612q.m13900y("eventHandler");
                    } else {
                        chatEventHandler3 = chatEventHandler;
                    }
                    chatEventHandler3.onFirstLayout(m35820i2, m35817l2);
                }
            }
        }
        ChatListAction action = this.$update.getAction();
        if (action instanceof ChatListAction.ScrollTo) {
            m14053W = C9553r.m14053W(this.$update.getItems(), ((ChatListAction.ScrollTo) this.$update.getAction()).getPosition());
            ChatListItem chatListItem = (ChatListItem) m14053W;
            if (chatListItem instanceof SeparatorChatListItem) {
                targetAlignment = new Scroller.TargetAlignment.Top(SizeUtilsKt.getDpToPx(4));
            } else if (chatListItem instanceof SummarySeparatorChatListItem) {
                if (((SummarySeparatorChatListItem) chatListItem).isBeforeContent()) {
                    targetAlignment = new Scroller.TargetAlignment.Top(SizeUtilsKt.getDpToPx(4));
                } else {
                    targetAlignment = Scroller.TargetAlignment.Center.INSTANCE;
                }
            } else {
                targetAlignment = Scroller.TargetAlignment.Center.INSTANCE;
            }
            this.this$0.scrollToPosition(((ChatListAction.ScrollTo) this.$update.getAction()).getPosition(), targetAlignment, ((ChatListAction.ScrollTo) this.$update.getAction()).getAnimated(), ((ChatListAction.ScrollTo) this.$update.getAction()).isHighlight());
        } else if (action instanceof ChatListAction.StickToBottomIfAtBottom) {
            if (this.$wasAtBottom.f25327j) {
                if (ChatView.Companion.getAreChatAnimationsEnabled()) {
                    chatScrollStateObserver = this.this$0.scrollStateObserver;
                    chatScrollStateObserver.startWatching(this.this$0, ChatScrollStateObserver.EmitMode.YES);
                    this.this$0.scrollToPosition(0);
                    return;
                }
                this.this$0.scrollToPosition(0, Scroller.TargetAlignment.Anywhere.INSTANCE, false, false);
            }
        } else if (action instanceof ChatListAction.Clear) {
        } else {
            boolean z2 = action instanceof ChatListAction.Noop;
        }
    }
}