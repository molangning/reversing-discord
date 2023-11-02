package p385v9;

import android.util.Log;
import java.io.File;

/* renamed from: v9.r0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13210r0 {

    /* renamed from: a */
    private static File f34250a;

    /* renamed from: a */
    public static File m3022a() {
        return f34250a;
    }

    /* renamed from: b */
    public static void m3021b(File file) {
        if (file == null) {
            Log.e("NearbyConnections", "Cannot set null temp directory");
        } else {
            f34250a = file;
        }
    }
}