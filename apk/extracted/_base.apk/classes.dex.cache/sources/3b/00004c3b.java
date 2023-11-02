package p328rj;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9538f;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0006J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, m14357d2 = {"Lrj/l;", "", "", "hostname", "", "Ljava/net/InetAddress;", "a", "b", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: rj.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public interface InterfaceC12299l {

    /* renamed from: b */
    public static final C12300a f32074b = new C12300a(null);

    /* renamed from: a */
    public static final InterfaceC12299l f32073a = new C12300a.C12301a();

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, m14357d2 = {"Lrj/l$a;", "", "Lrj/l;", "SYSTEM", "Lrj/l;", "<init>", "()V", "a", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: rj.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12300a {

        @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, m14357d2 = {"Lrj/l$a$a;", "Lrj/l;", "", "hostname", "", "Ljava/net/InetAddress;", "a", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* renamed from: rj.l$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        private static final class C12301a implements InterfaceC12299l {
            @Override // p328rj.InterfaceC12299l
            /* renamed from: a */
            public List<InetAddress> mo5548a(String hostname) {
                List<InetAddress> m14197u0;
                C9612q.m13917h(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    C9612q.m13918g(allByName, "InetAddress.getAllByName(hostname)");
                    m14197u0 = C9538f.m14197u0(allByName);
                    return m14197u0;
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        private C12300a() {
        }

        public /* synthetic */ C12300a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    List<InetAddress> mo5548a(String str);
}