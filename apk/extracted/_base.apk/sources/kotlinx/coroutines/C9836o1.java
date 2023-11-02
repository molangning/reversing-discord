package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C9769e;

@Metadata(m14358d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'J.\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\u00032\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u001c\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016J$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0016R\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, m14357d2 = {"Lkotlinx/coroutines/o1;", "Lkotlinx/coroutines/n1;", "Lkotlinx/coroutines/u0;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "", "timeMillis", "Ljava/util/concurrent/ScheduledFuture;", "H0", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "", "G0", "B0", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "v", "Lkotlinx/coroutines/d1;", "R", "close", "", "toString", "", "other", "", "equals", "", "hashCode", "Ljava/util/concurrent/Executor;", "m", "Ljava/util/concurrent/Executor;", "F0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.o1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9836o1 extends AbstractC9830n1 implements InterfaceC9899u0 {

    /* renamed from: m */
    private final Executor f25653m;

    public C9836o1(Executor executor) {
        this.f25653m = executor;
        C9769e.m13328a(mo13057F0());
    }

    /* renamed from: G0 */
    private final void m13159G0(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        C9673a2.m13581c(coroutineContext, C9825m1.m13165a("The task was rejected", rejectedExecutionException));
    }

    /* renamed from: H0 */
    private final ScheduledFuture<?> m13158H0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            m13159G0(coroutineContext, e);
            return null;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: B0 */
    public void mo2769B0(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            Executor mo13057F0 = mo13057F0();
            C9680c.m13566a();
            mo13057F0.execute(runnable);
        } catch (RejectedExecutionException e) {
            C9680c.m13566a();
            m13159G0(coroutineContext, e);
            C9677b1.m13569b().mo2769B0(coroutineContext, runnable);
        }
    }

    @Override // kotlinx.coroutines.AbstractC9830n1
    /* renamed from: F0 */
    public Executor mo13057F0() {
        return this.f25653m;
    }

    @Override // kotlinx.coroutines.InterfaceC9899u0
    /* renamed from: R */
    public InterfaceC9688d1 mo2760R(long j, Runnable runnable, CoroutineContext coroutineContext) {
        ScheduledExecutorService scheduledExecutorService;
        Executor mo13057F0 = mo13057F0();
        ScheduledFuture<?> scheduledFuture = null;
        if (mo13057F0 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) mo13057F0;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = m13158H0(scheduledExecutorService, runnable, coroutineContext, j);
        }
        if (scheduledFuture != null) {
            return new C9682c1(scheduledFuture);
        }
        return RunnableC9843q0.f25663q.mo2760R(j, runnable, coroutineContext);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor mo13057F0 = mo13057F0();
        ExecutorService executorService = mo13057F0 instanceof ExecutorService ? (ExecutorService) mo13057F0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9836o1) && ((C9836o1) obj).mo13057F0() == mo13057F0();
    }

    public int hashCode() {
        return System.identityHashCode(mo13057F0());
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return mo13057F0().toString();
    }

    @Override // kotlinx.coroutines.InterfaceC9899u0
    /* renamed from: v */
    public void mo2761v(long j, CancellableContinuation<? super Unit> cancellableContinuation) {
        ScheduledExecutorService scheduledExecutorService;
        Executor mo13057F0 = mo13057F0();
        ScheduledFuture<?> scheduledFuture = null;
        if (mo13057F0 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) mo13057F0;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = m13158H0(scheduledExecutorService, new RunnableC9841p2(this, cancellableContinuation), cancellableContinuation.getContext(), j);
        }
        if (scheduledFuture != null) {
            C9673a2.m13578f(cancellableContinuation, scheduledFuture);
        } else {
            RunnableC9843q0.f25663q.mo2761v(j, cancellableContinuation);
        }
    }
}
