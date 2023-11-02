package si;

import cg.InterfaceC2533a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.sequences.Sequence;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B)\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J5\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0002\u0010\u00062\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u0007H\u0000¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m14357d2 = {"Lsi/q;", "T", "R", "Lkotlin/sequences/Sequence;", "", "iterator", "E", "Lkotlin/Function1;", "d", "(Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "a", "Lkotlin/sequences/Sequence;", "sequence", "b", "Lkotlin/jvm/functions/Function1;", "transformer", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: si.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12558q<T, R> implements Sequence<R> {

    /* renamed from: a */
    private final Sequence<T> f32604a;

    /* renamed from: b */
    private final Function1<T, R> f32605b;

    @Metadata(m14358d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m14357d2 = {"si/q$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "j", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: si.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12559a implements Iterator<R>, InterfaceC2533a, p164j$.util.Iterator {

        /* renamed from: j */
        private final Iterator<T> f32606j;

        /* renamed from: k */
        final /* synthetic */ C12558q<T, R> f32607k;

        C12559a(C12558q<T, R> c12558q) {
            this.f32607k = c12558q;
            this.f32606j = ((C12558q) c12558q).f32604a.iterator();
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
        public boolean hasNext() {
            return this.f32606j.hasNext();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public R next() {
            return (R) ((C12558q) this.f32607k).f32605b.invoke(this.f32606j.next());
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12558q(Sequence<? extends T> sequence, Function1<? super T, ? extends R> transformer) {
        C9612q.m13917h(sequence, "sequence");
        C9612q.m13917h(transformer, "transformer");
        this.f32604a = sequence;
        this.f32605b = transformer;
    }

    /* renamed from: d */
    public final <E> Sequence<E> m4842d(Function1<? super R, ? extends java.util.Iterator<? extends E>> iterator) {
        C9612q.m13917h(iterator, "iterator");
        return new C12535f(this.f32604a, this.f32605b, iterator);
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<R> iterator() {
        return new C12559a(this);
    }
}