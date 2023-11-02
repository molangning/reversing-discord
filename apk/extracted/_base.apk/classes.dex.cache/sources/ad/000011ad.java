package com.discord.chat.listmanager;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import p388vf.C13277d;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.chat.listmanager.ChatListManager$publishUpdate$1", m13986f = "ChatListManager.kt", m13985l = {239}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatListManager$publishUpdate$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatListUpdate $update;
    int label;
    final /* synthetic */ ChatListManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListManager$publishUpdate$1(ChatListManager chatListManager, ChatListUpdate chatListUpdate, Continuation<? super ChatListManager$publishUpdate$1> continuation) {
        super(2, continuation);
        this.this$0 = chatListManager;
        this.$update = chatListUpdate;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatListManager$publishUpdate$1(this.this$0, this.$update, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatListManager$publishUpdate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        MutableSharedFlow mutableSharedFlow;
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
            mutableSharedFlow = this.this$0.updatesFlow;
            ChatListUpdate chatListUpdate = this.$update;
            this.label = 1;
            if (mutableSharedFlow.emit(chatListUpdate, this) == m2869d) {
                return m2869d;
            }
        }
        return Unit.f25302a;
    }
}