package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.firebase.messaging.q0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5108q0 {

    /* renamed from: e */
    private static C5108q0 f14371e;

    /* renamed from: a */
    private String f14372a = null;

    /* renamed from: b */
    private Boolean f14373b = null;

    /* renamed from: c */
    private Boolean f14374c = null;

    /* renamed from: d */
    private final Queue<Intent> f14375d = new ArrayDeque();

    private C5108q0() {
    }

    /* renamed from: a */
    private int m26195a(Context context, Intent intent) {
        ComponentName startService;
        String m26190f = m26190f(context, intent);
        if (m26190f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + m26190f);
            }
            intent.setClassName(context.getPackageName(), m26190f);
        }
        try {
            if (m26191e(context)) {
                startService = C5066a1.m26343e(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (startService == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                return 404;
            }
            return -1;
        } catch (IllegalStateException e) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
            return 402;
        } catch (SecurityException e2) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
            return 401;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static synchronized C5108q0 m26194b() {
        C5108q0 c5108q0;
        synchronized (C5108q0.class) {
            if (f14371e == null) {
                f14371e = new C5108q0();
            }
            c5108q0 = f14371e;
        }
        return c5108q0;
    }

    /* renamed from: f */
    private synchronized String m26190f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2 = this.f14372a;
        if (str2 != null) {
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                if (str.startsWith(".")) {
                    this.f14372a = context.getPackageName() + serviceInfo.name;
                } else {
                    this.f14372a = serviceInfo.name;
                }
                return this.f14372a;
            }
            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
            return null;
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Intent m26193c() {
        return this.f14375d.poll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m26192d(Context context) {
        boolean z;
        if (this.f14374c == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f14374c = Boolean.valueOf(z);
        }
        if (!this.f14373b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f14374c.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m26191e(Context context) {
        boolean z;
        if (this.f14373b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f14373b = Boolean.valueOf(z);
        }
        if (!this.f14373b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f14373b.booleanValue();
    }

    /* renamed from: g */
    public int m26189g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f14375d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m26195a(context, intent2);
    }
}
