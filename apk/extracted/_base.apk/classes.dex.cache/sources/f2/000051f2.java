package p420x8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import p119g9.C6587j;
import p154i9.C7478d;

/* renamed from: x8.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13762x {

    /* renamed from: a */
    private final Context f35502a;

    /* renamed from: b */
    private int f35503b;

    /* renamed from: c */
    private int f35504c = 0;

    public C13762x(Context context) {
        this.f35502a = context;
    }

    /* renamed from: a */
    public final synchronized int m1575a() {
        PackageInfo packageInfo;
        if (this.f35503b == 0) {
            try {
                packageInfo = C7478d.m20598a(this.f35502a).m20600e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                sb2.append("Failed to find package ");
                sb2.append(valueOf);
                Log.w("Metadata", sb2.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f35503b = packageInfo.versionCode;
            }
        }
        return this.f35503b;
    }

    /* renamed from: b */
    public final synchronized int m1574b() {
        int i = this.f35504c;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f35502a.getPackageManager();
        if (C7478d.m20598a(this.f35502a).m20603b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!C6587j.m22360h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f35504c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f35504c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (C6587j.m22360h()) {
            this.f35504c = 2;
            i2 = 2;
        } else {
            this.f35504c = 1;
        }
        return i2;
    }
}