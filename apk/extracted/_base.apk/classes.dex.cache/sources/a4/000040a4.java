package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import p388vf.C13272c;
import p450yi.C14031a;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B6\u0012\u0006\u0010\t\u001a\u00020\b\u0012\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\f0\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m14357d2 = {"Lkotlinx/coroutines/h2;", "Lkotlinx/coroutines/r2;", "", "E0", "Lkotlin/coroutines/Continuation;", "l", "Lkotlin/coroutines/Continuation;", "continuation", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "", "block", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.h2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9751h2 extends C9849r2 {

    /* renamed from: l */
    private final Continuation<Unit> f25551l;

    public C9751h2(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        super(coroutineContext, false);
        Continuation<Unit> m2871b;
        m2871b = C13272c.m2871b(function2, this, this);
        this.f25551l = m2871b;
    }

    @Override // kotlinx.coroutines.C9696e2
    /* renamed from: E0 */
    protected void mo13363E0() {
        C14031a.m864b(this.f25551l, this);
    }
}