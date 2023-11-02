package p304qf;

import cg.InterfaceC2533a;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\t\u0010\t\u001a\u00020\u0002H\u0096\u0002J\b\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\r"}, m14357d2 = {"Lqf/h;", "", "", "", "hasNext", "hasPrevious", "", "nextIndex", "previousIndex", "a", "e", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: qf.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11875h implements ListIterator, InterfaceC2533a, Iterator {

    /* renamed from: j */
    public static final C11875h f30870j = new C11875h();

    private C11875h() {
    }

    @Override // java.util.ListIterator, java.util.Iterator, p164j$.util.Iterator
    /* renamed from: a */
    public Void next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    /* renamed from: e */
    public Void previous() {
        throw new NoSuchElementException();
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
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator, p164j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
