package p021b1;

import android.content.Context;
import android.provider.Settings;

/* renamed from: b1.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2084t {
    /* renamed from: a */
    public static String m34342a(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
