package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1693k {

    /* renamed from: a */
    private static AtomicBoolean f4510a = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1694a extends C1680d {
        C1694a() {
        }

        @Override // androidx.lifecycle.C1680d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            FragmentC1705v.m36017g(activity);
        }

        @Override // androidx.lifecycle.C1680d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // androidx.lifecycle.C1680d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    public static void m36035a(Context context) {
        if (f4510a.getAndSet(true)) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1694a());
    }
}