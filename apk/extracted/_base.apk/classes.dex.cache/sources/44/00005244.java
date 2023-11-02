package p431xj;

import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.views.image.ReactImageView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import p328rj.C12314q;
import p410wj.C13634c;
import p410wj.C13638e;
import p410wj.C13642f;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001b¨\u0006\u001f"}, m14357d2 = {"Lxj/j;", "Lokhttp3/Interceptor;", "Ljava/io/IOException;", "e", "Lwj/e;", "call", "Lokhttp3/Request;", "userRequest", "", "requestSendStarted", "d", "c", "Lokhttp3/Response;", "userResponse", "Lwj/c;", "exchange", "b", "", "method", "a", "", "defaultDelay", "f", "Lokhttp3/Interceptor$Chain;", "chain", "intercept", "Lokhttp3/OkHttpClient;", "Lokhttp3/OkHttpClient;", "client", "<init>", "(Lokhttp3/OkHttpClient;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: xj.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13843j implements Interceptor {

    /* renamed from: b */
    public static final C13844a f35644b = new C13844a(null);

    /* renamed from: a */
    private final OkHttpClient f35645a;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lxj/j$a;", "", "", "MAX_FOLLOW_UPS", "I", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: xj.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C13844a {
        private C13844a() {
        }

        public /* synthetic */ C13844a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C13843j(OkHttpClient client) {
        C9612q.m13917h(client, "client");
        this.f35645a = client;
    }

    /* renamed from: a */
    private final Request m1409a(Response response, String str) {
        String m8690v;
        HttpUrl m8891p;
        boolean z;
        RequestBody requestBody = null;
        if (!this.f35645a.m8795u() || (m8690v = Response.m8690v(response, "Location", null, 2, null)) == null || (m8891p = response.m8702V().m8734l().m8891p(m8690v)) == null) {
            return null;
        }
        if (!C9612q.m13922c(m8891p.m8890q(), response.m8702V().m8734l().m8890q()) && !this.f35645a.m8794v()) {
            return null;
        }
        Request.Builder m8737i = response.m8702V().m8737i();
        if (C13839f.m1427b(str)) {
            int m8695m = response.m8695m();
            C13839f c13839f = C13839f.f35630a;
            if (!c13839f.m1425d(str) && m8695m != 308 && m8695m != 307) {
                z = false;
            } else {
                z = true;
            }
            if (c13839f.m1426c(str) && m8695m != 308 && m8695m != 307) {
                m8737i.m8727g("GET", null);
            } else {
                if (z) {
                    requestBody = response.m8702V().m8745a();
                }
                m8737i.m8727g(str, requestBody);
            }
            if (!z) {
                m8737i.m8725i("Transfer-Encoding");
                m8737i.m8725i("Content-Length");
                m8737i.m8725i("Content-Type");
            }
        }
        if (!C12562c.m4804g(response.m8702V().m8734l(), m8891p)) {
            m8737i.m8725i("Authorization");
        }
        return m8737i.m8721m(m8891p).m8732b();
    }

    /* renamed from: b */
    private final Request m1408b(Response response, C13634c c13634c) {
        C12314q c12314q;
        C13642f m2030h;
        if (c13634c != null && (m2030h = c13634c.m2030h()) != null) {
            c12314q = m2030h.m1970A();
        } else {
            c12314q = null;
        }
        int m8695m = response.m8695m();
        String m8738h = response.m8702V().m8738h();
        if (m8695m != 307 && m8695m != 308) {
            if (m8695m != 401) {
                if (m8695m != 421) {
                    if (m8695m != 503) {
                        if (m8695m != 407) {
                            if (m8695m != 408) {
                                switch (m8695m) {
                                    case ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS /* 300 */:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else if (!this.f35645a.m8817J()) {
                                return null;
                            } else {
                                RequestBody m8745a = response.m8702V().m8745a();
                                if (m8745a != null && m8745a.isOneShot()) {
                                    return null;
                                }
                                Response m8705R = response.m8705R();
                                if ((m8705R != null && m8705R.m8695m() == 408) || m1404f(response, 0) > 0) {
                                    return null;
                                }
                                return response.m8702V();
                            }
                        } else {
                            C9612q.m13920e(c12314q);
                            if (c12314q.m5506b().type() == Proxy.Type.HTTP) {
                                return this.f35645a.m8820G().mo3877a(c12314q, response);
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        Response m8705R2 = response.m8705R();
                        if ((m8705R2 != null && m8705R2.m8695m() == 503) || m1404f(response, ViewDefaults.NUMBER_OF_LINES) != 0) {
                            return null;
                        }
                        return response.m8702V();
                    }
                } else {
                    RequestBody m8745a2 = response.m8702V().m8745a();
                    if ((m8745a2 != null && m8745a2.isOneShot()) || c13634c == null || !c13634c.m2027k()) {
                        return null;
                    }
                    c13634c.m2030h().m1940y();
                    return response.m8702V();
                }
            } else {
                return this.f35645a.m8807f().mo3877a(c12314q, response);
            }
        }
        return m1409a(response, m8738h);
    }

    /* renamed from: c */
    private final boolean m1407c(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
            return true;
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: d */
    private final boolean m1406d(IOException iOException, C13638e c13638e, Request request, boolean z) {
        if (!this.f35645a.m8817J()) {
            return false;
        }
        if ((z && m1405e(iOException, request)) || !m1407c(iOException, z) || !c13638e.m1977z()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private final boolean m1405e(IOException iOException, Request request) {
        RequestBody m8745a = request.m8745a();
        if ((m8745a != null && m8745a.isOneShot()) || (iOException instanceof FileNotFoundException)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private final int m1404f(Response response, int i) {
        String m8690v = Response.m8690v(response, "Retry-After", null, 2, null);
        if (m8690v != null) {
            if (new Regex("\\d+").m13868g(m8690v)) {
                Integer valueOf = Integer.valueOf(m8690v);
                C9612q.m13918g(valueOf, "Integer.valueOf(header)");
                return valueOf.intValue();
            }
            return ViewDefaults.NUMBER_OF_LINES;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0026, code lost:
        if (r7 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0028, code lost:
        r0 = r0.m8706Q().m8675o(r7.m8706Q().m8688b(null).m8687c()).m8687c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0040, code lost:
        r7 = r0;
        r0 = r1.m1985r();
        r6 = m1408b(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0049, code lost:
        if (r6 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x004b, code lost:
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0051, code lost:
        if (r0.m2026l() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0053, code lost:
        r1.m2004B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0056, code lost:
        r1.m1991l(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0059, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x005a, code lost:
        r0 = r6.m8745a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x005e, code lost:
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0064, code lost:
        if (r0.isOneShot() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0066, code lost:
        r1.m1991l(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0069, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x006a, code lost:
        r0 = r7.m8699a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x006e, code lost:
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0070, code lost:
        sj.C12562c.m4801j(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0073, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0077, code lost:
        if (r8 > 20) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0094, code lost:
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r11) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.C9612q.m13917h(r11, r0)
            xj.g r11 = (p431xj.C13840g) r11
            okhttp3.Request r0 = r11.m1415i()
            wj.e r1 = r11.m1419e()
            java.util.List r2 = kotlin.collections.C9543h.m14145i()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L18:
            r6 = r5
        L19:
            r1.m1992k(r0, r6)
            boolean r6 = r1.mo1988o()     // Catch: java.lang.Throwable -> Ld7
            if (r6 != 0) goto Lcf
            okhttp3.Response r0 = r11.mo1422b(r0)     // Catch: java.io.IOException -> L95 p410wj.C13652j -> Lad java.lang.Throwable -> Ld7
            if (r7 == 0) goto L40
            okhttp3.Response$a r0 = r0.m8706Q()     // Catch: java.lang.Throwable -> Ld7
            okhttp3.Response$a r6 = r7.m8706Q()     // Catch: java.lang.Throwable -> Ld7
            okhttp3.Response$a r6 = r6.m8688b(r4)     // Catch: java.lang.Throwable -> Ld7
            okhttp3.Response r6 = r6.m8687c()     // Catch: java.lang.Throwable -> Ld7
            okhttp3.Response$a r0 = r0.m8675o(r6)     // Catch: java.lang.Throwable -> Ld7
            okhttp3.Response r0 = r0.m8687c()     // Catch: java.lang.Throwable -> Ld7
        L40:
            r7 = r0
            wj.c r0 = r1.m1985r()     // Catch: java.lang.Throwable -> Ld7
            okhttp3.Request r6 = r10.m1408b(r7, r0)     // Catch: java.lang.Throwable -> Ld7
            if (r6 != 0) goto L5a
            if (r0 == 0) goto L56
            boolean r11 = r0.m2026l()     // Catch: java.lang.Throwable -> Ld7
            if (r11 == 0) goto L56
            r1.m2004B()     // Catch: java.lang.Throwable -> Ld7
        L56:
            r1.m1991l(r3)
            return r7
        L5a:
            okhttp3.RequestBody r0 = r6.m8745a()     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto L6a
            boolean r0 = r0.isOneShot()     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto L6a
            r1.m1991l(r3)
            return r7
        L6a:
            okhttp3.ResponseBody r0 = r7.m8699a()     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto L73
            sj.C12562c.m4801j(r0)     // Catch: java.lang.Throwable -> Ld7
        L73:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L7e
            r1.m1991l(r5)
            r0 = r6
            goto L18
        L7e:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> Ld7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld7
            r0.<init>()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch: java.lang.Throwable -> Ld7
            r0.append(r8)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld7
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Ld7
            throw r11     // Catch: java.lang.Throwable -> Ld7
        L95:
            r6 = move-exception
            boolean r9 = r6 instanceof p471zj.C14290a     // Catch: java.lang.Throwable -> Ld7
            if (r9 != 0) goto L9c
            r9 = r5
            goto L9d
        L9c:
            r9 = r3
        L9d:
            boolean r9 = r10.m1406d(r6, r1, r0, r9)     // Catch: java.lang.Throwable -> Ld7
            if (r9 == 0) goto La8
            java.util.List r2 = kotlin.collections.C9543h.m14132o0(r2, r6)     // Catch: java.lang.Throwable -> Ld7
            goto Lc0
        La8:
            java.lang.Throwable r11 = sj.C12562c.m4812X(r6, r2)     // Catch: java.lang.Throwable -> Ld7
            throw r11     // Catch: java.lang.Throwable -> Ld7
        Lad:
            r6 = move-exception
            java.io.IOException r9 = r6.m1928c()     // Catch: java.lang.Throwable -> Ld7
            boolean r9 = r10.m1406d(r9, r1, r0, r3)     // Catch: java.lang.Throwable -> Ld7
            if (r9 == 0) goto Lc6
            java.io.IOException r6 = r6.m1929b()     // Catch: java.lang.Throwable -> Ld7
            java.util.List r2 = kotlin.collections.C9543h.m14132o0(r2, r6)     // Catch: java.lang.Throwable -> Ld7
        Lc0:
            r1.m1991l(r5)
            r6 = r3
            goto L19
        Lc6:
            java.io.IOException r11 = r6.m1929b()     // Catch: java.lang.Throwable -> Ld7
            java.lang.Throwable r11 = sj.C12562c.m4812X(r11, r2)     // Catch: java.lang.Throwable -> Ld7
            throw r11     // Catch: java.lang.Throwable -> Ld7
        Lcf:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Ld7
            throw r11     // Catch: java.lang.Throwable -> Ld7
        Ld7:
            r11 = move-exception
            r1.m1991l(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p431xj.C13843j.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}