package p328rj;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okio.ByteString;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\n"}, m14357d2 = {"Lrj/k;", "", "", "username", "password", "Ljava/nio/charset/Charset;", "charset", "a", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: rj.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C12298k {

    /* renamed from: a */
    public static final C12298k f32072a = new C12298k();

    private C12298k() {
    }

    /* renamed from: a */
    public static final String m5549a(String username, String password, Charset charset) {
        C9612q.m13917h(username, "username");
        C9612q.m13917h(password, "password");
        C9612q.m13917h(charset, "charset");
        String mo8572a = ByteString.f29482n.m8548c(username + ':' + password, charset).mo8572a();
        return "Basic " + mo8572a;
    }
}
