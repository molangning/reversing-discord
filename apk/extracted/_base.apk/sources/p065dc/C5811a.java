package p065dc;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.C0946a;
import p367ub.InterfaceC12944c;

/* renamed from: dc.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5811a {

    /* renamed from: a */
    private final Context f16630a;

    /* renamed from: b */
    private final SharedPreferences f16631b;

    /* renamed from: c */
    private final InterfaceC12944c f16632c;

    /* renamed from: d */
    private boolean f16633d;

    public C5811a(Context context, String str, InterfaceC12944c interfaceC12944c) {
        Context m24497a = m24497a(context);
        this.f16630a = m24497a;
        this.f16631b = m24497a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f16632c = interfaceC12944c;
        this.f16633d = m24495c();
    }

    /* renamed from: a */
    private static Context m24497a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return C0946a.m38402b(context);
    }

    /* renamed from: c */
    private boolean m24495c() {
        if (this.f16631b.contains("firebase_data_collection_default_enabled")) {
            return this.f16631b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return m24494d();
    }

    /* renamed from: d */
    private boolean m24494d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f16630a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.f16630a.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public synchronized boolean m24496b() {
        return this.f16633d;
    }
}
