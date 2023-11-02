package com.discord.media.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC9571e(m13987c = "com.discord.media.utils.MediaResolver", m13986f = "MediaResolver.kt", m13985l = {139, 145}, m13984m = "handleImage")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaResolver$handleImage$1 extends AbstractC9570d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MediaResolver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaResolver$handleImage$1(MediaResolver mediaResolver, Continuation<? super MediaResolver$handleImage$1> continuation) {
        super(continuation);
        this.this$0 = mediaResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object handleImage;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleImage = this.this$0.handleImage(null, 0, false, this);
        return handleImage;
    }
}
