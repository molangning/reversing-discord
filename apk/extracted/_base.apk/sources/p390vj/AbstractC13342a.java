package p390vj;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H&J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\bR\"\u0010\u0016\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u000b\u0010\u001c¨\u0006 "}, m14357d2 = {"Lvj/a;", "", "", "f", "Lvj/d;", "queue", "", "e", "(Lvj/d;)V", "", "toString", "a", "Lvj/d;", "d", "()Lvj/d;", "setQueue$okhttp", "b", "J", "c", "()J", "g", "(J)V", "nextExecuteNanoTime", "Ljava/lang/String;", "()Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_NAME, "", "Z", "()Z", "cancelable", "<init>", "(Ljava/lang/String;Z)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: vj.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public abstract class AbstractC13342a {

    /* renamed from: a */
    private C13345d f34415a;

    /* renamed from: b */
    private long f34416b;

    /* renamed from: c */
    private final String f34417c;

    /* renamed from: d */
    private final boolean f34418d;

    public AbstractC13342a(String name, boolean z) {
        C9612q.m13917h(name, "name");
        this.f34417c = name;
        this.f34418d = z;
        this.f34416b = -1L;
    }

    /* renamed from: a */
    public final boolean m2757a() {
        return this.f34418d;
    }

    /* renamed from: b */
    public final String m2756b() {
        return this.f34417c;
    }

    /* renamed from: c */
    public final long m2755c() {
        return this.f34416b;
    }

    /* renamed from: d */
    public final C13345d m2754d() {
        return this.f34415a;
    }

    /* renamed from: e */
    public final void m2753e(C13345d queue) {
        boolean z;
        C9612q.m13917h(queue, "queue");
        C13345d c13345d = this.f34415a;
        if (c13345d == queue) {
            return;
        }
        if (c13345d == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f34415a = queue;
            return;
        }
        throw new IllegalStateException("task is in multiple queues".toString());
    }

    /* renamed from: f */
    public abstract long mo123f();

    /* renamed from: g */
    public final void m2752g(long j) {
        this.f34416b = j;
    }

    public String toString() {
        return this.f34417c;
    }

    public /* synthetic */ AbstractC13342a(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
