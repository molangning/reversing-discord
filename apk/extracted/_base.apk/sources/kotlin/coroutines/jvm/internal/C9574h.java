package kotlin.coroutines.jvm.internal;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000e"}, m14357d2 = {"Lkotlin/coroutines/jvm/internal/h;", "", "Lkotlin/coroutines/jvm/internal/a;", "continuation", "Lkotlin/coroutines/jvm/internal/h$a;", "a", "", "b", "Lkotlin/coroutines/jvm/internal/h$a;", "notOnJava9", "c", "cache", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlin.coroutines.jvm.internal.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9574h {

    /* renamed from: a */
    public static final C9574h f25320a = new C9574h();

    /* renamed from: b */
    private static final C9575a f25321b = new C9575a(null, null, null);

    /* renamed from: c */
    private static C9575a f25322c;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\f"}, m14357d2 = {"Lkotlin/coroutines/jvm/internal/h$a;", "", "Ljava/lang/reflect/Method;", "a", "Ljava/lang/reflect/Method;", "getModuleMethod", "b", "getDescriptorMethod", "c", "nameMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.coroutines.jvm.internal.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9575a {

        /* renamed from: a */
        public final Method f25323a;

        /* renamed from: b */
        public final Method f25324b;

        /* renamed from: c */
        public final Method f25325c;

        public C9575a(Method method, Method method2, Method method3) {
            this.f25323a = method;
            this.f25324b = method2;
            this.f25325c = method3;
        }
    }

    private C9574h() {
    }

    /* renamed from: a */
    private final C9575a m13975a(AbstractC9567a abstractC9567a) {
        try {
            C9575a c9575a = new C9575a(Class.class.getDeclaredMethod("getModule", new Class[0]), abstractC9567a.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), abstractC9567a.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(ZeroconfModule.KEY_SERVICE_NAME, new Class[0]));
            f25322c = c9575a;
            return c9575a;
        } catch (Exception unused) {
            C9575a c9575a2 = f25321b;
            f25322c = c9575a2;
            return c9575a2;
        }
    }

    /* renamed from: b */
    public final String m13974b(AbstractC9567a continuation) {
        Object obj;
        Object obj2;
        Object obj3;
        C9612q.m13917h(continuation, "continuation");
        C9575a c9575a = f25322c;
        if (c9575a == null) {
            c9575a = m13975a(continuation);
        }
        if (c9575a == f25321b) {
            return null;
        }
        Method method = c9575a.f25323a;
        if (method != null) {
            obj = method.invoke(continuation.getClass(), new Object[0]);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        Method method2 = c9575a.f25324b;
        if (method2 != null) {
            obj2 = method2.invoke(obj, new Object[0]);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        Method method3 = c9575a.f25325c;
        if (method3 != null) {
            obj3 = method3.invoke(obj2, new Object[0]);
        } else {
            obj3 = null;
        }
        if (!(obj3 instanceof String)) {
            return null;
        }
        return (String) obj3;
    }
}
