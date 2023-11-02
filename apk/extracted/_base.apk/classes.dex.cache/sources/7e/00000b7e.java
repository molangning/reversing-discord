package ck;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p031bk.C2370k;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB3\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0000\u0012\u00020\t0\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005¨\u0006\u000f"}, m14357d2 = {"Lck/n;", "Lck/h;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocketFactory;", "h", "Ljava/lang/Class;", "sslSocketFactoryClass", "i", "paramClass", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V", "j", "a", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: ck.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C2686n extends C2672h {

    /* renamed from: j */
    public static final C2687a f7185j = new C2687a(null);

    /* renamed from: h */
    private final Class<? super SSLSocketFactory> f7186h;

    /* renamed from: i */
    private final Class<?> f7187i;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m14357d2 = {"Lck/n$a;", "", "", "packageName", "Lck/m;", "a", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: ck.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C2687a {
        private C2687a() {
        }

        public /* synthetic */ C2687a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC2685m m32719b(C2687a c2687a, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return c2687a.m32720a(str);
        }

        /* renamed from: a */
        public final InterfaceC2685m m32720a(String packageName) {
            C9612q.m13917h(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                Class<?> paramsClass = Class.forName(packageName + ".SSLParametersImpl");
                C9612q.m13918g(paramsClass, "paramsClass");
                return new C2686n(cls, cls2, paramsClass);
            } catch (Exception e) {
                C2370k.f6491c.m33588g().m33600k("unable to load android socket classes", 5, e);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2686n(Class<? super SSLSocket> sslSocketClass, Class<? super SSLSocketFactory> sslSocketFactoryClass, Class<?> paramClass) {
        super(sslSocketClass);
        C9612q.m13917h(sslSocketClass, "sslSocketClass");
        C9612q.m13917h(sslSocketFactoryClass, "sslSocketFactoryClass");
        C9612q.m13917h(paramClass, "paramClass");
        this.f7186h = sslSocketFactoryClass;
        this.f7187i = paramClass;
    }
}