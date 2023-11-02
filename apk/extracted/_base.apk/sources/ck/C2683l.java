package ck;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p328rj.EnumC12312p;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0017"}, m14357d2 = {"Lck/l;", "Lck/m;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "e", "", "a", "b", "", "hostname", "", "Lrj/p;", "protocols", "", "d", "c", "Lck/m;", "delegate", "Lck/l$a;", "Lck/l$a;", "socketAdapterFactory", "<init>", "(Lck/l$a;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: ck.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C2683l implements InterfaceC2685m {

    /* renamed from: a */
    private InterfaceC2685m f7183a;

    /* renamed from: b */
    private final InterfaceC2684a f7184b;

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, m14357d2 = {"Lck/l$a;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "Lck/m;", "c", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: ck.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface InterfaceC2684a {
        /* renamed from: b */
        boolean mo32726b(SSLSocket sSLSocket);

        /* renamed from: c */
        InterfaceC2685m mo32725c(SSLSocket sSLSocket);
    }

    public C2683l(InterfaceC2684a socketAdapterFactory) {
        C9612q.m13917h(socketAdapterFactory, "socketAdapterFactory");
        this.f7184b = socketAdapterFactory;
    }

    /* renamed from: e */
    private final synchronized InterfaceC2685m m32727e(SSLSocket sSLSocket) {
        if (this.f7183a == null && this.f7184b.mo32726b(sSLSocket)) {
            this.f7183a = this.f7184b.mo32725c(sSLSocket);
        }
        return this.f7183a;
    }

    @Override // ck.InterfaceC2685m
    /* renamed from: a */
    public boolean mo32724a() {
        return true;
    }

    @Override // ck.InterfaceC2685m
    /* renamed from: b */
    public boolean mo32723b(SSLSocket sslSocket) {
        C9612q.m13917h(sslSocket, "sslSocket");
        return this.f7184b.mo32726b(sslSocket);
    }

    @Override // ck.InterfaceC2685m
    /* renamed from: c */
    public String mo32722c(SSLSocket sslSocket) {
        C9612q.m13917h(sslSocket, "sslSocket");
        InterfaceC2685m m32727e = m32727e(sslSocket);
        if (m32727e != null) {
            return m32727e.mo32722c(sslSocket);
        }
        return null;
    }

    @Override // ck.InterfaceC2685m
    /* renamed from: d */
    public void mo32721d(SSLSocket sslSocket, String str, List<? extends EnumC12312p> protocols) {
        C9612q.m13917h(sslSocket, "sslSocket");
        C9612q.m13917h(protocols, "protocols");
        InterfaceC2685m m32727e = m32727e(sslSocket);
        if (m32727e != null) {
            m32727e.mo32721d(sslSocket, str, protocols);
        }
    }
}
