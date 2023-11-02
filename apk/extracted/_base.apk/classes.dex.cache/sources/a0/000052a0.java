package p441y8;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import p029b9.C2197o1;
import p119g9.C6583f;
import p154i9.C7478d;
import p351t9.C12608d;

/* renamed from: y8.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13935f {

    /* renamed from: a */
    public static final int f35885a = C13937h.f35888a;

    /* renamed from: b */
    private static final C13935f f35886b = new C13935f();

    /* renamed from: a */
    public Intent mo1125a(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            return C2197o1.m33995c("com.google.android.gms");
        } else if (context != null && C6583f.m22376d(context)) {
            return C2197o1.m33997a();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("gcore_");
            sb2.append(f35885a);
            sb2.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb2.append(str);
            }
            sb2.append("-");
            if (context != null) {
                sb2.append(context.getPackageName());
            }
            sb2.append("-");
            if (context != null) {
                try {
                    sb2.append(C7478d.m20598a(context).m20600e(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return C2197o1.m33996b("com.google.android.gms", sb2.toString());
        }
    }

    /* renamed from: b */
    public PendingIntent mo1124b(Context context, int i, int i2) {
        return m1123c(context, i, i2, null);
    }

    /* renamed from: c */
    public PendingIntent m1123c(Context context, int i, int i2, String str) {
        Intent mo1125a = mo1125a(context, i, str);
        if (mo1125a == null) {
            return null;
        }
        return C12608d.m4719a(context, i2, mo1125a, C12608d.f32701a | 134217728);
    }

    /* renamed from: d */
    public String mo1122d(int i) {
        return C13937h.m1116a(i);
    }

    /* renamed from: e */
    public int mo1121e(Context context) {
        return mo1120f(context, f35885a);
    }

    /* renamed from: f */
    public int mo1120f(Context context, int i) {
        int m1113d = C13937h.m1113d(context, i);
        if (C13937h.m1112e(context, m1113d)) {
            return 18;
        }
        return m1113d;
    }

    /* renamed from: g */
    public boolean m1119g(Context context, String str) {
        return C13937h.m1109h(context, str);
    }

    /* renamed from: h */
    public boolean mo1118h(int i) {
        return C13937h.m1110g(i);
    }
}