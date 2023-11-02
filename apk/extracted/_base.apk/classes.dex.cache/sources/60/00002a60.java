package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p119g9.C6587j;

/* renamed from: com.google.android.gms.common.api.internal.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ComponentCallbacks2C4609a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: n */
    private static final ComponentCallbacks2C4609a f12661n = new ComponentCallbacks2C4609a();

    /* renamed from: j */
    private final AtomicBoolean f12662j = new AtomicBoolean();

    /* renamed from: k */
    private final AtomicBoolean f12663k = new AtomicBoolean();

    /* renamed from: l */
    private final ArrayList<InterfaceC4610a> f12664l = new ArrayList<>();

    /* renamed from: m */
    private boolean f12665m = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4610a {
        /* renamed from: a */
        void mo12280a(boolean z);
    }

    private ComponentCallbacks2C4609a() {
    }

    /* renamed from: b */
    public static ComponentCallbacks2C4609a m28228b() {
        return f12661n;
    }

    /* renamed from: c */
    public static void m28227c(Application application) {
        ComponentCallbacks2C4609a componentCallbacks2C4609a = f12661n;
        synchronized (componentCallbacks2C4609a) {
            if (!componentCallbacks2C4609a.f12665m) {
                application.registerActivityLifecycleCallbacks(componentCallbacks2C4609a);
                application.registerComponentCallbacks(componentCallbacks2C4609a);
                componentCallbacks2C4609a.f12665m = true;
            }
        }
    }

    /* renamed from: f */
    private final void m28224f(boolean z) {
        synchronized (f12661n) {
            Iterator<InterfaceC4610a> it = this.f12664l.iterator();
            while (it.hasNext()) {
                it.next().mo12280a(z);
            }
        }
    }

    /* renamed from: a */
    public void m28229a(InterfaceC4610a interfaceC4610a) {
        synchronized (f12661n) {
            this.f12664l.add(interfaceC4610a);
        }
    }

    /* renamed from: d */
    public boolean m28226d() {
        return this.f12662j.get();
    }

    @TargetApi(16)
    /* renamed from: e */
    public boolean m28225e(boolean z) {
        if (!this.f12663k.get()) {
            if (C6587j.m22366b()) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                if (!this.f12663k.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                    this.f12662j.set(true);
                }
            } else {
                return z;
            }
        }
        return m28226d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f12662j.compareAndSet(true, false);
        this.f12663k.set(true);
        if (compareAndSet) {
            m28224f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f12662j.compareAndSet(true, false);
        this.f12663k.set(true);
        if (compareAndSet) {
            m28224f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f12662j.compareAndSet(false, true)) {
            this.f12663k.set(true);
            m28224f(true);
        }
    }
}