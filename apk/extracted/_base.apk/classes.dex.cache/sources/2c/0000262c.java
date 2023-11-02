package com.facebook.react.modules.network;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactCookieJarContainer implements CookieJarContainer {
    private CookieJar cookieJar = null;

    @Override // com.facebook.react.modules.network.CookieJarContainer, okhttp3.CookieJar
    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
        CookieJar cookieJar = this.cookieJar;
        if (cookieJar != null) {
            List<Cookie> loadForRequest = cookieJar.loadForRequest(httpUrl);
            ArrayList arrayList = new ArrayList();
            for (Cookie cookie : loadForRequest) {
                try {
                    new Headers.C11194a().m8922a(cookie.m8960e(), cookie.m8958g());
                    arrayList.add(cookie);
                } catch (IllegalArgumentException unused) {
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.react.modules.network.CookieJarContainer
    public void removeCookieJar() {
        this.cookieJar = null;
    }

    @Override // com.facebook.react.modules.network.CookieJarContainer, okhttp3.CookieJar
    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        CookieJar cookieJar = this.cookieJar;
        if (cookieJar != null) {
            cookieJar.saveFromResponse(httpUrl, list);
        }
    }

    @Override // com.facebook.react.modules.network.CookieJarContainer
    public void setCookieJar(CookieJar cookieJar) {
        this.cookieJar = cookieJar;
    }
}