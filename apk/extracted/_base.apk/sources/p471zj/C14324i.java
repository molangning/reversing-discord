package p471zj;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import okio.Buffer;
import okio.BufferedSource;
import okio.C11217a;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 @2\u00020\u0001:\u0004 \u001c!\u0011B3\b\u0000\u0012\u0006\u0010V\u001a\u00020\u0015\u0012\u0006\u0010Z\u001a\u00020W\u0012\u0006\u0010`\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\u0004\ba\u0010bJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015J\u0016\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u001c\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001eJ\u000f\u0010!\u001a\u00020\u0010H\u0000¢\u0006\u0004\b!\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\"\u0010\u001dR*\u0010)\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010,\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R*\u0010/\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010$\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R*\u00102\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010$\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\b038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00106R\u001e\u0010\u0014\u001a\u000608R\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001e\u0010B\u001a\u00060=R\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001e\u0010H\u001a\u00060CR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001e\u0010K\u001a\u00060CR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010E\u001a\u0004\bJ\u0010GR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010L\u001a\u0004\b>\u0010M\"\u0004\bN\u0010OR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010P\u001a\u0004\bD\u0010Q\"\u0004\bR\u0010SR\u0017\u0010V\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bF\u0010T\u001a\u0004\bI\u0010UR\u0017\u0010Z\u001a\u00020W8\u0006¢\u0006\f\n\u0004\b\u000e\u0010X\u001a\u0004\b9\u0010YR\u0011\u0010]\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0011\u0010_\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b^\u0010\\¨\u0006c"}, m14357d2 = {"Lzj/i;", "", "Lzj/b;", "errorCode", "Ljava/io/IOException;", "errorException", "", "e", "Lokhttp3/Headers;", "C", "Lokio/Timeout;", "v", "E", "Lokio/Sink;", "n", "rstStatusCode", "", "d", "f", "Lokio/BufferedSource;", "source", "", "length", "w", "headers", "inFinished", "x", "y", "b", "()V", "", "delta", "a", "c", "D", "<set-?>", "J", "l", "()J", "A", "(J)V", "readBytesTotal", "k", "z", "readBytesAcknowledged", "r", "B", "writeBytesTotal", "q", "setWriteBytesMaximum$okhttp", "writeBytesMaximum", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "headersQueue", "Z", "hasResponseHeaders", "Lzj/i$c;", "g", "Lzj/i$c;", "p", "()Lzj/i$c;", "Lzj/i$b;", "h", "Lzj/i$b;", "o", "()Lzj/i$b;", "sink", "Lzj/i$d;", "i", "Lzj/i$d;", "m", "()Lzj/i$d;", "readTimeout", "j", "s", "writeTimeout", "Lzj/b;", "()Lzj/b;", "setErrorCode$okhttp", "(Lzj/b;)V", "Ljava/io/IOException;", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "I", "()I", "id", "Lzj/f;", "Lzj/f;", "()Lzj/f;", "connection", "u", "()Z", "isOpen", "t", "isLocallyInitiated", "outFinished", "<init>", "(ILzj/f;ZZLokhttp3/Headers;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: zj.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C14324i {

    /* renamed from: o */
    public static final C14325a f36873o = new C14325a(null);

    /* renamed from: a */
    private long f36874a;

    /* renamed from: b */
    private long f36875b;

    /* renamed from: c */
    private long f36876c;

    /* renamed from: d */
    private long f36877d;

    /* renamed from: e */
    private final ArrayDeque<Headers> f36878e;

    /* renamed from: f */
    private boolean f36879f;

    /* renamed from: g */
    private final C14327c f36880g;

    /* renamed from: h */
    private final C14326b f36881h;

    /* renamed from: i */
    private final C14328d f36882i;

    /* renamed from: j */
    private final C14328d f36883j;

    /* renamed from: k */
    private EnumC14291b f36884k;

    /* renamed from: l */
    private IOException f36885l;

    /* renamed from: m */
    private final int f36886m;

    /* renamed from: n */
    private final C14299f f36887n;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lzj/i$a;", "", "", "EMIT_BUFFER_SIZE", "J", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C14325a {
        private C14325a() {
        }

        public /* synthetic */ C14325a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001f¨\u0006'"}, m14357d2 = {"Lzj/i$b;", "Lokio/Sink;", "", "outFinishedOnLastFrame", "", "a", "Lokio/Buffer;", "source", "", "byteCount", "L", "flush", "Lokio/Timeout;", "timeout", "close", "j", "Lokio/Buffer;", "sendBuffer", "Lokhttp3/Headers;", "k", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "trailers", "l", "Z", "h", "()Z", "setClosed", "(Z)V", "closed", "m", "i", "setFinished", "finished", "<init>", "(Lzj/i;Z)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public final class C14326b implements Sink {

        /* renamed from: j */
        private final Buffer f36888j = new Buffer();

        /* renamed from: k */
        private Headers f36889k;

        /* renamed from: l */
        private boolean f36890l;

        /* renamed from: m */
        private boolean f36891m;

        public C14326b(boolean z) {
            this.f36891m = z;
        }

        /* renamed from: a */
        private final void m45a(boolean z) {
            long min;
            boolean z2;
            boolean z3;
            synchronized (C14324i.this) {
                C14324i.this.m54s().m8526r();
                while (C14324i.this.m55r() >= C14324i.this.m56q() && !this.f36891m && !this.f36890l && C14324i.this.m65h() == null) {
                    C14324i.this.m74D();
                }
                C14324i.this.m54s().m34y();
                C14324i.this.m70c();
                min = Math.min(C14324i.this.m56q() - C14324i.this.m55r(), this.f36888j.size());
                C14324i c14324i = C14324i.this;
                c14324i.m76B(c14324i.m55r() + min);
                if (z && min == this.f36888j.size() && C14324i.this.m65h() == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2;
                Unit unit = Unit.f25302a;
            }
            C14324i.this.m54s().m8526r();
            try {
                C14324i.this.m66g().m163W0(C14324i.this.m63j(), z3, this.f36888j, min);
            } finally {
                C14324i.this.m54s().m34y();
            }
        }

        @Override // okio.Sink
        /* renamed from: L */
        public void mo46L(Buffer source, long j) {
            C9612q.m13917h(source, "source");
            C14324i c14324i = C14324i.this;
            if (C12562c.f32615h && Thread.holdsLock(c14324i)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C9612q.m13918g(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(c14324i);
                throw new AssertionError(sb2.toString());
            }
            this.f36888j.mo46L(source, j);
            while (this.f36888j.size() >= 16384) {
                m45a(false);
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            boolean z;
            boolean z2;
            boolean z3;
            C14324i c14324i = C14324i.this;
            if (C12562c.f32615h && Thread.holdsLock(c14324i)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C9612q.m13918g(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(c14324i);
                throw new AssertionError(sb2.toString());
            }
            synchronized (C14324i.this) {
                if (this.f36890l) {
                    return;
                }
                if (C14324i.this.m65h() == null) {
                    z = true;
                } else {
                    z = false;
                }
                Unit unit = Unit.f25302a;
                if (!C14324i.this.m58o().f36891m) {
                    if (this.f36888j.size() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (this.f36889k != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        while (this.f36888j.size() > 0) {
                            m45a(false);
                        }
                        C14299f m66g = C14324i.this.m66g();
                        int m63j = C14324i.this.m63j();
                        Headers headers = this.f36889k;
                        C9612q.m13920e(headers);
                        m66g.m162X0(m63j, z, C12562c.m4824L(headers));
                    } else if (z2) {
                        while (this.f36888j.size() > 0) {
                            m45a(true);
                        }
                    } else if (z) {
                        C14324i.this.m66g().m163W0(C14324i.this.m63j(), true, null, 0L);
                    }
                }
                synchronized (C14324i.this) {
                    this.f36890l = true;
                    Unit unit2 = Unit.f25302a;
                }
                C14324i.this.m66g().flush();
                C14324i.this.m71b();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            C14324i c14324i = C14324i.this;
            if (C12562c.f32615h && Thread.holdsLock(c14324i)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C9612q.m13918g(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(c14324i);
                throw new AssertionError(sb2.toString());
            }
            synchronized (C14324i.this) {
                C14324i.this.m70c();
                Unit unit = Unit.f25302a;
            }
            while (this.f36888j.size() > 0) {
                m45a(false);
                C14324i.this.m66g().flush();
            }
        }

        /* renamed from: h */
        public final boolean m44h() {
            return this.f36890l;
        }

        /* renamed from: i */
        public final boolean m43i() {
            return this.f36891m;
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return C14324i.this.m54s();
        }
    }

    @Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020 ¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010+\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b*\u0010#\"\u0004\b\u0010\u0010%¨\u0006."}, m14357d2 = {"Lzj/i$c;", "Lokio/Source;", "", "read", "", "o", "Lokio/Buffer;", "sink", "byteCount", "Lokio/BufferedSource;", "source", "i", "(Lokio/BufferedSource;J)V", "Lokio/Timeout;", "timeout", "close", "j", "Lokio/Buffer;", "getReceiveBuffer", "()Lokio/Buffer;", "receiveBuffer", "k", "getReadBuffer", "readBuffer", "Lokhttp3/Headers;", "l", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "m", "(Lokhttp3/Headers;)V", "trailers", "", "Z", "a", "()Z", "setClosed$okhttp", "(Z)V", "closed", "n", "J", "maxByteCount", "h", "finished", "<init>", "(Lzj/i;JZ)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.i$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public final class C14327c implements Source {

        /* renamed from: j */
        private final Buffer f36893j = new Buffer();

        /* renamed from: k */
        private final Buffer f36894k = new Buffer();

        /* renamed from: l */
        private Headers f36895l;

        /* renamed from: m */
        private boolean f36896m;

        /* renamed from: n */
        private final long f36897n;

        /* renamed from: o */
        private boolean f36898o;

        public C14327c(long j, boolean z) {
            this.f36897n = j;
            this.f36898o = z;
        }

        /* renamed from: o */
        private final void m37o(long j) {
            C14324i c14324i = C14324i.this;
            if (C12562c.f32615h && Thread.holdsLock(c14324i)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C9612q.m13918g(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(c14324i);
                throw new AssertionError(sb2.toString());
            }
            C14324i.this.m66g().m164V0(j);
        }

        /* renamed from: a */
        public final boolean m42a() {
            return this.f36896m;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            synchronized (C14324i.this) {
                this.f36896m = true;
                size = this.f36894k.size();
                this.f36894k.m8621j();
                C14324i c14324i = C14324i.this;
                if (c14324i != null) {
                    c14324i.notifyAll();
                    Unit unit = Unit.f25302a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (size > 0) {
                m37o(size);
            }
            C14324i.this.m71b();
        }

        /* renamed from: h */
        public final boolean m41h() {
            return this.f36898o;
        }

        /* renamed from: i */
        public final void m40i(BufferedSource source, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            C9612q.m13917h(source, "source");
            C14324i c14324i = C14324i.this;
            if (C12562c.f32615h && Thread.holdsLock(c14324i)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C9612q.m13918g(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(c14324i);
                throw new AssertionError(sb2.toString());
            }
            while (j > 0) {
                synchronized (C14324i.this) {
                    z = this.f36898o;
                    z2 = true;
                    if (this.f36894k.size() + j > this.f36897n) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    Unit unit = Unit.f25302a;
                }
                if (z3) {
                    source.skip(j);
                    C14324i.this.m67f(EnumC14291b.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    source.skip(j);
                    return;
                } else {
                    long read = source.read(this.f36893j, j);
                    if (read != -1) {
                        j -= read;
                        synchronized (C14324i.this) {
                            if (this.f36896m) {
                                j2 = this.f36893j.size();
                                this.f36893j.m8621j();
                            } else {
                                if (this.f36894k.size() != 0) {
                                    z2 = false;
                                }
                                this.f36894k.mo8606O(this.f36893j);
                                if (z2) {
                                    C14324i c14324i2 = C14324i.this;
                                    if (c14324i2 != null) {
                                        c14324i2.notifyAll();
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                    }
                                }
                                j2 = 0;
                            }
                        }
                        if (j2 > 0) {
                            m37o(j2);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        /* renamed from: j */
        public final void m39j(boolean z) {
            this.f36898o = z;
        }

        /* renamed from: m */
        public final void m38m(Headers headers) {
            this.f36895l = headers;
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:
            throw new java.io.IOException("stream closed");
         */
        @Override // okio.Source
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long read(okio.Buffer r18, long r19) {
            /*
                Method dump skipped, instructions count: 267
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p471zj.C14324i.C14327c.read(okio.Buffer, long):long");
        }

        @Override // okio.Source
        public Timeout timeout() {
            return C14324i.this.m60m();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\n"}, m14357d2 = {"Lzj/i$d;", "Lokio/a;", "", "x", "Ljava/io/IOException;", "cause", "t", "y", "<init>", "(Lzj/i;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.i$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public final class C14328d extends C11217a {
        public C14328d() {
        }

        @Override // okio.C11217a
        /* renamed from: t */
        protected IOException mo36t(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // okio.C11217a
        /* renamed from: x */
        protected void mo35x() {
            C14324i.this.m67f(EnumC14291b.CANCEL);
            C14324i.this.m66g().m175P0();
        }

        /* renamed from: y */
        public final void m34y() {
            if (m8525s()) {
                throw mo36t(null);
            }
        }
    }

    public C14324i(int i, C14299f connection, boolean z, boolean z2, Headers headers) {
        C9612q.m13917h(connection, "connection");
        this.f36886m = i;
        this.f36887n = connection;
        this.f36877d = connection.m192B0().m6c();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.f36878e = arrayDeque;
        this.f36880g = new C14327c(connection.m193A0().m6c(), z2);
        this.f36881h = new C14326b(z);
        this.f36882i = new C14328d();
        this.f36883j = new C14328d();
        if (headers != null) {
            if (!m53t()) {
                arrayDeque.add(headers);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (m53t()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    /* renamed from: e */
    private final boolean m68e(EnumC14291b enumC14291b, IOException iOException) {
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
        synchronized (this) {
            if (this.f36884k != null) {
                return false;
            }
            if (this.f36880g.m41h() && this.f36881h.m43i()) {
                return false;
            }
            this.f36884k = enumC14291b;
            this.f36885l = iOException;
            notifyAll();
            Unit unit = Unit.f25302a;
            this.f36887n.m176O0(this.f36886m);
            return true;
        }
    }

    /* renamed from: A */
    public final void m77A(long j) {
        this.f36874a = j;
    }

    /* renamed from: B */
    public final void m76B(long j) {
        this.f36876c = j;
    }

    /* renamed from: C */
    public final synchronized Headers m75C() {
        Headers removeFirst;
        this.f36882i.m8526r();
        while (this.f36878e.isEmpty() && this.f36884k == null) {
            m74D();
        }
        this.f36882i.m34y();
        if (!this.f36878e.isEmpty()) {
            removeFirst = this.f36878e.removeFirst();
            C9612q.m13918g(removeFirst, "headersQueue.removeFirst()");
        } else {
            IOException iOException = this.f36885l;
            if (iOException == null) {
                EnumC14291b enumC14291b = this.f36884k;
                C9612q.m13920e(enumC14291b);
                throw new C14338n(enumC14291b);
            }
            throw iOException;
        }
        return removeFirst;
    }

    /* renamed from: D */
    public final void m74D() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: E */
    public final Timeout m73E() {
        return this.f36883j;
    }

    /* renamed from: a */
    public final void m72a(long j) {
        this.f36877d += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: b */
    public final void m71b() {
        boolean z;
        boolean m52u;
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
        synchronized (this) {
            if (!this.f36880g.m41h() && this.f36880g.m42a() && (this.f36881h.m43i() || this.f36881h.m44h())) {
                z = true;
            } else {
                z = false;
            }
            m52u = m52u();
            Unit unit = Unit.f25302a;
        }
        if (z) {
            m69d(EnumC14291b.CANCEL, null);
        } else if (!m52u) {
            this.f36887n.m176O0(this.f36886m);
        }
    }

    /* renamed from: c */
    public final void m70c() {
        if (!this.f36881h.m44h()) {
            if (!this.f36881h.m43i()) {
                if (this.f36884k != null) {
                    IOException iOException = this.f36885l;
                    if (iOException == null) {
                        EnumC14291b enumC14291b = this.f36884k;
                        C9612q.m13920e(enumC14291b);
                        throw new C14338n(enumC14291b);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    /* renamed from: d */
    public final void m69d(EnumC14291b rstStatusCode, IOException iOException) {
        C9612q.m13917h(rstStatusCode, "rstStatusCode");
        if (!m68e(rstStatusCode, iOException)) {
            return;
        }
        this.f36887n.m159Z0(this.f36886m, rstStatusCode);
    }

    /* renamed from: f */
    public final void m67f(EnumC14291b errorCode) {
        C9612q.m13917h(errorCode, "errorCode");
        if (!m68e(errorCode, null)) {
            return;
        }
        this.f36887n.m157a1(this.f36886m, errorCode);
    }

    /* renamed from: g */
    public final C14299f m66g() {
        return this.f36887n;
    }

    /* renamed from: h */
    public final synchronized EnumC14291b m65h() {
        return this.f36884k;
    }

    /* renamed from: i */
    public final IOException m64i() {
        return this.f36885l;
    }

    /* renamed from: j */
    public final int m63j() {
        return this.f36886m;
    }

    /* renamed from: k */
    public final long m62k() {
        return this.f36875b;
    }

    /* renamed from: l */
    public final long m61l() {
        return this.f36874a;
    }

    /* renamed from: m */
    public final C14328d m60m() {
        return this.f36882i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okio.Sink m59n() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f36879f     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Le
            boolean r0 = r2.m53t()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            if (r0 == 0) goto L17
            kotlin.Unit r0 = kotlin.Unit.f25302a     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            zj.i$b r0 = r2.f36881h
            return r0
        L17:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p471zj.C14324i.m59n():okio.Sink");
    }

    /* renamed from: o */
    public final C14326b m58o() {
        return this.f36881h;
    }

    /* renamed from: p */
    public final C14327c m57p() {
        return this.f36880g;
    }

    /* renamed from: q */
    public final long m56q() {
        return this.f36877d;
    }

    /* renamed from: r */
    public final long m55r() {
        return this.f36876c;
    }

    /* renamed from: s */
    public final C14328d m54s() {
        return this.f36883j;
    }

    /* renamed from: t */
    public final boolean m53t() {
        boolean z;
        if ((this.f36886m & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.f36887n.m156b0() == z) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final synchronized boolean m52u() {
        if (this.f36884k != null) {
            return false;
        }
        if ((this.f36880g.m41h() || this.f36880g.m42a()) && (this.f36881h.m43i() || this.f36881h.m44h())) {
            if (this.f36879f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: v */
    public final Timeout m51v() {
        return this.f36882i;
    }

    /* renamed from: w */
    public final void m50w(BufferedSource source, int i) {
        C9612q.m13917h(source, "source");
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
        this.f36880g.m40i(source, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[Catch: all -> 0x006d, TryCatch #0 {, blocks: (B:10:0x003d, B:14:0x0045, B:17:0x0054, B:18:0x0059, B:15:0x004b), top: B:26:0x003d }] */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m49x(okhttp3.Headers r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.C9612q.m13917h(r3, r0)
            boolean r0 = sj.C12562c.f32615h
            if (r0 == 0) goto L3c
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L10
            goto L3c
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L3c:
            monitor-enter(r2)
            boolean r0 = r2.f36879f     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            if (r0 == 0) goto L4b
            if (r4 != 0) goto L45
            goto L4b
        L45:
            zj.i$c r0 = r2.f36880g     // Catch: java.lang.Throwable -> L6d
            r0.m38m(r3)     // Catch: java.lang.Throwable -> L6d
            goto L52
        L4b:
            r2.f36879f = r1     // Catch: java.lang.Throwable -> L6d
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.f36878e     // Catch: java.lang.Throwable -> L6d
            r0.add(r3)     // Catch: java.lang.Throwable -> L6d
        L52:
            if (r4 == 0) goto L59
            zj.i$c r3 = r2.f36880g     // Catch: java.lang.Throwable -> L6d
            r3.m39j(r1)     // Catch: java.lang.Throwable -> L6d
        L59:
            boolean r3 = r2.m52u()     // Catch: java.lang.Throwable -> L6d
            r2.notifyAll()     // Catch: java.lang.Throwable -> L6d
            kotlin.Unit r4 = kotlin.Unit.f25302a     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r2)
            if (r3 != 0) goto L6c
            zj.f r3 = r2.f36887n
            int r4 = r2.f36886m
            r3.m176O0(r4)
        L6c:
            return
        L6d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p471zj.C14324i.m49x(okhttp3.Headers, boolean):void");
    }

    /* renamed from: y */
    public final synchronized void m48y(EnumC14291b errorCode) {
        C9612q.m13917h(errorCode, "errorCode");
        if (this.f36884k == null) {
            this.f36884k = errorCode;
            notifyAll();
        }
    }

    /* renamed from: z */
    public final void m47z(long j) {
        this.f36875b = j;
    }
}
