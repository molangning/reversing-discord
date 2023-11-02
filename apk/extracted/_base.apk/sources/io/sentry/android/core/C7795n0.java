package io.sentry.android.core;

/* renamed from: io.sentry.android.core.n0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7795n0 {

    /* renamed from: b */
    private static C7795n0 f21325b = new C7795n0();

    /* renamed from: a */
    private Boolean f21326a = null;

    private C7795n0() {
    }

    /* renamed from: a */
    public static C7795n0 m19709a() {
        return f21325b;
    }

    /* renamed from: b */
    public Boolean m19708b() {
        return this.f21326a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void m19707c(boolean z) {
        this.f21326a = Boolean.valueOf(z);
    }
}
