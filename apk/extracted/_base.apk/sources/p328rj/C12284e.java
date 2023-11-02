package p328rj;

import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9604l0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import okio.ByteString;
import p089ek.AbstractC6266c;

@Metadata(m14358d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\n\u0018\u0000 \u001f2\u00020\u0001:\u0003\b\f\u000fB#\b\u0000\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b!\u0010\"J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J+\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m14357d2 = {"Lrj/e;", "", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "", "a", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lrj/e$c;", "c", "Lek/c;", "certificateChainCleaner", "e", "(Lek/c;)Lrj/e;", "other", "", "equals", "", "hashCode", "", "Ljava/util/Set;", "getPins", "()Ljava/util/Set;", "pins", "Lek/c;", "d", "()Lek/c;", "<init>", "(Ljava/util/Set;Lek/c;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: rj.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C12284e {

    /* renamed from: a */
    private final Set<C12287c> f31922a;

    /* renamed from: b */
    private final AbstractC6266c f31923b;

    /* renamed from: d */
    public static final C12286b f31921d = new C12286b(null);

    /* renamed from: c */
    public static final C12284e f31920c = new C12285a().m5584a();

    @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m14357d2 = {"Lrj/e$a;", "", "Lrj/e;", "a", "", "Lrj/e$c;", "Ljava/util/List;", "getPins", "()Ljava/util/List;", "pins", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: rj.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12285a {

        /* renamed from: a */
        private final List<C12287c> f31924a = new ArrayList();

        /* renamed from: a */
        public final C12284e m5584a() {
            Set m14071G0;
            m14071G0 = C9553r.m14071G0(this.f31924a);
            return new C12284e(m14071G0, null, 2, null);
        }
    }

    @Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m14357d2 = {"Lrj/e$b;", "", "Ljava/security/cert/X509Certificate;", "Lokio/ByteString;", "b", "c", "Ljava/security/cert/Certificate;", "certificate", "", "a", "Lrj/e;", "DEFAULT", "Lrj/e;", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: rj.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12286b {
        private C12286b() {
        }

        public /* synthetic */ C12286b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m5583a(Certificate certificate) {
            C9612q.m13917h(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + m5581c((X509Certificate) certificate).mo8572a();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        /* renamed from: b */
        public final ByteString m5582b(X509Certificate sha1Hash) {
            C9612q.m13917h(sha1Hash, "$this$sha1Hash");
            ByteString.C11214a c11214a = ByteString.f29482n;
            PublicKey publicKey = sha1Hash.getPublicKey();
            C9612q.m13918g(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C9612q.m13918g(encoded, "publicKey.encoded");
            return ByteString.C11214a.m8544g(c11214a, encoded, 0, 0, 3, null).m8553v();
        }

        /* renamed from: c */
        public final ByteString m5581c(X509Certificate sha256Hash) {
            C9612q.m13917h(sha256Hash, "$this$sha256Hash");
            ByteString.C11214a c11214a = ByteString.f29482n;
            PublicKey publicKey = sha256Hash.getPublicKey();
            C9612q.m13918g(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C9612q.m13918g(encoded, "publicKey.encoded");
            return ByteString.C11214a.m8544g(c11214a, encoded, 0, 0, 3, null).m8552w();
        }
    }

    @Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0013\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u0016"}, m14357d2 = {"Lrj/e$c;", "", "", "hostname", "", "c", "toString", "other", "equals", "", "hashCode", "a", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", "pattern", "b", "hashAlgorithm", "Lokio/ByteString;", "Lokio/ByteString;", "()Lokio/ByteString;", "hash", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: rj.e$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12287c {

        /* renamed from: a */
        private final String f31925a;

        /* renamed from: b */
        private final String f31926b;

        /* renamed from: c */
        private final ByteString f31927c;

        /* renamed from: a */
        public final ByteString m5580a() {
            return this.f31927c;
        }

        /* renamed from: b */
        public final String m5579b() {
            return this.f31926b;
        }

        /* renamed from: c */
        public final boolean m5578c(String hostname) {
            boolean m13758H;
            boolean m13758H2;
            boolean m13749y;
            int m13704d0;
            boolean m13749y2;
            C9612q.m13917h(hostname, "hostname");
            m13758H = C9653o.m13758H(this.f31925a, "**.", false, 2, null);
            if (m13758H) {
                int length = this.f31925a.length() - 3;
                int length2 = hostname.length() - length;
                m13749y2 = C9653o.m13749y(hostname, hostname.length() - length, this.f31925a, 3, length, false, 16, null);
                if (!m13749y2) {
                    return false;
                }
                if (length2 != 0 && hostname.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                m13758H2 = C9653o.m13758H(this.f31925a, "*.", false, 2, null);
                if (m13758H2) {
                    int length3 = this.f31925a.length() - 1;
                    int length4 = hostname.length() - length3;
                    m13749y = C9653o.m13749y(hostname, hostname.length() - length3, this.f31925a, 1, length3, false, 16, null);
                    if (!m13749y) {
                        return false;
                    }
                    m13704d0 = C9654p.m13704d0(hostname, '.', length4 - 1, false, 4, null);
                    if (m13704d0 != -1) {
                        return false;
                    }
                } else {
                    return C9612q.m13922c(hostname, this.f31925a);
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12287c)) {
                return false;
            }
            C12287c c12287c = (C12287c) obj;
            if (!(!C9612q.m13922c(this.f31925a, c12287c.f31925a)) && !(!C9612q.m13922c(this.f31926b, c12287c.f31926b)) && !(!C9612q.m13922c(this.f31927c, c12287c.f31927c))) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f31925a.hashCode() * 31) + this.f31926b.hashCode()) * 31) + this.f31927c.hashCode();
        }

        public String toString() {
            return this.f31926b + '/' + this.f31927c.mo8572a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m14357d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, m14356k = 3, m14355mv = {1, 4, 0})
    /* renamed from: rj.e$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12288d extends AbstractC9614s implements Function0<List<? extends X509Certificate>> {

        /* renamed from: k */
        final /* synthetic */ List f31929k;

        /* renamed from: l */
        final /* synthetic */ String f31930l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12288d(List list, String str) {
            super(0);
            this.f31929k = list;
            this.f31930l = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends X509Certificate> invoke() {
            List<Certificate> list;
            int m14093t;
            AbstractC6266c m5586d = C12284e.this.m5586d();
            if (m5586d == null || (list = m5586d.mo23130a(this.f31929k, this.f31930l)) == null) {
                list = this.f31929k;
            }
            m14093t = C9546k.m14093t(list, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (Certificate certificate : list) {
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C12284e(Set<C12287c> pins, AbstractC6266c abstractC6266c) {
        C9612q.m13917h(pins, "pins");
        this.f31922a = pins;
        this.f31923b = abstractC6266c;
    }

    /* renamed from: a */
    public final void m5589a(String hostname, List<? extends Certificate> peerCertificates) {
        C9612q.m13917h(hostname, "hostname");
        C9612q.m13917h(peerCertificates, "peerCertificates");
        m5588b(hostname, new C12288d(peerCertificates, hostname));
    }

    /* renamed from: b */
    public final void m5588b(String hostname, Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        C9612q.m13917h(hostname, "hostname");
        C9612q.m13917h(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<C12287c> m5587c = m5587c(hostname);
        if (m5587c.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : invoke) {
            ByteString byteString = null;
            ByteString byteString2 = null;
            for (C12287c c12287c : m5587c) {
                String m5579b = c12287c.m5579b();
                int hashCode = m5579b.hashCode();
                if (hashCode != -903629273) {
                    if (hashCode == 3528965 && m5579b.equals("sha1")) {
                        if (byteString2 == null) {
                            byteString2 = f31921d.m5582b(x509Certificate);
                        }
                        if (C9612q.m13922c(c12287c.m5580a(), byteString2)) {
                            return;
                        }
                    }
                    throw new AssertionError("unsupported hashAlgorithm: " + c12287c.m5579b());
                } else if (m5579b.equals("sha256")) {
                    if (byteString == null) {
                        byteString = f31921d.m5581c(x509Certificate);
                    }
                    if (C9612q.m13922c(c12287c.m5580a(), byteString)) {
                        return;
                    }
                } else {
                    throw new AssertionError("unsupported hashAlgorithm: " + c12287c.m5579b());
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : invoke) {
            sb2.append("\n    ");
            sb2.append(f31921d.m5583a(x509Certificate2));
            sb2.append(": ");
            Principal subjectDN = x509Certificate2.getSubjectDN();
            C9612q.m13918g(subjectDN, "element.subjectDN");
            sb2.append(subjectDN.getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(":");
        for (C12287c c12287c2 : m5587c) {
            sb2.append("\n    ");
            sb2.append(c12287c2);
        }
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb3);
    }

    /* renamed from: c */
    public final List<C12287c> m5587c(String hostname) {
        List<C12287c> m14104i;
        C9612q.m13917h(hostname, "hostname");
        Set<C12287c> set = this.f31922a;
        m14104i = C9545j.m14104i();
        for (Object obj : set) {
            if (((C12287c) obj).m5578c(hostname)) {
                if (m14104i.isEmpty()) {
                    m14104i = new ArrayList<>();
                }
                C9604l0.m13940b(m14104i).add(obj);
            }
        }
        return m14104i;
    }

    /* renamed from: d */
    public final AbstractC6266c m5586d() {
        return this.f31923b;
    }

    /* renamed from: e */
    public final C12284e m5585e(AbstractC6266c certificateChainCleaner) {
        C9612q.m13917h(certificateChainCleaner, "certificateChainCleaner");
        if (C9612q.m13922c(this.f31923b, certificateChainCleaner)) {
            return this;
        }
        return new C12284e(this.f31922a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12284e) {
            C12284e c12284e = (C12284e) obj;
            if (C9612q.m13922c(c12284e.f31922a, this.f31922a) && C9612q.m13922c(c12284e.f31923b, this.f31923b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (1517 + this.f31922a.hashCode()) * 41;
        AbstractC6266c abstractC6266c = this.f31923b;
        if (abstractC6266c != null) {
            i = abstractC6266c.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public /* synthetic */ C12284e(Set set, AbstractC6266c abstractC6266c, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? null : abstractC6266c);
    }
}
