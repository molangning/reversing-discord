package p328rj;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m14357d2 = {"Lrj/q;", "", "", "c", "other", "equals", "", "hashCode", "", "toString", "Lrj/a;", "a", "Lrj/a;", "()Lrj/a;", "address", "Ljava/net/Proxy;", "b", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "proxy", "Ljava/net/InetSocketAddress;", "Ljava/net/InetSocketAddress;", "d", "()Ljava/net/InetSocketAddress;", "socketAddress", "<init>", "(Lrj/a;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: rj.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C12314q {

    /* renamed from: a */
    private final C12271a f32095a;

    /* renamed from: b */
    private final Proxy f32096b;

    /* renamed from: c */
    private final InetSocketAddress f32097c;

    public C12314q(C12271a address, Proxy proxy, InetSocketAddress socketAddress) {
        C9612q.m13917h(address, "address");
        C9612q.m13917h(proxy, "proxy");
        C9612q.m13917h(socketAddress, "socketAddress");
        this.f32095a = address;
        this.f32096b = proxy;
        this.f32097c = socketAddress;
    }

    /* renamed from: a */
    public final C12271a m5507a() {
        return this.f32095a;
    }

    /* renamed from: b */
    public final Proxy m5506b() {
        return this.f32096b;
    }

    /* renamed from: c */
    public final boolean m5505c() {
        return this.f32095a.m5619k() != null && this.f32096b.type() == Proxy.Type.HTTP;
    }

    /* renamed from: d */
    public final InetSocketAddress m5504d() {
        return this.f32097c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12314q) {
            C12314q c12314q = (C12314q) obj;
            if (C9612q.m13922c(c12314q.f32095a, this.f32095a) && C9612q.m13922c(c12314q.f32096b, this.f32096b) && C9612q.m13922c(c12314q.f32097c, this.f32097c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f32095a.hashCode()) * 31) + this.f32096b.hashCode()) * 31) + this.f32097c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f32097c + '}';
    }
}