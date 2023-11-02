package com.discord.misc.utilities.backoff;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C9904v0;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.misc.utilities.backoff.ExponentialBackoff$fail$1", m13986f = "ExponentialBackoff.kt", m13985l = {38, 39}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class ExponentialBackoff$fail$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $action;
    int label;
    final /* synthetic */ ExponentialBackoff this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExponentialBackoff$fail$1(ExponentialBackoff exponentialBackoff, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super ExponentialBackoff$fail$1> continuation) {
        super(2, continuation);
        this.this$0 = exponentialBackoff;
        this.$action = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExponentialBackoff$fail$1(this.this$0, this.$action, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ExponentialBackoff$fail$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        long j;
        m2869d = C13277d.m2869d();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C11586t.m7586b(obj);
                    return Unit.f25302a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C11586t.m7586b(obj);
        } else {
            C11586t.m7586b(obj);
            j = this.this$0.currentDelay;
            this.label = 1;
            if (C9904v0.m12985a(j, this) == m2869d) {
                return m2869d;
            }
        }
        Function1<Continuation<? super Unit>, Object> function1 = this.$action;
        this.label = 2;
        if (function1.invoke(this) == m2869d) {
            return m2869d;
        }
        return Unit.f25302a;
    }
}