package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p122gk.C6829c;
import p122gk.C6851u;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0002 !B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u00020\u0005H\u0014J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014R\u0016\u0010\u0016\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\""}, m14357d2 = {"Lokio/a;", "Lokio/Timeout;", "", "now", "u", "", "r", "", "s", "x", "Lokio/Sink;", "sink", "v", "Lokio/Source;", "source", "w", "Ljava/io/IOException;", "cause", "m", "t", "f", "Z", "inQueue", "g", "Lokio/a;", "next", "h", "J", "timeoutAt", "<init>", "()V", "l", "a", "b", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: okio.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class C11217a extends Timeout {

    /* renamed from: i */
    private static final long f29491i;

    /* renamed from: j */
    private static final long f29492j;

    /* renamed from: k */
    private static C11217a f29493k;

    /* renamed from: l */
    public static final C11218a f29494l = new C11218a(null);

    /* renamed from: f */
    private boolean f29495f;

    /* renamed from: g */
    private C11217a f29496g;

    /* renamed from: h */
    private long f29497h;

    @Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m14357d2 = {"Lokio/a$a;", "", "Lokio/a;", "node", "", "timeoutNanos", "", "hasDeadline", "", "e", "d", "c", "()Lokio/a;", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "TIMEOUT_WRITE_SIZE", "I", "head", "Lokio/a;", "<init>", "()V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okio.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11218a {
        private C11218a() {
        }

        public /* synthetic */ C11218a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public final boolean m8518d(C11217a c11217a) {
            synchronized (C11217a.class) {
                for (C11217a c11217a2 = C11217a.f29493k; c11217a2 != null; c11217a2 = c11217a2.f29496g) {
                    if (c11217a2.f29496g == c11217a) {
                        c11217a2.f29496g = c11217a.f29496g;
                        c11217a.f29496g = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* renamed from: e */
        public final void m8517e(C11217a c11217a, long j, boolean z) {
            synchronized (C11217a.class) {
                if (C11217a.f29493k == null) {
                    C11217a.f29493k = new C11217a();
                    new C11219b().start();
                }
                long nanoTime = System.nanoTime();
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i != 0 && z) {
                    c11217a.f29497h = Math.min(j, c11217a.mo8541c() - nanoTime) + nanoTime;
                } else if (i != 0) {
                    c11217a.f29497h = j + nanoTime;
                } else if (z) {
                    c11217a.f29497h = c11217a.mo8541c();
                } else {
                    throw new AssertionError();
                }
                long m8524u = c11217a.m8524u(nanoTime);
                C11217a c11217a2 = C11217a.f29493k;
                C9612q.m13920e(c11217a2);
                while (c11217a2.f29496g != null) {
                    C11217a c11217a3 = c11217a2.f29496g;
                    C9612q.m13920e(c11217a3);
                    if (m8524u < c11217a3.m8524u(nanoTime)) {
                        break;
                    }
                    c11217a2 = c11217a2.f29496g;
                    C9612q.m13920e(c11217a2);
                }
                c11217a.f29496g = c11217a2.f29496g;
                c11217a2.f29496g = c11217a;
                if (c11217a2 == C11217a.f29493k) {
                    C11217a.class.notify();
                }
                Unit unit = Unit.f25302a;
            }
        }

        /* renamed from: c */
        public final C11217a m8519c() {
            C11217a c11217a = C11217a.f29493k;
            C9612q.m13920e(c11217a);
            C11217a c11217a2 = c11217a.f29496g;
            if (c11217a2 == null) {
                long nanoTime = System.nanoTime();
                C11217a.class.wait(C11217a.f29491i);
                C11217a c11217a3 = C11217a.f29493k;
                C9612q.m13920e(c11217a3);
                if (c11217a3.f29496g != null || System.nanoTime() - nanoTime < C11217a.f29492j) {
                    return null;
                }
                return C11217a.f29493k;
            }
            long m8524u = c11217a2.m8524u(System.nanoTime());
            if (m8524u > 0) {
                long j = m8524u / 1000000;
                C11217a.class.wait(j, (int) (m8524u - (1000000 * j)));
                return null;
            }
            C11217a c11217a4 = C11217a.f29493k;
            C9612q.m13920e(c11217a4);
            c11217a4.f29496g = c11217a2.f29496g;
            c11217a2.f29496g = null;
            return c11217a2;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m14357d2 = {"Lokio/a$b;", "Ljava/lang/Thread;", "", "run", "<init>", "()V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okio.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11219b extends Thread {
        public C11219b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C11217a m8519c;
            while (true) {
                try {
                    synchronized (C11217a.class) {
                        m8519c = C11217a.f29494l.m8519c();
                        if (m8519c == C11217a.f29493k) {
                            C11217a.f29493k = null;
                            return;
                        }
                        Unit unit = Unit.f25302a;
                    }
                    if (m8519c != null) {
                        m8519c.mo35x();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    @Metadata(m14358d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, m14357d2 = {"okio/a$c", "Lokio/Sink;", "Lokio/Buffer;", "source", "", "byteCount", "", "L", "flush", "close", "Lokio/a;", "a", "", "toString", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okio.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11220c implements Sink {

        /* renamed from: k */
        final /* synthetic */ Sink f29499k;

        C11220c(Sink sink) {
            C11217a.this = r1;
            this.f29499k = sink;
        }

        @Override // okio.Sink
        /* renamed from: L */
        public void mo46L(Buffer source, long j) {
            C9612q.m13917h(source, "source");
            C6829c.m21850b(source.size(), 0L, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C6851u c6851u = source.f29470j;
                    C9612q.m13920e(c6851u);
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += c6851u.f19078c - c6851u.f19077b;
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        } else {
                            c6851u = c6851u.f19081f;
                            C9612q.m13920e(c6851u);
                        }
                    }
                    C11217a c11217a = C11217a.this;
                    c11217a.m8526r();
                    try {
                        this.f29499k.mo46L(source, j2);
                        Unit unit = Unit.f25302a;
                        if (!c11217a.m8525s()) {
                            j -= j2;
                        } else {
                            throw c11217a.m8531m(null);
                        }
                    } catch (IOException e) {
                        if (!c11217a.m8525s()) {
                            throw e;
                        }
                        throw c11217a.m8531m(e);
                    } finally {
                        c11217a.m8525s();
                    }
                } else {
                    return;
                }
            }
        }

        @Override // okio.Sink
        /* renamed from: a */
        public C11217a timeout() {
            return C11217a.this;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C11217a c11217a = C11217a.this;
            c11217a.m8526r();
            try {
                this.f29499k.close();
                Unit unit = Unit.f25302a;
                if (!c11217a.m8525s()) {
                    return;
                }
                throw c11217a.m8531m(null);
            } catch (IOException e) {
                if (!c11217a.m8525s()) {
                    throw e;
                }
                throw c11217a.m8531m(e);
            } finally {
                c11217a.m8525s();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            C11217a c11217a = C11217a.this;
            c11217a.m8526r();
            try {
                this.f29499k.flush();
                Unit unit = Unit.f25302a;
                if (!c11217a.m8525s()) {
                    return;
                }
                throw c11217a.m8531m(null);
            } catch (IOException e) {
                if (!c11217a.m8525s()) {
                    throw e;
                }
                throw c11217a.m8531m(e);
            } finally {
                c11217a.m8525s();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f29499k + ')';
        }
    }

    @Metadata(m14358d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, m14357d2 = {"okio/a$d", "Lokio/Source;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "", "close", "Lokio/a;", "a", "", "toString", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okio.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11221d implements Source {

        /* renamed from: k */
        final /* synthetic */ Source f29501k;

        C11221d(Source source) {
            C11217a.this = r1;
            this.f29501k = source;
        }

        @Override // okio.Source
        /* renamed from: a */
        public C11217a timeout() {
            return C11217a.this;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C11217a c11217a = C11217a.this;
            c11217a.m8526r();
            try {
                this.f29501k.close();
                Unit unit = Unit.f25302a;
                if (!c11217a.m8525s()) {
                    return;
                }
                throw c11217a.m8531m(null);
            } catch (IOException e) {
                if (!c11217a.m8525s()) {
                    throw e;
                }
                throw c11217a.m8531m(e);
            } finally {
                c11217a.m8525s();
            }
        }

        @Override // okio.Source
        public long read(Buffer sink, long j) {
            C9612q.m13917h(sink, "sink");
            C11217a c11217a = C11217a.this;
            c11217a.m8526r();
            try {
                long read = this.f29501k.read(sink, j);
                if (!c11217a.m8525s()) {
                    return read;
                }
                throw c11217a.m8531m(null);
            } catch (IOException e) {
                if (!c11217a.m8525s()) {
                    throw e;
                }
                throw c11217a.m8531m(e);
            } finally {
                c11217a.m8525s();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f29501k + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f29491i = millis;
        f29492j = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: u */
    public final long m8524u(long j) {
        return this.f29497h - j;
    }

    /* renamed from: m */
    public final IOException m8531m(IOException iOException) {
        return mo36t(iOException);
    }

    /* renamed from: r */
    public final void m8526r() {
        if (!this.f29495f) {
            long mo8539h = mo8539h();
            boolean mo8540e = mo8540e();
            if (mo8539h == 0 && !mo8540e) {
                return;
            }
            this.f29495f = true;
            f29494l.m8517e(this, mo8539h, mo8540e);
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    /* renamed from: s */
    public final boolean m8525s() {
        if (!this.f29495f) {
            return false;
        }
        this.f29495f = false;
        return f29494l.m8518d(this);
    }

    /* renamed from: t */
    protected IOException mo36t(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: v */
    public final Sink m8523v(Sink sink) {
        C9612q.m13917h(sink, "sink");
        return new C11220c(sink);
    }

    /* renamed from: w */
    public final Source m8522w(Source source) {
        C9612q.m13917h(source, "source");
        return new C11221d(source);
    }

    /* renamed from: x */
    protected void mo35x() {
    }
}