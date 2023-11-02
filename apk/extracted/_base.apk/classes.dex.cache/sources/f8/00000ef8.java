package com.discord.chat;

import com.discord.chat.listmanager.ChatListManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.chat.ChatModule$withChatManager$1", m13986f = "ChatModule.kt", m13985l = {113}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatModule$withChatManager$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<ChatListManager, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ ChatListManager $manager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatModule$withChatManager$1(Function2<? super ChatListManager, ? super Continuation<? super Unit>, ? extends Object> function2, ChatListManager chatListManager, Continuation<? super ChatModule$withChatManager$1> continuation) {
        super(2, continuation);
        this.$block = function2;
        this.$manager = chatListManager;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatModule$withChatManager$1(this.$block, this.$manager, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatModule$withChatManager$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        m2869d = C13277d.m2869d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C11586t.m7586b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C11586t.m7586b(obj);
            Function2<ChatListManager, Continuation<? super Unit>, Object> function2 = this.$block;
            ChatListManager chatListManager = this.$manager;
            this.label = 1;
            if (function2.invoke(chatListManager, this) == m2869d) {
                return m2869d;
            }
        }
        return Unit.f25302a;
    }
}