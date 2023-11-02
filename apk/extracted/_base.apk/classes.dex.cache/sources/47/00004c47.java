package p328rj;

import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import p031bk.C2370k;
import p304qf.C11888u;
import p304qf.C11889v;
import pf.C11591x;
import sj.C12561b;
import sj.C12562c;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m14357d2 = {"Lrj/o;", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "", "header", "", "Lokhttp3/Cookie;", "a", "cookies", "", "saveFromResponse", "loadForRequest", "Ljava/net/CookieHandler;", "c", "Ljava/net/CookieHandler;", "cookieHandler", "<init>", "(Ljava/net/CookieHandler;)V", "okhttp-urlconnection"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: rj.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C12311o implements CookieJar {

    /* renamed from: c */
    private final CookieHandler f32085c;

    public C12311o(CookieHandler cookieHandler) {
        C9612q.m13917h(cookieHandler, "cookieHandler");
        this.f32085c = cookieHandler;
    }

    /* renamed from: a */
    private final List<Cookie> m5510a(HttpUrl httpUrl, String str) {
        boolean m13758H;
        String str2;
        boolean m13758H2;
        boolean m13755s;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int m4797n = C12562c.m4797n(str, ";,", i, length);
            int m4798m = C12562c.m4798m(str, '=', i, m4797n);
            String m4814V = C12562c.m4814V(str, i, m4798m);
            m13758H = C9653o.m13758H(m4814V, "$", false, 2, null);
            if (!m13758H) {
                if (m4798m < m4797n) {
                    str2 = C12562c.m4814V(str, m4798m + 1, m4797n);
                } else {
                    str2 = "";
                }
                m13758H2 = C9653o.m13758H(str2, "\"", false, 2, null);
                if (m13758H2) {
                    m13755s = C9653o.m13755s(str2, "\"", false, 2, null);
                    if (m13755s) {
                        str2 = str2.substring(1, str2.length() - 1);
                        C9612q.m13918g(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                }
                arrayList.add(new Cookie.C11190a().m8954d(m4814V).m8953e(str2).m8956b(httpUrl.m8899h()).m8957a());
            }
            i = m4797n + 1;
        }
        return arrayList;
    }

    @Override // okhttp3.CookieJar
    public List<Cookie> loadForRequest(HttpUrl url) {
        List<Cookie> m14104i;
        Map<String, List<String>> m6754h;
        List<Cookie> m14104i2;
        boolean m13754t;
        boolean m13754t2;
        C9612q.m13917h(url, "url");
        try {
            CookieHandler cookieHandler = this.f32085c;
            URI m8889r = url.m8889r();
            m6754h = C11889v.m6754h();
            Map<String, List<String>> cookieHeaders = cookieHandler.get(m8889r, m6754h);
            C9612q.m13918g(cookieHeaders, "cookieHeaders");
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : cookieHeaders.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                m13754t = C9653o.m13754t("Cookie", key, true);
                if (!m13754t) {
                    m13754t2 = C9653o.m13754t("Cookie2", key, true);
                    if (m13754t2) {
                    }
                }
                C9612q.m13918g(value, "value");
                if (!value.isEmpty()) {
                    for (String header : value) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        C9612q.m13918g(header, "header");
                        arrayList.addAll(m5510a(url, header));
                    }
                }
            }
            if (arrayList != null) {
                List<Cookie> unmodifiableList = Collections.unmodifiableList(arrayList);
                C9612q.m13918g(unmodifiableList, "Collections.unmodifiableList(cookies)");
                return unmodifiableList;
            }
            m14104i2 = C9545j.m14104i();
            return m14104i2;
        } catch (IOException e) {
            C2370k m33588g = C2370k.f6491c.m33588g();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Loading cookies failed for ");
            HttpUrl m8891p = url.m8891p("/...");
            C9612q.m13920e(m8891p);
            sb2.append(m8891p);
            m33588g.m33600k(sb2.toString(), 5, e);
            m14104i = C9545j.m14104i();
            return m14104i;
        }
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
        Map<String, List<String>> m6757e;
        C9612q.m13917h(url, "url");
        C9612q.m13917h(cookies, "cookies");
        ArrayList arrayList = new ArrayList();
        for (Cookie cookie : cookies) {
            arrayList.add(C12561b.m4836a(cookie, true));
        }
        m6757e = C11888u.m6757e(C11591x.m7577a("Set-Cookie", arrayList));
        try {
            this.f32085c.put(url.m8889r(), m6757e);
        } catch (IOException e) {
            C2370k m33588g = C2370k.f6491c.m33588g();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Saving cookies failed for ");
            HttpUrl m8891p = url.m8891p("/...");
            C9612q.m13920e(m8891p);
            sb2.append(m8891p);
            m33588g.m33600k(sb2.toString(), 5, e);
        }
    }
}