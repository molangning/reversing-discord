package p387vd;

import android.os.Environment;
import android.os.StatFs;
import android.util.Log;

/* renamed from: vd.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13250d {

    /* renamed from: a */
    private static final String f34319a = "d";

    /* renamed from: a */
    public long m2931a() {
        try {
            return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes();
        } catch (Exception unused) {
            Log.e(f34319a, "Could not get Available Disk Space");
            return -1L;
        }
    }
}