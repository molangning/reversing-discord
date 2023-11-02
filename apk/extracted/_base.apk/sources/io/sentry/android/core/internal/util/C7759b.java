package io.sentry.android.core.internal.util;

import android.os.Looper;
import io.sentry.protocol.C8112w;
import io.sentry.util.thread.C8235a;
import io.sentry.util.thread.InterfaceC8236b;

/* renamed from: io.sentry.android.core.internal.util.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7759b implements InterfaceC8236b {

    /* renamed from: a */
    private static final C7759b f21257a = new C7759b();

    private C7759b() {
    }

    /* renamed from: d */
    public static C7759b m19778d() {
        return f21257a;
    }

    @Override // io.sentry.util.thread.InterfaceC8236b
    /* renamed from: a */
    public /* synthetic */ boolean mo18150a() {
        return C8235a.m18154a(this);
    }

    @Override // io.sentry.util.thread.InterfaceC8236b
    /* renamed from: b */
    public boolean mo18149b(long j) {
        return Looper.getMainLooper().getThread().getId() == j;
    }

    @Override // io.sentry.util.thread.InterfaceC8236b
    /* renamed from: c */
    public /* synthetic */ boolean mo18148c(Thread thread) {
        return C8235a.m18152c(this, thread);
    }

    /* renamed from: e */
    public /* synthetic */ boolean m19777e(C8112w c8112w) {
        return C8235a.m18153b(this, c8112w);
    }
}
