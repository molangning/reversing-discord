package p374uj;

import com.discord.nearby.NearbyManager;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p122gk.C6840m;
import p328rj.AbstractC12302m;
import p328rj.C12275c;
import p328rj.EnumC12312p;
import p374uj.C12991c;
import p410wj.C13638e;
import p431xj.C13838e;
import p431xj.C13839f;
import p431xj.C13841h;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, m14357d2 = {"Luj/a;", "Lokhttp3/Interceptor;", "Luj/b;", "cacheRequest", "Lokhttp3/Response;", "response", "a", "Lokhttp3/Interceptor$Chain;", "chain", "intercept", "Lrj/c;", "Lrj/c;", "getCache$okhttp", "()Lrj/c;", "cache", "<init>", "(Lrj/c;)V", "b", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: uj.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C12987a implements Interceptor {

    /* renamed from: b */
    public static final C12988a f33751b = new C12988a(null);

    /* renamed from: a */
    private final C12275c f33752a;

    @Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u0010"}, m14357d2 = {"Luj/a$a;", "", "Lokhttp3/Response;", "response", "f", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", "c", "", "fieldName", "", "e", "d", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: uj.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12988a {
        private C12988a() {
        }

        public /* synthetic */ C12988a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public final Headers m3511c(Headers headers, Headers headers2) {
            boolean m13754t;
            boolean m13758H;
            Headers.C11194a c11194a = new Headers.C11194a();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String m8928e = headers.m8928e(i);
                String m8924o = headers.m8924o(i);
                m13754t = C9653o.m13754t("Warning", m8928e, true);
                if (m13754t) {
                    m13758H = C9653o.m13758H(m8924o, NearbyManager.PERMISSION_DENIED, false, 2, null);
                    if (m13758H) {
                    }
                }
                if (m3510d(m8928e) || !m3509e(m8928e) || headers2.m8929a(m8928e) == null) {
                    c11194a.m8920c(m8928e, m8924o);
                }
            }
            int size2 = headers2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String m8928e2 = headers2.m8928e(i2);
                if (!m3510d(m8928e2) && m3509e(m8928e2)) {
                    c11194a.m8920c(m8928e2, headers2.m8924o(i2));
                }
            }
            return c11194a.m8919d();
        }

        /* renamed from: d */
        private final boolean m3510d(String str) {
            boolean m13754t;
            boolean m13754t2;
            boolean m13754t3;
            m13754t = C9653o.m13754t("Content-Length", str, true);
            if (m13754t) {
                return true;
            }
            m13754t2 = C9653o.m13754t("Content-Encoding", str, true);
            if (m13754t2) {
                return true;
            }
            m13754t3 = C9653o.m13754t("Content-Type", str, true);
            if (m13754t3) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        private final boolean m3509e(String str) {
            boolean m13754t;
            boolean m13754t2;
            boolean m13754t3;
            boolean m13754t4;
            boolean m13754t5;
            boolean m13754t6;
            boolean m13754t7;
            boolean m13754t8;
            m13754t = C9653o.m13754t("Connection", str, true);
            if (!m13754t) {
                m13754t2 = C9653o.m13754t("Keep-Alive", str, true);
                if (!m13754t2) {
                    m13754t3 = C9653o.m13754t("Proxy-Authenticate", str, true);
                    if (!m13754t3) {
                        m13754t4 = C9653o.m13754t("Proxy-Authorization", str, true);
                        if (!m13754t4) {
                            m13754t5 = C9653o.m13754t("TE", str, true);
                            if (!m13754t5) {
                                m13754t6 = C9653o.m13754t("Trailers", str, true);
                                if (!m13754t6) {
                                    m13754t7 = C9653o.m13754t("Transfer-Encoding", str, true);
                                    if (!m13754t7) {
                                        m13754t8 = C9653o.m13754t("Upgrade", str, true);
                                        if (!m13754t8) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }

        /* renamed from: f */
        public final Response m3508f(Response response) {
            ResponseBody responseBody;
            if (response != null) {
                responseBody = response.m8699a();
            } else {
                responseBody = null;
            }
            if (responseBody != null) {
                return response.m8706Q().m8688b(null).m8687c();
            }
            return response;
        }
    }

    @Metadata(m14358d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m14357d2 = {"uj/a$b", "Lokio/Source;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "Lokio/Timeout;", "timeout", "", "close", "", "j", "Z", "cacheRequestClosed", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: uj.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12989b implements Source {

        /* renamed from: j */
        private boolean f33753j;

        /* renamed from: k */
        final /* synthetic */ BufferedSource f33754k;

        /* renamed from: l */
        final /* synthetic */ InterfaceC12990b f33755l;

        /* renamed from: m */
        final /* synthetic */ BufferedSink f33756m;

        C12989b(BufferedSource bufferedSource, InterfaceC12990b interfaceC12990b, BufferedSink bufferedSink) {
            this.f33754k = bufferedSource;
            this.f33755l = interfaceC12990b;
            this.f33756m = bufferedSink;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f33753j && !C12562c.m4795p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f33753j = true;
                this.f33755l.mo3507a();
            }
            this.f33754k.close();
        }

        @Override // okio.Source
        public long read(Buffer sink, long j) {
            C9612q.m13917h(sink, "sink");
            try {
                long read = this.f33754k.read(sink, j);
                if (read == -1) {
                    if (!this.f33753j) {
                        this.f33753j = true;
                        this.f33756m.close();
                    }
                    return -1L;
                }
                sink.m8616t(this.f33756m.mo8604d(), sink.size() - read, read);
                this.f33756m.mo8609C();
                return read;
            } catch (IOException e) {
                if (!this.f33753j) {
                    this.f33753j = true;
                    this.f33755l.mo3507a();
                }
                throw e;
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.f33754k.timeout();
        }
    }

    public C12987a(C12275c c12275c) {
        this.f33752a = c12275c;
    }

    /* renamed from: a */
    private final Response m3514a(InterfaceC12990b interfaceC12990b, Response response) {
        if (interfaceC12990b == null) {
            return response;
        }
        Sink mo3506b = interfaceC12990b.mo3506b();
        ResponseBody m8699a = response.m8699a();
        C9612q.m13920e(m8699a);
        C12989b c12989b = new C12989b(m8699a.source(), interfaceC12990b, C6840m.m21830c(mo3506b));
        return response.m8706Q().m8688b(new C13841h(Response.m8690v(response, "Content-Type", null, 2, null), response.m8699a().contentLength(), C6840m.m21829d(c12989b))).m8687c();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Response response;
        AbstractC12302m abstractC12302m;
        ResponseBody m8699a;
        ResponseBody m8699a2;
        C9612q.m13917h(chain, "chain");
        Call call = chain.call();
        C12275c c12275c = this.f33752a;
        C13638e c13638e = null;
        if (c12275c != null) {
            response = c12275c.m5615h(chain.mo1423a());
        } else {
            response = null;
        }
        C12991c m3501b = new C12991c.C12993b(System.currentTimeMillis(), chain.mo1423a(), response).m3501b();
        Request m3504b = m3501b.m3504b();
        Response m3505a = m3501b.m3505a();
        C12275c c12275c2 = this.f33752a;
        if (c12275c2 != null) {
            c12275c2.m5607v(m3501b);
        }
        if (call instanceof C13638e) {
            c13638e = call;
        }
        C13638e c13638e2 = c13638e;
        if (c13638e2 == null || (abstractC12302m = c13638e2.m1987p()) == null) {
            abstractC12302m = AbstractC12302m.f32075a;
        }
        if (response != null && m3505a == null && (m8699a2 = response.m8699a()) != null) {
            C12562c.m4801j(m8699a2);
        }
        if (m3504b == null && m3505a == null) {
            Response m8687c = new Response.C11207a().m8672r(chain.mo1423a()).m8674p(EnumC12312p.HTTP_1_1).m8683g(504).m8677m("Unsatisfiable Request (only-if-cached)").m8688b(C12562c.f32610c).m8671s(-1L).m8673q(System.currentTimeMillis()).m8687c();
            abstractC12302m.m5547A(call, m8687c);
            return m8687c;
        } else if (m3504b == null) {
            C9612q.m13920e(m3505a);
            Response m8687c2 = m3505a.m8706Q().m8686d(f33751b.m3508f(m3505a)).m8687c();
            abstractC12302m.m5543b(call, m8687c2);
            return m8687c2;
        } else {
            if (m3505a != null) {
                abstractC12302m.m5544a(call, m3505a);
            } else if (this.f33752a != null) {
                abstractC12302m.m5542c(call);
            }
            try {
                Response mo1422b = chain.mo1422b(m3504b);
                if (mo1422b == null && response != null && m8699a != null) {
                }
                if (m3505a != null) {
                    if (mo1422b != null && mo1422b.m8695m() == 304) {
                        Response.C11207a m8706Q = m3505a.m8706Q();
                        C12988a c12988a = f33751b;
                        Response m8687c3 = m8706Q.m8679k(c12988a.m3511c(m3505a.m8710A(), mo1422b.m8710A())).m8671s(mo1422b.m8700Y()).m8673q(mo1422b.m8703U()).m8686d(c12988a.m3508f(m3505a)).m8676n(c12988a.m3508f(mo1422b)).m8687c();
                        ResponseBody m8699a3 = mo1422b.m8699a();
                        C9612q.m13920e(m8699a3);
                        m8699a3.close();
                        C12275c c12275c3 = this.f33752a;
                        C9612q.m13920e(c12275c3);
                        c12275c3.m5608t();
                        this.f33752a.m5617A(m3505a, m8687c3);
                        abstractC12302m.m5543b(call, m8687c3);
                        return m8687c3;
                    }
                    ResponseBody m8699a4 = m3505a.m8699a();
                    if (m8699a4 != null) {
                        C12562c.m4801j(m8699a4);
                    }
                }
                C9612q.m13920e(mo1422b);
                Response.C11207a m8706Q2 = mo1422b.m8706Q();
                C12988a c12988a2 = f33751b;
                Response m8687c4 = m8706Q2.m8686d(c12988a2.m3508f(m3505a)).m8676n(c12988a2.m3508f(mo1422b)).m8687c();
                if (this.f33752a != null) {
                    if (C13838e.m1435b(m8687c4) && C12991c.f33757c.m3503a(m8687c4, m3504b)) {
                        Response m3514a = m3514a(this.f33752a.m5612m(m8687c4), m8687c4);
                        if (m3505a != null) {
                            abstractC12302m.m5542c(call);
                        }
                        return m3514a;
                    } else if (C13839f.f35630a.m1428a(m3504b.m8738h())) {
                        try {
                            this.f33752a.m5611o(m3504b);
                        } catch (IOException unused) {
                        }
                    }
                }
                return m8687c4;
            } finally {
                if (response != null && (m8699a = response.m8699a()) != null) {
                    C12562c.m4801j(m8699a);
                }
            }
        }
    }
}