package p328rj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okhttp3.Response;
import okhttp3.WebSocket;
import okio.ByteString;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0016J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0017"}, m14357d2 = {"Lrj/s;", "", "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/Response;", "response", "", "onOpen", "", "text", "onMessage", "Lokio/ByteString;", "bytes", "", "code", "reason", "onClosing", "onClosed", "", "t", "onFailure", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: rj.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public abstract class AbstractC12317s {
    public void onClosed(WebSocket webSocket, int i, String reason) {
        C9612q.m13917h(webSocket, "webSocket");
        C9612q.m13917h(reason, "reason");
    }

    public void onClosing(WebSocket webSocket, int i, String reason) {
        C9612q.m13917h(webSocket, "webSocket");
        C9612q.m13917h(reason, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable t, Response response) {
        C9612q.m13917h(webSocket, "webSocket");
        C9612q.m13917h(t, "t");
    }

    public void onMessage(WebSocket webSocket, String text) {
        C9612q.m13917h(webSocket, "webSocket");
        C9612q.m13917h(text, "text");
    }

    public void onMessage(WebSocket webSocket, ByteString bytes) {
        C9612q.m13917h(webSocket, "webSocket");
        C9612q.m13917h(bytes, "bytes");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        C9612q.m13917h(webSocket, "webSocket");
        C9612q.m13917h(response, "response");
    }
}
