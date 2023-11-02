package okhttp3;

import dk.C6028a;
import fk.C6489d;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.C9550o;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Call;
import p031bk.C2370k;
import p089ek.AbstractC6266c;
import p089ek.C6268d;
import p328rj.AbstractC12302m;
import p328rj.AbstractC12317s;
import p328rj.C12275c;
import p328rj.C12284e;
import p328rj.C12294i;
import p328rj.C12295j;
import p328rj.EnumC12312p;
import p328rj.InterfaceC12272b;
import p328rj.InterfaceC12299l;
import p390vj.C13346e;
import p410wj.C13638e;
import p410wj.C13651i;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 \u008f\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0090\u0001\u0091\u0001B\u0014\b\u0000\u0012\u0007\u0010\u008b\u0001\u001a\u00020\u000e¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001B\u000b\b\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008e\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0017\u0010\u0015\u001a\u00020\u00108G¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168G¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8G¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8G¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010*\u001a\u00020&8G¢\u0006\f\n\u0004\b\u0019\u0010'\u001a\u0004\b(\u0010)R\u0017\u00100\u001a\u00020+8G¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00106\u001a\u0002018G¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u00109\u001a\u00020+8G¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u0010/R\u0017\u0010;\u001a\u00020+8G¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b:\u0010/R\u0017\u0010@\u001a\u00020<8G¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b7\u0010?R\u0019\u0010E\u001a\u0004\u0018\u00010A8G¢\u0006\f\n\u0004\b(\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010I\u001a\u00020F8G¢\u0006\f\n\u0004\b8\u0010G\u001a\u0004\b=\u0010HR\u0019\u0010N\u001a\u0004\u0018\u00010J8G¢\u0006\f\n\u0004\b:\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010T\u001a\u00020O8G¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010W\u001a\u0002018G¢\u0006\f\n\u0004\bU\u00103\u001a\u0004\bV\u00105R\u0017\u0010\\\u001a\u00020X8G¢\u0006\f\n\u0004\b \u0010Y\u001a\u0004\bZ\u0010[R\u0016\u0010`\u001a\u0004\u0018\u00010]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0019\u0010e\u001a\u0004\u0018\u00010a8G¢\u0006\f\n\u0004\b$\u0010b\u001a\u0004\bc\u0010dR\u001d\u0010g\u001a\b\u0012\u0004\u0012\u00020f0\u001c8G¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b2\u0010!R\u001d\u0010j\u001a\b\u0012\u0004\u0012\u00020h0\u001c8G¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\bi\u0010!R\u0017\u0010o\u001a\u00020k8G¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bU\u0010nR\u0017\u0010s\u001a\u00020p8G¢\u0006\f\n\u0004\bi\u0010q\u001a\u0004\b\u001e\u0010rR\u0019\u0010w\u001a\u0004\u0018\u00010t8G¢\u0006\f\n\u0004\bL\u0010u\u001a\u0004\b\u0017\u0010vR\u0017\u0010{\u001a\u00020x8G¢\u0006\f\n\u0004\bV\u0010y\u001a\u0004\b\u0011\u0010zR\u0017\u0010|\u001a\u00020x8G¢\u0006\f\n\u0004\bR\u0010y\u001a\u0004\b#\u0010zR\u0017\u0010}\u001a\u00020x8G¢\u0006\f\n\u0004\by\u0010y\u001a\u0004\by\u0010zR\u0017\u0010\u007f\u001a\u00020x8G¢\u0006\f\n\u0004\b.\u0010y\u001a\u0004\b~\u0010zR\u0018\u0010\u0080\u0001\u001a\u00020x8G¢\u0006\f\n\u0004\bZ\u0010y\u001a\u0004\bl\u0010zR\u001b\u0010\u0084\u0001\u001a\u00030\u0081\u00018G¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010.\u001a\u0005\b^\u0010\u0083\u0001R\u001b\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0006¢\u0006\u000e\n\u0005\b\u0005\u0010\u0086\u0001\u001a\u0005\bP\u0010\u0087\u0001R\u0014\u0010\u008a\u0001\u001a\u00020]8G¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0089\u0001¨\u0006\u0092\u0001"}, m14357d2 = {"Lokhttp3/OkHttpClient;", "", "Lokhttp3/Call$Factory;", "", "", "M", "Lokhttp3/Request;", "request", "Lokhttp3/Call;", "b", "Lrj/s;", "listener", "Lokhttp3/WebSocket;", "C", "Lokhttp3/OkHttpClient$Builder;", "B", "Lokhttp3/Dispatcher;", "j", "Lokhttp3/Dispatcher;", "r", "()Lokhttp3/Dispatcher;", "dispatcher", "Lrj/i;", "k", "Lrj/i;", "n", "()Lrj/i;", "connectionPool", "", "Lokhttp3/Interceptor;", "l", "Ljava/util/List;", "y", "()Ljava/util/List;", "interceptors", "m", "A", "networkInterceptors", "Lrj/m$c;", "Lrj/m$c;", "t", "()Lrj/m$c;", "eventListenerFactory", "", "o", "Z", "J", "()Z", "retryOnConnectionFailure", "Lrj/b;", "p", "Lrj/b;", "f", "()Lrj/b;", "authenticator", "q", "u", "followRedirects", "v", "followSslRedirects", "Lokhttp3/CookieJar;", "s", "Lokhttp3/CookieJar;", "()Lokhttp3/CookieJar;", "cookieJar", "Lrj/c;", "Lrj/c;", "g", "()Lrj/c;", "cache", "Lrj/l;", "Lrj/l;", "()Lrj/l;", "dns", "Ljava/net/Proxy;", "Ljava/net/Proxy;", "F", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "w", "Ljava/net/ProxySelector;", "H", "()Ljava/net/ProxySelector;", "proxySelector", "x", "G", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "Ljavax/net/SocketFactory;", "K", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "z", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "O", "()Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Lrj/j;", "connectionSpecs", "Lrj/p;", "E", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "D", "Ljavax/net/ssl/HostnameVerifier;", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lrj/e;", "Lrj/e;", "()Lrj/e;", "certificatePinner", "Lek/c;", "Lek/c;", "()Lek/c;", "certificateChainCleaner", "", "I", "()I", "callTimeoutMillis", "connectTimeoutMillis", "readTimeoutMillis", "N", "writeTimeoutMillis", "pingIntervalMillis", "", "L", "()J", "minWebSocketMessageToCompress", "Lwj/i;", "Lwj/i;", "()Lwj/i;", "routeDatabase", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "builder", "<init>", "(Lokhttp3/OkHttpClient$Builder;)V", "()V", "P", "Builder", "a", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class OkHttpClient implements Cloneable, Call.Factory {

    /* renamed from: A */
    private final X509TrustManager f29349A;

    /* renamed from: B */
    private final List<C12295j> f29350B;

    /* renamed from: C */
    private final List<EnumC12312p> f29351C;

    /* renamed from: D */
    private final HostnameVerifier f29352D;

    /* renamed from: E */
    private final C12284e f29353E;

    /* renamed from: F */
    private final AbstractC6266c f29354F;

    /* renamed from: G */
    private final int f29355G;

    /* renamed from: H */
    private final int f29356H;

    /* renamed from: I */
    private final int f29357I;

    /* renamed from: J */
    private final int f29358J;

    /* renamed from: K */
    private final int f29359K;

    /* renamed from: L */
    private final long f29360L;

    /* renamed from: M */
    private final C13651i f29361M;

    /* renamed from: j */
    private final Dispatcher f29362j;

    /* renamed from: k */
    private final C12294i f29363k;

    /* renamed from: l */
    private final List<Interceptor> f29364l;

    /* renamed from: m */
    private final List<Interceptor> f29365m;

    /* renamed from: n */
    private final AbstractC12302m.InterfaceC12305c f29366n;

    /* renamed from: o */
    private final boolean f29367o;

    /* renamed from: p */
    private final InterfaceC12272b f29368p;

    /* renamed from: q */
    private final boolean f29369q;

    /* renamed from: r */
    private final boolean f29370r;

    /* renamed from: s */
    private final CookieJar f29371s;

    /* renamed from: t */
    private final C12275c f29372t;

    /* renamed from: u */
    private final InterfaceC12299l f29373u;

    /* renamed from: v */
    private final Proxy f29374v;

    /* renamed from: w */
    private final ProxySelector f29375w;

    /* renamed from: x */
    private final InterfaceC12272b f29376x;

    /* renamed from: y */
    private final SocketFactory f29377y;

    /* renamed from: z */
    private final SSLSocketFactory f29378z;

    /* renamed from: P */
    public static final C11203a f29348P = new C11203a(null);

    /* renamed from: N */
    private static final List<EnumC12312p> f29346N = C12562c.m4791t(EnumC12312p.HTTP_2, EnumC12312p.HTTP_1_1);

    /* renamed from: O */
    private static final List<C12295j> f29347O = C12562c.m4791t(C12295j.f32060h, C12295j.f32062j);

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007¨\u0006\r"}, m14357d2 = {"Lokhttp3/OkHttpClient$a;", "", "", "Lrj/p;", "DEFAULT_PROTOCOLS", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lrj/j;", "DEFAULT_CONNECTION_SPECS", "a", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okhttp3.OkHttpClient$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11203a {
        private C11203a() {
        }

        public /* synthetic */ C11203a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List<C12295j> m8747a() {
            return OkHttpClient.f29347O;
        }

        /* renamed from: b */
        public final List<EnumC12312p> m8746b() {
            return OkHttpClient.f29346N;
        }
    }

    public OkHttpClient(Builder builder) {
        ProxySelector m8784F;
        C9612q.m13917h(builder, "builder");
        this.f29362j = builder.m8755s();
        this.f29363k = builder.m8758p();
        this.f29364l = C12562c.m4818R(builder.m8749y());
        this.f29365m = C12562c.m4818R(builder.m8789A());
        this.f29366n = builder.m8753u();
        this.f29367o = builder.m8782H();
        this.f29368p = builder.m8764j();
        this.f29369q = builder.m8752v();
        this.f29370r = builder.m8751w();
        this.f29371s = builder.m8756r();
        this.f29372t = builder.m8763k();
        this.f29373u = builder.m8754t();
        this.f29374v = builder.m8786D();
        if (builder.m8786D() != null) {
            m8784F = C6028a.f17097a;
        } else {
            m8784F = builder.m8784F();
            m8784F = m8784F == null ? ProxySelector.getDefault() : m8784F;
            if (m8784F == null) {
                m8784F = C6028a.f17097a;
            }
        }
        this.f29375w = m8784F;
        this.f29376x = builder.m8785E();
        this.f29377y = builder.m8780J();
        List<C12295j> m8757q = builder.m8757q();
        this.f29350B = m8757q;
        this.f29351C = builder.m8787C();
        this.f29352D = builder.m8750x();
        this.f29355G = builder.m8762l();
        this.f29356H = builder.m8759o();
        this.f29357I = builder.m8783G();
        this.f29358J = builder.m8778L();
        this.f29359K = builder.m8788B();
        this.f29360L = builder.m8748z();
        C13651i m8781I = builder.m8781I();
        this.f29361M = m8781I == null ? new C13651i() : m8781I;
        boolean z = true;
        if (!(m8757q instanceof Collection) || !m8757q.isEmpty()) {
            Iterator<T> it = m8757q.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C12295j) it.next()).m5559f()) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            this.f29378z = null;
            this.f29354F = null;
            this.f29349A = null;
            this.f29353E = C12284e.f31920c;
        } else if (builder.m8779K() != null) {
            this.f29378z = builder.m8779K();
            AbstractC6266c m8761m = builder.m8761m();
            C9612q.m13920e(m8761m);
            this.f29354F = m8761m;
            X509TrustManager m8777M = builder.m8777M();
            C9612q.m13920e(m8777M);
            this.f29349A = m8777M;
            C12284e m8760n = builder.m8760n();
            C9612q.m13920e(m8761m);
            this.f29353E = m8760n.m5585e(m8761m);
        } else {
            C2370k.C2371a c2371a = C2370k.f6491c;
            X509TrustManager mo33595p = c2371a.m33588g().mo33595p();
            this.f29349A = mo33595p;
            C2370k m33588g = c2371a.m33588g();
            C9612q.m13920e(mo33595p);
            this.f29378z = m33588g.mo33596o(mo33595p);
            AbstractC6266c.C6267a c6267a = AbstractC6266c.f17711a;
            C9612q.m13920e(mo33595p);
            AbstractC6266c m23129a = c6267a.m23129a(mo33595p);
            this.f29354F = m23129a;
            C12284e m8760n2 = builder.m8760n();
            C9612q.m13920e(m23129a);
            this.f29353E = m8760n2.m5585e(m23129a);
        }
        m8814M();
    }

    /* renamed from: M */
    private final void m8814M() {
        List<Interceptor> list;
        List<Interceptor> list2;
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f29364l != null) {
            boolean z4 = true;
            if (!list.contains(null)) {
                if (this.f29365m != null) {
                    if (!list2.contains(null)) {
                        List<C12295j> list3 = this.f29350B;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            for (C12295j c12295j : list3) {
                                if (c12295j.m5559f()) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        z = true;
                        if (z) {
                            if (this.f29378z == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                if (this.f29354F == null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    if (this.f29349A != null) {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        if (!C9612q.m13922c(this.f29353E, C12284e.f31920c)) {
                                            throw new IllegalStateException("Check failed.".toString());
                                        }
                                        return;
                                    }
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                throw new IllegalStateException("Check failed.".toString());
                            }
                            throw new IllegalStateException("Check failed.".toString());
                        } else if (this.f29378z != null) {
                            if (this.f29354F != null) {
                                if (this.f29349A != null) {
                                    return;
                                }
                                throw new IllegalStateException("x509TrustManager == null".toString());
                            }
                            throw new IllegalStateException("certificateChainCleaner == null".toString());
                        } else {
                            throw new IllegalStateException("sslSocketFactory == null".toString());
                        }
                    }
                    throw new IllegalStateException(("Null network interceptor: " + this.f29365m).toString());
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
            }
            throw new IllegalStateException(("Null interceptor: " + this.f29364l).toString());
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
    }

    /* renamed from: A */
    public final List<Interceptor> m8826A() {
        return this.f29365m;
    }

    /* renamed from: B */
    public Builder m8825B() {
        return new Builder(this);
    }

    /* renamed from: C */
    public WebSocket m8824C(Request request, AbstractC12317s listener) {
        C9612q.m13917h(request, "request");
        C9612q.m13917h(listener, "listener");
        C6489d c6489d = new C6489d(C13346e.f34428h, request, listener, new Random(), this.f29359K, null, this.f29360L);
        c6489d.m22595p(this);
        return c6489d;
    }

    /* renamed from: D */
    public final int m8823D() {
        return this.f29359K;
    }

    /* renamed from: E */
    public final List<EnumC12312p> m8822E() {
        return this.f29351C;
    }

    /* renamed from: F */
    public final Proxy m8821F() {
        return this.f29374v;
    }

    /* renamed from: G */
    public final InterfaceC12272b m8820G() {
        return this.f29376x;
    }

    /* renamed from: H */
    public final ProxySelector m8819H() {
        return this.f29375w;
    }

    /* renamed from: I */
    public final int m8818I() {
        return this.f29357I;
    }

    /* renamed from: J */
    public final boolean m8817J() {
        return this.f29367o;
    }

    /* renamed from: K */
    public final SocketFactory m8816K() {
        return this.f29377y;
    }

    /* renamed from: L */
    public final SSLSocketFactory m8815L() {
        SSLSocketFactory sSLSocketFactory = this.f29378z;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* renamed from: N */
    public final int m8813N() {
        return this.f29358J;
    }

    /* renamed from: O */
    public final X509TrustManager m8812O() {
        return this.f29349A;
    }

    @Override // okhttp3.Call.Factory
    /* renamed from: b */
    public Call mo8811b(Request request) {
        C9612q.m13917h(request, "request");
        return new C13638e(this, request, false);
    }

    public Object clone() {
        return super.clone();
    }

    /* renamed from: f */
    public final InterfaceC12272b m8807f() {
        return this.f29368p;
    }

    /* renamed from: g */
    public final C12275c m8806g() {
        return this.f29372t;
    }

    /* renamed from: j */
    public final int m8805j() {
        return this.f29355G;
    }

    /* renamed from: k */
    public final AbstractC6266c m8804k() {
        return this.f29354F;
    }

    /* renamed from: l */
    public final C12284e m8803l() {
        return this.f29353E;
    }

    /* renamed from: m */
    public final int m8802m() {
        return this.f29356H;
    }

    /* renamed from: n */
    public final C12294i m8801n() {
        return this.f29363k;
    }

    /* renamed from: p */
    public final List<C12295j> m8800p() {
        return this.f29350B;
    }

    /* renamed from: q */
    public final CookieJar m8799q() {
        return this.f29371s;
    }

    /* renamed from: r */
    public final Dispatcher m8798r() {
        return this.f29362j;
    }

    /* renamed from: s */
    public final InterfaceC12299l m8797s() {
        return this.f29373u;
    }

    /* renamed from: t */
    public final AbstractC12302m.InterfaceC12305c m8796t() {
        return this.f29366n;
    }

    /* renamed from: u */
    public final boolean m8795u() {
        return this.f29369q;
    }

    /* renamed from: v */
    public final boolean m8794v() {
        return this.f29370r;
    }

    /* renamed from: w */
    public final C13651i m8793w() {
        return this.f29361M;
    }

    /* renamed from: x */
    public final HostnameVerifier m8792x() {
        return this.f29352D;
    }

    /* renamed from: y */
    public final List<Interceptor> m8791y() {
        return this.f29364l;
    }

    /* renamed from: z */
    public final long m8790z() {
        return this.f29360L;
    }

    @Metadata(m14358d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b¿\u0001\u0010À\u0001B\u0014\b\u0010\u0012\u0007\u0010Á\u0001\u001a\u00020 ¢\u0006\u0006\b¿\u0001\u0010Â\u0001J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0014\u0010\u0018\u001a\u00020\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u0016\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bJ\u0016\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bJ\u0016\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010!\u001a\u00020 R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010-\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u00102\u001a\b\u0012\u0004\u0012\u00020\u00050.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010/\u001a\u0004\b0\u00101R \u00104\u001a\b\u0012\u0004\u0012\u00020\u00050.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010/\u001a\u0004\b3\u00101R\"\u0010;\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010A\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010H\u001a\u00020B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010<\u001a\u0004\bI\u0010>\"\u0004\bJ\u0010@R\"\u0010M\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010<\u001a\u0004\bK\u0010>\"\u0004\bL\u0010@R\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bS\u0010U\"\u0004\bV\u0010WR\"\u0010_\u001a\u00020X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010g\u001a\u0004\u0018\u00010`8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010o\u001a\u0004\u0018\u00010h8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010s\u001a\u00020B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bp\u0010C\u001a\u0004\bq\u0010E\"\u0004\br\u0010GR\"\u0010z\u001a\u00020t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR'\u0010\u0082\u0001\u001a\u0004\u0018\u00010{8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R+\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bO\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R,\u0010\u008d\u0001\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b#\u0010/\u001a\u0004\b|\u00101\"\u0006\b\u008b\u0001\u0010\u008c\u0001R+\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b[\u0010/\u001a\u0005\b\u008e\u0001\u00101\"\u0006\b\u008f\u0001\u0010\u008c\u0001R)\u0010\u0096\u0001\u001a\u00030\u0090\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b7\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R(\u0010\u009c\u0001\u001a\u00030\u0097\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bI\u0010\u0098\u0001\u001a\u0005\bi\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R*\u0010¢\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bK\u0010\u009e\u0001\u001a\u0005\ba\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R)\u0010¨\u0001\u001a\u00030£\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0092\u0001\u0010¤\u0001\u001a\u0005\bY\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R(\u0010ª\u0001\u001a\u00030£\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b0\u0010¤\u0001\u001a\u0005\bp\u0010¥\u0001\"\u0006\b©\u0001\u0010§\u0001R*\u0010®\u0001\u001a\u00030£\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010¤\u0001\u001a\u0006\b¬\u0001\u0010¥\u0001\"\u0006\b\u00ad\u0001\u0010§\u0001R)\u0010±\u0001\u001a\u00030£\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b3\u0010¤\u0001\u001a\u0006\b¯\u0001\u0010¥\u0001\"\u0006\b°\u0001\u0010§\u0001R*\u0010´\u0001\u001a\u00030£\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b²\u0001\u0010¤\u0001\u001a\u0006\b²\u0001\u0010¥\u0001\"\u0006\b³\u0001\u0010§\u0001R(\u0010¸\u0001\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u008e\u0001\u0010v\u001a\u0006\b«\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R+\u0010¾\u0001\u001a\u0005\u0018\u00010¹\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bc\u0010º\u0001\u001a\u0006\b¤\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001¨\u0006Ã\u0001"}, m14357d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/Dispatcher;", "dispatcher", "g", "Lokhttp3/Interceptor;", "interceptor", "a", "b", "Lrj/m;", "eventListener", "h", "", "followRedirects", "i", "Lokhttp3/CookieJar;", "cookieJar", "f", "Lrj/c;", "cache", "d", "", "Lrj/p;", "protocols", "N", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "e", "O", "P", "Lokhttp3/OkHttpClient;", "c", "Lokhttp3/Dispatcher;", "s", "()Lokhttp3/Dispatcher;", "setDispatcher$okhttp", "(Lokhttp3/Dispatcher;)V", "Lrj/i;", "Lrj/i;", "p", "()Lrj/i;", "setConnectionPool$okhttp", "(Lrj/i;)V", "connectionPool", "", "Ljava/util/List;", "y", "()Ljava/util/List;", "interceptors", "A", "networkInterceptors", "Lrj/m$c;", "Lrj/m$c;", "u", "()Lrj/m$c;", "setEventListenerFactory$okhttp", "(Lrj/m$c;)V", "eventListenerFactory", "Z", "H", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "retryOnConnectionFailure", "Lrj/b;", "Lrj/b;", "j", "()Lrj/b;", "setAuthenticator$okhttp", "(Lrj/b;)V", "authenticator", "v", "setFollowRedirects$okhttp", "w", "setFollowSslRedirects$okhttp", "followSslRedirects", "Lokhttp3/CookieJar;", "r", "()Lokhttp3/CookieJar;", "setCookieJar$okhttp", "(Lokhttp3/CookieJar;)V", "k", "Lrj/c;", "()Lrj/c;", "setCache$okhttp", "(Lrj/c;)V", "Lrj/l;", "l", "Lrj/l;", "t", "()Lrj/l;", "setDns$okhttp", "(Lrj/l;)V", "dns", "Ljava/net/Proxy;", "m", "Ljava/net/Proxy;", "D", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "proxy", "Ljava/net/ProxySelector;", "n", "Ljava/net/ProxySelector;", "F", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "proxySelector", "o", "E", "setProxyAuthenticator$okhttp", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "Ljavax/net/SocketFactory;", "J", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "q", "Ljavax/net/ssl/SSLSocketFactory;", "K", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "M", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "x509TrustManagerOrNull", "Lrj/j;", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "connectionSpecs", "C", "setProtocols$okhttp", "Ljavax/net/ssl/HostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "x", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "hostnameVerifier", "Lrj/e;", "Lrj/e;", "()Lrj/e;", "setCertificatePinner$okhttp", "(Lrj/e;)V", "certificatePinner", "Lek/c;", "Lek/c;", "()Lek/c;", "setCertificateChainCleaner$okhttp", "(Lek/c;)V", "certificateChainCleaner", "", "I", "()I", "setCallTimeout$okhttp", "(I)V", "callTimeout", "setConnectTimeout$okhttp", "connectTimeout", "z", "G", "setReadTimeout$okhttp", "readTimeout", "L", "setWriteTimeout$okhttp", "writeTimeout", "B", "setPingInterval$okhttp", "pingInterval", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "minWebSocketMessageToCompress", "Lwj/i;", "Lwj/i;", "()Lwj/i;", "setRouteDatabase$okhttp", "(Lwj/i;)V", "routeDatabase", "<init>", "()V", "okHttpClient", "(Lokhttp3/OkHttpClient;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Builder {

        /* renamed from: A */
        private int f29379A;

        /* renamed from: B */
        private int f29380B;

        /* renamed from: C */
        private long f29381C;

        /* renamed from: D */
        private C13651i f29382D;

        /* renamed from: a */
        private Dispatcher f29383a;

        /* renamed from: b */
        private C12294i f29384b;

        /* renamed from: c */
        private final List<Interceptor> f29385c;

        /* renamed from: d */
        private final List<Interceptor> f29386d;

        /* renamed from: e */
        private AbstractC12302m.InterfaceC12305c f29387e;

        /* renamed from: f */
        private boolean f29388f;

        /* renamed from: g */
        private InterfaceC12272b f29389g;

        /* renamed from: h */
        private boolean f29390h;

        /* renamed from: i */
        private boolean f29391i;

        /* renamed from: j */
        private CookieJar f29392j;

        /* renamed from: k */
        private C12275c f29393k;

        /* renamed from: l */
        private InterfaceC12299l f29394l;

        /* renamed from: m */
        private Proxy f29395m;

        /* renamed from: n */
        private ProxySelector f29396n;

        /* renamed from: o */
        private InterfaceC12272b f29397o;

        /* renamed from: p */
        private SocketFactory f29398p;

        /* renamed from: q */
        private SSLSocketFactory f29399q;

        /* renamed from: r */
        private X509TrustManager f29400r;

        /* renamed from: s */
        private List<C12295j> f29401s;

        /* renamed from: t */
        private List<? extends EnumC12312p> f29402t;

        /* renamed from: u */
        private HostnameVerifier f29403u;

        /* renamed from: v */
        private C12284e f29404v;

        /* renamed from: w */
        private AbstractC6266c f29405w;

        /* renamed from: x */
        private int f29406x;

        /* renamed from: y */
        private int f29407y;

        /* renamed from: z */
        private int f29408z;

        public Builder() {
            this.f29383a = new Dispatcher();
            this.f29384b = new C12294i();
            this.f29385c = new ArrayList();
            this.f29386d = new ArrayList();
            this.f29387e = C12562c.m4806e(AbstractC12302m.f32075a);
            this.f29388f = true;
            InterfaceC12272b interfaceC12272b = InterfaceC12272b.f31885a;
            this.f29389g = interfaceC12272b;
            this.f29390h = true;
            this.f29391i = true;
            this.f29392j = CookieJar.f29286a;
            this.f29394l = InterfaceC12299l.f32073a;
            this.f29397o = interfaceC12272b;
            SocketFactory socketFactory = SocketFactory.getDefault();
            C9612q.m13918g(socketFactory, "SocketFactory.getDefault()");
            this.f29398p = socketFactory;
            C11203a c11203a = OkHttpClient.f29348P;
            this.f29401s = c11203a.m8747a();
            this.f29402t = c11203a.m8746b();
            this.f29403u = C6268d.f17712a;
            this.f29404v = C12284e.f31920c;
            this.f29407y = 10000;
            this.f29408z = 10000;
            this.f29379A = 10000;
            this.f29381C = 1024L;
        }

        /* renamed from: A */
        public final List<Interceptor> m8789A() {
            return this.f29386d;
        }

        /* renamed from: B */
        public final int m8788B() {
            return this.f29380B;
        }

        /* renamed from: C */
        public final List<EnumC12312p> m8787C() {
            return this.f29402t;
        }

        /* renamed from: D */
        public final Proxy m8786D() {
            return this.f29395m;
        }

        /* renamed from: E */
        public final InterfaceC12272b m8785E() {
            return this.f29397o;
        }

        /* renamed from: F */
        public final ProxySelector m8784F() {
            return this.f29396n;
        }

        /* renamed from: G */
        public final int m8783G() {
            return this.f29408z;
        }

        /* renamed from: H */
        public final boolean m8782H() {
            return this.f29388f;
        }

        /* renamed from: I */
        public final C13651i m8781I() {
            return this.f29382D;
        }

        /* renamed from: J */
        public final SocketFactory m8780J() {
            return this.f29398p;
        }

        /* renamed from: K */
        public final SSLSocketFactory m8779K() {
            return this.f29399q;
        }

        /* renamed from: L */
        public final int m8778L() {
            return this.f29379A;
        }

        /* renamed from: M */
        public final X509TrustManager m8777M() {
            return this.f29400r;
        }

        /* renamed from: N */
        public final Builder m8776N(List<? extends EnumC12312p> protocols) {
            List m14073E0;
            boolean z;
            C9612q.m13917h(protocols, "protocols");
            m14073E0 = C9553r.m14073E0(protocols);
            EnumC12312p enumC12312p = EnumC12312p.H2_PRIOR_KNOWLEDGE;
            boolean z2 = false;
            if (!m14073E0.contains(enumC12312p) && !m14073E0.contains(EnumC12312p.HTTP_1_1)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (!m14073E0.contains(enumC12312p) || m14073E0.size() <= 1) {
                    z2 = true;
                }
                if (z2) {
                    if (!m14073E0.contains(EnumC12312p.HTTP_1_0)) {
                        if (!m14073E0.contains(null)) {
                            m14073E0.remove(EnumC12312p.SPDY_3);
                            if (!C9612q.m13922c(m14073E0, this.f29402t)) {
                                this.f29382D = null;
                            }
                            List<? extends EnumC12312p> unmodifiableList = Collections.unmodifiableList(m14073E0);
                            C9612q.m13918g(unmodifiableList, "Collections.unmodifiableList(protocolsCopy)");
                            this.f29402t = unmodifiableList;
                            return this;
                        }
                        throw new IllegalArgumentException("protocols must not contain null".toString());
                    }
                    throw new IllegalArgumentException(("protocols must not contain http/1.0: " + m14073E0).toString());
                }
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + m14073E0).toString());
            }
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + m14073E0).toString());
        }

        /* renamed from: O */
        public final Builder m8775O(long j, TimeUnit unit) {
            C9612q.m13917h(unit, "unit");
            this.f29408z = C12562c.m4803h("timeout", j, unit);
            return this;
        }

        /* renamed from: P */
        public final Builder m8774P(long j, TimeUnit unit) {
            C9612q.m13917h(unit, "unit");
            this.f29379A = C12562c.m4803h("timeout", j, unit);
            return this;
        }

        /* renamed from: a */
        public final Builder m8773a(Interceptor interceptor) {
            C9612q.m13917h(interceptor, "interceptor");
            this.f29385c.add(interceptor);
            return this;
        }

        /* renamed from: b */
        public final Builder m8772b(Interceptor interceptor) {
            C9612q.m13917h(interceptor, "interceptor");
            this.f29386d.add(interceptor);
            return this;
        }

        /* renamed from: c */
        public final OkHttpClient m8771c() {
            return new OkHttpClient(this);
        }

        /* renamed from: d */
        public final Builder m8770d(C12275c c12275c) {
            this.f29393k = c12275c;
            return this;
        }

        /* renamed from: e */
        public final Builder m8769e(long j, TimeUnit unit) {
            C9612q.m13917h(unit, "unit");
            this.f29407y = C12562c.m4803h("timeout", j, unit);
            return this;
        }

        /* renamed from: f */
        public final Builder m8768f(CookieJar cookieJar) {
            C9612q.m13917h(cookieJar, "cookieJar");
            this.f29392j = cookieJar;
            return this;
        }

        /* renamed from: g */
        public final Builder m8767g(Dispatcher dispatcher) {
            C9612q.m13917h(dispatcher, "dispatcher");
            this.f29383a = dispatcher;
            return this;
        }

        /* renamed from: h */
        public final Builder m8766h(AbstractC12302m eventListener) {
            C9612q.m13917h(eventListener, "eventListener");
            this.f29387e = C12562c.m4806e(eventListener);
            return this;
        }

        /* renamed from: i */
        public final Builder m8765i(boolean z) {
            this.f29390h = z;
            return this;
        }

        /* renamed from: j */
        public final InterfaceC12272b m8764j() {
            return this.f29389g;
        }

        /* renamed from: k */
        public final C12275c m8763k() {
            return this.f29393k;
        }

        /* renamed from: l */
        public final int m8762l() {
            return this.f29406x;
        }

        /* renamed from: m */
        public final AbstractC6266c m8761m() {
            return this.f29405w;
        }

        /* renamed from: n */
        public final C12284e m8760n() {
            return this.f29404v;
        }

        /* renamed from: o */
        public final int m8759o() {
            return this.f29407y;
        }

        /* renamed from: p */
        public final C12294i m8758p() {
            return this.f29384b;
        }

        /* renamed from: q */
        public final List<C12295j> m8757q() {
            return this.f29401s;
        }

        /* renamed from: r */
        public final CookieJar m8756r() {
            return this.f29392j;
        }

        /* renamed from: s */
        public final Dispatcher m8755s() {
            return this.f29383a;
        }

        /* renamed from: t */
        public final InterfaceC12299l m8754t() {
            return this.f29394l;
        }

        /* renamed from: u */
        public final AbstractC12302m.InterfaceC12305c m8753u() {
            return this.f29387e;
        }

        /* renamed from: v */
        public final boolean m8752v() {
            return this.f29390h;
        }

        /* renamed from: w */
        public final boolean m8751w() {
            return this.f29391i;
        }

        /* renamed from: x */
        public final HostnameVerifier m8750x() {
            return this.f29403u;
        }

        /* renamed from: y */
        public final List<Interceptor> m8749y() {
            return this.f29385c;
        }

        /* renamed from: z */
        public final long m8748z() {
            return this.f29381C;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(OkHttpClient okHttpClient) {
            this();
            C9612q.m13917h(okHttpClient, "okHttpClient");
            this.f29383a = okHttpClient.m8798r();
            this.f29384b = okHttpClient.m8801n();
            C9550o.m14085y(this.f29385c, okHttpClient.m8791y());
            C9550o.m14085y(this.f29386d, okHttpClient.m8826A());
            this.f29387e = okHttpClient.m8796t();
            this.f29388f = okHttpClient.m8817J();
            this.f29389g = okHttpClient.m8807f();
            this.f29390h = okHttpClient.m8795u();
            this.f29391i = okHttpClient.m8794v();
            this.f29392j = okHttpClient.m8799q();
            this.f29393k = okHttpClient.m8806g();
            this.f29394l = okHttpClient.m8797s();
            this.f29395m = okHttpClient.m8821F();
            this.f29396n = okHttpClient.m8819H();
            this.f29397o = okHttpClient.m8820G();
            this.f29398p = okHttpClient.m8816K();
            this.f29399q = okHttpClient.f29378z;
            this.f29400r = okHttpClient.m8812O();
            this.f29401s = okHttpClient.m8800p();
            this.f29402t = okHttpClient.m8822E();
            this.f29403u = okHttpClient.m8792x();
            this.f29404v = okHttpClient.m8803l();
            this.f29405w = okHttpClient.m8804k();
            this.f29406x = okHttpClient.m8805j();
            this.f29407y = okHttpClient.m8802m();
            this.f29408z = okHttpClient.m8818I();
            this.f29379A = okHttpClient.m8813N();
            this.f29380B = okHttpClient.m8823D();
            this.f29381C = okHttpClient.m8790z();
            this.f29382D = okHttpClient.m8793w();
        }
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
