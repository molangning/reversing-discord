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
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import p328rj.EnumC12312p;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m14357d2 = {"Lbk/j;", "Lbk/k;", "Ljavax/net/ssl/SSLContext;", "n", "Ljavax/net/ssl/X509TrustManager;", "p", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lrj/p;", "protocols", "", "e", "h", "Ljava/security/Provider;", "d", "Ljava/security/Provider;", "provider", "<init>", "()V", "f", "a", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: bk.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C2368j extends C2370k {

    /* renamed from: e */
    private static final boolean f6486e;

    /* renamed from: f */
    public static final C2369a f6487f;

    /* renamed from: d */
    private final Provider f6488d;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m14357d2 = {"Lbk/j$a;", "", "Lbk/j;", "a", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: bk.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C2369a {
        private C2369a() {
        }

        public /* synthetic */ C2369a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C2368j m33612a() {
            if (m33611b()) {
                return new C2368j(null);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m33611b() {
            return C2368j.f6486e;
        }
    }

    static {
        C2369a c2369a = new C2369a(null);
        f6487f = c2369a;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, c2369a.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f6486e = z;
    }

    private C2368j() {
        this.f6488d = new OpenJSSE();
    }

    @Override // p031bk.C2370k
    /* renamed from: e */
    public void mo33606e(SSLSocket sslSocket, String str, List<EnumC12312p> protocols) {
        C9612q.m13917h(sslSocket, "sslSocket");
        C9612q.m13917h(protocols, "protocols");
        if (sslSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket = (org.openjsse.javax.net.ssl.SSLSocket) sslSocket;
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                SSLParameters sSLParameters2 = sSLParameters;
                Object[] array = C2370k.f6491c.m33593b(protocols).toArray(new String[0]);
                if (array != null) {
                    sSLParameters2.setApplicationProtocols((String[]) array);
                    sSLSocket.setSSLParameters(sSLParameters);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            return;
        }
        super.mo33606e(sslSocket, str, protocols);
    }

    @Override // p031bk.C2370k
    /* renamed from: h */
    public String mo33603h(SSLSocket sslSocket) {
        C9612q.m13917h(sslSocket, "sslSocket");
        if (sslSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sslSocket).getApplicationProtocol();
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
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f6488d);
        C9612q.m13918g(sSLContext, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // p031bk.C2370k
    /* renamed from: p */
    public X509TrustManager mo33595p() {
        TrustManagerFactory factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f6488d);
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

    public /* synthetic */ C2368j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}