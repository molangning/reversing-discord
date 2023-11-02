package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016J\b\u0010\u000e\u001a\u00020\u0000H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0017"}, m14357d2 = {"Lokio/Timeout;", "", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "h", "", "e", "c", "deadlineNanoTime", "d", "b", "a", "", "f", "Z", "hasDeadline", "J", "timeoutNanos", "<init>", "()V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class Timeout {

    /* renamed from: a */
    private boolean f29488a;

    /* renamed from: b */
    private long f29489b;

    /* renamed from: c */
    private long f29490c;

    /* renamed from: e */
    public static final C11216b f29487e = new C11216b(null);

    /* renamed from: d */
    public static final Timeout f29486d = new C11215a();

    @Metadata(m14358d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, m14357d2 = {"okio/Timeout$a", "Lokio/Timeout;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "deadlineNanoTime", "d", "", "f", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okio.Timeout$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11215a extends Timeout {
        C11215a() {
        }

        @Override // okio.Timeout
        /* renamed from: d */
        public Timeout mo8538d(long j) {
            return this;
        }

        @Override // okio.Timeout
        /* renamed from: f */
        public void mo8537f() {
        }

        @Override // okio.Timeout
        /* renamed from: g */
        public Timeout mo8536g(long j, TimeUnit unit) {
            C9612q.m13917h(unit, "unit");
            return this;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lokio/Timeout$b;", "", "Lokio/Timeout;", "NONE", "Lokio/Timeout;", "<init>", "()V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okio.Timeout$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11216b {
        private C11216b() {
        }

        public /* synthetic */ C11216b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public Timeout mo8543a() {
        this.f29488a = false;
        return this;
    }

    /* renamed from: b */
    public Timeout mo8542b() {
        this.f29490c = 0L;
        return this;
    }

    /* renamed from: c */
    public long mo8541c() {
        if (this.f29488a) {
            return this.f29489b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* renamed from: d */
    public Timeout mo8538d(long j) {
        this.f29488a = true;
        this.f29489b = j;
        return this;
    }

    /* renamed from: e */
    public boolean mo8540e() {
        return this.f29488a;
    }

    /* renamed from: f */
    public void mo8537f() {
        if (!Thread.interrupted()) {
            if (this.f29488a && this.f29489b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        Thread.currentThread().interrupt();
        throw new InterruptedIOException("interrupted");
    }

    /* renamed from: g */
    public Timeout mo8536g(long j, TimeUnit unit) {
        boolean z;
        C9612q.m13917h(unit, "unit");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f29490c = unit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    /* renamed from: h */
    public long mo8539h() {
        return this.f29490c;
    }
}
