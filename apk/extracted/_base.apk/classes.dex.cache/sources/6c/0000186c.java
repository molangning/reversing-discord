package com.discord.image.fresco.config;

import android.content.Context;
import com.discord.resource_usage.DeviceResourceUsageRecorder;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.network.OkHttpClientProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import p437y4.C13889l;
import p437y4.C13901x;
import p437y4.C13904y;
import p437y4.C13905z;

@Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m14357d2 = {"frescoConfig", "Lcom/facebook/imagepipeline/core/ImagePipelineConfig;", "Landroid/content/Context;", "fresco_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class FrescoConfigKt {
    public static final ImagePipelineConfig frescoConfig(Context context) {
        C9612q.m13917h(context, "<this>");
        ImagePipelineConfig.Builder defaultConfigBuilder = FrescoModule.getDefaultConfigBuilder(new ReactContext(context));
        FrescoDiskCache frescoDiskCache = FrescoDiskCache.INSTANCE;
        ImagePipelineConfig.Builder m31139M = defaultConfigBuilder.m31137O(frescoDiskCache.newRegularDiskCache(context)).m31133S(frescoDiskCache.newSmallDiskCache(context)).m31139M(new FrescoBitmapSupplier(context));
        OkHttpClient.Builder m8825B = OkHttpClientProvider.createClient().m8825B();
        final DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.Companion;
        ImagePipelineConfig.Builder m31136P = m31139M.m31136P(new ReactOkHttpNetworkFetcher(m8825B.m8772b(new Interceptor() { // from class: com.discord.image.fresco.config.FrescoConfigKt$frescoConfig$$inlined$-addNetworkInterceptor$1
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                C9612q.m13917h(chain, "chain");
                return DeviceResourceUsageRecorder.Companion.this.frescoInterceptor(chain);
            }
        }).m8771c()));
        C13901x.C13903b m1251n = C13901x.m1251n();
        C13905z m1302a = C13889l.m1302a();
        ImagePipelineConfig m31141K = m31136P.m31135Q(new C13904y(m1251n.m1237n(new C13905z(m1302a.f35779b, m1302a.f35778a * 2, m1302a.f35780c)).m1238m())).m31138N(true).m31140L().m31056t(true).m31141K();
        C9612q.m13918g(m31141K, "getDefaultConfigBuilder(…ns(true)\n        .build()");
        return m31141K;
    }
}