package p119g9;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p351t9.AbstractC12615k;
import p351t9.C12622r;

/* renamed from: g9.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6585h {

    /* renamed from: a */
    private static final Pattern f18725a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b */
    private static final Pattern f18726b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c */
    private static final Pattern f18727c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    /* renamed from: a */
    public static Map<String, String> m22371a(URI uri, String str) {
        String str2;
        Map<String, String> emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            emptyMap = new HashMap<>();
            C12622r m4707c = C12622r.m4707c(AbstractC12615k.m4716b('='));
            for (String str3 : C12622r.m4707c(AbstractC12615k.m4716b('&')).m4708b().m4706d(rawQuery)) {
                List<String> m4704f = m4707c.m4704f(str3);
                if (!m4704f.isEmpty() && m4704f.size() <= 2) {
                    String m22370b = m22370b(m4704f.get(0), str);
                    if (m4704f.size() == 2) {
                        str2 = m22370b(m4704f.get(1), str);
                    } else {
                        str2 = null;
                    }
                    emptyMap.put(m22370b, str2);
                } else {
                    throw new IllegalArgumentException("bad parameter");
                }
            }
        }
        return emptyMap;
    }

    /* renamed from: b */
    private static String m22370b(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
