package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import io.sentry.AbstractC8003k3;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class SentryPerformanceProvider extends AbstractC7816v0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n */
    private static AbstractC8003k3 f21104n = C7807s.m19678a();

    /* renamed from: o */
    private static long f21105o = SystemClock.uptimeMillis();

    /* renamed from: k */
    private boolean f21106k = false;

    /* renamed from: l */
    private boolean f21107l = false;

    /* renamed from: m */
    private Application f21108m;

    public SentryPerformanceProvider() {
        C7792m0.m19723e().m19719i(f21105o, f21104n);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (!SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            super.attachInfo(context, providerInfo);
            return;
        }
        throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        boolean z;
        if (!this.f21106k) {
            if (bundle == null) {
                z = true;
            } else {
                z = false;
            }
            C7792m0.m19723e().m19718j(z);
            this.f21106k = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (!this.f21107l) {
            this.f21107l = true;
            C7792m0.m19723e().m19721g();
        }
        Application application = this.f21108m;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this);
        }
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

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        if (context instanceof Application) {
            Application application = (Application) context;
            this.f21108m = application;
            application.registerActivityLifecycleCallbacks(this);
            return true;
        }
        return true;
    }
}
