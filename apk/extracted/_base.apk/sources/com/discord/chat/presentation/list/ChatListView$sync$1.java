package com.discord.chat.presentation.list;

import com.discord.chat.listmanager.ChatListUpdate;
import com.discord.chat.presentation.list.ChatListView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p388vf.C13277d;
import pf.C11586t;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.chat.presentation.list.ChatListView$sync$1", m13986f = "ChatListView.kt", m13985l = {228}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatListView$sync$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatListView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListView$sync$1(ChatListView chatListView, Continuation<? super ChatListView$sync$1> continuation) {
        super(2, continuation);
        this.this$0 = chatListView;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatListView$sync$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatListView$sync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        ChatListView.DataSource dataSource;
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
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.f25327j = true;
            dataSource = this.this$0.dataSource;
            if (dataSource == null) {
                C9612q.m13900y("dataSource");
                dataSource = null;
            }
            Flow<ChatListUpdate> updatesFlow = dataSource.getUpdatesFlow();
            final ChatListView chatListView = this.this$0;
            FlowCollector<? super ChatListUpdate> flowCollector = new FlowCollector() { // from class: com.discord.chat.presentation.list.ChatListView$sync$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((ChatListUpdate) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(ChatListUpdate chatListUpdate, Continuation<? super Unit> continuation) {
                    if (Ref$BooleanRef.this.f25327j) {
                        chatListView.onChatListUpdate(ChatListUpdate.copy$default(chatListUpdate, null, null, null, 3, null));
                        Ref$BooleanRef.this.f25327j = false;
                    } else {
                        chatListView.onChatListUpdate(chatListUpdate);
                    }
                    return Unit.f25302a;
                }
            };
            this.label = 1;
            if (updatesFlow.collect(flowCollector, this) == m2869d) {
                return m2869d;
            }
        }
        return Unit.f25302a;
    }
}
