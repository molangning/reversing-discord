package p218lg;

import ag.C0156a;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import pf.C11577n;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001a$\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001aK\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016²\u0006\u0016\u0010\u0014\u001a\u00020\u0004\"\b\b\u0000\u0010\u000b*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0016\u0010\u0015\u001a\u00020\u0006\"\b\b\u0000\u0010\u000b*\u00020\u00008\nX\u008a\u0084\u0002"}, m14357d2 = {"", "Ljava/lang/Class;", "expectedType", "k", "", "index", "", ZeroconfModule.KEY_SERVICE_NAME, "expectedJvmType", "", "j", "T", "annotationClass", "", "values", "", "Ljava/lang/reflect/Method;", "methods", "d", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "hashCode", "toString", "kotlin-reflection"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: lg.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C10148c {

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "", "T", "", "invoke", "()Ljava/lang/Integer;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: lg.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C10149a extends AbstractC9614s implements Function0<Integer> {

        /* renamed from: j */
        final /* synthetic */ Map<String, Object> f26467j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10149a(Map<String, ? extends Object> map) {
            super(0);
            this.f26467j = map;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            int hashCode;
            Iterator<T> it = this.f26467j.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    hashCode = Arrays.hashCode((boolean[]) value);
                } else if (value instanceof char[]) {
                    hashCode = Arrays.hashCode((char[]) value);
                } else if (value instanceof byte[]) {
                    hashCode = Arrays.hashCode((byte[]) value);
                } else if (value instanceof short[]) {
                    hashCode = Arrays.hashCode((short[]) value);
                } else if (value instanceof int[]) {
                    hashCode = Arrays.hashCode((int[]) value);
                } else if (value instanceof float[]) {
                    hashCode = Arrays.hashCode((float[]) value);
                } else if (value instanceof long[]) {
                    hashCode = Arrays.hashCode((long[]) value);
                } else if (value instanceof double[]) {
                    hashCode = Arrays.hashCode((double[]) value);
                } else {
                    hashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                }
                i += hashCode ^ (str.hashCode() * 127);
            }
            return Integer.valueOf(i);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "T", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: lg.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C10150b extends AbstractC9614s implements Function0<String> {

        /* renamed from: j */
        final /* synthetic */ Class<T> f26468j;

        /* renamed from: k */
        final /* synthetic */ Map<String, Object> f26469k;

        @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m14357d2 = {"", "T", "", "", "entry", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: lg.c$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C10151a extends AbstractC9614s implements Function1<Map.Entry<? extends String, ? extends Object>, CharSequence> {

            /* renamed from: j */
            public static final C10151a f26470j = new C10151a();

            C10151a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final CharSequence invoke(Map.Entry<String, ? extends Object> entry) {
                String obj;
                C9612q.m13917h(entry, "entry");
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    obj = Arrays.toString((boolean[]) value);
                    C9612q.m13918g(obj, "toString(this)");
                } else if (value instanceof char[]) {
                    obj = Arrays.toString((char[]) value);
                    C9612q.m13918g(obj, "toString(this)");
                } else if (value instanceof byte[]) {
                    obj = Arrays.toString((byte[]) value);
                    C9612q.m13918g(obj, "toString(this)");
                } else if (value instanceof short[]) {
                    obj = Arrays.toString((short[]) value);
                    C9612q.m13918g(obj, "toString(this)");
                } else if (value instanceof int[]) {
                    obj = Arrays.toString((int[]) value);
                    C9612q.m13918g(obj, "toString(this)");
                } else if (value instanceof float[]) {
                    obj = Arrays.toString((float[]) value);
                    C9612q.m13918g(obj, "toString(this)");
                } else if (value instanceof long[]) {
                    obj = Arrays.toString((long[]) value);
                    C9612q.m13918g(obj, "toString(this)");
                } else if (value instanceof double[]) {
                    obj = Arrays.toString((double[]) value);
                    C9612q.m13918g(obj, "toString(this)");
                } else if (value instanceof Object[]) {
                    obj = Arrays.toString((Object[]) value);
                    C9612q.m13918g(obj, "toString(this)");
                } else {
                    obj = value.toString();
                }
                return key + '=' + obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10150b(Class<T> cls, Map<String, ? extends Object> map) {
            super(0);
            this.f26468j = cls;
            this.f26469k = map;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Class<T> cls = this.f26468j;
            Map<String, Object> map = this.f26469k;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('@');
            sb2.append(cls.getCanonicalName());
            C9553r.m14048b0(map.entrySet(), sb2, ", ", "(", ")", 0, null, C10151a.f26470j, 48, null);
            String sb3 = sb2.toString();
            C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
    }

    /* renamed from: d */
    public static final <T> T m12169d(Class<T> annotationClass, Map<String, ? extends Object> values, List<Method> methods) {
        Lazy m7601a;
        Lazy m7601a2;
        C9612q.m13917h(annotationClass, "annotationClass");
        C9612q.m13917h(values, "values");
        C9612q.m13917h(methods, "methods");
        m7601a = C11577n.m7601a(new C10149a(values));
        m7601a2 = C11577n.m7601a(new C10150b(annotationClass, values));
        T t = (T) Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new C10147b(annotationClass, values, m7601a2, m7601a, methods));
        C9612q.m13919f(t, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return t;
    }

    /* renamed from: e */
    public static /* synthetic */ Object m12168e(Class cls, Map map, List list, int i, Object obj) {
        int m14093t;
        if ((i & 4) != 0) {
            Set<String> keySet = map.keySet();
            m14093t = C9546k.m14093t(keySet, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (String str : keySet) {
                arrayList.add(cls.getDeclaredMethod(str, new Class[0]));
            }
            list = arrayList;
        }
        return m12169d(cls, map, list);
    }

    /* renamed from: f */
    private static final <T> boolean m12167f(Class<T> cls, List<Method> list, Map<String, ? extends Object> map, Object obj) {
        Annotation annotation;
        boolean m13922c;
        boolean z;
        KClass m41056a;
        Class cls2 = null;
        if (obj instanceof Annotation) {
            annotation = (Annotation) obj;
        } else {
            annotation = null;
        }
        if (annotation != null && (m41056a = C0156a.m41056a(annotation)) != null) {
            cls2 = C0156a.m41055b(m41056a);
        }
        if (!C9612q.m13922c(cls2, cls)) {
            return false;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Method method : list) {
                Object obj2 = map.get(method.getName());
                Object invoke = method.invoke(obj, new Object[0]);
                if (obj2 instanceof boolean[]) {
                    C9612q.m13919f(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                    m13922c = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                    continue;
                } else if (obj2 instanceof char[]) {
                    C9612q.m13919f(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                    m13922c = Arrays.equals((char[]) obj2, (char[]) invoke);
                    continue;
                } else if (obj2 instanceof byte[]) {
                    C9612q.m13919f(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                    m13922c = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                    continue;
                } else if (obj2 instanceof short[]) {
                    C9612q.m13919f(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                    m13922c = Arrays.equals((short[]) obj2, (short[]) invoke);
                    continue;
                } else if (obj2 instanceof int[]) {
                    C9612q.m13919f(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                    m13922c = Arrays.equals((int[]) obj2, (int[]) invoke);
                    continue;
                } else if (obj2 instanceof float[]) {
                    C9612q.m13919f(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                    m13922c = Arrays.equals((float[]) obj2, (float[]) invoke);
                    continue;
                } else if (obj2 instanceof long[]) {
                    C9612q.m13919f(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                    m13922c = Arrays.equals((long[]) obj2, (long[]) invoke);
                    continue;
                } else if (obj2 instanceof double[]) {
                    C9612q.m13919f(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                    m13922c = Arrays.equals((double[]) obj2, (double[]) invoke);
                    continue;
                } else if (obj2 instanceof Object[]) {
                    C9612q.m13919f(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                    m13922c = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                    continue;
                } else {
                    m13922c = C9612q.m13922c(obj2, invoke);
                    continue;
                }
                if (!m13922c) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (!z) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static final int m12166g(Lazy<Integer> lazy) {
        return lazy.getValue().intValue();
    }

    /* renamed from: h */
    private static final String m12165h(Lazy<String> lazy) {
        return lazy.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0069, code lost:
        if (r9.length == 1) goto L26;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m12164i(java.lang.Class r2, java.util.Map r3, kotlin.Lazy r4, kotlin.Lazy r5, java.util.List r6, java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) {
        /*
            java.lang.String r7 = "$annotationClass"
            kotlin.jvm.internal.C9612q.m13917h(r2, r7)
            java.lang.String r7 = "$values"
            kotlin.jvm.internal.C9612q.m13917h(r3, r7)
            java.lang.String r7 = "$toString$delegate"
            kotlin.jvm.internal.C9612q.m13917h(r4, r7)
            java.lang.String r7 = "$hashCode$delegate"
            kotlin.jvm.internal.C9612q.m13917h(r5, r7)
            java.lang.String r7 = "$methods"
            kotlin.jvm.internal.C9612q.m13917h(r6, r7)
            java.lang.String r7 = r8.getName()
            if (r7 == 0) goto L5c
            int r0 = r7.hashCode()
            r1 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r0 == r1) goto L4e
            r4 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r0 == r4) goto L3c
            r4 = 1444986633(0x5620bf09, float:4.4185588E13)
            if (r0 == r4) goto L33
            goto L5c
        L33:
            java.lang.String r4 = "annotationType"
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L8b
            goto L5c
        L3c:
            java.lang.String r4 = "hashCode"
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L45
            goto L5c
        L45:
            int r2 = m12166g(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L8b
        L4e:
            java.lang.String r5 = "toString"
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L57
            goto L5c
        L57:
            java.lang.String r2 = m12165h(r4)
            goto L8b
        L5c:
            java.lang.String r4 = "equals"
            boolean r4 = kotlin.jvm.internal.C9612q.m13922c(r7, r4)
            r5 = 0
            if (r4 == 0) goto L81
            if (r9 == 0) goto L6c
            int r4 = r9.length
            r0 = 1
            if (r4 != r0) goto L6c
            goto L6d
        L6c:
            r0 = r5
        L6d:
            if (r0 == 0) goto L81
            java.lang.String r4 = "args"
            kotlin.jvm.internal.C9612q.m13918g(r9, r4)
            java.lang.Object r4 = kotlin.collections.C9533b.m14308h0(r9)
            boolean r2 = m12167f(r2, r6, r3, r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L8b
        L81:
            boolean r2 = r3.containsKey(r7)
            if (r2 == 0) goto L8c
            java.lang.Object r2 = r3.get(r7)
        L8b:
            return r2
        L8c:
            kg.h0 r2 = new kg.h0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Method is not supported: "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r4 = " (args: "
            r3.append(r4)
            if (r9 != 0) goto La4
            java.lang.Object[] r9 = new java.lang.Object[r5]
        La4:
            java.util.List r4 = kotlin.collections.C9533b.m14285u0(r9)
            r3.append(r4)
            r4 = 41
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p218lg.C10148c.m12164i(java.lang.Class, java.util.Map, kotlin.Lazy, kotlin.Lazy, java.util.List, java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    /* renamed from: j */
    public static final Void m12163j(int i, String str, Class<?> cls) {
        KClass m41052e;
        String mo13884i;
        if (C9612q.m13922c(cls, Class.class)) {
            m41052e = C9591f0.m13969b(KClass.class);
        } else if (cls.isArray() && C9612q.m13922c(cls.getComponentType(), Class.class)) {
            m41052e = C9591f0.m13969b(KClass[].class);
        } else {
            m41052e = C0156a.m41052e(cls);
        }
        if (C9612q.m13922c(m41052e.mo13884i(), C9591f0.m13969b(Object[].class).mo13884i())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m41052e.mo13884i());
            sb2.append('<');
            Class<?> componentType = C0156a.m41055b(m41052e).getComponentType();
            C9612q.m13918g(componentType, "kotlinClass.java.componentType");
            sb2.append(C0156a.m41052e(componentType).mo13884i());
            sb2.append('>');
            mo13884i = sb2.toString();
        } else {
            mo13884i = m41052e.mo13884i();
        }
        throw new IllegalArgumentException("Argument #" + i + ' ' + str + " is not of the required type " + mo13884i);
    }

    /* renamed from: k */
    public static final Object m12162k(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof KClass) {
            obj = C0156a.m41055b((KClass) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof KClass[]) {
                C9612q.m13919f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                KClass[] kClassArr = (KClass[]) obj;
                ArrayList arrayList = new ArrayList(kClassArr.length);
                for (KClass kClass : kClassArr) {
                    arrayList.add(C0156a.m41055b(kClass));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (!cls.isInstance(obj)) {
            return null;
        }
        return obj;
    }
}