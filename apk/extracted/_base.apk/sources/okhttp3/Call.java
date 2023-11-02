package okhttp3;

import kotlin.Metadata;
import p328rj.InterfaceC12283d;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\rJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\u000bH&¨\u0006\u000e"}, m14357d2 = {"Lokhttp3/Call;", "", "Lokhttp3/Request;", "a", "Lokhttp3/Response;", "execute", "Lrj/d;", "responseCallback", "", "i", "cancel", "", "o", "Factory", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public interface Call extends Cloneable {

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m14357d2 = {"Lokhttp3/Call$Factory;", "", "Lokhttp3/Request;", "request", "Lokhttp3/Call;", "b", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface Factory {
        /* renamed from: b */
        Call mo8811b(Request request);
    }

    /* renamed from: a */
    Request mo2001a();

    void cancel();

    Response execute();

    /* renamed from: i */
    void mo1994i(InterfaceC12283d interfaceC12283d);

    /* renamed from: o */
    boolean mo1988o();
}
