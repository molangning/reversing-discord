package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC4303e
@TargetApi(18)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class Api18TraceUtils {
    Api18TraceUtils() {
    }

    /* renamed from: a */
    public static void m30184a(String str, String str2, String str3) {
        String str4 = str + str2 + str3;
        if (str4.length() > 127 && str2 != null) {
            int length = (127 - str.length()) - str3.length();
            str4 = str + str2.substring(0, length) + str3;
        }
        Trace.beginSection(str4);
    }

    /* renamed from: b */
    public static void m30183b() {
        Trace.endSection();
    }
}