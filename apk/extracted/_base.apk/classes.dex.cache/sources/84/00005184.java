package p410wj;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import pf.C11560f;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R$\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0012"}, m14357d2 = {"Lwj/j;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "e", "", "a", "<set-?>", "j", "Ljava/io/IOException;", "c", "()Ljava/io/IOException;", "lastConnectException", "k", "b", "firstConnectException", "<init>", "(Ljava/io/IOException;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: wj.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13652j extends RuntimeException {

    /* renamed from: j */
    private IOException f35115j;

    /* renamed from: k */
    private final IOException f35116k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13652j(IOException firstConnectException) {
        super(firstConnectException);
        C9612q.m13917h(firstConnectException, "firstConnectException");
        this.f35116k = firstConnectException;
        this.f35115j = firstConnectException;
    }

    /* renamed from: a */
    public final void m1930a(IOException e) {
        C9612q.m13917h(e, "e");
        C11560f.m7637a(this.f35116k, e);
        this.f35115j = e;
    }

    /* renamed from: b */
    public final IOException m1929b() {
        return this.f35116k;
    }

    /* renamed from: c */
    public final IOException m1928c() {
        return this.f35115j;
    }
}