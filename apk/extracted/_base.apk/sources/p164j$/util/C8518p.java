package p164j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p164j$.util.function.C8479l;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8518p implements PrimitiveIterator.OfDouble {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8519q f22637a;

    private /* synthetic */ C8518p(InterfaceC8519q interfaceC8519q) {
        this.f22637a = interfaceC8519q;
    }

    /* renamed from: a */
    public static /* synthetic */ PrimitiveIterator.OfDouble m17595a(InterfaceC8519q interfaceC8519q) {
        if (interfaceC8519q == null) {
            return null;
        }
        return interfaceC8519q instanceof C8517o ? ((C8517o) interfaceC8519q).f22636a : new C8518p(interfaceC8519q);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8519q interfaceC8519q = this.f22637a;
        if (obj instanceof C8518p) {
            obj = ((C8518p) obj).f22637a;
        }
        return interfaceC8519q.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f22637a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f22637a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f22637a.mo17594d(C8479l.m17660a(doubleConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f22637a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f22637a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f22637a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f22637a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return this.f22637a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f22637a.remove();
    }
}
