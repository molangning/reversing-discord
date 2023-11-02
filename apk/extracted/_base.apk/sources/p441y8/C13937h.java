package p441y8;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.concurrent.atomic.AtomicBoolean;
import p029b9.C2198p;
import p029b9.C2215v0;
import p119g9.C6583f;
import p119g9.C6587j;
import p119g9.C6592o;
import p154i9.C7478d;

/* renamed from: y8.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13937h {
    @Deprecated

    /* renamed from: a */
    public static final int f35888a = 12451000;

    /* renamed from: c */
    private static boolean f35890c = false;

    /* renamed from: d */
    static boolean f35891d = false;

    /* renamed from: b */
    static final AtomicBoolean f35889b = new AtomicBoolean();

    /* renamed from: e */
    private static final AtomicBoolean f35892e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static String m1116a(int i) {
        return C13930a.m1145J(i);
    }

    /* renamed from: b */
    public static Resources m1115b(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m1114c(Context context) {
        try {
            if (!f35891d) {
                PackageInfo m20600e = C7478d.m20598a(context).m20600e("com.google.android.gms", 64);
                C13938i.m1108a(context);
                if (m20600e != null && !C13938i.m1105d(m20600e, false) && C13938i.m1105d(m20600e, true)) {
                    f35890c = true;
                } else {
                    f35890c = false;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            f35891d = true;
        }
        if (!f35890c && C6583f.m22378b()) {
            return false;
        }
        return true;
    }

    @Deprecated
    /* renamed from: d */
    public static int m1113d(Context context, int i) {
        boolean z;
        boolean z2;
        PackageInfo packageInfo;
        try {
            context.getResources().getString(C13939j.f35895a);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f35892e.get()) {
            int m33957a = C2215v0.m33957a(context);
            if (m33957a != 0) {
                if (m33957a != f35888a) {
                    throw new GooglePlayServicesIncorrectManifestValueException(m33957a);
                }
            } else {
                throw new GooglePlayServicesMissingManifestValueException();
            }
        }
        if (!C6583f.m22376d(context) && !C6583f.m22374f(context)) {
            z = true;
        } else {
            z = false;
        }
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C2198p.m33994a(z2);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C13938i.m1108a(context);
            if (!C13938i.m1105d(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (z) {
                    C2198p.m33985j(packageInfo);
                    if (!C13938i.m1105d(packageInfo, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                    }
                }
                if (z && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                } else if (C6592o.m22349a(packageInfo2.versionCode) < C6592o.m22349a(i)) {
                    int i2 = packageInfo2.versionCode;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 82);
                    sb2.append("Google Play services out of date for ");
                    sb2.append(packageName);
                    sb2.append(".  Requires ");
                    sb2.append(i);
                    sb2.append(" but found ");
                    sb2.append(i2);
                    Log.w("GooglePlayServicesUtil", sb2.toString());
                    return 2;
                } else {
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e);
                            return 1;
                        }
                    }
                    if (applicationInfo.enabled) {
                        return 0;
                    }
                    return 3;
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @Deprecated
    /* renamed from: e */
    public static boolean m1112e(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m1109h(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    /* renamed from: f */
    public static boolean m1111f(Context context) {
        if (C6587j.m22365c()) {
            Object systemService = context.getSystemService("user");
            C2198p.m33985j(systemService);
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Deprecated
    /* renamed from: g */
    public static boolean m1110g(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(21)
    /* renamed from: h */
    public static boolean m1109h(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (C6587j.m22362f()) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (equals) {
            return applicationInfo.enabled;
        }
        if (applicationInfo.enabled && !m1111f(context)) {
            return true;
        }
        return false;
    }
}
