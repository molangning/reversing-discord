package com.discord.chat.presentation.message.view.voicemessages;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9810j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import pf.C11586t;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$recalculateSampleData$1", m13986f = "AudioWaveView.kt", m13985l = {153}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AudioWaveView$recalculateSampleData$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $numChunks;
    final /* synthetic */ byte[] $originalSampleData;
    Object L$0;
    int label;
    final /* synthetic */ AudioWaveView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$recalculateSampleData$1$1", m13986f = "AudioWaveView.kt", m13985l = {}, m13984m = "invokeSuspend")
    /* renamed from: com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$recalculateSampleData$1$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C30581 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        final /* synthetic */ int $numChunks;
        final /* synthetic */ byte[] $originalSampleData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30581(byte[] bArr, int i, Continuation<? super C30581> continuation) {
            super(2, continuation);
            this.$originalSampleData = bArr;
            this.$numChunks = i;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30581(this.$originalSampleData, this.$numChunks, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((C30581) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            C13277d.m2869d();
            if (this.label == 0) {
                C11586t.m7586b(obj);
                return Sampler.INSTANCE.downSample(this.$originalSampleData, this.$numChunks);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioWaveView$recalculateSampleData$1(AudioWaveView audioWaveView, byte[] bArr, int i, Continuation<? super AudioWaveView$recalculateSampleData$1> continuation) {
        super(2, continuation);
        this.this$0 = audioWaveView;
        this.$originalSampleData = bArr;
        this.$numChunks = i;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioWaveView$recalculateSampleData$1(this.this$0, this.$originalSampleData, this.$numChunks, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioWaveView$recalculateSampleData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        AudioWaveView audioWaveView;
        m2869d = C13277d.m2869d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                audioWaveView = (AudioWaveView) this.L$0;
                C11586t.m7586b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C11586t.m7586b(obj);
            AudioWaveView audioWaveView2 = this.this$0;
            CoroutineDispatcher m13570a = C9677b1.m13570a();
            C30581 c30581 = new C30581(this.$originalSampleData, this.$numChunks, null);
            this.L$0 = audioWaveView2;
            this.label = 1;
            Object m13190g = C9810j.m13190g(m13570a, c30581, this);
            if (m13190g == m2869d) {
                return m2869d;
            }
            audioWaveView = audioWaveView2;
            obj = m13190g;
        }
        audioWaveView.setDownSampleData((byte[]) obj);
        this.this$0.invalidate();
        return Unit.f25302a;
    }
}
