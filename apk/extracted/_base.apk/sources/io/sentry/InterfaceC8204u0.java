package io.sentry;

import java.util.concurrent.Future;

/* renamed from: io.sentry.u0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC8204u0 {
    /* renamed from: a */
    void mo18040a(long j);

    /* renamed from: b */
    Future<?> mo18039b(Runnable runnable, long j);

    boolean isClosed();

    Future<?> submit(Runnable runnable);
}
