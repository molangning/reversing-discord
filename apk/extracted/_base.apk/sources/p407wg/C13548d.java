package p407wg;

import ag.C0156a;
import bg.InterfaceC2280a;
import bg.InterfaceC2281b;
import bg.InterfaceC2282c;
import bg.InterfaceC2283d;
import bg.InterfaceC2284e;
import bg.InterfaceC2285f;
import bg.InterfaceC2286g;
import bg.InterfaceC2287h;
import bg.InterfaceC2288i;
import bg.InterfaceC2289j;
import bg.InterfaceC2290k;
import bg.InterfaceC2291l;
import bg.InterfaceC2292m;
import bg.InterfaceC2293n;
import bg.InterfaceC2294o;
import bg.InterfaceC2295p;
import bg.InterfaceC2296q;
import bg.InterfaceC2297r;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9538f;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlin.text.C9653o;
import p304qf.C11889v;
import pf.C11591x;
import pf.InterfaceC11562g;
import ph.C11632b;
import ph.C11633c;
import ph.C11638f;
import si.C12545m;
import si.C12552o;

/* renamed from: wg.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13548d {

    /* renamed from: a */
    private static final List<KClass<? extends Object>> f34929a;

    /* renamed from: b */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f34930b;

    /* renamed from: c */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f34931c;

    /* renamed from: d */
    private static final Map<Class<? extends InterfaceC11562g<?>>, Integer> f34932d;

    /* renamed from: wg.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C13549a extends AbstractC9614s implements Function1<ParameterizedType, ParameterizedType> {

        /* renamed from: j */
        public static final C13549a f34933j = new C13549a();

        C13549a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ParameterizedType invoke(ParameterizedType it) {
            C9612q.m13917h(it, "it");
            Type ownerType = it.getOwnerType();
            if (ownerType instanceof ParameterizedType) {
                return (ParameterizedType) ownerType;
            }
            return null;
        }
    }

    /* renamed from: wg.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C13550b extends AbstractC9614s implements Function1<ParameterizedType, Sequence<? extends Type>> {

        /* renamed from: j */
        public static final C13550b f34934j = new C13550b();

        C13550b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Sequence<Type> invoke(ParameterizedType it) {
            Sequence<Type> m14198u;
            C9612q.m13917h(it, "it");
            Type[] actualTypeArguments = it.getActualTypeArguments();
            C9612q.m13918g(actualTypeArguments, "it.actualTypeArguments");
            m14198u = C9538f.m14198u(actualTypeArguments);
            return m14198u;
        }
    }

    static {
        List<KClass<? extends Object>> m14101l;
        int m14093t;
        Map<Class<? extends Object>, Class<? extends Object>> m6744r;
        int m14093t2;
        Map<Class<? extends Object>, Class<? extends Object>> m6744r2;
        List m14101l2;
        int m14093t3;
        Map<Class<? extends InterfaceC11562g<?>>, Integer> m6744r3;
        int i = 0;
        m14101l = C9545j.m14101l(C9591f0.m13969b(Boolean.TYPE), C9591f0.m13969b(Byte.TYPE), C9591f0.m13969b(Character.TYPE), C9591f0.m13969b(Double.TYPE), C9591f0.m13969b(Float.TYPE), C9591f0.m13969b(Integer.TYPE), C9591f0.m13969b(Long.TYPE), C9591f0.m13969b(Short.TYPE));
        f34929a = m14101l;
        m14093t = C9546k.m14093t(m14101l, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        Iterator<T> it = m14101l.iterator();
        while (it.hasNext()) {
            KClass kClass = (KClass) it.next();
            arrayList.add(C11591x.m7577a(C0156a.m41054c(kClass), C0156a.m41053d(kClass)));
        }
        m6744r = C11889v.m6744r(arrayList);
        f34930b = m6744r;
        List<KClass<? extends Object>> list = f34929a;
        m14093t2 = C9546k.m14093t(list, 10);
        ArrayList arrayList2 = new ArrayList(m14093t2);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            KClass kClass2 = (KClass) it2.next();
            arrayList2.add(C11591x.m7577a(C0156a.m41053d(kClass2), C0156a.m41054c(kClass2)));
        }
        m6744r2 = C11889v.m6744r(arrayList2);
        f34931c = m6744r2;
        m14101l2 = C9545j.m14101l(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, InterfaceC2293n.class, InterfaceC2294o.class, InterfaceC2295p.class, InterfaceC2296q.class, InterfaceC2297r.class, InterfaceC2280a.class, InterfaceC2281b.class, InterfaceC2282c.class, InterfaceC2283d.class, InterfaceC2284e.class, InterfaceC2285f.class, InterfaceC2286g.class, InterfaceC2287h.class, InterfaceC2288i.class, InterfaceC2289j.class, InterfaceC2290k.class, InterfaceC2291l.class, InterfaceC2292m.class);
        m14093t3 = C9546k.m14093t(m14101l2, 10);
        ArrayList arrayList3 = new ArrayList(m14093t3);
        for (Object obj : m14101l2) {
            int i2 = i + 1;
            if (i < 0) {
                C9545j.m14094s();
            }
            arrayList3.add(C11591x.m7577a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        m6744r3 = C11889v.m6744r(arrayList3);
        f34932d = m6744r3;
    }

    /* renamed from: a */
    public static final C11632b m2246a(Class<?> cls) {
        boolean z;
        C11632b m7460m;
        C11632b m2246a;
        C9612q.m13917h(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (!cls.isArray()) {
                if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                    String simpleName = cls.getSimpleName();
                    C9612q.m13918g(simpleName, "simpleName");
                    if (simpleName.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        Class<?> declaringClass = cls.getDeclaringClass();
                        if (declaringClass == null || (m2246a = m2246a(declaringClass)) == null || (m7460m = m2246a.m7469d(C11638f.m7422f(cls.getSimpleName()))) == null) {
                            m7460m = C11632b.m7460m(new C11633c(cls.getName()));
                        }
                        C9612q.m13918g(m7460m, "declaringClass?.classId?…Id.topLevel(FqName(name))");
                        return m7460m;
                    }
                }
                C11633c c11633c = new C11633c(cls.getName());
                return new C11632b(c11633c.m7455e(), C11633c.m7449k(c11633c.m7453g()), true);
            }
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
    }

    /* renamed from: b */
    public static final String m2245b(Class<?> cls) {
        String m13763C;
        String m13763C2;
        C9612q.m13917h(cls, "<this>");
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return "D";
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return "I";
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return "B";
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return "C";
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return "J";
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return "V";
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return "Z";
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return "F";
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return "S";
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported primitive type: " + cls);
        } else if (cls.isArray()) {
            String name2 = cls.getName();
            C9612q.m13918g(name2, "name");
            m13763C2 = C9653o.m13763C(name2, '.', '/', false, 4, null);
            return m13763C2;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('L');
            String name3 = cls.getName();
            C9612q.m13918g(name3, "name");
            m13763C = C9653o.m13763C(name3, '.', '/', false, 4, null);
            sb2.append(m13763C);
            sb2.append(';');
            return sb2.toString();
        }
    }

    /* renamed from: c */
    public static final Integer m2244c(Class<?> cls) {
        C9612q.m13917h(cls, "<this>");
        return f34932d.get(cls);
    }

    /* renamed from: d */
    public static final List<Type> m2243d(Type type) {
        Sequence m4876h;
        Sequence m4856t;
        List<Type> m4867E;
        List<Type> m14197u0;
        List<Type> m14104i;
        C9612q.m13917h(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() == null) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            C9612q.m13918g(actualTypeArguments, "actualTypeArguments");
            m14197u0 = C9538f.m14197u0(actualTypeArguments);
            return m14197u0;
        }
        m4876h = C12545m.m4876h(type, C13549a.f34933j);
        m4856t = C12552o.m4856t(m4876h, C13550b.f34934j);
        m4867E = C12552o.m4867E(m4856t);
        return m4867E;
    }

    /* renamed from: e */
    public static final Class<?> m2242e(Class<?> cls) {
        C9612q.m13917h(cls, "<this>");
        return f34930b.get(cls);
    }

    /* renamed from: f */
    public static final ClassLoader m2241f(Class<?> cls) {
        C9612q.m13917h(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            C9612q.m13918g(systemClassLoader, "getSystemClassLoader()");
            return systemClassLoader;
        }
        return classLoader;
    }

    /* renamed from: g */
    public static final Class<?> m2240g(Class<?> cls) {
        C9612q.m13917h(cls, "<this>");
        return f34931c.get(cls);
    }

    /* renamed from: h */
    public static final boolean m2239h(Class<?> cls) {
        C9612q.m13917h(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
