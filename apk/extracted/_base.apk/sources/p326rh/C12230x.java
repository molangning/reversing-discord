package p326rh;

import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

/* renamed from: rh.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12230x extends AbstractList<String> implements RandomAccess, InterfaceC12206o {

    /* renamed from: j */
    private final InterfaceC12206o f31802j;

    /* renamed from: rh.x$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    class C12231a implements ListIterator<String>, Iterator {

        /* renamed from: j */
        ListIterator<String> f31803j;

        /* renamed from: k */
        final /* synthetic */ int f31804k;

        C12231a(int i) {
            this.f31804k = i;
            this.f31803j = C12230x.this.f31802j.listIterator(i);
        }

        @Override // java.util.ListIterator
        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator, p164j$.util.Iterator
        /* renamed from: b */
        public String next() {
            return this.f31803j.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d */
        public String previous() {
            return this.f31803j.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.ListIterator, java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return this.f31803j.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f31803j.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f31803j.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f31803j.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: rh.x$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    class C12232b implements java.util.Iterator<String>, Iterator {

        /* renamed from: j */
        java.util.Iterator<String> f31806j;

        C12232b() {
            this.f31806j = C12230x.this.f31802j.iterator();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        /* renamed from: a */
        public String next() {
            return this.f31806j.next();
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super String> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return this.f31806j.hasNext();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C12230x(InterfaceC12206o interfaceC12206o) {
        this.f31802j = interfaceC12206o;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d */
    public String get(int i) {
        return this.f31802j.get(i);
    }

    @Override // p326rh.InterfaceC12206o
    /* renamed from: f */
    public List<?> mo5699f() {
        return this.f31802j.mo5699f();
    }

    @Override // p326rh.InterfaceC12206o
    /* renamed from: g */
    public void mo5698g(AbstractC12177d abstractC12177d) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<String> iterator() {
        return new C12232b();
    }

    @Override // p326rh.InterfaceC12206o
    /* renamed from: j */
    public AbstractC12177d mo5697j(int i) {
        return this.f31802j.mo5697j(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new C12231a(i);
    }

    @Override // p326rh.InterfaceC12206o
    /* renamed from: n */
    public InterfaceC12206o mo5696n() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f31802j.size();
    }
}
