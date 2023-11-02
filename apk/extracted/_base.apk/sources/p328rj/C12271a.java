package p328rj;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okhttp3.HttpUrl;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010B\u001a\u00020\n\u0012\u0006\u0010C\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010%\u001a\u00020 \u0012\b\u0010*\u001a\u0004\u0018\u00010&\u0012\b\u0010/\u001a\u0004\u0018\u00010+\u0012\b\u00104\u001a\u0004\u0018\u000100\u0012\u0006\u00109\u001a\u000205\u0012\b\u0010=\u001a\u0004\u0018\u00010:\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012\u0012\u0006\u0010A\u001a\u00020>¢\u0006\u0004\bD\u0010EJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0011\u001a\u00020\f8G¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128G¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00128G¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u001f\u001a\u00020\u001c8\u0007¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001a\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010*\u001a\u0004\u0018\u00010&8\u0007¢\u0006\f\n\u0004\b\u0016\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010/\u001a\u0004\u0018\u00010+8\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b!\u0010.R\u0019\u00104\u001a\u0004\u0018\u0001008\u0007¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\r\u00103R\u0017\u00109\u001a\u0002058\u0007¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b1\u00108R\u0019\u0010=\u001a\u0004\u0018\u00010:8\u0007¢\u0006\f\n\u0004\b#\u0010;\u001a\u0004\b,\u0010<R\u0017\u0010A\u001a\u00020>8\u0007¢\u0006\f\n\u0004\b(\u0010?\u001a\u0004\b6\u0010@¨\u0006F"}, m14357d2 = {"Lrj/a;", "", "other", "", "equals", "", "hashCode", "that", "d", "(Lrj/a;)Z", "", "toString", "Lokhttp3/HttpUrl;", "a", "Lokhttp3/HttpUrl;", "l", "()Lokhttp3/HttpUrl;", "url", "", "Lrj/p;", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "protocols", "Lrj/j;", "c", "connectionSpecs", "Lrj/l;", "Lrj/l;", "()Lrj/l;", "dns", "Ljavax/net/SocketFactory;", "e", "Ljavax/net/SocketFactory;", "j", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "k", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/HostnameVerifier;", "g", "Ljavax/net/ssl/HostnameVerifier;", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lrj/e;", "h", "Lrj/e;", "()Lrj/e;", "certificatePinner", "Lrj/b;", "i", "Lrj/b;", "()Lrj/b;", "proxyAuthenticator", "Ljava/net/Proxy;", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "Ljava/net/ProxySelector;", "()Ljava/net/ProxySelector;", "proxySelector", "uriHost", "uriPort", "<init>", "(Ljava/lang/String;ILrj/l;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lrj/e;Lrj/b;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: rj.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C12271a {

    /* renamed from: a */
    private final HttpUrl f31874a;

    /* renamed from: b */
    private final List<EnumC12312p> f31875b;

    /* renamed from: c */
    private final List<C12295j> f31876c;

    /* renamed from: d */
    private final InterfaceC12299l f31877d;

    /* renamed from: e */
    private final SocketFactory f31878e;

    /* renamed from: f */
    private final SSLSocketFactory f31879f;

    /* renamed from: g */
    private final HostnameVerifier f31880g;

    /* renamed from: h */
    private final C12284e f31881h;

    /* renamed from: i */
    private final InterfaceC12272b f31882i;

    /* renamed from: j */
    private final Proxy f31883j;

    /* renamed from: k */
    private final ProxySelector f31884k;

    public C12271a(String uriHost, int i, InterfaceC12299l dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C12284e c12284e, InterfaceC12272b proxyAuthenticator, Proxy proxy, List<? extends EnumC12312p> protocols, List<C12295j> connectionSpecs, ProxySelector proxySelector) {
        C9612q.m13917h(uriHost, "uriHost");
        C9612q.m13917h(dns, "dns");
        C9612q.m13917h(socketFactory, "socketFactory");
        C9612q.m13917h(proxyAuthenticator, "proxyAuthenticator");
        C9612q.m13917h(protocols, "protocols");
        C9612q.m13917h(connectionSpecs, "connectionSpecs");
        C9612q.m13917h(proxySelector, "proxySelector");
        this.f31877d = dns;
        this.f31878e = socketFactory;
        this.f31879f = sSLSocketFactory;
        this.f31880g = hostnameVerifier;
        this.f31881h = c12284e;
        this.f31882i = proxyAuthenticator;
        this.f31883j = proxy;
        this.f31884k = proxySelector;
        this.f31874a = new HttpUrl.C11196a().m8873o(sSLSocketFactory != null ? "https" : "http").m8883e(uriHost).m8877k(i).m8887a();
        this.f31875b = C12562c.m4818R(protocols);
        this.f31876c = C12562c.m4818R(connectionSpecs);
    }

    /* renamed from: a */
    public final C12284e m5629a() {
        return this.f31881h;
    }

    /* renamed from: b */
    public final List<C12295j> m5628b() {
        return this.f31876c;
    }

    /* renamed from: c */
    public final InterfaceC12299l m5627c() {
        return this.f31877d;
    }

    /* renamed from: d */
    public final boolean m5626d(C12271a that) {
        C9612q.m13917h(that, "that");
        if (C9612q.m13922c(this.f31877d, that.f31877d) && C9612q.m13922c(this.f31882i, that.f31882i) && C9612q.m13922c(this.f31875b, that.f31875b) && C9612q.m13922c(this.f31876c, that.f31876c) && C9612q.m13922c(this.f31884k, that.f31884k) && C9612q.m13922c(this.f31883j, that.f31883j) && C9612q.m13922c(this.f31879f, that.f31879f) && C9612q.m13922c(this.f31880g, that.f31880g) && C9612q.m13922c(this.f31881h, that.f31881h) && this.f31874a.m8894m() == that.f31874a.m8894m()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final HostnameVerifier m5625e() {
        return this.f31880g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12271a) {
            C12271a c12271a = (C12271a) obj;
            if (C9612q.m13922c(this.f31874a, c12271a.f31874a) && m5626d(c12271a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final List<EnumC12312p> m5624f() {
        return this.f31875b;
    }

    /* renamed from: g */
    public final Proxy m5623g() {
        return this.f31883j;
    }

    /* renamed from: h */
    public final InterfaceC12272b m5622h() {
        return this.f31882i;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f31874a.hashCode()) * 31) + this.f31877d.hashCode()) * 31) + this.f31882i.hashCode()) * 31) + this.f31875b.hashCode()) * 31) + this.f31876c.hashCode()) * 31) + this.f31884k.hashCode()) * 31) + Objects.hashCode(this.f31883j)) * 31) + Objects.hashCode(this.f31879f)) * 31) + Objects.hashCode(this.f31880g)) * 31) + Objects.hashCode(this.f31881h);
    }

    /* renamed from: i */
    public final ProxySelector m5621i() {
        return this.f31884k;
    }

    /* renamed from: j */
    public final SocketFactory m5620j() {
        return this.f31878e;
    }

    /* renamed from: k */
    public final SSLSocketFactory m5619k() {
        return this.f31879f;
    }

    /* renamed from: l */
    public final HttpUrl m5618l() {
        return this.f31874a;
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.f31874a.m8899h());
        sb3.append(':');
        sb3.append(this.f31874a.m8894m());
        sb3.append(", ");
        if (this.f31883j != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.f31883j;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.f31884k;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append("}");
        return sb3.toString();
    }
}
