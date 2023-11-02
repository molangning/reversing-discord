package tj;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import p328rj.C12271a;
import p328rj.C12289f;
import p328rj.C12298k;
import p328rj.C12314q;
import p328rj.InterfaceC12272b;
import p328rj.InterfaceC12299l;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m14357d2 = {"Ltj/b;", "Lrj/b;", "Ljava/net/Proxy;", "Lokhttp3/HttpUrl;", "url", "Lrj/l;", "dns", "Ljava/net/InetAddress;", "b", "Lrj/q;", "route", "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "a", "d", "Lrj/l;", "defaultDns", "<init>", "(Lrj/l;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: tj.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C12805b implements InterfaceC12272b {

    /* renamed from: d */
    private final InterfaceC12299l f33176d;

    public C12805b(InterfaceC12299l defaultDns) {
        C9612q.m13917h(defaultDns, "defaultDns");
        this.f33176d = defaultDns;
    }

    /* renamed from: b */
    private final InetAddress m3876b(Proxy proxy, HttpUrl httpUrl, InterfaceC12299l interfaceC12299l) {
        Object m14056T;
        Proxy.Type type = proxy.type();
        if (type == null || C12804a.f33175a[type.ordinal()] != 1) {
            SocketAddress address = proxy.address();
            if (address != null) {
                InetAddress address2 = ((InetSocketAddress) address).getAddress();
                C9612q.m13918g(address2, "(address() as InetSocketAddress).address");
                return address2;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
        }
        m14056T = C9553r.m14056T(interfaceC12299l.mo5548a(httpUrl.m8899h()));
        return (InetAddress) m14056T;
    }

    @Override // p328rj.InterfaceC12272b
    /* renamed from: a */
    public Request mo3877a(C12314q c12314q, Response response) {
        boolean z;
        Proxy proxy;
        boolean m13754t;
        InterfaceC12299l interfaceC12299l;
        PasswordAuthentication requestPasswordAuthentication;
        String str;
        C12271a m5507a;
        C9612q.m13917h(response, "response");
        List<C12289f> m8696j = response.m8696j();
        Request m8702V = response.m8702V();
        HttpUrl m8734l = m8702V.m8734l();
        if (response.m8695m() == 407) {
            z = true;
        } else {
            z = false;
        }
        if (c12314q == null || (proxy = c12314q.m5506b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C12289f c12289f : m8696j) {
            m13754t = C9653o.m13754t("Basic", c12289f.m5575c(), true);
            if (m13754t) {
                if (c12314q == null || (m5507a = c12314q.m5507a()) == null || (interfaceC12299l = m5507a.m5627c()) == null) {
                    interfaceC12299l = this.f33176d;
                }
                if (z) {
                    SocketAddress address = proxy.address();
                    if (address != null) {
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                        String hostName = inetSocketAddress.getHostName();
                        C9612q.m13918g(proxy, "proxy");
                        requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, m3876b(proxy, m8734l, interfaceC12299l), inetSocketAddress.getPort(), m8734l.m8890q(), c12289f.m5576b(), c12289f.m5575c(), m8734l.m8888s(), Authenticator.RequestorType.PROXY);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                } else {
                    String m8899h = m8734l.m8899h();
                    C9612q.m13918g(proxy, "proxy");
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(m8899h, m3876b(proxy, m8734l, interfaceC12299l), m8734l.m8894m(), m8734l.m8890q(), c12289f.m5576b(), c12289f.m5575c(), m8734l.m8888s(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    if (z) {
                        str = "Proxy-Authorization";
                    } else {
                        str = "Authorization";
                    }
                    String userName = requestPasswordAuthentication.getUserName();
                    C9612q.m13918g(userName, "auth.userName");
                    char[] password = requestPasswordAuthentication.getPassword();
                    C9612q.m13918g(password, "auth.password");
                    return m8702V.m8737i().m8729e(str, C12298k.m5549a(userName, new String(password), c12289f.m5577a())).m8732b();
                }
            }
        }
        return null;
    }

    public /* synthetic */ C12805b(InterfaceC12299l interfaceC12299l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InterfaceC12299l.f32073a : interfaceC12299l);
    }
}
