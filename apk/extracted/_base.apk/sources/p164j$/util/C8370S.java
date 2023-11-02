package p164j$.util;

import java.util.NoSuchElementException;
import p164j$.util.function.C8477k;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.S */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8370S implements InterfaceC8519q, InterfaceC8483n, Iterator {

    /* renamed from: a */
    boolean f22434a = false;

    /* renamed from: b */
    double f22435b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC8356D f22436c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8370S(InterfaceC8356D interfaceC8356D) {
        this.f22436c = interfaceC8356D;
    }

    @Override // p164j$.util.function.InterfaceC8483n
    public final void accept(double d) {
        this.f22434a = true;
        this.f22435b = d;
    }

    @Override // p164j$.util.InterfaceC8769z
    /* renamed from: d */
    public final void forEachRemaining(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
        while (hasNext()) {
            interfaceC8483n.accept(nextDouble());
        }
    }

    @Override // p164j$.util.InterfaceC8519q, p164j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof InterfaceC8483n) {
            forEachRemaining((InterfaceC8483n) consumer);
            return;
        }
        consumer.getClass();
        if (AbstractC8415e0.f22538a) {
            AbstractC8415e0.m17720a(C8370S.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        } else {
            forEachRemaining(new C8515m(consumer));
        }
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final boolean hasNext() {
        if (!this.f22434a) {
            this.f22436c.mo17466p(this);
        }
        return this.f22434a;
    }

    @Override // p164j$.util.function.InterfaceC8483n
    /* renamed from: n */
    public final InterfaceC8483n mo17299n(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
        return new C8477k(this, interfaceC8483n);
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final Double next() {
        if (AbstractC8415e0.f22538a) {
            AbstractC8415e0.m17720a(C8370S.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // p164j$.util.InterfaceC8519q
    public final double nextDouble() {
        if (this.f22434a || hasNext()) {
            this.f22434a = false;
            return this.f22435b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
