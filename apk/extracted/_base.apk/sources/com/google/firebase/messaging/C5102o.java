package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5102o implements Application.ActivityLifecycleCallbacks {

    /* renamed from: j */
    private final Set<Intent> f14365j = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m26201b(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Bundle bundle = extras.getBundle("gcm.n.analytics_data");
            if (C5077d0.m26307B(bundle)) {
                C5077d0.m26286u(bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        final Intent intent = activity.getIntent();
        if (intent != null && this.f14365j.add(intent)) {
            if (Build.VERSION.SDK_INT <= 24) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.firebase.messaging.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5102o.this.m26201b(intent);
                    }
                });
            } else {
                m26201b(intent);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f14365j.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
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
