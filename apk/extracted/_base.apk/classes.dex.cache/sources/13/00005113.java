package p407wg;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C9612q;

/* renamed from: wg.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class C13539a {

    /* renamed from: a */
    public static final C13539a f34907a = new C13539a();

    /* renamed from: b */
    private static C13540a f34908b;

    /* renamed from: wg.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C13540a {

        /* renamed from: a */
        private final Method f34909a;

        /* renamed from: b */
        private final Method f34910b;

        public C13540a(Method method, Method method2) {
            this.f34909a = method;
            this.f34910b = method2;
        }

        /* renamed from: a */
        public final Method m2269a() {
            return this.f34910b;
        }

        /* renamed from: b */
        public final Method m2268b() {
            return this.f34909a;
        }
    }

    private C13539a() {
    }

    /* renamed from: a */
    private final C13540a m2273a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C13540a(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C13540a(null, null);
        }
    }

    /* renamed from: b */
    private final C13540a m2272b(Object obj) {
        C13540a c13540a = f34908b;
        if (c13540a == null) {
            C13540a m2273a = m2273a(obj);
            f34908b = m2273a;
            return m2273a;
        }
        return c13540a;
    }

    /* renamed from: c */
    public final Method m2271c(Object recordComponent) {
        C9612q.m13917h(recordComponent, "recordComponent");
        Method m2269a = m2272b(recordComponent).m2269a();
        if (m2269a == null) {
            return null;
        }
        Object invoke = m2269a.invoke(recordComponent, new Object[0]);
        C9612q.m13919f(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) invoke;
    }

    /* renamed from: d */
    public final Class<?> m2270d(Object recordComponent) {
        C9612q.m13917h(recordComponent, "recordComponent");
        Method m2268b = m2272b(recordComponent).m2268b();
        if (m2268b == null) {
            return null;
        }
        Object invoke = m2268b.invoke(recordComponent, new Object[0]);
        C9612q.m13919f(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) invoke;
    }
}