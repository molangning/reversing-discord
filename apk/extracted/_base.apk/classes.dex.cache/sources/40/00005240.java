package p431xj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, m14357d2 = {"Lxj/f;", "", "", "method", "", "e", "b", "a", "d", "c", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: xj.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13839f {

    /* renamed from: a */
    public static final C13839f f35630a = new C13839f();

    private C13839f() {
    }

    /* renamed from: b */
    public static final boolean m1427b(String method) {
        C9612q.m13917h(method, "method");
        if (!C9612q.m13922c(method, "GET") && !C9612q.m13922c(method, "HEAD")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m1424e(String method) {
        C9612q.m13917h(method, "method");
        if (!C9612q.m13922c(method, "POST") && !C9612q.m13922c(method, "PUT") && !C9612q.m13922c(method, "PATCH") && !C9612q.m13922c(method, "PROPPATCH") && !C9612q.m13922c(method, "REPORT")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean m1428a(String method) {
        C9612q.m13917h(method, "method");
        if (!C9612q.m13922c(method, "POST") && !C9612q.m13922c(method, "PATCH") && !C9612q.m13922c(method, "PUT") && !C9612q.m13922c(method, "DELETE") && !C9612q.m13922c(method, "MOVE")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m1426c(String method) {
        C9612q.m13917h(method, "method");
        return !C9612q.m13922c(method, "PROPFIND");
    }

    /* renamed from: d */
    public final boolean m1425d(String method) {
        C9612q.m13917h(method, "method");
        return C9612q.m13922c(method, "PROPFIND");
    }
}