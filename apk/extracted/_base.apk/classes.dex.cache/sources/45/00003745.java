package p154i9;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import p119g9.C6587j;

/* renamed from: i9.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7477c {

    /* renamed from: a */
    protected final Context f20079a;

    public C7477c(Context context) {
        this.f20079a = context;
    }

    /* renamed from: a */
    public int m20604a(String str) {
        return this.f20079a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: b */
    public int m20603b(String str, String str2) {
        return this.f20079a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: c */
    public ApplicationInfo m20602c(String str, int i) {
        return this.f20079a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: d */
    public CharSequence m20601d(String str) {
        return this.f20079a.getPackageManager().getApplicationLabel(this.f20079a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: e */
    public PackageInfo m20600e(String str, int i) {
        return this.f20079a.getPackageManager().getPackageInfo(str, i);
    }

    @TargetApi(19)
    /* renamed from: f */
    public final boolean m20599f(int i, String str) {
        if (C6587j.m22364d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f20079a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f20079a.getPackageManager().getPackagesForUid(i);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}