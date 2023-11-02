package okhttp3;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9543h;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9642f;
import okhttp3.Headers;
import p304qf.C11886s;
import p431xj.C13839f;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u00014BC\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u001f\u0012\b\u0010'\u001a\u0004\u0018\u00010$\u0012\u0016\u0010+\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0004\b2\u00103J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001J%\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010#\u001a\u00020\u001f8\u0007¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010'\u001a\u0004\u0018\u00010$8\u0007¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b\u0011\u0010&R*\u0010+\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\b\u001a\u0010*R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u00101\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0015\u00100¨\u00065"}, m14357d2 = {"Lokhttp3/Request;", "", "", ZeroconfModule.KEY_SERVICE_NAME, "d", "", "e", "j", "T", "Ljava/lang/Class;", "type", "k", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lokhttp3/Request$Builder;", "i", "toString", "Lokhttp3/CacheControl;", "a", "Lokhttp3/CacheControl;", "lazyCacheControl", "Lokhttp3/HttpUrl;", "b", "Lokhttp3/HttpUrl;", "l", "()Lokhttp3/HttpUrl;", "url", "c", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "method", "Lokhttp3/Headers;", "Lokhttp3/Headers;", "f", "()Lokhttp3/Headers;", "headers", "Lokhttp3/RequestBody;", "Lokhttp3/RequestBody;", "()Lokhttp3/RequestBody;", "body", "", "Ljava/util/Map;", "()Ljava/util/Map;", "tags", "", "g", "()Z", "isHttps", "()Lokhttp3/CacheControl;", "cacheControl", "<init>", "(Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/Headers;Lokhttp3/RequestBody;Ljava/util/Map;)V", "Builder", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class Request {

    /* renamed from: a */
    private CacheControl f29409a;

    /* renamed from: b */
    private final HttpUrl f29410b;

    /* renamed from: c */
    private final String f29411c;

    /* renamed from: d */
    private final Headers f29412d;

    /* renamed from: e */
    private final RequestBody f29413e;

    /* renamed from: f */
    private final Map<Class<?>, Object> f29414f;

    public Request(HttpUrl url, String method, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> tags) {
        C9612q.m13917h(url, "url");
        C9612q.m13917h(method, "method");
        C9612q.m13917h(headers, "headers");
        C9612q.m13917h(tags, "tags");
        this.f29410b = url;
        this.f29411c = method;
        this.f29412d = headers;
        this.f29413e = requestBody;
        this.f29414f = tags;
    }

    /* renamed from: a */
    public final RequestBody m8745a() {
        return this.f29413e;
    }

    /* renamed from: b */
    public final CacheControl m8744b() {
        CacheControl cacheControl = this.f29409a;
        if (cacheControl == null) {
            CacheControl m8965b = CacheControl.f29241p.m8965b(this.f29412d);
            this.f29409a = m8965b;
            return m8965b;
        }
        return cacheControl;
    }

    /* renamed from: c */
    public final Map<Class<?>, Object> m8743c() {
        return this.f29414f;
    }

    /* renamed from: d */
    public final String m8742d(String name) {
        C9612q.m13917h(name, "name");
        return this.f29412d.m8929a(name);
    }

    /* renamed from: e */
    public final List<String> m8741e(String name) {
        C9612q.m13917h(name, "name");
        return this.f29412d.m8923p(name);
    }

    /* renamed from: f */
    public final Headers m8740f() {
        return this.f29412d;
    }

    /* renamed from: g */
    public final boolean m8739g() {
        return this.f29410b.m8898i();
    }

    /* renamed from: h */
    public final String m8738h() {
        return this.f29411c;
    }

    /* renamed from: i */
    public final Builder m8737i() {
        return new Builder(this);
    }

    /* renamed from: j */
    public final Object m8736j() {
        return m8735k(Object.class);
    }

    /* renamed from: k */
    public final <T> T m8735k(Class<? extends T> type) {
        C9612q.m13917h(type, "type");
        return type.cast(this.f29414f.get(type));
    }

    /* renamed from: l */
    public final HttpUrl m8734l() {
        return this.f29410b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.f29411c);
        sb2.append(", url=");
        sb2.append(this.f29410b);
        if (this.f29412d.size() != 0) {
            sb2.append(", headers=[");
            int i = 0;
            for (Pair<? extends String, ? extends String> pair : this.f29412d) {
                int i2 = i + 1;
                if (i < 0) {
                    C9543h.m14126s();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String m14351a = pair2.m14351a();
                String m14350b = pair2.m14350b();
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(m14351a);
                sb2.append(':');
                sb2.append(m14350b);
                i = i2;
            }
            sb2.append(']');
        }
        if (!this.f29414f.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.f29414f);
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @Metadata(m14358d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b=\u0010>B\u0011\b\u0010\u0012\u0006\u0010?\u001a\u00020\u001f¢\u0006\u0004\b=\u0010@J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0000H\u0016J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u001a\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0016J/\u0010\u001d\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u001a2\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010 \u001a\u00020\u001fH\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0016\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\r\u001a\u00020+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R2\u0010<\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b\u0012\u0004\u0012\u00020\u0001068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006A"}, m14357d2 = {"Lokhttp3/Request$Builder;", "", "Lokhttp3/HttpUrl;", "url", "m", "", "l", ZeroconfModule.KEY_SERVICE_NAME, "value", "e", "a", "i", "Lokhttp3/Headers;", "headers", "f", "Lokhttp3/CacheControl;", "cacheControl", "c", "d", "Lokhttp3/RequestBody;", "body", "h", "method", "g", "tag", "k", "T", "Ljava/lang/Class;", "type", "j", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Lokhttp3/Request;", "b", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "Ljava/lang/String;", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/Headers$a;", "Lokhttp3/Headers$a;", "getHeaders$okhttp", "()Lokhttp3/Headers$a;", "setHeaders$okhttp", "(Lokhttp3/Headers$a;)V", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "", "Ljava/util/Map;", "getTags$okhttp", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", "tags", "<init>", "()V", "request", "(Lokhttp3/Request;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class Builder {

        /* renamed from: a */
        private HttpUrl f29415a;

        /* renamed from: b */
        private String f29416b;

        /* renamed from: c */
        private Headers.C11194a f29417c;

        /* renamed from: d */
        private RequestBody f29418d;

        /* renamed from: e */
        private Map<Class<?>, Object> f29419e;

        public Builder() {
            this.f29419e = new LinkedHashMap();
            this.f29416b = "GET";
            this.f29417c = new Headers.C11194a();
        }

        /* renamed from: a */
        public Builder m8733a(String name, String value) {
            C9612q.m13917h(name, "name");
            C9612q.m13917h(value, "value");
            this.f29417c.m8922a(name, value);
            return this;
        }

        /* renamed from: b */
        public Request m8732b() {
            HttpUrl httpUrl = this.f29415a;
            if (httpUrl != null) {
                return new Request(httpUrl, this.f29416b, this.f29417c.m8919d(), this.f29418d, C12562c.m4817S(this.f29419e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        /* renamed from: c */
        public Builder m8731c(CacheControl cacheControl) {
            boolean z;
            C9612q.m13917h(cacheControl, "cacheControl");
            String cacheControl2 = cacheControl.toString();
            if (cacheControl2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return m8725i("Cache-Control");
            }
            return m8729e("Cache-Control", cacheControl2);
        }

        /* renamed from: d */
        public Builder m8730d() {
            return m8727g("GET", null);
        }

        /* renamed from: e */
        public Builder m8729e(String name, String value) {
            C9612q.m13917h(name, "name");
            C9612q.m13917h(value, "value");
            this.f29417c.m8915h(name, value);
            return this;
        }

        /* renamed from: f */
        public Builder m8728f(Headers headers) {
            C9612q.m13917h(headers, "headers");
            this.f29417c = headers.m8927h();
            return this;
        }

        /* renamed from: g */
        public Builder m8727g(String method, RequestBody requestBody) {
            boolean z;
            C9612q.m13917h(method, "method");
            if (method.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (requestBody == null) {
                    if (!(true ^ C13839f.m1424e(method))) {
                        throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                    }
                } else if (!C13839f.m1427b(method)) {
                    throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
                }
                this.f29416b = method;
                this.f29418d = requestBody;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        /* renamed from: h */
        public Builder m8726h(RequestBody body) {
            C9612q.m13917h(body, "body");
            return m8727g("POST", body);
        }

        /* renamed from: i */
        public Builder m8725i(String name) {
            C9612q.m13917h(name, "name");
            this.f29417c.m8916g(name);
            return this;
        }

        /* renamed from: j */
        public <T> Builder m8724j(Class<? super T> type, T t) {
            C9612q.m13917h(type, "type");
            if (t == null) {
                this.f29419e.remove(type);
            } else {
                if (this.f29419e.isEmpty()) {
                    this.f29419e = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.f29419e;
                T cast = type.cast(t);
                C9612q.m13920e(cast);
                map.put(type, cast);
            }
            return this;
        }

        /* renamed from: k */
        public Builder m8723k(Object obj) {
            return m8724j(Object.class, obj);
        }

        /* renamed from: l */
        public Builder m8722l(String url) {
            C9612q.m13917h(url, "url");
            if (C9642f.m13837F(url, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String substring = url.substring(3);
                C9612q.m13918g(substring, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                url = sb2.toString();
            } else if (C9642f.m13837F(url, "wss:", true)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("https:");
                String substring2 = url.substring(4);
                C9612q.m13918g(substring2, "(this as java.lang.String).substring(startIndex)");
                sb3.append(substring2);
                url = sb3.toString();
            }
            return m8721m(HttpUrl.f29299l.m8854d(url));
        }

        /* renamed from: m */
        public Builder m8721m(HttpUrl url) {
            C9612q.m13917h(url, "url");
            this.f29415a = url;
            return this;
        }

        public Builder(Request request) {
            Map<Class<?>, Object> m6762v;
            C9612q.m13917h(request, "request");
            this.f29419e = new LinkedHashMap();
            this.f29415a = request.m8734l();
            this.f29416b = request.m8738h();
            this.f29418d = request.m8745a();
            if (request.m8743c().isEmpty()) {
                m6762v = new LinkedHashMap<>();
            } else {
                m6762v = C11886s.m6762v(request.m8743c());
            }
            this.f29419e = m6762v;
            this.f29417c = request.m8740f().m8927h();
        }
    }
}
