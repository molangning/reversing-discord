package p164j$.util.stream;

import java.util.concurrent.atomic.AtomicReference;
import p164j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8648d extends AbstractC8658f {

    /* renamed from: h */
    protected final AtomicReference f22837h;

    /* renamed from: i */
    protected volatile boolean f22838i;

    public AbstractC8648d(AbstractC8648d abstractC8648d, Spliterator spliterator) {
        super(abstractC8648d, spliterator);
        this.f22837h = abstractC8648d.f22837h;
    }

    public AbstractC8648d(AbstractC8744w0 abstractC8744w0, Spliterator spliterator) {
        super(abstractC8744w0, spliterator);
        this.f22837h = new AtomicReference(null);
    }

    @Override // p164j$.util.stream.AbstractC8658f
    /* renamed from: b */
    public final Object mo17473b() {
        if (m17472c() == null) {
            Object obj = this.f22837h.get();
            return obj == null ? mo17382i() : obj;
        }
        return super.mo17473b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x006b, code lost:
        r8 = r7.mo17384a();
     */
    @Override // p164j$.util.stream.AbstractC8658f, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void compute() {
        /*
            r10 = this;
            j$.util.Spliterator r0 = r10.f22853b
            long r1 = r0.estimateSize()
            long r3 = r10.f22854c
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto Lf
            goto L15
        Lf:
            long r3 = p164j$.util.stream.AbstractC8658f.m17470f(r1)
            r10.f22854c = r3
        L15:
            java.util.concurrent.atomic.AtomicReference r5 = r10.f22837h
            r6 = 0
            r7 = r10
        L19:
            java.lang.Object r8 = r5.get()
            if (r8 != 0) goto L6f
            boolean r8 = r7.f22838i
            if (r8 != 0) goto L34
            j$.util.stream.f r9 = r7.m17472c()
        L27:
            j$.util.stream.d r9 = (p164j$.util.stream.AbstractC8648d) r9
            if (r8 != 0) goto L34
            if (r9 == 0) goto L34
            boolean r8 = r9.f22838i
            j$.util.stream.f r9 = r9.m17472c()
            goto L27
        L34:
            if (r8 == 0) goto L3b
            java.lang.Object r8 = r7.mo17382i()
            goto L6f
        L3b:
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L6b
            j$.util.Spliterator r1 = r0.trySplit()
            if (r1 != 0) goto L46
            goto L6b
        L46:
            j$.util.stream.f r2 = r7.mo17383d(r1)
            j$.util.stream.d r2 = (p164j$.util.stream.AbstractC8648d) r2
            r7.f22855d = r2
            j$.util.stream.f r8 = r7.mo17383d(r0)
            j$.util.stream.d r8 = (p164j$.util.stream.AbstractC8648d) r8
            r7.f22856e = r8
            r9 = 1
            r7.setPendingCount(r9)
            if (r6 == 0) goto L60
            r0 = r1
            r7 = r2
            r2 = r8
            goto L61
        L60:
            r7 = r8
        L61:
            r6 = r6 ^ 1
            r2.fork()
            long r1 = r0.estimateSize()
            goto L19
        L6b:
            java.lang.Object r8 = r7.mo17384a()
        L6f:
            r7.mo17471e(r8)
            r7.tryComplete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p164j$.util.stream.AbstractC8648d.compute():void");
    }

    @Override // p164j$.util.stream.AbstractC8658f
    /* renamed from: e */
    public final void mo17471e(Object obj) {
        if (!(m17472c() == null)) {
            super.mo17471e(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.f22837h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    /* renamed from: g */
    protected void mo17403g() {
        this.f22838i = true;
    }

    @Override // p164j$.util.stream.AbstractC8658f, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return mo17473b();
    }

    /* renamed from: h */
    public final void m17494h() {
        AbstractC8648d abstractC8648d = this;
        for (AbstractC8648d abstractC8648d2 = (AbstractC8648d) m17472c(); abstractC8648d2 != null; abstractC8648d2 = (AbstractC8648d) abstractC8648d2.m17472c()) {
            if (abstractC8648d2.f22855d == abstractC8648d) {
                AbstractC8648d abstractC8648d3 = (AbstractC8648d) abstractC8648d2.f22856e;
                if (!abstractC8648d3.f22838i) {
                    abstractC8648d3.mo17403g();
                }
            }
            abstractC8648d = abstractC8648d2;
        }
    }

    /* renamed from: i */
    protected abstract Object mo17382i();
}