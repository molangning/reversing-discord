package com.facebook.react.modules.network;

import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface CookieJarContainer extends CookieJar {
    @Override // okhttp3.CookieJar
    /* synthetic */ List<Cookie> loadForRequest(HttpUrl httpUrl);

    void removeCookieJar();

    @Override // okhttp3.CookieJar
    /* synthetic */ void saveFromResponse(HttpUrl httpUrl, List<Cookie> list);

    void setCookieJar(CookieJar cookieJar);
}
