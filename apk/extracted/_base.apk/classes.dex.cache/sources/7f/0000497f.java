package pg;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9652n;
import kotlin.text.C9654p;
import ng.C10864c;
import ng.C10884k;
import ng.EnumC10876i;
import p269og.EnumC11102c;
import p449yh.EnumC14028e;
import ph.C11632b;
import ph.C11633c;
import ph.C11634d;
import ph.C11636e;
import ph.C11638f;
import ph.C11640h;
import ph.C11641i;

/* renamed from: pg.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11599c {

    /* renamed from: a */
    public static final C11599c f30110a;

    /* renamed from: b */
    private static final String f30111b;

    /* renamed from: c */
    private static final String f30112c;

    /* renamed from: d */
    private static final String f30113d;

    /* renamed from: e */
    private static final String f30114e;

    /* renamed from: f */
    private static final C11632b f30115f;

    /* renamed from: g */
    private static final C11633c f30116g;

    /* renamed from: h */
    private static final C11632b f30117h;

    /* renamed from: i */
    private static final C11632b f30118i;

    /* renamed from: j */
    private static final C11632b f30119j;

    /* renamed from: k */
    private static final HashMap<C11634d, C11632b> f30120k;

    /* renamed from: l */
    private static final HashMap<C11634d, C11632b> f30121l;

    /* renamed from: m */
    private static final HashMap<C11634d, C11633c> f30122m;

    /* renamed from: n */
    private static final HashMap<C11634d, C11633c> f30123n;

    /* renamed from: o */
    private static final HashMap<C11632b, C11632b> f30124o;

    /* renamed from: p */
    private static final HashMap<C11632b, C11632b> f30125p;

    /* renamed from: q */
    private static final List<C11600a> f30126q;

    /* renamed from: pg.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11600a {

        /* renamed from: a */
        private final C11632b f30127a;

        /* renamed from: b */
        private final C11632b f30128b;

        /* renamed from: c */
        private final C11632b f30129c;

        public C11600a(C11632b javaClass, C11632b kotlinReadOnly, C11632b kotlinMutable) {
            C9612q.m13917h(javaClass, "javaClass");
            C9612q.m13917h(kotlinReadOnly, "kotlinReadOnly");
            C9612q.m13917h(kotlinMutable, "kotlinMutable");
            this.f30127a = javaClass;
            this.f30128b = kotlinReadOnly;
            this.f30129c = kotlinMutable;
        }

        /* renamed from: a */
        public final C11632b m7548a() {
            return this.f30127a;
        }

        /* renamed from: b */
        public final C11632b m7547b() {
            return this.f30128b;
        }

        /* renamed from: c */
        public final C11632b m7546c() {
            return this.f30129c;
        }

        /* renamed from: d */
        public final C11632b m7545d() {
            return this.f30127a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C11600a) {
                C11600a c11600a = (C11600a) obj;
                return C9612q.m13922c(this.f30127a, c11600a.f30127a) && C9612q.m13922c(this.f30128b, c11600a.f30128b) && C9612q.m13922c(this.f30129c, c11600a.f30129c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f30127a.hashCode() * 31) + this.f30128b.hashCode()) * 31) + this.f30129c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f30127a + ", kotlinReadOnly=" + this.f30128b + ", kotlinMutable=" + this.f30129c + ')';
        }
    }

    static {
        List<C11600a> m14101l;
        EnumC14028e[] values;
        C11599c c11599c = new C11599c();
        f30110a = c11599c;
        StringBuilder sb2 = new StringBuilder();
        EnumC11102c enumC11102c = EnumC11102c.f29061o;
        sb2.append(enumC11102c.m9163c().toString());
        sb2.append('.');
        sb2.append(enumC11102c.m9164b());
        f30111b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        EnumC11102c enumC11102c2 = EnumC11102c.f29063q;
        sb3.append(enumC11102c2.m9163c().toString());
        sb3.append('.');
        sb3.append(enumC11102c2.m9164b());
        f30112c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        EnumC11102c enumC11102c3 = EnumC11102c.f29062p;
        sb4.append(enumC11102c3.m9163c().toString());
        sb4.append('.');
        sb4.append(enumC11102c3.m9164b());
        f30113d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        EnumC11102c enumC11102c4 = EnumC11102c.f29064r;
        sb5.append(enumC11102c4.m9163c().toString());
        sb5.append('.');
        sb5.append(enumC11102c4.m9164b());
        f30114e = sb5.toString();
        C11632b m7460m = C11632b.m7460m(new C11633c("kotlin.jvm.functions.FunctionN"));
        C9612q.m13918g(m7460m, "topLevel(FqName(\"kotlin.jvm.functions.FunctionN\"))");
        f30115f = m7460m;
        C11633c m7471b = m7460m.m7471b();
        C9612q.m13918g(m7471b, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f30116g = m7471b;
        C11641i c11641i = C11641i.f30262a;
        f30117h = c11641i.m7405k();
        f30118i = c11641i.m7406j();
        f30119j = c11599c.m7558g(Class.class);
        f30120k = new HashMap<>();
        f30121l = new HashMap<>();
        f30122m = new HashMap<>();
        f30123n = new HashMap<>();
        f30124o = new HashMap<>();
        f30125p = new HashMap<>();
        C11632b m7460m2 = C11632b.m7460m(C10884k.C10885a.f28463T);
        C9612q.m13918g(m7460m2, "topLevel(FqNames.iterable)");
        C11633c c11633c = C10884k.C10885a.f28473b0;
        C11633c m7465h = m7460m2.m7465h();
        C11633c m7465h2 = m7460m2.m7465h();
        C9612q.m13918g(m7465h2, "kotlinReadOnly.packageFqName");
        C11633c m7428g = C11636e.m7428g(c11633c, m7465h2);
        C11632b c11632b = new C11632b(m7465h, m7428g, false);
        C11632b m7460m3 = C11632b.m7460m(C10884k.C10885a.f28462S);
        C9612q.m13918g(m7460m3, "topLevel(FqNames.iterator)");
        C11633c c11633c2 = C10884k.C10885a.f28471a0;
        C11633c m7465h3 = m7460m3.m7465h();
        C11633c m7465h4 = m7460m3.m7465h();
        C9612q.m13918g(m7465h4, "kotlinReadOnly.packageFqName");
        C11632b c11632b2 = new C11632b(m7465h3, C11636e.m7428g(c11633c2, m7465h4), false);
        C11632b m7460m4 = C11632b.m7460m(C10884k.C10885a.f28464U);
        C9612q.m13918g(m7460m4, "topLevel(FqNames.collection)");
        C11633c c11633c3 = C10884k.C10885a.f28475c0;
        C11633c m7465h5 = m7460m4.m7465h();
        C11633c m7465h6 = m7460m4.m7465h();
        C9612q.m13918g(m7465h6, "kotlinReadOnly.packageFqName");
        C11632b c11632b3 = new C11632b(m7465h5, C11636e.m7428g(c11633c3, m7465h6), false);
        C11632b m7460m5 = C11632b.m7460m(C10884k.C10885a.f28465V);
        C9612q.m13918g(m7460m5, "topLevel(FqNames.list)");
        C11633c c11633c4 = C10884k.C10885a.f28477d0;
        C11633c m7465h7 = m7460m5.m7465h();
        C11633c m7465h8 = m7460m5.m7465h();
        C9612q.m13918g(m7465h8, "kotlinReadOnly.packageFqName");
        C11632b c11632b4 = new C11632b(m7465h7, C11636e.m7428g(c11633c4, m7465h8), false);
        C11632b m7460m6 = C11632b.m7460m(C10884k.C10885a.f28467X);
        C9612q.m13918g(m7460m6, "topLevel(FqNames.set)");
        C11633c c11633c5 = C10884k.C10885a.f28481f0;
        C11633c m7465h9 = m7460m6.m7465h();
        C11633c m7465h10 = m7460m6.m7465h();
        C9612q.m13918g(m7465h10, "kotlinReadOnly.packageFqName");
        C11632b c11632b5 = new C11632b(m7465h9, C11636e.m7428g(c11633c5, m7465h10), false);
        C11632b m7460m7 = C11632b.m7460m(C10884k.C10885a.f28466W);
        C9612q.m13918g(m7460m7, "topLevel(FqNames.listIterator)");
        C11633c c11633c6 = C10884k.C10885a.f28479e0;
        C11633c m7465h11 = m7460m7.m7465h();
        C11633c m7465h12 = m7460m7.m7465h();
        C9612q.m13918g(m7465h12, "kotlinReadOnly.packageFqName");
        C11632b c11632b6 = new C11632b(m7465h11, C11636e.m7428g(c11633c6, m7465h12), false);
        C11633c c11633c7 = C10884k.C10885a.f28468Y;
        C11632b m7460m8 = C11632b.m7460m(c11633c7);
        C9612q.m13918g(m7460m8, "topLevel(FqNames.map)");
        C11633c c11633c8 = C10884k.C10885a.f28483g0;
        C11633c m7465h13 = m7460m8.m7465h();
        C11633c m7465h14 = m7460m8.m7465h();
        C9612q.m13918g(m7465h14, "kotlinReadOnly.packageFqName");
        C11632b c11632b7 = new C11632b(m7465h13, C11636e.m7428g(c11633c8, m7465h14), false);
        C11632b m7469d = C11632b.m7460m(c11633c7).m7469d(C10884k.C10885a.f28469Z.m7453g());
        C9612q.m13918g(m7469d, "topLevel(FqNames.map).cr…mes.mapEntry.shortName())");
        C11633c c11633c9 = C10884k.C10885a.f28485h0;
        C11633c m7465h15 = m7469d.m7465h();
        C11633c m7465h16 = m7469d.m7465h();
        C9612q.m13918g(m7465h16, "kotlinReadOnly.packageFqName");
        m14101l = C9545j.m14101l(new C11600a(c11599c.m7558g(Iterable.class), m7460m2, c11632b), new C11600a(c11599c.m7558g(Iterator.class), m7460m3, c11632b2), new C11600a(c11599c.m7558g(Collection.class), m7460m4, c11632b3), new C11600a(c11599c.m7558g(List.class), m7460m5, c11632b4), new C11600a(c11599c.m7558g(Set.class), m7460m6, c11632b5), new C11600a(c11599c.m7558g(ListIterator.class), m7460m7, c11632b6), new C11600a(c11599c.m7558g(Map.class), m7460m8, c11632b7), new C11600a(c11599c.m7558g(Map.Entry.class), m7469d, new C11632b(m7465h15, C11636e.m7428g(c11633c9, m7465h16), false)));
        f30126q = m14101l;
        c11599c.m7559f(Object.class, C10884k.C10885a.f28472b);
        c11599c.m7559f(String.class, C10884k.C10885a.f28484h);
        c11599c.m7559f(CharSequence.class, C10884k.C10885a.f28482g);
        c11599c.m7560e(Throwable.class, C10884k.C10885a.f28510u);
        c11599c.m7559f(Cloneable.class, C10884k.C10885a.f28476d);
        c11599c.m7559f(Number.class, C10884k.C10885a.f28504r);
        c11599c.m7560e(Comparable.class, C10884k.C10885a.f28512v);
        c11599c.m7559f(Enum.class, C10884k.C10885a.f28506s);
        c11599c.m7560e(Annotation.class, C10884k.C10885a.f28446G);
        for (C11600a c11600a : m14101l) {
            f30110a.m7561d(c11600a);
        }
        for (EnumC14028e enumC14028e : EnumC14028e.values()) {
            C11599c c11599c2 = f30110a;
            C11632b m7460m9 = C11632b.m7460m(enumC14028e.m874g());
            C9612q.m13918g(m7460m9, "topLevel(jvmType.wrapperFqName)");
            EnumC10876i m875f = enumC14028e.m875f();
            C9612q.m13918g(m875f, "jvmType.primitiveType");
            C11632b m7460m10 = C11632b.m7460m(C10884k.m9754c(m875f));
            C9612q.m13918g(m7460m10, "topLevel(StandardNames.g…e(jvmType.primitiveType))");
            c11599c2.m7564a(m7460m9, m7460m10);
        }
        for (C11632b c11632b8 : C10864c.f28357a.m9879a()) {
            C11599c c11599c3 = f30110a;
            C11632b m7460m11 = C11632b.m7460m(new C11633c("kotlin.jvm.internal." + c11632b8.m7463j().m7426b() + "CompanionObject"));
            C9612q.m13918g(m7460m11, "topLevel(FqName(\"kotlin.…g() + \"CompanionObject\"))");
            C11632b m7469d2 = c11632b8.m7469d(C11640h.f30220d);
            C9612q.m13918g(m7469d2, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            c11599c3.m7564a(m7460m11, m7469d2);
        }
        for (int i = 0; i < 23; i++) {
            C11599c c11599c4 = f30110a;
            C11632b m7460m12 = C11632b.m7460m(new C11633c("kotlin.jvm.functions.Function" + i));
            C9612q.m13918g(m7460m12, "topLevel(FqName(\"kotlin.…m.functions.Function$i\"))");
            c11599c4.m7564a(m7460m12, C10884k.m9756a(i));
            c11599c4.m7562c(new C11633c(f30112c + i), f30117h);
        }
        for (int i2 = 0; i2 < 22; i2++) {
            EnumC11102c enumC11102c5 = EnumC11102c.f29064r;
            f30110a.m7562c(new C11633c((enumC11102c5.m9163c().toString() + '.' + enumC11102c5.m9164b()) + i2), f30117h);
        }
        C11599c c11599c5 = f30110a;
        C11633c m7437l = C10884k.C10885a.f28474c.m7437l();
        C9612q.m13918g(m7437l, "nothing.toSafe()");
        c11599c5.m7562c(m7437l, c11599c5.m7558g(Void.class));
    }

    private C11599c() {
    }

    /* renamed from: a */
    private final void m7564a(C11632b c11632b, C11632b c11632b2) {
        m7563b(c11632b, c11632b2);
        C11633c m7471b = c11632b2.m7471b();
        C9612q.m13918g(m7471b, "kotlinClassId.asSingleFqName()");
        m7562c(m7471b, c11632b);
    }

    /* renamed from: b */
    private final void m7563b(C11632b c11632b, C11632b c11632b2) {
        HashMap<C11634d, C11632b> hashMap = f30120k;
        C11634d m7450j = c11632b.m7471b().m7450j();
        C9612q.m13918g(m7450j, "javaClassId.asSingleFqName().toUnsafe()");
        hashMap.put(m7450j, c11632b2);
    }

    /* renamed from: c */
    private final void m7562c(C11633c c11633c, C11632b c11632b) {
        HashMap<C11634d, C11632b> hashMap = f30121l;
        C11634d m7450j = c11633c.m7450j();
        C9612q.m13918g(m7450j, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap.put(m7450j, c11632b);
    }

    /* renamed from: d */
    private final void m7561d(C11600a c11600a) {
        C11632b m7548a = c11600a.m7548a();
        C11632b m7547b = c11600a.m7547b();
        C11632b m7546c = c11600a.m7546c();
        m7564a(m7548a, m7547b);
        C11633c m7471b = m7546c.m7471b();
        C9612q.m13918g(m7471b, "mutableClassId.asSingleFqName()");
        m7562c(m7471b, m7548a);
        f30124o.put(m7546c, m7547b);
        f30125p.put(m7547b, m7546c);
        C11633c m7471b2 = m7547b.m7471b();
        C9612q.m13918g(m7471b2, "readOnlyClassId.asSingleFqName()");
        C11633c m7471b3 = m7546c.m7471b();
        C9612q.m13918g(m7471b3, "mutableClassId.asSingleFqName()");
        HashMap<C11634d, C11633c> hashMap = f30122m;
        C11634d m7450j = m7546c.m7471b().m7450j();
        C9612q.m13918g(m7450j, "mutableClassId.asSingleFqName().toUnsafe()");
        hashMap.put(m7450j, m7471b2);
        HashMap<C11634d, C11633c> hashMap2 = f30123n;
        C11634d m7450j2 = m7471b2.m7450j();
        C9612q.m13918g(m7450j2, "readOnlyFqName.toUnsafe()");
        hashMap2.put(m7450j2, m7471b3);
    }

    /* renamed from: e */
    private final void m7560e(Class<?> cls, C11633c c11633c) {
        C11632b m7558g = m7558g(cls);
        C11632b m7460m = C11632b.m7460m(c11633c);
        C9612q.m13918g(m7460m, "topLevel(kotlinFqName)");
        m7564a(m7558g, m7460m);
    }

    /* renamed from: f */
    private final void m7559f(Class<?> cls, C11634d c11634d) {
        C11633c m7437l = c11634d.m7437l();
        C9612q.m13918g(m7437l, "kotlinFqName.toSafe()");
        m7560e(cls, m7437l);
    }

    /* renamed from: g */
    private final C11632b m7558g(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            C11632b m7460m = C11632b.m7460m(new C11633c(cls.getCanonicalName()));
            C9612q.m13918g(m7460m, "topLevel(FqName(clazz.canonicalName))");
            return m7460m;
        }
        C11632b m7469d = m7558g(declaringClass).m7469d(C11638f.m7422f(cls.getSimpleName()));
        C9612q.m13918g(m7469d, "classId(outer).createNes…tifier(clazz.simpleName))");
        return m7469d;
    }

    /* renamed from: j */
    private final boolean m7555j(C11634d c11634d, String str) {
        String m13738I0;
        boolean z;
        boolean m13743E0;
        Integer m13769m;
        String m7447b = c11634d.m7447b();
        C9612q.m13918g(m7447b, "kotlinFqName.asString()");
        m13738I0 = C9654p.m13738I0(m7447b, str, "");
        if (m13738I0.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m13743E0 = C9654p.m13743E0(m13738I0, '0', false, 2, null);
            if (!m13743E0) {
                m13769m = C9652n.m13769m(m13738I0);
                if (m13769m != null && m13769m.intValue() >= 23) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final C11633c m7557h() {
        return f30116g;
    }

    /* renamed from: i */
    public final List<C11600a> m7556i() {
        return f30126q;
    }

    /* renamed from: k */
    public final boolean m7554k(C11634d c11634d) {
        return f30122m.containsKey(c11634d);
    }

    /* renamed from: l */
    public final boolean m7553l(C11634d c11634d) {
        return f30123n.containsKey(c11634d);
    }

    /* renamed from: m */
    public final C11632b m7552m(C11633c fqName) {
        C9612q.m13917h(fqName, "fqName");
        return f30120k.get(fqName.m7450j());
    }

    /* renamed from: n */
    public final C11632b m7551n(C11634d kotlinFqName) {
        C9612q.m13917h(kotlinFqName, "kotlinFqName");
        if (m7555j(kotlinFqName, f30111b)) {
            return f30115f;
        }
        if (m7555j(kotlinFqName, f30113d)) {
            return f30115f;
        }
        if (m7555j(kotlinFqName, f30112c)) {
            return f30117h;
        }
        if (m7555j(kotlinFqName, f30114e)) {
            return f30117h;
        }
        return f30121l.get(kotlinFqName);
    }

    /* renamed from: o */
    public final C11633c m7550o(C11634d c11634d) {
        return f30122m.get(c11634d);
    }

    /* renamed from: p */
    public final C11633c m7549p(C11634d c11634d) {
        return f30123n.get(c11634d);
    }
}