package p031bk;

import ck.C2669e;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import okio.Buffer;
import p089ek.AbstractC6266c;
import p089ek.C6263a;
import p089ek.C6265b;
import p089ek.InterfaceC6269e;
import p328rj.EnumC12312p;

@Metadata(m14358d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 &2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b,\u0010-J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J&\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00162\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u00012\u0006\u0010 \u001a\u00020\u0002H\u0016J\u001a\u0010#\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0006H\u0016J\u0010\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020\u0006H\u0016J\u0010\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020\u0006H\u0016J\b\u0010+\u001a\u00020\u0002H\u0016¨\u0006/"}, m14357d2 = {"Lbk/k;", "", "", "g", "Ljavax/net/ssl/SSLContext;", "n", "Ljavax/net/ssl/X509TrustManager;", "p", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", "", "Lrj/p;", "protocols", "", "e", "b", "h", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "f", "message", "level", "", "t", "k", "", "j", "closer", "i", "stackTrace", "m", "trustManager", "Lek/c;", "c", "Lek/e;", "d", "Ljavax/net/ssl/SSLSocketFactory;", "o", "toString", "<init>", "()V", "a", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: bk.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class C2370k {

    /* renamed from: a */
    private static volatile C2370k f6489a;

    /* renamed from: b */
    private static final Logger f6490b;

    /* renamed from: c */
    public static final C2371a f6491c;

    @Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, m14357d2 = {"Lbk/k$a;", "", "Lbk/k;", "f", "d", "e", "g", "", "Lrj/p;", "protocols", "", "b", "", "c", "", "j", "()Z", "isConscryptPreferred", "k", "isOpenJSSEPreferred", "i", "isBouncyCastlePreferred", "h", "isAndroid", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "platform", "Lbk/k;", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: bk.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C2371a {
        private C2371a() {
        }

        public /* synthetic */ C2371a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        private final C2370k m33591d() {
            C2669e.f7165c.m32744b();
            C2370k m33633a = C2351b.f6460f.m33633a();
            if (m33633a == null) {
                C2370k m33630a = C2353c.f6463g.m33630a();
                C9612q.m13920e(m33630a);
                return m33630a;
            }
            return m33633a;
        }

        /* renamed from: e */
        private final C2370k m33590e() {
            C2368j m33612a;
            C2356d m33627a;
            C2358e m33623b;
            if (m33585j() && (m33623b = C2358e.f6472f.m33623b()) != null) {
                return m33623b;
            }
            if (m33586i() && (m33627a = C2356d.f6469f.m33627a()) != null) {
                return m33627a;
            }
            if (m33584k() && (m33612a = C2368j.f6487f.m33612a()) != null) {
                return m33612a;
            }
            C2366i m33615a = C2366i.f6485e.m33615a();
            if (m33615a != null) {
                return m33615a;
            }
            C2370k m33619a = C2361f.f6475i.m33619a();
            if (m33619a != null) {
                return m33619a;
            }
            return new C2370k();
        }

        /* renamed from: f */
        public final C2370k m33589f() {
            if (m33587h()) {
                return m33591d();
            }
            return m33590e();
        }

        /* renamed from: i */
        private final boolean m33586i() {
            Provider provider = Security.getProviders()[0];
            C9612q.m13918g(provider, "Security.getProviders()[0]");
            return C9612q.m13922c("BC", provider.getName());
        }

        /* renamed from: j */
        private final boolean m33585j() {
            Provider provider = Security.getProviders()[0];
            C9612q.m13918g(provider, "Security.getProviders()[0]");
            return C9612q.m13922c("Conscrypt", provider.getName());
        }

        /* renamed from: k */
        private final boolean m33584k() {
            Provider provider = Security.getProviders()[0];
            C9612q.m13918g(provider, "Security.getProviders()[0]");
            return C9612q.m13922c("OpenJSSE", provider.getName());
        }

        /* renamed from: b */
        public final List<String> m33593b(List<? extends EnumC12312p> protocols) {
            int m14093t;
            boolean z;
            C9612q.m13917h(protocols, "protocols");
            ArrayList<EnumC12312p> arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((EnumC12312p) obj) != EnumC12312p.HTTP_1_0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            m14093t = C9546k.m14093t(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(m14093t);
            for (EnumC12312p enumC12312p : arrayList) {
                arrayList2.add(enumC12312p.toString());
            }
            return arrayList2;
        }

        /* renamed from: c */
        public final byte[] m33592c(List<? extends EnumC12312p> protocols) {
            C9612q.m13917h(protocols, "protocols");
            Buffer buffer = new Buffer();
            for (String str : m33593b(protocols)) {
                buffer.writeByte(str.length());
                buffer.mo8608K(str);
            }
            return buffer.mo8591f0();
        }

        /* renamed from: g */
        public final C2370k m33588g() {
            return C2370k.f6489a;
        }

        /* renamed from: h */
        public final boolean m33587h() {
            return C9612q.m13922c("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    static {
        C2371a c2371a = new C2371a(null);
        f6491c = c2371a;
        f6489a = c2371a.m33589f();
        f6490b = Logger.getLogger(OkHttpClient.class.getName());
    }

    /* renamed from: l */
    public static /* synthetic */ void m33599l(C2370k c2370k, String str, int i, Throwable th2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 4;
            }
            if ((i2 & 4) != 0) {
                th2 = null;
            }
            c2370k.m33600k(str, i, th2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    /* renamed from: b */
    public void mo33609b(SSLSocket sslSocket) {
        C9612q.m13917h(sslSocket, "sslSocket");
    }

    /* renamed from: c */
    public AbstractC6266c mo33608c(X509TrustManager trustManager) {
        C9612q.m13917h(trustManager, "trustManager");
        return new C6263a(mo33607d(trustManager));
    }

    /* renamed from: d */
    public InterfaceC6269e mo33607d(X509TrustManager trustManager) {
        C9612q.m13917h(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        C9612q.m13918g(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C6265b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: e */
    public void mo33606e(SSLSocket sslSocket, String str, List<EnumC12312p> protocols) {
        C9612q.m13917h(sslSocket, "sslSocket");
        C9612q.m13917h(protocols, "protocols");
    }

    /* renamed from: f */
    public void mo33605f(Socket socket, InetSocketAddress address, int i) {
        C9612q.m13917h(socket, "socket");
        C9612q.m13917h(address, "address");
        socket.connect(address, i);
    }

    /* renamed from: g */
    public final String m33604g() {
        return "OkHttp";
    }

    /* renamed from: h */
    public String mo33603h(SSLSocket sslSocket) {
        C9612q.m13917h(sslSocket, "sslSocket");
        return null;
    }

    /* renamed from: i */
    public Object mo33602i(String closer) {
        C9612q.m13917h(closer, "closer");
        if (f6490b.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    /* renamed from: j */
    public boolean mo33601j(String hostname) {
        C9612q.m13917h(hostname, "hostname");
        return true;
    }

    /* renamed from: k */
    public void m33600k(String message, int i, Throwable th2) {
        Level level;
        C9612q.m13917h(message, "message");
        if (i == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f6490b.log(level, message, th2);
    }

    /* renamed from: m */
    public void mo33598m(String message, Object obj) {
        C9612q.m13917h(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        m33600k(message, 5, (Throwable) obj);
    }

    /* renamed from: n */
    public SSLContext mo33597n() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        C9612q.m13918g(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    /* renamed from: o */
    public SSLSocketFactory mo33596o(X509TrustManager trustManager) {
        C9612q.m13917h(trustManager, "trustManager");
        try {
            SSLContext mo33597n = mo33597n();
            mo33597n.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = mo33597n.getSocketFactory();
            C9612q.m13918g(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    /* renamed from: p */
    public X509TrustManager mo33595p() {
        TrustManagerFactory factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        factory.init((KeyStore) null);
        C9612q.m13918g(factory, "factory");
        TrustManager[] trustManagers = factory.getTrustManagers();
        C9612q.m13920e(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        C9612q.m13918g(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        C9612q.m13918g(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}