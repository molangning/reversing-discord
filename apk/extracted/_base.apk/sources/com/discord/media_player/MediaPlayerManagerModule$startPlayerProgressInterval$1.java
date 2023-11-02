package com.discord.media_player;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import pf.C11586t;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1", m13986f = "MediaPlayerManagerModule.kt", m13985l = {119, 128}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaPlayerManagerModule$startPlayerProgressInterval$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MediaPlayer $mediaPlayer;
    final /* synthetic */ double $portal;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MediaPlayerManagerModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1$1", m13986f = "MediaPlayerManagerModule.kt", m13985l = {}, m13984m = "invokeSuspend")
    /* renamed from: com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C32921 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MediaPlayer $mediaPlayer;
        final /* synthetic */ double $portal;
        int label;
        final /* synthetic */ MediaPlayerManagerModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32921(MediaPlayer mediaPlayer, MediaPlayerManagerModule mediaPlayerManagerModule, double d, Continuation<? super C32921> continuation) {
            super(2, continuation);
            this.$mediaPlayer = mediaPlayer;
            this.this$0 = mediaPlayerManagerModule;
            this.$portal = d;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32921(this.$mediaPlayer, this.this$0, this.$portal, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32921) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            C13277d.m2869d();
            if (this.label == 0) {
                C11586t.m7586b(obj);
                if (this.$mediaPlayer.isPlaying()) {
                    this.this$0.onMediaPlayerProgress(this.$portal, this.$mediaPlayer.currentPositionMs(), this.$mediaPlayer.durationMs());
                }
                return Unit.f25302a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerManagerModule$startPlayerProgressInterval$1(MediaPlayer mediaPlayer, MediaPlayerManagerModule mediaPlayerManagerModule, double d, Continuation<? super MediaPlayerManagerModule$startPlayerProgressInterval$1> continuation) {
        super(2, continuation);
        this.$mediaPlayer = mediaPlayer;
        this.this$0 = mediaPlayerManagerModule;
        this.$portal = d;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MediaPlayerManagerModule$startPlayerProgressInterval$1 mediaPlayerManagerModule$startPlayerProgressInterval$1 = new MediaPlayerManagerModule$startPlayerProgressInterval$1(this.$mediaPlayer, this.this$0, this.$portal, continuation);
        mediaPlayerManagerModule$startPlayerProgressInterval$1.L$0 = obj;
        return mediaPlayerManagerModule$startPlayerProgressInterval$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MediaPlayerManagerModule$startPlayerProgressInterval$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005d -> B:12:0x0031). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = p388vf.C13271b.m2873d()
            int r1 = r12.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L29
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r12.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            pf.C11586t.m7586b(r13)
            r13 = r1
            goto L30
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            java.lang.Object r1 = r12.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            pf.C11586t.m7586b(r13)
            r13 = r1
            r1 = r12
            goto L53
        L29:
            pf.C11586t.m7586b(r13)
            java.lang.Object r13 = r12.L$0
            kotlinx.coroutines.CoroutineScope r13 = (kotlinx.coroutines.CoroutineScope) r13
        L30:
            r1 = r12
        L31:
            boolean r4 = kotlinx.coroutines.C9824m0.m13167h(r13)
            if (r4 == 0) goto L60
            kotlinx.coroutines.i2 r4 = kotlinx.coroutines.C9677b1.m13568c()
            com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1$1 r11 = new com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1$1
            com.discord.media_player.MediaPlayer r6 = r1.$mediaPlayer
            com.discord.media_player.MediaPlayerManagerModule r7 = r1.this$0
            double r8 = r1.$portal
            r10 = 0
            r5 = r11
            r5.<init>(r6, r7, r8, r10)
            r1.L$0 = r13
            r1.label = r3
            java.lang.Object r4 = kotlinx.coroutines.C9810j.m13190g(r4, r11, r1)
            if (r4 != r0) goto L53
            return r0
        L53:
            r1.L$0 = r13
            r1.label = r2
            r4 = 100
            java.lang.Object r4 = kotlinx.coroutines.C9904v0.m12985a(r4, r1)
            if (r4 != r0) goto L31
            return r0
        L60:
            kotlin.Unit r13 = kotlin.Unit.f25302a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
