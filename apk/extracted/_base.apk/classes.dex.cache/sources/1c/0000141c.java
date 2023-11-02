package com.discord.chat.presentation.message.view.voicemessages;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$finishAnimation$1", m13986f = "AudioWaveView.kt", m13985l = {135}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AudioWaveView$finishAnimation$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AudioWaveView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioWaveView$finishAnimation$1(AudioWaveView audioWaveView, Continuation<? super AudioWaveView$finishAnimation$1> continuation) {
        super(2, continuation);
        this.this$0 = audioWaveView;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AudioWaveView$finishAnimation$1 audioWaveView$finishAnimation$1 = new AudioWaveView$finishAnimation$1(this.this$0, continuation);
        audioWaveView$finishAnimation$1.L$0 = obj;
        return audioWaveView$finishAnimation$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioWaveView$finishAnimation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0052 -> B:32:0x0055). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = p388vf.C13271b.m2873d()
            int r1 = r10.label
            r2 = 1
            if (r1 == 0) goto L24
            if (r1 != r2) goto L1c
            int r1 = r10.I$1
            int r3 = r10.I$0
            java.lang.Object r4 = r10.L$1
            com.discord.chat.presentation.message.view.voicemessages.AudioWaveView r4 = (com.discord.chat.presentation.message.view.voicemessages.AudioWaveView) r4
            java.lang.Object r5 = r10.L$0
            kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
            pf.C11586t.m7586b(r11)
            r11 = r10
            goto L55
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            pf.C11586t.m7586b(r11)
            java.lang.Object r11 = r10.L$0
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            int r1 = com.discord.chat.presentation.message.view.voicemessages.AudioWaveView.access$getFINISH_ANIMATION_NUM_REPEAT$cp()
            com.discord.chat.presentation.message.view.voicemessages.AudioWaveView r3 = r10.this$0
            r4 = 0
            r5 = r11
            r11 = r10
            r9 = r3
            r3 = r1
            r1 = r4
            r4 = r9
        L38:
            if (r1 >= r3) goto L60
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.C9677b1.m13570a()
            com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$finishAnimation$1$1$1 r7 = new com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$finishAnimation$1$1$1
            r8 = 0
            r7.<init>(r8)
            r11.L$0 = r5
            r11.L$1 = r4
            r11.I$0 = r3
            r11.I$1 = r1
            r11.label = r2
            java.lang.Object r6 = kotlinx.coroutines.C9810j.m13190g(r6, r7, r11)
            if (r6 != r0) goto L55
            return r0
        L55:
            boolean r6 = kotlinx.coroutines.C9824m0.m13167h(r5)
            if (r6 == 0) goto L5e
            r4.invalidate()
        L5e:
            int r1 = r1 + r2
            goto L38
        L60:
            kotlin.Unit r11 = kotlin.Unit.f25302a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$finishAnimation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}