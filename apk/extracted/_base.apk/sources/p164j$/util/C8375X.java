package p164j$.util;

import java.util.Comparator;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8468f0;

/* renamed from: j$.util.X */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8375X extends AbstractC8516n implements InterfaceC8362J {
    @Override // p164j$.util.InterfaceC8362J, p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17602n(this, consumer);
    }

    @Override // p164j$.util.InterfaceC8362J
    /* renamed from: b */
    public final void mo17438b(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
    }

    @Override // p164j$.util.InterfaceC8362J
    /* renamed from: f */
    public final boolean mo17437f(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        return false;
    }

    @Override // p164j$.util.InterfaceC8362J, p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17607h(this, consumer);
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

    @Override // p164j$.util.AbstractC8516n, p164j$.util.InterfaceC8356D, p164j$.util.InterfaceC8365M, p164j$.util.Spliterator
    public final /* bridge */ /* synthetic */ InterfaceC8362J trySplit() {
        return null;
    }

    @Override // p164j$.util.AbstractC8516n, p164j$.util.InterfaceC8356D, p164j$.util.InterfaceC8365M, p164j$.util.Spliterator
    public final /* bridge */ /* synthetic */ InterfaceC8365M trySplit() {
        return null;
    }
}
