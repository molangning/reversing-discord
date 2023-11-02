package p410wj;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import okhttp3.Call;
import okhttp3.Dispatcher;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.C11217a;
import p031bk.C2370k;
import p328rj.AbstractC12302m;
import p328rj.C12271a;
import p328rj.C12284e;
import p328rj.InterfaceC12283d;
import p431xj.C13840g;
import pf.C11560f;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000\u009b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\f*\u0001@\u0018\u00002\u00020\u0001:\u0002\u0012lB\u001f\u0012\u0006\u0010d\u001a\u00020a\u0012\u0006\u0010g\u001a\u00020\u0011\u0012\u0006\u0010i\u001a\u00020\u0014¢\u0006\u0004\bj\u0010kJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u000f\u0010\u001b\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0014J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b#\u0010$J\u000e\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%J;\u0010+\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00028\u0000H\u0000¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b-\u0010\u0007J\u0011\u0010/\u001a\u0004\u0018\u00010.H\u0000¢\u0006\u0004\b/\u00100J\u0006\u00101\u001a\u00020\u0002J\u0017\u00103\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0014H\u0000¢\u0006\u0004\b3\u00104J\u0006\u00105\u001a\u00020\u0014J\u000f\u00106\u001a\u00020\u000eH\u0000¢\u0006\u0004\b6\u00107R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00109R\u001a\u0010?\u001a\u00020;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010LR(\u0010&\u001a\u0004\u0018\u00010%2\b\u0010N\u001a\u0004\u0018\u00010%8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b=\u0010O\u001a\u0004\bH\u0010PR\u0016\u0010S\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR(\u0010W\u001a\u0004\u0018\u00010\"2\b\u0010N\u001a\u0004\u0018\u00010\"8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bT\u0010VR\u0016\u0010Y\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010RR\u0016\u0010Z\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010RR\u0016\u0010[\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010RR\u0016\u0010\\\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010RR\u0018\u0010(\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010UR$\u0010`\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010O\u001a\u0004\b]\u0010P\"\u0004\b^\u0010_R\u0017\u0010d\u001a\u00020a8\u0006¢\u0006\f\n\u0004\b/\u0010b\u001a\u0004\bD\u0010cR\u0017\u0010g\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b5\u0010e\u001a\u0004\bX\u0010fR\u0017\u0010i\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b^\u0010R\u001a\u0004\bQ\u0010h¨\u0006m"}, m14357d2 = {"Lwj/e;", "Lokhttp3/Call;", "", "f", "Ljava/io/IOException;", "E", "e", "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "C", "Lokhttp3/HttpUrl;", "url", "Lrj/a;", "j", "", "D", "g", "Lokhttp3/Request;", "a", "cancel", "", "o", "Lokhttp3/Response;", "execute", "Lrj/d;", "responseCallback", "i", "t", "()Lokhttp3/Response;", "request", "newExchangeFinder", "k", "Lxj/g;", "chain", "Lwj/c;", "u", "(Lxj/g;)Lwj/c;", "Lwj/f;", "connection", "d", "exchange", "requestDone", "responseDone", "v", "(Lwj/c;ZZLjava/io/IOException;)Ljava/io/IOException;", "w", "Ljava/net/Socket;", "y", "()Ljava/net/Socket;", "B", "closeExchange", "l", "(Z)V", "z", "x", "()Ljava/lang/String;", "Lwj/h;", "Lwj/h;", "connectionPool", "Lrj/m;", "Lrj/m;", "p", "()Lrj/m;", "eventListener", "wj/e$c", "Lwj/e$c;", "timeout", "Ljava/util/concurrent/atomic/AtomicBoolean;", "m", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "", "n", "Ljava/lang/Object;", "callStackTrace", "Lwj/d;", "Lwj/d;", "exchangeFinder", "<set-?>", "Lwj/f;", "()Lwj/f;", "q", "Z", "timeoutEarlyExit", "r", "Lwj/c;", "()Lwj/c;", "interceptorScopedExchange", "s", "requestBodyOpen", "responseBodyOpen", "expectMoreExchanges", "canceled", "getConnectionToCancel", "A", "(Lwj/f;)V", "connectionToCancel", "Lokhttp3/OkHttpClient;", "Lokhttp3/OkHttpClient;", "()Lokhttp3/OkHttpClient;", "client", "Lokhttp3/Request;", "()Lokhttp3/Request;", "originalRequest", "()Z", "forWebSocket", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "b", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: wj.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13638e implements Call {

    /* renamed from: A */
    private final boolean f35058A;

    /* renamed from: j */
    private final C13648h f35059j;

    /* renamed from: k */
    private final AbstractC12302m f35060k;

    /* renamed from: l */
    private final C13641c f35061l;

    /* renamed from: m */
    private final AtomicBoolean f35062m;

    /* renamed from: n */
    private Object f35063n;

    /* renamed from: o */
    private C13637d f35064o;

    /* renamed from: p */
    private C13642f f35065p;

    /* renamed from: q */
    private boolean f35066q;

    /* renamed from: r */
    private C13634c f35067r;

    /* renamed from: s */
    private boolean f35068s;

    /* renamed from: t */
    private boolean f35069t;

    /* renamed from: u */
    private boolean f35070u;

    /* renamed from: v */
    private volatile boolean f35071v;

    /* renamed from: w */
    private volatile C13634c f35072w;

    /* renamed from: x */
    private volatile C13642f f35073x;

    /* renamed from: y */
    private final OkHttpClient f35074y;

    /* renamed from: z */
    private final Request f35075z;

    @Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0004H\u0016R$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m14357d2 = {"Lwj/e$a;", "Ljava/lang/Runnable;", "Lwj/e;", "other", "", "e", "Ljava/util/concurrent/ExecutorService;", "executorService", "a", "run", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "j", "Ljava/util/concurrent/atomic/AtomicInteger;", "c", "()Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "Lrj/d;", "k", "Lrj/d;", "responseCallback", "", "d", "()Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_HOST, "b", "()Lwj/e;", "call", "<init>", "(Lwj/e;Lrj/d;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: wj.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public final class RunnableC13639a implements Runnable {

        /* renamed from: j */
        private volatile AtomicInteger f35076j;

        /* renamed from: k */
        private final InterfaceC12283d f35077k;

        /* renamed from: l */
        final /* synthetic */ C13638e f35078l;

        public RunnableC13639a(C13638e c13638e, InterfaceC12283d responseCallback) {
            C9612q.m13917h(responseCallback, "responseCallback");
            this.f35078l = c13638e;
            this.f35077k = responseCallback;
            this.f35076j = new AtomicInteger(0);
        }

        /* renamed from: a */
        public final void m1976a(ExecutorService executorService) {
            C9612q.m13917h(executorService, "executorService");
            Dispatcher m8798r = this.f35078l.m1990m().m8798r();
            if (C12562c.f32615h && Thread.holdsLock(m8798r)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C9612q.m13918g(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(m8798r);
                throw new AssertionError(sb2.toString());
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    this.f35078l.m1980w(interruptedIOException);
                    this.f35077k.onFailure(this.f35078l, interruptedIOException);
                    this.f35078l.m1990m().m8798r().m8938g(this);
                }
            } catch (Throwable th2) {
                this.f35078l.m1990m().m8798r().m8938g(this);
                throw th2;
            }
        }

        /* renamed from: b */
        public final C13638e m1975b() {
            return this.f35078l;
        }

        /* renamed from: c */
        public final AtomicInteger m1974c() {
            return this.f35076j;
        }

        /* renamed from: d */
        public final String m1973d() {
            return this.f35078l.m1984s().m8734l().m8899h();
        }

        /* renamed from: e */
        public final void m1972e(RunnableC13639a other) {
            C9612q.m13917h(other, "other");
            this.f35076j = other.f35076j;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            Throwable th2;
            IOException e;
            Dispatcher m8798r;
            Thread currentThread = Thread.currentThread();
            C9612q.m13918g(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName("OkHttp " + this.f35078l.m1979x());
            try {
                this.f35078l.f35061l.m8526r();
                try {
                    z = true;
                    try {
                        this.f35077k.onResponse(this.f35078l, this.f35078l.m1983t());
                        m8798r = this.f35078l.m1990m().m8798r();
                    } catch (IOException e2) {
                        e = e2;
                        if (z) {
                            C2370k.f6491c.m33588g().m33600k("Callback failure for " + this.f35078l.m2002D(), 4, e);
                        } else {
                            this.f35077k.onFailure(this.f35078l, e);
                        }
                        m8798r = this.f35078l.m1990m().m8798r();
                        m8798r.m8938g(this);
                    } catch (Throwable th3) {
                        th2 = th3;
                        this.f35078l.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th2);
                            C11560f.m7637a(iOException, th2);
                            this.f35077k.onFailure(this.f35078l, iOException);
                        }
                        throw th2;
                    }
                } catch (IOException e3) {
                    z = false;
                    e = e3;
                } catch (Throwable th4) {
                    z = false;
                    th2 = th4;
                }
                m8798r.m8938g(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u000b"}, m14357d2 = {"Lwj/e$b;", "Ljava/lang/ref/WeakReference;", "Lwj/e;", "", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "callStackTrace", "referent", "<init>", "(Lwj/e;Ljava/lang/Object;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: wj.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C13640b extends WeakReference<C13638e> {

        /* renamed from: a */
        private final Object f35079a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13640b(C13638e referent, Object obj) {
            super(referent);
            C9612q.m13917h(referent, "referent");
            this.f35079a = obj;
        }

        /* renamed from: a */
        public final Object m1971a() {
            return this.f35079a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, m14357d2 = {"wj/e$c", "Lokio/a;", "", "x", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: wj.e$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C13641c extends C11217a {
        C13641c() {
            C13638e.this = r1;
        }

        @Override // okio.C11217a
        /* renamed from: x */
        protected void mo35x() {
            C13638e.this.cancel();
        }
    }

    public C13638e(OkHttpClient client, Request originalRequest, boolean z) {
        C9612q.m13917h(client, "client");
        C9612q.m13917h(originalRequest, "originalRequest");
        this.f35074y = client;
        this.f35075z = originalRequest;
        this.f35058A = z;
        this.f35059j = client.m8801n().m5565a();
        this.f35060k = client.m8796t().mo4784a(this);
        C13641c c13641c = new C13641c();
        c13641c.mo8536g(client.m8805j(), TimeUnit.MILLISECONDS);
        Unit unit = Unit.f25302a;
        this.f35061l = c13641c;
        this.f35062m = new AtomicBoolean();
        this.f35070u = true;
    }

    /* renamed from: C */
    private final <E extends IOException> E m2003C(E e) {
        if (this.f35066q) {
            return e;
        }
        if (!this.f35061l.m8525s()) {
            return e;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (e != null) {
            interruptedIOException.initCause(e);
        }
        return interruptedIOException;
    }

    /* renamed from: D */
    public final String m2002D() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (mo1988o()) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f35058A) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb2.append(str2);
        sb2.append(" to ");
        sb2.append(m1979x());
        return sb2.toString();
    }

    /* renamed from: e */
    private final <E extends IOException> E m1997e(E e) {
        Socket m1978y;
        boolean z;
        boolean z2 = C12562c.f32615h;
        if (z2 && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9612q.m13918g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        C13642f c13642f = this.f35065p;
        if (c13642f != null) {
            if (z2 && Thread.holdsLock(c13642f)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Thread ");
                Thread currentThread2 = Thread.currentThread();
                C9612q.m13918g(currentThread2, "Thread.currentThread()");
                sb3.append(currentThread2.getName());
                sb3.append(" MUST NOT hold lock on ");
                sb3.append(c13642f);
                throw new AssertionError(sb3.toString());
            }
            synchronized (c13642f) {
                m1978y = m1978y();
            }
            if (this.f35065p == null) {
                if (m1978y != null) {
                    C12562c.m4800k(m1978y);
                }
                this.f35060k.m5533l(this, c13642f);
            } else {
                if (m1978y == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        E e2 = (E) m2003C(e);
        if (e != null) {
            AbstractC12302m abstractC12302m = this.f35060k;
            C9612q.m13920e(e2);
            abstractC12302m.m5540e(this, e2);
        } else {
            this.f35060k.m5541d(this);
        }
        return e2;
    }

    /* renamed from: f */
    private final void m1996f() {
        this.f35063n = C2370k.f6491c.m33588g().mo33602i("response.body().close()");
        this.f35060k.m5539f(this);
    }

    /* renamed from: j */
    private final C12271a m1993j(HttpUrl httpUrl) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C12284e c12284e;
        if (httpUrl.m8898i()) {
            sSLSocketFactory = this.f35074y.m8815L();
            hostnameVerifier = this.f35074y.m8792x();
            c12284e = this.f35074y.m8803l();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            c12284e = null;
        }
        return new C12271a(httpUrl.m8899h(), httpUrl.m8894m(), this.f35074y.m8797s(), this.f35074y.m8816K(), sSLSocketFactory, hostnameVerifier, c12284e, this.f35074y.m8820G(), this.f35074y.m8821F(), this.f35074y.m8822E(), this.f35074y.m8800p(), this.f35074y.m8819H());
    }

    /* renamed from: A */
    public final void m2005A(C13642f c13642f) {
        this.f35073x = c13642f;
    }

    /* renamed from: B */
    public final void m2004B() {
        if (!this.f35066q) {
            this.f35066q = true;
            this.f35061l.m8525s();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // okhttp3.Call
    /* renamed from: a */
    public Request mo2001a() {
        return this.f35075z;
    }

    @Override // okhttp3.Call
    public void cancel() {
        if (this.f35071v) {
            return;
        }
        this.f35071v = true;
        C13634c c13634c = this.f35072w;
        if (c13634c != null) {
            c13634c.m2036b();
        }
        C13642f c13642f = this.f35073x;
        if (c13642f != null) {
            c13642f.m1961d();
        }
        this.f35060k.m5538g(this);
    }

    /* renamed from: d */
    public final void m1998d(C13642f connection) {
        boolean z;
        C9612q.m13917h(connection, "connection");
        if (C12562c.f32615h && !Thread.holdsLock(connection)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9612q.m13918g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(connection);
            throw new AssertionError(sb2.toString());
        }
        if (this.f35065p == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f35065p = connection;
            connection.m1951n().add(new C13640b(this, this.f35063n));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // okhttp3.Call
    public Response execute() {
        if (this.f35062m.compareAndSet(false, true)) {
            this.f35061l.m8526r();
            m1996f();
            try {
                this.f35074y.m8798r().m8942c(this);
                return m1983t();
            } finally {
                this.f35074y.m8798r().m8937h(this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    /* renamed from: g */
    public C13638e clone() {
        return new C13638e(this.f35074y, this.f35075z, this.f35058A);
    }

    @Override // okhttp3.Call
    /* renamed from: i */
    public void mo1994i(InterfaceC12283d responseCallback) {
        C9612q.m13917h(responseCallback, "responseCallback");
        if (this.f35062m.compareAndSet(false, true)) {
            m1996f();
            this.f35074y.m8798r().m8943b(new RunnableC13639a(this, responseCallback));
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    /* renamed from: k */
    public final void m1992k(Request request, boolean z) {
        boolean z2;
        C9612q.m13917h(request, "request");
        if (this.f35067r == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            synchronized (this) {
                if (!this.f35069t) {
                    if (!this.f35068s) {
                        Unit unit = Unit.f25302a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
            }
            if (z) {
                this.f35064o = new C13637d(this.f35059j, m1993j(request.m8734l()), this, this.f35060k);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: l */
    public final void m1991l(boolean z) {
        C13634c c13634c;
        synchronized (this) {
            if (this.f35070u) {
                Unit unit = Unit.f25302a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (c13634c = this.f35072w) != null) {
            c13634c.m2034d();
        }
        this.f35067r = null;
    }

    /* renamed from: m */
    public final OkHttpClient m1990m() {
        return this.f35074y;
    }

    /* renamed from: n */
    public final C13642f m1989n() {
        return this.f35065p;
    }

    @Override // okhttp3.Call
    /* renamed from: o */
    public boolean mo1988o() {
        return this.f35071v;
    }

    /* renamed from: p */
    public final AbstractC12302m m1987p() {
        return this.f35060k;
    }

    /* renamed from: q */
    public final boolean m1986q() {
        return this.f35058A;
    }

    /* renamed from: r */
    public final C13634c m1985r() {
        return this.f35067r;
    }

    /* renamed from: s */
    public final Request m1984s() {
        return this.f35075z;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response m1983t() {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.OkHttpClient r0 = r11.f35074y
            java.util.List r0 = r0.m8791y()
            kotlin.collections.C9543h.m14115y(r2, r0)
            xj.j r0 = new xj.j
            okhttp3.OkHttpClient r1 = r11.f35074y
            r0.<init>(r1)
            r2.add(r0)
            xj.a r0 = new xj.a
            okhttp3.OkHttpClient r1 = r11.f35074y
            okhttp3.CookieJar r1 = r1.m8799q()
            r0.<init>(r1)
            r2.add(r0)
            uj.a r0 = new uj.a
            okhttp3.OkHttpClient r1 = r11.f35074y
            rj.c r1 = r1.m8806g()
            r0.<init>(r1)
            r2.add(r0)
            wj.a r0 = p410wj.C13632a.f35026a
            r2.add(r0)
            boolean r0 = r11.f35058A
            if (r0 != 0) goto L46
            okhttp3.OkHttpClient r0 = r11.f35074y
            java.util.List r0 = r0.m8826A()
            kotlin.collections.C9543h.m14115y(r2, r0)
        L46:
            xj.b r0 = new xj.b
            boolean r1 = r11.f35058A
            r0.<init>(r1)
            r2.add(r0)
            xj.g r9 = new xj.g
            r3 = 0
            r4 = 0
            okhttp3.Request r5 = r11.f35075z
            okhttp3.OkHttpClient r0 = r11.f35074y
            int r6 = r0.m8802m()
            okhttp3.OkHttpClient r0 = r11.f35074y
            int r7 = r0.m8818I()
            okhttp3.OkHttpClient r0 = r11.f35074y
            int r8 = r0.m8813N()
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            okhttp3.Request r2 = r11.f35075z     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            okhttp3.Response r2 = r9.mo1422b(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            boolean r3 = r11.mo1988o()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            if (r3 != 0) goto L7f
            r11.m1980w(r0)
            return r2
        L7f:
            sj.C12562c.m4801j(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            throw r2     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
        L8a:
            r2 = move-exception
            goto La1
        L8c:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.m1980w(r1)     // Catch: java.lang.Throwable -> L9d
            if (r1 != 0) goto L9c
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L9d
            throw r1     // Catch: java.lang.Throwable -> L9d
        L9c:
            throw r1     // Catch: java.lang.Throwable -> L9d
        L9d:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
        La1:
            if (r1 != 0) goto La6
            r11.m1980w(r0)
        La6:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p410wj.C13638e.m1983t():okhttp3.Response");
    }

    /* renamed from: u */
    public final C13634c m1982u(C13840g chain) {
        C9612q.m13917h(chain, "chain");
        synchronized (this) {
            if (this.f35070u) {
                if (!this.f35069t) {
                    if (!this.f35068s) {
                        Unit unit = Unit.f25302a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        C13637d c13637d = this.f35064o;
        C9612q.m13920e(c13637d);
        C13634c c13634c = new C13634c(this, this.f35060k, c13637d, c13637d.m2013a(this.f35074y, chain));
        this.f35067r = c13634c;
        this.f35072w = c13634c;
        synchronized (this) {
            this.f35068s = true;
            this.f35069t = true;
        }
        if (!this.f35071v) {
            return c13634c;
        }
        throw new IOException("Canceled");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0023 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:57:0x0014, B:66:0x0023, B:68:0x0027, B:69:0x0029, B:71:0x002d, B:76:0x0036, B:78:0x003a, B:84:0x0043, B:63:0x001d), top: B:96:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0027 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:57:0x0014, B:66:0x0023, B:68:0x0027, B:69:0x0029, B:71:0x002d, B:76:0x0036, B:78:0x003a, B:84:0x0043, B:63:0x001d), top: B:96:0x0014 }] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E extends java.io.IOException> E m1981v(p410wj.C13634c r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.C9612q.m13917h(r3, r0)
            wj.c r0 = r2.f35072w
            boolean r3 = kotlin.jvm.internal.C9612q.m13922c(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L10
            return r6
        L10:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L1b
            boolean r1 = r2.f35068s     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L21
            goto L1b
        L19:
            r3 = move-exception
            goto L5a
        L1b:
            if (r5 == 0) goto L42
            boolean r1 = r2.f35069t     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L42
        L21:
            if (r4 == 0) goto L25
            r2.f35068s = r3     // Catch: java.lang.Throwable -> L19
        L25:
            if (r5 == 0) goto L29
            r2.f35069t = r3     // Catch: java.lang.Throwable -> L19
        L29:
            boolean r4 = r2.f35068s     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L33
            boolean r5 = r2.f35069t     // Catch: java.lang.Throwable -> L19
            if (r5 != 0) goto L33
            r5 = r0
            goto L34
        L33:
            r5 = r3
        L34:
            if (r4 != 0) goto L3f
            boolean r4 = r2.f35069t     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L3f
            boolean r4 = r2.f35070u     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L3f
            goto L40
        L3f:
            r0 = r3
        L40:
            r3 = r5
            goto L43
        L42:
            r0 = r3
        L43:
            kotlin.Unit r4 = kotlin.Unit.f25302a     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            if (r3 == 0) goto L52
            r3 = 0
            r2.f35072w = r3
            wj.f r3 = r2.f35065p
            if (r3 == 0) goto L52
            r3.m1946s()
        L52:
            if (r0 == 0) goto L59
            java.io.IOException r3 = r2.m1997e(r6)
            return r3
        L59:
            return r6
        L5a:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p410wj.C13638e.m1981v(wj.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    /* renamed from: w */
    public final IOException m1980w(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f35070u) {
                this.f35070u = false;
                if (!this.f35068s && !this.f35069t) {
                    z = true;
                }
            }
            Unit unit = Unit.f25302a;
        }
        if (z) {
            return m1997e(iOException);
        }
        return iOException;
    }

    /* renamed from: x */
    public final String m1979x() {
        return this.f35075z.m8734l().m8892o();
    }

    /* renamed from: y */
    public final Socket m1978y() {
        C13642f c13642f = this.f35065p;
        C9612q.m13920e(c13642f);
        if (C12562c.f32615h && !Thread.holdsLock(c13642f)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9612q.m13918g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(c13642f);
            throw new AssertionError(sb2.toString());
        }
        List<Reference<C13638e>> m1951n = c13642f.m1951n();
        Iterator<Reference<C13638e>> it = m1951n.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (C9612q.m13922c(it.next().get(), this)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            z = true;
        }
        if (z) {
            m1951n.remove(i);
            this.f35065p = null;
            if (m1951n.isEmpty()) {
                c13642f.m1968C(System.nanoTime());
                if (this.f35059j.m1936c(c13642f)) {
                    return c13642f.m1966E();
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: z */
    public final boolean m1977z() {
        C13637d c13637d = this.f35064o;
        C9612q.m13920e(c13637d);
        return c13637d.m2009e();
    }
}