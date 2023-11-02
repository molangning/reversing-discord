package kotlinx.coroutines.scheduling;

import com.facebook.react.uimanager.ViewDefaults;
import eg.AbstractC6221c;
import gg.C6759j;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C9680c;
import kotlinx.coroutines.C9839p0;
import kotlinx.coroutines.internal.C9762a0;
import kotlinx.coroutines.internal.C9768d0;

@Metadata(m14358d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0003\u0006QRB+\u0012\u0006\u0010<\u001a\u00020\f\u0012\u0006\u0010>\u001a\u00020\f\u0012\b\b\u0002\u0010A\u001a\u00020\u0013\u0012\b\b\u0002\u0010C\u001a\u000207¢\u0006\u0004\bO\u0010PJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001c\u001a\u0004\u0018\u00010\u0003*\b\u0018\u00010\bR\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\nJ)\u0010!\u001a\u00020\u00102\n\u0010\u000b\u001a\u00060\bR\u00020\u00002\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\bR\u00020\u0000¢\u0006\u0004\b#\u0010$J\u001b\u0010(\u001a\u00020\u00102\n\u0010'\u001a\u00060%j\u0002`&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0013¢\u0006\u0004\b-\u0010.J-\u00102\u001a\u00020\u00102\n\u0010/\u001a\u00060%j\u0002`&2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b2\u00103J!\u00104\u001a\u00020\u00032\n\u0010/\u001a\u00060%j\u0002`&2\u0006\u00101\u001a\u000200¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0010¢\u0006\u0004\b6\u0010+J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u00106R\u0014\u0010>\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u00106R\u0014\u0010A\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010C\u001a\u0002078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010BR\u0014\u0010G\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u001e\u0010M\u001a\f\u0012\b\u0012\u00060\bR\u00020\u00000J8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0011\u0010N\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bN\u0010\u0018¨\u0006S"}, m14357d2 = {"Lkotlinx/coroutines/scheduling/a;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/scheduling/h;", "task", "", "a", "(Lkotlinx/coroutines/scheduling/h;)Z", "Lkotlinx/coroutines/scheduling/a$c;", "s", "()Lkotlinx/coroutines/scheduling/a$c;", "worker", "", "q", "(Lkotlinx/coroutines/scheduling/a$c;)I", "skipUnpark", "", "H", "(Z)V", "", "state", "R", "(J)Z", "U", "()Z", "h", "()I", "tailDispatch", "Q", "(Lkotlinx/coroutines/scheduling/a$c;Lkotlinx/coroutines/scheduling/h;Z)Lkotlinx/coroutines/scheduling/h;", "j", "oldIndex", "newIndex", "v", "(Lkotlinx/coroutines/scheduling/a$c;II)V", "t", "(Lkotlinx/coroutines/scheduling/a$c;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "timeout", "D", "(J)V", "block", "Lkotlinx/coroutines/scheduling/i;", "taskContext", "m", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/i;Z)V", "i", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/i;)Lkotlinx/coroutines/scheduling/h;", "I", "", "toString", "()Ljava/lang/String;", "A", "(Lkotlinx/coroutines/scheduling/h;)V", "corePoolSize", "k", "maxPoolSize", "l", "J", "idleWorkerKeepAliveNs", "Ljava/lang/String;", "schedulerName", "Lkotlinx/coroutines/scheduling/d;", "n", "Lkotlinx/coroutines/scheduling/d;", "globalCpuQueue", "o", "globalBlockingQueue", "Lkotlinx/coroutines/internal/a0;", "p", "Lkotlinx/coroutines/internal/a0;", "workers", "isTerminated", "<init>", "(IIJLjava/lang/String;)V", "c", "d", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.scheduling.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class ExecutorC9854a implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: j */
    public final int f25677j;

    /* renamed from: k */
    public final int f25678k;

    /* renamed from: l */
    public final long f25679l;

    /* renamed from: m */
    public final String f25680m;

    /* renamed from: n */
    public final C9861d f25681n;

    /* renamed from: o */
    public final C9861d f25682o;

    /* renamed from: p */
    public final C9762a0<C9857c> f25683p;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: q */
    public static final C9855a f25672q = new C9855a(null);

    /* renamed from: u */
    public static final C9768d0 f25676u = new C9768d0("NOT_IN_STACK");

    /* renamed from: r */
    private static final /* synthetic */ AtomicLongFieldUpdater f25673r = AtomicLongFieldUpdater.newUpdater(ExecutorC9854a.class, "parkedWorkersStack");

    /* renamed from: s */
    static final /* synthetic */ AtomicLongFieldUpdater f25674s = AtomicLongFieldUpdater.newUpdater(ExecutorC9854a.class, "controlState");

    /* renamed from: t */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f25675t = AtomicIntegerFieldUpdater.newUpdater(ExecutorC9854a.class, "_isTerminated");

    @Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, m14357d2 = {"Lkotlinx/coroutines/scheduling/a$a;", "", "", "BLOCKING_MASK", "J", "", "BLOCKING_SHIFT", "I", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "Lkotlinx/coroutines/internal/d0;", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/d0;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.scheduling.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9855a {
        private C9855a() {
        }

        public /* synthetic */ C9855a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
    /* renamed from: kotlinx.coroutines.scheduling.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C9856b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25684a;

        static {
            int[] iArr = new int[EnumC9858d.values().length];
            iArr[EnumC9858d.PARKING.ordinal()] = 1;
            iArr[EnumC9858d.BLOCKING.ordinal()] = 2;
            iArr[EnumC9858d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[EnumC9858d.DORMANT.ordinal()] = 4;
            iArr[EnumC9858d.TERMINATED.ordinal()] = 5;
            f25684a = iArr;
        }
    }

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m14357d2 = {"Lkotlinx/coroutines/scheduling/a$d;", "", "<init>", "(Ljava/lang/String;I)V", "j", "k", "l", "m", "n", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.scheduling.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum EnumC9858d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public ExecutorC9854a(int i, int i2, long j, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f25677j = i;
        this.f25678k = i2;
        this.f25679l = j;
        this.f25680m = str;
        if (i >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= 2097150) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (j > 0) {
                        this.f25681n = new C9861d();
                        this.f25682o = new C9861d();
                        this.parkedWorkersStack = 0L;
                        this.f25683p = new C9762a0<>(i + 1);
                        this.controlState = i << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
    }

    /* renamed from: H */
    private final void m13095H(boolean z) {
        long addAndGet = f25674s.addAndGet(this, 2097152L);
        if (z || m13090U() || m13092R(addAndGet)) {
            return;
        }
        m13090U();
    }

    /* renamed from: Q */
    private final AbstractRunnableC9865h m13093Q(C9857c c9857c, AbstractRunnableC9865h abstractRunnableC9865h, boolean z) {
        if (c9857c == null) {
            return abstractRunnableC9865h;
        }
        if (c9857c.f25687k == EnumC9858d.TERMINATED) {
            return abstractRunnableC9865h;
        }
        if (abstractRunnableC9865h.f25709k.mo13052b() == 0 && c9857c.f25687k == EnumC9858d.BLOCKING) {
            return abstractRunnableC9865h;
        }
        c9857c.f25691o = true;
        return c9857c.f25686j.m13049a(abstractRunnableC9865h, z);
    }

    /* renamed from: R */
    private final boolean m13092R(long j) {
        int m21930c;
        m21930c = C6759j.m21930c(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0);
        if (m21930c < this.f25677j) {
            int m13088h = m13088h();
            if (m13088h == 1 && this.f25677j > 1) {
                m13088h();
            }
            if (m13088h > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: S */
    static /* synthetic */ boolean m13091S(ExecutorC9854a executorC9854a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = executorC9854a.controlState;
        }
        return executorC9854a.m13092R(j);
    }

    /* renamed from: U */
    private final boolean m13090U() {
        C9857c m13082s;
        do {
            m13082s = m13082s();
            if (m13082s == null) {
                return false;
            }
        } while (!C9857c.f25685q.compareAndSet(m13082s, -1, 0));
        LockSupport.unpark(m13082s);
        return true;
    }

    /* renamed from: a */
    private final boolean m13089a(AbstractRunnableC9865h abstractRunnableC9865h) {
        boolean z = true;
        if (abstractRunnableC9865h.f25709k.mo13052b() != 1) {
            z = false;
        }
        if (z) {
            return this.f25682o.m13229a(abstractRunnableC9865h);
        }
        return this.f25681n.m13229a(abstractRunnableC9865h);
    }

    /* renamed from: h */
    private final int m13088h() {
        int m21930c;
        boolean z;
        synchronized (this.f25683p) {
            if (isTerminated()) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            boolean z2 = false;
            m21930c = C6759j.m21930c(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (m21930c >= this.f25677j) {
                return 0;
            }
            if (i >= this.f25678k) {
                return 0;
            }
            int i2 = ((int) (this.controlState & 2097151)) + 1;
            if (i2 > 0 && this.f25683p.m13338b(i2) == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C9857c c9857c = new C9857c(this, i2);
                this.f25683p.m13337c(i2, c9857c);
                if (i2 == ((int) (2097151 & f25674s.incrementAndGet(this)))) {
                    z2 = true;
                }
                if (z2) {
                    c9857c.start();
                    return m21930c + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: j */
    private final C9857c m13086j() {
        C9857c c9857c;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C9857c) {
            c9857c = (C9857c) currentThread;
        } else {
            c9857c = null;
        }
        if (c9857c == null || !C9612q.m13922c(ExecutorC9854a.this, this)) {
            return null;
        }
        return c9857c;
    }

    /* renamed from: o */
    public static /* synthetic */ void m13084o(ExecutorC9854a executorC9854a, Runnable runnable, InterfaceC9866i interfaceC9866i, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC9866i = C9869l.f25717f;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        executorC9854a.m13085m(runnable, interfaceC9866i, z);
    }

    /* renamed from: q */
    private final int m13083q(C9857c c9857c) {
        Object m13072h = c9857c.m13072h();
        while (m13072h != f25676u) {
            if (m13072h == null) {
                return 0;
            }
            C9857c c9857c2 = (C9857c) m13072h;
            int m13073g = c9857c2.m13073g();
            if (m13073g != 0) {
                return m13073g;
            }
            m13072h = c9857c2.m13072h();
        }
        return -1;
    }

    /* renamed from: s */
    private final C9857c m13082s() {
        while (true) {
            long j = this.parkedWorkersStack;
            C9857c m13338b = this.f25683p.m13338b((int) (2097151 & j));
            if (m13338b == null) {
                return null;
            }
            long j2 = (2097152 + j) & (-2097152);
            int m13083q = m13083q(m13338b);
            if (m13083q >= 0 && f25673r.compareAndSet(this, j, m13083q | j2)) {
                m13338b.m13064p(f25676u);
                return m13338b;
            }
        }
    }

    /* renamed from: A */
    public final void m13097A(AbstractRunnableC9865h abstractRunnableC9865h) {
        try {
            abstractRunnableC9865h.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: D */
    public final void m13096D(long j) {
        int i;
        AbstractRunnableC9865h m13226d;
        if (!f25675t.compareAndSet(this, 0, 1)) {
            return;
        }
        C9857c m13086j = m13086j();
        synchronized (this.f25683p) {
            i = (int) (this.controlState & 2097151);
        }
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                C9857c m13338b = this.f25683p.m13338b(i2);
                C9612q.m13920e(m13338b);
                C9857c c9857c = m13338b;
                if (c9857c != m13086j) {
                    while (c9857c.isAlive()) {
                        LockSupport.unpark(c9857c);
                        c9857c.join(j);
                    }
                    c9857c.f25686j.m13043g(this.f25682o);
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        this.f25682o.m13228b();
        this.f25681n.m13228b();
        while (true) {
            if (m13086j != null) {
                m13226d = m13086j.m13074f(true);
                if (m13226d != null) {
                    continue;
                    m13097A(m13226d);
                }
            }
            m13226d = this.f25681n.m13226d();
            if (m13226d == null && (m13226d = this.f25682o.m13226d()) == null) {
                break;
            }
            m13097A(m13226d);
        }
        if (m13086j != null) {
            m13086j.m13061s(EnumC9858d.TERMINATED);
        }
        this.parkedWorkersStack = 0L;
        this.controlState = 0L;
    }

    /* renamed from: I */
    public final void m13094I() {
        if (m13090U() || m13091S(this, 0L, 1, null)) {
            return;
        }
        m13090U();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m13096D(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m13084o(this, runnable, null, false, 6, null);
    }

    /* renamed from: i */
    public final AbstractRunnableC9865h m13087i(Runnable runnable, InterfaceC9866i interfaceC9866i) {
        long mo13054a = C9869l.f25716e.mo13054a();
        if (runnable instanceof AbstractRunnableC9865h) {
            AbstractRunnableC9865h abstractRunnableC9865h = (AbstractRunnableC9865h) runnable;
            abstractRunnableC9865h.f25708j = mo13054a;
            abstractRunnableC9865h.f25709k = interfaceC9866i;
            return abstractRunnableC9865h;
        }
        return new C9868k(runnable, mo13054a, interfaceC9866i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: m */
    public final void m13085m(Runnable runnable, InterfaceC9866i interfaceC9866i, boolean z) {
        boolean z2;
        C9680c.m13566a();
        AbstractRunnableC9865h m13087i = m13087i(runnable, interfaceC9866i);
        C9857c m13086j = m13086j();
        AbstractRunnableC9865h m13093Q = m13093Q(m13086j, m13087i, z);
        if (m13093Q != null && !m13089a(m13093Q)) {
            throw new RejectedExecutionException(this.f25680m + " was terminated");
        }
        if (z && m13086j != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m13087i.f25709k.mo13052b() == 0) {
            if (z2) {
                return;
            }
            m13094I();
            return;
        }
        m13095H(z2);
    }

    /* renamed from: t */
    public final boolean m13081t(C9857c c9857c) {
        long j;
        int m13073g;
        if (c9857c.m13072h() != f25676u) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            m13073g = c9857c.m13073g();
            c9857c.m13064p(this.f25683p.m13338b((int) (2097151 & j)));
        } while (!f25673r.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | m13073g));
        return true;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int m13339a = this.f25683p.m13339a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < m13339a; i6++) {
            C9857c m13338b = this.f25683p.m13338b(i6);
            if (m13338b != null) {
                int m13044f = m13338b.f25686j.m13044f();
                int i7 = C9856b.f25684a[m13338b.f25687k.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 == 5) {
                                    i5++;
                                }
                            } else {
                                i4++;
                                if (m13044f > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(m13044f);
                                    sb2.append('d');
                                    arrayList.add(sb2.toString());
                                }
                            }
                        } else {
                            i++;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m13044f);
                            sb3.append('c');
                            arrayList.add(sb3.toString());
                        }
                    } else {
                        i2++;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(m13044f);
                        sb4.append('b');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    i3++;
                }
            }
        }
        long j = this.controlState;
        return this.f25680m + '@' + C9839p0.m13119b(this) + "[Pool Size {core = " + this.f25677j + ", max = " + this.f25678k + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f25681n.m13227c() + ", global blocking queue size = " + this.f25682o.m13227c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f25677j - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    /* renamed from: v */
    public final void m13080v(C9857c c9857c, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    i3 = m13083q(c9857c);
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0 && f25673r.compareAndSet(this, j, j2 | i3)) {
                return;
            }
        }
    }

    @Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b@\u0010AB\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020\u000e¢\u0006\u0004\b@\u0010BJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0007J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u0019J\u0015\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0007J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0019R*\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0011R\u0014\u0010/\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0016\u00101\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u00100R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00103R$\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010<\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00103R\u0016\u0010=\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0016\u0010?\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b,\u0010>¨\u0006C"}, m14357d2 = {"Lkotlinx/coroutines/scheduling/a$c;", "Ljava/lang/Thread;", "", "q", "()Z", "", "n", "()V", "r", "j", "Lkotlinx/coroutines/scheduling/h;", "task", "d", "(Lkotlinx/coroutines/scheduling/h;)V", "", "taskMode", "c", "(I)V", "b", "l", "u", "mode", "i", "scanLocalQueue", "e", "(Z)Lkotlinx/coroutines/scheduling/h;", "m", "()Lkotlinx/coroutines/scheduling/h;", "blockingOnly", "t", "Lkotlinx/coroutines/scheduling/a$d;", "newState", "s", "(Lkotlinx/coroutines/scheduling/a$d;)Z", "run", "upperBound", "k", "(I)I", "f", "index", "indexInArray", "I", "g", "()I", "o", "Lkotlinx/coroutines/scheduling/o;", "Lkotlinx/coroutines/scheduling/o;", "localQueue", "Lkotlinx/coroutines/scheduling/a$d;", "state", "", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "p", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "mayHaveLocalTasks", "<init>", "(Lkotlinx/coroutines/scheduling/a;)V", "(Lkotlinx/coroutines/scheduling/a;I)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.scheduling.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public final class C9857c extends Thread {

        /* renamed from: q */
        static final /* synthetic */ AtomicIntegerFieldUpdater f25685q = AtomicIntegerFieldUpdater.newUpdater(C9857c.class, "workerCtl");
        private volatile int indexInArray;

        /* renamed from: j */
        public final C9872o f25686j;

        /* renamed from: k */
        public EnumC9858d f25687k;

        /* renamed from: l */
        private long f25688l;

        /* renamed from: m */
        private long f25689m;

        /* renamed from: n */
        private int f25690n;
        private volatile Object nextParkedWorker;

        /* renamed from: o */
        public boolean f25691o;
        volatile /* synthetic */ int workerCtl;

        private C9857c() {
            ExecutorC9854a.this = r1;
            setDaemon(true);
            this.f25686j = new C9872o();
            this.f25687k = EnumC9858d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = ExecutorC9854a.f25676u;
            this.f25690n = AbstractC6221c.f17630j.mo23226c();
        }

        /* renamed from: b */
        private final void m13078b(int i) {
            if (i == 0) {
                return;
            }
            ExecutorC9854a.f25674s.addAndGet(ExecutorC9854a.this, -2097152L);
            if (this.f25687k != EnumC9858d.TERMINATED) {
                this.f25687k = EnumC9858d.DORMANT;
            }
        }

        /* renamed from: c */
        private final void m13077c(int i) {
            if (i != 0 && m13061s(EnumC9858d.BLOCKING)) {
                ExecutorC9854a.this.m13094I();
            }
        }

        /* renamed from: d */
        private final void m13076d(AbstractRunnableC9865h abstractRunnableC9865h) {
            int mo13052b = abstractRunnableC9865h.f25709k.mo13052b();
            m13071i(mo13052b);
            m13077c(mo13052b);
            ExecutorC9854a.this.m13097A(abstractRunnableC9865h);
            m13078b(mo13052b);
        }

        /* renamed from: e */
        private final AbstractRunnableC9865h m13075e(boolean z) {
            boolean z2;
            AbstractRunnableC9865h m13067m;
            AbstractRunnableC9865h m13067m2;
            if (z) {
                if (m13069k(ExecutorC9854a.this.f25677j * 2) == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (m13067m2 = m13067m()) != null) {
                    return m13067m2;
                }
                AbstractRunnableC9865h m13042h = this.f25686j.m13042h();
                if (m13042h != null) {
                    return m13042h;
                }
                if (!z2 && (m13067m = m13067m()) != null) {
                    return m13067m;
                }
            } else {
                AbstractRunnableC9865h m13067m3 = m13067m();
                if (m13067m3 != null) {
                    return m13067m3;
                }
            }
            return m13060t(false);
        }

        /* renamed from: i */
        private final void m13071i(int i) {
            this.f25688l = 0L;
            if (this.f25687k == EnumC9858d.PARKING) {
                this.f25687k = EnumC9858d.BLOCKING;
            }
        }

        /* renamed from: j */
        private final boolean m13070j() {
            return this.nextParkedWorker != ExecutorC9854a.f25676u;
        }

        /* renamed from: l */
        private final void m13068l() {
            if (this.f25688l == 0) {
                this.f25688l = System.nanoTime() + ExecutorC9854a.this.f25679l;
            }
            LockSupport.parkNanos(ExecutorC9854a.this.f25679l);
            if (System.nanoTime() - this.f25688l >= 0) {
                this.f25688l = 0L;
                m13059u();
            }
        }

        /* renamed from: m */
        private final AbstractRunnableC9865h m13067m() {
            if (m13069k(2) == 0) {
                AbstractRunnableC9865h m13226d = ExecutorC9854a.this.f25681n.m13226d();
                if (m13226d != null) {
                    return m13226d;
                }
                return ExecutorC9854a.this.f25682o.m13226d();
            }
            AbstractRunnableC9865h m13226d2 = ExecutorC9854a.this.f25682o.m13226d();
            if (m13226d2 != null) {
                return m13226d2;
            }
            return ExecutorC9854a.this.f25681n.m13226d();
        }

        /* renamed from: n */
        private final void m13066n() {
            loop0: while (true) {
                boolean z = false;
                while (!ExecutorC9854a.this.isTerminated() && this.f25687k != EnumC9858d.TERMINATED) {
                    AbstractRunnableC9865h m13074f = m13074f(this.f25691o);
                    if (m13074f != null) {
                        this.f25689m = 0L;
                        m13076d(m13074f);
                    } else {
                        this.f25691o = false;
                        if (this.f25689m != 0) {
                            if (!z) {
                                z = true;
                            } else {
                                m13061s(EnumC9858d.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f25689m);
                                this.f25689m = 0L;
                            }
                        } else {
                            m13062r();
                        }
                    }
                }
            }
            m13061s(EnumC9858d.TERMINATED);
        }

        /* renamed from: q */
        private final boolean m13063q() {
            boolean z;
            if (this.f25687k == EnumC9858d.CPU_ACQUIRED) {
                return true;
            }
            ExecutorC9854a executorC9854a = ExecutorC9854a.this;
            while (true) {
                long j = executorC9854a.controlState;
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    z = false;
                    break;
                }
                if (ExecutorC9854a.f25674s.compareAndSet(executorC9854a, j, j - 4398046511104L)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return false;
            }
            this.f25687k = EnumC9858d.CPU_ACQUIRED;
            return true;
        }

        /* renamed from: r */
        private final void m13062r() {
            if (!m13070j()) {
                ExecutorC9854a.this.m13081t(this);
                return;
            }
            this.workerCtl = -1;
            while (m13070j() && this.workerCtl == -1 && !ExecutorC9854a.this.isTerminated() && this.f25687k != EnumC9858d.TERMINATED) {
                m13061s(EnumC9858d.PARKING);
                Thread.interrupted();
                m13068l();
            }
        }

        /* renamed from: t */
        private final AbstractRunnableC9865h m13060t(boolean z) {
            long m13038l;
            int i = (int) (ExecutorC9854a.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int m13069k = m13069k(i);
            ExecutorC9854a executorC9854a = ExecutorC9854a.this;
            long j = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                m13069k++;
                if (m13069k > i) {
                    m13069k = 1;
                }
                C9857c m13338b = executorC9854a.f25683p.m13338b(m13069k);
                if (m13338b != null && m13338b != this) {
                    if (z) {
                        m13038l = this.f25686j.m13039k(m13338b.f25686j);
                    } else {
                        m13038l = this.f25686j.m13038l(m13338b.f25686j);
                    }
                    if (m13038l == -1) {
                        return this.f25686j.m13042h();
                    }
                    if (m13038l > 0) {
                        j = Math.min(j, m13038l);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.f25689m = j;
            return null;
        }

        /* renamed from: u */
        private final void m13059u() {
            ExecutorC9854a executorC9854a = ExecutorC9854a.this;
            synchronized (executorC9854a.f25683p) {
                if (executorC9854a.isTerminated()) {
                    return;
                }
                if (((int) (executorC9854a.controlState & 2097151)) <= executorC9854a.f25677j) {
                    return;
                }
                if (!f25685q.compareAndSet(this, -1, 1)) {
                    return;
                }
                int i = this.indexInArray;
                m13065o(0);
                executorC9854a.m13080v(this, i, 0);
                int andDecrement = (int) (ExecutorC9854a.f25674s.getAndDecrement(executorC9854a) & 2097151);
                if (andDecrement != i) {
                    C9857c m13338b = executorC9854a.f25683p.m13338b(andDecrement);
                    C9612q.m13920e(m13338b);
                    C9857c c9857c = m13338b;
                    executorC9854a.f25683p.m13337c(i, c9857c);
                    c9857c.m13065o(i);
                    executorC9854a.m13080v(c9857c, andDecrement, i);
                }
                executorC9854a.f25683p.m13337c(andDecrement, null);
                Unit unit = Unit.f25302a;
                this.f25687k = EnumC9858d.TERMINATED;
            }
        }

        /* renamed from: f */
        public final AbstractRunnableC9865h m13074f(boolean z) {
            AbstractRunnableC9865h m13226d;
            if (m13063q()) {
                return m13075e(z);
            }
            if (z) {
                m13226d = this.f25686j.m13042h();
                if (m13226d == null) {
                    m13226d = ExecutorC9854a.this.f25682o.m13226d();
                }
            } else {
                m13226d = ExecutorC9854a.this.f25682o.m13226d();
            }
            if (m13226d == null) {
                return m13060t(true);
            }
            return m13226d;
        }

        /* renamed from: g */
        public final int m13073g() {
            return this.indexInArray;
        }

        /* renamed from: h */
        public final Object m13072h() {
            return this.nextParkedWorker;
        }

        /* renamed from: k */
        public final int m13069k(int i) {
            int i2 = this.f25690n;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f25690n = i5;
            int i6 = i - 1;
            if ((i6 & i) == 0) {
                return i5 & i6;
            }
            return (i5 & ViewDefaults.NUMBER_OF_LINES) % i;
        }

        /* renamed from: o */
        public final void m13065o(int i) {
            String valueOf;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ExecutorC9854a.this.f25680m);
            sb2.append("-worker-");
            if (i == 0) {
                valueOf = "TERMINATED";
            } else {
                valueOf = String.valueOf(i);
            }
            sb2.append(valueOf);
            setName(sb2.toString());
            this.indexInArray = i;
        }

        /* renamed from: p */
        public final void m13064p(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m13066n();
        }

        /* renamed from: s */
        public final boolean m13061s(EnumC9858d enumC9858d) {
            boolean z;
            EnumC9858d enumC9858d2 = this.f25687k;
            if (enumC9858d2 == EnumC9858d.CPU_ACQUIRED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ExecutorC9854a.f25674s.addAndGet(ExecutorC9854a.this, 4398046511104L);
            }
            if (enumC9858d2 != enumC9858d) {
                this.f25687k = enumC9858d;
            }
            return z;
        }

        public C9857c(ExecutorC9854a executorC9854a, int i) {
            this();
            m13065o(i);
        }
    }
}