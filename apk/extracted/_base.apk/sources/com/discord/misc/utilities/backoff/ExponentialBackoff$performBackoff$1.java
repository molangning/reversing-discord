package com.discord.misc.utilities.backoff;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC9571e(m13987c = "com.discord.misc.utilities.backoff.ExponentialBackoff", m13986f = "ExponentialBackoff.kt", m13985l = {63, 65, 76, 77}, m13984m = "performBackoff")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class ExponentialBackoff$performBackoff$1<T> extends AbstractC9570d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ExponentialBackoff this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExponentialBackoff$performBackoff$1(ExponentialBackoff exponentialBackoff, Continuation<? super ExponentialBackoff$performBackoff$1> continuation) {
        super(continuation);
        this.this$0 = exponentialBackoff;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.performBackoff(null, null, this);
    }
}
