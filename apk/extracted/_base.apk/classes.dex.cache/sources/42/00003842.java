package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import io.sentry.C7687a1;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.Integration;
import io.sentry.InterfaceC8025n0;
import io.sentry.InterfaceC8040o0;
import io.sentry.android.core.internal.gestures.C7748h;
import io.sentry.android.core.internal.gestures.GestureDetector$OnGestureListenerC7745g;
import io.sentry.android.core.internal.gestures.Window$CallbackC7740b;
import io.sentry.util.C8229o;
import java.io.Closeable;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class UserInteractionIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: j */
    private final Application f21119j;

    /* renamed from: k */
    private InterfaceC8025n0 f21120k;

    /* renamed from: l */
    private SentryAndroidOptions f21121l;

    /* renamed from: m */
    private final boolean f21122m;

    public UserInteractionIntegration(Application application, C7720d1 c7720d1) {
        this.f21119j = (Application) C8229o.m18169c(application, "Application is required");
        this.f21122m = c7720d1.m19905b("androidx.core.view.GestureDetectorCompat", this.f21121l);
    }

    /* renamed from: j */
    private void m19950j(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f21121l;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo18135c(EnumC8021m4.INFO, "Window was null in startTracking", new Object[0]);
            }
        } else if (this.f21120k != null && this.f21121l != null) {
            Window.Callback callback = window.getCallback();
            if (callback == null) {
                callback = new Window$CallbackC7740b();
            }
            window.setCallback(new C7748h(callback, activity, new GestureDetector$OnGestureListenerC7745g(activity, this.f21120k, this.f21121l), this.f21121l));
        }
    }

    /* renamed from: m */
    private void m19949m(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f21121l;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo18135c(EnumC8021m4.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C7748h) {
            C7748h c7748h = (C7748h) callback;
            c7748h.m19797c();
            if (c7748h.m19799a() instanceof Window$CallbackC7740b) {
                window.setCallback(null);
            } else {
                window.setCallback(c7748h.m19799a());
            }
        }
    }

    @Override // io.sentry.Integration
    /* renamed from: a */
    public void mo19952a(InterfaceC8025n0 interfaceC8025n0, C8132r4 c8132r4) {
        SentryAndroidOptions sentryAndroidOptions;
        boolean z;
        if (c8132r4 instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) c8132r4;
        } else {
            sentryAndroidOptions = null;
        }
        this.f21121l = (SentryAndroidOptions) C8229o.m18169c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f21120k = (InterfaceC8025n0) C8229o.m18169c(interfaceC8025n0, "Hub is required");
        if (!this.f21121l.isEnableUserInteractionBreadcrumbs() && !this.f21121l.isEnableUserInteractionTracing()) {
            z = false;
        } else {
            z = true;
        }
        InterfaceC8040o0 logger = this.f21121l.getLogger();
        EnumC8021m4 enumC8021m4 = EnumC8021m4.DEBUG;
        logger.mo18135c(enumC8021m4, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z));
        if (z) {
            if (this.f21122m) {
                this.f21119j.registerActivityLifecycleCallbacks(this);
                this.f21121l.getLogger().mo18135c(enumC8021m4, "UserInteractionIntegration installed.", new Object[0]);
                m19951i();
                return;
            }
            c8132r4.getLogger().mo18135c(EnumC8021m4.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f21119j.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f21121l;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo18135c(EnumC8021m4.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC7832b1
    /* renamed from: h */
    public /* synthetic */ String mo19588h() {
        return C7687a1.m20045b(this);
    }

    /* renamed from: i */
    public /* synthetic */ void m19951i() {
        C7687a1.m20046a(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        m19949m(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        m19950j(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}