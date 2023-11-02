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

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m14357d2 = {"Lsi/p;", "T", "Lkotlin/sequences/Sequence;", "", "iterator", "a", "Lkotlin/sequences/Sequence;", "sequence", "Lkotlin/Function1;", "", "b", "Lkotlin/jvm/functions/Function1;", "predicate", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: si.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12556p<T> implements Sequence<T> {

    /* renamed from: a */
    private final Sequence<T> f32598a;

    /* renamed from: b */
    private final Function1<T, Boolean> f32599b;

    @Metadata(m14358d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0002R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0005\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m14357d2 = {"si/p$a", "", "", "a", "next", "()Ljava/lang/Object;", "", "hasNext", "j", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "k", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "l", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: si.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12557a implements Iterator<T>, InterfaceC2533a, p164j$.util.Iterator {

        /* renamed from: j */
        private final Iterator<T> f32600j;

        /* renamed from: k */
        private int f32601k = -1;

        /* renamed from: l */
        private T f32602l;

        /* renamed from: m */
        final /* synthetic */ C12556p<T> f32603m;

        C12557a(C12556p<T> c12556p) {
            this.f32603m = c12556p;
            this.f32600j = ((C12556p) c12556p).f32598a.iterator();
        }

        /* renamed from: a */
        private final void m4845a() {
            if (this.f32600j.hasNext()) {
                T next = this.f32600j.next();
                if (((Boolean) ((C12556p) this.f32603m).f32599b.invoke(next)).booleanValue()) {
                    this.f32601k = 1;
                    this.f32602l = next;
                    return;
                }
            }
            this.f32601k = 0;
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
            if (this.f32601k == -1) {
                m4845a();
            }
            if (this.f32601k == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public T next() {
            if (this.f32601k == -1) {
                m4845a();
            }
            if (this.f32601k != 0) {
                T t = this.f32602l;
                this.f32602l = null;
                this.f32601k = -1;
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
    public C12556p(Sequence<? extends T> sequence, Function1<? super T, Boolean> predicate) {
        C9612q.m13917h(sequence, "sequence");
        C9612q.m13917h(predicate, "predicate");
        this.f32598a = sequence;
        this.f32599b = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<T> iterator() {
        return new C12557a(this);
    }
}