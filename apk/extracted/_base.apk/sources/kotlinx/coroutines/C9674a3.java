package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C9764b0;
import kotlinx.coroutines.internal.C9776h0;
import pf.C11591x;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0014R*\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m14357d2 = {"Lkotlinx/coroutines/a3;", "T", "Lkotlinx/coroutines/internal/b0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "oldValue", "", "b1", "", "a1", "state", "V0", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "m", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.a3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9674a3<T> extends C9764b0<T> {

    /* renamed from: m */
    private ThreadLocal<Pair<CoroutineContext, Object>> f25413m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C9674a3(kotlin.coroutines.CoroutineContext r3, kotlin.coroutines.Continuation<? super T> r4) {
        /*
            r2 = this;
            kotlinx.coroutines.b3 r0 = kotlinx.coroutines.C9679b3.f25420j
            kotlin.coroutines.CoroutineContext$b r1 = r3.mo1458j(r0)
            if (r1 != 0) goto Ld
            kotlin.coroutines.CoroutineContext r0 = r3.mo1459e0(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f25413m = r0
            kotlin.coroutines.CoroutineContext r4 = r4.getContext()
            uf.d$b r0 = p371uf.InterfaceC12963d.f33719g
            kotlin.coroutines.CoroutineContext$b r4 = r4.mo1458j(r0)
            boolean r4 = r4 instanceof kotlinx.coroutines.CoroutineDispatcher
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.C9776h0.m13299c(r3, r4)
            kotlinx.coroutines.internal.C9776h0.m13301a(r3, r4)
            r2.m13573b1(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C9674a3.<init>(kotlin.coroutines.CoroutineContext, kotlin.coroutines.Continuation):void");
    }

    @Override // kotlinx.coroutines.internal.C9764b0, kotlinx.coroutines.AbstractC9670a
    /* renamed from: V0 */
    protected void mo12971V0(Object obj) {
        Pair<CoroutineContext, Object> pair = this.f25413m.get();
        C9674a3<?> c9674a3 = null;
        if (pair != null) {
            C9776h0.m13301a(pair.m14351a(), pair.m14350b());
            this.f25413m.set(null);
        }
        Object m13477a = C9703f0.m13477a(obj, this.f25567l);
        Continuation<T> continuation = this.f25567l;
        CoroutineContext context = continuation.getContext();
        Object m13299c = C9776h0.m13299c(context, null);
        if (m13299c != C9776h0.f25584a) {
            c9674a3 = C9746h0.m13377g(continuation, context, m13299c);
        }
        try {
            this.f25567l.resumeWith(m13477a);
            Unit unit = Unit.f25302a;
        } finally {
            if (c9674a3 == null || c9674a3.m13574a1()) {
                C9776h0.m13301a(context, m13299c);
            }
        }
    }

    /* renamed from: a1 */
    public final boolean m13574a1() {
        if (this.f25413m.get() == null) {
            return false;
        }
        this.f25413m.set(null);
        return true;
    }

    /* renamed from: b1 */
    public final void m13573b1(CoroutineContext coroutineContext, Object obj) {
        this.f25413m.set(C11591x.m7577a(coroutineContext, obj));
    }
}
