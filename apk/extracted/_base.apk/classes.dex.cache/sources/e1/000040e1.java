package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlinx.coroutines.AbstractC9755i1;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\f\u001a\u00020\t8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m14357d2 = {"Lkotlinx/coroutines/j1;", "Lkotlinx/coroutines/h1;", "", "T0", "", "now", "Lkotlinx/coroutines/i1$c;", "delayedTask", "S0", "Ljava/lang/Thread;", "R0", "()Ljava/lang/Thread;", "thread", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.j1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC9812j1 extends AbstractC9750h1 {
    /* renamed from: R0 */
    protected abstract Thread mo13115R0();

    /* renamed from: S0 */
    public void mo13114S0(long j, AbstractC9755i1.AbstractRunnableC9758c abstractRunnableC9758c) {
        RunnableC9843q0.f25663q.m13353c1(j, abstractRunnableC9758c);
    }

    /* renamed from: T0 */
    public final void m13188T0() {
        Thread mo13115R0 = mo13115R0();
        if (Thread.currentThread() != mo13115R0) {
            C9680c.m13566a();
            LockSupport.unpark(mo13115R0);
        }
    }
}