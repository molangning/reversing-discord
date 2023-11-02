package p328rj;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p390vj.C13346e;
import p410wj.C13648h;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000fB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0011"}, m14357d2 = {"Lrj/i;", "", "Lwj/h;", "a", "Lwj/h;", "()Lwj/h;", "delegate", "<init>", "(Lwj/h;)V", "", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "(IJLjava/util/concurrent/TimeUnit;)V", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: rj.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C12294i {

    /* renamed from: a */
    private final C13648h f32056a;

    public C12294i(C13648h delegate) {
        C9612q.m13917h(delegate, "delegate");
        this.f32056a = delegate;
    }

    /* renamed from: a */
    public final C13648h m5565a() {
        return this.f32056a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12294i(int i, long j, TimeUnit timeUnit) {
        this(new C13648h(C13346e.f34428h, i, j, timeUnit));
        C9612q.m13917h(timeUnit, "timeUnit");
    }

    public C12294i() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}