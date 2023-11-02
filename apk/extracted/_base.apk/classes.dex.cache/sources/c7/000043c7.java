package p247nb;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: nb.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10533d<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f27510a;

    /* renamed from: b */
    private final Set<C10558q> f27511b;

    /* renamed from: c */
    private final int f27512c;

    /* renamed from: d */
    private final int f27513d;

    /* renamed from: e */
    private final InterfaceC10544h<T> f27514e;

    /* renamed from: f */
    private final Set<Class<?>> f27515f;

    /* renamed from: nb.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C10535b<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f27516a;

        /* renamed from: b */
        private final Set<C10558q> f27517b;

        /* renamed from: c */
        private int f27518c;

        /* renamed from: d */
        private int f27519d;

        /* renamed from: e */
        private InterfaceC10544h<T> f27520e;

        /* renamed from: f */
        private Set<Class<?>> f27521f;

        /* renamed from: f */
        public C10535b<T> m11289f() {
            this.f27519d = 1;
            return this;
        }

        /* renamed from: g */
        private C10535b<T> m11288g(int i) {
            boolean z;
            if (this.f27518c == 0) {
                z = true;
            } else {
                z = false;
            }
            C10532c0.m11311d(z, "Instantiation type has already been set.");
            this.f27518c = i;
            return this;
        }

        /* renamed from: h */
        private void m11287h(Class<?> cls) {
            C10532c0.m11314a(!this.f27516a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public C10535b<T> m11293b(C10558q c10558q) {
            C10532c0.m11312c(c10558q, "Null dependency");
            m11287h(c10558q.m11241b());
            this.f27517b.add(c10558q);
            return this;
        }

        /* renamed from: c */
        public C10535b<T> m11292c() {
            return m11288g(1);
        }

        /* renamed from: d */
        public C10533d<T> m11291d() {
            boolean z;
            if (this.f27520e != null) {
                z = true;
            } else {
                z = false;
            }
            C10532c0.m11311d(z, "Missing required property: factory.");
            return new C10533d<>(new HashSet(this.f27516a), new HashSet(this.f27517b), this.f27518c, this.f27519d, this.f27520e, this.f27521f);
        }

        /* renamed from: e */
        public C10535b<T> m11290e(InterfaceC10544h<T> interfaceC10544h) {
            this.f27520e = (InterfaceC10544h) C10532c0.m11312c(interfaceC10544h, "Null factory");
            return this;
        }

        @SafeVarargs
        private C10535b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f27516a = hashSet;
            this.f27517b = new HashSet();
            this.f27518c = 0;
            this.f27519d = 0;
            this.f27521f = new HashSet();
            C10532c0.m11312c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                C10532c0.m11312c(cls2, "Null interface");
            }
            Collections.addAll(this.f27516a, clsArr);
        }
    }

    /* renamed from: c */
    public static <T> C10535b<T> m11308c(Class<T> cls) {
        return new C10535b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: d */
    public static <T> C10535b<T> m11307d(Class<T> cls, Class<? super T>... clsArr) {
        return new C10535b<>(cls, clsArr);
    }

    /* renamed from: i */
    public static <T> C10533d<T> m11302i(final T t, Class<T> cls) {
        return m11301j(cls).m11290e(new InterfaceC10544h() { // from class: nb.c
            @Override // p247nb.InterfaceC10544h
            /* renamed from: a */
            public final Object mo1055a(InterfaceC10538e interfaceC10538e) {
                Object m11297n;
                m11297n = C10533d.m11297n(t, interfaceC10538e);
                return m11297n;
            }
        }).m11291d();
    }

    /* renamed from: j */
    public static <T> C10535b<T> m11301j(Class<T> cls) {
        return m11308c(cls).m11289f();
    }

    /* renamed from: n */
    public static /* synthetic */ Object m11297n(Object obj, InterfaceC10538e interfaceC10538e) {
        return obj;
    }

    /* renamed from: o */
    public static /* synthetic */ Object m11296o(Object obj, InterfaceC10538e interfaceC10538e) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: p */
    public static <T> C10533d<T> m11295p(final T t, Class<T> cls, Class<? super T>... clsArr) {
        return m11307d(cls, clsArr).m11290e(new InterfaceC10544h() { // from class: nb.b
            @Override // p247nb.InterfaceC10544h
            /* renamed from: a */
            public final Object mo1055a(InterfaceC10538e interfaceC10538e) {
                Object m11296o;
                m11296o = C10533d.m11296o(t, interfaceC10538e);
                return m11296o;
            }
        }).m11291d();
    }

    /* renamed from: e */
    public Set<C10558q> m11306e() {
        return this.f27511b;
    }

    /* renamed from: f */
    public InterfaceC10544h<T> m11305f() {
        return this.f27514e;
    }

    /* renamed from: g */
    public Set<Class<? super T>> m11304g() {
        return this.f27510a;
    }

    /* renamed from: h */
    public Set<Class<?>> m11303h() {
        return this.f27515f;
    }

    /* renamed from: k */
    public boolean m11300k() {
        return this.f27512c == 1;
    }

    /* renamed from: l */
    public boolean m11299l() {
        return this.f27512c == 2;
    }

    /* renamed from: m */
    public boolean m11298m() {
        return this.f27513d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f27510a.toArray()) + ">{" + this.f27512c + ", type=" + this.f27513d + ", deps=" + Arrays.toString(this.f27511b.toArray()) + "}";
    }

    private C10533d(Set<Class<? super T>> set, Set<C10558q> set2, int i, int i2, InterfaceC10544h<T> interfaceC10544h, Set<Class<?>> set3) {
        this.f27510a = Collections.unmodifiableSet(set);
        this.f27511b = Collections.unmodifiableSet(set2);
        this.f27512c = i;
        this.f27513d = i2;
        this.f27514e = interfaceC10544h;
        this.f27515f = Collections.unmodifiableSet(set3);
    }
}