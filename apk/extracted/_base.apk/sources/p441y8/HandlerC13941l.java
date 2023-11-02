package p441y8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Message;
import android.util.Log;
import p319r9.HandlerC12118f;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"HandlerLeak"})
/* renamed from: y8.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class HandlerC13941l extends HandlerC12118f {

    /* renamed from: a */
    private final Context f35899a;

    /* renamed from: b */
    final /* synthetic */ C13934e f35900b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HandlerC13941l(p441y8.C13934e r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.f35900b = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto Ld
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L11:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.f35899a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p441y8.HandlerC13941l.<init>(y8.e, android.content.Context):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int mo1121e = this.f35900b.mo1121e(this.f35899a);
        if (this.f35900b.mo1118h(mo1121e)) {
            this.f35900b.m1134m(this.f35899a, mo1121e);
        }
    }
}
