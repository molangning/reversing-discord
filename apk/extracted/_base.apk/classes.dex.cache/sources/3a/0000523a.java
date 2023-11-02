package p431xj;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p122gk.C6835i;
import p122gk.C6840m;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0010"}, m14357d2 = {"Lxj/a;", "Lokhttp3/Interceptor;", "", "Lokhttp3/Cookie;", "cookies", "", "a", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lokhttp3/CookieJar;", "Lokhttp3/CookieJar;", "cookieJar", "<init>", "(Lokhttp3/CookieJar;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: xj.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13833a implements Interceptor {

    /* renamed from: a */
    private final CookieJar f35623a;

    public C13833a(CookieJar cookieJar) {
        C9612q.m13917h(cookieJar, "cookieJar");
        this.f35623a = cookieJar;
    }

    /* renamed from: a */
    private final String m1440a(List<Cookie> list) {
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                C9545j.m14094s();
            }
            Cookie cookie = (Cookie) obj;
            if (i > 0) {
                sb2.append("; ");
            }
            sb2.append(cookie.m8960e());
            sb2.append('=');
            sb2.append(cookie.m8958g());
            i = i2;
        }
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        boolean m13754t;
        ResponseBody m8699a;
        C9612q.m13917h(chain, "chain");
        Request mo1423a = chain.mo1423a();
        Request.Builder m8737i = mo1423a.m8737i();
        RequestBody m8745a = mo1423a.m8745a();
        if (m8745a != null) {
            MediaType contentType = m8745a.contentType();
            if (contentType != null) {
                m8737i.m8729e("Content-Type", contentType.toString());
            }
            long contentLength = m8745a.contentLength();
            if (contentLength != -1) {
                m8737i.m8729e("Content-Length", String.valueOf(contentLength));
                m8737i.m8725i("Transfer-Encoding");
            } else {
                m8737i.m8729e("Transfer-Encoding", "chunked");
                m8737i.m8725i("Content-Length");
            }
        }
        boolean z = false;
        if (mo1423a.m8742d("Host") == null) {
            m8737i.m8729e("Host", C12562c.m4819Q(mo1423a.m8734l(), false, 1, null));
        }
        if (mo1423a.m8742d("Connection") == null) {
            m8737i.m8729e("Connection", "Keep-Alive");
        }
        if (mo1423a.m8742d("Accept-Encoding") == null && mo1423a.m8742d("Range") == null) {
            m8737i.m8729e("Accept-Encoding", "gzip");
            z = true;
        }
        List<Cookie> loadForRequest = this.f35623a.loadForRequest(mo1423a.m8734l());
        if (!loadForRequest.isEmpty()) {
            m8737i.m8729e("Cookie", m1440a(loadForRequest));
        }
        if (mo1423a.m8742d("User-Agent") == null) {
            m8737i.m8729e("User-Agent", "okhttp/4.9.2");
        }
        Response mo1422b = chain.mo1422b(m8737i.m8732b());
        C13838e.m1431f(this.f35623a, mo1423a.m8734l(), mo1422b.m8710A());
        Response.C11207a m8672r = mo1422b.m8706Q().m8672r(mo1423a);
        if (z) {
            m13754t = C9653o.m13754t("gzip", Response.m8690v(mo1422b, "Content-Encoding", null, 2, null), true);
            if (m13754t && C13838e.m1435b(mo1422b) && (m8699a = mo1422b.m8699a()) != null) {
                C6835i c6835i = new C6835i(m8699a.source());
                m8672r.m8679k(mo1422b.m8710A().m8927h().m8916g("Content-Encoding").m8916g("Content-Length").m8919d());
                m8672r.m8688b(new C13841h(Response.m8690v(mo1422b, "Content-Type", null, 2, null), -1L, C6840m.m21829d(c6835i)));
            }
        }
        return m8672r.m8687c();
    }
}