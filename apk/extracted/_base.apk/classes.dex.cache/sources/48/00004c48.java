package p328rj;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m14357d2 = {"Lrj/p;", "", "", "toString", "j", "Ljava/lang/String;", "protocol", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "r", "a", "k", "l", "m", "n", "o", "p", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: rj.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public enum EnumC12312p {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: r */
    public static final C12313a f32093r = new C12313a(null);

    /* renamed from: j */
    private final String f32094j;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m14357d2 = {"Lrj/p$a;", "", "", "protocol", "Lrj/p;", "a", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: rj.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12313a {
        private C12313a() {
        }

        public /* synthetic */ C12313a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EnumC12312p m5508a(String protocol) {
            C9612q.m13917h(protocol, "protocol");
            EnumC12312p enumC12312p = EnumC12312p.HTTP_1_0;
            if (!C9612q.m13922c(protocol, enumC12312p.f32094j)) {
                enumC12312p = EnumC12312p.HTTP_1_1;
                if (!C9612q.m13922c(protocol, enumC12312p.f32094j)) {
                    enumC12312p = EnumC12312p.H2_PRIOR_KNOWLEDGE;
                    if (!C9612q.m13922c(protocol, enumC12312p.f32094j)) {
                        enumC12312p = EnumC12312p.HTTP_2;
                        if (!C9612q.m13922c(protocol, enumC12312p.f32094j)) {
                            enumC12312p = EnumC12312p.SPDY_3;
                            if (!C9612q.m13922c(protocol, enumC12312p.f32094j)) {
                                enumC12312p = EnumC12312p.QUIC;
                                if (!C9612q.m13922c(protocol, enumC12312p.f32094j)) {
                                    throw new IOException("Unexpected protocol: " + protocol);
                                }
                            }
                        }
                    }
                }
            }
            return enumC12312p;
        }
    }

    EnumC12312p(String str) {
        this.f32094j = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f32094j;
    }
}