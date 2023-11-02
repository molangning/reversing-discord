package p328rj;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11577n;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u000bB;\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0016\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001f¢\u0006\u0004\b!\u0010\"J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00168\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u000b\u0010\u0019R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u0017\u0010\u000eR\u0018\u0010\u001e\u001a\u00020\u0007*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001d¨\u0006#"}, m14357d2 = {"Lrj/n;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "Ljava/security/cert/Certificate;", "a", "Lkotlin/Lazy;", "d", "()Ljava/util/List;", "peerCertificates", "Lrj/r;", "b", "Lrj/r;", "e", "()Lrj/r;", "tlsVersion", "Lrj/g;", "c", "Lrj/g;", "()Lrj/g;", "cipherSuite", "Ljava/util/List;", "localCertificates", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_NAME, "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lrj/r;Lrj/g;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: rj.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C12306n {

    /* renamed from: e */
    public static final C12307a f32077e = new C12307a(null);

    /* renamed from: a */
    private final Lazy f32078a;

    /* renamed from: b */
    private final EnumC12315r f32079b;

    /* renamed from: c */
    private final C12290g f32080c;

    /* renamed from: d */
    private final List<Certificate> f32081d;

    @Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004*\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004H\u0007¨\u0006\u0014"}, m14357d2 = {"Lrj/n$a;", "", "", "Ljava/security/cert/Certificate;", "", "c", "([Ljava/security/cert/Certificate;)Ljava/util/List;", "Ljavax/net/ssl/SSLSession;", "Lrj/n;", "a", "(Ljavax/net/ssl/SSLSession;)Lrj/n;", "Lrj/r;", "tlsVersion", "Lrj/g;", "cipherSuite", "peerCertificates", "localCertificates", "b", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: rj.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12307a {

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m14357d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, m14356k = 3, m14355mv = {1, 4, 0})
        /* renamed from: rj.n$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C12308a extends AbstractC9614s implements Function0<List<? extends Certificate>> {

            /* renamed from: j */
            final /* synthetic */ List f32082j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12308a(List list) {
                super(0);
                this.f32082j = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Certificate> invoke() {
                return this.f32082j;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m14357d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, m14356k = 3, m14355mv = {1, 4, 0})
        /* renamed from: rj.n$a$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C12309b extends AbstractC9614s implements Function0<List<? extends Certificate>> {

            /* renamed from: j */
            final /* synthetic */ List f32083j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12309b(List list) {
                super(0);
                this.f32083j = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Certificate> invoke() {
                return this.f32083j;
            }
        }

        private C12307a() {
        }

        public /* synthetic */ C12307a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        private final List<Certificate> m5511c(Certificate[] certificateArr) {
            List<Certificate> m14104i;
            if (certificateArr != null) {
                return C12562c.m4791t((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length));
            }
            m14104i = C9545j.m14104i();
            return m14104i;
        }

        /* renamed from: a */
        public final C12306n m5513a(SSLSession handshake) {
            List<Certificate> m14104i;
            C9612q.m13917h(handshake, "$this$handshake");
            String cipherSuite = handshake.getCipherSuite();
            if (cipherSuite != null) {
                int hashCode = cipherSuite.hashCode();
                if (hashCode == 1019404634 ? !cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : !(hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL"))) {
                    C12290g m5569b = C12290g.f32040s1.m5569b(cipherSuite);
                    String protocol = handshake.getProtocol();
                    if (protocol != null) {
                        if (!C9612q.m13922c("NONE", protocol)) {
                            EnumC12315r m5502a = EnumC12315r.f32104q.m5502a(protocol);
                            try {
                                m14104i = m5511c(handshake.getPeerCertificates());
                            } catch (SSLPeerUnverifiedException unused) {
                                m14104i = C9545j.m14104i();
                            }
                            return new C12306n(m5502a, m5569b, m5511c(handshake.getLocalCertificates()), new C12309b(m14104i));
                        }
                        throw new IOException("tlsVersion == NONE");
                    }
                    throw new IllegalStateException("tlsVersion == null".toString());
                }
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            throw new IllegalStateException("cipherSuite == null".toString());
        }

        /* renamed from: b */
        public final C12306n m5512b(EnumC12315r tlsVersion, C12290g cipherSuite, List<? extends Certificate> peerCertificates, List<? extends Certificate> localCertificates) {
            C9612q.m13917h(tlsVersion, "tlsVersion");
            C9612q.m13917h(cipherSuite, "cipherSuite");
            C9612q.m13917h(peerCertificates, "peerCertificates");
            C9612q.m13917h(localCertificates, "localCertificates");
            return new C12306n(tlsVersion, cipherSuite, C12562c.m4818R(localCertificates), new C12308a(C12562c.m4818R(peerCertificates)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m14357d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, m14356k = 3, m14355mv = {1, 4, 0})
    /* renamed from: rj.n$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12310b extends AbstractC9614s implements Function0<List<? extends Certificate>> {

        /* renamed from: j */
        final /* synthetic */ Function0 f32084j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12310b(Function0 function0) {
            super(0);
            this.f32084j = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Certificate> invoke() {
            List<? extends Certificate> m14104i;
            try {
                return (List) this.f32084j.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                m14104i = C9545j.m14104i();
                return m14104i;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12306n(EnumC12315r tlsVersion, C12290g cipherSuite, List<? extends Certificate> localCertificates, Function0<? extends List<? extends Certificate>> peerCertificatesFn) {
        Lazy m7601a;
        C9612q.m13917h(tlsVersion, "tlsVersion");
        C9612q.m13917h(cipherSuite, "cipherSuite");
        C9612q.m13917h(localCertificates, "localCertificates");
        C9612q.m13917h(peerCertificatesFn, "peerCertificatesFn");
        this.f32079b = tlsVersion;
        this.f32080c = cipherSuite;
        this.f32081d = localCertificates;
        m7601a = C11577n.m7601a(new C12310b(peerCertificatesFn));
        this.f32078a = m7601a;
    }

    /* renamed from: b */
    private final String m5517b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        C9612q.m13918g(type, "type");
        return type;
    }

    /* renamed from: a */
    public final C12290g m5518a() {
        return this.f32080c;
    }

    /* renamed from: c */
    public final List<Certificate> m5516c() {
        return this.f32081d;
    }

    /* renamed from: d */
    public final List<Certificate> m5515d() {
        return (List) this.f32078a.getValue();
    }

    /* renamed from: e */
    public final EnumC12315r m5514e() {
        return this.f32079b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12306n) {
            C12306n c12306n = (C12306n) obj;
            if (c12306n.f32079b == this.f32079b && C9612q.m13922c(c12306n.f32080c, this.f32080c) && C9612q.m13922c(c12306n.m5515d(), m5515d()) && C9612q.m13922c(c12306n.f32081d, this.f32081d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f32079b.hashCode()) * 31) + this.f32080c.hashCode()) * 31) + m5515d().hashCode()) * 31) + this.f32081d.hashCode();
    }

    public String toString() {
        int m14093t;
        int m14093t2;
        List<Certificate> m5515d = m5515d();
        m14093t = C9546k.m14093t(m5515d, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (Certificate certificate : m5515d) {
            arrayList.add(m5517b(certificate));
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{");
        sb2.append("tlsVersion=");
        sb2.append(this.f32079b);
        sb2.append(' ');
        sb2.append("cipherSuite=");
        sb2.append(this.f32080c);
        sb2.append(' ');
        sb2.append("peerCertificates=");
        sb2.append(obj);
        sb2.append(' ');
        sb2.append("localCertificates=");
        List<Certificate> list = this.f32081d;
        m14093t2 = C9546k.m14093t(list, 10);
        ArrayList arrayList2 = new ArrayList(m14093t2);
        for (Certificate certificate2 : list) {
            arrayList2.add(m5517b(certificate2));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}