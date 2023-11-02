package p164j$.util;

import java.util.Comparator;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.V */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8373V extends AbstractC8516n implements InterfaceC8356D {
    @Override // p164j$.util.InterfaceC8356D, p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17604l(this, consumer);
    }

    @Override // p164j$.util.InterfaceC8356D
    /* renamed from: d */
    public final void mo17467d(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
    }

    @Override // p164j$.util.InterfaceC8356D, p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17609e(this, consumer);
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

    @Override // p164j$.util.InterfaceC8356D
    /* renamed from: p */
    public final boolean mo17466p(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
        return false;
    }

    @Override // p164j$.util.AbstractC8516n, p164j$.util.InterfaceC8356D, p164j$.util.InterfaceC8365M, p164j$.util.Spliterator
    public final /* bridge */ /* synthetic */ InterfaceC8356D trySplit() {
        return null;
    }

    @Override // p164j$.util.AbstractC8516n, p164j$.util.InterfaceC8356D, p164j$.util.InterfaceC8365M, p164j$.util.Spliterator
    public final /* bridge */ /* synthetic */ InterfaceC8365M trySplit() {
        return null;
    }
}