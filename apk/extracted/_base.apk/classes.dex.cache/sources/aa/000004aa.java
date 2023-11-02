package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;

/* renamed from: androidx.core.provider.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1079b {
    /* renamed from: a */
    public static Handler m37949a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}