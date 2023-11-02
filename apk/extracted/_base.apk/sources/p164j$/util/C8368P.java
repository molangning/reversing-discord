package p164j$.util;

import java.util.NoSuchElementException;
import p164j$.util.function.C8431H;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.P */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8368P implements InterfaceC8764u, InterfaceC8437K, Iterator {

    /* renamed from: a */
    boolean f22428a = false;

    /* renamed from: b */
    int f22429b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC8359G f22430c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8368P(InterfaceC8359G interfaceC8359G) {
        this.f22430c = interfaceC8359G;
    }

    @Override // p164j$.util.function.InterfaceC8437K
    public final void accept(int i) {
        this.f22428a = true;
        this.f22429b = i;
    }

    @Override // p164j$.util.InterfaceC8769z
    /* renamed from: c */
    public final void forEachRemaining(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        while (hasNext()) {
            interfaceC8437K.accept(nextInt());
        }
    }

    @Override // p164j$.util.InterfaceC8764u, p164j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof InterfaceC8437K) {
            forEachRemaining((InterfaceC8437K) consumer);
            return;
        }
        consumer.getClass();
        if (AbstractC8415e0.f22538a) {
            AbstractC8415e0.m17720a(C8368P.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        } else {
            forEachRemaining(new C8520r(consumer));
        }
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final boolean hasNext() {
        if (!this.f22428a) {
            this.f22430c.mo17457k(this);
        }
        return this.f22428a;
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final Integer next() {
        if (AbstractC8415e0.f22538a) {
            AbstractC8415e0.m17720a(C8368P.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(nextInt());
    }

    @Override // p164j$.util.InterfaceC8764u
    public final int nextInt() {
        if (this.f22428a || hasNext()) {
            this.f22428a = false;
            return this.f22429b;
        }
        throw new NoSuchElementException();
    }

    @Override // p164j$.util.function.InterfaceC8437K
    /* renamed from: o */
    public final InterfaceC8437K mo17379o(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        return new C8431H(this, interfaceC8437K);
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
