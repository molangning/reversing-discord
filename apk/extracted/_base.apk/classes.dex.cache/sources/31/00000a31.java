package p031bk;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import ck.C2667d;
import ck.C2672h;
import ck.C2675i;
import ck.C2678j;
import ck.C2680k;
import ck.C2683l;
import ck.C2686n;
import ck.InterfaceC2685m;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p089ek.AbstractC6266c;
import p089ek.InterfaceC6269e;
import p328rj.EnumC12312p;

@Metadata(m14358d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0007¢\u0006\u0004\b'\u0010(J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u001a\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%¨\u0006,"}, m14357d2 = {"Lbk/c;", "Lbk/k;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "", "f", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lrj/p;", "protocols", "e", "h", "closer", "", "i", "message", "stackTrace", "m", "", "j", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lek/c;", "c", "Lek/e;", "d", "Lck/m;", "Ljava/util/List;", "socketAdapters", "Lck/j;", "Lck/j;", "closeGuard", "<init>", "()V", "g", "a", "b", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: bk.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C2353c extends C2370k {

    /* renamed from: f */
    private static final boolean f6462f;

    /* renamed from: g */
    public static final C2354a f6463g = new C2354a(null);

    /* renamed from: d */
    private final List<InterfaceC2685m> f6464d;

    /* renamed from: e */
    private final C2678j f6465e;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m14357d2 = {"Lbk/c$a;", "", "Lbk/k;", "a", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: bk.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C2354a {
        private C2354a() {
        }

        public /* synthetic */ C2354a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C2370k m33630a() {
            if (m33629b()) {
                return new C2353c();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m33629b() {
            return C2353c.f6462f;
        }
    }

    @Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m14357d2 = {"Lbk/c$b;", "Lek/e;", "Ljava/security/cert/X509Certificate;", "cert", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "findByIssuerAndSignatureMethod", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: bk.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C2355b implements InterfaceC6269e {

        /* renamed from: a */
        private final X509TrustManager f6466a;

        /* renamed from: b */
        private final Method f6467b;

        public C2355b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            C9612q.m13917h(trustManager, "trustManager");
            C9612q.m13917h(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f6466a = trustManager;
            this.f6467b = findByIssuerAndSignatureMethod;
        }

        @Override // p089ek.InterfaceC6269e
        /* renamed from: a */
        public X509Certificate mo23120a(X509Certificate cert) {
            C9612q.m13917h(cert, "cert");
            try {
                Object invoke = this.f6467b.invoke(this.f6466a, cert);
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C2355b) {
                    C2355b c2355b = (C2355b) obj;
                    return C9612q.m13922c(this.f6466a, c2355b.f6466a) && C9612q.m13922c(this.f6467b, c2355b.f6467b);
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f6466a;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f6467b;
            return hashCode + (method != null ? method.hashCode() : 0);
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f6466a + ", findByIssuerAndSignatureMethod=" + this.f6467b + ")";
        }
    }

    static {
        boolean z = false;
        if (C2370k.f6491c.m33587h() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f6462f = z;
    }

    public C2353c() {
        List m14099n;
        m14099n = C9545j.m14099n(C2686n.C2687a.m32719b(C2686n.f7185j, null, 1, null), new C2683l(C2672h.f7168g.m32735d()), new C2683l(C2680k.f7182b.m32728a()), new C2683l(C2675i.f7176b.m32733a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : m14099n) {
            if (((InterfaceC2685m) obj).mo32724a()) {
                arrayList.add(obj);
            }
        }
        this.f6464d = arrayList;
        this.f6465e = C2678j.f7177d.m32730a();
    }

    @Override // p031bk.C2370k
    /* renamed from: c */
    public AbstractC6266c mo33608c(X509TrustManager trustManager) {
        C9612q.m13917h(trustManager, "trustManager");
        C2667d m32746a = C2667d.f7160d.m32746a(trustManager);
        if (m32746a == null) {
            return super.mo33608c(trustManager);
        }
        return m32746a;
    }

    @Override // p031bk.C2370k
    /* renamed from: d */
    public InterfaceC6269e mo33607d(X509TrustManager trustManager) {
        C9612q.m13917h(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            C9612q.m13918g(method, "method");
            method.setAccessible(true);
            return new C2355b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.mo33607d(trustManager);
        }
    }

    @Override // p031bk.C2370k
    /* renamed from: e */
    public void mo33606e(SSLSocket sslSocket, String str, List<EnumC12312p> protocols) {
        Object obj;
        C9612q.m13917h(sslSocket, "sslSocket");
        C9612q.m13917h(protocols, "protocols");
        Iterator<T> it = this.f6464d.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((InterfaceC2685m) obj).mo32723b(sslSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC2685m interfaceC2685m = (InterfaceC2685m) obj;
        if (interfaceC2685m != null) {
            interfaceC2685m.mo32721d(sslSocket, str, protocols);
        }
    }

    @Override // p031bk.C2370k
    /* renamed from: f */
    public void mo33605f(Socket socket, InetSocketAddress address, int i) {
        C9612q.m13917h(socket, "socket");
        C9612q.m13917h(address, "address");
        try {
            socket.connect(address, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            }
            throw e;
        }
    }

    @Override // p031bk.C2370k
    /* renamed from: h */
    public String mo33603h(SSLSocket sslSocket) {
        Object obj;
        C9612q.m13917h(sslSocket, "sslSocket");
        Iterator<T> it = this.f6464d.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((InterfaceC2685m) obj).mo32723b(sslSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC2685m interfaceC2685m = (InterfaceC2685m) obj;
        if (interfaceC2685m == null) {
            return null;
        }
        return interfaceC2685m.mo32722c(sslSocket);
    }

    @Override // p031bk.C2370k
    /* renamed from: i */
    public Object mo33602i(String closer) {
        C9612q.m13917h(closer, "closer");
        return this.f6465e.m32732a(closer);
    }

    @Override // p031bk.C2370k
    /* renamed from: j */
    public boolean mo33601j(String hostname) {
        boolean isCleartextTrafficPermitted;
        C9612q.m13917h(hostname, "hostname");
        if (Build.VERSION.SDK_INT >= 24) {
            isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
            return isCleartextTrafficPermitted;
        }
        NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
        C9612q.m13918g(networkSecurityPolicy, "NetworkSecurityPolicy.getInstance()");
        return networkSecurityPolicy.isCleartextTrafficPermitted();
    }

    @Override // p031bk.C2370k
    /* renamed from: m */
    public void mo33598m(String message, Object obj) {
        C9612q.m13917h(message, "message");
        if (!this.f6465e.m32731b(obj)) {
            C2370k.m33599l(this, message, 5, null, 4, null);
        }
    }
}