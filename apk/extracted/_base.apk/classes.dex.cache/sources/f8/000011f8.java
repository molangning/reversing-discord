package com.discord.chat.presentation.list;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatListView$chatListAdapter$4 extends AbstractC9614s implements Function0<ChatEventHandler> {
    final /* synthetic */ ChatListView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListView$chatListAdapter$4(ChatListView chatListView) {
        super(0);
        this.this$0 = chatListView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ChatEventHandler invoke() {
        ChatEventHandler chatEventHandler;
        chatEventHandler = this.this$0.eventHandler;
        if (chatEventHandler == null) {
            C9612q.m13900y("eventHandler");
            return null;
        }
        return chatEventHandler;
    }
}