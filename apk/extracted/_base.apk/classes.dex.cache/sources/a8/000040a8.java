package kotlinx.coroutines;

import androidx.concurrent.futures.C0647b;
import gg.C6759j;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.InterfaceC9899u0;
import kotlinx.coroutines.internal.C9768d0;
import kotlinx.coroutines.internal.C9781i0;
import kotlinx.coroutines.internal.C9799s;
import kotlinx.coroutines.internal.InterfaceC9783j0;

@Metadata(m14358d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\b \u0018\u00002\u00020\u00012\u00020\u0002:\u000489:;B\u0007¢\u0006\u0004\b7\u0010\rJ\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\rJ%\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00112\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u0004H\u0004¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u000b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000bH\u0004¢\u0006\u0004\b,\u0010\rR$\u00102\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00106\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u0010#¨\u0006<"}, m14357d2 = {"Lkotlinx/coroutines/i1;", "Lkotlinx/coroutines/j1;", "Lkotlinx/coroutines/u0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "Y0", "(Ljava/lang/Runnable;)Z", "W0", "()Ljava/lang/Runnable;", "", "V0", "()V", "Lkotlinx/coroutines/i1$c;", "g1", "(Lkotlinx/coroutines/i1$c;)Z", "", "now", "delayedTask", "", "d1", "(JLkotlinx/coroutines/i1$c;)I", "a1", "shutdown", "timeMillis", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "v", "(JLkotlinx/coroutines/CancellableContinuation;)V", "block", "Lkotlinx/coroutines/d1;", "e1", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/d1;", "O0", "()J", "Lkotlin/coroutines/CoroutineContext;", "context", "B0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "X0", "(Ljava/lang/Runnable;)V", "c1", "(JLkotlinx/coroutines/i1$c;)V", "b1", "value", "i", "()Z", "f1", "(Z)V", "isCompleted", "Z0", "isEmpty", "J0", "nextTime", "<init>", "a", "b", "c", "d", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.i1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC9755i1 extends AbstractC9812j1 implements InterfaceC9899u0 {

    /* renamed from: o */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f25555o = AtomicReferenceFieldUpdater.newUpdater(AbstractC9755i1.class, Object.class, "_queue");

    /* renamed from: p */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f25556p = AtomicReferenceFieldUpdater.newUpdater(AbstractC9755i1.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m14357d2 = {"Lkotlinx/coroutines/i1$a;", "Lkotlinx/coroutines/i1$c;", "", "run", "", "toString", "Lkotlinx/coroutines/CancellableContinuation;", "l", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "", "nanoTime", "<init>", "(Lkotlinx/coroutines/i1;JLkotlinx/coroutines/CancellableContinuation;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.i1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public final class C9756a extends AbstractRunnableC9758c {

        /* renamed from: l */
        private final CancellableContinuation<Unit> f25557l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9756a(long j, CancellableContinuation<? super Unit> cancellableContinuation) {
            super(j);
            AbstractC9755i1.this = r1;
            this.f25557l = cancellableContinuation;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25557l.mo13125v(AbstractC9755i1.this, Unit.f25302a);
        }

        @Override // kotlinx.coroutines.AbstractC9755i1.AbstractRunnableC9758c
        public String toString() {
            return super.toString() + this.f25557l;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m14357d2 = {"Lkotlinx/coroutines/i1$b;", "Lkotlinx/coroutines/i1$c;", "", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "l", "Ljava/lang/Runnable;", "block", "", "nanoTime", "<init>", "(JLjava/lang/Runnable;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.i1$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9757b extends AbstractRunnableC9758c {

        /* renamed from: l */
        private final Runnable f25559l;

        public C9757b(long j, Runnable runnable) {
            super(j);
            this.f25559l = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25559l.run();
        }

        @Override // kotlinx.coroutines.AbstractC9755i1.AbstractRunnableC9758c
        public String toString() {
            return super.toString() + this.f25559l;
        }
    }

    @Metadata(m14358d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b*\u0010+J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0016\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R0\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010#2\f\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010#8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, m14357d2 = {"Lkotlinx/coroutines/i1$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/d1;", "Lkotlinx/coroutines/internal/j0;", "other", "", "d", "", "now", "", "f", "Lkotlinx/coroutines/i1$d;", "delayed", "Lkotlinx/coroutines/i1;", "eventLoop", "e", "", "dispose", "", "toString", "j", "J", "nanoTime", "", "_heap", "Ljava/lang/Object;", "k", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "Lkotlinx/coroutines/internal/i0;", "value", "b", "()Lkotlinx/coroutines/internal/i0;", "a", "(Lkotlinx/coroutines/internal/i0;)V", "heap", "<init>", "(J)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.i1$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static abstract class AbstractRunnableC9758c implements Runnable, Comparable<AbstractRunnableC9758c>, InterfaceC9688d1, InterfaceC9783j0 {
        private volatile Object _heap;

        /* renamed from: j */
        public long f25560j;

        /* renamed from: k */
        private int f25561k = -1;

        public AbstractRunnableC9758c(long j) {
            this.f25560j = j;
        }

        @Override // kotlinx.coroutines.internal.InterfaceC9783j0
        /* renamed from: a */
        public void mo13275a(C9781i0<?> c9781i0) {
            C9768d0 c9768d0;
            boolean z;
            Object obj = this._heap;
            c9768d0 = C9821l1.f25641a;
            if (obj != c9768d0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this._heap = c9781i0;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // kotlinx.coroutines.internal.InterfaceC9783j0
        /* renamed from: b */
        public C9781i0<?> mo13274b() {
            Object obj = this._heap;
            if (obj instanceof C9781i0) {
                return (C9781i0) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* renamed from: d */
        public int compareTo(AbstractRunnableC9758c abstractRunnableC9758c) {
            int i = ((this.f25560j - abstractRunnableC9758c.f25560j) > 0L ? 1 : ((this.f25560j - abstractRunnableC9758c.f25560j) == 0L ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        @Override // kotlinx.coroutines.InterfaceC9688d1
        public final synchronized void dispose() {
            C9768d0 c9768d0;
            C9759d c9759d;
            C9768d0 c9768d02;
            Object obj = this._heap;
            c9768d0 = C9821l1.f25641a;
            if (obj == c9768d0) {
                return;
            }
            if (obj instanceof C9759d) {
                c9759d = (C9759d) obj;
            } else {
                c9759d = null;
            }
            if (c9759d != null) {
                c9759d.m13283g(this);
            }
            c9768d02 = C9821l1.f25641a;
            this._heap = c9768d02;
        }

        /* renamed from: e */
        public final synchronized int m13346e(long j, C9759d c9759d, AbstractC9755i1 abstractC9755i1) {
            C9768d0 c9768d0;
            Object obj = this._heap;
            c9768d0 = C9821l1.f25641a;
            if (obj == c9768d0) {
                return 2;
            }
            synchronized (c9759d) {
                AbstractRunnableC9758c m13288b = c9759d.m13288b();
                if (abstractC9755i1.m13348i()) {
                    return 1;
                }
                if (m13288b == null) {
                    c9759d.f25562b = j;
                } else {
                    long j2 = m13288b.f25560j;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - c9759d.f25562b > 0) {
                        c9759d.f25562b = j;
                    }
                }
                long j3 = this.f25560j;
                long j4 = c9759d.f25562b;
                if (j3 - j4 < 0) {
                    this.f25560j = j4;
                }
                c9759d.m13289a(this);
                return 0;
            }
        }

        /* renamed from: f */
        public final boolean m13345f(long j) {
            return j - this.f25560j >= 0;
        }

        @Override // kotlinx.coroutines.internal.InterfaceC9783j0
        public int getIndex() {
            return this.f25561k;
        }

        @Override // kotlinx.coroutines.internal.InterfaceC9783j0
        public void setIndex(int i) {
            this.f25561k = i;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f25560j + ']';
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, m14357d2 = {"Lkotlinx/coroutines/i1$d;", "Lkotlinx/coroutines/internal/i0;", "Lkotlinx/coroutines/i1$c;", "", "b", "J", "timeNow", "<init>", "(J)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.i1$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9759d extends C9781i0<AbstractRunnableC9758c> {

        /* renamed from: b */
        public long f25562b;

        public C9759d(long j) {
            this.f25562b = j;
        }
    }

    /* renamed from: V0 */
    private final void m13359V0() {
        C9768d0 c9768d0;
        C9768d0 c9768d02;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25555o;
                c9768d0 = C9821l1.f25642b;
                if (C0647b.m39437a(atomicReferenceFieldUpdater, this, null, c9768d0)) {
                    return;
                }
            } else if (obj instanceof C9799s) {
                ((C9799s) obj).m13222d();
                return;
            } else {
                c9768d02 = C9821l1.f25642b;
                if (obj == c9768d02) {
                    return;
                }
                C9799s c9799s = new C9799s(8, true);
                c9799s.m13225a((Runnable) obj);
                if (C0647b.m39437a(f25555o, this, obj, c9799s)) {
                    return;
                }
            }
        }
    }

    /* renamed from: W0 */
    private final Runnable m13358W0() {
        C9768d0 c9768d0;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C9799s) {
                C9799s c9799s = (C9799s) obj;
                Object m13216j = c9799s.m13216j();
                if (m13216j != C9799s.f25621h) {
                    return (Runnable) m13216j;
                }
                C0647b.m39437a(f25555o, this, obj, c9799s.m13217i());
            } else {
                c9768d0 = C9821l1.f25642b;
                if (obj == c9768d0) {
                    return null;
                }
                if (C0647b.m39437a(f25555o, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: Y0 */
    private final boolean m13357Y0(Runnable runnable) {
        C9768d0 c9768d0;
        while (true) {
            Object obj = this._queue;
            if (m13348i()) {
                return false;
            }
            if (obj == null) {
                if (C0647b.m39437a(f25555o, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C9799s) {
                C9799s c9799s = (C9799s) obj;
                int m13225a = c9799s.m13225a(runnable);
                if (m13225a == 0) {
                    return true;
                }
                if (m13225a != 1) {
                    if (m13225a == 2) {
                        return false;
                    }
                } else {
                    C0647b.m39437a(f25555o, this, obj, c9799s.m13217i());
                }
            } else {
                c9768d0 = C9821l1.f25642b;
                if (obj == c9768d0) {
                    return false;
                }
                C9799s c9799s2 = new C9799s(8, true);
                c9799s2.m13225a((Runnable) obj);
                c9799s2.m13225a(runnable);
                if (C0647b.m39437a(f25555o, this, obj, c9799s2)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: a1 */
    private final void m13355a1() {
        AbstractRunnableC9758c m13281i;
        C9680c.m13566a();
        long nanoTime = System.nanoTime();
        while (true) {
            C9759d c9759d = (C9759d) this._delayed;
            if (c9759d != null && (m13281i = c9759d.m13281i()) != null) {
                mo13114S0(nanoTime, m13281i);
            } else {
                return;
            }
        }
    }

    /* renamed from: d1 */
    private final int m13352d1(long j, AbstractRunnableC9758c abstractRunnableC9758c) {
        if (m13348i()) {
            return 1;
        }
        C9759d c9759d = (C9759d) this._delayed;
        if (c9759d == null) {
            C0647b.m39437a(f25556p, this, null, new C9759d(j));
            Object obj = this._delayed;
            C9612q.m13920e(obj);
            c9759d = (C9759d) obj;
        }
        return abstractRunnableC9758c.m13346e(j, c9759d, this);
    }

    /* renamed from: f1 */
    private final void m13350f1(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    /* renamed from: g1 */
    private final boolean m13349g1(AbstractRunnableC9758c abstractRunnableC9758c) {
        C9759d c9759d = (C9759d) this._delayed;
        return (c9759d != null ? c9759d.m13285e() : null) == abstractRunnableC9758c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: i */
    public final boolean m13348i() {
        return this._isCompleted;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: B0 */
    public final void mo2769B0(CoroutineContext coroutineContext, Runnable runnable) {
        mo13113X0(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractC9750h1
    /* renamed from: J0 */
    public long mo13362J0() {
        AbstractRunnableC9758c m13285e;
        long m21929d;
        C9768d0 c9768d0;
        if (super.mo13362J0() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C9799s) {
                if (!((C9799s) obj).m13219g()) {
                    return 0L;
                }
            } else {
                c9768d0 = C9821l1.f25642b;
                if (obj != c9768d0) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
        }
        C9759d c9759d = (C9759d) this._delayed;
        if (c9759d == null || (m13285e = c9759d.m13285e()) == null) {
            return Long.MAX_VALUE;
        }
        long j = m13285e.f25560j;
        C9680c.m13566a();
        m21929d = C6759j.m21929d(j - System.nanoTime(), 0L);
        return m21929d;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x004f  */
    @Override // kotlinx.coroutines.AbstractC9750h1
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo13361O0() {
        /*
            r9 = this;
            boolean r0 = r9.m13365P0()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r9._delayed
            kotlinx.coroutines.i1$d r0 = (kotlinx.coroutines.AbstractC9755i1.C9759d) r0
            if (r0 == 0) goto L45
            boolean r3 = r0.m13286d()
            if (r3 != 0) goto L45
            kotlinx.coroutines.C9680c.m13566a()
            long r3 = java.lang.System.nanoTime()
        L1c:
            monitor-enter(r0)
            kotlinx.coroutines.internal.j0 r5 = r0.m13288b()     // Catch: java.lang.Throwable -> L42
            r6 = 0
            if (r5 != 0) goto L26
            monitor-exit(r0)
            goto L3d
        L26:
            kotlinx.coroutines.i1$c r5 = (kotlinx.coroutines.AbstractC9755i1.AbstractRunnableC9758c) r5     // Catch: java.lang.Throwable -> L42
            boolean r7 = r5.m13345f(r3)     // Catch: java.lang.Throwable -> L42
            r8 = 0
            if (r7 == 0) goto L34
            boolean r5 = r9.m13357Y0(r5)     // Catch: java.lang.Throwable -> L42
            goto L35
        L34:
            r5 = r8
        L35:
            if (r5 == 0) goto L3c
            kotlinx.coroutines.internal.j0 r5 = r0.m13282h(r8)     // Catch: java.lang.Throwable -> L42
            r6 = r5
        L3c:
            monitor-exit(r0)
        L3d:
            kotlinx.coroutines.i1$c r6 = (kotlinx.coroutines.AbstractC9755i1.AbstractRunnableC9758c) r6
            if (r6 != 0) goto L1c
            goto L45
        L42:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L45:
            java.lang.Runnable r0 = r9.m13358W0()
            if (r0 == 0) goto L4f
            r0.run()
            return r1
        L4f:
            long r0 = r9.mo13362J0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC9755i1.mo13361O0():long");
    }

    @Override // kotlinx.coroutines.InterfaceC9899u0
    /* renamed from: R */
    public InterfaceC9688d1 mo2760R(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return InterfaceC9899u0.C9900a.m12989a(this, j, runnable, coroutineContext);
    }

    /* renamed from: X0 */
    public void mo13113X0(Runnable runnable) {
        if (m13357Y0(runnable)) {
            m13188T0();
        } else {
            RunnableC9843q0.f25663q.mo13113X0(runnable);
        }
    }

    /* renamed from: Z0 */
    public boolean m13356Z0() {
        C9768d0 c9768d0;
        if (!m13366N0()) {
            return false;
        }
        C9759d c9759d = (C9759d) this._delayed;
        if (c9759d != null && !c9759d.m13286d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C9799s) {
                return ((C9799s) obj).m13219g();
            }
            c9768d0 = C9821l1.f25642b;
            if (obj != c9768d0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b1 */
    public final void m13354b1() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: c1 */
    public final void m13353c1(long j, AbstractRunnableC9758c abstractRunnableC9758c) {
        int m13352d1 = m13352d1(j, abstractRunnableC9758c);
        if (m13352d1 != 0) {
            if (m13352d1 != 1) {
                if (m13352d1 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
            mo13114S0(j, abstractRunnableC9758c);
        } else if (m13349g1(abstractRunnableC9758c)) {
            m13188T0();
        }
    }

    /* renamed from: e1 */
    public final InterfaceC9688d1 m13351e1(long j, Runnable runnable) {
        long m13175c = C9821l1.m13175c(j);
        if (m13175c < 4611686018427387903L) {
            C9680c.m13566a();
            long nanoTime = System.nanoTime();
            C9757b c9757b = new C9757b(m13175c + nanoTime, runnable);
            m13353c1(nanoTime, c9757b);
            return c9757b;
        }
        return C9817k2.f25638j;
    }

    @Override // kotlinx.coroutines.AbstractC9750h1
    public void shutdown() {
        C9906v2.f25766a.m12979c();
        m13350f1(true);
        m13359V0();
        do {
        } while (mo13361O0() <= 0);
        m13355a1();
    }

    @Override // kotlinx.coroutines.InterfaceC9899u0
    /* renamed from: v */
    public void mo2761v(long j, CancellableContinuation<? super Unit> cancellableContinuation) {
        long m13175c = C9821l1.m13175c(j);
        if (m13175c < 4611686018427387903L) {
            C9680c.m13566a();
            long nanoTime = System.nanoTime();
            C9756a c9756a = new C9756a(m13175c + nanoTime, cancellableContinuation);
            m13353c1(nanoTime, c9756a);
            C9846r.m13106a(cancellableContinuation, c9756a);
        }
    }
}