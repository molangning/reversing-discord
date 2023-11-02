package p407wg;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C9612q;

/* renamed from: wg.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class C13542b {

    /* renamed from: a */
    public static final C13542b f34912a = new C13542b();

    /* renamed from: b */
    private static C13543a f34913b;

    /* renamed from: wg.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C13543a {

        /* renamed from: a */
        private final Method f34914a;

        /* renamed from: b */
        private final Method f34915b;

        /* renamed from: c */
        private final Method f34916c;

        /* renamed from: d */
        private final Method f34917d;

        public C13543a(Method method, Method method2, Method method3, Method method4) {
            this.f34914a = method;
            this.f34915b = method2;
            this.f34916c = method3;
            this.f34917d = method4;
        }

        /* renamed from: a */
        public final Method m2260a() {
            return this.f34915b;
        }

        /* renamed from: b */
        public final Method m2259b() {
            return this.f34917d;
        }

        /* renamed from: c */
        public final Method m2258c() {
            return this.f34916c;
        }

        /* renamed from: d */
        public final Method m2257d() {
            return this.f34914a;
        }
    }

    private C13542b() {
    }

    /* renamed from: a */
    private final C13543a m2266a() {
        try {
            return new C13543a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C13543a(null, null, null, null);
        }
    }

    /* renamed from: b */
    private final C13543a m2265b() {
        C13543a c13543a = f34913b;
        if (c13543a == null) {
            C13543a m2266a = m2266a();
            f34913b = m2266a;
            return m2266a;
        }
        return c13543a;
    }

    /* renamed from: c */
    public final Class<?>[] m2264c(Class<?> clazz) {
        C9612q.m13917h(clazz, "clazz");
        Method m2260a = m2265b().m2260a();
        if (m2260a == null) {
            return null;
        }
        Object invoke = m2260a.invoke(clazz, new Object[0]);
        C9612q.m13919f(invoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) invoke;
    }

    /* renamed from: d */
    public final Object[] m2263d(Class<?> clazz) {
        C9612q.m13917h(clazz, "clazz");
        Method m2259b = m2265b().m2259b();
        if (m2259b == null) {
            return null;
        }
        return (Object[]) m2259b.invoke(clazz, new Object[0]);
    }

    /* renamed from: e */
    public final Boolean m2262e(Class<?> clazz) {
        C9612q.m13917h(clazz, "clazz");
        Method m2258c = m2265b().m2258c();
        if (m2258c == null) {
            return null;
        }
        Object invoke = m2258c.invoke(clazz, new Object[0]);
        C9612q.m13919f(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }

    /* renamed from: f */
    public final Boolean m2261f(Class<?> clazz) {
        C9612q.m13917h(clazz, "clazz");
        Method m2257d = m2265b().m2257d();
        if (m2257d == null) {
            return null;
        }
        Object invoke = m2257d.invoke(clazz, new Object[0]);
        C9612q.m13919f(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }
}
