package com.discord.chat.presentation.message.view.voicemessages;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9810j;
import kotlinx.coroutines.C9904v0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import pf.C11586t;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$reset$2", m13986f = "AudioPlayerView.kt", m13985l = {495}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AudioPlayerView$reset$2 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AudioPlayerView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$reset$2$1", m13986f = "AudioPlayerView.kt", m13985l = {496}, m13984m = "invokeSuspend")
    /* renamed from: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$reset$2$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C30551 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C30551(Continuation<? super C30551> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30551(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30551) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
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
                if (C9904v0.m12985a(500L, this) == m2869d) {
                    return m2869d;
                }
            }
            return Unit.f25302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView$reset$2(AudioPlayerView audioPlayerView, Continuation<? super AudioPlayerView$reset$2> continuation) {
        super(2, continuation);
        this.this$0 = audioPlayerView;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioPlayerView$reset$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioPlayerView$reset$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        AudioPlayerViewState audioPlayerViewState;
        AudioPlayerViewState audioPlayerViewState2;
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
            C30551 c30551 = new C30551(null);
            this.label = 1;
            if (C9810j.m13190g(m13570a, c30551, this) == m2869d) {
                return m2869d;
            }
        }
        this.this$0.wasPlayingBeforeBeingPaused = false;
        AudioPlayerView audioPlayerView = this.this$0;
        audioPlayerViewState = audioPlayerView.state;
        audioPlayerView.configurePlayButton(audioPlayerViewState);
        AudioPlayerView audioPlayerView2 = this.this$0;
        audioPlayerViewState2 = audioPlayerView2.state;
        audioPlayerView2.configureAudioWave(audioPlayerViewState2);
        this.this$0.getBinding().wave.reset();
        return Unit.f25302a;
    }
}
