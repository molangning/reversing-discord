package p407wg;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9612q;

/* renamed from: wg.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class C13545c {

    /* renamed from: a */
    public static final C13545c f34922a = new C13545c();

    /* renamed from: b */
    private static C13546a f34923b;

    /* renamed from: wg.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C13546a {

        /* renamed from: a */
        private final Method f34924a;

        /* renamed from: b */
        private final Method f34925b;

        public C13546a(Method method, Method method2) {
            this.f34924a = method;
            this.f34925b = method2;
        }

        /* renamed from: a */
        public final Method m2252a() {
            return this.f34925b;
        }

        /* renamed from: b */
        public final Method m2251b() {
            return this.f34924a;
        }
    }

    private C13545c() {
    }

    /* renamed from: a */
    public final C13546a m2254a(Member member) {
        C9612q.m13917h(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new C13546a(cls.getMethod("getParameters", new Class[0]), C13548d.m2241f(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C13546a(null, null);
        }
    }

    /* renamed from: b */
    public final List<String> m2253b(Member member) {
        Method m2252a;
        C9612q.m13917h(member, "member");
        C13546a c13546a = f34923b;
        if (c13546a == null) {
            synchronized (this) {
                c13546a = f34923b;
                if (c13546a == null) {
                    c13546a = f34922a.m2254a(member);
                    f34923b = c13546a;
                }
            }
        }
        Method m2251b = c13546a.m2251b();
        if (m2251b == null || (m2252a = c13546a.m2252a()) == null) {
            return null;
        }
        Object invoke = m2251b.invoke(member, new Object[0]);
        C9612q.m13919f(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) invoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object invoke2 = m2252a.invoke(obj, new Object[0]);
            C9612q.m13919f(invoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) invoke2);
        }
        return arrayList;
    }
}
