package p031bk;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import ck.C2665c;
import ck.C2667d;
import ck.C2672h;
import ck.C2675i;
import ck.C2680k;
import ck.C2683l;
import ck.InterfaceC2685m;
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
import p328rj.EnumC12312p;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m14357d2 = {"Lbk/b;", "Lbk/k;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lrj/p;", "protocols", "", "e", "h", "", "j", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lek/c;", "c", "Lck/m;", "d", "Ljava/util/List;", "socketAdapters", "<init>", "()V", "f", "a", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: bk.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C2351b extends C2370k {

    /* renamed from: e */
    private static final boolean f6459e;

    /* renamed from: f */
    public static final C2352a f6460f = new C2352a(null);

    /* renamed from: d */
    private final List<InterfaceC2685m> f6461d;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m14357d2 = {"Lbk/b$a;", "", "Lbk/k;", "a", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: bk.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C2352a {
        private C2352a() {
        }

        public /* synthetic */ C2352a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C2370k m33633a() {
            if (m33632b()) {
                return new C2351b();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m33632b() {
            return C2351b.f6459e;
        }
    }

    static {
        boolean z;
        if (C2370k.f6491c.m33587h() && Build.VERSION.SDK_INT >= 29) {
            z = true;
        } else {
            z = false;
        }
        f6459e = z;
    }

    public C2351b() {
        List m14099n;
        m14099n = C9545j.m14099n(C2665c.f7159a.m32748a(), new C2683l(C2672h.f7168g.m32735d()), new C2683l(C2680k.f7182b.m32728a()), new C2683l(C2675i.f7176b.m32733a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : m14099n) {
            if (((InterfaceC2685m) obj).mo32724a()) {
                arrayList.add(obj);
            }
        }
        this.f6461d = arrayList;
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
    /* renamed from: e */
    public void mo33606e(SSLSocket sslSocket, String str, List<? extends EnumC12312p> protocols) {
        Object obj;
        C9612q.m13917h(sslSocket, "sslSocket");
        C9612q.m13917h(protocols, "protocols");
        Iterator<T> it = this.f6461d.iterator();
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
    /* renamed from: h */
    public String mo33603h(SSLSocket sslSocket) {
        Object obj;
        C9612q.m13917h(sslSocket, "sslSocket");
        Iterator<T> it = this.f6461d.iterator();
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
    @SuppressLint({"NewApi"})
    /* renamed from: j */
    public boolean mo33601j(String hostname) {
        boolean isCleartextTrafficPermitted;
        C9612q.m13917h(hostname, "hostname");
        isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
        return isCleartextTrafficPermitted;
    }
}
