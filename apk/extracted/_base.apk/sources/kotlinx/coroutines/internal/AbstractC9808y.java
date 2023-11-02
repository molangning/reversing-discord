package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.C9839p0;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000R\u001a\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m14357d2 = {"Lkotlinx/coroutines/internal/y;", "", "affected", "c", "", "toString", "that", "", "b", "Lkotlinx/coroutines/internal/d;", "a", "()Lkotlinx/coroutines/internal/d;", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC9808y {
    /* renamed from: a */
    public abstract AbstractC9767d<?> mo13023a();

    /* renamed from: b */
    public final boolean m13197b(AbstractC9808y abstractC9808y) {
        AbstractC9767d<?> mo13023a;
        AbstractC9767d<?> mo13023a2 = mo13023a();
        if (mo13023a2 == null || (mo13023a = abstractC9808y.mo13023a()) == null || mo13023a2.mo13027g() >= mo13023a.mo13027g()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public abstract Object mo13022c(Object obj);

    public String toString() {
        return C9839p0.m13120a(this) + '@' + C9839p0.m13119b(this);
    }
}
