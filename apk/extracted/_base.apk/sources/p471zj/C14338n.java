package p471zj;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m14357d2 = {"Lzj/n;", "Ljava/io/IOException;", "Lzj/b;", "j", "Lzj/b;", "errorCode", "<init>", "(Lzj/b;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: zj.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C14338n extends IOException {

    /* renamed from: j */
    public final EnumC14291b f36921j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14338n(EnumC14291b errorCode) {
        super("stream was reset: " + errorCode);
        C9612q.m13917h(errorCode, "errorCode");
        this.f36921j = errorCode;
    }
}
