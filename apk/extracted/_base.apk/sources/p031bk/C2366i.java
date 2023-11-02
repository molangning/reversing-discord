package p031bk;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p328rj.EnumC12312p;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\u000f"}, m14357d2 = {"Lbk/i;", "Lbk/k;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lrj/p;", "protocols", "", "e", "h", "<init>", "()V", "a", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: bk.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class C2366i extends C2370k {

    /* renamed from: d */
    private static final boolean f6484d;

    /* renamed from: e */
    public static final C2367a f6485e = new C2367a(null);

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m14357d2 = {"Lbk/i$a;", "", "Lbk/i;", "a", "", "isAvailable", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: bk.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C2367a {
        private C2367a() {
        }

        public /* synthetic */ C2367a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C2366i m33615a() {
            if (m33614b()) {
                return new C2366i();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m33614b() {
            return C2366i.f6484d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r1.intValue() >= 9) goto L9;
     */
    static {
        /*
            bk.i$a r0 = new bk.i$a
            r1 = 0
            r0.<init>(r1)
            p031bk.C2366i.f6485e = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L14
            java.lang.Integer r1 = kotlin.text.C9642f.m13801m(r0)
        L14:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L23
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L21
            goto L2c
        L21:
            r0 = r2
            goto L2c
        L23:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L21
            r1.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L21
        L2c:
            p031bk.C2366i.f6484d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p031bk.C2366i.<clinit>():void");
    }

    @Override // p031bk.C2370k
    /* renamed from: e */
    public void mo33606e(SSLSocket sslSocket, String str, List<EnumC12312p> protocols) {
        C9612q.m13917h(sslSocket, "sslSocket");
        C9612q.m13917h(protocols, "protocols");
        SSLParameters sslParameters = sslSocket.getSSLParameters();
        List<String> m33593b = C2370k.f6491c.m33593b(protocols);
        C9612q.m13918g(sslParameters, "sslParameters");
        Object[] array = m33593b.toArray(new String[0]);
        if (array != null) {
            sslParameters.setApplicationProtocols((String[]) array);
            sslSocket.setSSLParameters(sslParameters);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // p031bk.C2370k
    /* renamed from: h */
    public String mo33603h(SSLSocket sslSocket) {
        String applicationProtocol;
        C9612q.m13917h(sslSocket, "sslSocket");
        try {
            applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.hashCode() == 0) {
                if (applicationProtocol.equals("")) {
                    return null;
                }
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
