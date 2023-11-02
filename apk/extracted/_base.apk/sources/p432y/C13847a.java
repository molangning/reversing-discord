package p432y;

import android.net.Uri;

/* renamed from: y.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C13847a {
    /* renamed from: a */
    public static String m1402a(Uri uri) {
        String str;
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (scheme != null) {
            if (!scheme.equalsIgnoreCase("tel") && !scheme.equalsIgnoreCase("sip") && !scheme.equalsIgnoreCase("sms") && !scheme.equalsIgnoreCase("smsto") && !scheme.equalsIgnoreCase("mailto") && !scheme.equalsIgnoreCase("nfc")) {
                if (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https") || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("//");
                    String str2 = "";
                    if (uri.getHost() == null) {
                        str = "";
                    } else {
                        str = uri.getHost();
                    }
                    sb2.append(str);
                    if (uri.getPort() != -1) {
                        str2 = ":" + uri.getPort();
                    }
                    sb2.append(str2);
                    sb2.append("/...");
                    schemeSpecificPart = sb2.toString();
                }
            } else {
                StringBuilder sb3 = new StringBuilder(64);
                sb3.append(scheme);
                sb3.append(':');
                if (schemeSpecificPart != null) {
                    for (int i = 0; i < schemeSpecificPart.length(); i++) {
                        char charAt = schemeSpecificPart.charAt(i);
                        if (charAt != '-' && charAt != '@' && charAt != '.') {
                            sb3.append('x');
                        } else {
                            sb3.append(charAt);
                        }
                    }
                }
                return sb3.toString();
            }
        }
        StringBuilder sb4 = new StringBuilder(64);
        if (scheme != null) {
            sb4.append(scheme);
            sb4.append(':');
        }
        if (schemeSpecificPart != null) {
            sb4.append(schemeSpecificPart);
        }
        return sb4.toString();
    }
}
