package p431xj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m14357d2 = {"Lxj/h;", "Lokhttp3/ResponseBody;", "", "contentLength", "Lokhttp3/MediaType;", "contentType", "Lokio/BufferedSource;", "source", "", "j", "Ljava/lang/String;", "contentTypeString", "k", "J", "l", "Lokio/BufferedSource;", "<init>", "(Ljava/lang/String;JLokio/BufferedSource;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: xj.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13841h extends ResponseBody {

    /* renamed from: j */
    private final String f35640j;

    /* renamed from: k */
    private final long f35641k;

    /* renamed from: l */
    private final BufferedSource f35642l;

    public C13841h(String str, long j, BufferedSource source) {
        C9612q.m13917h(source, "source");
        this.f35640j = str;
        this.f35641k = j;
        this.f35642l = source;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.f35641k;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.f35640j;
        if (str != null) {
            return MediaType.f29321g.m8836b(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public BufferedSource source() {
        return this.f35642l;
    }
}