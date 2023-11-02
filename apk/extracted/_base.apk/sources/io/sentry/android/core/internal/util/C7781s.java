package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.view.Window;
import io.sentry.android.core.internal.util.C7777r;

/* renamed from: io.sentry.android.core.internal.util.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final /* synthetic */ class C7781s {
    /* renamed from: a */
    public static void m19730a(C7777r.InterfaceC7780c interfaceC7780c, Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler) {
        window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, handler);
    }

    /* renamed from: b */
    public static void m19729b(C7777r.InterfaceC7780c interfaceC7780c, Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
        window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
    }
}
