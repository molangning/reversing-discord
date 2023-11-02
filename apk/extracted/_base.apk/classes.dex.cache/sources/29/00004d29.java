package si;

import cg.InterfaceC2533a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.sequences.Sequence;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B-\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096\u0002R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m14357d2 = {"Lsi/g;", "", "T", "Lkotlin/sequences/Sequence;", "", "iterator", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "getInitialValue", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "getNextValue", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: si.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12537g<T> implements Sequence<T> {

    /* renamed from: a */
    private final Function0<T> f32580a;

    /* renamed from: b */
    private final Function1<T, T> f32581b;

    @Metadata(m14358d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0002R$\u0010\r\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m14357d2 = {"si/g$a", "", "", "a", "next", "()Ljava/lang/Object;", "", "hasNext", "j", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "", "k", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: si.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12538a implements Iterator<T>, InterfaceC2533a, p164j$.util.Iterator {

        /* renamed from: j */
        private T f32582j;

        /* renamed from: k */
        private int f32583k = -2;

        /* renamed from: l */
        final /* synthetic */ C12537g<T> f32584l;

        C12538a(C12537g<T> c12537g) {
            this.f32584l = c12537g;
        }

        /* renamed from: a */
        private final void m4914a() {
            T t;
            int i;
            if (this.f32583k == -2) {
                t = (T) ((C12537g) this.f32584l).f32580a.invoke();
            } else {
                Function1 function1 = ((C12537g) this.f32584l).f32581b;
                T t2 = this.f32582j;
                C9612q.m13920e(t2);
                t = (T) function1.invoke(t2);
            }
            this.f32582j = t;
            if (t == null) {
                i = 0;
            } else {
                i = 1;
            }
            this.f32583k = i;
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
            if (this.f32583k < 0) {
                m4914a();
            }
            if (this.f32583k == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public T next() {
            if (this.f32583k < 0) {
                m4914a();
            }
            if (this.f32583k != 0) {
                T t = this.f32582j;
                C9612q.m13919f(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f32583k = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12537g(Function0<? extends T> getInitialValue, Function1<? super T, ? extends T> getNextValue) {
        C9612q.m13917h(getInitialValue, "getInitialValue");
        C9612q.m13917h(getNextValue, "getNextValue");
        this.f32580a = getInitialValue;
        this.f32581b = getNextValue;
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<T> iterator() {
        return new C12538a(this);
    }
}