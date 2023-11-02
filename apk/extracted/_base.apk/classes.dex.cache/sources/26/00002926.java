package com.google.android.datatransport.cct;

/* renamed from: com.google.android.datatransport.cct.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4360e {
    /* renamed from: a */
    public static String m29939a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
            for (int i = 0; i < str.length(); i++) {
                sb2.append(str.charAt(i));
                if (str2.length() > i) {
                    sb2.append(str2.charAt(i));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}