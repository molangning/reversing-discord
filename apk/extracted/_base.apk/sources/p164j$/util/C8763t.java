package p164j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p164j$.util.function.C8433I;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8763t implements PrimitiveIterator.OfInt {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8764u f23003a;

    private /* synthetic */ C8763t(InterfaceC8764u interfaceC8764u) {
        this.f23003a = interfaceC8764u;
    }

    /* renamed from: a */
    public static /* synthetic */ PrimitiveIterator.OfInt m17295a(InterfaceC8764u interfaceC8764u) {
        if (interfaceC8764u == null) {
            return null;
        }
        return interfaceC8764u instanceof C8521s ? ((C8521s) interfaceC8764u).f22639a : new C8763t(interfaceC8764u);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8764u interfaceC8764u = this.f23003a;
        if (obj instanceof C8763t) {
            obj = ((C8763t) obj).f23003a;
        }
        return interfaceC8764u.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f23003a.forEachRemaining(intConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f23003a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.f23003a.mo17294c(C8433I.m17706a(intConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f23003a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f23003a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f23003a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f23003a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return this.f23003a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f23003a.remove();
    }
}
