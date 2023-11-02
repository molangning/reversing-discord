package p010a9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: a9.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0121s extends BroadcastReceiver {

    /* renamed from: a */
    Context f484a;

    /* renamed from: b */
    private final AbstractC0120r f485b;

    public C0121s(AbstractC0120r abstractC0120r) {
        this.f485b = abstractC0120r;
    }

    /* renamed from: a */
    public final void m41124a(Context context) {
        this.f484a = context;
    }

    /* renamed from: b */
    public final synchronized void m41123b() {
        Context context = this.f484a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f484a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.f485b.mo28133a();
            m41123b();
        }
    }
}
