package p328rj;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9545j;
import kotlin.collections.C9560w;
import kotlin.jvm.internal.C9602k0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Sink;
import okio.Source;
import p015ak.InterfaceC0214a;
import p031bk.C2370k;
import p122gk.AbstractC6832f;
import p122gk.AbstractC6833g;
import p122gk.C6840m;
import p374uj.C12991c;
import p374uj.C12994d;
import p374uj.InterfaceC12990b;
import p390vj.C13346e;
import p431xj.C13839f;
import p431xj.C13845k;
import p467zf.C14180c;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0004\u0007=>?B!\b\u0000\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:B\u0019\b\u0016\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b9\u0010;J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0018\u00010\u0003R\u00020\u0004H\u0002J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010*\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b\u001f\u0010'\"\u0004\b(\u0010)R\"\u0010.\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\u0016\u0010/\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0016\u00101\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010&R\u0016\u00102\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010&¨\u0006@"}, m14357d2 = {"Lrj/c;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Luj/d$b;", "Luj/d;", "editor", "", "a", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "h", "(Lokhttp3/Request;)Lokhttp3/Response;", "response", "Luj/b;", "m", "(Lokhttp3/Response;)Luj/b;", "o", "(Lokhttp3/Request;)V", "cached", "network", "A", "(Lokhttp3/Response;Lokhttp3/Response;)V", "flush", "close", "Luj/c;", "cacheStrategy", "v", "(Luj/c;)V", "t", "()V", "j", "Luj/d;", "getCache$okhttp", "()Luj/d;", "cache", "", "k", "I", "()I", "s", "(I)V", "writeSuccessCount", "l", "i", "q", "writeAbortCount", "networkCount", "n", "hitCount", "requestCount", "Ljava/io/File;", "directory", "", "maxSize", "Lak/a;", "fileSystem", "<init>", "(Ljava/io/File;JLak/a;)V", "(Ljava/io/File;J)V", "p", "b", "c", "d", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: rj.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C12275c implements Closeable, Flushable {

    /* renamed from: p */
    public static final C12278b f31888p = new C12278b(null);

    /* renamed from: j */
    private final C12994d f31889j;

    /* renamed from: k */
    private int f31890k;

    /* renamed from: l */
    private int f31891l;

    /* renamed from: m */
    private int f31892m;

    /* renamed from: n */
    private int f31893n;

    /* renamed from: o */
    private int f31894o;

    @Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0011\u001a\u00060\u000bR\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001b\u0010\u0011\u001a\u00060\u000bR\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0018"}, m14357d2 = {"Lrj/c$a;", "Lokhttp3/ResponseBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/BufferedSource;", "source", "j", "Lokio/BufferedSource;", "bodySource", "Luj/d$d;", "Luj/d;", "k", "Luj/d$d;", "a", "()Luj/d$d;", "snapshot", "", "l", "Ljava/lang/String;", "m", "<init>", "(Luj/d$d;Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: rj.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12276a extends ResponseBody {

        /* renamed from: j */
        private final BufferedSource f31895j;

        /* renamed from: k */
        private final C12994d.C13000d f31896k;

        /* renamed from: l */
        private final String f31897l;

        /* renamed from: m */
        private final String f31898m;

        @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m14357d2 = {"rj/c$a$a", "Lgk/g;", "", "close", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* renamed from: rj.c$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C12277a extends AbstractC6833g {

            /* renamed from: k */
            final /* synthetic */ Source f31900k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12277a(Source source, Source source2) {
                super(source2);
                C12276a.this = r1;
                this.f31900k = source;
            }

            @Override // p122gk.AbstractC6833g, okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                C12276a.this.m5606a().close();
                super.close();
            }
        }

        public C12276a(C12994d.C13000d snapshot, String str, String str2) {
            C9612q.m13917h(snapshot, "snapshot");
            this.f31896k = snapshot;
            this.f31897l = str;
            this.f31898m = str2;
            Source m3439h = snapshot.m3439h(1);
            this.f31895j = C6840m.m21829d(new C12277a(m3439h, m3439h));
        }

        /* renamed from: a */
        public final C12994d.C13000d m5606a() {
            return this.f31896k;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            String str = this.f31898m;
            if (str != null) {
                return C12562c.m4816T(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.f31897l;
            if (str != null) {
                return MediaType.f29321g.m8836b(str);
            }
            return null;
        }

        @Override // okhttp3.ResponseBody
        public BufferedSource source() {
            return this.f31895j;
        }
    }

    @Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J\n\u0010\u0018\u001a\u00020\u0016*\u00020\u0011J\n\u0010\u0019\u001a\u00020\u0002*\u00020\u0011R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b¨\u0006!"}, m14357d2 = {"Lrj/c$b;", "", "Lokhttp3/Headers;", "", "", "d", "requestHeaders", "responseHeaders", "e", "Lokhttp3/HttpUrl;", "url", "b", "Lokio/BufferedSource;", "source", "", "c", "(Lokio/BufferedSource;)I", "Lokhttp3/Response;", "cachedResponse", "cachedRequest", "Lokhttp3/Request;", "newRequest", "", "g", "a", "f", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: rj.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12278b {
        private C12278b() {
        }

        public /* synthetic */ C12278b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        private final Set<String> m5602d(Headers headers) {
            Set<String> m14007d;
            boolean m13754t;
            List<String> m13683y0;
            CharSequence m13712V0;
            Comparator m13752v;
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                m13754t = C9653o.m13754t("Vary", headers.m8928e(i), true);
                if (m13754t) {
                    String m8924o = headers.m8924o(i);
                    if (treeSet == null) {
                        m13752v = C9653o.m13752v(C9602k0.f25351a);
                        treeSet = new TreeSet(m13752v);
                    }
                    m13683y0 = C9654p.m13683y0(m8924o, new char[]{','}, false, 0, 6, null);
                    for (String str : m13683y0) {
                        if (str != null) {
                            m13712V0 = C9654p.m13712V0(str);
                            treeSet.add(m13712V0.toString());
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    }
                    continue;
                }
            }
            if (treeSet == null) {
                m14007d = C9560w.m14007d();
                return m14007d;
            }
            return treeSet;
        }

        /* renamed from: e */
        private final Headers m5601e(Headers headers, Headers headers2) {
            Set<String> m5602d = m5602d(headers2);
            if (m5602d.isEmpty()) {
                return C12562c.f32609b;
            }
            Headers.C11194a c11194a = new Headers.C11194a();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String m8928e = headers.m8928e(i);
                if (m5602d.contains(m8928e)) {
                    c11194a.m8922a(m8928e, headers.m8924o(i));
                }
            }
            return c11194a.m8919d();
        }

        /* renamed from: a */
        public final boolean m5605a(Response hasVaryAll) {
            C9612q.m13917h(hasVaryAll, "$this$hasVaryAll");
            return m5602d(hasVaryAll.m8710A()).contains("*");
        }

        /* renamed from: b */
        public final String m5604b(HttpUrl url) {
            C9612q.m13917h(url, "url");
            return ByteString.f29482n.m8547d(url.toString()).m8559o().mo8562l();
        }

        /* renamed from: c */
        public final int m5603c(BufferedSource source) {
            boolean z;
            C9612q.m13917h(source, "source");
            try {
                long mo8588i0 = source.mo8588i0();
                String mo8596T = source.mo8596T();
                if (mo8588i0 >= 0 && mo8588i0 <= ((long) ViewDefaults.NUMBER_OF_LINES)) {
                    if (mo8596T.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return (int) mo8588i0;
                    }
                }
                throw new IOException("expected an int but was \"" + mo8588i0 + mo8596T + '\"');
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: f */
        public final Headers m5600f(Response varyHeaders) {
            C9612q.m13917h(varyHeaders, "$this$varyHeaders");
            Response m8707I = varyHeaders.m8707I();
            C9612q.m13920e(m8707I);
            return m5601e(m8707I.m8702V().m8740f(), varyHeaders.m8710A());
        }

        /* renamed from: g */
        public final boolean m5599g(Response cachedResponse, Headers cachedRequest, Request newRequest) {
            C9612q.m13917h(cachedResponse, "cachedResponse");
            C9612q.m13917h(cachedRequest, "cachedRequest");
            C9612q.m13917h(newRequest, "newRequest");
            Set<String> m5602d = m5602d(cachedResponse.m8710A());
            if ((m5602d instanceof Collection) && m5602d.isEmpty()) {
                return true;
            }
            for (String str : m5602d) {
                if (!C9612q.m13922c(cachedRequest.m8923p(str), newRequest.m8741e(str))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u00060\u0011R\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0017"}, m14357d2 = {"Lrj/c$d;", "Luj/b;", "", "a", "Lokio/Sink;", "b", "Lokio/Sink;", "cacheOut", "body", "", "c", "Z", "d", "()Z", "e", "(Z)V", "done", "Luj/d$b;", "Luj/d;", "Luj/d$b;", "editor", "<init>", "(Lrj/c;Luj/d$b;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: rj.c$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public final class C12281d implements InterfaceC12990b {

        /* renamed from: a */
        private final Sink f31914a;

        /* renamed from: b */
        private final Sink f31915b;

        /* renamed from: c */
        private boolean f31916c;

        /* renamed from: d */
        private final C12994d.C12996b f31917d;

        /* renamed from: e */
        final /* synthetic */ C12275c f31918e;

        @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m14357d2 = {"rj/c$d$a", "Lgk/f;", "", "close", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* renamed from: rj.c$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C12282a extends AbstractC6832f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12282a(Sink sink) {
                super(sink);
                C12281d.this = r1;
            }

            @Override // p122gk.AbstractC6832f, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                synchronized (C12281d.this.f31918e) {
                    if (C12281d.this.m5591d()) {
                        return;
                    }
                    C12281d.this.m5590e(true);
                    C12275c c12275c = C12281d.this.f31918e;
                    c12275c.m5609s(c12275c.m5613j() + 1);
                    super.close();
                    C12281d.this.f31917d.m3465b();
                }
            }
        }

        public C12281d(C12275c c12275c, C12994d.C12996b editor) {
            C9612q.m13917h(editor, "editor");
            this.f31918e = c12275c;
            this.f31917d = editor;
            Sink m3461f = editor.m3461f(1);
            this.f31914a = m3461f;
            this.f31915b = new C12282a(m3461f);
        }

        @Override // p374uj.InterfaceC12990b
        /* renamed from: a */
        public void mo3507a() {
            synchronized (this.f31918e) {
                if (this.f31916c) {
                    return;
                }
                this.f31916c = true;
                C12275c c12275c = this.f31918e;
                c12275c.m5610q(c12275c.m5614i() + 1);
                C12562c.m4801j(this.f31914a);
                try {
                    this.f31917d.m3466a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // p374uj.InterfaceC12990b
        /* renamed from: b */
        public Sink mo3506b() {
            return this.f31915b;
        }

        /* renamed from: d */
        public final boolean m5591d() {
            return this.f31916c;
        }

        /* renamed from: e */
        public final void m5590e(boolean z) {
            this.f31916c = z;
        }
    }

    public C12275c(File directory, long j, InterfaceC0214a fileSystem) {
        C9612q.m13917h(directory, "directory");
        C9612q.m13917h(fileSystem, "fileSystem");
        this.f31889j = new C12994d(fileSystem, directory, 201105, 2, j, C13346e.f34428h);
    }

    /* renamed from: a */
    private final void m5616a(C12994d.C12996b c12996b) {
        if (c12996b != null) {
            try {
                c12996b.m3466a();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: A */
    public final void m5617A(Response cached, Response network) {
        C12994d.C12996b c12996b;
        C9612q.m13917h(cached, "cached");
        C9612q.m13917h(network, "network");
        C12279c c12279c = new C12279c(network);
        ResponseBody m8699a = cached.m8699a();
        if (m8699a != null) {
            try {
                c12996b = ((C12276a) m8699a).m5606a().m3440a();
                if (c12996b != null) {
                    try {
                        c12279c.m5593f(c12996b);
                        c12996b.m3465b();
                    } catch (IOException unused) {
                        m5616a(c12996b);
                    }
                }
            } catch (IOException unused2) {
                c12996b = null;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f31889j.close();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f31889j.flush();
    }

    /* renamed from: h */
    public final Response m5615h(Request request) {
        C9612q.m13917h(request, "request");
        try {
            C12994d.C13000d m3488I = this.f31889j.m3488I(f31888p.m5604b(request.m8734l()));
            if (m3488I != null) {
                try {
                    C12279c c12279c = new C12279c(m3488I.m3439h(0));
                    Response m5595d = c12279c.m5595d(m3488I);
                    if (!c12279c.m5597b(request, m5595d)) {
                        ResponseBody m8699a = m5595d.m8699a();
                        if (m8699a != null) {
                            C12562c.m4801j(m8699a);
                        }
                        return null;
                    }
                    return m5595d;
                } catch (IOException unused) {
                    C12562c.m4801j(m3488I);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    /* renamed from: i */
    public final int m5614i() {
        return this.f31891l;
    }

    /* renamed from: j */
    public final int m5613j() {
        return this.f31890k;
    }

    /* renamed from: m */
    public final InterfaceC12990b m5612m(Response response) {
        C12994d.C12996b c12996b;
        C9612q.m13917h(response, "response");
        String m8738h = response.m8702V().m8738h();
        if (C13839f.f35630a.m1428a(response.m8702V().m8738h())) {
            try {
                m5611o(response.m8702V());
            } catch (IOException unused) {
            }
            return null;
        } else if (!C9612q.m13922c(m8738h, "GET")) {
            return null;
        } else {
            C12278b c12278b = f31888p;
            if (c12278b.m5605a(response)) {
                return null;
            }
            C12279c c12279c = new C12279c(response);
            try {
                c12996b = C12994d.m3489H(this.f31889j, c12278b.m5604b(response.m8702V().m8734l()), 0L, 2, null);
                if (c12996b == null) {
                    return null;
                }
                try {
                    c12279c.m5593f(c12996b);
                    return new C12281d(this, c12996b);
                } catch (IOException unused2) {
                    m5616a(c12996b);
                    return null;
                }
            } catch (IOException unused3) {
                c12996b = null;
            }
        }
    }

    /* renamed from: o */
    public final void m5611o(Request request) {
        C9612q.m13917h(request, "request");
        this.f31889j.m3495A0(f31888p.m5604b(request.m8734l()));
    }

    /* renamed from: q */
    public final void m5610q(int i) {
        this.f31891l = i;
    }

    /* renamed from: s */
    public final void m5609s(int i) {
        this.f31890k = i;
    }

    /* renamed from: t */
    public final synchronized void m5608t() {
        this.f31893n++;
    }

    /* renamed from: v */
    public final synchronized void m5607v(C12991c cacheStrategy) {
        C9612q.m13917h(cacheStrategy, "cacheStrategy");
        this.f31894o++;
        if (cacheStrategy.m3504b() != null) {
            this.f31892m++;
        } else if (cacheStrategy.m3505a() != null) {
            this.f31893n++;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12275c(File directory, long j) {
        this(directory, j, InterfaceC0214a.f669a);
        C9612q.m13917h(directory, "directory");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 ;2\u00020\u0001:\u0001\u001aB\u0011\b\u0016\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b8\u0010:J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0012\u0010\u000f\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fR\u00020\rJ\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\u0012\u0010\u0018\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0016R\u00020\rR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0014\u0010 \u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010'\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010)\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001eR\u0016\u0010-\u001a\u0004\u0018\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00103\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R\u0014\u00105\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u00104¨\u0006<"}, m14357d2 = {"Lrj/c$c;", "", "Lokio/BufferedSource;", "source", "", "Ljava/security/cert/Certificate;", "c", "Lokio/BufferedSink;", "sink", "certificates", "", "e", "Luj/d$b;", "Luj/d;", "editor", "f", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "response", "", "b", "Luj/d$d;", "snapshot", "d", "", "a", "Ljava/lang/String;", "url", "Lokhttp3/Headers;", "Lokhttp3/Headers;", "varyHeaders", "requestMethod", "Lrj/p;", "Lrj/p;", "protocol", "", "I", "code", "message", "g", "responseHeaders", "Lrj/n;", "h", "Lrj/n;", "handshake", "", "i", "J", "sentRequestMillis", "j", "receivedResponseMillis", "()Z", "isHttps", "Lokio/Source;", "rawSource", "<init>", "(Lokio/Source;)V", "(Lokhttp3/Response;)V", "m", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: rj.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12279c {

        /* renamed from: k */
        private static final String f31901k;

        /* renamed from: l */
        private static final String f31902l;

        /* renamed from: m */
        public static final C12280a f31903m = new C12280a(null);

        /* renamed from: a */
        private final String f31904a;

        /* renamed from: b */
        private final Headers f31905b;

        /* renamed from: c */
        private final String f31906c;

        /* renamed from: d */
        private final EnumC12312p f31907d;

        /* renamed from: e */
        private final int f31908e;

        /* renamed from: f */
        private final String f31909f;

        /* renamed from: g */
        private final Headers f31910g;

        /* renamed from: h */
        private final C12306n f31911h;

        /* renamed from: i */
        private final long f31912i;

        /* renamed from: j */
        private final long f31913j;

        @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m14357d2 = {"Lrj/c$c$a;", "", "", "RECEIVED_MILLIS", "Ljava/lang/String;", "SENT_MILLIS", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* renamed from: rj.c$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C12280a {
            private C12280a() {
            }

            public /* synthetic */ C12280a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            C2370k.C2371a c2371a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C2370k.f6491c.m33588g().m33604g());
            sb2.append("-Sent-Millis");
            f31901k = sb2.toString();
            f31902l = c2371a.m33588g().m33604g() + "-Received-Millis";
        }

        public C12279c(Source rawSource) {
            EnumC12315r enumC12315r;
            C9612q.m13917h(rawSource, "rawSource");
            try {
                BufferedSource m21829d = C6840m.m21829d(rawSource);
                this.f31904a = m21829d.mo8596T();
                this.f31906c = m21829d.mo8596T();
                Headers.C11194a c11194a = new Headers.C11194a();
                int m5603c = C12275c.f31888p.m5603c(m21829d);
                for (int i = 0; i < m5603c; i++) {
                    c11194a.m8921b(m21829d.mo8596T());
                }
                this.f31905b = c11194a.m8919d();
                C13845k m1403a = C13845k.f35646d.m1403a(m21829d.mo8596T());
                this.f31907d = m1403a.f35647a;
                this.f31908e = m1403a.f35648b;
                this.f31909f = m1403a.f35649c;
                Headers.C11194a c11194a2 = new Headers.C11194a();
                int m5603c2 = C12275c.f31888p.m5603c(m21829d);
                for (int i2 = 0; i2 < m5603c2; i2++) {
                    c11194a2.m8921b(m21829d.mo8596T());
                }
                String str = f31901k;
                String m8918e = c11194a2.m8918e(str);
                String str2 = f31902l;
                String m8918e2 = c11194a2.m8918e(str2);
                c11194a2.m8916g(str);
                c11194a2.m8916g(str2);
                this.f31912i = m8918e != null ? Long.parseLong(m8918e) : 0L;
                this.f31913j = m8918e2 != null ? Long.parseLong(m8918e2) : 0L;
                this.f31910g = c11194a2.m8919d();
                if (m5598a()) {
                    String mo8596T = m21829d.mo8596T();
                    if (!(mo8596T.length() > 0)) {
                        C12290g m5569b = C12290g.f32040s1.m5569b(m21829d.mo8596T());
                        List<Certificate> m5596c = m5596c(m21829d);
                        List<Certificate> m5596c2 = m5596c(m21829d);
                        if (!m21829d.mo8589g0()) {
                            enumC12315r = EnumC12315r.f32104q.m5502a(m21829d.mo8596T());
                        } else {
                            enumC12315r = EnumC12315r.SSL_3_0;
                        }
                        this.f31911h = C12306n.f32077e.m5512b(enumC12315r, m5569b, m5596c, m5596c2);
                    } else {
                        throw new IOException("expected \"\" but was \"" + mo8596T + '\"');
                    }
                } else {
                    this.f31911h = null;
                }
            } finally {
                rawSource.close();
            }
        }

        /* renamed from: a */
        private final boolean m5598a() {
            boolean m13758H;
            m13758H = C9653o.m13758H(this.f31904a, "https://", false, 2, null);
            return m13758H;
        }

        /* renamed from: c */
        private final List<Certificate> m5596c(BufferedSource bufferedSource) {
            List<Certificate> m14104i;
            int m5603c = C12275c.f31888p.m5603c(bufferedSource);
            if (m5603c == -1) {
                m14104i = C9545j.m14104i();
                return m14104i;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(m5603c);
                for (int i = 0; i < m5603c; i++) {
                    String mo8596T = bufferedSource.mo8596T();
                    Buffer buffer = new Buffer();
                    ByteString m8550a = ByteString.f29482n.m8550a(mo8596T);
                    C9612q.m13920e(m8550a);
                    buffer.mo8602q0(m8550a);
                    arrayList.add(certificateFactory.generateCertificate(buffer.mo8579z0()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: e */
        private final void m5594e(BufferedSink bufferedSink, List<? extends Certificate> list) {
            try {
                bufferedSink.mo8605c0(list.size()).writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    byte[] bytes = list.get(i).getEncoded();
                    ByteString.C11214a c11214a = ByteString.f29482n;
                    C9612q.m13918g(bytes, "bytes");
                    bufferedSink.mo8608K(ByteString.C11214a.m8544g(c11214a, bytes, 0, 0, 3, null).mo8572a()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: b */
        public final boolean m5597b(Request request, Response response) {
            C9612q.m13917h(request, "request");
            C9612q.m13917h(response, "response");
            if (C9612q.m13922c(this.f31904a, request.m8734l().toString()) && C9612q.m13922c(this.f31906c, request.m8738h()) && C12275c.f31888p.m5599g(response, this.f31905b, request)) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final Response m5595d(C12994d.C13000d snapshot) {
            C9612q.m13917h(snapshot, "snapshot");
            String m8929a = this.f31910g.m8929a("Content-Type");
            String m8929a2 = this.f31910g.m8929a("Content-Length");
            return new Response.C11207a().m8672r(new Request.Builder().m8722l(this.f31904a).m8727g(this.f31906c, null).m8728f(this.f31905b).m8732b()).m8674p(this.f31907d).m8683g(this.f31908e).m8677m(this.f31909f).m8679k(this.f31910g).m8688b(new C12276a(snapshot, m8929a, m8929a2)).m8681i(this.f31911h).m8671s(this.f31912i).m8673q(this.f31913j).m8687c();
        }

        /* renamed from: f */
        public final void m5593f(C12994d.C12996b editor) {
            C9612q.m13917h(editor, "editor");
            BufferedSink m21830c = C6840m.m21830c(editor.m3461f(0));
            try {
                m21830c.mo8608K(this.f31904a).writeByte(10);
                m21830c.mo8608K(this.f31906c).writeByte(10);
                m21830c.mo8605c0(this.f31905b.size()).writeByte(10);
                int size = this.f31905b.size();
                for (int i = 0; i < size; i++) {
                    m21830c.mo8608K(this.f31905b.m8928e(i)).mo8608K(": ").mo8608K(this.f31905b.m8924o(i)).writeByte(10);
                }
                m21830c.mo8608K(new C13845k(this.f31907d, this.f31908e, this.f31909f).toString()).writeByte(10);
                m21830c.mo8605c0(this.f31910g.size() + 2).writeByte(10);
                int size2 = this.f31910g.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    m21830c.mo8608K(this.f31910g.m8928e(i2)).mo8608K(": ").mo8608K(this.f31910g.m8924o(i2)).writeByte(10);
                }
                m21830c.mo8608K(f31901k).mo8608K(": ").mo8605c0(this.f31912i).writeByte(10);
                m21830c.mo8608K(f31902l).mo8608K(": ").mo8605c0(this.f31913j).writeByte(10);
                if (m5598a()) {
                    m21830c.writeByte(10);
                    C12306n c12306n = this.f31911h;
                    C9612q.m13920e(c12306n);
                    m21830c.mo8608K(c12306n.m5518a().m5572c()).writeByte(10);
                    m5594e(m21830c, this.f31911h.m5515d());
                    m5594e(m21830c, this.f31911h.m5516c());
                    m21830c.mo8608K(this.f31911h.m5514e().m5503a()).writeByte(10);
                }
                Unit unit = Unit.f25302a;
                C14180c.m514a(m21830c, null);
            } finally {
            }
        }

        public C12279c(Response response) {
            C9612q.m13917h(response, "response");
            this.f31904a = response.m8702V().m8734l().toString();
            this.f31905b = C12275c.f31888p.m5600f(response);
            this.f31906c = response.m8702V().m8738h();
            this.f31907d = response.m8704S();
            this.f31908e = response.m8695m();
            this.f31909f = response.m8708H();
            this.f31910g = response.m8710A();
            this.f31911h = response.m8693q();
            this.f31912i = response.m8700Y();
            this.f31913j = response.m8703U();
        }
    }
}