package com.discord.chat.presentation.list;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "scrollState", "Lcom/discord/chat/presentation/list/ScrollState;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatListView$scrollStateObserver$1 extends AbstractC9614s implements Function1<ScrollState, Unit> {
    final /* synthetic */ ChatListView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListView$scrollStateObserver$1(ChatListView chatListView) {
        super(1);
        this.this$0 = chatListView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ScrollState scrollState) {
        invoke2(scrollState);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(ScrollState scrollState) {
        ChatEventHandler chatEventHandler;
        ChatEventHandler chatEventHandler2;
        C9612q.m13917h(scrollState, "scrollState");
        chatEventHandler = this.this$0.eventHandler;
        if (chatEventHandler != null) {
            chatEventHandler2 = this.this$0.eventHandler;
            if (chatEventHandler2 == null) {
                C9612q.m13900y("eventHandler");
                chatEventHandler2 = null;
            }
            chatEventHandler2.onScrollStateChanged(scrollState);
        }
    }
}