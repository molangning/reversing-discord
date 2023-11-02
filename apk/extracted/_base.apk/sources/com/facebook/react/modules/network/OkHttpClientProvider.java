package com.facebook.react.modules.network;

import android.content.Context;
import java.io.File;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import p328rj.C12275c;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class OkHttpClientProvider {
    private static OkHttpClient sClient;
    private static OkHttpClientFactory sFactory;

    public static OkHttpClient createClient() {
        OkHttpClientFactory okHttpClientFactory = sFactory;
        if (okHttpClientFactory != null) {
            return okHttpClientFactory.createNewNetworkModuleClient();
        }
        return createClientBuilder().m8771c();
    }

    public static OkHttpClient.Builder createClientBuilder() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return builder.m8769e(0L, timeUnit).m8775O(0L, timeUnit).m8774P(0L, timeUnit).m8768f(new ReactCookieJarContainer());
    }

    public static OkHttpClient getOkHttpClient() {
        if (sClient == null) {
            sClient = createClient();
        }
        return sClient;
    }

    public static void setOkHttpClientFactory(OkHttpClientFactory okHttpClientFactory) {
        sFactory = okHttpClientFactory;
    }

    public static OkHttpClient createClient(Context context) {
        OkHttpClientFactory okHttpClientFactory = sFactory;
        if (okHttpClientFactory != null) {
            return okHttpClientFactory.createNewNetworkModuleClient();
        }
        return createClientBuilder(context).m8771c();
    }

    public static OkHttpClient.Builder createClientBuilder(Context context) {
        return createClientBuilder(context, 10485760);
    }

    public static OkHttpClient.Builder createClientBuilder(Context context, int i) {
        OkHttpClient.Builder createClientBuilder = createClientBuilder();
        return i == 0 ? createClientBuilder : createClientBuilder.m8770d(new C12275c(new File(context.getCacheDir(), "http-cache"), i));
    }
}
