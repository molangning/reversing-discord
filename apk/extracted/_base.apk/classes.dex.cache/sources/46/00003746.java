package p154i9;

import android.content.Context;

/* renamed from: i9.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7478d {

    /* renamed from: b */
    private static C7478d f20080b = new C7478d();

    /* renamed from: a */
    private C7477c f20081a = null;

    /* renamed from: a */
    public static C7477c m20598a(Context context) {
        return f20080b.m20597b(context);
    }

    /* renamed from: b */
    public final synchronized C7477c m20597b(Context context) {
        if (this.f20081a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f20081a = new C7477c(context);
        }
        return this.f20081a;
    }
}