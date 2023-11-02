package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H&R&\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m14357d2 = {"Lkotlinx/coroutines/internal/b;", "", "Lkotlinx/coroutines/internal/d;", "op", "c", "failure", "", "a", "Lkotlinx/coroutines/internal/d;", "b", "()Lkotlinx/coroutines/internal/d;", "d", "(Lkotlinx/coroutines/internal/d;)V", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC9763b {

    /* renamed from: a */
    public AbstractC9767d<?> f25566a;

    /* renamed from: a */
    public abstract void mo13241a(AbstractC9767d<?> abstractC9767d, Object obj);

    /* renamed from: b */
    public final AbstractC9767d<?> m13336b() {
        AbstractC9767d<?> abstractC9767d = this.f25566a;
        if (abstractC9767d != null) {
            return abstractC9767d;
        }
        C9612q.m13900y("atomicOp");
        return null;
    }

    /* renamed from: c */
    public abstract Object mo13240c(AbstractC9767d<?> abstractC9767d);

    /* renamed from: d */
    public final void m13335d(AbstractC9767d<?> abstractC9767d) {
        this.f25566a = abstractC9767d;
    }
}