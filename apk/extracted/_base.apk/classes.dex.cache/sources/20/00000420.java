package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.res.C0980h;
import androidx.core.p018os.C1049a;
import androidx.core.util.C1134c;
import java.io.File;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.content.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0946a {

    /* renamed from: a */
    private static final Object f3245a = new Object();

    /* renamed from: b */
    private static final Object f3246b = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0947a {
        /* renamed from: a */
        static void m38392a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        static void m38391b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0948b {
        /* renamed from: a */
        static File[] m38390a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        static File[] m38389b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        static File[] m38388c(Context context) {
            return context.getObbDirs();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0949c {
        /* renamed from: a */
        static File m38387a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        static Drawable m38386b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        static File m38385c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0950d {
        /* renamed from: a */
        static int m38384a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        static <T> T m38383b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: c */
        static String m38382c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0951e {
        /* renamed from: a */
        static Context m38381a(Context context) {
            Context createDeviceProtectedStorageContext;
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            return createDeviceProtectedStorageContext;
        }

        /* renamed from: b */
        static File m38380b(Context context) {
            File dataDir;
            dataDir = context.getDataDir();
            return dataDir;
        }

        /* renamed from: c */
        static boolean m38379c(Context context) {
            boolean isDeviceProtectedStorage;
            isDeviceProtectedStorage = context.isDeviceProtectedStorage();
            return isDeviceProtectedStorage;
        }
    }

    /* renamed from: a */
    public static int m38403a(Context context, String str) {
        C1134c.m37832d(str, "permission must be non-null");
        if (!C1049a.m37988c() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            if (NotificationManagerCompat.m38785g(context).m38791a()) {
                return 0;
            }
            return -1;
        }
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    /* renamed from: b */
    public static Context m38402b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0951e.m38381a(context);
        }
        return null;
    }

    /* renamed from: c */
    public static int m38401c(Context context, int i) {
        return C0950d.m38384a(context, i);
    }

    /* renamed from: d */
    public static ColorStateList m38400d(Context context, int i) {
        return C0980h.m38242e(context.getResources(), i, context.getTheme());
    }

    /* renamed from: e */
    public static Drawable m38399e(Context context, int i) {
        return C0949c.m38386b(context, i);
    }

    /* renamed from: f */
    public static File[] m38398f(Context context) {
        return C0948b.m38390a(context);
    }

    /* renamed from: g */
    public static File[] m38397g(Context context, String str) {
        return C0948b.m38389b(context, str);
    }

    /* renamed from: h */
    public static File m38396h(Context context) {
        return C0949c.m38385c(context);
    }

    /* renamed from: i */
    public static <T> T m38395i(Context context, Class<T> cls) {
        return (T) C0950d.m38383b(context, cls);
    }

    /* renamed from: j */
    public static boolean m38394j(Context context, Intent[] intentArr, Bundle bundle) {
        C0947a.m38392a(context, intentArr, bundle);
        return true;
    }

    /* renamed from: k */
    public static void m38393k(Context context, Intent intent, Bundle bundle) {
        C0947a.m38391b(context, intent, bundle);
    }
}