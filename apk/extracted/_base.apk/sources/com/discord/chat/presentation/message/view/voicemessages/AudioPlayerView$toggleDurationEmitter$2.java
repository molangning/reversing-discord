package com.discord.chat.presentation.message.view.voicemessages;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9810j;
import kotlinx.coroutines.C9824m0;
import kotlinx.coroutines.C9904v0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import pf.C11586t;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$toggleDurationEmitter$2", m13986f = "AudioPlayerView.kt", m13985l = {365}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AudioPlayerView$toggleDurationEmitter$2 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AudioPlayerView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$toggleDurationEmitter$2$1", m13986f = "AudioPlayerView.kt", m13985l = {366}, m13984m = "invokeSuspend")
    /* renamed from: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$toggleDurationEmitter$2$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C30561 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C30561(Continuation<? super C30561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30561(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30561) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
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
                if (C9904v0.m12985a(50L, this) == m2869d) {
                    return m2869d;
                }
            }
            return Unit.f25302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView$toggleDurationEmitter$2(AudioPlayerView audioPlayerView, Continuation<? super AudioPlayerView$toggleDurationEmitter$2> continuation) {
        super(2, continuation);
        this.this$0 = audioPlayerView;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AudioPlayerView$toggleDurationEmitter$2 audioPlayerView$toggleDurationEmitter$2 = new AudioPlayerView$toggleDurationEmitter$2(this.this$0, continuation);
        audioPlayerView$toggleDurationEmitter$2.L$0 = obj;
        return audioPlayerView$toggleDurationEmitter$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioPlayerView$toggleDurationEmitter$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        CoroutineScope coroutineScope;
        AudioPlayerViewState audioPlayerViewState;
        m2869d = C13277d.m2869d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                coroutineScope = (CoroutineScope) this.L$0;
                C11586t.m7586b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C11586t.m7586b(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        }
        while (C9824m0.m13167h(coroutineScope)) {
            audioPlayerViewState = this.this$0.state;
            if (!audioPlayerViewState.shouldEmitDuration$chat_release()) {
                break;
            }
            this.this$0.configureProgress();
            AudioPlayerView.configureDuration$default(this.this$0, null, false, 3, null);
            CoroutineDispatcher m13570a = C9677b1.m13570a();
            C30561 c30561 = new C30561(null);
            this.L$0 = coroutineScope;
            this.label = 1;
            if (C9810j.m13190g(m13570a, c30561, this) == m2869d) {
                return m2869d;
            }
        }
        return Unit.f25302a;
    }
}
