package p451yj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import okio.BufferedSource;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m14357d2 = {"Lyj/a;", "", "", "b", "Lokhttp3/Headers;", "a", "", "J", "headerLimit", "Lokio/BufferedSource;", "Lokio/BufferedSource;", "getSource", "()Lokio/BufferedSource;", "source", "<init>", "(Lokio/BufferedSource;)V", "c", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: yj.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C14033a {

    /* renamed from: c */
    public static final C14034a f36065c = new C14034a(null);

    /* renamed from: a */
    private long f36066a;

    /* renamed from: b */
    private final BufferedSource f36067b;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lyj/a$a;", "", "", "HEADER_LIMIT", "I", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: yj.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C14034a {
        private C14034a() {
        }

        public /* synthetic */ C14034a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14033a(BufferedSource source) {
        C9612q.m13917h(source, "source");
        this.f36067b = source;
        this.f36066a = 262144;
    }

    /* renamed from: a */
    public final Headers m855a() {
        boolean z;
        Headers.C11194a c11194a = new Headers.C11194a();
        while (true) {
            String m854b = m854b();
            if (m854b.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return c11194a.m8919d();
            }
            c11194a.m8921b(m854b);
        }
    }

    /* renamed from: b */
    public final String m854b() {
        String mo8597F = this.f36067b.mo8597F(this.f36066a);
        this.f36066a -= mo8597F.length();
        return mo8597F;
    }
}
