package p151i6;

import android.os.Build;
import java.util.HashSet;

/* renamed from: i6.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7397h {
    @Deprecated

    /* renamed from: a */
    public static final String f19915a = "ExoPlayerLib/2.13.3 (Linux; Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.13.3";

    /* renamed from: b */
    private static final HashSet<String> f19916b = new HashSet<>();

    /* renamed from: c */
    private static String f19917c = "goog.exo.core";

    /* renamed from: a */
    public static synchronized void m20760a(String str) {
        synchronized (C7397h.class) {
            if (f19916b.add(str)) {
                f19917c += ", " + str;
            }
        }
    }

    /* renamed from: b */
    public static synchronized String m20759b() {
        String str;
        synchronized (C7397h.class) {
            str = f19917c;
        }
        return str;
    }
}
