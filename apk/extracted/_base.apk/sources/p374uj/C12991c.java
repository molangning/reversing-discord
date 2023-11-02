package p374uj;

import com.facebook.react.views.image.ReactImageView;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import p431xj.C13835c;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\u0003\u0005B\u001d\b\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000f"}, m14357d2 = {"Luj/c;", "", "Lokhttp3/Request;", "a", "Lokhttp3/Request;", "b", "()Lokhttp3/Request;", "networkRequest", "Lokhttp3/Response;", "Lokhttp3/Response;", "()Lokhttp3/Response;", "cacheResponse", "<init>", "(Lokhttp3/Request;Lokhttp3/Response;)V", "c", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: uj.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C12991c {

    /* renamed from: c */
    public static final C12992a f33757c = new C12992a(null);

    /* renamed from: a */
    private final Request f33758a;

    /* renamed from: b */
    private final Response f33759b;

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, m14357d2 = {"Luj/c$a;", "", "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "request", "", "a", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: uj.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12992a {
        private C12992a() {
        }

        public /* synthetic */ C12992a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m3503a(Response response, Request request) {
            C9612q.m13917h(response, "response");
            C9612q.m13917h(request, "request");
            int m8695m = response.m8695m();
            if (m8695m != 200 && m8695m != 410 && m8695m != 414 && m8695m != 501 && m8695m != 203 && m8695m != 204) {
                if (m8695m != 307) {
                    if (m8695m != 308 && m8695m != 404 && m8695m != 405) {
                        switch (m8695m) {
                            case ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS /* 300 */:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (Response.m8690v(response, "Expires", null, 2, null) == null && response.m8698h().m8979c() == -1 && !response.m8698h().m8980b() && !response.m8698h().m8981a()) {
                    return false;
                }
            }
            if (response.m8698h().m8974h() || request.m8744b().m8974h()) {
                return false;
            }
            return true;
        }
    }

    @Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010)\u001a\u0004\u0018\u00010&¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\f\u001a\u00020\u0004R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, m14357d2 = {"Luj/c$b;", "", "", "f", "Luj/c;", "c", "", "d", "a", "Lokhttp3/Request;", "request", "e", "b", "Ljava/util/Date;", "Ljava/util/Date;", "servedDate", "", "Ljava/lang/String;", "servedDateString", "lastModified", "lastModifiedString", "expires", "J", "sentRequestMillis", "g", "receivedResponseMillis", "h", "etag", "", "i", "I", "ageSeconds", "j", "nowMillis", "k", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "Lokhttp3/Response;", "l", "Lokhttp3/Response;", "cacheResponse", "<init>", "(JLokhttp3/Request;Lokhttp3/Response;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: uj.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12993b {

        /* renamed from: a */
        private Date f33760a;

        /* renamed from: b */
        private String f33761b;

        /* renamed from: c */
        private Date f33762c;

        /* renamed from: d */
        private String f33763d;

        /* renamed from: e */
        private Date f33764e;

        /* renamed from: f */
        private long f33765f;

        /* renamed from: g */
        private long f33766g;

        /* renamed from: h */
        private String f33767h;

        /* renamed from: i */
        private int f33768i;

        /* renamed from: j */
        private final long f33769j;

        /* renamed from: k */
        private final Request f33770k;

        /* renamed from: l */
        private final Response f33771l;

        public C12993b(long j, Request request, Response response) {
            boolean m13754t;
            boolean m13754t2;
            boolean m13754t3;
            boolean m13754t4;
            boolean m13754t5;
            C9612q.m13917h(request, "request");
            this.f33769j = j;
            this.f33770k = request;
            this.f33771l = response;
            this.f33768i = -1;
            if (response != null) {
                this.f33765f = response.m8700Y();
                this.f33766g = response.m8703U();
                Headers m8710A = response.m8710A();
                int size = m8710A.size();
                for (int i = 0; i < size; i++) {
                    String m8928e = m8710A.m8928e(i);
                    String m8924o = m8710A.m8924o(i);
                    m13754t = C9653o.m13754t(m8928e, "Date", true);
                    if (m13754t) {
                        this.f33760a = C13835c.m1439a(m8924o);
                        this.f33761b = m8924o;
                    } else {
                        m13754t2 = C9653o.m13754t(m8928e, "Expires", true);
                        if (m13754t2) {
                            this.f33764e = C13835c.m1439a(m8924o);
                        } else {
                            m13754t3 = C9653o.m13754t(m8928e, "Last-Modified", true);
                            if (m13754t3) {
                                this.f33762c = C13835c.m1439a(m8924o);
                                this.f33763d = m8924o;
                            } else {
                                m13754t4 = C9653o.m13754t(m8928e, "ETag", true);
                                if (m13754t4) {
                                    this.f33767h = m8924o;
                                } else {
                                    m13754t5 = C9653o.m13754t(m8928e, "Age", true);
                                    if (m13754t5) {
                                        this.f33768i = C12562c.m4815U(m8924o, -1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        private final long m3502a() {
            Date date = this.f33760a;
            long j = 0;
            if (date != null) {
                j = Math.max(0L, this.f33766g - date.getTime());
            }
            int i = this.f33768i;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis(i));
            }
            long j2 = this.f33766g;
            return j + (j2 - this.f33765f) + (this.f33769j - j2);
        }

        /* renamed from: c */
        private final C12991c m3500c() {
            long j;
            String str;
            if (this.f33771l == null) {
                return new C12991c(this.f33770k, null);
            }
            if (this.f33770k.m8739g() && this.f33771l.m8693q() == null) {
                return new C12991c(this.f33770k, null);
            }
            if (!C12991c.f33757c.m3503a(this.f33771l, this.f33770k)) {
                return new C12991c(this.f33770k, null);
            }
            CacheControl m8744b = this.f33770k.m8744b();
            if (!m8744b.m8975g() && !m3498e(this.f33770k)) {
                CacheControl m8698h = this.f33771l.m8698h();
                long m3502a = m3502a();
                long m3499d = m3499d();
                if (m8744b.m8979c() != -1) {
                    m3499d = Math.min(m3499d, TimeUnit.SECONDS.toMillis(m8744b.m8979c()));
                }
                long j2 = 0;
                if (m8744b.m8977e() != -1) {
                    j = TimeUnit.SECONDS.toMillis(m8744b.m8977e());
                } else {
                    j = 0;
                }
                if (!m8698h.m8976f() && m8744b.m8978d() != -1) {
                    j2 = TimeUnit.SECONDS.toMillis(m8744b.m8978d());
                }
                if (!m8698h.m8975g()) {
                    long j3 = j + m3502a;
                    if (j3 < j2 + m3499d) {
                        Response.C11207a m8706Q = this.f33771l.m8706Q();
                        if (j3 >= m3499d) {
                            m8706Q.m8689a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (m3502a > 86400000 && m3497f()) {
                            m8706Q.m8689a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new C12991c(null, m8706Q.m8687c());
                    }
                }
                String str2 = this.f33767h;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.f33762c != null) {
                        str2 = this.f33763d;
                    } else if (this.f33760a != null) {
                        str2 = this.f33761b;
                    } else {
                        return new C12991c(this.f33770k, null);
                    }
                    str = "If-Modified-Since";
                }
                Headers.C11194a m8927h = this.f33770k.m8740f().m8927h();
                C9612q.m13920e(str2);
                m8927h.m8920c(str, str2);
                return new C12991c(this.f33770k.m8737i().m8728f(m8927h.m8919d()).m8732b(), this.f33771l);
            }
            return new C12991c(this.f33770k, null);
        }

        /* renamed from: d */
        private final long m3499d() {
            long j;
            long j2;
            Response response = this.f33771l;
            C9612q.m13920e(response);
            CacheControl m8698h = response.m8698h();
            if (m8698h.m8979c() != -1) {
                return TimeUnit.SECONDS.toMillis(m8698h.m8979c());
            }
            Date date = this.f33764e;
            if (date != null) {
                Date date2 = this.f33760a;
                if (date2 != null) {
                    j2 = date2.getTime();
                } else {
                    j2 = this.f33766g;
                }
                long time = date.getTime() - j2;
                if (time <= 0) {
                    return 0L;
                }
                return time;
            } else if (this.f33762c == null || this.f33771l.m8702V().m8734l().m8893n() != null) {
                return 0L;
            } else {
                Date date3 = this.f33760a;
                if (date3 != null) {
                    j = date3.getTime();
                } else {
                    j = this.f33765f;
                }
                Date date4 = this.f33762c;
                C9612q.m13920e(date4);
                long time2 = j - date4.getTime();
                if (time2 <= 0) {
                    return 0L;
                }
                return time2 / 10;
            }
        }

        /* renamed from: e */
        private final boolean m3498e(Request request) {
            if (request.m8742d("If-Modified-Since") == null && request.m8742d("If-None-Match") == null) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        private final boolean m3497f() {
            Response response = this.f33771l;
            C9612q.m13920e(response);
            return response.m8698h().m8979c() == -1 && this.f33764e == null;
        }

        /* renamed from: b */
        public final C12991c m3501b() {
            C12991c m3500c = m3500c();
            if (m3500c.m3504b() != null && this.f33770k.m8744b().m8973i()) {
                return new C12991c(null, null);
            }
            return m3500c;
        }
    }

    public C12991c(Request request, Response response) {
        this.f33758a = request;
        this.f33759b = response;
    }

    /* renamed from: a */
    public final Response m3505a() {
        return this.f33759b;
    }

    /* renamed from: b */
    public final Request m3504b() {
        return this.f33758a;
    }
}
