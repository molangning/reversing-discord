package p410wj;

import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p031bk.C2370k;
import p328rj.C12271a;
import p328rj.C12314q;
import p390vj.AbstractC13342a;
import p390vj.C13345d;
import p390vj.C13346e;
import p410wj.C13638e;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u001b\u0018\u0000 *2\u00020\u0001:\u0001\u0011B'\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010\"\u001a\u00020\u0006\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J.\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!¨\u0006+"}, m14357d2 = {"Lwj/h;", "", "Lwj/f;", "connection", "", "now", "", "d", "Lrj/a;", "address", "Lwj/e;", "call", "", "Lrj/q;", "routes", "", "requireMultiplexed", "a", "", "e", "c", "b", "J", "keepAliveDurationNs", "Lvj/d;", "Lvj/d;", "cleanupQueue", "wj/h$b", "Lwj/h$b;", "cleanupTask", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "I", "maxIdleConnections", "Lvj/e;", "taskRunner", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Lvj/e;IJLjava/util/concurrent/TimeUnit;)V", "f", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: wj.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13648h {

    /* renamed from: f */
    public static final C13649a f35107f = new C13649a(null);

    /* renamed from: a */
    private final long f35108a;

    /* renamed from: b */
    private final C13345d f35109b;

    /* renamed from: c */
    private final C13650b f35110c;

    /* renamed from: d */
    private final ConcurrentLinkedQueue<C13642f> f35111d;

    /* renamed from: e */
    private final int f35112e;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m14357d2 = {"Lwj/h$a;", "", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: wj.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C13649a {
        private C13649a() {
        }

        public /* synthetic */ C13649a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m14357d2 = {"wj/h$b", "Lvj/a;", "", "f", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: wj.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C13650b extends AbstractC13342a {
        C13650b(String str) {
            super(str, false, 2, null);
        }

        @Override // p390vj.AbstractC13342a
        /* renamed from: f */
        public long mo123f() {
            return C13648h.this.m1937b(System.nanoTime());
        }
    }

    public C13648h(C13346e taskRunner, int i, long j, TimeUnit timeUnit) {
        boolean z;
        C9612q.m13917h(taskRunner, "taskRunner");
        C9612q.m13917h(timeUnit, "timeUnit");
        this.f35112e = i;
        this.f35108a = timeUnit.toNanos(j);
        this.f35109b = taskRunner.m2726i();
        this.f35110c = new C13650b(C12562c.f32616i + " ConnectionPool");
        this.f35111d = new ConcurrentLinkedQueue<>();
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j).toString());
    }

    /* renamed from: d */
    private final int m1935d(C13642f c13642f, long j) {
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
        int i = 0;
        while (i < m1951n.size()) {
            Reference<C13638e> reference = m1951n.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C2370k.f6491c.m33588g().mo33598m("A connection to " + c13642f.m1970A().m5507a().m5618l() + " was leaked. Did you forget to close a response body?", ((C13638e.C13640b) reference).m1971a());
                m1951n.remove(i);
                c13642f.m1967D(true);
                if (m1951n.isEmpty()) {
                    c13642f.m1968C(j - this.f35108a);
                    return 0;
                }
            }
        }
        return m1951n.size();
    }

    /* renamed from: a */
    public final boolean m1938a(C12271a address, C13638e call, List<C12314q> list, boolean z) {
        C9612q.m13917h(address, "address");
        C9612q.m13917h(call, "call");
        Iterator<C13642f> it = this.f35111d.iterator();
        while (it.hasNext()) {
            C13642f connection = it.next();
            C9612q.m13918g(connection, "connection");
            synchronized (connection) {
                if (z) {
                    if (!connection.m1943v()) {
                        Unit unit = Unit.f25302a;
                    }
                }
                if (connection.m1945t(address, list)) {
                    call.m1998d(connection);
                    return true;
                }
                Unit unit2 = Unit.f25302a;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final long m1937b(long j) {
        Iterator<C13642f> it = this.f35111d.iterator();
        int i = 0;
        long j2 = Long.MIN_VALUE;
        C13642f c13642f = null;
        int i2 = 0;
        while (it.hasNext()) {
            C13642f connection = it.next();
            C9612q.m13918g(connection, "connection");
            synchronized (connection) {
                if (m1935d(connection, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long m1950o = j - connection.m1950o();
                    if (m1950o > j2) {
                        Unit unit = Unit.f25302a;
                        c13642f = connection;
                        j2 = m1950o;
                    } else {
                        Unit unit2 = Unit.f25302a;
                    }
                }
            }
        }
        long j3 = this.f35108a;
        if (j2 < j3 && i <= this.f35112e) {
            if (i > 0) {
                return j3 - j2;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        C9612q.m13920e(c13642f);
        synchronized (c13642f) {
            if (!c13642f.m1951n().isEmpty()) {
                return 0L;
            }
            if (c13642f.m1950o() + j2 != j) {
                return 0L;
            }
            c13642f.m1967D(true);
            this.f35111d.remove(c13642f);
            C12562c.m4800k(c13642f.m1966E());
            if (this.f35111d.isEmpty()) {
                this.f35109b.m2748a();
            }
            return 0L;
        }
    }

    /* renamed from: c */
    public final boolean m1936c(C13642f connection) {
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
        } else if (!connection.m1949p() && this.f35112e != 0) {
            C13345d.m2739j(this.f35109b, this.f35110c, 0L, 2, null);
            return false;
        } else {
            connection.m1967D(true);
            this.f35111d.remove(connection);
            if (this.f35111d.isEmpty()) {
                this.f35109b.m2748a();
            }
            return true;
        }
    }

    /* renamed from: e */
    public final void m1934e(C13642f connection) {
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
        this.f35111d.add(connection);
        C13345d.m2739j(this.f35109b, this.f35110c, 0L, 2, null);
    }
}
