package ck;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p089ek.AbstractC6266c;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m14357d2 = {"Lck/d;", "Lek/c;", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "", "other", "", "equals", "", "hashCode", "Ljavax/net/ssl/X509TrustManager;", "b", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Landroid/net/http/X509TrustManagerExtensions;", "c", "Landroid/net/http/X509TrustManagerExtensions;", "x509TrustManagerExtensions", "<init>", "(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V", "d", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: ck.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C2667d extends AbstractC6266c {

    /* renamed from: d */
    public static final C2668a f7160d = new C2668a(null);

    /* renamed from: b */
    private final X509TrustManager f7161b;

    /* renamed from: c */
    private final X509TrustManagerExtensions f7162c;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m14357d2 = {"Lck/d$a;", "", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lck/d;", "a", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: ck.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C2668a {
        private C2668a() {
        }

        public /* synthetic */ C2668a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C2667d m32746a(X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            C9612q.m13917h(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions == null) {
                return null;
            }
            return new C2667d(trustManager, x509TrustManagerExtensions);
        }
    }

    public C2667d(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        C9612q.m13917h(trustManager, "trustManager");
        C9612q.m13917h(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f7161b = trustManager;
        this.f7162c = x509TrustManagerExtensions;
    }

    @Override // p089ek.AbstractC6266c
    /* renamed from: a */
    public List<Certificate> mo23130a(List<? extends Certificate> chain, String hostname) {
        C9612q.m13917h(chain, "chain");
        C9612q.m13917h(hostname, "hostname");
        Object[] array = chain.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.f7162c.checkServerTrusted((X509Certificate[]) array, "RSA", hostname);
                C9612q.m13918g(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2667d) && ((C2667d) obj).f7161b == this.f7161b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f7161b);
    }
}
