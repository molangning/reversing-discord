package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.C4713b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;
import p119g9.C6587j;

/* renamed from: com.google.firebase.messaging.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5095k0 {
    /* renamed from: b */
    private static boolean m26230b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    /* renamed from: c */
    public static void m26229c(Context context) {
        if (C5097l0.m26212b(context)) {
            return;
        }
        m26227e(new ExecutorC5082f(), context, m26226f(context));
    }

    /* renamed from: d */
    public static /* synthetic */ void m26228d(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
        String notificationDelegate;
        try {
            if (!m26230b(context)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            C5097l0.m26211c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else {
                notificationDelegate = notificationManager.getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    notificationManager.setNotificationDelegate(null);
                }
            }
        } finally {
            taskCompletionSource.m28009e(null);
        }
    }

    @TargetApi(29)
    /* renamed from: e */
    static Task<Void> m26227e(Executor executor, final Context context, final boolean z) {
        if (!C6587j.m22358j()) {
            return C4713b.m28004e(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.j0
            @Override // java.lang.Runnable
            public final void run() {
                C5095k0.m26228d(context, z, taskCompletionSource);
            }
        });
        return taskCompletionSource.m28013a();
    }

    /* renamed from: f */
    private static boolean m26226f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}