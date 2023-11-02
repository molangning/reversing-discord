package p164j$.util.concurrent;

import java.util.Iterator;
import p164j$.util.AbstractC8516n;
import p164j$.util.Collection;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;
import p164j$.util.function.Predicate;
import p164j$.util.stream.AbstractC8744w0;
import p164j$.util.stream.Stream;

/* renamed from: j$.util.concurrent.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8405t extends AbstractC8388c implements Collection {
    public C8405t(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    @Override // java.util.Collection, p164j$.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, p164j$.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p164j$.util.concurrent.AbstractC8388c, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f22487a.containsValue(obj);
    }

    @Override // p164j$.util.Collection
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        C8398m[] c8398mArr = this.f22487a.table;
        if (c8398mArr == null) {
            return;
        }
        C8402q c8402q = new C8402q(c8398mArr, c8398mArr.length, 0, c8398mArr.length);
        while (true) {
            C8398m m17738e = c8402q.m17738e();
            if (m17738e == null) {
                return;
            }
            consumer.accept(m17738e.f22499c);
        }
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // p164j$.util.concurrent.AbstractC8388c, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f22487a;
        C8398m[] c8398mArr = concurrentHashMap.table;
        int length = c8398mArr == null ? 0 : c8398mArr.length;
        return new C8394i(c8398mArr, length, length, concurrentHashMap, 1);
    }

    @Override // java.util.Collection, p164j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        Stream m17323v1;
        m17323v1 = AbstractC8744w0.m17323v1(AbstractC8516n.m17598s(this), true);
        return m17323v1;
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        Stream m17323v1;
        m17323v1 = AbstractC8744w0.m17323v1(AbstractC8516n.m17598s(this), true);
        return Stream.Wrapper.convert(m17323v1);
    }

    @Override // java.util.Collection, p164j$.util.Collection
    public final boolean remove(Object obj) {
        AbstractC8387b abstractC8387b;
        if (obj != null) {
            Iterator it = iterator();
            do {
                abstractC8387b = (AbstractC8387b) it;
                if (!abstractC8387b.hasNext()) {
                    return false;
                }
            } while (!obj.equals(((C8394i) it).next()));
            abstractC8387b.remove();
            return true;
        }
        return false;
    }

    @Override // p164j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return Collection.CC.$default$removeIf(this, Predicate.VivifiedWrapper.convert(predicate));
    }

    @Override // java.util.Collection, java.lang.Iterable, p164j$.util.Collection
    public final Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f22487a;
        long sumCount = concurrentHashMap.sumCount();
        C8398m[] c8398mArr = concurrentHashMap.table;
        int length = c8398mArr == null ? 0 : c8398mArr.length;
        return new C8396k(c8398mArr, length, 0, length, sumCount >= 0 ? sumCount : 0L, 1);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, p164j$.util.Collection
    public final /* synthetic */ Stream stream() {
        Stream m17323v1;
        m17323v1 = AbstractC8744w0.m17323v1(AbstractC8516n.m17598s(this), false);
        return m17323v1;
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        Stream m17323v1;
        m17323v1 = AbstractC8744w0.m17323v1(AbstractC8516n.m17598s(this), false);
        return Stream.Wrapper.convert(m17323v1);
    }

    @Override // p164j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) IntFunction.VivifiedWrapper.convert(intFunction).apply(0));
        return array;
    }
}