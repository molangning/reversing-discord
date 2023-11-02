package p410wj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okhttp3.Interceptor;
import okhttp3.Response;
import p431xj.C13840g;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m14357d2 = {"Lwj/a;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: wj.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13632a implements Interceptor {

    /* renamed from: a */
    public static final C13632a f35026a = new C13632a();

    private C13632a() {
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        C9612q.m13917h(chain, "chain");
        C13840g c13840g = (C13840g) chain;
        return C13840g.m1420d(c13840g, 0, c13840g.m1419e().m1982u(c13840g), null, 0, 0, 0, 61, null).mo1422b(c13840g.m1415i());
    }
}
