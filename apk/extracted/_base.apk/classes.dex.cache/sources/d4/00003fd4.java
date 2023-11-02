package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import p371uf.C12967f;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, m14357d2 = {"Lkotlin/coroutines/jvm/internal/i;", "Lkotlin/coroutines/jvm/internal/a;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "", "completion", "<init>", "(Lkotlin/coroutines/Continuation;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlin.coroutines.jvm.internal.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC9576i extends AbstractC9567a {
    public AbstractC9576i(Continuation<Object> continuation) {
        super(continuation);
        boolean z;
        if (continuation != null) {
            if (continuation.getContext() == C12967f.f33721j) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return C12967f.f33721j;
    }
}