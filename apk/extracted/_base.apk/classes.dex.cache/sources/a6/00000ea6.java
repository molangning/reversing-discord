package com.discord.bundle_updater;

import android.webkit.CookieManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9654p;
import okhttp3.Cookie;
import okhttp3.HttpUrl;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m14357d2 = {"getCookiesForUrl", "", "Lokhttp3/Cookie;", "Landroid/webkit/CookieManager;", "url", "", "bundle_updater_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class CookieValidatorKt {
    public static final List<Cookie> getCookiesForUrl(CookieManager cookieManager, String url) {
        List<String> m13682z0;
        List<Cookie> m14104i;
        C9612q.m13917h(cookieManager, "<this>");
        C9612q.m13917h(url, "url");
        String cookie = cookieManager.getCookie(url);
        if (cookie == null) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        m13682z0 = C9654p.m13682z0(cookie, new String[]{"; "}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (String str : m13682z0) {
            Cookie m8950c = Cookie.f29267n.m8950c(HttpUrl.f29299l.m8854d(url), str);
            if (m8950c != null) {
                arrayList.add(m8950c);
            }
        }
        return arrayList;
    }
}