package androidx.core.p018os;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: androidx.core.os.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1074t {

    /* renamed from: androidx.core.os.t$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1075a {
        /* renamed from: a */
        static boolean m37953a(Context context) {
            boolean isUserUnlocked;
            isUserUnlocked = ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
            return isUserUnlocked;
        }
    }

    /* renamed from: a */
    public static boolean m37954a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C1075a.m37953a(context);
        }
        return true;
    }
}
