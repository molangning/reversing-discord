package com.facebook.react.common.network;

import okhttp3.Call;
import okhttp3.OkHttpClient;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class OkHttpCallUtil {
    private OkHttpCallUtil() {
    }

    public static void cancelTag(OkHttpClient okHttpClient, Object obj) {
        for (Call call : okHttpClient.m8798r().m8934k()) {
            if (obj.equals(call.mo2001a().m8736j())) {
                call.cancel();
                return;
            }
        }
        for (Call call2 : okHttpClient.m8798r().m8933l()) {
            if (obj.equals(call2.mo2001a().m8736j())) {
                call2.cancel();
                return;
            }
        }
    }
}
