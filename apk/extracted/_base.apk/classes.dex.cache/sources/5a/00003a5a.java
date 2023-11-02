package io.sentry.util;

import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* renamed from: io.sentry.util.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8233s {

    /* renamed from: a */
    private static final Charset f22154a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static String m18159a(String str, InterfaceC8040o0 interfaceC8040o0) {
        if (str != null && !str.isEmpty()) {
            try {
                return new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str.getBytes(f22154a))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e) {
                interfaceC8040o0.mo18136b(EnumC8021m4.INFO, "SHA-1 isn't available to calculate the hash.", e);
            } catch (Throwable th2) {
                interfaceC8040o0.mo18135c(EnumC8021m4.INFO, "string: %s could not calculate its hash", th2, str);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m18158b(String str) {
        if (str != null && !str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            String substring = str.substring(0, 1);
            Locale locale = Locale.ROOT;
            sb2.append(substring.toUpperCase(locale));
            sb2.append(str.substring(1).toLowerCase(locale));
            return sb2.toString();
        }
        return str;
    }

    /* renamed from: c */
    public static String m18157c(String str) {
        int i;
        if (str != null) {
            int lastIndexOf = str.lastIndexOf(".");
            if (lastIndexOf >= 0 && str.length() > (i = lastIndexOf + 1)) {
                return str.substring(i);
            }
            return str;
        }
        return null;
    }

    /* renamed from: d */
    public static String m18156d(String str) {
        if (str.equals("0000-0000")) {
            return "00000000-0000-0000-0000-000000000000";
        }
        return str;
    }

    /* renamed from: e */
    public static String m18155e(String str, String str2) {
        if (str != null && str2 != null && str.startsWith(str2) && str.endsWith(str2)) {
            return str.substring(str2.length(), str.length() - str2.length());
        }
        return str;
    }
}