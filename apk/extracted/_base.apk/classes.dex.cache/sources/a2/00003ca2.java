package p164j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p164j$.util.function.C8464d0;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8767x implements PrimitiveIterator.OfLong {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8768y f23006a;

    private /* synthetic */ C8767x(InterfaceC8768y interfaceC8768y) {
        this.f23006a = interfaceC8768y;
    }

    /* renamed from: a */
    public static /* synthetic */ PrimitiveIterator.OfLong m17291a(InterfaceC8768y interfaceC8768y) {
        if (interfaceC8768y == null) {
            return null;
        }
        return interfaceC8768y instanceof C8766w ? ((C8766w) interfaceC8768y).f23005a : new C8767x(interfaceC8768y);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8768y interfaceC8768y = this.f23006a;
        if (obj instanceof C8767x) {
            obj = ((C8767x) obj).f23006a;
        }
        return interfaceC8768y.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f23006a.forEachRemaining(longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f23006a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.f23006a.mo17290b(C8464d0.m17674a(longConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f23006a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f23006a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f23006a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f23006a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return this.f23006a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f23006a.remove();
    }
}