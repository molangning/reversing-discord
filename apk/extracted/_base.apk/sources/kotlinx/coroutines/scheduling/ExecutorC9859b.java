package kotlinx.coroutines.scheduling;

import gg.C6759j;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractC9830n1;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C9770e0;
import kotlinx.coroutines.internal.C9774g0;
import p371uf.C12967f;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0016J\u001c\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0017J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m14357d2 = {"Lkotlinx/coroutines/scheduling/b;", "Lkotlinx/coroutines/n1;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "", "execute", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/Runnable;", "block", "B0", "C0", "close", "", "toString", "Lkotlinx/coroutines/CoroutineDispatcher;", "n", "Lkotlinx/coroutines/CoroutineDispatcher;", "default", "F0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.scheduling.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class ExecutorC9859b extends AbstractC9830n1 implements Executor {

    /* renamed from: m */
    public static final ExecutorC9859b f25699m = new ExecutorC9859b();

    /* renamed from: n */
    private static final CoroutineDispatcher f25700n;

    static {
        int m21930c;
        int m13307d;
        C9870m c9870m = C9870m.f25719l;
        m21930c = C6759j.m21930c(64, C9770e0.m13327a());
        m13307d = C9774g0.m13307d("kotlinx.coroutines.io.parallelism", m21930c, 0, 0, 12, null);
        f25700n = c9870m.m13596E0(m13307d);
    }

    private ExecutorC9859b() {
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: B0 */
    public void mo2769B0(CoroutineContext coroutineContext, Runnable runnable) {
        f25700n.mo2769B0(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: C0 */
    public void mo13051C0(CoroutineContext coroutineContext, Runnable runnable) {
        f25700n.mo13051C0(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC9830n1
    /* renamed from: F0 */
    public Executor mo13057F0() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        mo2769B0(C12967f.f33721j, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.IO";
    }
}
