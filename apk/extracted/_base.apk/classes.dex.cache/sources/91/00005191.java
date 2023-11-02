package p412x0;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import p185jk.C9030a;

/* renamed from: x0.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C13665g {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C13666a {

        /* renamed from: a */
        static final C13670j f35184a = new C13670j(C13665g.m1890d().getWebkitToCompatConverter());
    }

    /* renamed from: x0.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C13667b {

        /* renamed from: a */
        static final InterfaceC13668h f35185a = C13665g.m1893a();
    }

    /* renamed from: a */
    static InterfaceC13668h m1893a() {
        try {
            return new C13669i((WebViewProviderFactoryBoundaryInterface) C9030a.m16843a(WebViewProviderFactoryBoundaryInterface.class, m1892b()));
        } catch (ClassNotFoundException unused) {
            return new C13660c();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private static InvocationHandler m1892b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, m1889e()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    /* renamed from: c */
    public static C13670j m1891c() {
        return C13666a.f35184a;
    }

    /* renamed from: d */
    public static InterfaceC13668h m1890d() {
        return C13667b.f35185a;
    }

    /* renamed from: e */
    public static ClassLoader m1889e() {
        ClassLoader webViewClassLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            webViewClassLoader = WebView.getWebViewClassLoader();
            return webViewClassLoader;
        }
        return m1888f().getClass().getClassLoader();
    }

    /* renamed from: f */
    private static Object m1888f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}