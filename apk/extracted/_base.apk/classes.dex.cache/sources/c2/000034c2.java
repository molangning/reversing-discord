package p122gk;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okio.Timeout;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0017J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001J\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0001H\u0016J\b\u0010\u0010\u001a\u00020\u0001H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m14357d2 = {"Lgk/h;", "Lokio/Timeout;", "delegate", "j", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "h", "", "e", "c", "deadlineNanoTime", "d", "b", "a", "", "f", "Lokio/Timeout;", "i", "()Lokio/Timeout;", "setDelegate", "(Lokio/Timeout;)V", "<init>", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: gk.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class C6834h extends Timeout {

    /* renamed from: f */
    private Timeout f19040f;

    public C6834h(Timeout delegate) {
        C9612q.m13917h(delegate, "delegate");
        this.f19040f = delegate;
    }

    @Override // okio.Timeout
    /* renamed from: a */
    public Timeout mo8543a() {
        return this.f19040f.mo8543a();
    }

    @Override // okio.Timeout
    /* renamed from: b */
    public Timeout mo8542b() {
        return this.f19040f.mo8542b();
    }

    @Override // okio.Timeout
    /* renamed from: c */
    public long mo8541c() {
        return this.f19040f.mo8541c();
    }

    @Override // okio.Timeout
    /* renamed from: d */
    public Timeout mo8538d(long j) {
        return this.f19040f.mo8538d(j);
    }

    @Override // okio.Timeout
    /* renamed from: e */
    public boolean mo8540e() {
        return this.f19040f.mo8540e();
    }

    @Override // okio.Timeout
    /* renamed from: f */
    public void mo8537f() {
        this.f19040f.mo8537f();
    }

    @Override // okio.Timeout
    /* renamed from: g */
    public Timeout mo8536g(long j, TimeUnit unit) {
        C9612q.m13917h(unit, "unit");
        return this.f19040f.mo8536g(j, unit);
    }

    @Override // okio.Timeout
    /* renamed from: h */
    public long mo8539h() {
        return this.f19040f.mo8539h();
    }

    /* renamed from: i */
    public final Timeout m21843i() {
        return this.f19040f;
    }

    /* renamed from: j */
    public final C6834h m21842j(Timeout delegate) {
        C9612q.m13917h(delegate, "delegate");
        this.f19040f = delegate;
        return this;
    }
}