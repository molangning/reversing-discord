package p431xj;

import kotlin.Metadata;
import okhttp3.Request;
import okhttp3.Response;
import okio.Sink;
import okio.Source;
import p410wj.C13642f;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\bH&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0015\u001a\u00020\bH&R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m14357d2 = {"Lxj/d;", "", "Lokhttp3/Request;", "request", "", "contentLength", "Lokio/Sink;", "e", "", "f", "h", "a", "", "expectContinue", "Lokhttp3/Response$a;", "g", "Lokhttp3/Response;", "response", "d", "Lokio/Source;", "b", "cancel", "Lwj/f;", "c", "()Lwj/f;", "connection", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: xj.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public interface InterfaceC13837d {
    /* renamed from: a */
    void mo122a();

    /* renamed from: b */
    Source mo121b(Response response);

    /* renamed from: c */
    C13642f mo120c();

    void cancel();

    /* renamed from: d */
    long mo119d(Response response);

    /* renamed from: e */
    Sink mo118e(Request request, long j);

    /* renamed from: f */
    void mo117f(Request request);

    /* renamed from: g */
    Response.C11207a mo116g(boolean z);

    /* renamed from: h */
    void mo115h();
}