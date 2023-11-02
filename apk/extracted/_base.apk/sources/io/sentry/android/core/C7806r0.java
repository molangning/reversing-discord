package io.sentry.android.core;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: io.sentry.android.core.r0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7806r0 {

    /* renamed from: b */
    private static final C7806r0 f21354b = new C7806r0();

    /* renamed from: a */
    private WeakReference<Activity> f21355a;

    private C7806r0() {
    }

    /* renamed from: c */
    public static C7806r0 m19680c() {
        return f21354b;
    }

    /* renamed from: a */
    public void m19682a() {
        this.f21355a = null;
    }

    /* renamed from: b */
    public Activity m19681b() {
        WeakReference<Activity> weakReference = this.f21355a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: d */
    public void m19679d(Activity activity) {
        WeakReference<Activity> weakReference = this.f21355a;
        if (weakReference != null && weakReference.get() == activity) {
            return;
        }
        this.f21355a = new WeakReference<>(activity);
    }
}
