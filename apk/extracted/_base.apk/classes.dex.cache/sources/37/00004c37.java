package p328rj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p340sf.C12466c;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 (2\u00020\u0001:\u0002\u0012\u0017B9\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001a\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001a¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0017\u0010\u0016\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u001c\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0019\u0010\"\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010!R\u0019\u0010%\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001f8G¢\u0006\u0006\u001a\u0004\b$\u0010!¨\u0006)"}, m14357d2 = {"Lrj/j;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "isFallback", "g", "", "c", "(Ljavax/net/ssl/SSLSocket;Z)V", "socket", "e", "other", "equals", "", "hashCode", "", "toString", "a", "Z", "f", "()Z", "isTls", "b", "h", "supportsTlsExtensions", "", "[Ljava/lang/String;", "cipherSuitesAsString", "d", "tlsVersionsAsString", "", "Lrj/g;", "()Ljava/util/List;", "cipherSuites", "Lrj/r;", "i", "tlsVersions", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "k", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: rj.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C12295j {

    /* renamed from: e */
    private static final C12290g[] f32057e;

    /* renamed from: f */
    private static final C12290g[] f32058f;

    /* renamed from: g */
    public static final C12295j f32059g;

    /* renamed from: h */
    public static final C12295j f32060h;

    /* renamed from: i */
    public static final C12295j f32061i;

    /* renamed from: j */
    public static final C12295j f32062j;

    /* renamed from: k */
    public static final C12297b f32063k = new C12297b(null);

    /* renamed from: a */
    private final boolean f32064a;

    /* renamed from: b */
    private final boolean f32065b;

    /* renamed from: c */
    private final String[] f32066c;

    /* renamed from: d */
    private final String[] f32067d;

    @Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b#\u0010\u0018B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0012¢\u0006\u0004\b#\u0010%J!\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\b\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0002\"\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0002\"\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0002\"\u00020\u0007¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0006\u0010\u0013\u001a\u00020\u0012R\"\u0010\u0019\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018¨\u0006&"}, m14357d2 = {"Lrj/j$a;", "", "", "Lrj/g;", "cipherSuites", "c", "([Lrj/g;)Lrj/j$a;", "", "b", "([Ljava/lang/String;)Lrj/j$a;", "Lrj/r;", "tlsVersions", "f", "([Lrj/r;)Lrj/j$a;", "e", "", "supportsTlsExtensions", "d", "Lrj/j;", "a", "Z", "getTls$okhttp", "()Z", "setTls$okhttp", "(Z)V", "tls", "[Ljava/lang/String;", "getCipherSuites$okhttp", "()[Ljava/lang/String;", "setCipherSuites$okhttp", "([Ljava/lang/String;)V", "getTlsVersions$okhttp", "setTlsVersions$okhttp", "getSupportsTlsExtensions$okhttp", "setSupportsTlsExtensions$okhttp", "<init>", "connectionSpec", "(Lrj/j;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: rj.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12296a {

        /* renamed from: a */
        private boolean f32068a;

        /* renamed from: b */
        private String[] f32069b;

        /* renamed from: c */
        private String[] f32070c;

        /* renamed from: d */
        private boolean f32071d;

        public C12296a(boolean z) {
            this.f32068a = z;
        }

        /* renamed from: a */
        public final C12295j m5555a() {
            return new C12295j(this.f32068a, this.f32071d, this.f32069b, this.f32070c);
        }

        /* renamed from: b */
        public final C12296a m5554b(String... cipherSuites) {
            boolean z;
            C9612q.m13917h(cipherSuites, "cipherSuites");
            if (this.f32068a) {
                if (cipherSuites.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Object clone = cipherSuites.clone();
                    if (clone != null) {
                        this.f32069b = (String[]) clone;
                        return this;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        /* renamed from: c */
        public final C12296a m5553c(C12290g... cipherSuites) {
            C9612q.m13917h(cipherSuites, "cipherSuites");
            if (this.f32068a) {
                ArrayList arrayList = new ArrayList(cipherSuites.length);
                for (C12290g c12290g : cipherSuites) {
                    arrayList.add(c12290g.m5572c());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    return m5554b((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        /* renamed from: d */
        public final C12296a m5552d(boolean z) {
            if (this.f32068a) {
                this.f32071d = z;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        /* renamed from: e */
        public final C12296a m5551e(String... tlsVersions) {
            boolean z;
            C9612q.m13917h(tlsVersions, "tlsVersions");
            if (this.f32068a) {
                if (tlsVersions.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Object clone = tlsVersions.clone();
                    if (clone != null) {
                        this.f32070c = (String[]) clone;
                        return this;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        /* renamed from: f */
        public final C12296a m5550f(EnumC12315r... tlsVersions) {
            C9612q.m13917h(tlsVersions, "tlsVersions");
            if (this.f32068a) {
                ArrayList arrayList = new ArrayList(tlsVersions.length);
                for (EnumC12315r enumC12315r : tlsVersions) {
                    arrayList.add(enumC12315r.m5503a());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    return m5551e((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public C12296a(C12295j connectionSpec) {
            C9612q.m13917h(connectionSpec, "connectionSpec");
            this.f32068a = connectionSpec.m5559f();
            this.f32069b = connectionSpec.f32066c;
            this.f32070c = connectionSpec.f32067d;
            this.f32071d = connectionSpec.m5557h();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, m14357d2 = {"Lrj/j$b;", "", "", "Lrj/g;", "APPROVED_CIPHER_SUITES", "[Lrj/g;", "Lrj/j;", "CLEARTEXT", "Lrj/j;", "COMPATIBLE_TLS", "MODERN_TLS", "RESTRICTED_CIPHER_SUITES", "RESTRICTED_TLS", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: rj.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12297b {
        private C12297b() {
        }

        public /* synthetic */ C12297b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C12290g c12290g = C12290g.f32025n1;
        C12290g c12290g2 = C12290g.f32028o1;
        C12290g c12290g3 = C12290g.f32031p1;
        C12290g c12290g4 = C12290g.f31984Z0;
        C12290g c12290g5 = C12290g.f31995d1;
        C12290g c12290g6 = C12290g.f31986a1;
        C12290g c12290g7 = C12290g.f31998e1;
        C12290g c12290g8 = C12290g.f32016k1;
        C12290g c12290g9 = C12290g.f32013j1;
        C12290g[] c12290gArr = {c12290g, c12290g2, c12290g3, c12290g4, c12290g5, c12290g6, c12290g7, c12290g8, c12290g9};
        f32057e = c12290gArr;
        C12290g[] c12290gArr2 = {c12290g, c12290g2, c12290g3, c12290g4, c12290g5, c12290g6, c12290g7, c12290g8, c12290g9, C12290g.f31954K0, C12290g.f31956L0, C12290g.f32009i0, C12290g.f32012j0, C12290g.f31945G, C12290g.f31953K, C12290g.f32014k};
        f32058f = c12290gArr2;
        C12296a m5553c = new C12296a(true).m5553c((C12290g[]) Arrays.copyOf(c12290gArr, c12290gArr.length));
        EnumC12315r enumC12315r = EnumC12315r.TLS_1_3;
        EnumC12315r enumC12315r2 = EnumC12315r.TLS_1_2;
        f32059g = m5553c.m5550f(enumC12315r, enumC12315r2).m5552d(true).m5555a();
        f32060h = new C12296a(true).m5553c((C12290g[]) Arrays.copyOf(c12290gArr2, c12290gArr2.length)).m5550f(enumC12315r, enumC12315r2).m5552d(true).m5555a();
        f32061i = new C12296a(true).m5553c((C12290g[]) Arrays.copyOf(c12290gArr2, c12290gArr2.length)).m5550f(enumC12315r, enumC12315r2, EnumC12315r.TLS_1_1, EnumC12315r.TLS_1_0).m5552d(true).m5555a();
        f32062j = new C12296a(false).m5555a();
    }

    public C12295j(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f32064a = z;
        this.f32065b = z2;
        this.f32066c = strArr;
        this.f32067d = strArr2;
    }

    /* renamed from: g */
    private final C12295j m5558g(SSLSocket sSLSocket, boolean z) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        Comparator m5207f;
        if (this.f32066c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            C9612q.m13918g(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = C12562c.m4834B(enabledCipherSuites, this.f32066c, C12290g.f32040s1.m5568c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f32067d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            C9612q.m13918g(enabledProtocols, "sslSocket.enabledProtocols");
            String[] strArr = this.f32067d;
            m5207f = C12466c.m5207f();
            tlsVersionsIntersection = C12562c.m4834B(enabledProtocols, strArr, m5207f);
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        C9612q.m13918g(supportedCipherSuites, "supportedCipherSuites");
        int m4790u = C12562c.m4790u(supportedCipherSuites, "TLS_FALLBACK_SCSV", C12290g.f32040s1.m5568c());
        if (z && m4790u != -1) {
            C9612q.m13918g(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[m4790u];
            C9612q.m13918g(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = C12562c.m4799l(cipherSuitesIntersection, str);
        }
        C12296a c12296a = new C12296a(this);
        C9612q.m13918g(cipherSuitesIntersection, "cipherSuitesIntersection");
        C12296a m5554b = c12296a.m5554b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        C9612q.m13918g(tlsVersionsIntersection, "tlsVersionsIntersection");
        return m5554b.m5551e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).m5555a();
    }

    /* renamed from: c */
    public final void m5562c(SSLSocket sslSocket, boolean z) {
        C9612q.m13917h(sslSocket, "sslSocket");
        C12295j m5558g = m5558g(sslSocket, z);
        if (m5558g.m5556i() != null) {
            sslSocket.setEnabledProtocols(m5558g.f32067d);
        }
        if (m5558g.m5561d() != null) {
            sslSocket.setEnabledCipherSuites(m5558g.f32066c);
        }
    }

    /* renamed from: d */
    public final List<C12290g> m5561d() {
        List<C12290g> m14075C0;
        String[] strArr = this.f32066c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(C12290g.f32040s1.m5569b(str));
            }
            m14075C0 = C9553r.m14075C0(arrayList);
            return m14075C0;
        }
        return null;
    }

    /* renamed from: e */
    public final boolean m5560e(SSLSocket socket) {
        Comparator m5207f;
        C9612q.m13917h(socket, "socket");
        if (!this.f32064a) {
            return false;
        }
        String[] strArr = this.f32067d;
        if (strArr != null) {
            String[] enabledProtocols = socket.getEnabledProtocols();
            m5207f = C12466c.m5207f();
            if (!C12562c.m4793r(strArr, enabledProtocols, m5207f)) {
                return false;
            }
        }
        String[] strArr2 = this.f32066c;
        if (strArr2 != null && !C12562c.m4793r(strArr2, socket.getEnabledCipherSuites(), C12290g.f32040s1.m5568c())) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12295j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f32064a;
        C12295j c12295j = (C12295j) obj;
        if (z != c12295j.f32064a) {
            return false;
        }
        if (z && (!Arrays.equals(this.f32066c, c12295j.f32066c) || !Arrays.equals(this.f32067d, c12295j.f32067d) || this.f32065b != c12295j.f32065b)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean m5559f() {
        return this.f32064a;
    }

    /* renamed from: h */
    public final boolean m5557h() {
        return this.f32065b;
    }

    public int hashCode() {
        int i;
        if (this.f32064a) {
            String[] strArr = this.f32066c;
            int i2 = 0;
            if (strArr != null) {
                i = Arrays.hashCode(strArr);
            } else {
                i = 0;
            }
            int i3 = (527 + i) * 31;
            String[] strArr2 = this.f32067d;
            if (strArr2 != null) {
                i2 = Arrays.hashCode(strArr2);
            }
            return ((i3 + i2) * 31) + (!this.f32065b ? 1 : 0);
        }
        return 17;
    }

    /* renamed from: i */
    public final List<EnumC12315r> m5556i() {
        List<EnumC12315r> m14075C0;
        String[] strArr = this.f32067d;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(EnumC12315r.f32104q.m5502a(str));
            }
            m14075C0 = C9553r.m14075C0(arrayList);
            return m14075C0;
        }
        return null;
    }

    public String toString() {
        if (!this.f32064a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m5561d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m5556i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f32065b + ')';
    }
}