package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9818l;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p388vf.C13277d;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "mediaViewAttached", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AudioPlayerView$attachStateChangeListener$1 extends AbstractC9614s implements Function1<Boolean, Unit> {
    final /* synthetic */ AudioPlayerView this$0;

    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$attachStateChangeListener$1$1", m13986f = "AudioPlayerView.kt", m13985l = {93}, m13984m = "invokeSuspend")
    /* renamed from: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$attachStateChangeListener$1$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C30521 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AudioPlayerView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30521(AudioPlayerView audioPlayerView, Continuation<? super C30521> continuation) {
            super(2, continuation);
            this.this$0 = audioPlayerView;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30521(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30521) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
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
                Flow<AudioPlayerManager.AudioSource> currentPlayerSourceFlow = AudioPlayerManager.INSTANCE.getCurrentPlayerSourceFlow();
                final AudioPlayerView audioPlayerView = this.this$0;
                FlowCollector<? super AudioPlayerManager.AudioSource> flowCollector = new FlowCollector() { // from class: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView.attachStateChangeListener.1.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((AudioPlayerManager.AudioSource) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(AudioPlayerManager.AudioSource audioSource, Continuation<? super Unit> continuation) {
                        AudioPlayerViewState audioPlayerViewState;
                        AudioPlayerViewState audioPlayerViewState2;
                        AudioPlayerViewState audioPlayerViewState3;
                        audioPlayerViewState = audioPlayerView.state;
                        if (!C9612q.m13922c(audioSource, audioPlayerViewState.getAudioSource())) {
                            AudioPlayerView audioPlayerView2 = audioPlayerView;
                            audioPlayerViewState2 = audioPlayerView2.state;
                            audioPlayerView2.configurePlayButton(audioPlayerViewState2);
                            AudioPlayerView audioPlayerView3 = audioPlayerView;
                            audioPlayerViewState3 = audioPlayerView3.state;
                            audioPlayerView3.toggleDurationEmitter(audioPlayerViewState3.shouldEmitDuration$chat_release());
                        }
                        return Unit.f25302a;
                    }
                };
                this.label = 1;
                if (currentPlayerSourceFlow.collect(flowCollector, this) == m2869d) {
                    return m2869d;
                }
            }
            return Unit.f25302a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView$attachStateChangeListener$1(AudioPlayerView audioPlayerView) {
        super(1);
        this.this$0 = audioPlayerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f25302a;
    }

    public final void invoke(boolean z) {
        Job job;
        AudioPlayerViewState audioPlayerViewState;
        Job m13179d;
        job = this.this$0.playerJob;
        if (job != null) {
            Job.C9668a.m13594a(job, null, 1, null);
        }
        if (z) {
            AudioPlayerView audioPlayerView = this.this$0;
            m13179d = C9818l.m13179d(CoroutineViewUtilsKt.getAttachedScope(audioPlayerView), null, null, new C30521(this.this$0, null), 3, null);
            audioPlayerView.playerJob = m13179d;
        }
        AudioPlayerView audioPlayerView2 = this.this$0;
        audioPlayerViewState = audioPlayerView2.state;
        AudioPlayerView.setState$default(audioPlayerView2, AudioPlayerViewState.m41785copyP6IPuNM$default(audioPlayerViewState, null, null, z, 3, null), false, 2, null);
    }
}