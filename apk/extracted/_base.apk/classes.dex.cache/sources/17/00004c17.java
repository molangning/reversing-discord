package p327ri;

import cg.InterfaceC2533a;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.C9538f;
import kotlin.collections.C9560w;
import kotlin.jvm.internal.C9581b;
import kotlin.jvm.internal.C9604l0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

/* renamed from: ri.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12263f<T> extends AbstractSet<T> {

    /* renamed from: l */
    public static final C12265b f31865l = new C12265b(null);

    /* renamed from: j */
    private Object f31866j;

    /* renamed from: k */
    private int f31867k;

    /* renamed from: ri.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static final class C12264a<T> implements Iterator<T>, InterfaceC2533a, p164j$.util.Iterator {

        /* renamed from: j */
        private final Iterator<T> f31868j;

        public C12264a(T[] array) {
            C9612q.m13917h(array, "array");
            this.f31868j = C9581b.m13973a(array);
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        /* renamed from: a */
        public Void remove() {
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

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return this.f31868j.hasNext();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public T next() {
            return this.f31868j.next();
        }
    }

    /* renamed from: ri.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12265b {
        private C12265b() {
        }

        public /* synthetic */ C12265b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <T> C12263f<T> m5640a() {
            return new C12263f<>(null);
        }

        /* renamed from: b */
        public final <T> C12263f<T> m5639b(Collection<? extends T> set) {
            C9612q.m13917h(set, "set");
            C12263f<T> c12263f = new C12263f<>(null);
            c12263f.addAll(set);
            return c12263f;
        }
    }

    /* renamed from: ri.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static final class C12266c<T> implements java.util.Iterator<T>, InterfaceC2533a, p164j$.util.Iterator {

        /* renamed from: j */
        private final T f31869j;

        /* renamed from: k */
        private boolean f31870k = true;

        public C12266c(T t) {
            this.f31869j = t;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        /* renamed from: a */
        public Void remove() {
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

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return this.f31870k;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public T next() {
            if (this.f31870k) {
                this.f31870k = false;
                return this.f31869j;
            }
            throw new NoSuchElementException();
        }
    }

    private C12263f() {
    }

    public /* synthetic */ C12263f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public static final <T> C12263f<T> m5644a() {
        return f31865l.m5640a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t) {
        boolean m14190y;
        Object[] objArr;
        ?? m14005f;
        if (size() == 0) {
            this.f31866j = t;
        } else if (size() == 1) {
            if (C9612q.m13922c(this.f31866j, t)) {
                return false;
            }
            this.f31866j = new Object[]{this.f31866j, t};
        } else if (size() < 5) {
            Object obj = this.f31866j;
            C9612q.m13919f(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr2 = (Object[]) obj;
            m14190y = C9538f.m14190y(objArr2, t);
            if (m14190y) {
                return false;
            }
            if (size() == 4) {
                m14005f = C9560w.m14005f(Arrays.copyOf(objArr2, objArr2.length));
                m14005f.add(t);
                objArr = m14005f;
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, size() + 1);
                C9612q.m13918g(copyOf, "copyOf(this, newSize)");
                copyOf[copyOf.length - 1] = t;
                objArr = copyOf;
            }
            this.f31866j = objArr;
        } else {
            Object obj2 = this.f31866j;
            C9612q.m13919f(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!C9604l0.m13939c(obj2).add(t)) {
                return false;
            }
        }
        m5642e(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f31866j = null;
        m5642e(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        boolean m14190y;
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return C9612q.m13922c(this.f31866j, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f31866j;
            C9612q.m13919f(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            m14190y = C9538f.m14190y((Object[]) obj2, obj);
            return m14190y;
        }
        Object obj3 = this.f31866j;
        C9612q.m13919f(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    /* renamed from: d */
    public int m5643d() {
        return this.f31867k;
    }

    /* renamed from: e */
    public void m5642e(int i) {
        this.f31867k = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new C12266c(this.f31866j);
        }
        if (size() < 5) {
            Object obj = this.f31866j;
            C9612q.m13919f(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new C12264a((Object[]) obj);
        }
        Object obj2 = this.f31866j;
        C9612q.m13919f(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return C9604l0.m13939c(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return m5643d();
    }
}