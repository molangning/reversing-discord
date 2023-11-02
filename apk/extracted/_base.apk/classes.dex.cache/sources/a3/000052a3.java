package p441y8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import p029b9.C2198p;

/* renamed from: y8.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13938i {

    /* renamed from: b */
    private static C13938i f35893b;

    /* renamed from: a */
    private final Context f35894a;

    public C13938i(Context context) {
        this.f35894a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C13938i m1108a(Context context) {
        C2198p.m33985j(context);
        synchronized (C13938i.class) {
            if (f35893b == null) {
                C13952w.m1098a(context);
                f35893b = new C13938i(context);
            }
        }
        return f35893b;
    }

    /* renamed from: c */
    static final AbstractBinderC13948s m1106c(PackageInfo packageInfo, AbstractBinderC13948s... abstractBinderC13948sArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        BinderC13949t binderC13949t = new BinderC13949t(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < abstractBinderC13948sArr.length; i++) {
            if (abstractBinderC13948sArr[i].equals(binderC13949t)) {
                return abstractBinderC13948sArr[i];
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final boolean m1105d(PackageInfo packageInfo, boolean z) {
        AbstractBinderC13948s m1106c;
        if (packageInfo != null && packageInfo.signatures != null) {
            if (z) {
                m1106c = m1106c(packageInfo, C13951v.f35905a);
            } else {
                m1106c = m1106c(packageInfo, C13951v.f35905a[0]);
            }
            if (m1106c != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m1107b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m1105d(packageInfo, false)) {
            return true;
        }
        if (m1105d(packageInfo, true)) {
            if (C13937h.m1114c(this.f35894a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }
}