package com.discord.media.engine;

import com.discord.media.engine.MediaEngine;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC9571e(m13987c = "com.discord.media.engine.MediaEngine$Companion", m13986f = "MediaEngine.kt", m13985l = {734, 737}, m13984m = "encodeThumbnail")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaEngine$Companion$encodeThumbnail$1 extends AbstractC9570d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MediaEngine.Companion this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEngine$Companion$encodeThumbnail$1(MediaEngine.Companion companion, Continuation<? super MediaEngine$Companion$encodeThumbnail$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object encodeThumbnail;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        encodeThumbnail = this.this$0.encodeThumbnail(null, this);
        return encodeThumbnail;
    }
}
