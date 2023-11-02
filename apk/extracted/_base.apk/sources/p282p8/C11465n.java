package p282p8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.gtm.zzav;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p029b9.C2198p;

@SuppressLint({"StaticFieldLeak"})
/* renamed from: p8.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11465n {

    /* renamed from: g */
    private static volatile C11465n f29794g;

    /* renamed from: a */
    private final Context f29795a;

    /* renamed from: b */
    private final List<Object> f29796b;

    /* renamed from: c */
    private final C11456e f29797c;

    /* renamed from: d */
    private final C11461j f29798d;

    /* renamed from: e */
    private volatile zzav f29799e;

    /* renamed from: f */
    private Thread.UncaughtExceptionHandler f29800f;

    C11465n(Context context) {
        Context applicationContext = context.getApplicationContext();
        C2198p.m33985j(applicationContext);
        this.f29795a = applicationContext;
        this.f29798d = new C11461j(this);
        this.f29796b = new CopyOnWriteArrayList();
        this.f29797c = new C11456e();
    }

    /* renamed from: a */
    public static C11465n m8039a(Context context) {
        C2198p.m33985j(context);
        if (f29794g == null) {
            synchronized (C11465n.class) {
                if (f29794g == null) {
                    f29794g = new C11465n(context);
                }
            }
        }
        return f29794g;
    }

    /* renamed from: d */
    public static void m8036d() {
        if (Thread.currentThread() instanceof C11464m) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }

    /* renamed from: b */
    public final zzav m8038b() {
        String str;
        if (this.f29799e == null) {
            synchronized (this) {
                if (this.f29799e == null) {
                    zzav zzavVar = new zzav();
                    PackageManager packageManager = this.f29795a.getPackageManager();
                    String packageName = this.f29795a.getPackageName();
                    zzavVar.zzi(packageName);
                    zzavVar.zzj(packageManager.getInstallerPackageName(packageName));
                    String str2 = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(this.f29795a.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str2 = packageInfo.versionName;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        String valueOf = String.valueOf(packageName);
                        if (valueOf.length() != 0) {
                            str = "Error retrieving package info: appName set to ".concat(valueOf);
                        } else {
                            str = new String("Error retrieving package info: appName set to ");
                        }
                        Log.e("GAv4", str);
                    }
                    zzavVar.zzk(packageName);
                    zzavVar.zzl(str2);
                    this.f29799e = zzavVar;
                }
            }
        }
        return this.f29799e;
    }

    /* renamed from: e */
    public final void m8035e(Runnable runnable) {
        C2198p.m33985j(runnable);
        this.f29798d.submit(runnable);
    }

    /* renamed from: f */
    public final void m8034f(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f29800f = uncaughtExceptionHandler;
    }
}
