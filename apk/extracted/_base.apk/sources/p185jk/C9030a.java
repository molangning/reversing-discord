package p185jk;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* renamed from: jk.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class C9030a {
    /* renamed from: a */
    public static <T> T m16843a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C9030a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* renamed from: b */
    public static boolean m16842b(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (m16841c()) {
                if (collection.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m16841c() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }
}
