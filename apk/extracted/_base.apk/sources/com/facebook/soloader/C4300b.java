package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;

/* renamed from: com.facebook.soloader.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4300b extends AbstractC4325q {

    /* renamed from: a */
    private Context f10949a;

    /* renamed from: b */
    private int f10950b;

    /* renamed from: c */
    private C4302d f10951c;

    public C4300b(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.f10949a = applicationContext;
        if (applicationContext == null) {
            Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
            this.f10949a = context;
        }
        this.f10950b = i;
        this.f10951c = new C4302d(new File(this.f10949a.getApplicationInfo().nativeLibraryDir), i);
    }

    /* renamed from: e */
    public static File m30134e(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    @Override // com.facebook.soloader.AbstractC4325q
    /* renamed from: a */
    public int mo30087a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return this.f10951c.mo30087a(str, i, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.soloader.AbstractC4325q
    /* renamed from: b */
    public void mo30086b(int i) {
        this.f10951c.mo30086b(i);
    }

    @Override // com.facebook.soloader.AbstractC4325q
    /* renamed from: c */
    public File mo30088c(String str) {
        return this.f10951c.mo30088c(str);
    }

    /* renamed from: d */
    public boolean m30135d() {
        File file = this.f10951c.f10955a;
        Context m30133f = m30133f();
        File m30134e = m30134e(m30133f);
        if (!file.equals(m30134e)) {
            Log.d("SoLoader", "Native library directory updated from " + file + " to " + m30134e);
            int i = this.f10950b | 1;
            this.f10950b = i;
            C4302d c4302d = new C4302d(m30134e, i);
            this.f10951c = c4302d;
            c4302d.mo30086b(this.f10950b);
            this.f10949a = m30133f;
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public Context m30133f() {
        try {
            Context context = this.f10949a;
            return context.createPackageContext(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.facebook.soloader.AbstractC4325q
    public String toString() {
        return this.f10951c.toString();
    }
}
