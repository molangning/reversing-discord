package p410wj;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.collections.C9550o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Call;
import okhttp3.HttpUrl;
import p328rj.AbstractC12302m;
import p328rj.C12271a;
import p328rj.C12314q;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002\u0010\fB'\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b(\u0010)J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\t\u0010\f\u001a\u00020\bH\u0086\u0002J\t\u0010\u000e\u001a\u00020\rH\u0086\u0002R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, m14357d2 = {"Lwj/k;", "", "Lokhttp3/HttpUrl;", "url", "Ljava/net/Proxy;", "proxy", "", "g", "", "c", "e", "f", "b", "Lwj/k$b;", "d", "", "a", "Ljava/util/List;", "proxies", "", "I", "nextProxyIndex", "Ljava/net/InetSocketAddress;", "inetSocketAddresses", "", "Lrj/q;", "postponedRoutes", "Lrj/a;", "Lrj/a;", "address", "Lwj/i;", "Lwj/i;", "routeDatabase", "Lokhttp3/Call;", "Lokhttp3/Call;", "call", "Lrj/m;", "h", "Lrj/m;", "eventListener", "<init>", "(Lrj/a;Lwj/i;Lokhttp3/Call;Lrj/m;)V", "i", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: wj.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13653k {

    /* renamed from: i */
    public static final C13654a f35117i = new C13654a(null);

    /* renamed from: a */
    private List<? extends Proxy> f35118a;

    /* renamed from: b */
    private int f35119b;

    /* renamed from: c */
    private List<? extends InetSocketAddress> f35120c;

    /* renamed from: d */
    private final List<C12314q> f35121d;

    /* renamed from: e */
    private final C12271a f35122e;

    /* renamed from: f */
    private final C13651i f35123f;

    /* renamed from: g */
    private final Call f35124g;

    /* renamed from: h */
    private final AbstractC12302m f35125h;

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, m14357d2 = {"Lwj/k$a;", "", "Ljava/net/InetSocketAddress;", "", "a", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "socketHost", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: wj.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C13654a {
        private C13654a() {
        }

        public /* synthetic */ C13654a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m1920a(InetSocketAddress socketHost) {
            C9612q.m13917h(socketHost, "$this$socketHost");
            InetAddress address = socketHost.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                C9612q.m13918g(hostAddress, "address.hostAddress");
                return hostAddress;
            }
            String hostName = socketHost.getHostName();
            C9612q.m13918g(hostName, "hostName");
            return hostName;
        }
    }

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\u0007\u0010\f¨\u0006\u0010"}, m14357d2 = {"Lwj/k$b;", "", "", "b", "Lrj/q;", "c", "", "a", "I", "nextRouteIndex", "", "Ljava/util/List;", "()Ljava/util/List;", "routes", "<init>", "(Ljava/util/List;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: wj.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C13655b {

        /* renamed from: a */
        private int f35126a;

        /* renamed from: b */
        private final List<C12314q> f35127b;

        public C13655b(List<C12314q> routes) {
            C9612q.m13917h(routes, "routes");
            this.f35127b = routes;
        }

        /* renamed from: a */
        public final List<C12314q> m1919a() {
            return this.f35127b;
        }

        /* renamed from: b */
        public final boolean m1918b() {
            return this.f35126a < this.f35127b.size();
        }

        /* renamed from: c */
        public final C12314q m1917c() {
            if (m1918b()) {
                List<C12314q> list = this.f35127b;
                int i = this.f35126a;
                this.f35126a = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m14357d2 = {"selectProxies", "", "Ljava/net/Proxy;", "invoke"}, m14356k = 3, m14355mv = {1, 4, 0})
    /* renamed from: wj.k$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C13656c extends AbstractC9614s implements Function0<List<? extends Proxy>> {

        /* renamed from: k */
        final /* synthetic */ Proxy f35129k;

        /* renamed from: l */
        final /* synthetic */ HttpUrl f35130l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13656c(Proxy proxy, HttpUrl httpUrl) {
            super(0);
            C13653k.this = r1;
            this.f35129k = proxy;
            this.f35130l = httpUrl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Proxy> invoke() {
            List<? extends Proxy> m14109d;
            Proxy proxy = this.f35129k;
            if (proxy != null) {
                m14109d = C9544i.m14109d(proxy);
                return m14109d;
            }
            URI m8889r = this.f35130l.m8889r();
            if (m8889r.getHost() == null) {
                return C12562c.m4791t(Proxy.NO_PROXY);
            }
            List<Proxy> select = C13653k.this.f35122e.m5621i().select(m8889r);
            return select == null || select.isEmpty() ? C12562c.m4791t(Proxy.NO_PROXY) : C12562c.m4818R(select);
        }
    }

    public C13653k(C12271a address, C13651i routeDatabase, Call call, AbstractC12302m eventListener) {
        List<? extends Proxy> m14104i;
        List<? extends InetSocketAddress> m14104i2;
        C9612q.m13917h(address, "address");
        C9612q.m13917h(routeDatabase, "routeDatabase");
        C9612q.m13917h(call, "call");
        C9612q.m13917h(eventListener, "eventListener");
        this.f35122e = address;
        this.f35123f = routeDatabase;
        this.f35124g = call;
        this.f35125h = eventListener;
        m14104i = C9545j.m14104i();
        this.f35118a = m14104i;
        m14104i2 = C9545j.m14104i();
        this.f35120c = m14104i2;
        this.f35121d = new ArrayList();
        m1921g(address.m5618l(), address.m5623g());
    }

    /* renamed from: c */
    private final boolean m1925c() {
        return this.f35119b < this.f35118a.size();
    }

    /* renamed from: e */
    private final Proxy m1923e() {
        if (m1925c()) {
            List<? extends Proxy> list = this.f35118a;
            int i = this.f35119b;
            this.f35119b = i + 1;
            Proxy proxy = list.get(i);
            m1922f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f35122e.m5618l().m8899h() + "; exhausted proxy configurations: " + this.f35118a);
    }

    /* renamed from: f */
    private final void m1922f(Proxy proxy) {
        String m8899h;
        int m8894m;
        ArrayList arrayList = new ArrayList();
        this.f35120c = arrayList;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                m8899h = f35117i.m1920a(inetSocketAddress);
                m8894m = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
            }
        } else {
            m8899h = this.f35122e.m5618l().m8899h();
            m8894m = this.f35122e.m5618l().m8894m();
        }
        if (1 <= m8894m && 65535 >= m8894m) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList.add(InetSocketAddress.createUnresolved(m8899h, m8894m));
                return;
            }
            this.f35125h.m5531n(this.f35124g, m8899h);
            List<InetAddress> mo5548a = this.f35122e.m5627c().mo5548a(m8899h);
            if (!mo5548a.isEmpty()) {
                this.f35125h.m5532m(this.f35124g, m8899h, mo5548a);
                for (InetAddress inetAddress : mo5548a) {
                    arrayList.add(new InetSocketAddress(inetAddress, m8894m));
                }
                return;
            }
            throw new UnknownHostException(this.f35122e.m5627c() + " returned no addresses for " + m8899h);
        }
        throw new SocketException("No route to " + m8899h + ':' + m8894m + "; port is out of range");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    private final void m1921g(HttpUrl httpUrl, Proxy proxy) {
        C13656c c13656c = new C13656c(proxy, httpUrl);
        this.f35125h.m5529p(this.f35124g, httpUrl);
        List<? extends Proxy> invoke = c13656c.invoke();
        this.f35118a = invoke;
        this.f35119b = 0;
        this.f35125h.m5530o(this.f35124g, httpUrl, invoke);
    }

    /* renamed from: b */
    public final boolean m1926b() {
        return m1925c() || (this.f35121d.isEmpty() ^ true);
    }

    /* renamed from: d */
    public final C13655b m1924d() {
        if (m1926b()) {
            ArrayList arrayList = new ArrayList();
            while (m1925c()) {
                Proxy m1923e = m1923e();
                for (InetSocketAddress inetSocketAddress : this.f35120c) {
                    C12314q c12314q = new C12314q(this.f35122e, m1923e, inetSocketAddress);
                    if (this.f35123f.m1931c(c12314q)) {
                        this.f35121d.add(c12314q);
                    } else {
                        arrayList.add(c12314q);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                C9550o.m14085y(arrayList, this.f35121d);
                this.f35121d.clear();
            }
            return new C13655b(arrayList);
        }
        throw new NoSuchElementException();
    }
}