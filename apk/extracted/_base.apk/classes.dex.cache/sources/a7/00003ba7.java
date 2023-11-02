package p164j$.util;

import java.util.PrimitiveIterator;
import p164j$.util.function.C8435J;
import p164j$.util.function.C8469g;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8521s implements InterfaceC8764u, Iterator {

    /* renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfInt f22639a;

    private /* synthetic */ C8521s(PrimitiveIterator.OfInt ofInt) {
        this.f22639a = ofInt;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8764u m17593a(PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C8763t ? ((C8763t) ofInt).f23003a : new C8521s(ofInt);
    }

    @Override // p164j$.util.InterfaceC8764u
    /* renamed from: c */
    public final /* synthetic */ void mo17294c(InterfaceC8437K interfaceC8437K) {
        this.f22639a.forEachRemaining(C8435J.m17704a(interfaceC8437K));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8521s) {
            obj = ((C8521s) obj).f22639a;
        }
        return this.f22639a.equals(obj);
    }

    @Override // p164j$.util.InterfaceC8764u, p164j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f22639a.forEachRemaining(C8469g.m17671a(consumer));
    }

    @Override // p164j$.util.InterfaceC8769z
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f22639a.forEachRemaining((PrimitiveIterator.OfInt) obj);
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f22639a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f22639a.hashCode();
    }

    @Override // p164j$.util.InterfaceC8764u, java.util.Iterator, p164j$.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f22639a.next();
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f22639a.next();
    }

    @Override // p164j$.util.InterfaceC8764u
    public final /* synthetic */ int nextInt() {
        return this.f22639a.nextInt();
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final /* synthetic */ void remove() {
        this.f22639a.remove();
    }
}