package p410wj;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p328rj.C12295j;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m14357d2 = {"Lwj/b;", "", "Ljavax/net/ssl/SSLSocket;", "socket", "", "c", "sslSocket", "Lrj/j;", "a", "Ljava/io/IOException;", "e", "b", "", "I", "nextModeIndex", "Z", "isFallbackPossible", "isFallback", "", "d", "Ljava/util/List;", "connectionSpecs", "<init>", "(Ljava/util/List;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: wj.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13633b {

    /* renamed from: a */
    private int f35027a;

    /* renamed from: b */
    private boolean f35028b;

    /* renamed from: c */
    private boolean f35029c;

    /* renamed from: d */
    private final List<C12295j> f35030d;

    public C13633b(List<C12295j> connectionSpecs) {
        C9612q.m13917h(connectionSpecs, "connectionSpecs");
        this.f35030d = connectionSpecs;
    }

    /* renamed from: c */
    private final boolean m2038c(SSLSocket sSLSocket) {
        int size = this.f35030d.size();
        for (int i = this.f35027a; i < size; i++) {
            if (this.f35030d.get(i).m5560e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C12295j m2040a(SSLSocket sslSocket) {
        C12295j c12295j;
        C9612q.m13917h(sslSocket, "sslSocket");
        int i = this.f35027a;
        int size = this.f35030d.size();
        while (true) {
            if (i < size) {
                c12295j = this.f35030d.get(i);
                if (c12295j.m5560e(sslSocket)) {
                    this.f35027a = i + 1;
                    break;
                }
                i++;
            } else {
                c12295j = null;
                break;
            }
        }
        if (c12295j != null) {
            this.f35028b = m2038c(sslSocket);
            c12295j.m5562c(sslSocket, this.f35029c);
            return c12295j;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f35029c);
        sb2.append(',');
        sb2.append(" modes=");
        sb2.append(this.f35030d);
        sb2.append(',');
        sb2.append(" supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        C9612q.m13920e(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        C9612q.m13918g(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    /* renamed from: b */
    public final boolean m2039b(IOException e) {
        C9612q.m13917h(e, "e");
        this.f35029c = true;
        if (this.f35028b && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
            return true;
        }
        return false;
    }
}
