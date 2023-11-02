package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractC9830n1;

@Metadata(m14358d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u001c\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J+\u0010\u000f\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, m14357d2 = {"Lkotlinx/coroutines/scheduling/f;", "Lkotlinx/coroutines/n1;", "Lkotlinx/coroutines/scheduling/a;", "G0", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "B0", "C0", "Lkotlinx/coroutines/scheduling/i;", "", "tailDispatch", "H0", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/i;Z)V", "", "m", "I", "corePoolSize", "n", "maxPoolSize", "", "o", "J", "idleWorkerKeepAliveNs", "", "p", "Ljava/lang/String;", "schedulerName", "q", "Lkotlinx/coroutines/scheduling/a;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "F0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.scheduling.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9863f extends AbstractC9830n1 {

    /* renamed from: m */
    private final int f25703m;

    /* renamed from: n */
    private final int f25704n;

    /* renamed from: o */
    private final long f25705o;

    /* renamed from: p */
    private final String f25706p;

    /* renamed from: q */
    private ExecutorC9854a f25707q = m13056G0();

    public C9863f(int i, int i2, long j, String str) {
        this.f25703m = i;
        this.f25704n = i2;
        this.f25705o = j;
        this.f25706p = str;
    }

    /* renamed from: G0 */
    private final ExecutorC9854a m13056G0() {
        return new ExecutorC9854a(this.f25703m, this.f25704n, this.f25705o, this.f25706p);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: B0 */
    public void mo2769B0(CoroutineContext coroutineContext, Runnable runnable) {
        ExecutorC9854a.m13084o(this.f25707q, runnable, null, false, 6, null);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: C0 */
    public void mo13051C0(CoroutineContext coroutineContext, Runnable runnable) {
        ExecutorC9854a.m13084o(this.f25707q, runnable, null, true, 2, null);
    }

    @Override // kotlinx.coroutines.AbstractC9830n1
    /* renamed from: F0 */
    public Executor mo13057F0() {
        return this.f25707q;
    }

    /* renamed from: H0 */
    public final void m13055H0(Runnable runnable, InterfaceC9866i interfaceC9866i, boolean z) {
        this.f25707q.m13085m(runnable, interfaceC9866i, z);
    }
}
