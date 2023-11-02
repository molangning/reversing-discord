package p271oi;

import cg.InterfaceC2533a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C9612q;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

/* renamed from: oi.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C11152o<T> extends AbstractC11127c<T> {

    /* renamed from: j */
    private final T f29130j;

    /* renamed from: k */
    private final int f29131k;

    /* renamed from: oi.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11153a implements Iterator<T>, InterfaceC2533a, p164j$.util.Iterator {

        /* renamed from: j */
        private boolean f29132j = true;

        /* renamed from: k */
        final /* synthetic */ C11152o<T> f29133k;

        C11153a(C11152o<T> c11152o) {
            this.f29133k = c11152o;
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
            return this.f29132j;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public T next() {
            if (this.f29132j) {
                this.f29132j = false;
                return this.f29133k.m9097i();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11152o(T value, int i) {
        super(null);
        C9612q.m13917h(value, "value");
        this.f29130j = value;
        this.f29131k = i;
    }

    @Override // p271oi.AbstractC11127c
    /* renamed from: a */
    public int mo9100a() {
        return 1;
    }

    @Override // p271oi.AbstractC11127c
    /* renamed from: e */
    public void mo9099e(int i, T value) {
        C9612q.m13917h(value, "value");
        throw new IllegalStateException();
    }

    @Override // p271oi.AbstractC11127c
    public T get(int i) {
        if (i == this.f29131k) {
            return this.f29130j;
        }
        return null;
    }

    /* renamed from: h */
    public final int m9098h() {
        return this.f29131k;
    }

    /* renamed from: i */
    public final T m9097i() {
        return this.f29130j;
    }

    @Override // p271oi.AbstractC11127c, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return new C11153a(this);
    }
}