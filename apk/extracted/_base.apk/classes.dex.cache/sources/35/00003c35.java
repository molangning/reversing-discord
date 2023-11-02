package p164j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;
import p164j$.util.Spliterator;

/* renamed from: j$.util.stream.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8658f extends CountedCompleter {

    /* renamed from: g */
    static final int f22851g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: a */
    protected final AbstractC8744w0 f22852a;

    /* renamed from: b */
    protected Spliterator f22853b;

    /* renamed from: c */
    protected long f22854c;

    /* renamed from: d */
    protected AbstractC8658f f22855d;

    /* renamed from: e */
    protected AbstractC8658f f22856e;

    /* renamed from: f */
    private Object f22857f;

    public AbstractC8658f(AbstractC8658f abstractC8658f, Spliterator spliterator) {
        super(abstractC8658f);
        this.f22853b = spliterator;
        this.f22852a = abstractC8658f.f22852a;
        this.f22854c = abstractC8658f.f22854c;
    }

    public AbstractC8658f(AbstractC8744w0 abstractC8744w0, Spliterator spliterator) {
        super(null);
        this.f22852a = abstractC8744w0;
        this.f22853b = spliterator;
        this.f22854c = 0L;
    }

    /* renamed from: f */
    public static long m17470f(long j) {
        long j2 = j / f22851g;
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    /* renamed from: a */
    public abstract Object mo17384a();

    /* renamed from: b */
    public Object mo17473b() {
        return this.f22857f;
    }

    /* renamed from: c */
    public final AbstractC8658f m17472c() {
        return (AbstractC8658f) getCompleter();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f22853b;
        long estimateSize = spliterator.estimateSize();
        long j = this.f22854c;
        if (j == 0) {
            j = m17470f(estimateSize);
            this.f22854c = j;
        }
        boolean z = false;
        AbstractC8658f abstractC8658f = this;
        while (estimateSize > j && (trySplit = spliterator.trySplit()) != null) {
            AbstractC8658f mo17383d = abstractC8658f.mo17383d(trySplit);
            abstractC8658f.f22855d = mo17383d;
            AbstractC8658f mo17383d2 = abstractC8658f.mo17383d(spliterator);
            abstractC8658f.f22856e = mo17383d2;
            abstractC8658f.setPendingCount(1);
            if (z) {
                spliterator = trySplit;
                abstractC8658f = mo17383d;
                mo17383d = mo17383d2;
            } else {
                abstractC8658f = mo17383d2;
            }
            z = !z;
            mo17383d.fork();
            estimateSize = spliterator.estimateSize();
        }
        abstractC8658f.mo17471e(abstractC8658f.mo17384a());
        abstractC8658f.tryComplete();
    }

    /* renamed from: d */
    public abstract AbstractC8658f mo17383d(Spliterator spliterator);

    /* renamed from: e */
    public void mo17471e(Object obj) {
        this.f22857f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f22857f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f22853b = null;
        this.f22856e = null;
        this.f22855d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}