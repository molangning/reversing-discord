package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C9847r0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC9688d1;
import kotlinx.coroutines.InterfaceC9899u0;

@Metadata(m14358d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0014\u0010\b\u001a\u00020\u00052\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0002J%\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0001J\u001f\u0010\u0012\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0096\u0001J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0014\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u001c\u0010\u0015\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0017R\u0014\u0010\u0018\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001e\u0010!\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010&\u001a\u00060\"j\u0002`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, m14357d2 = {"Lkotlinx/coroutines/internal/l;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/u0;", "", "G0", "block", "F0", "", "timeMillis", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/d1;", "R", "Lkotlinx/coroutines/CancellableContinuation;", "", "continuation", "v", "run", "B0", "C0", "l", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "", "m", "I", "parallelism", "runningWorkers", "Lkotlinx/coroutines/internal/r;", "o", "Lkotlinx/coroutines/internal/r;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "p", "Ljava/lang/Object;", "workerAllocationLock", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;I)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class RunnableC9786l extends CoroutineDispatcher implements Runnable, InterfaceC9899u0 {

    /* renamed from: l */
    private final CoroutineDispatcher f25598l;

    /* renamed from: m */
    private final int f25599m;

    /* renamed from: n */
    private final /* synthetic */ InterfaceC9899u0 f25600n;

    /* renamed from: o */
    private final C9798r<Runnable> f25601o;

    /* renamed from: p */
    private final Object f25602p;
    private volatile int runningWorkers;

    public RunnableC9786l(CoroutineDispatcher coroutineDispatcher, int i) {
        InterfaceC9899u0 interfaceC9899u0;
        this.f25598l = coroutineDispatcher;
        this.f25599m = i;
        if (coroutineDispatcher instanceof InterfaceC9899u0) {
            interfaceC9899u0 = (InterfaceC9899u0) coroutineDispatcher;
        } else {
            interfaceC9899u0 = null;
        }
        this.f25600n = interfaceC9899u0 == null ? C9847r0.m13103a() : interfaceC9899u0;
        this.f25601o = new C9798r<>(false);
        this.f25602p = new Object();
    }

    /* renamed from: F0 */
    private final boolean m13268F0(Runnable runnable) {
        this.f25601o.m13229a(runnable);
        if (this.runningWorkers >= this.f25599m) {
            return true;
        }
        return false;
    }

    /* renamed from: G0 */
    private final boolean m13267G0() {
        synchronized (this.f25602p) {
            if (this.runningWorkers >= this.f25599m) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: B0 */
    public void mo2769B0(CoroutineContext coroutineContext, Runnable runnable) {
        if (!m13268F0(runnable) && m13267G0()) {
            this.f25598l.mo2769B0(this, this);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: C0 */
    public void mo13051C0(CoroutineContext coroutineContext, Runnable runnable) {
        if (!m13268F0(runnable) && m13267G0()) {
            this.f25598l.mo13051C0(this, this);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC9899u0
    /* renamed from: R */
    public InterfaceC9688d1 mo2760R(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f25600n.mo2760R(j, runnable, coroutineContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x002a, code lost:
        r1 = r4.f25602p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x002d, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0039, code lost:
        if (r4.f25601o.m13227c() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x003c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x003d, code lost:
        r4.runningWorkers++;
        r2 = kotlin.Unit.f25302a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            kotlinx.coroutines.internal.r<java.lang.Runnable> r2 = r4.f25601o
            java.lang.Object r2 = r2.m13226d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            uf.f r3 = p371uf.C12967f.f33721j
            kotlinx.coroutines.C9815k0.m13185a(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            kotlinx.coroutines.CoroutineDispatcher r2 = r4.f25598l
            boolean r2 = r2.mo2768D0(r4)
            if (r2 == 0) goto L2
            kotlinx.coroutines.CoroutineDispatcher r0 = r4.f25598l
            r0.mo2769B0(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.f25602p
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlinx.coroutines.internal.r<java.lang.Runnable> r2 = r4.f25601o     // Catch: java.lang.Throwable -> L47
            int r2 = r2.m13227c()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlin.Unit r2 = kotlin.Unit.f25302a     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            goto L1
        L47:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.RunnableC9786l.run():void");
    }

    @Override // kotlinx.coroutines.InterfaceC9899u0
    /* renamed from: v */
    public void mo2761v(long j, CancellableContinuation<? super Unit> cancellableContinuation) {
        this.f25600n.mo2761v(j, cancellableContinuation);
    }
}