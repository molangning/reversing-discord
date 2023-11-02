package p089ek;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0018"}, m14357d2 = {"Lek/a;", "Lek/c;", "Ljava/security/cert/X509Certificate;", "toVerify", "signingCert", "", "b", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "", "hashCode", "", "other", "equals", "Lek/e;", "Lek/e;", "trustRootIndex", "<init>", "(Lek/e;)V", "c", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: ek.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6263a extends AbstractC6266c {

    /* renamed from: c */
    public static final C6264a f17708c = new C6264a(null);

    /* renamed from: b */
    private final InterfaceC6269e f17709b;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lek/a$a;", "", "", "MAX_SIGNERS", "I", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: ek.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C6264a {
        private C6264a() {
        }

        public /* synthetic */ C6264a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C6263a(InterfaceC6269e trustRootIndex) {
        C9612q.m13917h(trustRootIndex, "trustRootIndex");
        this.f17709b = trustRootIndex;
    }

    /* renamed from: b */
    private final boolean m23131b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!C9612q.m13922c(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // p089ek.AbstractC6266c
    /* renamed from: a */
    public List<Certificate> mo23130a(List<? extends Certificate> chain, String hostname) {
        C9612q.m13917h(chain, "chain");
        C9612q.m13917h(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        C9612q.m13918g(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            if (obj != null) {
                X509Certificate x509Certificate = (X509Certificate) obj;
                X509Certificate mo23120a = this.f17709b.mo23120a(x509Certificate);
                if (mo23120a != null) {
                    if (arrayList.size() > 1 || (!C9612q.m13922c(x509Certificate, mo23120a))) {
                        arrayList.add(mo23120a);
                    }
                    if (m23131b(mo23120a, mo23120a)) {
                        return arrayList;
                    }
                    z = true;
                } else {
                    Iterator it = arrayDeque.iterator();
                    C9612q.m13918g(it, "queue.iterator()");
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next != null) {
                            X509Certificate x509Certificate2 = (X509Certificate) next;
                            if (m23131b(x509Certificate, x509Certificate2)) {
                                it.remove();
                                arrayList.add(x509Certificate2);
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                        }
                    }
                    if (z) {
                        return arrayList;
                    }
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C6263a) && C9612q.m13922c(((C6263a) obj).f17709b, this.f17709b);
    }

    public int hashCode() {
        return this.f17709b.hashCode();
    }
}
