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

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m14357d2 = {"Lsi/e;", "T", "Lkotlin/sequences/Sequence;", "", "iterator", "a", "Lkotlin/sequences/Sequence;", "sequence", "", "b", "Z", "sendWhen", "Lkotlin/Function1;", "c", "Lkotlin/jvm/functions/Function1;", "predicate", "<init>", "(Lkotlin/sequences/Sequence;ZLkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: si.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12533e<T> implements Sequence<T> {

    /* renamed from: a */
    private final Sequence<T> f32567a;

    /* renamed from: b */
    private final boolean f32568b;

    /* renamed from: c */
    private final Function1<T, Boolean> f32569c;

    @Metadata(m14358d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0002R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0005\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m14357d2 = {"si/e$a", "", "", "a", "next", "()Ljava/lang/Object;", "", "hasNext", "j", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "k", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "l", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: si.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12534a implements Iterator<T>, InterfaceC2533a, p164j$.util.Iterator {

        /* renamed from: j */
        private final Iterator<T> f32570j;

        /* renamed from: k */
        private int f32571k = -1;

        /* renamed from: l */
        private T f32572l;

        /* renamed from: m */
        final /* synthetic */ C12533e<T> f32573m;

        C12534a(C12533e<T> c12533e) {
            this.f32573m = c12533e;
            this.f32570j = ((C12533e) c12533e).f32567a.iterator();
        }

        /* renamed from: a */
        private final void m4921a() {
            while (this.f32570j.hasNext()) {
                T next = this.f32570j.next();
                if (((Boolean) ((C12533e) this.f32573m).f32569c.invoke(next)).booleanValue() == ((C12533e) this.f32573m).f32568b) {
                    this.f32572l = next;
                    this.f32571k = 1;
                    return;
                }
            }
            this.f32571k = 0;
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
            if (this.f32571k == -1) {
                m4921a();
            }
            if (this.f32571k == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public T next() {
            if (this.f32571k == -1) {
                m4921a();
            }
            if (this.f32571k != 0) {
                T t = this.f32572l;
                this.f32572l = null;
                this.f32571k = -1;
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
    public C12533e(Sequence<? extends T> sequence, boolean z, Function1<? super T, Boolean> predicate) {
        C9612q.m13917h(sequence, "sequence");
        C9612q.m13917h(predicate, "predicate");
        this.f32567a = sequence;
        this.f32568b = z;
        this.f32569c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<T> iterator() {
        return new C12534a(this);
    }
}