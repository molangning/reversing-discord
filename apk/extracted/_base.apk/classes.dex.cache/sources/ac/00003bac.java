package p164j$.util.stream;

import java.util.concurrent.atomic.AtomicLong;
import p164j$.util.InterfaceC8356D;
import p164j$.util.InterfaceC8359G;
import p164j$.util.InterfaceC8362J;
import p164j$.util.InterfaceC8365M;
import p164j$.util.Spliterator;

/* renamed from: j$.util.stream.A3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
abstract class AbstractC8526A3 {

    /* renamed from: a */
    protected final Spliterator f22642a;

    /* renamed from: b */
    protected final boolean f22643b;

    /* renamed from: c */
    private final long f22644c;

    /* renamed from: d */
    private final AtomicLong f22645d;

    public AbstractC8526A3(Spliterator spliterator, long j, long j2) {
        this.f22642a = spliterator;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        this.f22643b = i < 0;
        this.f22644c = i >= 0 ? j2 : 0L;
        this.f22645d = new AtomicLong(i >= 0 ? j + j2 : j);
    }

    public AbstractC8526A3(Spliterator spliterator, AbstractC8526A3 abstractC8526A3) {
        this.f22642a = spliterator;
        this.f22643b = abstractC8526A3.f22643b;
        this.f22645d = abstractC8526A3.f22645d;
        this.f22644c = abstractC8526A3.f22644c;
    }

    public final int characteristics() {
        return this.f22642a.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.f22642a.estimateSize();
    }

    /* renamed from: r */
    public final long m17592r(long j) {
        AtomicLong atomicLong;
        long j2;
        boolean z;
        long min;
        do {
            atomicLong = this.f22645d;
            j2 = atomicLong.get();
            int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            z = this.f22643b;
            if (i != 0) {
                min = Math.min(j2, j);
                if (min <= 0) {
                    break;
                }
            } else if (z) {
                return j;
            } else {
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j2 - min));
        if (z) {
            return Math.max(j - min, 0L);
        }
        long j3 = this.f22644c;
        return j2 > j3 ? Math.max(min - (j2 - j3), 0L) : min;
    }

    /* renamed from: s */
    protected abstract Spliterator mo17304s(Spliterator spliterator);

    /* renamed from: t */
    public final EnumC8762z3 m17591t() {
        return this.f22645d.get() > 0 ? EnumC8762z3.MAYBE_MORE : this.f22643b ? EnumC8762z3.UNLIMITED : EnumC8762z3.NO_MORE;
    }

    public /* bridge */ /* synthetic */ InterfaceC8356D trySplit() {
        return (InterfaceC8356D) m42133trySplit();
    }

    /* renamed from: trySplit */
    public /* bridge */ /* synthetic */ InterfaceC8359G m42130trySplit() {
        return (InterfaceC8359G) m42133trySplit();
    }

    /* renamed from: trySplit */
    public /* bridge */ /* synthetic */ InterfaceC8362J m42131trySplit() {
        return (InterfaceC8362J) m42133trySplit();
    }

    /* renamed from: trySplit */
    public /* bridge */ /* synthetic */ InterfaceC8365M m42132trySplit() {
        return (InterfaceC8365M) m42133trySplit();
    }

    /* renamed from: trySplit */
    public final Spliterator m42133trySplit() {
        Spliterator trySplit;
        if (this.f22645d.get() == 0 || (trySplit = this.f22642a.trySplit()) == null) {
            return null;
        }
        return mo17304s(trySplit);
    }
}