package p410wj;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p328rj.C12314q;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u000f"}, m14357d2 = {"Lwj/i;", "", "Lrj/q;", "failedRoute", "", "b", "route", "a", "", "c", "", "Ljava/util/Set;", "failedRoutes", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: wj.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13651i {

    /* renamed from: a */
    private final Set<C12314q> f35114a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void m1933a(C12314q route) {
        C9612q.m13917h(route, "route");
        this.f35114a.remove(route);
    }

    /* renamed from: b */
    public final synchronized void m1932b(C12314q failedRoute) {
        C9612q.m13917h(failedRoute, "failedRoute");
        this.f35114a.add(failedRoute);
    }

    /* renamed from: c */
    public final synchronized boolean m1931c(C12314q route) {
        C9612q.m13917h(route, "route");
        return this.f35114a.contains(route);
    }
}