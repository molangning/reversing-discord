package p430xi;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m14357d2 = {"Lxi/r;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lpf/s;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "j", "Lkotlin/coroutines/Continuation;", "uCont", "Lkotlin/coroutines/CoroutineContext;", "k", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: xi.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C13830r<T> implements Continuation<T>, CoroutineStackFrame {

    /* renamed from: j */
    private final Continuation<T> f35615j;

    /* renamed from: k */
    private final CoroutineContext f35616k;

    /* JADX WARN: Multi-variable type inference failed */
    public C13830r(Continuation<? super T> continuation, CoroutineContext coroutineContext) {
        this.f35615j = continuation;
        this.f35616k = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f35615j;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f35616k;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        this.f35615j.resumeWith(obj);
    }
}