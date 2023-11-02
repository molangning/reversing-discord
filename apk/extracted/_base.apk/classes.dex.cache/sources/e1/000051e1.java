package p420x8;

import android.os.Build;
import android.util.Log;

/* renamed from: x8.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13745g extends ClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class<?> loadClass(String str, boolean z) {
        if ("com.google.android.gms.iid.MessengerCompat".equals(str)) {
            if (Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3))) {
                Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
                return C13746h.class;
            }
            return C13746h.class;
        }
        return super.loadClass(str, z);
    }
}