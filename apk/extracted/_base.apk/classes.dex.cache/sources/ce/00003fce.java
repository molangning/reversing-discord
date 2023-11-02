package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9612q;
import p371uf.InterfaceC12963d;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0011J\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0014\u0010\r\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m14357d2 = {"Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/coroutines/jvm/internal/a;", "Lkotlin/coroutines/Continuation;", "", "intercepted", "", "releaseIntercepted", "Lkotlin/coroutines/CoroutineContext;", "_context", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "completion", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;)V", "(Lkotlin/coroutines/Continuation;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlin.coroutines.jvm.internal.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC9570d extends AbstractC9567a {
    private final CoroutineContext _context;
    private transient Continuation<Object> intercepted;

    public AbstractC9570d(Continuation<Object> continuation, CoroutineContext coroutineContext) {
        super(continuation);
        this._context = coroutineContext;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        C9612q.m13920e(coroutineContext);
        return coroutineContext;
    }

    public final Continuation<Object> intercepted() {
        Continuation<Object> continuation = this.intercepted;
        if (continuation == null) {
            InterfaceC12963d interfaceC12963d = (InterfaceC12963d) getContext().mo1458j(InterfaceC12963d.f33719g);
            if (interfaceC12963d == null || (continuation = interfaceC12963d.mo3574q(this)) == null) {
                continuation = this;
            }
            this.intercepted = continuation;
        }
        return continuation;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public void releaseIntercepted() {
        Continuation<?> continuation = this.intercepted;
        if (continuation != null && continuation != this) {
            CoroutineContext.InterfaceC9564b mo1458j = getContext().mo1458j(InterfaceC12963d.f33719g);
            C9612q.m13920e(mo1458j);
            ((InterfaceC12963d) mo1458j).mo3575m(continuation);
        }
        this.intercepted = C9569c.f25319j;
    }

    public AbstractC9570d(Continuation<Object> continuation) {
        this(continuation, continuation != null ? continuation.getContext() : null);
    }
}