package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlinx.coroutines.AbstractC9670a;
import kotlinx.coroutines.C9703f0;
import kotlinx.coroutines.InterfaceC9898u;
import kotlinx.coroutines.Job;
import p388vf.C13272c;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m14357d2 = {"Lkotlinx/coroutines/internal/b0;", "T", "Lkotlinx/coroutines/a;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "state", "", "F", "V0", "Lkotlin/coroutines/Continuation;", "l", "Lkotlin/coroutines/Continuation;", "uCont", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "", "q0", "()Z", "isScopedCoroutine", "Lkotlinx/coroutines/Job;", "Z0", "()Lkotlinx/coroutines/Job;", "parent", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9764b0<T> extends AbstractC9670a<T> implements CoroutineStackFrame {

    /* renamed from: l */
    public final Continuation<T> f25567l;

    /* JADX WARN: Multi-variable type inference failed */
    public C9764b0(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        super(coroutineContext, true, true);
        this.f25567l = continuation;
    }

    @Override // kotlinx.coroutines.C9696e2
    /* renamed from: F */
    public void mo12972F(Object obj) {
        Continuation m2870c;
        m2870c = C13272c.m2870c(this.f25567l);
        C9775h.m13303c(m2870c, C9703f0.m13477a(obj, this.f25567l), null, 2, null);
    }

    @Override // kotlinx.coroutines.AbstractC9670a
    /* renamed from: V0 */
    protected void mo12971V0(Object obj) {
        Continuation<T> continuation = this.f25567l;
        continuation.resumeWith(C9703f0.m13477a(obj, continuation));
    }

    /* renamed from: Z0 */
    public final Job m13334Z0() {
        InterfaceC9898u m13505k0 = m13505k0();
        if (m13505k0 != null) {
            return m13505k0.getParent();
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f25567l;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlinx.coroutines.C9696e2
    /* renamed from: q0 */
    protected final boolean mo13333q0() {
        return true;
    }
}