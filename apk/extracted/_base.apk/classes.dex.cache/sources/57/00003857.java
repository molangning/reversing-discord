package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;

/* renamed from: io.sentry.android.core.e1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C7723e1 {

    /* renamed from: a */
    private final Handler f21179a;

    public C7723e1() {
        this(Looper.getMainLooper());
    }

    /* renamed from: a */
    public Thread m19902a() {
        return this.f21179a.getLooper().getThread();
    }

    /* renamed from: b */
    public void m19901b(Runnable runnable) {
        this.f21179a.post(runnable);
    }

    C7723e1(Looper looper) {
        this.f21179a = new Handler(looper);
    }
}