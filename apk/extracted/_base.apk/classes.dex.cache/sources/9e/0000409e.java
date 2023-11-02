package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m14357d2 = {"Lkotlinx/coroutines/h;", "T", "Lkotlinx/coroutines/a;", "", "state", "", "F", "Z0", "()Ljava/lang/Object;", "Ljava/lang/Thread;", "l", "Ljava/lang/Thread;", "blockedThread", "Lkotlinx/coroutines/h1;", "m", "Lkotlinx/coroutines/h1;", "eventLoop", "", "q0", "()Z", "isScopedCoroutine", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lkotlinx/coroutines/h1;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9745h<T> extends AbstractC9670a<T> {

    /* renamed from: l */
    private final Thread f25542l;

    /* renamed from: m */
    private final AbstractC9750h1 f25543m;

    public C9745h(CoroutineContext coroutineContext, Thread thread, AbstractC9750h1 abstractC9750h1) {
        super(coroutineContext, true, true);
        this.f25542l = thread;
        this.f25543m = abstractC9750h1;
    }

    @Override // kotlinx.coroutines.C9696e2
    /* renamed from: F */
    public void mo12972F(Object obj) {
        if (!C9612q.m13922c(Thread.currentThread(), this.f25542l)) {
            Thread thread = this.f25542l;
            C9680c.m13566a();
            LockSupport.unpark(thread);
        }
    }

    /* renamed from: Z0 */
    public final T m13384Z0() {
        long j;
        C9680c.m13566a();
        try {
            AbstractC9750h1 abstractC9750h1 = this.f25543m;
            C9676b0 c9676b0 = null;
            if (abstractC9750h1 != null) {
                AbstractC9750h1.m13368L0(abstractC9750h1, false, 1, null);
            }
            while (!Thread.interrupted()) {
                AbstractC9750h1 abstractC9750h12 = this.f25543m;
                if (abstractC9750h12 != null) {
                    j = abstractC9750h12.mo13361O0();
                } else {
                    j = Long.MAX_VALUE;
                }
                if (!mo13507i()) {
                    C9680c.m13566a();
                    LockSupport.parkNanos(this, j);
                } else {
                    AbstractC9750h1 abstractC9750h13 = this.f25543m;
                    if (abstractC9750h13 != null) {
                        AbstractC9750h1.m13372G0(abstractC9750h13, false, 1, null);
                    }
                    C9680c.m13566a();
                    T t = (T) C9705f2.m13466h(m13504l0());
                    if (t instanceof C9676b0) {
                        c9676b0 = (C9676b0) t;
                    }
                    if (c9676b0 == null) {
                        return t;
                    }
                    throw c9676b0.f25415a;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            m13532K(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            C9680c.m13566a();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.C9696e2
    /* renamed from: q0 */
    protected boolean mo13333q0() {
        return true;
    }
}