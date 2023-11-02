package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import lb.C10106d;
import p119g9.C6587j;

/* renamed from: com.google.firebase.messaging.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5080e0 {

    /* renamed from: a */
    private final Context f14332a;

    /* renamed from: b */
    private String f14333b;

    /* renamed from: c */
    private String f14334c;

    /* renamed from: d */
    private int f14335d;

    /* renamed from: e */
    private int f14336e = 0;

    public C5080e0(Context context) {
        this.f14332a = context;
    }

    /* renamed from: c */
    public static String m26278c(C10106d c10106d) {
        String m12269d = c10106d.m12293m().m12269d();
        if (m12269d != null) {
            return m12269d;
        }
        String m12270c = c10106d.m12293m().m12270c();
        if (!m12270c.startsWith("1:")) {
            return m12270c;
        }
        String[] split = m12270c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: f */
    private PackageInfo m26275f(String str) {
        try {
            return this.f14332a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    /* renamed from: h */
    private synchronized void m26273h() {
        PackageInfo m26275f = m26275f(this.f14332a.getPackageName());
        if (m26275f != null) {
            this.f14333b = Integer.toString(m26275f.versionCode);
            this.f14334c = m26275f.versionName;
        }
    }

    /* renamed from: a */
    public synchronized String m26280a() {
        if (this.f14333b == null) {
            m26273h();
        }
        return this.f14333b;
    }

    /* renamed from: b */
    public synchronized String m26279b() {
        if (this.f14334c == null) {
            m26273h();
        }
        return this.f14334c;
    }

    /* renamed from: d */
    public synchronized int m26277d() {
        PackageInfo m26275f;
        if (this.f14335d == 0 && (m26275f = m26275f("com.google.android.gms")) != null) {
            this.f14335d = m26275f.versionCode;
        }
        return this.f14335d;
    }

    /* renamed from: e */
    synchronized int m26276e() {
        int i = this.f14336e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f14332a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C6587j.m22360h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f14336e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f14336e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (C6587j.m22360h()) {
            this.f14336e = 2;
        } else {
            this.f14336e = 1;
        }
        return this.f14336e;
    }

    /* renamed from: g */
    public boolean m26274g() {
        return m26276e() != 0;
    }
}