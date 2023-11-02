package p119g9;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import p441y8.C13937h;

/* renamed from: g9.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6583f {

    /* renamed from: a */
    private static Boolean f18719a;

    /* renamed from: b */
    private static Boolean f18720b;

    /* renamed from: c */
    private static Boolean f18721c;

    /* renamed from: d */
    private static Boolean f18722d;

    /* renamed from: a */
    public static boolean m22379a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f18722d == null) {
            boolean z = false;
            if (C6587j.m22360h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f18722d = Boolean.valueOf(z);
        }
        return f18722d.booleanValue();
    }

    /* renamed from: b */
    public static boolean m22378b() {
        int i = C13937h.f35888a;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    /* renamed from: c */
    public static boolean m22377c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f18719a == null) {
            boolean z = false;
            if (C6587j.m22363e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f18719a = Boolean.valueOf(z);
        }
        return f18719a.booleanValue();
    }

    @TargetApi(26)
    /* renamed from: d */
    public static boolean m22376d(Context context) {
        if (!m22377c(context)) {
            return false;
        }
        if (!C6587j.m22361g()) {
            return true;
        }
        if (!m22375e(context) || C6587j.m22360h()) {
            return false;
        }
        return true;
    }

    @TargetApi(21)
    /* renamed from: e */
    public static boolean m22375e(Context context) {
        if (f18720b == null) {
            boolean z = false;
            if (C6587j.m22362f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f18720b = Boolean.valueOf(z);
        }
        return f18720b.booleanValue();
    }

    /* renamed from: f */
    public static boolean m22374f(Context context) {
        if (f18721c == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f18721c = Boolean.valueOf(z);
        }
        return f18721c.booleanValue();
    }
}
