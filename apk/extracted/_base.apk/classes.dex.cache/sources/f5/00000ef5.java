package com.discord.chat;

import com.discord.chat.listmanager.ChatListManager;
import com.discord.chatreplay.logger.RowLogger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import p388vf.C13277d;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m14357d2 = {"Lcom/discord/chat/listmanager/ChatListManager;", "manager", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.chat.ChatModule$clearRows$1", m13986f = "ChatModule.kt", m13985l = {}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class ChatModule$clearRows$1 extends AbstractC9578k implements Function2<ChatListManager, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $tag;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatModule$clearRows$1(ChatModule chatModule, int i, Continuation<? super ChatModule$clearRows$1> continuation) {
        super(2, continuation);
        this.this$0 = chatModule;
        this.$tag = i;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatModule$clearRows$1 chatModule$clearRows$1 = new ChatModule$clearRows$1(this.this$0, this.$tag, continuation);
        chatModule$clearRows$1.L$0 = obj;
        return chatModule$clearRows$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ChatListManager chatListManager, Continuation<? super Unit> continuation) {
        return ((ChatModule$clearRows$1) create(chatListManager, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        RowLogger rowUpdateLoggerFor;
        C13277d.m2869d();
        if (this.label == 0) {
            C11586t.m7586b(obj);
            rowUpdateLoggerFor = this.this$0.rowUpdateLoggerFor(this.$tag);
            rowUpdateLoggerFor.logRowsClear();
            ((ChatListManager) this.L$0).clearRows();
            return Unit.f25302a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}