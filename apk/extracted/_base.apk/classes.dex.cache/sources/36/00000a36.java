package p031bk;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import p328rj.EnumC12312p;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004H\u0016R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, m14357d2 = {"Lbk/e;", "Lbk/k;", "Ljavax/net/ssl/SSLContext;", "n", "Ljavax/net/ssl/X509TrustManager;", "p", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lrj/p;", "protocols", "", "e", "h", "trustManager", "Ljavax/net/ssl/SSLSocketFactory;", "o", "Ljava/security/Provider;", "d", "Ljava/security/Provider;", "provider", "<init>", "()V", "f", "a", "b", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: bk.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C2358e extends C2370k {

    /* renamed from: e */
    private static final boolean f6471e;

    /* renamed from: f */
    public static final C2359a f6472f;

    /* renamed from: d */
    private final Provider f6473d;

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m14357d2 = {"Lbk/e$a;", "", "Lbk/e;", "b", "", "major", "minor", "patch", "", "a", "isSupported", "Z", "c", "()Z", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: bk.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C2359a {
        private C2359a() {
        }

        public /* synthetic */ C2359a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m33624a(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != i) {
                if (version.major() > i) {
                    return true;
                }
                return false;
            } else if (version.minor() != i2) {
                if (version.minor() > i2) {
                    return true;
                }
                return false;
            } else if (version.patch() >= i3) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: b */
        public final C2358e m33623b() {
            if (m33622c()) {
                return new C2358e(null);
            }
            return null;
        }

        /* renamed from: c */
        public final boolean m33622c() {
            return C2358e.f6471e;
        }
    }

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m14357d2 = {"Lbk/e$b;", "Lorg/conscrypt/ConscryptHostnameVerifier;", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: bk.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C2360b implements ConscryptHostnameVerifier {

        /* renamed from: a */
        public static final C2360b f6474a = new C2360b();

        private C2360b() {
        }
    }

    static {
        C2359a c2359a = new C2359a(null);
        f6472f = c2359a;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, c2359a.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (c2359a.m33624a(2, 1, 0)) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f6471e = z;
    }

    private C2358e() {
        Provider newProvider = Conscrypt.newProvider();
        C9612q.m13918g(newProvider, "Conscrypt.newProvider()");
        this.f6473d = newProvider;
    }

    @Override // p031bk.C2370k
    /* renamed from: e */
    public void mo33606e(SSLSocket sslSocket, String str, List<EnumC12312p> protocols) {
        C9612q.m13917h(sslSocket, "sslSocket");
        C9612q.m13917h(protocols, "protocols");
        if (Conscrypt.isConscrypt(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Object[] array = C2370k.f6491c.m33593b(protocols).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        super.mo33606e(sslSocket, str, protocols);
    }

    @Override // p031bk.C2370k
    /* renamed from: h */
    public String mo33603h(SSLSocket sslSocket) {
        C9612q.m13917h(sslSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return super.mo33603h(sslSocket);
    }

    @Override // p031bk.C2370k
    /* renamed from: n */
    public SSLContext mo33597n() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f6473d);
        C9612q.m13918g(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p031bk.C2370k
    /* renamed from: o */
    public SSLSocketFactory mo33596o(X509TrustManager trustManager) {
        C9612q.m13917h(trustManager, "trustManager");
        SSLContext mo33597n = mo33597n();
        mo33597n.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = mo33597n.getSocketFactory();
        C9612q.m13918g(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // p031bk.C2370k
    /* renamed from: p */
    public X509TrustManager mo33595p() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        C9612q.m13918g(trustManagerFactory, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        C9612q.m13920e(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, C2360b.f6474a);
                return x509TrustManager;
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

    public /* synthetic */ C2358e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}