package com.google.firebase.messaging;

import android.os.Bundle;
import androidx.collection.C0624a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5071c {

    /* renamed from: a */
    public static final long f14323a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5072a {
        /* renamed from: a */
        public static C0624a<String, String> m26318a(Bundle bundle) {
            C0624a<String, String> c0624a = new C0624a<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c0624a.put(str, str2);
                    }
                }
            }
            return c0624a;
        }
    }
}
