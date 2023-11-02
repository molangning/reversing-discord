package p031bk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p328rj.EnumC12312p;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u000bB7\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0014\u0012\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016¨\u0006\u001d"}, m14357d2 = {"Lbk/f;", "Lbk/k;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lrj/p;", "protocols", "", "e", "b", "h", "Ljava/lang/reflect/Method;", "d", "Ljava/lang/reflect/Method;", "putMethod", "getMethod", "f", "removeMethod", "Ljava/lang/Class;", "g", "Ljava/lang/Class;", "clientProviderClass", "serverProviderClass", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "i", "a", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: bk.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C2361f extends C2370k {

    /* renamed from: i */
    public static final C2363b f6475i = new C2363b(null);

    /* renamed from: d */
    private final Method f6476d;

    /* renamed from: e */
    private final Method f6477e;

    /* renamed from: f */
    private final Method f6478f;

    /* renamed from: g */
    private final Class<?> f6479g;

    /* renamed from: h */
    private final Class<?> f6480h;

    @Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m14357d2 = {"Lbk/f$a;", "Ljava/lang/reflect/InvocationHandler;", "", "proxy", "Ljava/lang/reflect/Method;", "method", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "", "a", "Z", "b", "()Z", "setUnsupported", "(Z)V", "unsupported", "", "Ljava/lang/String;", "()Ljava/lang/String;", "setSelected", "(Ljava/lang/String;)V", "selected", "", "c", "Ljava/util/List;", "protocols", "<init>", "(Ljava/util/List;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: bk.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    private static final class C2362a implements InvocationHandler {

        /* renamed from: a */
        private boolean f6481a;

        /* renamed from: b */
        private String f6482b;

        /* renamed from: c */
        private final List<String> f6483c;

        public C2362a(List<String> protocols) {
            C9612q.m13917h(protocols, "protocols");
            this.f6483c = protocols;
        }

        /* renamed from: a */
        public final String m33621a() {
            return this.f6482b;
        }

        /* renamed from: b */
        public final boolean m33620b() {
            return this.f6481a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            boolean z;
            C9612q.m13917h(proxy, "proxy");
            C9612q.m13917h(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (C9612q.m13922c(name, "supports") && C9612q.m13922c(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (C9612q.m13922c(name, "unsupported") && C9612q.m13922c(Void.TYPE, returnType)) {
                this.f6481a = true;
                return null;
            }
            if (C9612q.m13922c(name, "protocols")) {
                if (objArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return this.f6483c;
                }
            }
            if ((C9612q.m13922c(name, "selectProtocol") || C9612q.m13922c(name, "select")) && C9612q.m13922c(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    if (obj != null) {
                        List list = (List) obj;
                        int size = list.size();
                        if (size >= 0) {
                            int i = 0;
                            while (true) {
                                Object obj2 = list.get(i);
                                if (obj2 != null) {
                                    String str = (String) obj2;
                                    if (this.f6483c.contains(str)) {
                                        this.f6482b = str;
                                        return str;
                                    } else if (i == size) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                            }
                        }
                        String str2 = this.f6483c.get(0);
                        this.f6482b = str2;
                        return str2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
            }
            if ((C9612q.m13922c(name, "protocolSelected") || C9612q.m13922c(name, "selected")) && objArr.length == 1) {
                Object obj3 = objArr[0];
                if (obj3 != null) {
                    this.f6482b = (String) obj3;
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0006"}, m14357d2 = {"Lbk/f$b;", "", "Lbk/k;", "a", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: bk.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C2363b {
        private C2363b() {
        }

        public /* synthetic */ C2363b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C2370k m33619a() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                C9612q.m13918g(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod("get", SSLSocket.class);
                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                C9612q.m13918g(putMethod, "putMethod");
                C9612q.m13918g(getMethod, "getMethod");
                C9612q.m13918g(removeMethod, "removeMethod");
                C9612q.m13918g(clientProviderClass, "clientProviderClass");
                C9612q.m13918g(serverProviderClass, "serverProviderClass");
                return new C2361f(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public C2361f(Method putMethod, Method getMethod, Method removeMethod, Class<?> clientProviderClass, Class<?> serverProviderClass) {
        C9612q.m13917h(putMethod, "putMethod");
        C9612q.m13917h(getMethod, "getMethod");
        C9612q.m13917h(removeMethod, "removeMethod");
        C9612q.m13917h(clientProviderClass, "clientProviderClass");
        C9612q.m13917h(serverProviderClass, "serverProviderClass");
        this.f6476d = putMethod;
        this.f6477e = getMethod;
        this.f6478f = removeMethod;
        this.f6479g = clientProviderClass;
        this.f6480h = serverProviderClass;
    }

    @Override // p031bk.C2370k
    /* renamed from: b */
    public void mo33609b(SSLSocket sslSocket) {
        C9612q.m13917h(sslSocket, "sslSocket");
        try {
            this.f6478f.invoke(null, sslSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // p031bk.C2370k
    /* renamed from: e */
    public void mo33606e(SSLSocket sslSocket, String str, List<? extends EnumC12312p> protocols) {
        C9612q.m13917h(sslSocket, "sslSocket");
        C9612q.m13917h(protocols, "protocols");
        try {
            this.f6476d.invoke(null, sslSocket, Proxy.newProxyInstance(C2370k.class.getClassLoader(), new Class[]{this.f6479g, this.f6480h}, new C2362a(C2370k.f6491c.m33593b(protocols))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // p031bk.C2370k
    /* renamed from: h */
    public String mo33603h(SSLSocket sslSocket) {
        C9612q.m13917h(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f6477e.invoke(null, sslSocket));
            if (invocationHandler != null) {
                C2362a c2362a = (C2362a) invocationHandler;
                if (!c2362a.m33620b() && c2362a.m33621a() == null) {
                    C2370k.m33599l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                    return null;
                } else if (c2362a.m33620b()) {
                    return null;
                } else {
                    return c2362a.m33621a();
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}