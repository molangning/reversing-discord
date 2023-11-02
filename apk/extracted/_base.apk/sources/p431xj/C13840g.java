package p431xj;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p410wj.C13634c;
import p410wj.C13638e;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u000f\u001a\u00020\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)JM\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u001a\u0010\u000f\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b!\u0010%R\u001a\u0010\t\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\u0013\u001a\u0004\b&\u0010%R\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b'\u0010%¨\u0006*"}, m14357d2 = {"Lxj/g;", "Lokhttp3/Interceptor$Chain;", "", "index", "Lwj/c;", "exchange", "Lokhttp3/Request;", "request", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "c", "(ILwj/c;Lokhttp3/Request;III)Lxj/g;", "k", "Lokhttp3/Call;", "call", "a", "Lokhttp3/Response;", "b", "I", "calls", "Lwj/e;", "Lwj/e;", "e", "()Lwj/e;", "", "Lokhttp3/Interceptor;", "Ljava/util/List;", "interceptors", "d", "Lwj/c;", "g", "()Lwj/c;", "f", "Lokhttp3/Request;", "i", "()Lokhttp3/Request;", "()I", "h", "j", "<init>", "(Lwj/e;Ljava/util/List;ILwj/c;Lokhttp3/Request;III)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: xj.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13840g implements Interceptor.Chain {

    /* renamed from: a */
    private int f35631a;

    /* renamed from: b */
    private final C13638e f35632b;

    /* renamed from: c */
    private final List<Interceptor> f35633c;

    /* renamed from: d */
    private final int f35634d;

    /* renamed from: e */
    private final C13634c f35635e;

    /* renamed from: f */
    private final Request f35636f;

    /* renamed from: g */
    private final int f35637g;

    /* renamed from: h */
    private final int f35638h;

    /* renamed from: i */
    private final int f35639i;

    /* JADX WARN: Multi-variable type inference failed */
    public C13840g(C13638e call, List<? extends Interceptor> interceptors, int i, C13634c c13634c, Request request, int i2, int i3, int i4) {
        C9612q.m13917h(call, "call");
        C9612q.m13917h(interceptors, "interceptors");
        C9612q.m13917h(request, "request");
        this.f35632b = call;
        this.f35633c = interceptors;
        this.f35634d = i;
        this.f35635e = c13634c;
        this.f35636f = request;
        this.f35637g = i2;
        this.f35638h = i3;
        this.f35639i = i4;
    }

    /* renamed from: d */
    public static /* synthetic */ C13840g m1420d(C13840g c13840g, int i, C13634c c13634c, Request request, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = c13840g.f35634d;
        }
        if ((i5 & 2) != 0) {
            c13634c = c13840g.f35635e;
        }
        C13634c c13634c2 = c13634c;
        if ((i5 & 4) != 0) {
            request = c13840g.f35636f;
        }
        Request request2 = request;
        if ((i5 & 8) != 0) {
            i2 = c13840g.f35637g;
        }
        int i6 = i2;
        if ((i5 & 16) != 0) {
            i3 = c13840g.f35638h;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = c13840g.f35639i;
        }
        return c13840g.m1421c(i, c13634c2, request2, i6, i7, i4);
    }

    @Override // okhttp3.Interceptor.Chain
    /* renamed from: a */
    public Request mo1423a() {
        return this.f35636f;
    }

    @Override // okhttp3.Interceptor.Chain
    /* renamed from: b */
    public Response mo1422b(Request request) {
        boolean z;
        boolean z2;
        boolean z3;
        C9612q.m13917h(request, "request");
        boolean z4 = false;
        if (this.f35634d < this.f35633c.size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f35631a++;
            C13634c c13634c = this.f35635e;
            if (c13634c != null) {
                if (c13634c.m2028j().m2007g(request.m8734l())) {
                    if (this.f35631a == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        throw new IllegalStateException(("network interceptor " + this.f35633c.get(this.f35634d - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.f35633c.get(this.f35634d - 1) + " must retain the same host and port").toString());
                }
            }
            C13840g m1420d = m1420d(this, this.f35634d + 1, null, request, 0, 0, 0, 58, null);
            Interceptor interceptor = this.f35633c.get(this.f35634d);
            Response intercept = interceptor.intercept(m1420d);
            if (intercept != null) {
                if (this.f35635e != null) {
                    if (this.f35634d + 1 < this.f35633c.size() && m1420d.f35631a != 1) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
                    }
                }
                if (intercept.m8699a() != null) {
                    z4 = true;
                }
                if (z4) {
                    return intercept;
                }
                throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: c */
    public final C13840g m1421c(int i, C13634c c13634c, Request request, int i2, int i3, int i4) {
        C9612q.m13917h(request, "request");
        return new C13840g(this.f35632b, this.f35633c, i, c13634c, request, i2, i3, i4);
    }

    @Override // okhttp3.Interceptor.Chain
    public Call call() {
        return this.f35632b;
    }

    /* renamed from: e */
    public final C13638e m1419e() {
        return this.f35632b;
    }

    /* renamed from: f */
    public final int m1418f() {
        return this.f35637g;
    }

    /* renamed from: g */
    public final C13634c m1417g() {
        return this.f35635e;
    }

    /* renamed from: h */
    public final int m1416h() {
        return this.f35638h;
    }

    /* renamed from: i */
    public final Request m1415i() {
        return this.f35636f;
    }

    /* renamed from: j */
    public final int m1414j() {
        return this.f35639i;
    }

    /* renamed from: k */
    public int m1413k() {
        return this.f35638h;
    }
}
