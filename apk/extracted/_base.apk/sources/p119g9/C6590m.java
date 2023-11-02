package p119g9;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import p154i9.C7478d;
import p441y8.C13938i;

/* renamed from: g9.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6590m {
    /* renamed from: a */
    public static boolean m22354a(Context context, int i) {
        if (!m22353b(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C13938i.m1108a(context).m1107b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    public static boolean m22353b(Context context, int i, String str) {
        return C7478d.m20598a(context).m20599f(i, str);
    }
}
