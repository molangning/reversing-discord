package com.discord.bundle_updater;

import android.webkit.CookieManager;
import com.discord.resource_usage.DeviceResourceUsageRecorder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "Lokhttp3/OkHttpClient;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class BundleUpdater$client$2 extends AbstractC9614s implements Function0<OkHttpClient> {
    final /* synthetic */ BundleUpdater this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleUpdater$client$2(BundleUpdater bundleUpdater) {
        super(0);
        this.this$0 = bundleUpdater;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OkHttpClient invoke() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        final BundleUpdater bundleUpdater = this.this$0;
        OkHttpClient.Builder m8775O = builder.m8768f(new CookieJar() { // from class: com.discord.bundle_updater.BundleUpdater$client$2.1
            @Override // okhttp3.CookieJar
            public List<Cookie> loadForRequest(HttpUrl url) {
                CookieManager cookieManager;
                List<Cookie> m14073E0;
                C9612q.m13917h(url, "url");
                cookieManager = BundleUpdater.this.getCookieManager();
                C9612q.m13918g(cookieManager, "cookieManager");
                List<Cookie> cookiesForUrl = CookieValidatorKt.getCookiesForUrl(cookieManager, url.toString());
                ArrayList arrayList = new ArrayList();
                for (Object obj : cookiesForUrl) {
                    if (!C9612q.m13922c(((Cookie) obj).m8960e(), "buildOverride")) {
                        arrayList.add(obj);
                    }
                }
                m14073E0 = C9553r.m14073E0(arrayList);
                Cookie buildOverrideCookie = BundleUpdater.this.getBuildOverrideCookie();
                if (buildOverrideCookie != null) {
                    m14073E0.add(buildOverrideCookie);
                }
                return m14073E0;
            }

            @Override // okhttp3.CookieJar
            public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
                CookieManager cookieManager;
                String m14046d0;
                C9612q.m13917h(url, "url");
                C9612q.m13917h(cookies, "cookies");
                cookieManager = BundleUpdater.this.getCookieManager();
                String httpUrl = url.toString();
                m14046d0 = C9553r.m14046d0(cookies, "; ", null, null, 0, null, null, 62, null);
                cookieManager.setCookie(httpUrl, m14046d0);
            }
        }).m8775O(1L, TimeUnit.MINUTES);
        final DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.Companion;
        return m8775O.m8773a(new Interceptor() { // from class: com.discord.bundle_updater.BundleUpdater$client$2$invoke$$inlined$-addInterceptor$1
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                C9612q.m13917h(chain, "chain");
                return DeviceResourceUsageRecorder.Companion.this.bundleUpdaterInterceptor(chain);
            }
        }).m8771c();
    }
}
