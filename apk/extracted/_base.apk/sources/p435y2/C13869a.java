package p435y2;

import java.util.Locale;
import java.util.Map;
import p394w2.C13372f;

/* renamed from: y2.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13869a {

    /* renamed from: a */
    public static final Map<String, String> f35696a = C13372f.m2694of("mkv", "video/x-matroska", "glb", "model/gltf-binary");

    /* renamed from: a */
    private static String m1351a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0 && lastIndexOf != str.length() - 1) {
            return str.substring(lastIndexOf + 1);
        }
        return null;
    }

    /* renamed from: b */
    public static String m1350b(String str) {
        String m1351a = m1351a(str);
        if (m1351a == null) {
            return null;
        }
        String lowerCase = m1351a.toLowerCase(Locale.US);
        String m1348a = C13870b.m1348a(lowerCase);
        if (m1348a == null) {
            return f35696a.get(lowerCase);
        }
        return m1348a;
    }

    /* renamed from: c */
    public static boolean m1349c(String str) {
        if (str != null && str.startsWith("video/")) {
            return true;
        }
        return false;
    }
}
