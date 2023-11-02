package p164j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p164j$.util.Spliterator;
import p164j$.util.concurrent.C8406u;
import p164j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.r1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8720r1 extends CountedCompleter implements InterfaceC8671h2 {

    /* renamed from: a */
    protected final Spliterator f22926a;

    /* renamed from: b */
    protected final AbstractC8744w0 f22927b;

    /* renamed from: c */
    protected final long f22928c;

    /* renamed from: d */
    protected long f22929d;

    /* renamed from: e */
    protected long f22930e;

    /* renamed from: f */
    protected int f22931f;

    /* renamed from: g */
    protected int f22932g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8720r1(int i, Spliterator spliterator, AbstractC8744w0 abstractC8744w0) {
        this.f22926a = spliterator;
        this.f22927b = abstractC8744w0;
        this.f22928c = AbstractC8658f.m17470f(spliterator.estimateSize());
        this.f22929d = 0L;
        this.f22930e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8720r1(AbstractC8720r1 abstractC8720r1, Spliterator spliterator, long j, long j2, int i) {
        super(abstractC8720r1);
        this.f22926a = spliterator;
        this.f22927b = abstractC8720r1.f22927b;
        this.f22928c = abstractC8720r1.f22928c;
        this.f22929d = j;
        this.f22930e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    /* renamed from: a */
    abstract AbstractC8720r1 mo17404a(Spliterator spliterator, long j, long j2);

    public /* synthetic */ void accept(double d) {
        AbstractC8744w0.m17335p0();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC8744w0.m17322w0();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC8744w0.m17320x0();
        throw null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f22926a;
        AbstractC8720r1 abstractC8720r1 = this;
        while (spliterator.estimateSize() > abstractC8720r1.f22928c && (trySplit = spliterator.trySplit()) != null) {
            abstractC8720r1.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            abstractC8720r1.mo17404a(trySplit, abstractC8720r1.f22929d, estimateSize).fork();
            abstractC8720r1 = abstractC8720r1.mo17404a(spliterator, abstractC8720r1.f22929d + estimateSize, abstractC8720r1.f22930e - estimateSize);
        }
        abstractC8720r1.f22927b.mo17321w1(spliterator, abstractC8720r1);
        abstractC8720r1.propagateCompletion();
    }

    @Override // p164j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo17303e(Consumer consumer) {
        consumer.getClass();
        return new C8406u(3, this, consumer);
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final /* synthetic */ void end() {
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        long j2 = this.f22930e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.f22929d;
        this.f22931f = i;
        this.f22932g = i + ((int) j2);
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo17301i() {
        return false;
    }
}
