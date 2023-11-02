package p471zj;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.Sink;
import okio.Source;
import p328rj.EnumC12312p;
import p410wj.C13642f;
import p431xj.C13838e;
import p431xj.C13840g;
import p431xj.C13842i;
import p431xj.C13845k;
import p431xj.InterfaceC13837d;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 -2\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010(\u001a\u00020&¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b\u001c\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'¨\u0006."}, m14357d2 = {"Lzj/g;", "Lxj/d;", "Lokhttp3/Request;", "request", "", "contentLength", "Lokio/Sink;", "e", "", "f", "h", "a", "", "expectContinue", "Lokhttp3/Response$a;", "g", "Lokhttp3/Response;", "response", "d", "Lokio/Source;", "b", "cancel", "Lzj/i;", "Lzj/i;", "stream", "Lrj/p;", "Lrj/p;", "protocol", "c", "Z", "canceled", "Lwj/f;", "Lwj/f;", "()Lwj/f;", "connection", "Lxj/g;", "Lxj/g;", "chain", "Lzj/f;", "Lzj/f;", "http2Connection", "Lokhttp3/OkHttpClient;", "client", "<init>", "(Lokhttp3/OkHttpClient;Lwj/f;Lxj/g;Lzj/f;)V", "i", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: zj.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C14318g implements InterfaceC13837d {

    /* renamed from: a */
    private volatile C14324i f36855a;

    /* renamed from: b */
    private final EnumC12312p f36856b;

    /* renamed from: c */
    private volatile boolean f36857c;

    /* renamed from: d */
    private final C13642f f36858d;

    /* renamed from: e */
    private final C13840g f36859e;

    /* renamed from: f */
    private final C14299f f36860f;

    /* renamed from: i */
    public static final C14319a f36854i = new C14319a(null);

    /* renamed from: g */
    private static final List<String> f36852g = C12562c.m4791t("connection", ZeroconfModule.KEY_SERVICE_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    private static final List<String> f36853h = C12562c.m4791t("connection", ZeroconfModule.KEY_SERVICE_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    @Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001c"}, m14357d2 = {"Lzj/g$a;", "", "Lokhttp3/Request;", "request", "", "Lzj/c;", "a", "Lokhttp3/Headers;", "headerBlock", "Lrj/p;", "protocol", "Lokhttp3/Response$a;", "b", "", "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C14319a {
        private C14319a() {
        }

        public /* synthetic */ C14319a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List<C14293c> m112a(Request request) {
            C9612q.m13917h(request, "request");
            Headers m8740f = request.m8740f();
            ArrayList arrayList = new ArrayList(m8740f.size() + 4);
            arrayList.add(new C14293c(C14293c.f36710f, request.m8738h()));
            arrayList.add(new C14293c(C14293c.f36711g, C13842i.f35643a.m1410c(request.m8734l())));
            String m8742d = request.m8742d("Host");
            if (m8742d != null) {
                arrayList.add(new C14293c(C14293c.f36713i, m8742d));
            }
            arrayList.add(new C14293c(C14293c.f36712h, request.m8734l().m8890q()));
            int size = m8740f.size();
            for (int i = 0; i < size; i++) {
                String m8928e = m8740f.m8928e(i);
                Locale locale = Locale.US;
                C9612q.m13918g(locale, "Locale.US");
                if (m8928e != null) {
                    String lowerCase = m8928e.toLowerCase(locale);
                    C9612q.m13918g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (!C14318g.f36852g.contains(lowerCase) || (C9612q.m13922c(lowerCase, "te") && C9612q.m13922c(m8740f.m8924o(i), "trailers"))) {
                        arrayList.add(new C14293c(lowerCase, m8740f.m8924o(i)));
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public final Response.C11207a m111b(Headers headerBlock, EnumC12312p protocol) {
            C9612q.m13917h(headerBlock, "headerBlock");
            C9612q.m13917h(protocol, "protocol");
            Headers.C11194a c11194a = new Headers.C11194a();
            int size = headerBlock.size();
            C13845k c13845k = null;
            for (int i = 0; i < size; i++) {
                String m8928e = headerBlock.m8928e(i);
                String m8924o = headerBlock.m8924o(i);
                if (C9612q.m13922c(m8928e, ":status")) {
                    C13845k.C13846a c13846a = C13845k.f35646d;
                    c13845k = c13846a.m1403a("HTTP/1.1 " + m8924o);
                } else if (!C14318g.f36853h.contains(m8928e)) {
                    c11194a.m8920c(m8928e, m8924o);
                }
            }
            if (c13845k != null) {
                return new Response.C11207a().m8674p(protocol).m8683g(c13845k.f35648b).m8677m(c13845k.f35649c).m8679k(c11194a.m8919d());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public C14318g(OkHttpClient client, C13642f connection, C13840g chain, C14299f http2Connection) {
        C9612q.m13917h(client, "client");
        C9612q.m13917h(connection, "connection");
        C9612q.m13917h(chain, "chain");
        C9612q.m13917h(http2Connection, "http2Connection");
        this.f36858d = connection;
        this.f36859e = chain;
        this.f36860f = http2Connection;
        List<EnumC12312p> m8822E = client.m8822E();
        EnumC12312p enumC12312p = EnumC12312p.H2_PRIOR_KNOWLEDGE;
        this.f36856b = m8822E.contains(enumC12312p) ? enumC12312p : EnumC12312p.HTTP_2;
    }

    @Override // p431xj.InterfaceC13837d
    /* renamed from: a */
    public void mo122a() {
        C14324i c14324i = this.f36855a;
        C9612q.m13920e(c14324i);
        c14324i.m59n().close();
    }

    @Override // p431xj.InterfaceC13837d
    /* renamed from: b */
    public Source mo121b(Response response) {
        C9612q.m13917h(response, "response");
        C14324i c14324i = this.f36855a;
        C9612q.m13920e(c14324i);
        return c14324i.m57p();
    }

    @Override // p431xj.InterfaceC13837d
    /* renamed from: c */
    public C13642f mo120c() {
        return this.f36858d;
    }

    @Override // p431xj.InterfaceC13837d
    public void cancel() {
        this.f36857c = true;
        C14324i c14324i = this.f36855a;
        if (c14324i != null) {
            c14324i.m67f(EnumC14291b.CANCEL);
        }
    }

    @Override // p431xj.InterfaceC13837d
    /* renamed from: d */
    public long mo119d(Response response) {
        C9612q.m13917h(response, "response");
        if (!C13838e.m1435b(response)) {
            return 0L;
        }
        return C12562c.m4792s(response);
    }

    @Override // p431xj.InterfaceC13837d
    /* renamed from: e */
    public Sink mo118e(Request request, long j) {
        C9612q.m13917h(request, "request");
        C14324i c14324i = this.f36855a;
        C9612q.m13920e(c14324i);
        return c14324i.m59n();
    }

    @Override // p431xj.InterfaceC13837d
    /* renamed from: f */
    public void mo117f(Request request) {
        boolean z;
        C9612q.m13917h(request, "request");
        if (this.f36855a != null) {
            return;
        }
        if (request.m8745a() != null) {
            z = true;
        } else {
            z = false;
        }
        this.f36855a = this.f36860f.m182I0(f36854i.m112a(request), z);
        if (!this.f36857c) {
            C14324i c14324i = this.f36855a;
            C9612q.m13920e(c14324i);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c14324i.m51v().mo8536g(this.f36859e.m1416h(), timeUnit);
            C14324i c14324i2 = this.f36855a;
            C9612q.m13920e(c14324i2);
            c14324i2.m73E().mo8536g(this.f36859e.m1414j(), timeUnit);
            return;
        }
        C14324i c14324i3 = this.f36855a;
        C9612q.m13920e(c14324i3);
        c14324i3.m67f(EnumC14291b.CANCEL);
        throw new IOException("Canceled");
    }

    @Override // p431xj.InterfaceC13837d
    /* renamed from: g */
    public Response.C11207a mo116g(boolean z) {
        C14324i c14324i = this.f36855a;
        C9612q.m13920e(c14324i);
        Response.C11207a m111b = f36854i.m111b(c14324i.m75C(), this.f36856b);
        if (z && m111b.m8682h() == 100) {
            return null;
        }
        return m111b;
    }

    @Override // p431xj.InterfaceC13837d
    /* renamed from: h */
    public void mo115h() {
        this.f36860f.flush();
    }
}