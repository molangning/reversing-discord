package ck;

import ck.C2683l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;
import p031bk.C2353c;
import p031bk.C2370k;
import p328rj.EnumC12312p;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0003B\u0017\u0012\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001c\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0014\u001a\n \u0012*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0015\u001a\n \u0012*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u001c\u0010\u0019\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, m14357d2 = {"Lck/h;", "Lck/m;", "", "a", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "b", "", "hostname", "", "Lrj/p;", "protocols", "", "d", "c", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "setUseSessionTickets", "kotlin.jvm.PlatformType", "setHostname", "getAlpnSelectedProtocol", "setAlpnProtocols", "Ljava/lang/Class;", "e", "Ljava/lang/Class;", "sslSocketClass", "<init>", "(Ljava/lang/Class;)V", "g", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: ck.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class C2672h implements InterfaceC2685m {

    /* renamed from: f */
    private static final C2683l.InterfaceC2684a f7167f;

    /* renamed from: g */
    public static final C2673a f7168g;

    /* renamed from: a */
    private final Method f7169a;

    /* renamed from: b */
    private final Method f7170b;

    /* renamed from: c */
    private final Method f7171c;

    /* renamed from: d */
    private final Method f7172d;

    /* renamed from: e */
    private final Class<? super SSLSocket> f7173e;

    @Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m14357d2 = {"Lck/h$a;", "", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "actualSSLSocketClass", "Lck/h;", "b", "", "packageName", "Lck/l$a;", "c", "playProviderFactory", "Lck/l$a;", "d", "()Lck/l$a;", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: ck.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C2673a {

        @Metadata(m14358d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m14357d2 = {"ck/h$a$a", "Lck/l$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "Lck/m;", "c", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* renamed from: ck.h$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C2674a implements C2683l.InterfaceC2684a {

            /* renamed from: a */
            final /* synthetic */ String f7174a;

            C2674a(String str) {
                this.f7174a = str;
            }

            @Override // ck.C2683l.InterfaceC2684a
            /* renamed from: b */
            public boolean mo32726b(SSLSocket sslSocket) {
                boolean m13758H;
                C9612q.m13917h(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                C9612q.m13918g(name, "sslSocket.javaClass.name");
                m13758H = C9653o.m13758H(name, this.f7174a + '.', false, 2, null);
                return m13758H;
            }

            @Override // ck.C2683l.InterfaceC2684a
            /* renamed from: c */
            public InterfaceC2685m mo32725c(SSLSocket sslSocket) {
                C9612q.m13917h(sslSocket, "sslSocket");
                return C2672h.f7168g.m32737b(sslSocket.getClass());
            }
        }

        private C2673a() {
        }

        public /* synthetic */ C2673a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final C2672h m32737b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && (!C9612q.m13922c(cls2.getSimpleName(), "OpenSSLSocketImpl"))) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            C9612q.m13920e(cls2);
            return new C2672h(cls2);
        }

        /* renamed from: c */
        public final C2683l.InterfaceC2684a m32736c(String packageName) {
            C9612q.m13917h(packageName, "packageName");
            return new C2674a(packageName);
        }

        /* renamed from: d */
        public final C2683l.InterfaceC2684a m32735d() {
            return C2672h.f7167f;
        }
    }

    static {
        C2673a c2673a = new C2673a(null);
        f7168g = c2673a;
        f7167f = c2673a.m32736c("com.google.android.gms.org.conscrypt");
    }

    public C2672h(Class<? super SSLSocket> sslSocketClass) {
        C9612q.m13917h(sslSocketClass, "sslSocketClass");
        this.f7173e = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        C9612q.m13918g(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f7169a = declaredMethod;
        this.f7170b = sslSocketClass.getMethod("setHostname", String.class);
        this.f7171c = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f7172d = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // ck.InterfaceC2685m
    /* renamed from: a */
    public boolean mo32724a() {
        return C2353c.f6463g.m33629b();
    }

    @Override // ck.InterfaceC2685m
    /* renamed from: b */
    public boolean mo32723b(SSLSocket sslSocket) {
        C9612q.m13917h(sslSocket, "sslSocket");
        return this.f7173e.isInstance(sslSocket);
    }

    @Override // ck.InterfaceC2685m
    /* renamed from: c */
    public String mo32722c(SSLSocket sslSocket) {
        C9612q.m13917h(sslSocket, "sslSocket");
        if (!mo32723b(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f7171c.invoke(sslSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            C9612q.m13918g(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (NullPointerException e2) {
            if (C9612q.m13922c(e2.getMessage(), "ssl == null")) {
                return null;
            }
            throw e2;
        } catch (InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // ck.InterfaceC2685m
    /* renamed from: d */
    public void mo32721d(SSLSocket sslSocket, String str, List<? extends EnumC12312p> protocols) {
        C9612q.m13917h(sslSocket, "sslSocket");
        C9612q.m13917h(protocols, "protocols");
        if (mo32723b(sslSocket)) {
            try {
                this.f7169a.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f7170b.invoke(sslSocket, str);
                }
                this.f7172d.invoke(sslSocket, C2370k.f6491c.m33592c(protocols));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
