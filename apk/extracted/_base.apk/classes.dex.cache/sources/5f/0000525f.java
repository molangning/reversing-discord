package p435y2;

import android.webkit.MimeTypeMap;
import java.util.Map;
import p394w2.C13372f;

/* renamed from: y2.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13870b {

    /* renamed from: a */
    private static final MimeTypeMap f35697a = MimeTypeMap.getSingleton();

    /* renamed from: b */
    private static final Map<String, String> f35698b = C13372f.m2694of("image/heif", "heif", "image/heic", "heic");

    /* renamed from: c */
    private static final Map<String, String> f35699c = C13372f.m2694of("heif", "image/heif", "heic", "image/heic");

    /* renamed from: a */
    public static String m1348a(String str) {
        String str2 = f35699c.get(str);
        if (str2 != null) {
            return str2;
        }
        return f35697a.getMimeTypeFromExtension(str);
    }
}