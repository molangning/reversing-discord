package kotlinx.coroutines.scheduling;

import androidx.concurrent.futures.C0647b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0011J!\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010%\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006*"}, m14357d2 = {"Lkotlinx/coroutines/scheduling/o;", "", "Lkotlinx/coroutines/scheduling/h;", "task", "c", "(Lkotlinx/coroutines/scheduling/h;)Lkotlinx/coroutines/scheduling/h;", "victim", "", "blockingOnly", "", "m", "(Lkotlinx/coroutines/scheduling/o;Z)J", "Lkotlinx/coroutines/scheduling/d;", "queue", "j", "(Lkotlinx/coroutines/scheduling/d;)Z", "i", "()Lkotlinx/coroutines/scheduling/h;", "", "d", "(Lkotlinx/coroutines/scheduling/h;)V", "h", "fair", "a", "(Lkotlinx/coroutines/scheduling/h;Z)Lkotlinx/coroutines/scheduling/h;", "l", "(Lkotlinx/coroutines/scheduling/o;)J", "k", "globalQueue", "g", "(Lkotlinx/coroutines/scheduling/d;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "", "e", "()I", "bufferSize", "f", "size", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.scheduling.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9872o {

    /* renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f25720b = AtomicReferenceFieldUpdater.newUpdater(C9872o.class, Object.class, "lastScheduledTask");

    /* renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f25721c = AtomicIntegerFieldUpdater.newUpdater(C9872o.class, "producerIndex");

    /* renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f25722d = AtomicIntegerFieldUpdater.newUpdater(C9872o.class, "consumerIndex");

    /* renamed from: e */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f25723e = AtomicIntegerFieldUpdater.newUpdater(C9872o.class, "blockingTasksInBuffer");

    /* renamed from: a */
    private final AtomicReferenceArray<AbstractRunnableC9865h> f25724a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    /* renamed from: b */
    public static /* synthetic */ AbstractRunnableC9865h m13048b(C9872o c9872o, AbstractRunnableC9865h abstractRunnableC9865h, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c9872o.m13049a(abstractRunnableC9865h, z);
    }

    /* renamed from: c */
    private final AbstractRunnableC9865h m13047c(AbstractRunnableC9865h abstractRunnableC9865h) {
        boolean z = true;
        if (abstractRunnableC9865h.f25709k.mo13052b() != 1) {
            z = false;
        }
        if (z) {
            f25723e.incrementAndGet(this);
        }
        if (m13045e() == 127) {
            return abstractRunnableC9865h;
        }
        int i = this.producerIndex & 127;
        while (this.f25724a.get(i) != null) {
            Thread.yield();
        }
        this.f25724a.lazySet(i, abstractRunnableC9865h);
        f25721c.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    private final void m13046d(AbstractRunnableC9865h abstractRunnableC9865h) {
        if (abstractRunnableC9865h != null) {
            boolean z = true;
            if (abstractRunnableC9865h.f25709k.mo13052b() != 1) {
                z = false;
            }
            if (z) {
                f25723e.decrementAndGet(this);
            }
        }
    }

    /* renamed from: i */
    private final AbstractRunnableC9865h m13041i() {
        AbstractRunnableC9865h andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f25722d.compareAndSet(this, i, i + 1) && (andSet = this.f25724a.getAndSet(i2, null)) != null) {
                m13046d(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    private final boolean m13040j(C9861d c9861d) {
        AbstractRunnableC9865h m13041i = m13041i();
        if (m13041i == null) {
            return false;
        }
        c9861d.m13229a(m13041i);
        return true;
    }

    /* renamed from: m */
    private final long m13037m(C9872o c9872o, boolean z) {
        AbstractRunnableC9865h abstractRunnableC9865h;
        do {
            abstractRunnableC9865h = (AbstractRunnableC9865h) c9872o.lastScheduledTask;
            if (abstractRunnableC9865h == null) {
                return -2L;
            }
            if (z) {
                boolean z2 = true;
                if (abstractRunnableC9865h.f25709k.mo13052b() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2L;
                }
            }
            long mo13054a = C9869l.f25716e.mo13054a() - abstractRunnableC9865h.f25708j;
            long j = C9869l.f25712a;
            if (mo13054a < j) {
                return j - mo13054a;
            }
        } while (!C0647b.m39437a(f25720b, c9872o, abstractRunnableC9865h, null));
        m13048b(this, abstractRunnableC9865h, false, 2, null);
        return -1L;
    }

    /* renamed from: a */
    public final AbstractRunnableC9865h m13049a(AbstractRunnableC9865h abstractRunnableC9865h, boolean z) {
        if (z) {
            return m13047c(abstractRunnableC9865h);
        }
        AbstractRunnableC9865h abstractRunnableC9865h2 = (AbstractRunnableC9865h) f25720b.getAndSet(this, abstractRunnableC9865h);
        if (abstractRunnableC9865h2 == null) {
            return null;
        }
        return m13047c(abstractRunnableC9865h2);
    }

    /* renamed from: e */
    public final int m13045e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: f */
    public final int m13044f() {
        return this.lastScheduledTask != null ? m13045e() + 1 : m13045e();
    }

    /* renamed from: g */
    public final void m13043g(C9861d c9861d) {
        AbstractRunnableC9865h abstractRunnableC9865h = (AbstractRunnableC9865h) f25720b.getAndSet(this, null);
        if (abstractRunnableC9865h != null) {
            c9861d.m13229a(abstractRunnableC9865h);
        }
        do {
        } while (m13040j(c9861d));
    }

    /* renamed from: h */
    public final AbstractRunnableC9865h m13042h() {
        AbstractRunnableC9865h abstractRunnableC9865h = (AbstractRunnableC9865h) f25720b.getAndSet(this, null);
        return abstractRunnableC9865h == null ? m13041i() : abstractRunnableC9865h;
    }

    /* renamed from: k */
    public final long m13039k(C9872o c9872o) {
        int i = c9872o.consumerIndex;
        int i2 = c9872o.producerIndex;
        AtomicReferenceArray<AbstractRunnableC9865h> atomicReferenceArray = c9872o.f25724a;
        while (true) {
            boolean z = true;
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (c9872o.blockingTasksInBuffer == 0) {
                break;
            }
            AbstractRunnableC9865h abstractRunnableC9865h = atomicReferenceArray.get(i3);
            if (abstractRunnableC9865h != null) {
                if (abstractRunnableC9865h.f25709k.mo13052b() != 1) {
                    z = false;
                }
                if (z && C9871n.m13050a(atomicReferenceArray, i3, abstractRunnableC9865h, null)) {
                    f25723e.decrementAndGet(c9872o);
                    m13048b(this, abstractRunnableC9865h, false, 2, null);
                    return -1L;
                }
            }
            i++;
        }
        return m13037m(c9872o, true);
    }

    /* renamed from: l */
    public final long m13038l(C9872o c9872o) {
        AbstractRunnableC9865h m13041i = c9872o.m13041i();
        if (m13041i != null) {
            m13048b(this, m13041i, false, 2, null);
            return -1L;
        }
        return m13037m(c9872o, false);
    }
}
