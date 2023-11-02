package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import p430xi.AbstractC13807c;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J)\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m14357d2 = {"Lkotlinx/coroutines/flow/n;", "Lxi/c;", "Lkotlinx/coroutines/flow/l;", "flow", "", "c", "", "Lkotlin/coroutines/Continuation;", "", "d", "(Lkotlinx/coroutines/flow/l;)[Lkotlin/coroutines/Continuation;", "", "a", "J", "index", "b", "Lkotlin/coroutines/Continuation;", "cont", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9732n extends AbstractC13807c<C9727l<?>> {

    /* renamed from: a */
    public long f25518a = -1;

    /* renamed from: b */
    public Continuation<? super Unit> f25519b;

    @Override // p430xi.AbstractC13807c
    /* renamed from: c */
    public boolean mo1476a(C9727l<?> c9727l) {
        if (this.f25518a >= 0) {
            return false;
        }
        this.f25518a = c9727l.m13425T();
        return true;
    }

    @Override // p430xi.AbstractC13807c
    /* renamed from: d */
    public Continuation<Unit>[] mo1475b(C9727l<?> c9727l) {
        long j = this.f25518a;
        this.f25518a = -1L;
        this.f25519b = null;
        return c9727l.m13426S(j);
    }
}
