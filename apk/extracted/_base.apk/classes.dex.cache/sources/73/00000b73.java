package ck;

import ck.C2683l;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p031bk.C2356d;
import p031bk.C2370k;
import p328rj.EnumC12312p;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¨\u0006\u0011"}, m14357d2 = {"Lck/i;", "Lck/m;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "a", "", "c", "hostname", "", "Lrj/p;", "protocols", "", "d", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: ck.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C2675i implements InterfaceC2685m {

    /* renamed from: b */
    public static final C2677b f7176b = new C2677b(null);

    /* renamed from: a */
    private static final C2683l.InterfaceC2684a f7175a = new C2676a();

    @Metadata(m14358d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m14357d2 = {"ck/i$a", "Lck/l$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "Lck/m;", "c", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: ck.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C2676a implements C2683l.InterfaceC2684a {
        C2676a() {
        }

        @Override // ck.C2683l.InterfaceC2684a
        /* renamed from: b */
        public boolean mo32726b(SSLSocket sslSocket) {
            C9612q.m13917h(sslSocket, "sslSocket");
            if (C2356d.f6469f.m33626b() && (sslSocket instanceof BCSSLSocket)) {
                return true;
            }
            return false;
        }

        @Override // ck.C2683l.InterfaceC2684a
        /* renamed from: c */
        public InterfaceC2685m mo32725c(SSLSocket sslSocket) {
            C9612q.m13917h(sslSocket, "sslSocket");
            return new C2675i();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m14357d2 = {"Lck/i$b;", "", "Lck/l$a;", "factory", "Lck/l$a;", "a", "()Lck/l$a;", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: ck.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C2677b {
        private C2677b() {
        }

        public /* synthetic */ C2677b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C2683l.InterfaceC2684a m32733a() {
            return C2675i.f7175a;
        }
    }

    @Override // ck.InterfaceC2685m
    /* renamed from: a */
    public boolean mo32724a() {
        return C2356d.f6469f.m33626b();
    }

    @Override // ck.InterfaceC2685m
    /* renamed from: b */
    public boolean mo32723b(SSLSocket sslSocket) {
        C9612q.m13917h(sslSocket, "sslSocket");
        return sslSocket instanceof BCSSLSocket;
    }

    @Override // ck.InterfaceC2685m
    /* renamed from: c */
    public String mo32722c(SSLSocket sslSocket) {
        C9612q.m13917h(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // ck.InterfaceC2685m
    /* renamed from: d */
    public void mo32721d(SSLSocket sslSocket, String str, List<? extends EnumC12312p> protocols) {
        C9612q.m13917h(sslSocket, "sslSocket");
        C9612q.m13917h(protocols, "protocols");
        if (mo32723b(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters sslParameters = bCSSLSocket.getParameters();
            C9612q.m13918g(sslParameters, "sslParameters");
            Object[] array = C2370k.f6491c.m33593b(protocols).toArray(new String[0]);
            if (array != null) {
                sslParameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(sslParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}