package p451yj;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p122gk.C6834h;
import p410wj.C13642f;
import p431xj.C13838e;
import p431xj.C13842i;
import p431xj.C13845k;
import p431xj.InterfaceC13837d;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0007\u001c\u001a-\u0019\u0014\u0016%B)\u0012\b\u00102\u001a\u0004\u0018\u000100\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u00109\u001a\u000207\u0012\u0006\u0010<\u001a\u00020:¢\u0006\u0004\bB\u0010CJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016J\u0016\u0010!\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0016J\u000e\u0010&\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00101R\u001a\u00106\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b-\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010;R\u0018\u0010?\u001a\u00020\"*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0018\u0010?\u001a\u00020\"*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006D"}, m14357d2 = {"Lyj/b;", "Lxj/d;", "Lokio/Sink;", "u", "x", "", "length", "Lokio/Source;", "w", "Lokhttp3/HttpUrl;", "url", "v", "y", "Lgk/h;", "timeout", "", "r", "Lokhttp3/Request;", "request", "contentLength", "e", "cancel", "f", "Lokhttp3/Response;", "response", "d", "b", "h", "a", "Lokhttp3/Headers;", "headers", "", "requestLine", "A", "", "expectContinue", "Lokhttp3/Response$a;", "g", "z", "", "I", "state", "Lyj/a;", "Lyj/a;", "headersReader", "c", "Lokhttp3/Headers;", "trailers", "Lokhttp3/OkHttpClient;", "Lokhttp3/OkHttpClient;", "client", "Lwj/f;", "Lwj/f;", "()Lwj/f;", "connection", "Lokio/BufferedSource;", "Lokio/BufferedSource;", "source", "Lokio/BufferedSink;", "Lokio/BufferedSink;", "sink", "t", "(Lokhttp3/Response;)Z", "isChunked", "s", "(Lokhttp3/Request;)Z", "<init>", "(Lokhttp3/OkHttpClient;Lwj/f;Lokio/BufferedSource;Lokio/BufferedSink;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: yj.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C14035b implements InterfaceC13837d {

    /* renamed from: h */
    public static final C14039d f36068h = new C14039d(null);

    /* renamed from: a */
    private int f36069a;

    /* renamed from: b */
    private final C14033a f36070b;

    /* renamed from: c */
    private Headers f36071c;

    /* renamed from: d */
    private final OkHttpClient f36072d;

    /* renamed from: e */
    private final C13642f f36073e;

    /* renamed from: f */
    private final BufferedSource f36074f;

    /* renamed from: g */
    private final BufferedSink f36075g;

    @Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\n\u001a\u00020\tR\u001a\u0010\u0003\u001a\u00020\u000b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m14357d2 = {"Lyj/b$a;", "Lokio/Source;", "Lokio/Timeout;", "timeout", "Lokio/Buffer;", "sink", "", "byteCount", "read", "", "h", "Lgk/h;", "j", "Lgk/h;", "getTimeout", "()Lgk/h;", "", "k", "Z", "a", "()Z", "i", "(Z)V", "closed", "<init>", "(Lyj/b;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: yj.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public abstract class AbstractC14036a implements Source {

        /* renamed from: j */
        private final C6834h f36076j;

        /* renamed from: k */
        private boolean f36077k;

        public AbstractC14036a() {
            C14035b.this = r2;
            this.f36076j = new C6834h(r2.f36074f.timeout());
        }

        /* renamed from: a */
        protected final boolean m834a() {
            return this.f36077k;
        }

        /* renamed from: h */
        public final void m833h() {
            if (C14035b.this.f36069a == 6) {
                return;
            }
            if (C14035b.this.f36069a == 5) {
                C14035b.this.m843r(this.f36076j);
                C14035b.this.f36069a = 6;
                return;
            }
            throw new IllegalStateException("state: " + C14035b.this.f36069a);
        }

        /* renamed from: i */
        protected final void m832i(boolean z) {
            this.f36077k = z;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j) {
            C9612q.m13917h(sink, "sink");
            try {
                return C14035b.this.f36074f.read(sink, j);
            } catch (IOException e) {
                C14035b.this.mo120c().m1939z();
                m833h();
                throw e;
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.f36076j;
        }
    }

    @Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"Lyj/b$b;", "Lokio/Sink;", "Lokio/Timeout;", "timeout", "Lokio/Buffer;", "source", "", "byteCount", "", "L", "flush", "close", "Lgk/h;", "j", "Lgk/h;", "", "k", "Z", "closed", "<init>", "(Lyj/b;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: yj.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public final class C14037b implements Sink {

        /* renamed from: j */
        private final C6834h f36079j;

        /* renamed from: k */
        private boolean f36080k;

        public C14037b() {
            C14035b.this = r2;
            this.f36079j = new C6834h(r2.f36075g.timeout());
        }

        @Override // okio.Sink
        /* renamed from: L */
        public void mo46L(Buffer source, long j) {
            C9612q.m13917h(source, "source");
            if (!this.f36080k) {
                if (j == 0) {
                    return;
                }
                C14035b.this.f36075g.mo8603n0(j);
                C14035b.this.f36075g.mo8608K("\r\n");
                C14035b.this.f36075g.mo46L(source, j);
                C14035b.this.f36075g.mo8608K("\r\n");
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f36080k) {
                return;
            }
            this.f36080k = true;
            C14035b.this.f36075g.mo8608K("0\r\n\r\n");
            C14035b.this.m843r(this.f36079j);
            C14035b.this.f36069a = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() {
            if (this.f36080k) {
                return;
            }
            C14035b.this.f36075g.flush();
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.f36079j;
        }
    }

    @Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0016\u0010\r\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m14357d2 = {"Lyj/b$c;", "Lyj/b$a;", "Lyj/b;", "", "j", "Lokio/Buffer;", "sink", "", "byteCount", "read", "close", "m", "J", "bytesRemainingInChunk", "", "n", "Z", "hasMoreChunks", "Lokhttp3/HttpUrl;", "o", "Lokhttp3/HttpUrl;", "url", "<init>", "(Lyj/b;Lokhttp3/HttpUrl;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: yj.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public final class C14038c extends AbstractC14036a {

        /* renamed from: m */
        private long f36082m;

        /* renamed from: n */
        private boolean f36083n;

        /* renamed from: o */
        private final HttpUrl f36084o;

        /* renamed from: p */
        final /* synthetic */ C14035b f36085p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14038c(C14035b c14035b, HttpUrl url) {
            super();
            C9612q.m13917h(url, "url");
            this.f36085p = c14035b;
            this.f36084o = url;
            this.f36082m = -1L;
            this.f36083n = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x004d, code lost:
            if (r1 != false) goto L15;
         */
        /* renamed from: j */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m831j() {
            /*
                r7 = this;
                long r0 = r7.f36082m
                r2 = -1
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L11
                yj.b r0 = r7.f36085p
                okio.BufferedSource r0 = p451yj.C14035b.m848m(r0)
                r0.mo8596T()
            L11:
                yj.b r0 = r7.f36085p     // Catch: java.lang.NumberFormatException -> Lb1
                okio.BufferedSource r0 = p451yj.C14035b.m848m(r0)     // Catch: java.lang.NumberFormatException -> Lb1
                long r0 = r0.mo8581y0()     // Catch: java.lang.NumberFormatException -> Lb1
                r7.f36082m = r0     // Catch: java.lang.NumberFormatException -> Lb1
                yj.b r0 = r7.f36085p     // Catch: java.lang.NumberFormatException -> Lb1
                okio.BufferedSource r0 = p451yj.C14035b.m848m(r0)     // Catch: java.lang.NumberFormatException -> Lb1
                java.lang.String r0 = r0.mo8596T()     // Catch: java.lang.NumberFormatException -> Lb1
                if (r0 == 0) goto La9
                java.lang.CharSequence r0 = kotlin.text.C9642f.m13819V0(r0)     // Catch: java.lang.NumberFormatException -> Lb1
                java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> Lb1
                long r1 = r7.f36082m     // Catch: java.lang.NumberFormatException -> Lb1
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 < 0) goto L83
                int r1 = r0.length()     // Catch: java.lang.NumberFormatException -> Lb1
                r2 = 0
                if (r1 <= 0) goto L42
                r1 = 1
                goto L43
            L42:
                r1 = r2
            L43:
                if (r1 == 0) goto L4f
                java.lang.String r1 = ";"
                r5 = 2
                r6 = 0
                boolean r1 = kotlin.text.C9642f.m13835H(r0, r1, r2, r5, r6)     // Catch: java.lang.NumberFormatException -> Lb1
                if (r1 == 0) goto L83
            L4f:
                long r0 = r7.f36082m
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 != 0) goto L82
                r7.f36083n = r2
                yj.b r0 = r7.f36085p
                yj.a r1 = p451yj.C14035b.m850k(r0)
                okhttp3.Headers r1 = r1.m855a()
                p451yj.C14035b.m844q(r0, r1)
                yj.b r0 = r7.f36085p
                okhttp3.OkHttpClient r0 = p451yj.C14035b.m851j(r0)
                kotlin.jvm.internal.C9612q.m13920e(r0)
                okhttp3.CookieJar r0 = r0.m8799q()
                okhttp3.HttpUrl r1 = r7.f36084o
                yj.b r2 = r7.f36085p
                okhttp3.Headers r2 = p451yj.C14035b.m846o(r2)
                kotlin.jvm.internal.C9612q.m13920e(r2)
                p431xj.C13838e.m1431f(r0, r1, r2)
                r7.m833h()
            L82:
                return
            L83:
                java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> Lb1
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Lb1
                r2.<init>()     // Catch: java.lang.NumberFormatException -> Lb1
                java.lang.String r3 = "expected chunk size and optional extensions"
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> Lb1
                java.lang.String r3 = " but was \""
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> Lb1
                long r3 = r7.f36082m     // Catch: java.lang.NumberFormatException -> Lb1
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> Lb1
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> Lb1
                r0 = 34
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> Lb1
                java.lang.String r0 = r2.toString()     // Catch: java.lang.NumberFormatException -> Lb1
                r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> Lb1
                throw r1     // Catch: java.lang.NumberFormatException -> Lb1
            La9:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.NumberFormatException -> Lb1
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
                r0.<init>(r1)     // Catch: java.lang.NumberFormatException -> Lb1
                throw r0     // Catch: java.lang.NumberFormatException -> Lb1
            Lb1:
                r0 = move-exception
                java.net.ProtocolException r1 = new java.net.ProtocolException
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p451yj.C14035b.C14038c.m831j():void");
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m834a()) {
                return;
            }
            if (this.f36083n && !C12562c.m4795p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f36085p.mo120c().m1939z();
                m833h();
            }
            m832i(true);
        }

        @Override // p451yj.C14035b.AbstractC14036a, okio.Source
        public long read(Buffer sink, long j) {
            boolean z;
            C9612q.m13917h(sink, "sink");
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (!m834a()) {
                    if (!this.f36083n) {
                        return -1L;
                    }
                    long j2 = this.f36082m;
                    if (j2 == 0 || j2 == -1) {
                        m831j();
                        if (!this.f36083n) {
                            return -1L;
                        }
                    }
                    long read = super.read(sink, Math.min(j, this.f36082m));
                    if (read != -1) {
                        this.f36082m -= read;
                        return read;
                    }
                    this.f36085p.mo120c().m1939z();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    m833h();
                    throw protocolException;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u0010"}, m14357d2 = {"Lyj/b$d;", "", "", "NO_CHUNK_YET", "J", "", "STATE_CLOSED", "I", "STATE_IDLE", "STATE_OPEN_REQUEST_BODY", "STATE_OPEN_RESPONSE_BODY", "STATE_READING_RESPONSE_BODY", "STATE_READ_RESPONSE_HEADERS", "STATE_WRITING_REQUEST_BODY", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: yj.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C14039d {
        private C14039d() {
        }

        public /* synthetic */ C14039d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m14357d2 = {"Lyj/b$e;", "Lyj/b$a;", "Lyj/b;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "", "close", "m", "J", "bytesRemaining", "<init>", "(Lyj/b;J)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: yj.b$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public final class C14040e extends AbstractC14036a {

        /* renamed from: m */
        private long f36086m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14040e(long j) {
            super();
            C14035b.this = r3;
            this.f36086m = j;
            if (j == 0) {
                m833h();
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m834a()) {
                return;
            }
            if (this.f36086m != 0 && !C12562c.m4795p(this, 100, TimeUnit.MILLISECONDS)) {
                C14035b.this.mo120c().m1939z();
                m833h();
            }
            m832i(true);
        }

        @Override // p451yj.C14035b.AbstractC14036a, okio.Source
        public long read(Buffer sink, long j) {
            boolean z;
            C9612q.m13917h(sink, "sink");
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (!m834a()) {
                    long j2 = this.f36086m;
                    if (j2 == 0) {
                        return -1L;
                    }
                    long read = super.read(sink, Math.min(j2, j));
                    if (read != -1) {
                        long j3 = this.f36086m - read;
                        this.f36086m = j3;
                        if (j3 == 0) {
                            m833h();
                        }
                        return read;
                    }
                    C14035b.this.mo120c().m1939z();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    m833h();
                    throw protocolException;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
    }

    @Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"Lyj/b$f;", "Lokio/Sink;", "Lokio/Timeout;", "timeout", "Lokio/Buffer;", "source", "", "byteCount", "", "L", "flush", "close", "Lgk/h;", "j", "Lgk/h;", "", "k", "Z", "closed", "<init>", "(Lyj/b;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: yj.b$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public final class C14041f implements Sink {

        /* renamed from: j */
        private final C6834h f36088j;

        /* renamed from: k */
        private boolean f36089k;

        public C14041f() {
            C14035b.this = r2;
            this.f36088j = new C6834h(r2.f36075g.timeout());
        }

        @Override // okio.Sink
        /* renamed from: L */
        public void mo46L(Buffer source, long j) {
            C9612q.m13917h(source, "source");
            if (!this.f36089k) {
                C12562c.m4802i(source.size(), 0L, j);
                C14035b.this.f36075g.mo46L(source, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f36089k) {
                return;
            }
            this.f36089k = true;
            C14035b.this.m843r(this.f36088j);
            C14035b.this.f36069a = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            if (this.f36089k) {
                return;
            }
            C14035b.this.f36075g.flush();
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.f36088j;
        }
    }

    @Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m14357d2 = {"Lyj/b$g;", "Lyj/b$a;", "Lyj/b;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "", "close", "", "m", "Z", "inputExhausted", "<init>", "(Lyj/b;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: yj.b$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public final class C14042g extends AbstractC14036a {

        /* renamed from: m */
        private boolean f36091m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14042g() {
            super();
            C14035b.this = r1;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m834a()) {
                return;
            }
            if (!this.f36091m) {
                m833h();
            }
            m832i(true);
        }

        @Override // p451yj.C14035b.AbstractC14036a, okio.Source
        public long read(Buffer sink, long j) {
            boolean z;
            C9612q.m13917h(sink, "sink");
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (!m834a()) {
                    if (this.f36091m) {
                        return -1L;
                    }
                    long read = super.read(sink, j);
                    if (read == -1) {
                        this.f36091m = true;
                        m833h();
                        return -1L;
                    }
                    return read;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
    }

    public C14035b(OkHttpClient okHttpClient, C13642f connection, BufferedSource source, BufferedSink sink) {
        C9612q.m13917h(connection, "connection");
        C9612q.m13917h(source, "source");
        C9612q.m13917h(sink, "sink");
        this.f36072d = okHttpClient;
        this.f36073e = connection;
        this.f36074f = source;
        this.f36075g = sink;
        this.f36070b = new C14033a(source);
    }

    /* renamed from: r */
    public final void m843r(C6834h c6834h) {
        Timeout m21843i = c6834h.m21843i();
        c6834h.m21842j(Timeout.f29486d);
        m21843i.mo8543a();
        m21843i.mo8542b();
    }

    /* renamed from: s */
    private final boolean m842s(Request request) {
        boolean m13754t;
        m13754t = C9653o.m13754t("chunked", request.m8742d("Transfer-Encoding"), true);
        return m13754t;
    }

    /* renamed from: t */
    private final boolean m841t(Response response) {
        boolean m13754t;
        m13754t = C9653o.m13754t("chunked", Response.m8690v(response, "Transfer-Encoding", null, 2, null), true);
        return m13754t;
    }

    /* renamed from: u */
    private final Sink m840u() {
        boolean z = true;
        if (this.f36069a != 1) {
            z = false;
        }
        if (z) {
            this.f36069a = 2;
            return new C14037b();
        }
        throw new IllegalStateException(("state: " + this.f36069a).toString());
    }

    /* renamed from: v */
    private final Source m839v(HttpUrl httpUrl) {
        boolean z;
        if (this.f36069a == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f36069a = 5;
            return new C14038c(this, httpUrl);
        }
        throw new IllegalStateException(("state: " + this.f36069a).toString());
    }

    /* renamed from: w */
    private final Source m838w(long j) {
        boolean z;
        if (this.f36069a == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f36069a = 5;
            return new C14040e(j);
        }
        throw new IllegalStateException(("state: " + this.f36069a).toString());
    }

    /* renamed from: x */
    private final Sink m837x() {
        boolean z = true;
        if (this.f36069a != 1) {
            z = false;
        }
        if (z) {
            this.f36069a = 2;
            return new C14041f();
        }
        throw new IllegalStateException(("state: " + this.f36069a).toString());
    }

    /* renamed from: y */
    private final Source m836y() {
        boolean z;
        if (this.f36069a == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f36069a = 5;
            mo120c().m1939z();
            return new C14042g();
        }
        throw new IllegalStateException(("state: " + this.f36069a).toString());
    }

    /* renamed from: A */
    public final void m853A(Headers headers, String requestLine) {
        boolean z;
        C9612q.m13917h(headers, "headers");
        C9612q.m13917h(requestLine, "requestLine");
        if (this.f36069a == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f36075g.mo8608K(requestLine).mo8608K("\r\n");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                this.f36075g.mo8608K(headers.m8928e(i)).mo8608K(": ").mo8608K(headers.m8924o(i)).mo8608K("\r\n");
            }
            this.f36075g.mo8608K("\r\n");
            this.f36069a = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f36069a).toString());
    }

    @Override // p431xj.InterfaceC13837d
    /* renamed from: a */
    public void mo122a() {
        this.f36075g.flush();
    }

    @Override // p431xj.InterfaceC13837d
    /* renamed from: b */
    public Source mo121b(Response response) {
        C9612q.m13917h(response, "response");
        if (!C13838e.m1435b(response)) {
            return m838w(0L);
        }
        if (m841t(response)) {
            return m839v(response.m8702V().m8734l());
        }
        long m4792s = C12562c.m4792s(response);
        if (m4792s != -1) {
            return m838w(m4792s);
        }
        return m836y();
    }

    @Override // p431xj.InterfaceC13837d
    /* renamed from: c */
    public C13642f mo120c() {
        return this.f36073e;
    }

    @Override // p431xj.InterfaceC13837d
    public void cancel() {
        mo120c().m1961d();
    }

    @Override // p431xj.InterfaceC13837d
    /* renamed from: d */
    public long mo119d(Response response) {
        C9612q.m13917h(response, "response");
        if (!C13838e.m1435b(response)) {
            return 0L;
        }
        if (m841t(response)) {
            return -1L;
        }
        return C12562c.m4792s(response);
    }

    @Override // p431xj.InterfaceC13837d
    /* renamed from: e */
    public Sink mo118e(Request request, long j) {
        C9612q.m13917h(request, "request");
        if (request.m8745a() != null && request.m8745a().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (m842s(request)) {
            return m840u();
        }
        if (j != -1) {
            return m837x();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // p431xj.InterfaceC13837d
    /* renamed from: f */
    public void mo117f(Request request) {
        C9612q.m13917h(request, "request");
        C13842i c13842i = C13842i.f35643a;
        Proxy.Type type = mo120c().m1970A().m5506b().type();
        C9612q.m13918g(type, "connection.route().proxy.type()");
        m853A(request.m8740f(), c13842i.m1412a(request, type));
    }

    @Override // p431xj.InterfaceC13837d
    /* renamed from: g */
    public Response.C11207a mo116g(boolean z) {
        int i = this.f36069a;
        boolean z2 = true;
        if (i != 1 && i != 3) {
            z2 = false;
        }
        if (z2) {
            try {
                C13845k m1403a = C13845k.f35646d.m1403a(this.f36070b.m854b());
                Response.C11207a m8679k = new Response.C11207a().m8674p(m1403a.f35647a).m8683g(m1403a.f35648b).m8677m(m1403a.f35649c).m8679k(this.f36070b.m855a());
                if (z && m1403a.f35648b == 100) {
                    return null;
                }
                if (m1403a.f35648b == 100) {
                    this.f36069a = 3;
                    return m8679k;
                }
                this.f36069a = 4;
                return m8679k;
            } catch (EOFException e) {
                String m8892o = mo120c().m1970A().m5507a().m5618l().m8892o();
                throw new IOException("unexpected end of stream on " + m8892o, e);
            }
        }
        throw new IllegalStateException(("state: " + this.f36069a).toString());
    }

    @Override // p431xj.InterfaceC13837d
    /* renamed from: h */
    public void mo115h() {
        this.f36075g.flush();
    }

    /* renamed from: z */
    public final void m835z(Response response) {
        C9612q.m13917h(response, "response");
        long m4792s = C12562c.m4792s(response);
        if (m4792s == -1) {
            return;
        }
        Source m838w = m838w(m4792s);
        C12562c.m4826J(m838w, ViewDefaults.NUMBER_OF_LINES, TimeUnit.MILLISECONDS);
        m838w.close();
    }
}