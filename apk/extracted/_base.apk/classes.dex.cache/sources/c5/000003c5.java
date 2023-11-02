package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.discord.media.utils.DiscordVideoMediaSource;

/* renamed from: androidx.core.app.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0857n {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0858a {
        /* renamed from: a */
        static Intent m38549a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        /* renamed from: b */
        static boolean m38548b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        /* renamed from: c */
        static boolean m38547c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    /* renamed from: a */
    public static Intent m38555a(Activity activity) {
        Intent m38549a = C0858a.m38549a(activity);
        if (m38549a != null) {
            return m38549a;
        }
        String m38553c = m38553c(activity);
        if (m38553c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, m38553c);
        try {
            if (m38552d(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + m38553c + "' in manifest");
            return null;
        }
    }

    /* renamed from: b */
    public static Intent m38554b(Context context, ComponentName componentName) {
        String m38552d = m38552d(context, componentName);
        if (m38552d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m38552d);
        if (m38552d(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    /* renamed from: c */
    public static String m38553c(Activity activity) {
        try {
            return m38552d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: d */
    public static String m38552d(Context context, ComponentName componentName) {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            i = 269222528;
        } else if (i2 >= 24) {
            i = 787072;
        } else {
            i = DiscordVideoMediaSource.DEFAULT_WIDTH;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    /* renamed from: e */
    public static void m38551e(Activity activity, Intent intent) {
        C0858a.m38548b(activity, intent);
    }

    /* renamed from: f */
    public static boolean m38550f(Activity activity, Intent intent) {
        return C0858a.m38547c(activity, intent);
    }
}