package kotlin.jvm.internal;

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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.reflect.KClass;
import kotlin.text.C9654p;
import p304qf.C11888u;
import p304qf.C11889v;
import pf.C11591x;
import pf.InterfaceC11562g;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001bB\u0013\u0012\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0017J\u0013\u0010\b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001e\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001c"}, m14357d2 = {"Lkotlin/jvm/internal/h;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/g;", "value", "", "d", "other", "equals", "", "hashCode", "", "toString", "Ljava/lang/Class;", "j", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "jClass", "l", "()Ljava/lang/String;", "simpleName", "i", "qualifiedName", "<init>", "(Ljava/lang/Class;)V", "k", "a", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlin.jvm.internal.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9594h implements KClass<Object>, InterfaceC9592g {

    /* renamed from: k */
    public static final C9595a f25339k = new C9595a(null);

    /* renamed from: l */
    private static final Map<Class<? extends InterfaceC11562g<?>>, Integer> f25340l;

    /* renamed from: m */
    private static final HashMap<String, String> f25341m;

    /* renamed from: n */
    private static final HashMap<String, String> f25342n;

    /* renamed from: o */
    private static final HashMap<String, String> f25343o;

    /* renamed from: p */
    private static final Map<String, String> f25344p;

    /* renamed from: j */
    private final Class<?> f25345j;

    @Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002R,\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0002\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR0\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R0\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R0\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e¨\u0006\u0018"}, m14357d2 = {"Lkotlin/jvm/internal/h$a;", "", "Ljava/lang/Class;", "jClass", "", "b", "a", "value", "", "c", "", "Lpf/g;", "", "FUNCTION_CLASSES", "Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "classFqNames", "Ljava/util/HashMap;", "primitiveFqNames", "primitiveWrapperFqNames", "simpleNames", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.jvm.internal.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9595a {
        private C9595a() {
        }

        public /* synthetic */ C9595a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m13950a(Class<?> jClass) {
            String str;
            C9612q.m13917h(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (jClass.isArray()) {
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) C9594h.f25343o.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return "kotlin.Array";
                }
                return str2;
            }
            String str3 = (String) C9594h.f25343o.get(jClass.getName());
            if (str3 == null) {
                return jClass.getCanonicalName();
            }
            return str3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
            if (r2 == null) goto L12;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String m13949b(java.lang.Class<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.C9612q.m13917h(r8, r0)
                boolean r0 = r8.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Lb6
            Le:
                boolean r0 = r8.isLocalClass()
                if (r0 == 0) goto L6c
                java.lang.String r0 = r8.getSimpleName()
                java.lang.reflect.Method r2 = r8.getEnclosingMethod()
                r3 = 2
                r4 = 36
                java.lang.String r5 = "name"
                if (r2 == 0) goto L43
                kotlin.jvm.internal.C9612q.m13918g(r0, r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = r2.getName()
                r6.append(r2)
                r6.append(r4)
                java.lang.String r2 = r6.toString()
                java.lang.String r2 = kotlin.text.C9642f.m13832K0(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L40
                goto L43
            L40:
                r1 = r2
                goto Lb6
            L43:
                java.lang.reflect.Constructor r8 = r8.getEnclosingConstructor()
                if (r8 == 0) goto L64
                kotlin.jvm.internal.C9612q.m13918g(r0, r5)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r8 = r8.getName()
                r2.append(r8)
                r2.append(r4)
                java.lang.String r8 = r2.toString()
                java.lang.String r1 = kotlin.text.C9642f.m13832K0(r0, r8, r1, r3, r1)
                goto Lb6
            L64:
                kotlin.jvm.internal.C9612q.m13918g(r0, r5)
                java.lang.String r1 = kotlin.text.C9642f.m13833J0(r0, r4, r1, r3, r1)
                goto Lb6
            L6c:
                boolean r0 = r8.isArray()
                if (r0 == 0) goto La1
                java.lang.Class r8 = r8.getComponentType()
                boolean r0 = r8.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L9e
                java.util.Map r0 = kotlin.jvm.internal.C9594h.m13951q()
                java.lang.String r8 = r8.getName()
                java.lang.Object r8 = r0.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L9e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                r0.append(r2)
                java.lang.String r8 = r0.toString()
                r1 = r8
            L9e:
                if (r1 != 0) goto Lb6
                goto L40
            La1:
                java.util.Map r0 = kotlin.jvm.internal.C9594h.m13951q()
                java.lang.String r1 = r8.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb6
                java.lang.String r1 = r8.getSimpleName()
            Lb6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C9594h.C9595a.m13949b(java.lang.Class):java.lang.String");
        }

        /* renamed from: c */
        public final boolean m13948c(Object obj, Class<?> jClass) {
            C9612q.m13917h(jClass, "jClass");
            Map map = C9594h.f25340l;
            C9612q.m13919f(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return C9604l0.m13933i(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = C0156a.m41054c(C0156a.m41052e(jClass));
            }
            return jClass.isInstance(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List m14101l;
        int m14093t;
        Map<Class<? extends InterfaceC11562g<?>>, Integer> m6744r;
        int m6758d;
        String m13730M0;
        String m13730M02;
        int i = 0;
        m14101l = C9545j.m14101l(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, InterfaceC2293n.class, InterfaceC2294o.class, InterfaceC2295p.class, InterfaceC2296q.class, InterfaceC2297r.class, InterfaceC2280a.class, InterfaceC2281b.class, InterfaceC2282c.class, InterfaceC2283d.class, InterfaceC2284e.class, InterfaceC2285f.class, InterfaceC2286g.class, InterfaceC2287h.class, InterfaceC2288i.class, InterfaceC2289j.class, InterfaceC2290k.class, InterfaceC2291l.class, InterfaceC2292m.class);
        m14093t = C9546k.m14093t(m14101l, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (Object obj : m14101l) {
            int i2 = i + 1;
            if (i < 0) {
                C9545j.m14094s();
            }
            arrayList.add(C11591x.m7577a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        m6744r = C11889v.m6744r(arrayList);
        f25340l = m6744r;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f25341m = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f25342n = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C9612q.m13918g(values, "primitiveFqNames.values");
        for (String kotlinName : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            C9612q.m13918g(kotlinName, "kotlinName");
            m13730M02 = C9654p.m13730M0(kotlinName, '.', null, 2, null);
            sb2.append(m13730M02);
            sb2.append("CompanionObject");
            Pair m7577a = C11591x.m7577a(sb2.toString(), kotlinName + ".Companion");
            hashMap3.put(m7577a.m14349c(), m7577a.m14348d());
        }
        for (Map.Entry<Class<? extends InterfaceC11562g<?>>, Integer> entry : f25340l.entrySet()) {
            int intValue = entry.getValue().intValue();
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + intValue);
        }
        f25343o = hashMap3;
        m6758d = C11888u.m6758d(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(m6758d);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            m13730M0 = C9654p.m13730M0((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, m13730M0);
        }
        f25344p = linkedHashMap;
    }

    public C9594h(Class<?> jClass) {
        C9612q.m13917h(jClass, "jClass");
        this.f25345j = jClass;
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: d */
    public boolean mo13885d(Object obj) {
        return f25339k.m13948c(obj, mo13896e());
    }

    @Override // kotlin.jvm.internal.InterfaceC9592g
    /* renamed from: e */
    public Class<?> mo13896e() {
        return this.f25345j;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9594h) && C9612q.m13922c(C0156a.m41054c(this), C0156a.m41054c((KClass) obj));
    }

    public int hashCode() {
        return C0156a.m41054c(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: i */
    public String mo13884i() {
        return f25339k.m13950a(mo13896e());
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: l */
    public String mo13883l() {
        return f25339k.m13949b(mo13896e());
    }

    public String toString() {
        return mo13896e().toString() + " (Kotlin reflection is not available)";
    }
}
