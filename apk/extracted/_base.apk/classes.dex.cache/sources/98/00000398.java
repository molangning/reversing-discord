package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: androidx.core.app.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0812g {

    /* renamed from: androidx.core.app.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0813a {
        /* renamed from: a */
        static <T> T m38605a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: b */
        static int m38604b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        /* renamed from: c */
        static int m38603c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        /* renamed from: d */
        static String m38602d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0814b {
        /* renamed from: a */
        static int m38601a(AppOpsManager appOpsManager, String str, int i, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        /* renamed from: b */
        static String m38600b(Context context) {
            String opPackageName;
            opPackageName = context.getOpPackageName();
            return opPackageName;
        }

        /* renamed from: c */
        static AppOpsManager m38599c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: a */
    public static int m38608a(Context context, int i, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager m38599c = C0814b.m38599c(context);
            int m38601a = C0814b.m38601a(m38599c, str, Binder.getCallingUid(), str2);
            if (m38601a != 0) {
                return m38601a;
            }
            return C0814b.m38601a(m38599c, str, i, C0814b.m38600b(context));
        }
        return m38607b(context, str, str2);
    }

    /* renamed from: b */
    public static int m38607b(Context context, String str, String str2) {
        return C0813a.m38603c((AppOpsManager) C0813a.m38605a(context, AppOpsManager.class), str, str2);
    }

    /* renamed from: c */
    public static String m38606c(String str) {
        return C0813a.m38602d(str);
    }
}