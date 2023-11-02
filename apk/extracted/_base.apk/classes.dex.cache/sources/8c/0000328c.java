package p089ek;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import p122gk.C6856y;
import sj.C12560a;
import sj.C12562c;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\f\u0010\n\u001a\u00020\u0002*\u00020\u0002H\u0002J\f\u0010\u000b\u001a\u00020\u0006*\u00020\u0002H\u0002J\u001c\u0010\r\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0002J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u001a"}, m14357d2 = {"Lek/d;", "Ljavax/net/ssl/HostnameVerifier;", "", "ipAddress", "Ljava/security/cert/X509Certificate;", "certificate", "", "h", "hostname", "g", "b", "d", "pattern", "f", "", "type", "", "c", ZeroconfModule.KEY_SERVICE_HOST, "Ljavax/net/ssl/SSLSession;", "session", "verify", "e", "a", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: ek.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6268d implements HostnameVerifier {

    /* renamed from: a */
    public static final C6268d f17712a = new C6268d();

    private C6268d() {
    }

    /* renamed from: b */
    private final String m23127b(String str) {
        if (m23125d(str)) {
            Locale locale = Locale.US;
            C9612q.m13918g(locale, "Locale.US");
            if (str != null) {
                String lowerCase = str.toLowerCase(locale);
                C9612q.m13918g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        return str;
    }

    /* renamed from: c */
    private final List<String> m23126c(X509Certificate x509Certificate, int i) {
        List<String> m14104i;
        List<String> m14104i2;
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && !(!C9612q.m13922c(list.get(0), Integer.valueOf(i))) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
            m14104i2 = C9545j.m14104i();
            return m14104i2;
        } catch (CertificateParsingException unused) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
    }

    /* renamed from: d */
    private final boolean m23125d(String str) {
        return str.length() == ((int) C6856y.m21775b(str, 0, 0, 3, null));
    }

    /* renamed from: f */
    private final boolean m23123f(String str, String str2) {
        boolean z;
        boolean m13758H;
        boolean m13755s;
        boolean z2;
        boolean m13758H2;
        boolean m13755s2;
        boolean m13755s3;
        boolean m13755s4;
        boolean m13731M;
        boolean m13758H3;
        int m13709Y;
        boolean m13755s5;
        int m13704d0;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            m13758H = C9653o.m13758H(str, ".", false, 2, null);
            if (!m13758H) {
                m13755s = C9653o.m13755s(str, "..", false, 2, null);
                if (!m13755s) {
                    if (str2 != null && str2.length() != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        m13758H2 = C9653o.m13758H(str2, ".", false, 2, null);
                        if (!m13758H2) {
                            m13755s2 = C9653o.m13755s(str2, "..", false, 2, null);
                            if (!m13755s2) {
                                m13755s3 = C9653o.m13755s(str, ".", false, 2, null);
                                if (!m13755s3) {
                                    str = str + ".";
                                }
                                String str3 = str;
                                m13755s4 = C9653o.m13755s(str2, ".", false, 2, null);
                                if (!m13755s4) {
                                    str2 = str2 + ".";
                                }
                                String m23127b = m23127b(str2);
                                m13731M = C9654p.m13731M(m23127b, "*", false, 2, null);
                                if (!m13731M) {
                                    return C9612q.m13922c(str3, m23127b);
                                }
                                m13758H3 = C9653o.m13758H(m23127b, "*.", false, 2, null);
                                if (m13758H3) {
                                    m13709Y = C9654p.m13709Y(m23127b, '*', 1, false, 4, null);
                                    if (m13709Y != -1 || str3.length() < m23127b.length() || C9612q.m13922c("*.", m23127b)) {
                                        return false;
                                    }
                                    String substring = m23127b.substring(1);
                                    C9612q.m13918g(substring, "(this as java.lang.String).substring(startIndex)");
                                    m13755s5 = C9653o.m13755s(str3, substring, false, 2, null);
                                    if (!m13755s5) {
                                        return false;
                                    }
                                    int length = str3.length() - substring.length();
                                    if (length > 0) {
                                        m13704d0 = C9654p.m13704d0(str3, '.', length - 1, false, 4, null);
                                        if (m13704d0 != -1) {
                                            return false;
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    private final boolean m23122g(String str, X509Certificate x509Certificate) {
        String m23127b = m23127b(str);
        List<String> m23126c = m23126c(x509Certificate, 2);
        if ((m23126c instanceof Collection) && m23126c.isEmpty()) {
            return false;
        }
        for (String str2 : m23126c) {
            if (f17712a.m23123f(m23127b, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private final boolean m23121h(String str, X509Certificate x509Certificate) {
        String m4837e = C12560a.m4837e(str);
        List<String> m23126c = m23126c(x509Certificate, 7);
        if ((m23126c instanceof Collection) && m23126c.isEmpty()) {
            return false;
        }
        for (String str2 : m23126c) {
            if (C9612q.m13922c(m4837e, C12560a.m4837e(str2))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final List<String> m23128a(X509Certificate certificate) {
        List<String> m14036n0;
        C9612q.m13917h(certificate, "certificate");
        m14036n0 = C9553r.m14036n0(m23126c(certificate, 7), m23126c(certificate, 2));
        return m14036n0;
    }

    /* renamed from: e */
    public final boolean m23124e(String host, X509Certificate certificate) {
        C9612q.m13917h(host, "host");
        C9612q.m13917h(certificate, "certificate");
        if (C12562c.m4805f(host)) {
            return m23121h(host, certificate);
        }
        return m23122g(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        Certificate certificate;
        C9612q.m13917h(host, "host");
        C9612q.m13917h(session, "session");
        if (m23125d(host)) {
            try {
                certificate = session.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return m23124e(host, (X509Certificate) certificate);
    }
}