package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.util.DisplayMetrics;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import io.sentry.protocol.C8060a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.android.core.q0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7803q0 {

    /* renamed from: io.sentry.android.core.q0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class C7804a {

        /* renamed from: a */
        private final boolean f21342a;

        /* renamed from: b */
        private final String f21343b;

        public C7804a(boolean z, String str) {
            this.f21342a = z;
            this.f21343b = str;
        }

        /* renamed from: a */
        public Map<String, String> m19684a() {
            HashMap hashMap = new HashMap();
            hashMap.put("isSideLoaded", String.valueOf(this.f21342a));
            String str = this.f21343b;
            if (str != null) {
                hashMap.put("installerStore", str);
            }
            return hashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static ApplicationInfo m19699a(Context context, long j, C7798o0 c7798o0) {
        if (c7798o0.m19703d() >= 33) {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(j));
        }
        return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m19698b(Context context, InterfaceC8040o0 interfaceC8040o0) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i == 0) {
                CharSequence charSequence = applicationInfo.nonLocalizedLabel;
                if (charSequence != null) {
                    return charSequence.toString();
                }
                return context.getPackageManager().getApplicationLabel(applicationInfo).toString();
            }
            return context.getString(i);
        } catch (Throwable th2) {
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Error getting application name.", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public static String[] m19697c(C7798o0 c7798o0) {
        return c7798o0.m19703d() >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static String m19696d(Context context, C7798o0 c7798o0) {
        if (c7798o0.m19703d() >= 17) {
            return Settings.Global.getString(context.getContentResolver(), "device_name");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static DisplayMetrics m19695e(Context context, InterfaceC8040o0 interfaceC8040o0) {
        try {
            return context.getResources().getDisplayMetrics();
        } catch (Throwable th2) {
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Error getting DisplayMetrics.", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static String m19694f(InterfaceC8040o0 interfaceC8040o0) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th2) {
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Error getting device family.", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static String m19693g(InterfaceC8040o0 interfaceC8040o0) {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            return readLine;
        } catch (IOException e) {
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Exception while attempting to read kernel information", e);
            return property;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static ActivityManager.MemoryInfo m19692h(Context context, InterfaceC8040o0 interfaceC8040o0) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            interfaceC8040o0.mo18135c(EnumC8021m4.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th2) {
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Error getting MemoryInfo.", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public static PackageInfo m19691i(Context context, int i, InterfaceC8040o0 interfaceC8040o0, C7798o0 c7798o0) {
        try {
            if (c7798o0.m19703d() >= 33) {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(i));
            }
            return context.getPackageManager().getPackageInfo(context.getPackageName(), i);
        } catch (Throwable th2) {
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Error getting package info.", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static PackageInfo m19690j(Context context, InterfaceC8040o0 interfaceC8040o0, C7798o0 c7798o0) {
        return m19691i(context, 0, interfaceC8040o0, c7798o0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    /* renamed from: k */
    public static String m19689k(PackageInfo packageInfo, C7798o0 c7798o0) {
        long longVersionCode;
        if (c7798o0.m19703d() >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            return Long.toString(longVersionCode);
        }
        return m19688l(packageInfo);
    }

    /* renamed from: l */
    private static String m19688l(PackageInfo packageInfo) {
        return Integer.toString(packageInfo.versionCode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static boolean m19687m(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            Object systemService = context.getSystemService("activity");
            if ((systemService instanceof ActivityManager) && (runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses()) != null) {
                int myPid = Process.myPid();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid) {
                        if (runningAppProcessInfo.importance == 100) {
                            return true;
                        }
                        return false;
                    }
                }
                return false;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static C7804a m19686n(Context context, InterfaceC8040o0 interfaceC8040o0, C7798o0 c7798o0) {
        String str;
        boolean z;
        try {
            PackageInfo m19690j = m19690j(context, interfaceC8040o0, c7798o0);
            PackageManager packageManager = context.getPackageManager();
            if (m19690j != null && packageManager != null) {
                str = m19690j.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    if (installerPackageName == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return new C7804a(z, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    interfaceC8040o0.mo18135c(EnumC8021m4.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    /* renamed from: o */
    public static void m19685o(PackageInfo packageInfo, C7798o0 c7798o0, C8060a c8060a) {
        String str;
        c8060a.m18839l(packageInfo.packageName);
        c8060a.m18836o(packageInfo.versionName);
        c8060a.m18840k(m19689k(packageInfo, c7798o0));
        if (c7798o0.m19703d() >= 16) {
            HashMap hashMap = new HashMap();
            String[] strArr = packageInfo.requestedPermissions;
            int[] iArr = packageInfo.requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i = 0; i < strArr.length; i++) {
                    String str2 = strArr[i];
                    boolean z = true;
                    String substring = str2.substring(str2.lastIndexOf(46) + 1);
                    if ((iArr[i] & 2) != 2) {
                        z = false;
                    }
                    if (z) {
                        str = "granted";
                    } else {
                        str = "not_granted";
                    }
                    hashMap.put(substring, str);
                }
            }
            c8060a.m18834q(hashMap);
        }
    }
}
