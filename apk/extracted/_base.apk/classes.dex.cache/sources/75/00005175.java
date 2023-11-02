package p410wj;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p328rj.AbstractC12302m;
import p328rj.C12271a;
import p328rj.C12314q;
import p410wj.C13653k;
import p431xj.C13840g;
import p431xj.InterfaceC13837d;
import p471zj.C14290a;
import p471zj.C14338n;
import p471zj.EnumC14291b;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204¢\u0006\u0004\b8\u00109J8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J0\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010 R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0018\u0010(\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u001a\u0010/\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010-\u001a\u0004\b$\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, m14357d2 = {"Lwj/d;", "", "", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "", "connectionRetryEnabled", "doExtensiveHealthChecks", "Lwj/f;", "c", "b", "Lrj/q;", "f", "Lokhttp3/OkHttpClient;", "client", "Lxj/g;", "chain", "Lxj/d;", "a", "Ljava/io/IOException;", "e", "", "h", "Lokhttp3/HttpUrl;", "url", "g", "Lwj/k$b;", "Lwj/k$b;", "routeSelection", "Lwj/k;", "Lwj/k;", "routeSelector", "I", "refusedStreamCount", "d", "connectionShutdownCount", "otherFailureCount", "Lrj/q;", "nextRouteToTry", "Lwj/h;", "Lwj/h;", "connectionPool", "Lrj/a;", "Lrj/a;", "()Lrj/a;", "address", "Lwj/e;", "i", "Lwj/e;", "call", "Lrj/m;", "j", "Lrj/m;", "eventListener", "<init>", "(Lwj/h;Lrj/a;Lwj/e;Lrj/m;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: wj.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13637d {

    /* renamed from: a */
    private C13653k.C13655b f35048a;

    /* renamed from: b */
    private C13653k f35049b;

    /* renamed from: c */
    private int f35050c;

    /* renamed from: d */
    private int f35051d;

    /* renamed from: e */
    private int f35052e;

    /* renamed from: f */
    private C12314q f35053f;

    /* renamed from: g */
    private final C13648h f35054g;

    /* renamed from: h */
    private final C12271a f35055h;

    /* renamed from: i */
    private final C13638e f35056i;

    /* renamed from: j */
    private final AbstractC12302m f35057j;

    public C13637d(C13648h connectionPool, C12271a address, C13638e call, AbstractC12302m eventListener) {
        C9612q.m13917h(connectionPool, "connectionPool");
        C9612q.m13917h(address, "address");
        C9612q.m13917h(call, "call");
        C9612q.m13917h(eventListener, "eventListener");
        this.f35054g = connectionPool;
        this.f35055h = address;
        this.f35056i = call;
        this.f35057j = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0150  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p410wj.C13642f m2012b(int r15, int r16, int r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p410wj.C13637d.m2012b(int, int, int, int, boolean):wj.f");
    }

    /* renamed from: c */
    private final C13642f m2011c(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        boolean z3;
        while (true) {
            C13642f m2012b = m2012b(i, i2, i3, i4, z);
            if (m2012b.m1944u(z2)) {
                return m2012b;
            }
            m2012b.m1939z();
            if (this.f35053f == null) {
                C13653k.C13655b c13655b = this.f35048a;
                boolean z4 = true;
                if (c13655b != null) {
                    z3 = c13655b.m1918b();
                } else {
                    z3 = true;
                }
                if (z3) {
                    continue;
                } else {
                    C13653k c13653k = this.f35049b;
                    if (c13653k != null) {
                        z4 = c13653k.m1926b();
                    }
                    if (!z4) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private final C12314q m2008f() {
        C13642f m1989n;
        if (this.f35050c > 1 || this.f35051d > 1 || this.f35052e > 0 || (m1989n = this.f35056i.m1989n()) == null) {
            return null;
        }
        synchronized (m1989n) {
            if (m1989n.m1948q() != 0) {
                return null;
            }
            if (!C12562c.m4804g(m1989n.m1970A().m5507a().m5618l(), this.f35055h.m5618l())) {
                return null;
            }
            return m1989n.m1970A();
        }
    }

    /* renamed from: a */
    public final InterfaceC13837d m2013a(OkHttpClient client, C13840g chain) {
        C9612q.m13917h(client, "client");
        C9612q.m13917h(chain, "chain");
        try {
            return m2011c(chain.m1418f(), chain.m1416h(), chain.m1414j(), client.m8823D(), client.m8817J(), !C9612q.m13922c(chain.m1415i().m8738h(), "GET")).m1942w(client, chain);
        } catch (IOException e) {
            m2006h(e);
            throw new C13652j(e);
        } catch (C13652j e2) {
            m2006h(e2.m1928c());
            throw e2;
        }
    }

    /* renamed from: d */
    public final C12271a m2010d() {
        return this.f35055h;
    }

    /* renamed from: e */
    public final boolean m2009e() {
        C13653k c13653k;
        if (this.f35050c == 0 && this.f35051d == 0 && this.f35052e == 0) {
            return false;
        }
        if (this.f35053f != null) {
            return true;
        }
        C12314q m2008f = m2008f();
        if (m2008f != null) {
            this.f35053f = m2008f;
            return true;
        }
        C13653k.C13655b c13655b = this.f35048a;
        if ((c13655b != null && c13655b.m1918b()) || (c13653k = this.f35049b) == null) {
            return true;
        }
        return c13653k.m1926b();
    }

    /* renamed from: g */
    public final boolean m2007g(HttpUrl url) {
        C9612q.m13917h(url, "url");
        HttpUrl m5618l = this.f35055h.m5618l();
        if (url.m8894m() == m5618l.m8894m() && C9612q.m13922c(url.m8899h(), m5618l.m8899h())) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void m2006h(IOException e) {
        C9612q.m13917h(e, "e");
        this.f35053f = null;
        if ((e instanceof C14338n) && ((C14338n) e).f36921j == EnumC14291b.REFUSED_STREAM) {
            this.f35050c++;
        } else if (e instanceof C14290a) {
            this.f35051d++;
        } else {
            this.f35052e++;
        }
    }
}