package p410wj;

import com.facebook.react.uimanager.ViewProps;
import fk.C6489d;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9644h;
import kotlin.text.C9653o;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.BufferedSink;
import okio.BufferedSource;
import p031bk.C2370k;
import p089ek.AbstractC6266c;
import p089ek.C6268d;
import p122gk.C6840m;
import p328rj.AbstractC12302m;
import p328rj.C12271a;
import p328rj.C12284e;
import p328rj.C12295j;
import p328rj.C12306n;
import p328rj.C12314q;
import p328rj.EnumC12312p;
import p328rj.InterfaceC12293h;
import p390vj.C13346e;
import p431xj.C13840g;
import p431xj.InterfaceC13837d;
import p451yj.C14035b;
import p471zj.C14290a;
import p471zj.C14299f;
import p471zj.C14318g;
import p471zj.C14324i;
import p471zj.C14336m;
import p471zj.C14338n;
import p471zj.EnumC14291b;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001GB\u001c\u0012\b\u0010\u0084\u0001\u001a\u00030\u0080\u0001\u0012\u0007\u0010\u0086\u0001\u001a\u00020\u001b¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J*\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0016\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 H\u0002J\u000f\u0010#\u001a\u00020\u000bH\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0000¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u000bH\u0000¢\u0006\u0004\b&\u0010$J>\u0010(\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ'\u0010,\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b3\u00104J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b8\u00109J\b\u0010:\u001a\u00020\u001bH\u0016J\u0006\u0010;\u001a\u00020\u000bJ\b\u0010=\u001a\u00020<H\u0016J\u000e\u0010?\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u001dJ\u0010\u0010B\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020@H\u0016J\u0018\u0010G\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020EH\u0016J\n\u0010H\u001a\u0004\u0018\u00010 H\u0016J'\u0010L\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.2\u0006\u0010I\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020JH\u0000¢\u0006\u0004\bL\u0010MJ!\u0010O\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020N2\b\u0010\"\u001a\u0004\u0018\u00010JH\u0000¢\u0006\u0004\bO\u0010PJ\b\u0010R\u001a\u00020QH\u0016R\u0018\u0010U\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010TR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010WR\u0018\u0010Z\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010^R\u0018\u0010b\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010aR\"\u0010h\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0016\u0010i\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010cR\"\u0010o\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0016\u0010p\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010jR\u0016\u0010r\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010jR\u0016\u0010t\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010jR#\u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0v0u8\u0006¢\u0006\f\n\u0004\bd\u0010w\u001a\u0004\bq\u0010xR\"\u0010\u007f\u001a\u00020z8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bk\u0010{\u001a\u0004\bs\u0010|\"\u0004\b}\u0010~R\u001c\u0010\u0084\u0001\u001a\u00030\u0080\u00018\u0006¢\u0006\u000f\n\u0005\bH\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0086\u0001\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010\u0085\u0001R\u0016\u0010\u0088\u0001\u001a\u00020\u001d8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010e¨\u0006\u008b\u0001"}, m14357d2 = {"Lwj/f;", "Lzj/f$d;", "Lrj/h;", "", "connectTimeout", "readTimeout", "writeTimeout", "Lokhttp3/Call;", "call", "Lrj/m;", "eventListener", "", "j", "h", "Lwj/b;", "connectionSpecSelector", "pingIntervalMillis", "m", "F", "i", "Lokhttp3/Request;", "tunnelRequest", "Lokhttp3/HttpUrl;", "url", "k", "l", "", "Lrj/q;", "candidates", "", "B", "G", "Lrj/n;", "handshake", "e", "z", "()V", "y", "s", "connectionRetryEnabled", "f", "Lrj/a;", "address", "routes", "t", "(Lrj/a;Ljava/util/List;)Z", "Lokhttp3/OkHttpClient;", "client", "Lxj/g;", "chain", "Lxj/d;", "w", "(Lokhttp3/OkHttpClient;Lxj/g;)Lxj/d;", "Lwj/c;", "exchange", "Lfk/d$d;", "x", "(Lwj/c;)Lfk/d$d;", "A", "d", "Ljava/net/Socket;", "E", "doExtensiveChecks", "u", "Lzj/i;", "stream", "b", "Lzj/f;", "connection", "Lzj/m;", "settings", "a", "r", "failedRoute", "Ljava/io/IOException;", "failure", "g", "(Lokhttp3/OkHttpClient;Lrj/q;Ljava/io/IOException;)V", "Lwj/e;", "H", "(Lwj/e;Ljava/io/IOException;)V", "", "toString", "c", "Ljava/net/Socket;", "rawSocket", "socket", "Lrj/n;", "Lrj/p;", "Lrj/p;", "protocol", "Lzj/f;", "http2Connection", "Lokio/BufferedSource;", "Lokio/BufferedSource;", "source", "Lokio/BufferedSink;", "Lokio/BufferedSink;", "sink", "Z", "p", "()Z", "D", "(Z)V", "noNewExchanges", "noCoalescedConnections", "I", "q", "()I", "setRouteFailureCount$okhttp", "(I)V", "routeFailureCount", "successCount", "n", "refusedStreamCount", "o", "allocationLimit", "", "Ljava/lang/ref/Reference;", "Ljava/util/List;", "()Ljava/util/List;", "calls", "", "J", "()J", "C", "(J)V", "idleAtNs", "Lwj/h;", "Lwj/h;", "getConnectionPool", "()Lwj/h;", "connectionPool", "Lrj/q;", "route", "v", "isMultiplexed", "<init>", "(Lwj/h;Lrj/q;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: wj.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13642f extends C14299f.AbstractC14303d implements InterfaceC12293h {

    /* renamed from: t */
    public static final C13643a f35081t = new C13643a(null);

    /* renamed from: c */
    private Socket f35082c;

    /* renamed from: d */
    private Socket f35083d;

    /* renamed from: e */
    private C12306n f35084e;

    /* renamed from: f */
    private EnumC12312p f35085f;

    /* renamed from: g */
    private C14299f f35086g;

    /* renamed from: h */
    private BufferedSource f35087h;

    /* renamed from: i */
    private BufferedSink f35088i;

    /* renamed from: j */
    private boolean f35089j;

    /* renamed from: k */
    private boolean f35090k;

    /* renamed from: l */
    private int f35091l;

    /* renamed from: m */
    private int f35092m;

    /* renamed from: n */
    private int f35093n;

    /* renamed from: o */
    private int f35094o;

    /* renamed from: p */
    private final List<Reference<C13638e>> f35095p;

    /* renamed from: q */
    private long f35096q;

    /* renamed from: r */
    private final C13648h f35097r;

    /* renamed from: s */
    private final C12314q f35098s;

    @Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m14357d2 = {"Lwj/f$a;", "", "", "IDLE_CONNECTION_HEALTHY_NS", "J", "", "MAX_TUNNEL_ATTEMPTS", "I", "", "NPE_THROW_WITH_NULL", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: wj.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C13643a {
        private C13643a() {
        }

        public /* synthetic */ C13643a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m14357d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, m14356k = 3, m14355mv = {1, 4, 0})
    /* renamed from: wj.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C13644b extends AbstractC9614s implements Function0<List<? extends Certificate>> {

        /* renamed from: j */
        final /* synthetic */ C12284e f35099j;

        /* renamed from: k */
        final /* synthetic */ C12306n f35100k;

        /* renamed from: l */
        final /* synthetic */ C12271a f35101l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13644b(C12284e c12284e, C12306n c12306n, C12271a c12271a) {
            super(0);
            this.f35099j = c12284e;
            this.f35100k = c12306n;
            this.f35101l = c12271a;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Certificate> invoke() {
            AbstractC6266c m5586d = this.f35099j.m5586d();
            C9612q.m13920e(m5586d);
            return m5586d.mo23130a(this.f35100k.m5515d(), this.f35101l.m5618l().m8899h());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m14357d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, m14356k = 3, m14355mv = {1, 4, 0})
    /* renamed from: wj.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C13645c extends AbstractC9614s implements Function0<List<? extends X509Certificate>> {
        C13645c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends X509Certificate> invoke() {
            int m14093t;
            C12306n c12306n = C13642f.this.f35084e;
            C9612q.m13920e(c12306n);
            List<Certificate> m5515d = c12306n.m5515d();
            m14093t = C9546k.m14093t(m5515d, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (Certificate certificate : m5515d) {
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m14357d2 = {"wj/f$d", "Lfk/d$d;", "", "close", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: wj.f$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C13646d extends C6489d.AbstractC6493d {

        /* renamed from: m */
        final /* synthetic */ C13634c f35103m;

        /* renamed from: n */
        final /* synthetic */ BufferedSource f35104n;

        /* renamed from: o */
        final /* synthetic */ BufferedSink f35105o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13646d(C13634c c13634c, BufferedSource bufferedSource, BufferedSink bufferedSink, boolean z, BufferedSource bufferedSource2, BufferedSink bufferedSink2) {
            super(z, bufferedSource2, bufferedSink2);
            this.f35103m = c13634c;
            this.f35104n = bufferedSource;
            this.f35105o = bufferedSink;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f35103m.m2037a(-1L, true, true, null);
        }
    }

    public C13642f(C13648h connectionPool, C12314q route) {
        C9612q.m13917h(connectionPool, "connectionPool");
        C9612q.m13917h(route, "route");
        this.f35097r = connectionPool;
        this.f35098s = route;
        this.f35094o = 1;
        this.f35095p = new ArrayList();
        this.f35096q = Long.MAX_VALUE;
    }

    /* renamed from: B */
    private final boolean m1969B(List<C12314q> list) {
        boolean z;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C12314q c12314q : list) {
            if (c12314q.m5506b().type() == Proxy.Type.DIRECT && this.f35098s.m5506b().type() == Proxy.Type.DIRECT && C9612q.m13922c(this.f35098s.m5504d(), c12314q.m5504d())) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    private final void m1965F(int i) {
        Socket socket = this.f35083d;
        C9612q.m13920e(socket);
        BufferedSource bufferedSource = this.f35087h;
        C9612q.m13920e(bufferedSource);
        BufferedSink bufferedSink = this.f35088i;
        C9612q.m13920e(bufferedSink);
        socket.setSoTimeout(0);
        C14299f m141a = new C14299f.C14301b(true, C13346e.f34428h).m129m(socket, this.f35098s.m5507a().m5618l().m8899h(), bufferedSource, bufferedSink).m131k(this).m130l(i).m141a();
        this.f35086g = m141a;
        this.f35094o = C14299f.f36745M.m128a().m5d();
        C14299f.m166U0(m141a, false, null, 3, null);
    }

    /* renamed from: G */
    private final boolean m1964G(HttpUrl httpUrl) {
        C12306n c12306n;
        if (C12562c.f32615h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9612q.m13918g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        HttpUrl m5618l = this.f35098s.m5507a().m5618l();
        if (httpUrl.m8894m() != m5618l.m8894m()) {
            return false;
        }
        if (C9612q.m13922c(httpUrl.m8899h(), m5618l.m8899h())) {
            return true;
        }
        if (this.f35090k || (c12306n = this.f35084e) == null) {
            return false;
        }
        C9612q.m13920e(c12306n);
        if (!m1960e(httpUrl, c12306n)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private final boolean m1960e(HttpUrl httpUrl, C12306n c12306n) {
        List<Certificate> m5515d = c12306n.m5515d();
        if (!m5515d.isEmpty()) {
            C6268d c6268d = C6268d.f17712a;
            String m8899h = httpUrl.m8899h();
            Certificate certificate = m5515d.get(0);
            if (certificate != null) {
                if (c6268d.m23124e(m8899h, (X509Certificate) certificate)) {
                    return true;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
        }
        return false;
    }

    /* renamed from: h */
    private final void m1957h(int i, int i2, Call call, AbstractC12302m abstractC12302m) {
        Socket socket;
        int i3;
        Proxy m5506b = this.f35098s.m5506b();
        C12271a m5507a = this.f35098s.m5507a();
        Proxy.Type type = m5506b.type();
        if (type == null || ((i3 = C13647g.f35106a[type.ordinal()]) != 1 && i3 != 2)) {
            socket = new Socket(m5506b);
        } else {
            socket = m5507a.m5620j().createSocket();
            C9612q.m13920e(socket);
        }
        this.f35082c = socket;
        abstractC12302m.m5535j(call, this.f35098s.m5504d(), m5506b);
        socket.setSoTimeout(i2);
        try {
            C2370k.f6491c.m33588g().mo33605f(socket, this.f35098s.m5504d(), i);
            try {
                this.f35087h = C6840m.m21829d(C6840m.m21820m(socket));
                this.f35088i = C6840m.m21830c(C6840m.m21824i(socket));
            } catch (NullPointerException e) {
                if (!C9612q.m13922c(e.getMessage(), "throw with null exception")) {
                    return;
                }
                throw new IOException(e);
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f35098s.m5504d());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: i */
    private final void m1956i(C13633b c13633b) {
        EnumC12312p enumC12312p;
        String m13776h;
        C12271a m5507a = this.f35098s.m5507a();
        SSLSocketFactory m5619k = m5507a.m5619k();
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            C9612q.m13920e(m5619k);
            Socket createSocket = m5619k.createSocket(this.f35082c, m5507a.m5618l().m8899h(), m5507a.m5618l().m8894m(), true);
            if (createSocket != null) {
                SSLSocket sSLSocket2 = (SSLSocket) createSocket;
                try {
                    C12295j m2040a = c13633b.m2040a(sSLSocket2);
                    if (m2040a.m5557h()) {
                        C2370k.f6491c.m33588g().mo33606e(sSLSocket2, m5507a.m5618l().m8899h(), m5507a.m5624f());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession sslSocketSession = sSLSocket2.getSession();
                    C12306n.C12307a c12307a = C12306n.f32077e;
                    C9612q.m13918g(sslSocketSession, "sslSocketSession");
                    C12306n m5513a = c12307a.m5513a(sslSocketSession);
                    HostnameVerifier m5625e = m5507a.m5625e();
                    C9612q.m13920e(m5625e);
                    if (!m5625e.verify(m5507a.m5618l().m8899h(), sslSocketSession)) {
                        List<Certificate> m5515d = m5513a.m5515d();
                        if (!m5515d.isEmpty()) {
                            Certificate certificate = m5515d.get(0);
                            if (certificate == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                            }
                            X509Certificate x509Certificate = (X509Certificate) certificate;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("\n              |Hostname ");
                            sb2.append(m5507a.m5618l().m8899h());
                            sb2.append(" not verified:\n              |    certificate: ");
                            sb2.append(C12284e.f31921d.m5583a(x509Certificate));
                            sb2.append("\n              |    DN: ");
                            Principal subjectDN = x509Certificate.getSubjectDN();
                            C9612q.m13918g(subjectDN, "cert.subjectDN");
                            sb2.append(subjectDN.getName());
                            sb2.append("\n              |    subjectAltNames: ");
                            sb2.append(C6268d.f17712a.m23128a(x509Certificate));
                            sb2.append("\n              ");
                            m13776h = C9644h.m13776h(sb2.toString(), null, 1, null);
                            throw new SSLPeerUnverifiedException(m13776h);
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + m5507a.m5618l().m8899h() + " not verified (no certificates)");
                    }
                    C12284e m5629a = m5507a.m5629a();
                    C9612q.m13920e(m5629a);
                    this.f35084e = new C12306n(m5513a.m5514e(), m5513a.m5518a(), m5513a.m5516c(), new C13644b(m5629a, m5513a, m5507a));
                    m5629a.m5588b(m5507a.m5618l().m8899h(), new C13645c());
                    if (m2040a.m5557h()) {
                        str = C2370k.f6491c.m33588g().mo33603h(sSLSocket2);
                    }
                    this.f35083d = sSLSocket2;
                    this.f35087h = C6840m.m21829d(C6840m.m21820m(sSLSocket2));
                    this.f35088i = C6840m.m21830c(C6840m.m21824i(sSLSocket2));
                    if (str != null) {
                        enumC12312p = EnumC12312p.f32093r.m5508a(str);
                    } else {
                        enumC12312p = EnumC12312p.HTTP_1_1;
                    }
                    this.f35085f = enumC12312p;
                    C2370k.f6491c.m33588g().mo33609b(sSLSocket2);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        C2370k.f6491c.m33588g().mo33609b(sSLSocket);
                    }
                    if (sSLSocket != null) {
                        C12562c.m4800k(sSLSocket);
                    }
                    throw th;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: j */
    private final void m1955j(int i, int i2, int i3, Call call, AbstractC12302m abstractC12302m) {
        Request m1953l = m1953l();
        HttpUrl m8734l = m1953l.m8734l();
        for (int i4 = 0; i4 < 21; i4++) {
            m1957h(i, i2, call, abstractC12302m);
            m1953l = m1954k(i2, i3, m1953l, m8734l);
            if (m1953l != null) {
                Socket socket = this.f35082c;
                if (socket != null) {
                    C12562c.m4800k(socket);
                }
                this.f35082c = null;
                this.f35088i = null;
                this.f35087h = null;
                abstractC12302m.m5537h(call, this.f35098s.m5504d(), this.f35098s.m5506b(), null);
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    private final Request m1954k(int i, int i2, Request request, HttpUrl httpUrl) {
        boolean m13754t;
        String str = "CONNECT " + C12562c.m4820P(httpUrl, true) + " HTTP/1.1";
        while (true) {
            BufferedSource bufferedSource = this.f35087h;
            C9612q.m13920e(bufferedSource);
            BufferedSink bufferedSink = this.f35088i;
            C9612q.m13920e(bufferedSink);
            C14035b c14035b = new C14035b(null, this, bufferedSource, bufferedSink);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bufferedSource.timeout().mo8536g(i, timeUnit);
            bufferedSink.timeout().mo8536g(i2, timeUnit);
            c14035b.m853A(request.m8740f(), str);
            c14035b.mo122a();
            Response.C11207a mo116g = c14035b.mo116g(false);
            C9612q.m13920e(mo116g);
            Response m8687c = mo116g.m8672r(request).m8687c();
            c14035b.m835z(m8687c);
            int m8695m = m8687c.m8695m();
            if (m8695m != 200) {
                if (m8695m == 407) {
                    Request mo3877a = this.f35098s.m5507a().m5622h().mo3877a(this.f35098s, m8687c);
                    if (mo3877a != null) {
                        m13754t = C9653o.m13754t("close", Response.m8690v(m8687c, "Connection", null, 2, null), true);
                        if (m13754t) {
                            return mo3877a;
                        }
                        request = mo3877a;
                    } else {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + m8687c.m8695m());
                }
            } else if (bufferedSource.mo8593d().mo8589g0() && bufferedSink.mo8604d().mo8589g0()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    /* renamed from: l */
    private final Request m1953l() {
        Request m8732b = new Request.Builder().m8721m(this.f35098s.m5507a().m5618l()).m8727g("CONNECT", null).m8729e("Host", C12562c.m4820P(this.f35098s.m5507a().m5618l(), true)).m8729e("Proxy-Connection", "Keep-Alive").m8729e("User-Agent", "okhttp/4.9.2").m8732b();
        Request mo3877a = this.f35098s.m5507a().m5622h().mo3877a(this.f35098s, new Response.C11207a().m8672r(m8732b).m8674p(EnumC12312p.HTTP_1_1).m8683g(407).m8677m("Preemptive Authenticate").m8688b(C12562c.f32610c).m8671s(-1L).m8673q(-1L).m8680j("Proxy-Authenticate", "OkHttp-Preemptive").m8687c());
        if (mo3877a != null) {
            return mo3877a;
        }
        return m8732b;
    }

    /* renamed from: m */
    private final void m1952m(C13633b c13633b, int i, Call call, AbstractC12302m abstractC12302m) {
        if (this.f35098s.m5507a().m5619k() == null) {
            List<EnumC12312p> m5624f = this.f35098s.m5507a().m5624f();
            EnumC12312p enumC12312p = EnumC12312p.H2_PRIOR_KNOWLEDGE;
            if (m5624f.contains(enumC12312p)) {
                this.f35083d = this.f35082c;
                this.f35085f = enumC12312p;
                m1965F(i);
                return;
            }
            this.f35083d = this.f35082c;
            this.f35085f = EnumC12312p.HTTP_1_1;
            return;
        }
        abstractC12302m.m5545C(call);
        m1956i(c13633b);
        abstractC12302m.m5546B(call, this.f35084e);
        if (this.f35085f == EnumC12312p.HTTP_2) {
            m1965F(i);
        }
    }

    /* renamed from: A */
    public C12314q m1970A() {
        return this.f35098s;
    }

    /* renamed from: C */
    public final void m1968C(long j) {
        this.f35096q = j;
    }

    /* renamed from: D */
    public final void m1967D(boolean z) {
        this.f35089j = z;
    }

    /* renamed from: E */
    public Socket m1966E() {
        Socket socket = this.f35083d;
        C9612q.m13920e(socket);
        return socket;
    }

    /* renamed from: H */
    public final synchronized void m1963H(C13638e call, IOException iOException) {
        C9612q.m13917h(call, "call");
        if (iOException instanceof C14338n) {
            if (((C14338n) iOException).f36921j == EnumC14291b.REFUSED_STREAM) {
                int i = this.f35093n + 1;
                this.f35093n = i;
                if (i > 1) {
                    this.f35089j = true;
                    this.f35091l++;
                }
            } else if (((C14338n) iOException).f36921j != EnumC14291b.CANCEL || !call.mo1988o()) {
                this.f35089j = true;
                this.f35091l++;
            }
        } else if (!m1943v() || (iOException instanceof C14290a)) {
            this.f35089j = true;
            if (this.f35092m == 0) {
                if (iOException != null) {
                    m1958g(call.m1990m(), this.f35098s, iOException);
                }
                this.f35091l++;
            }
        }
    }

    @Override // p471zj.C14299f.AbstractC14303d
    /* renamed from: a */
    public synchronized void mo127a(C14299f connection, C14336m settings) {
        C9612q.m13917h(connection, "connection");
        C9612q.m13917h(settings, "settings");
        this.f35094o = settings.m5d();
    }

    @Override // p471zj.C14299f.AbstractC14303d
    /* renamed from: b */
    public void mo126b(C14324i stream) {
        C9612q.m13917h(stream, "stream");
        stream.m69d(EnumC14291b.REFUSED_STREAM, null);
    }

    /* renamed from: d */
    public final void m1961d() {
        Socket socket = this.f35082c;
        if (socket != null) {
            C12562c.m4800k(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2 A[Catch: IOException -> 0x00fd, TRY_LEAVE, TryCatch #1 {IOException -> 0x00fd, blocks: (B:21:0x009a, B:23:0x00a2), top: B:68:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c A[EDGE_INSN: B:72:0x014c->B:61:0x014c ?: BREAK  ] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1959f(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, p328rj.AbstractC12302m r23) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p410wj.C13642f.m1959f(int, int, int, int, boolean, okhttp3.Call, rj.m):void");
    }

    /* renamed from: g */
    public final void m1958g(OkHttpClient client, C12314q failedRoute, IOException failure) {
        C9612q.m13917h(client, "client");
        C9612q.m13917h(failedRoute, "failedRoute");
        C9612q.m13917h(failure, "failure");
        if (failedRoute.m5506b().type() != Proxy.Type.DIRECT) {
            C12271a m5507a = failedRoute.m5507a();
            m5507a.m5621i().connectFailed(m5507a.m5618l().m8889r(), failedRoute.m5506b().address(), failure);
        }
        client.m8793w().m1932b(failedRoute);
    }

    /* renamed from: n */
    public final List<Reference<C13638e>> m1951n() {
        return this.f35095p;
    }

    /* renamed from: o */
    public final long m1950o() {
        return this.f35096q;
    }

    /* renamed from: p */
    public final boolean m1949p() {
        return this.f35089j;
    }

    /* renamed from: q */
    public final int m1948q() {
        return this.f35091l;
    }

    /* renamed from: r */
    public C12306n m1947r() {
        return this.f35084e;
    }

    /* renamed from: s */
    public final synchronized void m1946s() {
        this.f35092m++;
    }

    /* renamed from: t */
    public final boolean m1945t(C12271a address, List<C12314q> list) {
        C9612q.m13917h(address, "address");
        if (C12562c.f32615h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9612q.m13918g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        } else if (this.f35095p.size() >= this.f35094o || this.f35089j || !this.f35098s.m5507a().m5626d(address)) {
            return false;
        } else {
            if (C9612q.m13922c(address.m5618l().m8899h(), m1970A().m5507a().m5618l().m8899h())) {
                return true;
            }
            if (this.f35086g == null || list == null || !m1969B(list) || address.m5625e() != C6268d.f17712a || !m1964G(address.m5618l())) {
                return false;
            }
            try {
                C12284e m5629a = address.m5629a();
                C9612q.m13920e(m5629a);
                String m8899h = address.m5618l().m8899h();
                C12306n m1947r = m1947r();
                C9612q.m13920e(m1947r);
                m5629a.m5589a(m8899h, m1947r.m5515d());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f35098s.m5507a().m5618l().m8899h());
        sb2.append(':');
        sb2.append(this.f35098s.m5507a().m5618l().m8894m());
        sb2.append(',');
        sb2.append(" proxy=");
        sb2.append(this.f35098s.m5506b());
        sb2.append(" hostAddress=");
        sb2.append(this.f35098s.m5504d());
        sb2.append(" cipherSuite=");
        C12306n c12306n = this.f35084e;
        if (c12306n == null || (obj = c12306n.m5518a()) == null) {
            obj = ViewProps.NONE;
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f35085f);
        sb2.append('}');
        return sb2.toString();
    }

    /* renamed from: u */
    public final boolean m1944u(boolean z) {
        long j;
        if (C12562c.f32615h && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9612q.m13918g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        long nanoTime = System.nanoTime();
        Socket socket = this.f35082c;
        C9612q.m13920e(socket);
        Socket socket2 = this.f35083d;
        C9612q.m13920e(socket2);
        BufferedSource bufferedSource = this.f35087h;
        C9612q.m13920e(bufferedSource);
        if (!socket.isClosed() && !socket2.isClosed() && !socket2.isInputShutdown() && !socket2.isOutputShutdown()) {
            C14299f c14299f = this.f35086g;
            if (c14299f != null) {
                return c14299f.m186G0(nanoTime);
            }
            synchronized (this) {
                j = nanoTime - this.f35096q;
            }
            if (j >= 10000000000L && z) {
                return C12562c.m4832D(socket2, bufferedSource);
            }
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final boolean m1943v() {
        return this.f35086g != null;
    }

    /* renamed from: w */
    public final InterfaceC13837d m1942w(OkHttpClient client, C13840g chain) {
        C9612q.m13917h(client, "client");
        C9612q.m13917h(chain, "chain");
        Socket socket = this.f35083d;
        C9612q.m13920e(socket);
        BufferedSource bufferedSource = this.f35087h;
        C9612q.m13920e(bufferedSource);
        BufferedSink bufferedSink = this.f35088i;
        C9612q.m13920e(bufferedSink);
        C14299f c14299f = this.f35086g;
        if (c14299f != null) {
            return new C14318g(client, this, chain, c14299f);
        }
        socket.setSoTimeout(chain.m1413k());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bufferedSource.timeout().mo8536g(chain.m1416h(), timeUnit);
        bufferedSink.timeout().mo8536g(chain.m1414j(), timeUnit);
        return new C14035b(client, this, bufferedSource, bufferedSink);
    }

    /* renamed from: x */
    public final C6489d.AbstractC6493d m1941x(C13634c exchange) {
        C9612q.m13917h(exchange, "exchange");
        Socket socket = this.f35083d;
        C9612q.m13920e(socket);
        BufferedSource bufferedSource = this.f35087h;
        C9612q.m13920e(bufferedSource);
        BufferedSink bufferedSink = this.f35088i;
        C9612q.m13920e(bufferedSink);
        socket.setSoTimeout(0);
        m1939z();
        return new C13646d(exchange, bufferedSource, bufferedSink, true, bufferedSource, bufferedSink);
    }

    /* renamed from: y */
    public final synchronized void m1940y() {
        this.f35090k = true;
    }

    /* renamed from: z */
    public final synchronized void m1939z() {
        this.f35089j = true;
    }
}
