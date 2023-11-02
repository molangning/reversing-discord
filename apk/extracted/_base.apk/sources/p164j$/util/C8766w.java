package p164j$.util;

import java.util.PrimitiveIterator;
import p164j$.util.function.C8466e0;
import p164j$.util.function.C8469g;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8468f0;

/* renamed from: j$.util.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8766w implements InterfaceC8768y, Iterator {

    /* renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfLong f23005a;

    private /* synthetic */ C8766w(PrimitiveIterator.OfLong ofLong) {
        this.f23005a = ofLong;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8768y m17292a(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C8767x ? ((C8767x) ofLong).f23006a : new C8766w(ofLong);
    }

    @Override // p164j$.util.InterfaceC8768y
    /* renamed from: b */
    public final /* synthetic */ void mo17290b(InterfaceC8468f0 interfaceC8468f0) {
        this.f23005a.forEachRemaining(C8466e0.m17672a(interfaceC8468f0));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8766w) {
            obj = ((C8766w) obj).f23005a;
        }
        return this.f23005a.equals(obj);
    }

    @Override // p164j$.util.InterfaceC8768y, p164j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f23005a.forEachRemaining(C8469g.m17671a(consumer));
    }

    @Override // p164j$.util.InterfaceC8769z
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f23005a.forEachRemaining((PrimitiveIterator.OfLong) obj);
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f23005a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f23005a.hashCode();
    }

    @Override // p164j$.util.InterfaceC8768y, java.util.Iterator, p164j$.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f23005a.next();
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f23005a.next();
    }

    @Override // p164j$.util.InterfaceC8768y
    public final /* synthetic */ long nextLong() {
        return this.f23005a.nextLong();
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final /* synthetic */ void remove() {
        this.f23005a.remove();
    }
}
