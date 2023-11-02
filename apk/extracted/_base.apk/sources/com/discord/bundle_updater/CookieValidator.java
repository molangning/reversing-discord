package com.discord.bundle_updater;

import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9654p;
import kotlinx.serialization.json.C9964g;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import okhttp3.Cookie;
import okio.ByteString;
import p304qf.C11888u;
import p470zi.C14278g;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m14357d2 = {"Lcom/discord/bundle_updater/CookieValidator;", "", "()V", "parseBuildOverrideCookie", "Lcom/discord/bundle_updater/BuildOverrideCookieContents;", "buildOverrideCookie", "Lokhttp3/Cookie;", "validateBuildOverrideCookie", "", "version", "", "bundle_updater_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class CookieValidator {
    public static final CookieValidator INSTANCE = new CookieValidator();

    private CookieValidator() {
    }

    public final BuildOverrideCookieContents parseBuildOverrideCookie(Cookie cookie) {
        List m13682z0;
        Object m14053W;
        String m8575D;
        int m6758d;
        if (cookie == null) {
            return null;
        }
        m13682z0 = C9654p.m13682z0(cookie.m8958g(), new String[]{"."}, false, 0, 6, null);
        m14053W = C9553r.m14053W(m13682z0, 1);
        String str = (String) m14053W;
        if (str == null) {
            return null;
        }
        String base64String = URLDecoder.decode(str, "UTF-8");
        ByteString.C11214a c11214a = ByteString.f29482n;
        C9612q.m13918g(base64String, "base64String");
        ByteString m8550a = c11214a.m8550a(base64String);
        if (m8550a != null && (m8575D = m8550a.m8575D()) != null) {
            try {
                Json.C9954a c9954a = Json.f25830d;
                JsonElement m12778g = c9954a.m12778g(m8575D);
                JsonElement jsonElement = (JsonElement) C9964g.m12727m(m12778g).get("$meta");
                if (jsonElement == null) {
                    return null;
                }
                c9954a.mo265a();
                BuildOverrideCookieMeta buildOverrideCookieMeta = (BuildOverrideCookieMeta) c9954a.m12781d(BuildOverrideCookieMeta.Companion.serializer(), jsonElement);
                JsonObject m12727m = C9964g.m12727m(m12778g);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, JsonElement> entry : m12727m.entrySet()) {
                    if (!C9612q.m13922c(entry.getKey(), "$meta")) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                m6758d = C11888u.m6758d(linkedHashMap.size());
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(m6758d);
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    Json.C9954a c9954a2 = Json.f25830d;
                    c9954a2.mo265a();
                    linkedHashMap2.put(key, (BuildOverrideCookieBuild) c9954a2.m12781d(BuildOverrideCookieBuild.Companion.serializer(), (JsonElement) entry2.getValue()));
                }
                return new BuildOverrideCookieContents(buildOverrideCookieMeta, linkedHashMap2);
            } catch (C14278g unused) {
            }
        }
        return null;
    }

    public final boolean validateBuildOverrideCookie(Cookie cookie, String version) {
        List<String> allowedVersions;
        C9612q.m13917h(version, "version");
        BuildOverrideCookieContents parseBuildOverrideCookie = parseBuildOverrideCookie(cookie);
        if (parseBuildOverrideCookie == null || (allowedVersions = parseBuildOverrideCookie.getMeta().getAllowedVersions()) == null || allowedVersions.isEmpty()) {
            return false;
        }
        for (String str : allowedVersions) {
            if (C9612q.m13922c(str, version)) {
                return true;
            }
        }
        return false;
    }
}
