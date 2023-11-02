package si;

import cg.InterfaceC2533a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.sequences.Sequence;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004BC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\n¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0096\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0011"}, m14357d2 = {"Lsi/f;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "", "iterator", "a", "Lkotlin/sequences/Sequence;", "sequence", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "transformer", "c", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: si.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12535f<T, R, E> implements Sequence<E> {

    /* renamed from: a */
    private final Sequence<T> f32574a;

    /* renamed from: b */
    private final Function1<T, R> f32575b;

    /* renamed from: c */
    private final Function1<R, Iterator<E>> f32576c;

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u000f*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0002H\u0096\u0002R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m14357d2 = {"si/f$a", "", "", "a", "next", "()Ljava/lang/Object;", "hasNext", "j", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "k", "getItemIterator", "setItemIterator", "(Ljava/util/Iterator;)V", "itemIterator", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: si.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12536a implements Iterator<E>, InterfaceC2533a, p164j$.util.Iterator {

        /* renamed from: j */
        private final Iterator<T> f32577j;

        /* renamed from: k */
        private Iterator<? extends E> f32578k;

        /* renamed from: l */
        final /* synthetic */ C12535f<T, R, E> f32579l;

        C12536a(C12535f<T, R, E> c12535f) {
            this.f32579l = c12535f;
            this.f32577j = ((C12535f) c12535f).f32574a.iterator();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
            return true;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final boolean m4917a() {
            /*
                r5 = this;
                java.util.Iterator<? extends E> r0 = r5.f32578k
                r1 = 1
                r2 = 0
                if (r0 == 0) goto Le
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Le
                r0 = r1
                goto Lf
            Le:
                r0 = r2
            Lf:
                if (r0 == 0) goto L14
                r0 = 0
                r5.f32578k = r0
            L14:
                java.util.Iterator<? extends E> r0 = r5.f32578k
                if (r0 != 0) goto L45
                java.util.Iterator<T> r0 = r5.f32577j
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L21
                return r2
            L21:
                java.util.Iterator<T> r0 = r5.f32577j
                java.lang.Object r0 = r0.next()
                si.f<T, R, E> r3 = r5.f32579l
                kotlin.jvm.functions.Function1 r3 = si.C12535f.m4920b(r3)
                si.f<T, R, E> r4 = r5.f32579l
                kotlin.jvm.functions.Function1 r4 = si.C12535f.m4918d(r4)
                java.lang.Object r0 = r4.invoke(r0)
                java.lang.Object r0 = r3.invoke(r0)
                java.util.Iterator r0 = (java.util.Iterator) r0
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L14
                r5.f32578k = r0
            L45:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: si.C12535f.C12536a.m4917a():boolean");
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
            return m4917a();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public E next() {
            if (m4917a()) {
                java.util.Iterator<? extends E> it = this.f32578k;
                C9612q.m13920e(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12535f(Sequence<? extends T> sequence, Function1<? super T, ? extends R> transformer, Function1<? super R, ? extends java.util.Iterator<? extends E>> iterator) {
        C9612q.m13917h(sequence, "sequence");
        C9612q.m13917h(transformer, "transformer");
        C9612q.m13917h(iterator, "iterator");
        this.f32574a = sequence;
        this.f32575b = transformer;
        this.f32576c = iterator;
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<E> iterator() {
        return new C12536a(this);
    }
}
