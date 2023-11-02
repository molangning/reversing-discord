package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.C7687a1;
import io.sentry.C8132r4;
import io.sentry.Integration;
import io.sentry.InterfaceC8025n0;
import io.sentry.util.C8229o;
import java.io.Closeable;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class CurrentActivityIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: j */
    private final Application f21066j;

    public CurrentActivityIntegration(Application application) {
        this.f21066j = (Application) C8229o.m18169c(application, "Application is required");
    }

    /* renamed from: i */
    private void m19978i(Activity activity) {
        if (C7806r0.m19680c().m19681b() == activity) {
            C7806r0.m19680c().m19682a();
        }
    }

    /* renamed from: j */
    private void m19977j(Activity activity) {
        C7806r0.m19680c().m19679d(activity);
    }

    @Override // io.sentry.Integration
    /* renamed from: a */
    public void mo19952a(InterfaceC8025n0 interfaceC8025n0, C8132r4 c8132r4) {
        this.f21066j.registerActivityLifecycleCallbacks(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f21066j.unregisterActivityLifecycleCallbacks(this);
        C7806r0.m19680c().m19682a();
    }

    @Override // io.sentry.InterfaceC7832b1
    /* renamed from: h */
    public /* synthetic */ String mo19588h() {
        return C7687a1.m20045b(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        m19977j(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        m19978i(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        m19978i(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        m19977j(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m19977j(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m19978i(activity);
    }
}
