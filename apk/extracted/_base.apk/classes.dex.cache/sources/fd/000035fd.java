package p140hg;

import ag.C0156a;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.InterfaceC9613r;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.sequences.Sequence;
import kotlin.text.C9653o;
import pf.C11581q;
import si.C12545m;
import si.C12552o;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003\u001a\"\u0010\n\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0003\u001a\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002\"\u001e\u0010\u0012\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0012\u001a\u00020\u0003*\u00020\b8BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m14357d2 = {"Lkotlin/reflect/KType;", "", "forceWrapper", "Ljava/lang/reflect/Type;", "c", "Ljava/lang/Class;", "jClass", "", "Lhg/j;", "arguments", "e", "type", "", "h", "g", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "javaType", "f", "(Lhg/j;)Ljava/lang/reflect/Type;", "(Lhg/j;)V", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: hg.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7149n {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: hg.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C7150a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19508a;

        static {
            int[] iArr = new int[EnumC7145k.values().length];
            try {
                iArr[EnumC7145k.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7145k.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7145k.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19508a = iArr;
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: hg.n$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C7151b extends C9609n implements Function1<Class<?>, Class<?>> {

        /* renamed from: j */
        public static final C7151b f19509j = new C7151b();

        C7151b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final Class<?> invoke(Class<?> p0) {
            C9612q.m13917h(p0, "p0");
            return p0.getComponentType();
        }
    }

    /* renamed from: c */
    public static final Type m21373c(KType kType, boolean z) {
        Class m41055b;
        Object m14031s0;
        int i;
        InterfaceC7130c mo13879j = kType.mo13879j();
        if (mo13879j instanceof InterfaceC7141i) {
            return new C7148m((InterfaceC7141i) mo13879j);
        }
        if (mo13879j instanceof KClass) {
            KClass kClass = (KClass) mo13879j;
            if (z) {
                m41055b = C0156a.m41054c(kClass);
            } else {
                m41055b = C0156a.m41055b(kClass);
            }
            List<C7142j> mo13878k = kType.mo13878k();
            if (mo13878k.isEmpty()) {
                return m41055b;
            }
            if (m41055b.isArray()) {
                if (m41055b.getComponentType().isPrimitive()) {
                    return m41055b;
                }
                m14031s0 = C9553r.m14031s0(mo13878k);
                C7142j c7142j = (C7142j) m14031s0;
                if (c7142j != null) {
                    EnumC7145k m21385a = c7142j.m21385a();
                    KType m21384b = c7142j.m21384b();
                    if (m21385a == null) {
                        i = -1;
                    } else {
                        i = C7150a.f19508a[m21385a.ordinal()];
                    }
                    if (i != -1 && i != 1) {
                        if (i != 2 && i != 3) {
                            throw new C11581q();
                        }
                        C9612q.m13920e(m21384b);
                        Type m21372d = m21372d(m21384b, false, 1, null);
                        if (!(m21372d instanceof Class)) {
                            return new C7128a(m21372d);
                        }
                        return m41055b;
                    }
                    return m41055b;
                }
                throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + kType);
            }
            return m21371e(m41055b, mo13878k);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + kType);
    }

    /* renamed from: d */
    static /* synthetic */ Type m21372d(KType kType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m21373c(kType, z);
    }

    /* renamed from: e */
    private static final Type m21371e(Class<?> cls, List<C7142j> list) {
        int m14093t;
        int m14093t2;
        int m14093t3;
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            m14093t3 = C9546k.m14093t(list, 10);
            ArrayList arrayList = new ArrayList(m14093t3);
            for (C7142j c7142j : list) {
                arrayList.add(m21370f(c7142j));
            }
            return new C7146l(cls, null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            m14093t2 = C9546k.m14093t(list, 10);
            ArrayList arrayList2 = new ArrayList(m14093t2);
            for (C7142j c7142j2 : list) {
                arrayList2.add(m21370f(c7142j2));
            }
            return new C7146l(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type m21371e = m21371e(declaringClass, list.subList(length, list.size()));
            List<C7142j> subList = list.subList(0, length);
            m14093t = C9546k.m14093t(subList, 10);
            ArrayList arrayList3 = new ArrayList(m14093t);
            for (C7142j c7142j3 : subList) {
                arrayList3.add(m21370f(c7142j3));
            }
            return new C7146l(cls, m21371e, arrayList3);
        }
    }

    /* renamed from: f */
    private static final Type m21370f(C7142j c7142j) {
        EnumC7145k m21382d = c7142j.m21382d();
        if (m21382d == null) {
            return C7152o.f19510l.m21365a();
        }
        KType m21383c = c7142j.m21383c();
        C9612q.m13920e(m21383c);
        int i = C7150a.f19508a[m21382d.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new C7152o(m21373c(m21383c, true), null);
                }
                throw new C11581q();
            }
            return m21373c(m21383c, true);
        }
        return new C7152o(null, m21373c(m21383c, true));
    }

    /* renamed from: g */
    public static final Type m21369g(KType kType) {
        Type mo13899c;
        C9612q.m13917h(kType, "<this>");
        if ((kType instanceof InterfaceC9613r) && (mo13899c = ((InterfaceC9613r) kType).mo13899c()) != null) {
            return mo13899c;
        }
        return m21372d(kType, false, 1, null);
    }

    /* renamed from: h */
    public static final String m21368h(Type type) {
        String name;
        Sequence m4876h;
        Object m4852x;
        int m4862n;
        String m13748z;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                m4876h = C12545m.m4876h(type, C7151b.f19509j);
                StringBuilder sb2 = new StringBuilder();
                m4852x = C12552o.m4852x(m4876h);
                sb2.append(((Class) m4852x).getName());
                m4862n = C12552o.m4862n(m4876h);
                m13748z = C9653o.m13748z("[]", m4862n);
                sb2.append(m13748z);
                name = sb2.toString();
            } else {
                name = cls.getName();
            }
            C9612q.m13918g(name, "{\n        if (type.isArr…   } else type.name\n    }");
            return name;
        }
        return type.toString();
    }
}