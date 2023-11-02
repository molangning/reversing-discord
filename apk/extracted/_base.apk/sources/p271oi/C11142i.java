package p271oi;

import cg.InterfaceC2533a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C9612q;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

/* renamed from: oi.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C11142i extends AbstractC11127c {

    /* renamed from: j */
    public static final C11142i f29121j = new C11142i();

    /* renamed from: oi.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11143a implements Iterator, InterfaceC2533a, p164j$.util.Iterator {
        C11143a() {
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        /* renamed from: a */
        public Void next() {
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

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private C11142i() {
        super(null);
    }

    @Override // p271oi.AbstractC11127c
    /* renamed from: a */
    public int mo9100a() {
        return 0;
    }

    @Override // p271oi.AbstractC11127c
    /* renamed from: h */
    public Void get(int i) {
        return null;
    }

    @Override // p271oi.AbstractC11127c
    /* renamed from: i */
    public void mo9099e(int i, Void value) {
        C9612q.m13917h(value, "value");
        throw new IllegalStateException();
    }

    @Override // p271oi.AbstractC11127c, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new C11143a();
    }
}
