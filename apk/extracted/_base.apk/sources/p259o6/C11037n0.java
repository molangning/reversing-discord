package p259o6;

import android.util.Pair;
import java.util.Map;

/* renamed from: o6.n0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11037n0 {
    /* renamed from: a */
    private static long m9299a(Map<String, String> map, String str) {
        if (map != null) {
            try {
                String str2 = map.get(str);
                if (str2 != null) {
                    return Long.parseLong(str2);
                }
                return -9223372036854775807L;
            } catch (NumberFormatException unused) {
                return -9223372036854775807L;
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public static Pair<Long, Long> m9298b(InterfaceC11035n interfaceC11035n) {
        Map<String, String> mo9300g = interfaceC11035n.mo9300g();
        if (mo9300g == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(m9299a(mo9300g, "LicenseDurationRemaining")), Long.valueOf(m9299a(mo9300g, "PlaybackDurationRemaining")));
    }
}
