package io.sentry.android.core.internal.util;

import android.os.SystemClock;
import io.sentry.transport.InterfaceC8189o;

/* renamed from: io.sentry.android.core.internal.util.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7758a implements InterfaceC8189o {

    /* renamed from: a */
    private static final InterfaceC8189o f21256a = new C7758a();

    private C7758a() {
    }

    /* renamed from: b */
    public static InterfaceC8189o m19779b() {
        return f21256a;
    }

    @Override // io.sentry.transport.InterfaceC8189o
    /* renamed from: a */
    public long mo18303a() {
        return SystemClock.uptimeMillis();
    }
}
