package p163ik;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentMap;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: ik.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class C7677a {

    /* renamed from: a */
    private static final ConcurrentMap<String, List<Locale>> f20986a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final ConcurrentMap<String, List<Locale>> f20987b = new ConcurrentHashMap();

    /* renamed from: a */
    private static boolean m20100a(String str) {
        return C7678b.m20094b(str) && str.length() == 2;
    }

    /* renamed from: b */
    private static boolean m20099b(String str) {
        return C7678b.m20095a(str) && (str.length() == 2 || str.length() == 3);
    }

    /* renamed from: c */
    private static boolean m20098c(String str) {
        return C7678b.m20091e(str) && str.length() == 3;
    }

    /* renamed from: d */
    private static Locale m20097d(String str) {
        if (m20099b(str)) {
            return new Locale(str);
        }
        String[] split = str.split("_", -1);
        String str2 = split[0];
        if (split.length == 2) {
            String str3 = split[1];
            if ((m20099b(str2) && m20100a(str3)) || m20098c(str3)) {
                return new Locale(str2, str3);
            }
        } else if (split.length == 3) {
            String str4 = split[1];
            String str5 = split[2];
            if (m20099b(str2) && ((str4.isEmpty() || m20100a(str4) || m20098c(str4)) && !str5.isEmpty())) {
                return new Locale(str2, str4, str5);
            }
        }
        throw new IllegalArgumentException("Invalid locale format: " + str);
    }

    /* renamed from: e */
    public static Locale m20096e(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return new Locale("", "");
        }
        if (!str.contains("#")) {
            int length = str.length();
            if (length >= 2) {
                if (str.charAt(0) == '_') {
                    if (length >= 3) {
                        char charAt = str.charAt(1);
                        char charAt2 = str.charAt(2);
                        if (Character.isUpperCase(charAt) && Character.isUpperCase(charAt2)) {
                            if (length == 3) {
                                return new Locale("", str.substring(1, 3));
                            }
                            if (length >= 5) {
                                if (str.charAt(3) == '_') {
                                    return new Locale("", str.substring(1, 3), str.substring(4));
                                }
                                throw new IllegalArgumentException("Invalid locale format: " + str);
                            }
                            throw new IllegalArgumentException("Invalid locale format: " + str);
                        }
                        throw new IllegalArgumentException("Invalid locale format: " + str);
                    }
                    throw new IllegalArgumentException("Invalid locale format: " + str);
                }
                return m20097d(str);
            }
            throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        throw new IllegalArgumentException("Invalid locale format: " + str);
    }
}
