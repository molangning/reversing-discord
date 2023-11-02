package gb;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p102fb.C6378h;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

/* renamed from: gb.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6713y {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.y$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C6714a<T> extends AbstractC6703u0<T> {

        /* renamed from: j */
        boolean f18925j;

        /* renamed from: k */
        final /* synthetic */ Object f18926k;

        C6714a(Object obj) {
            this.f18926k = obj;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return !this.f18925j;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public T next() {
            if (!this.f18925j) {
                this.f18925j = true;
                return (T) this.f18926k;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: gb.y$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6715b<T> extends AbstractC6600a<T> {

        /* renamed from: n */
        static final AbstractC6710v0<Object> f18927n = new C6715b(new Object[0], 0, 0, 0);

        /* renamed from: l */
        private final T[] f18928l;

        /* renamed from: m */
        private final int f18929m;

        C6715b(T[] tArr, int i, int i2, int i3) {
            super(i2, i3);
            this.f18928l = tArr;
            this.f18929m = i;
        }

        @Override // gb.AbstractC6600a
        /* renamed from: a */
        protected T mo22043a(int i) {
            return this.f18928l[this.f18929m + i];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gb.y$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC6716c implements Iterator<Object>, p164j$.util.Iterator {
        INSTANCE;

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super Object> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            C6653i.m22244c(false);
        }
    }

    /* renamed from: a */
    public static <T> boolean m22055a(Collection<T> collection, java.util.Iterator<? extends T> it) {
        C6378h.m22834j(collection);
        C6378h.m22834j(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* renamed from: b */
    public static void m22054b(java.util.Iterator<?> it) {
        C6378h.m22834j(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0006  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m22053c(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = p102fb.C6377g.m22845a(r0, r2)
            if (r0 != 0) goto L0
            return r1
        L1d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.C6713y.m22053c(java.util.Iterator, java.util.Iterator):boolean");
    }

    /* renamed from: d */
    public static <T> AbstractC6703u0<T> m22052d() {
        return m22051e();
    }

    /* renamed from: e */
    static <T> AbstractC6710v0<T> m22051e() {
        return (AbstractC6710v0<T>) C6715b.f18927n;
    }

    /* renamed from: f */
    public static <T> java.util.Iterator<T> m22050f() {
        return EnumC6716c.INSTANCE;
    }

    /* renamed from: g */
    public static <T> T m22049g(java.util.Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* renamed from: h */
    public static <T> T m22048h(java.util.Iterator<? extends T> it, T t) {
        return it.hasNext() ? it.next() : t;
    }

    /* renamed from: i */
    public static <T> T m22047i(java.util.Iterator<T> it) {
        if (it.hasNext()) {
            T next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m22046j(java.util.Iterator<?> it, Collection<?> collection) {
        C6378h.m22834j(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: k */
    public static <T> AbstractC6703u0<T> m22045k(T t) {
        return new C6714a(t);
    }

    /* renamed from: l */
    public static String m22044l(java.util.Iterator<?> it) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z = false;
        }
        sb2.append(']');
        return sb2.toString();
    }
}