package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.InterfaceC9603l;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, m14357d2 = {"Lkotlin/coroutines/jvm/internal/k;", "Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/jvm/internal/l;", "", "", "toString", "", "arity", "I", "getArity", "()I", "Lkotlin/coroutines/Continuation;", "completion", "<init>", "(ILkotlin/coroutines/Continuation;)V", "(I)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlin.coroutines.jvm.internal.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC9578k extends AbstractC9570d implements InterfaceC9603l<Object> {
    private final int arity;

    public AbstractC9578k(int i, Continuation<Object> continuation) {
        super(continuation);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.InterfaceC9603l
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public String toString() {
        if (getCompletion() == null) {
            String m13963h = C9591f0.m13963h(this);
            C9612q.m13918g(m13963h, "renderLambdaToString(this)");
            return m13963h;
        }
        return super.toString();
    }

    public AbstractC9578k(int i) {
        this(i, null);
    }
}