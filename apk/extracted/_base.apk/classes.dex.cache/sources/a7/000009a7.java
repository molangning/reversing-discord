package p029b9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import p154i9.C7478d;

/* renamed from: b9.v0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2215v0 {

    /* renamed from: a */
    private static final Object f6215a = new Object();

    /* renamed from: b */
    private static boolean f6216b;

    /* renamed from: c */
    private static String f6217c;

    /* renamed from: d */
    private static int f6218d;

    /* renamed from: a */
    public static int m33957a(Context context) {
        m33956b(context);
        return f6218d;
    }

    /* renamed from: b */
    private static void m33956b(Context context) {
        Bundle bundle;
        synchronized (f6215a) {
            if (f6216b) {
                return;
            }
            f6216b = true;
            try {
                bundle = C7478d.m20598a(context).m20602c(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
            if (bundle == null) {
                return;
            }
            f6217c = bundle.getString("com.google.app.id");
            f6218d = bundle.getInt("com.google.android.gms.version");
        }
    }
}