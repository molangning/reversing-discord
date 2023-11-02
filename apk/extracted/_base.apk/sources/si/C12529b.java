package si;

import cg.InterfaceC2533a;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.sequences.Sequence;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m14357d2 = {"Lsi/b;", "T", "Lkotlin/sequences/Sequence;", "Lsi/c;", "", "n", "a", "", "iterator", "Lkotlin/sequences/Sequence;", "sequence", "b", "I", "count", "<init>", "(Lkotlin/sequences/Sequence;I)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: si.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12529b<T> implements Sequence<T>, InterfaceC12531c<T> {

    /* renamed from: a */
    private final Sequence<T> f32562a;

    /* renamed from: b */
    private final int f32563b;

    @Metadata(m14358d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0002R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m14357d2 = {"si/b$a", "", "", "a", "next", "()Ljava/lang/Object;", "", "hasNext", "j", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "k", "I", "getLeft", "()I", "setLeft", "(I)V", ViewProps.LEFT, "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: si.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12530a implements Iterator<T>, InterfaceC2533a, p164j$.util.Iterator {

        /* renamed from: j */
        private final Iterator<T> f32564j;

        /* renamed from: k */
        private int f32565k;

        C12530a(C12529b<T> c12529b) {
            this.f32564j = ((C12529b) c12529b).f32562a.iterator();
            this.f32565k = ((C12529b) c12529b).f32563b;
        }

        /* renamed from: a */
        private final void m4927a() {
            while (this.f32565k > 0 && this.f32564j.hasNext()) {
                this.f32564j.next();
                this.f32565k--;
            }
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
            m4927a();
            return this.f32564j.hasNext();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public T next() {
            m4927a();
            return this.f32564j.next();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12529b(Sequence<? extends T> sequence, int i) {
        boolean z;
        C9612q.m13917h(sequence, "sequence");
        this.f32562a = sequence;
        this.f32563b = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // si.InterfaceC12531c
    /* renamed from: a */
    public Sequence<T> mo4926a(int i) {
        int i2 = this.f32563b + i;
        return i2 < 0 ? new C12529b(this, i) : new C12529b(this.f32562a, i2);
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<T> iterator() {
        return new C12530a(this);
    }
}
