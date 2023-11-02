package com.discord.media.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC9571e(m13987c = "com.discord.media.utils.MediaResolver", m13986f = "MediaResolver.kt", m13985l = {104, 113, 121, 124}, m13984m = "handleVideo")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaResolver$handleVideo$1 extends AbstractC9570d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MediaResolver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaResolver$handleVideo$1(MediaResolver mediaResolver, Continuation<? super MediaResolver$handleVideo$1> continuation) {
        super(continuation);
        this.this$0 = mediaResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object handleVideo;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleVideo = this.this$0.handleVideo(null, null, this);
        return handleVideo;
    }
}