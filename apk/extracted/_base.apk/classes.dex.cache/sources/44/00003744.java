package p154i9;

import android.content.Context;
import p119g9.C6587j;

/* renamed from: i9.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7476b {

    /* renamed from: a */
    private static Context f20077a;

    /* renamed from: b */
    private static Boolean f20078b;

    /* renamed from: a */
    public static synchronized boolean m20605a(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (C7476b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f20077a;
            if (context2 != null && (bool = f20078b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f20078b = null;
            if (C6587j.m22360h()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f20078b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f20078b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f20078b = Boolean.FALSE;
                }
            }
            f20077a = applicationContext;
            return f20078b.booleanValue();
        }
    }
}