package p328rj;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(m14358d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u0000 92\u00020\u0001:\u00029:B\u0007¢\u0006\u0004\b=\u0010>J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J&\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J&\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0016J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J*\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J2\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010,\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00101\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0010\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00103\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u00104\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00108\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0018\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0010\u0010:\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010<\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010;\u001a\u00020/H\u0016¨\u0006?"}, m14357d2 = {"Lrj/m;", "", "Lokhttp3/Call;", "call", "", "f", "Lokhttp3/HttpUrl;", "url", "p", "", "Ljava/net/Proxy;", "proxies", "o", "", "domainName", "n", "Ljava/net/InetAddress;", "inetAddressList", "m", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "j", "C", "Lrj/n;", "handshake", "B", "Lrj/p;", "protocol", "h", "Ljava/io/IOException;", "ioe", "i", "Lrj/h;", "connection", "k", "l", "u", "Lokhttp3/Request;", "request", "t", "r", "", "byteCount", "q", "s", "z", "Lokhttp3/Response;", "response", "y", "w", "v", "x", "d", "e", "g", "A", "b", "c", "cachedResponse", "a", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: rj.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public abstract class AbstractC12302m {

    /* renamed from: b */
    public static final C12304b f32076b = new C12304b(null);

    /* renamed from: a */
    public static final AbstractC12302m f32075a = new C12303a();

    @Metadata(m14358d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m14357d2 = {"rj/m$a", "Lrj/m;", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: rj.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12303a extends AbstractC12302m {
        C12303a() {
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lrj/m$b;", "", "Lrj/m;", "NONE", "Lrj/m;", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: rj.m$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12304b {
        private C12304b() {
        }

        public /* synthetic */ C12304b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m14357d2 = {"Lrj/m$c;", "", "Lokhttp3/Call;", "call", "Lrj/m;", "a", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: rj.m$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface InterfaceC12305c {
        /* renamed from: a */
        AbstractC12302m mo4784a(Call call);
    }

    /* renamed from: A */
    public void m5547A(Call call, Response response) {
        C9612q.m13917h(call, "call");
        C9612q.m13917h(response, "response");
    }

    /* renamed from: B */
    public void m5546B(Call call, C12306n c12306n) {
        C9612q.m13917h(call, "call");
    }

    /* renamed from: C */
    public void m5545C(Call call) {
        C9612q.m13917h(call, "call");
    }

    /* renamed from: a */
    public void m5544a(Call call, Response cachedResponse) {
        C9612q.m13917h(call, "call");
        C9612q.m13917h(cachedResponse, "cachedResponse");
    }

    /* renamed from: b */
    public void m5543b(Call call, Response response) {
        C9612q.m13917h(call, "call");
        C9612q.m13917h(response, "response");
    }

    /* renamed from: c */
    public void m5542c(Call call) {
        C9612q.m13917h(call, "call");
    }

    /* renamed from: d */
    public void m5541d(Call call) {
        C9612q.m13917h(call, "call");
    }

    /* renamed from: e */
    public void m5540e(Call call, IOException ioe) {
        C9612q.m13917h(call, "call");
        C9612q.m13917h(ioe, "ioe");
    }

    /* renamed from: f */
    public void m5539f(Call call) {
        C9612q.m13917h(call, "call");
    }

    /* renamed from: g */
    public void m5538g(Call call) {
        C9612q.m13917h(call, "call");
    }

    /* renamed from: h */
    public void m5537h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC12312p enumC12312p) {
        C9612q.m13917h(call, "call");
        C9612q.m13917h(inetSocketAddress, "inetSocketAddress");
        C9612q.m13917h(proxy, "proxy");
    }

    /* renamed from: i */
    public void m5536i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC12312p enumC12312p, IOException ioe) {
        C9612q.m13917h(call, "call");
        C9612q.m13917h(inetSocketAddress, "inetSocketAddress");
        C9612q.m13917h(proxy, "proxy");
        C9612q.m13917h(ioe, "ioe");
    }

    /* renamed from: j */
    public void m5535j(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        C9612q.m13917h(call, "call");
        C9612q.m13917h(inetSocketAddress, "inetSocketAddress");
        C9612q.m13917h(proxy, "proxy");
    }

    /* renamed from: k */
    public void m5534k(Call call, InterfaceC12293h connection) {
        C9612q.m13917h(call, "call");
        C9612q.m13917h(connection, "connection");
    }

    /* renamed from: l */
    public void m5533l(Call call, InterfaceC12293h connection) {
        C9612q.m13917h(call, "call");
        C9612q.m13917h(connection, "connection");
    }

    /* renamed from: m */
    public void m5532m(Call call, String domainName, List<InetAddress> inetAddressList) {
        C9612q.m13917h(call, "call");
        C9612q.m13917h(domainName, "domainName");
        C9612q.m13917h(inetAddressList, "inetAddressList");
    }

    /* renamed from: n */
    public void m5531n(Call call, String domainName) {
        C9612q.m13917h(call, "call");
        C9612q.m13917h(domainName, "domainName");
    }

    /* renamed from: o */
    public void m5530o(Call call, HttpUrl url, List<Proxy> proxies) {
        C9612q.m13917h(call, "call");
        C9612q.m13917h(url, "url");
        C9612q.m13917h(proxies, "proxies");
    }

    /* renamed from: p */
    public void m5529p(Call call, HttpUrl url) {
        C9612q.m13917h(call, "call");
        C9612q.m13917h(url, "url");
    }

    /* renamed from: q */
    public void m5528q(Call call, long j) {
        C9612q.m13917h(call, "call");
    }

    /* renamed from: r */
    public void m5527r(Call call) {
        C9612q.m13917h(call, "call");
    }

    /* renamed from: s */
    public void m5526s(Call call, IOException ioe) {
        C9612q.m13917h(call, "call");
        C9612q.m13917h(ioe, "ioe");
    }

    /* renamed from: t */
    public void m5525t(Call call, Request request) {
        C9612q.m13917h(call, "call");
        C9612q.m13917h(request, "request");
    }

    /* renamed from: u */
    public void m5524u(Call call) {
        C9612q.m13917h(call, "call");
    }

    /* renamed from: v */
    public void m5523v(Call call, long j) {
        C9612q.m13917h(call, "call");
    }

    /* renamed from: w */
    public void m5522w(Call call) {
        C9612q.m13917h(call, "call");
    }

    /* renamed from: x */
    public void m5521x(Call call, IOException ioe) {
        C9612q.m13917h(call, "call");
        C9612q.m13917h(ioe, "ioe");
    }

    /* renamed from: y */
    public void m5520y(Call call, Response response) {
        C9612q.m13917h(call, "call");
        C9612q.m13917h(response, "response");
    }

    /* renamed from: z */
    public void m5519z(Call call) {
        C9612q.m13917h(call, "call");
    }
}