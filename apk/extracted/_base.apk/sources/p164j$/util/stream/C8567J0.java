package p164j$.util.stream;

import java.util.Collection;
import p164j$.util.AbstractC8516n;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.J0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8567J0 implements InterfaceC8548F0 {

    /* renamed from: a */
    private final Collection f22706a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8567J0(Collection collection) {
        this.f22706a = collection;
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: a */
    public final InterfaceC8548F0 mo17392a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final long count() {
        return this.f22706a.size();
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: f */
    public final void mo17391f(Object[] objArr, int i) {
        for (Object obj : this.f22706a) {
            objArr[i] = obj;
            i++;
        }
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final void forEach(Consumer consumer) {
        AbstractC8516n.m17600q(this.f22706a, consumer);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: k */
    public final /* synthetic */ int mo17390k() {
        return 0;
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: p */
    public final Object[] mo17389p(IntFunction intFunction) {
        Collection collection = this.f22706a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: r */
    public final /* synthetic */ InterfaceC8548F0 mo17388r(long j, long j2, IntFunction intFunction) {
        return AbstractC8744w0.m17370I0(this, j, j2, intFunction);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final Spliterator spliterator() {
        Collection collection = this.f22706a;
        return (collection instanceof p164j$.util.Collection ? ((p164j$.util.Collection) collection).stream() : AbstractC8744w0.m17323v1(AbstractC8516n.m17598s(collection), false)).spliterator();
    }

    public final String toString() {
        Collection collection = this.f22706a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
