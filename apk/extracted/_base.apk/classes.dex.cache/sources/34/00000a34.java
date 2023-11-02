package p031bk;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import p328rj.EnumC12312p;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m14357d2 = {"Lbk/d;", "Lbk/k;", "Ljavax/net/ssl/SSLContext;", "n", "Ljavax/net/ssl/X509TrustManager;", "p", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lrj/p;", "protocols", "", "e", "h", "Ljava/security/Provider;", "d", "Ljava/security/Provider;", "provider", "<init>", "()V", "f", "a", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: bk.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C2356d extends C2370k {

    /* renamed from: e */
    private static final boolean f6468e;

    /* renamed from: f */
    public static final C2357a f6469f;

    /* renamed from: d */
    private final Provider f6470d;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m14357d2 = {"Lbk/d$a;", "", "Lbk/d;", "a", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: bk.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C2357a {
        private C2357a() {
        }

        public /* synthetic */ C2357a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C2356d m33627a() {
            if (m33626b()) {
                return new C2356d(null);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m33626b() {
            return C2356d.f6468e;
        }
    }

    static {
        C2357a c2357a = new C2357a(null);
        f6469f = c2357a;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, c2357a.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f6468e = z;
    }

    private C2356d() {
        this.f6470d = new BouncyCastleJsseProvider();
    }

    @Override // p031bk.C2370k
    /* renamed from: e */
    public void mo33606e(SSLSocket sslSocket, String str, List<EnumC12312p> protocols) {
        C9612q.m13917h(sslSocket, "sslSocket");
        C9612q.m13917h(protocols, "protocols");
        if (sslSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters sslParameters = bCSSLSocket.getParameters();
            List<String> m33593b = C2370k.f6491c.m33593b(protocols);
            C9612q.m13918g(sslParameters, "sslParameters");
            Object[] array = m33593b.toArray(new String[0]);
            if (array != null) {
                sslParameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(sslParameters);
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
        if (sslSocket instanceof BCSSLSocket) {
            String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
            if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
                return null;
            }
            return applicationProtocol;
        }
        return super.mo33603h(sslSocket);
    }

    @Override // p031bk.C2370k
    /* renamed from: n */
    public SSLContext mo33597n() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f6470d);
        C9612q.m13918g(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p031bk.C2370k
    /* renamed from: p */
    public X509TrustManager mo33595p() {
        TrustManagerFactory factory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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

    public /* synthetic */ C2356d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}