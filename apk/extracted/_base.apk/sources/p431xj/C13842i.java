package p431xj;

import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okhttp3.HttpUrl;
import okhttp3.Request;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u000f"}, m14357d2 = {"Lxj/i;", "", "Lokhttp3/Request;", "request", "Ljava/net/Proxy$Type;", "proxyType", "", "b", "", "a", "Lokhttp3/HttpUrl;", "url", "c", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: xj.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13842i {

    /* renamed from: a */
    public static final C13842i f35643a = new C13842i();

    private C13842i() {
    }

    /* renamed from: b */
    private final boolean m1411b(Request request, Proxy.Type type) {
        return !request.m8739g() && type == Proxy.Type.HTTP;
    }

    /* renamed from: a */
    public final String m1412a(Request request, Proxy.Type proxyType) {
        C9612q.m13917h(request, "request");
        C9612q.m13917h(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.m8738h());
        sb2.append(' ');
        C13842i c13842i = f35643a;
        if (c13842i.m1411b(request, proxyType)) {
            sb2.append(request.m8734l());
        } else {
            sb2.append(c13842i.m1410c(request.m8734l()));
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: c */
    public final String m1410c(HttpUrl url) {
        C9612q.m13917h(url, "url");
        String m8903d = url.m8903d();
        String m8901f = url.m8901f();
        if (m8901f != null) {
            return m8903d + '?' + m8901f;
        }
        return m8903d;
    }
}
