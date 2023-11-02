package p164j$.util;

import java.util.PrimitiveIterator;
import p164j$.util.function.C8469g;
import p164j$.util.function.C8481m;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8517o implements InterfaceC8519q, Iterator {

    /* renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfDouble f22636a;

    private /* synthetic */ C8517o(PrimitiveIterator.OfDouble ofDouble) {
        this.f22636a = ofDouble;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8519q m17596a(PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C8518p ? ((C8518p) ofDouble).f22637a : new C8517o(ofDouble);
    }

    @Override // p164j$.util.InterfaceC8519q
    /* renamed from: d */
    public final /* synthetic */ void mo17594d(InterfaceC8483n interfaceC8483n) {
        this.f22636a.forEachRemaining(C8481m.m17659a(interfaceC8483n));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8517o) {
            obj = ((C8517o) obj).f22636a;
        }
        return this.f22636a.equals(obj);
    }

    @Override // p164j$.util.InterfaceC8519q, p164j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f22636a.forEachRemaining(C8469g.m17671a(consumer));
    }

    @Override // p164j$.util.InterfaceC8769z
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f22636a.forEachRemaining((PrimitiveIterator.OfDouble) obj);
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f22636a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f22636a.hashCode();
    }

    @Override // p164j$.util.InterfaceC8519q, java.util.Iterator, p164j$.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f22636a.next();
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f22636a.next();
    }

    @Override // p164j$.util.InterfaceC8519q
    public final /* synthetic */ double nextDouble() {
        return this.f22636a.nextDouble();
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final /* synthetic */ void remove() {
        this.f22636a.remove();
    }
}