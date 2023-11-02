package p351t9;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* renamed from: t9.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12608d {

    /* renamed from: a */
    public static final int f32701a;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0025, code lost:
        if (r0.charAt(0) <= 'Z') goto L12;
     */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 33554432(0x2000000, float:9.403955E-38)
            if (r0 < r1) goto L9
            goto L29
        L9:
            r1 = 30
            r3 = 0
            if (r0 < r1) goto L28
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            int r1 = r0.length()
            r4 = 1
            if (r1 != r4) goto L28
            char r1 = r0.charAt(r3)
            r4 = 83
            if (r1 < r4) goto L28
            char r0 = r0.charAt(r3)
            r1 = 90
            if (r0 > r1) goto L28
            goto L29
        L28:
            r2 = r3
        L29:
            p351t9.C12608d.f32701a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p351t9.C12608d.<clinit>():void");
    }

    /* renamed from: a */
    public static PendingIntent m4719a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getActivity(context, i, intent, i2);
    }
}