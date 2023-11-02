package ck;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0004B%\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\u0011"}, m14357d2 = {"Lck/j;", "", "", "closer", "a", "closeGuardInstance", "", "b", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "getMethod", "openMethod", "c", "warnIfOpenMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "d", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: ck.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C2678j {

    /* renamed from: d */
    public static final C2679a f7177d = new C2679a(null);

    /* renamed from: a */
    private final Method f7178a;

    /* renamed from: b */
    private final Method f7179b;

    /* renamed from: c */
    private final Method f7180c;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, m14357d2 = {"Lck/j$a;", "", "Lck/j;", "a", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: ck.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C2679a {
        private C2679a() {
        }

        public /* synthetic */ C2679a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C2678j m32730a() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new C2678j(method, method3, method2);
        }
    }

    public C2678j(Method method, Method method2, Method method3) {
        this.f7178a = method;
        this.f7179b = method2;
        this.f7180c = method3;
    }

    /* renamed from: a */
    public final Object m32732a(String closer) {
        C9612q.m13917h(closer, "closer");
        Method method = this.f7178a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = this.f7179b;
                C9612q.m13920e(method2);
                method2.invoke(invoke, closer);
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m32731b(Object obj) {
        if (obj != null) {
            try {
                Method method = this.f7180c;
                C9612q.m13920e(method);
                method.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }
}
