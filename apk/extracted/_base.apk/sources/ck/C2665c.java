package ck;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p031bk.C2370k;
import p328rj.EnumC12312p;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0017¨\u0006\u0011"}, m14357d2 = {"Lck/c;", "Lck/m;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "a", "", "c", "hostname", "", "Lrj/p;", "protocols", "", "d", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
@SuppressLint({"NewApi"})
/* renamed from: ck.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C2665c implements InterfaceC2685m {

    /* renamed from: a */
    public static final C2666a f7159a = new C2666a(null);

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, m14357d2 = {"Lck/c$a;", "", "Lck/m;", "a", "", "b", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: ck.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C2666a {
        private C2666a() {
        }

        public /* synthetic */ C2666a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC2685m m32748a() {
            if (m32747b()) {
                return new C2665c();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m32747b() {
            return C2370k.f6491c.m33587h() && Build.VERSION.SDK_INT >= 29;
        }
    }

    @Override // ck.InterfaceC2685m
    /* renamed from: a */
    public boolean mo32724a() {
        return f7159a.m32747b();
    }

    @Override // ck.InterfaceC2685m
    /* renamed from: b */
    public boolean mo32723b(SSLSocket sslSocket) {
        boolean isSupportedSocket;
        C9612q.m13917h(sslSocket, "sslSocket");
        isSupportedSocket = SSLSockets.isSupportedSocket(sslSocket);
        return isSupportedSocket;
    }

    @Override // ck.InterfaceC2685m
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public String mo32722c(SSLSocket sslSocket) {
        String applicationProtocol;
        C9612q.m13917h(sslSocket, "sslSocket");
        applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // ck.InterfaceC2685m
    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public void mo32721d(SSLSocket sslSocket, String str, List<? extends EnumC12312p> protocols) {
        C9612q.m13917h(sslSocket, "sslSocket");
        C9612q.m13917h(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sslParameters = sslSocket.getSSLParameters();
            C9612q.m13918g(sslParameters, "sslParameters");
            Object[] array = C2370k.f6491c.m33593b(protocols).toArray(new String[0]);
            if (array != null) {
                sslParameters.setApplicationProtocols((String[]) array);
                sslSocket.setSSLParameters(sslParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
