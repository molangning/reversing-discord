package com.facebook.imagepipeline.backends.okhttp3;

import android.content.Context;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import okhttp3.OkHttpClient;

/* renamed from: com.facebook.imagepipeline.backends.okhttp3.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3701a {
    /* renamed from: a */
    public static ImagePipelineConfig.Builder m31204a(Context context, OkHttpClient okHttpClient) {
        return ImagePipelineConfig.m31153J(context).m31136P(new OkHttpNetworkFetcher(okHttpClient));
    }
}