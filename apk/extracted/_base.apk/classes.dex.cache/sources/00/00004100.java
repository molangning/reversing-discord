package kotlinx.coroutines;

import gg.C6759j;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractC9755i1;

@Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b,\u0010 J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0014\u0010\f\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0012\u001a\u00020\u0004H\u0016J$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\r2\n\u0010\u0014\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016R\u0014\u0010\u001c\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0014\u0010+\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, m14357d2 = {"Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/i1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "m1", "Ljava/lang/Thread;", "i1", "", "l1", "h1", "task", "X0", "", "now", "Lkotlinx/coroutines/i1$c;", "delayedTask", "S0", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/d1;", "R", "run", "r", "J", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "()V", "", "debugStatus", "I", "j1", "()Z", "isShutDown", "k1", "isShutdownRequested", "R0", "()Ljava/lang/Thread;", "thread", "<init>", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.q0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class RunnableC9843q0 extends AbstractC9755i1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: q */
    public static final RunnableC9843q0 f25663q;

    /* renamed from: r */
    private static final long f25664r;

    static {
        Long l;
        RunnableC9843q0 runnableC9843q0 = new RunnableC9843q0();
        f25663q = runnableC9843q0;
        AbstractC9750h1.m13368L0(runnableC9843q0, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f25664r = timeUnit.toNanos(l.longValue());
    }

    private RunnableC9843q0() {
    }

    /* renamed from: h1 */
    private final synchronized void m13112h1() {
        if (!m13109k1()) {
            return;
        }
        debugStatus = 3;
        m13354b1();
        notifyAll();
    }

    /* renamed from: i1 */
    private final synchronized Thread m13111i1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: j1 */
    private final boolean m13110j1() {
        return debugStatus == 4;
    }

    /* renamed from: k1 */
    private final boolean m13109k1() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: l1 */
    private final synchronized boolean m13108l1() {
        if (m13109k1()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* renamed from: m1 */
    private final void m13107m1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.AbstractC9755i1, kotlinx.coroutines.InterfaceC9899u0
    /* renamed from: R */
    public InterfaceC9688d1 mo2760R(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return m13351e1(j, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC9812j1
    /* renamed from: R0 */
    protected Thread mo13115R0() {
        Thread thread = _thread;
        return thread == null ? m13111i1() : thread;
    }

    @Override // kotlinx.coroutines.AbstractC9812j1
    /* renamed from: S0 */
    protected void mo13114S0(long j, AbstractC9755i1.AbstractRunnableC9758c abstractRunnableC9758c) {
        m13107m1();
    }

    @Override // kotlinx.coroutines.AbstractC9755i1
    /* renamed from: X0 */
    public void mo13113X0(Runnable runnable) {
        if (m13110j1()) {
            m13107m1();
        }
        super.mo13113X0(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean m13356Z0;
        C9906v2.f25766a.m12978d(this);
        C9680c.m13566a();
        try {
            if (!m13108l1()) {
                if (!m13356Z0) {
                    return;
                }
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long mo13361O0 = mo13361O0();
                if (mo13361O0 == Long.MAX_VALUE) {
                    C9680c.m13566a();
                    long nanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = f25664r + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        m13112h1();
                        C9680c.m13566a();
                        if (!m13356Z0()) {
                            mo13115R0();
                            return;
                        }
                        return;
                    }
                    mo13361O0 = C6759j.m21925h(mo13361O0, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (mo13361O0 > 0) {
                    if (m13109k1()) {
                        _thread = null;
                        m13112h1();
                        C9680c.m13566a();
                        if (!m13356Z0()) {
                            mo13115R0();
                            return;
                        }
                        return;
                    }
                    C9680c.m13566a();
                    LockSupport.parkNanos(this, mo13361O0);
                }
            }
        } finally {
            _thread = null;
            m13112h1();
            C9680c.m13566a();
            if (!m13356Z0()) {
                mo13115R0();
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC9755i1, kotlinx.coroutines.AbstractC9750h1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}