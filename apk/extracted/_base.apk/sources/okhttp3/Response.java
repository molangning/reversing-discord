package okhttp3;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.views.image.ReactImageView;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9543h;
import kotlin.jvm.internal.C9612q;
import okhttp3.Headers;
import p328rj.C12289f;
import p328rj.C12306n;
import p328rj.EnumC12312p;
import p410wj.C13634c;
import p431xj.C13838e;

@Metadata(m14358d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u00015B}\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\"\u0012\b\u0010,\u001a\u0004\u0018\u00010'\u0012\u0006\u00102\u001a\u00020-\u0012\b\u00107\u001a\u0004\u0018\u000103\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010F\u001a\u00020A\u0012\u0006\u0010I\u001a\u00020A\u0012\b\u0010N\u001a\u0004\u0018\u00010J¢\u0006\u0004\bX\u0010YJ\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\u0006\u0010\u0007\u001a\u00020\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00178\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010!\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010&\u001a\u00020\"8\u0007¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001d\u0010%R\u0019\u0010,\u001a\u0004\u0018\u00010'8\u0007¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u00102\u001a\u00020-8\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u00107\u001a\u0004\u0018\u0001038\u0007¢\u0006\f\n\u0004\b*\u00104\u001a\u0004\b5\u00106R\u0019\u0010;\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b$\u0010:R\u0019\u0010>\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010:R\u0019\u0010@\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b?\u0010:R\u0017\u0010F\u001a\u00020A8\u0007¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010I\u001a\u00020A8\u0007¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010ER\u001c\u0010N\u001a\u0004\u0018\u00010J8\u0001X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\b(\u0010MR\u0011\u0010R\u001a\u00020O8F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0011\u0010T\u001a\u00020O8F¢\u0006\u0006\u001a\u0004\bS\u0010QR\u0011\u0010W\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006Z"}, m14357d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "", ZeroconfModule.KEY_SERVICE_NAME, "defaultValue", "t", "Lokhttp3/Response$a;", "Q", "", "Lrj/f;", "j", "", "close", "toString", "Lokhttp3/CacheControl;", "Lokhttp3/CacheControl;", "lazyCacheControl", "Lokhttp3/Request;", "k", "Lokhttp3/Request;", "V", "()Lokhttp3/Request;", "request", "Lrj/p;", "l", "Lrj/p;", "S", "()Lrj/p;", "protocol", "m", "Ljava/lang/String;", "H", "()Ljava/lang/String;", "message", "", "n", "I", "()I", "code", "Lrj/n;", "o", "Lrj/n;", "q", "()Lrj/n;", "handshake", "Lokhttp3/Headers;", "p", "Lokhttp3/Headers;", "A", "()Lokhttp3/Headers;", "headers", "Lokhttp3/ResponseBody;", "Lokhttp3/ResponseBody;", "a", "()Lokhttp3/ResponseBody;", "body", "r", "Lokhttp3/Response;", "()Lokhttp3/Response;", "networkResponse", "s", "i", "cacheResponse", "R", "priorResponse", "", "u", "J", "Y", "()J", "sentRequestAtMillis", "v", "U", "receivedResponseAtMillis", "Lwj/c;", "w", "Lwj/c;", "()Lwj/c;", "exchange", "", "X", "()Z", "isSuccessful", "D", "isRedirect", "h", "()Lokhttp3/CacheControl;", "cacheControl", "<init>", "(Lokhttp3/Request;Lrj/p;Ljava/lang/String;ILrj/n;Lokhttp3/Headers;Lokhttp3/ResponseBody;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLwj/c;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class Response implements Closeable {

    /* renamed from: j */
    private CacheControl f29428j;

    /* renamed from: k */
    private final Request f29429k;

    /* renamed from: l */
    private final EnumC12312p f29430l;

    /* renamed from: m */
    private final String f29431m;

    /* renamed from: n */
    private final int f29432n;

    /* renamed from: o */
    private final C12306n f29433o;

    /* renamed from: p */
    private final Headers f29434p;

    /* renamed from: q */
    private final ResponseBody f29435q;

    /* renamed from: r */
    private final Response f29436r;

    /* renamed from: s */
    private final Response f29437s;

    /* renamed from: t */
    private final Response f29438t;

    /* renamed from: u */
    private final long f29439u;

    /* renamed from: v */
    private final long f29440v;

    /* renamed from: w */
    private final C13634c f29441w;

    public Response(Request request, EnumC12312p protocol, String message, int i, C12306n c12306n, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j, long j2, C13634c c13634c) {
        C9612q.m13917h(request, "request");
        C9612q.m13917h(protocol, "protocol");
        C9612q.m13917h(message, "message");
        C9612q.m13917h(headers, "headers");
        this.f29429k = request;
        this.f29430l = protocol;
        this.f29431m = message;
        this.f29432n = i;
        this.f29433o = c12306n;
        this.f29434p = headers;
        this.f29435q = responseBody;
        this.f29436r = response;
        this.f29437s = response2;
        this.f29438t = response3;
        this.f29439u = j;
        this.f29440v = j2;
        this.f29441w = c13634c;
    }

    /* renamed from: v */
    public static /* synthetic */ String m8690v(Response response, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return response.m8691t(str, str2);
    }

    /* renamed from: A */
    public final Headers m8710A() {
        return this.f29434p;
    }

    /* renamed from: D */
    public final boolean m8709D() {
        int i = this.f29432n;
        if (i != 307 && i != 308) {
            switch (i) {
                case ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS /* 300 */:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    public final String m8708H() {
        return this.f29431m;
    }

    /* renamed from: I */
    public final Response m8707I() {
        return this.f29436r;
    }

    /* renamed from: Q */
    public final C11207a m8706Q() {
        return new C11207a(this);
    }

    /* renamed from: R */
    public final Response m8705R() {
        return this.f29438t;
    }

    /* renamed from: S */
    public final EnumC12312p m8704S() {
        return this.f29430l;
    }

    /* renamed from: U */
    public final long m8703U() {
        return this.f29440v;
    }

    /* renamed from: V */
    public final Request m8702V() {
        return this.f29429k;
    }

    /* renamed from: X */
    public final boolean m8701X() {
        int i = this.f29432n;
        return 200 <= i && 299 >= i;
    }

    /* renamed from: Y */
    public final long m8700Y() {
        return this.f29439u;
    }

    /* renamed from: a */
    public final ResponseBody m8699a() {
        return this.f29435q;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.f29435q;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        responseBody.close();
    }

    /* renamed from: h */
    public final CacheControl m8698h() {
        CacheControl cacheControl = this.f29428j;
        if (cacheControl == null) {
            CacheControl m8965b = CacheControl.f29241p.m8965b(this.f29434p);
            this.f29428j = m8965b;
            return m8965b;
        }
        return cacheControl;
    }

    /* renamed from: i */
    public final Response m8697i() {
        return this.f29437s;
    }

    /* renamed from: j */
    public final List<C12289f> m8696j() {
        String str;
        Headers headers = this.f29434p;
        int i = this.f29432n;
        if (i != 401) {
            if (i != 407) {
                return C9543h.m14145i();
            }
            str = "Proxy-Authenticate";
        } else {
            str = "WWW-Authenticate";
        }
        return C13838e.m1436a(headers, str);
    }

    /* renamed from: m */
    public final int m8695m() {
        return this.f29432n;
    }

    /* renamed from: o */
    public final C13634c m8694o() {
        return this.f29441w;
    }

    /* renamed from: q */
    public final C12306n m8693q() {
        return this.f29433o;
    }

    /* renamed from: s */
    public final String m8692s(String str) {
        return m8690v(this, str, null, 2, null);
    }

    /* renamed from: t */
    public final String m8691t(String name, String str) {
        C9612q.m13917h(name, "name");
        String m8929a = this.f29434p.m8929a(name);
        if (m8929a != null) {
            return m8929a;
        }
        return str;
    }

    public String toString() {
        return "Response{protocol=" + this.f29430l + ", code=" + this.f29432n + ", message=" + this.f29431m + ", url=" + this.f29429k.m8734l() + '}';
    }

    @Metadata(m14358d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\"\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\bi\u0010jB\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bi\u0010XJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0012\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0012\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010!\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010#\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010%\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020&H\u0016J\u0017\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b-\u0010.J\b\u0010/\u001a\u00020\u0004H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u001b\u001a\u00020I8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010 \u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010\"\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010T\u001a\u0004\bY\u0010V\"\u0004\bZ\u0010XR$\u0010$\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010T\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010XR\"\u0010'\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010)\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010]\u001a\u0004\bb\u0010_\"\u0004\bc\u0010aR$\u0010h\u001a\u0004\u0018\u00010+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010.¨\u0006k"}, m14357d2 = {"Lokhttp3/Response$a;", "", "", ZeroconfModule.KEY_SERVICE_NAME, "Lokhttp3/Response;", "response", "", "f", "e", "Lokhttp3/Request;", "request", "r", "Lrj/p;", "protocol", "p", "", "code", "g", "message", "m", "Lrj/n;", "handshake", "i", "value", "j", "a", "Lokhttp3/Headers;", "headers", "k", "Lokhttp3/ResponseBody;", "body", "b", "networkResponse", "n", "cacheResponse", "d", "priorResponse", "o", "", "sentRequestAtMillis", "s", "receivedResponseAtMillis", "q", "Lwj/c;", "deferredTrailers", "l", "(Lwj/c;)V", "c", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "setRequest$okhttp", "(Lokhttp3/Request;)V", "Lrj/p;", "getProtocol$okhttp", "()Lrj/p;", "setProtocol$okhttp", "(Lrj/p;)V", "I", "h", "()I", "setCode$okhttp", "(I)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "Lrj/n;", "getHandshake$okhttp", "()Lrj/n;", "setHandshake$okhttp", "(Lrj/n;)V", "Lokhttp3/Headers$a;", "Lokhttp3/Headers$a;", "getHeaders$okhttp", "()Lokhttp3/Headers$a;", "setHeaders$okhttp", "(Lokhttp3/Headers$a;)V", "Lokhttp3/ResponseBody;", "getBody$okhttp", "()Lokhttp3/ResponseBody;", "setBody$okhttp", "(Lokhttp3/ResponseBody;)V", "Lokhttp3/Response;", "getNetworkResponse$okhttp", "()Lokhttp3/Response;", "setNetworkResponse$okhttp", "(Lokhttp3/Response;)V", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "J", "getSentRequestAtMillis$okhttp", "()J", "setSentRequestAtMillis$okhttp", "(J)V", "getReceivedResponseAtMillis$okhttp", "setReceivedResponseAtMillis$okhttp", "Lwj/c;", "getExchange$okhttp", "()Lwj/c;", "setExchange$okhttp", "exchange", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okhttp3.Response$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C11207a {

        /* renamed from: a */
        private Request f29442a;

        /* renamed from: b */
        private EnumC12312p f29443b;

        /* renamed from: c */
        private int f29444c;

        /* renamed from: d */
        private String f29445d;

        /* renamed from: e */
        private C12306n f29446e;

        /* renamed from: f */
        private Headers.C11194a f29447f;

        /* renamed from: g */
        private ResponseBody f29448g;

        /* renamed from: h */
        private Response f29449h;

        /* renamed from: i */
        private Response f29450i;

        /* renamed from: j */
        private Response f29451j;

        /* renamed from: k */
        private long f29452k;

        /* renamed from: l */
        private long f29453l;

        /* renamed from: m */
        private C13634c f29454m;

        public C11207a() {
            this.f29444c = -1;
            this.f29447f = new Headers.C11194a();
        }

        /* renamed from: e */
        private final void m8685e(Response response) {
            if (response != null) {
                if (!(response.m8699a() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        /* renamed from: f */
        private final void m8684f(String str, Response response) {
            boolean z;
            boolean z2;
            boolean z3;
            if (response != null) {
                boolean z4 = true;
                if (response.m8699a() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (response.m8707I() == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (response.m8697i() == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            if (response.m8705R() != null) {
                                z4 = false;
                            }
                            if (!z4) {
                                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException((str + ".body != null").toString());
            }
        }

        /* renamed from: a */
        public C11207a m8689a(String name, String value) {
            C9612q.m13917h(name, "name");
            C9612q.m13917h(value, "value");
            this.f29447f.m8922a(name, value);
            return this;
        }

        /* renamed from: b */
        public C11207a m8688b(ResponseBody responseBody) {
            this.f29448g = responseBody;
            return this;
        }

        /* renamed from: c */
        public Response m8687c() {
            boolean z;
            int i = this.f29444c;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Request request = this.f29442a;
                if (request != null) {
                    EnumC12312p enumC12312p = this.f29443b;
                    if (enumC12312p != null) {
                        String str = this.f29445d;
                        if (str != null) {
                            return new Response(request, enumC12312p, str, i, this.f29446e, this.f29447f.m8919d(), this.f29448g, this.f29449h, this.f29450i, this.f29451j, this.f29452k, this.f29453l, this.f29454m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(("code < 0: " + this.f29444c).toString());
        }

        /* renamed from: d */
        public C11207a m8686d(Response response) {
            m8684f("cacheResponse", response);
            this.f29450i = response;
            return this;
        }

        /* renamed from: g */
        public C11207a m8683g(int i) {
            this.f29444c = i;
            return this;
        }

        /* renamed from: h */
        public final int m8682h() {
            return this.f29444c;
        }

        /* renamed from: i */
        public C11207a m8681i(C12306n c12306n) {
            this.f29446e = c12306n;
            return this;
        }

        /* renamed from: j */
        public C11207a m8680j(String name, String value) {
            C9612q.m13917h(name, "name");
            C9612q.m13917h(value, "value");
            this.f29447f.m8915h(name, value);
            return this;
        }

        /* renamed from: k */
        public C11207a m8679k(Headers headers) {
            C9612q.m13917h(headers, "headers");
            this.f29447f = headers.m8927h();
            return this;
        }

        /* renamed from: l */
        public final void m8678l(C13634c deferredTrailers) {
            C9612q.m13917h(deferredTrailers, "deferredTrailers");
            this.f29454m = deferredTrailers;
        }

        /* renamed from: m */
        public C11207a m8677m(String message) {
            C9612q.m13917h(message, "message");
            this.f29445d = message;
            return this;
        }

        /* renamed from: n */
        public C11207a m8676n(Response response) {
            m8684f("networkResponse", response);
            this.f29449h = response;
            return this;
        }

        /* renamed from: o */
        public C11207a m8675o(Response response) {
            m8685e(response);
            this.f29451j = response;
            return this;
        }

        /* renamed from: p */
        public C11207a m8674p(EnumC12312p protocol) {
            C9612q.m13917h(protocol, "protocol");
            this.f29443b = protocol;
            return this;
        }

        /* renamed from: q */
        public C11207a m8673q(long j) {
            this.f29453l = j;
            return this;
        }

        /* renamed from: r */
        public C11207a m8672r(Request request) {
            C9612q.m13917h(request, "request");
            this.f29442a = request;
            return this;
        }

        /* renamed from: s */
        public C11207a m8671s(long j) {
            this.f29452k = j;
            return this;
        }

        public C11207a(Response response) {
            C9612q.m13917h(response, "response");
            this.f29444c = -1;
            this.f29442a = response.m8702V();
            this.f29443b = response.m8704S();
            this.f29444c = response.m8695m();
            this.f29445d = response.m8708H();
            this.f29446e = response.m8693q();
            this.f29447f = response.m8710A().m8927h();
            this.f29448g = response.m8699a();
            this.f29449h = response.m8707I();
            this.f29450i = response.m8697i();
            this.f29451j = response.m8705R();
            this.f29452k = response.m8700Y();
            this.f29453l = response.m8703U();
            this.f29454m = response.m8694o();
        }
    }
}
