package p164j$.util.stream;

import java.util.Comparator;
import p164j$.util.AbstractC8516n;
import p164j$.util.Spliterator;
import p164j$.util.concurrent.C8406u;
import p164j$.util.concurrent.ConcurrentHashMap;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.stream.e3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8657e3 implements Spliterator, Consumer {

    /* renamed from: d */
    private static final Object f22847d = new Object();

    /* renamed from: a */
    private final Spliterator f22848a;

    /* renamed from: b */
    private final ConcurrentHashMap f22849b;

    /* renamed from: c */
    private Object f22850c;

    public C8657e3(Spliterator spliterator) {
        this(spliterator, new ConcurrentHashMap());
    }

    private C8657e3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f22848a = spliterator;
        this.f22849b = concurrentHashMap;
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final boolean mo17305a(Consumer consumer) {
        while (this.f22848a.mo17305a(this)) {
            Object obj = this.f22850c;
            if (obj == null) {
                obj = f22847d;
            }
            if (this.f22849b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.f22850c);
                this.f22850c = null;
                return true;
            }
        }
        return false;
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f22850c = obj;
    }

    @Override // p164j$.util.Spliterator
    public final int characteristics() {
        return (this.f22848a.characteristics() & (-16469)) | 1;
    }

    @Override // p164j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo17303e(Consumer consumer) {
        consumer.getClass();
        return new C8406u(3, this, consumer);
    }

    @Override // p164j$.util.Spliterator
    public final long estimateSize() {
        return this.f22848a.estimateSize();
    }

    @Override // p164j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f22848a.forEachRemaining(new C8703o(6, this, consumer));
    }

    @Override // p164j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f22848a.getComparator();
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC8516n.m17606i(this);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC8516n.m17605j(this, i);
    }

    /* renamed from: j */
    public final void m17474j(Consumer consumer, Object obj) {
        if (this.f22849b.putIfAbsent(obj != null ? obj : f22847d, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    @Override // p164j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator trySplit = this.f22848a.trySplit();
        if (trySplit != null) {
            return new C8657e3(trySplit, this.f22849b);
        }
        return null;
    }
}