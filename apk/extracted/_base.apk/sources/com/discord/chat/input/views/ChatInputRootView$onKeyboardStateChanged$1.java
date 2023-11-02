package com.discord.chat.input.views;

import android.content.Context;
import com.discord.chat.input.views.ChatInputRootView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9810j;
import kotlinx.coroutines.C9904v0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.chat.input.views.ChatInputRootView$onKeyboardStateChanged$1", m13986f = "ChatInputRootView.kt", m13985l = {293}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class ChatInputRootView$onKeyboardStateChanged$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatInputRootView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.discord.chat.input.views.ChatInputRootView$onKeyboardStateChanged$1$1", m13986f = "ChatInputRootView.kt", m13985l = {294}, m13984m = "invokeSuspend")
    /* renamed from: com.discord.chat.input.views.ChatInputRootView$onKeyboardStateChanged$1$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C29261 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C29261(Continuation<? super C29261> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29261(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29261) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
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
                this.label = 1;
                if (C9904v0.m12985a(100L, this) == m2869d) {
                    return m2869d;
                }
            }
            return Unit.f25302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputRootView$onKeyboardStateChanged$1(ChatInputRootView chatInputRootView, Continuation<? super ChatInputRootView$onKeyboardStateChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = chatInputRootView;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatInputRootView$onKeyboardStateChanged$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatInputRootView$onKeyboardStateChanged$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
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
            CoroutineDispatcher m13570a = C9677b1.m13570a();
            C29261 c29261 = new C29261(null);
            this.label = 1;
            if (C9810j.m13190g(m13570a, c29261, this) == m2869d) {
                return m2869d;
            }
        }
        Context context = this.this$0.getContext();
        C9612q.m13918g(context, "context");
        if (!ChatInputRootViewKt.isScreenReaderOn(context)) {
            this.this$0.editText.clearFocus();
        }
        ChatInputRootView.ChatInputListener listener = this.this$0.getListener();
        if (listener != null) {
            listener.onEndBlur(String.valueOf(this.this$0.editText.getText()));
        }
        return Unit.f25302a;
    }
}
