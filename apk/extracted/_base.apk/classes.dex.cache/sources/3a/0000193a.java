package com.discord.media.engine;

import android.graphics.Bitmap;
import com.discord.media.engine.MediaEngine;
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
import p388vf.C13277d;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaEngine$setBroadcastThumbnailParams$1$1 extends AbstractC9614s implements Function1<Bitmap, Unit> {
    final /* synthetic */ Function1<String, Unit> $callback;
    final /* synthetic */ MediaEngine this$0;

    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.discord.media.engine.MediaEngine$setBroadcastThumbnailParams$1$1$1", m13986f = "MediaEngine.kt", m13985l = {468}, m13984m = "invokeSuspend")
    /* renamed from: com.discord.media.engine.MediaEngine$setBroadcastThumbnailParams$1$1$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C32441 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ Function1<String, Unit> $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C32441(Bitmap bitmap, Function1<? super String, Unit> function1, Continuation<? super C32441> continuation) {
            super(2, continuation);
            this.$bitmap = bitmap;
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32441(this.$bitmap, this.$callback, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32441) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
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
                MediaEngine.Companion companion = MediaEngine.Companion;
                Bitmap bitmap = this.$bitmap;
                this.label = 1;
                obj = companion.encodeThumbnail(bitmap, this);
                if (obj == m2869d) {
                    return m2869d;
                }
            }
            this.$callback.invoke((String) obj);
            return Unit.f25302a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaEngine$setBroadcastThumbnailParams$1$1(MediaEngine mediaEngine, Function1<? super String, Unit> function1) {
        super(1);
        this.this$0 = mediaEngine;
        this.$callback = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(Bitmap bitmap) {
        CoroutineScope coroutineScope;
        C9612q.m13917h(bitmap, "bitmap");
        coroutineScope = this.this$0.coroutineScope;
        C9818l.m13179d(coroutineScope, null, null, new C32441(bitmap, this.$callback, null), 3, null);
    }
}