package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C0812g;
import androidx.core.util.C1134c;

/* renamed from: androidx.core.content.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0960h {
    /* renamed from: a */
    public static int m38363a(Context context, String str, int i, int i2, String str2) {
        boolean z;
        int m38607b;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String m38606c = C0812g.m38606c(str);
        if (m38606c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (myUid == i2 && C1134c.m37835a(packageName, str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m38607b = C0812g.m38608a(context, i2, m38606c, str2);
        } else {
            m38607b = C0812g.m38607b(context, m38606c, str2);
        }
        if (m38607b == 0) {
            return 0;
        }
        return -2;
    }

    /* renamed from: b */
    public static int m38362b(Context context, String str) {
        return m38363a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
