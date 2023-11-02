package p304qf;

import cg.InterfaceC2533a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m14357d2 = {"Lqf/o;", "T", "", "Lqf/m;", "", "hasNext", "a", "j", "Ljava/util/Iterator;", "iterator", "", "k", "I", "index", "<init>", "(Ljava/util/Iterator;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: qf.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11882o<T> implements Iterator<C11880m<? extends T>>, InterfaceC2533a, p164j$.util.Iterator {

    /* renamed from: j */
    private final Iterator<T> f30877j;

    /* renamed from: k */
    private int f30878k;

    /* JADX WARN: Multi-variable type inference failed */
    public C11882o(Iterator<? extends T> iterator) {
        C9612q.m13917h(iterator, "iterator");
        this.f30877j = iterator;
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    /* renamed from: a */
    public final C11880m<T> next() {
        int i = this.f30878k;
        this.f30878k = i + 1;
        if (i < 0) {
            C9545j.m14094s();
        }
        return new C11880m<>(i, this.f30877j.next());
    }

    @Override // p164j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final boolean hasNext() {
        return this.f30877j.hasNext();
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}