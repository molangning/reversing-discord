package p164j$.util;

import java.util.Comparator;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.W */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8374W extends AbstractC8516n implements InterfaceC8359G {
    @Override // p164j$.util.InterfaceC8359G, p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17603m(this, consumer);
    }

    @Override // p164j$.util.InterfaceC8359G
    /* renamed from: c */
    public final void mo17458c(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
    }

    @Override // p164j$.util.InterfaceC8359G, p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17608g(this, consumer);
    }

    @Override // p164j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC8516n.m17606i(this);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC8516n.m17605j(this, i);
    }

    @Override // p164j$.util.InterfaceC8359G
    /* renamed from: k */
    public final boolean mo17457k(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        return false;
    }

    @Override // p164j$.util.AbstractC8516n, p164j$.util.InterfaceC8356D, p164j$.util.InterfaceC8365M, p164j$.util.Spliterator
    public final /* bridge */ /* synthetic */ InterfaceC8359G trySplit() {
        return null;
    }

    @Override // p164j$.util.AbstractC8516n, p164j$.util.InterfaceC8356D, p164j$.util.InterfaceC8365M, p164j$.util.Spliterator
    public final /* bridge */ /* synthetic */ InterfaceC8365M trySplit() {
        return null;
    }
}