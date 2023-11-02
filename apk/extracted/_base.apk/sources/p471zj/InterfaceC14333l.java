package p471zj;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.BufferedSource;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\u0013J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J&\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0007H&J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H&J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0014"}, m14357d2 = {"Lzj/l;", "", "", "streamId", "", "Lzj/c;", "requestHeaders", "", "b", "responseHeaders", "last", "c", "Lokio/BufferedSource;", "source", "byteCount", "d", "Lzj/b;", "errorCode", "", "a", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: zj.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public interface InterfaceC14333l {

    /* renamed from: b */
    public static final C14334a f36917b = new C14334a(null);

    /* renamed from: a */
    public static final InterfaceC14333l f36916a = new C14334a.C14335a();

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, m14357d2 = {"Lzj/l$a;", "", "Lzj/l;", "CANCEL", "Lzj/l;", "<init>", "()V", "a", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C14334a {

        @Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J&\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0016J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¨\u0006\u0016"}, m14357d2 = {"Lzj/l$a$a;", "Lzj/l;", "", "streamId", "", "Lzj/c;", "requestHeaders", "", "b", "responseHeaders", "last", "c", "Lokio/BufferedSource;", "source", "byteCount", "d", "Lzj/b;", "errorCode", "", "a", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* renamed from: zj.l$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        private static final class C14335a implements InterfaceC14333l {
            @Override // p471zj.InterfaceC14333l
            /* renamed from: a */
            public void mo12a(int i, EnumC14291b errorCode) {
                C9612q.m13917h(errorCode, "errorCode");
            }

            @Override // p471zj.InterfaceC14333l
            /* renamed from: b */
            public boolean mo11b(int i, List<C14293c> requestHeaders) {
                C9612q.m13917h(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // p471zj.InterfaceC14333l
            /* renamed from: c */
            public boolean mo10c(int i, List<C14293c> responseHeaders, boolean z) {
                C9612q.m13917h(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // p471zj.InterfaceC14333l
            /* renamed from: d */
            public boolean mo9d(int i, BufferedSource source, int i2, boolean z) {
                C9612q.m13917h(source, "source");
                source.skip(i2);
                return true;
            }
        }

        private C14334a() {
        }

        public /* synthetic */ C14334a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    void mo12a(int i, EnumC14291b enumC14291b);

    /* renamed from: b */
    boolean mo11b(int i, List<C14293c> list);

    /* renamed from: c */
    boolean mo10c(int i, List<C14293c> list, boolean z);

    /* renamed from: d */
    boolean mo9d(int i, BufferedSource bufferedSource, int i2, boolean z);
}
