package com.discord.cache.legacy;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0002H\u0002\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0002¨\u0006\b"}, m14357d2 = {"getLegacyAuthToken", "", "Landroid/content/Context;", "getLegacySharedPrefs", "Landroid/content/SharedPreferences;", "getLegacySharedPrefsDurable", "wasLegacyUsingAMOLEDTheme", "", "cache_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class LegacyCacheUtilsKt {
    public static final String getLegacyAuthToken(Context context) {
        C9612q.m13917h(context, "<this>");
        return getLegacySharedPrefs(context).getString("STORE_AUTHED_TOKEN", null);
    }

    private static final SharedPreferences getLegacySharedPrefs(Context context) {
        String packageName = context.getPackageName();
        SharedPreferences sharedPreferences = context.getSharedPreferences(packageName + "_preferences", 0);
        C9612q.m13918g(sharedPreferences, "getSharedPreferences(\"${…s\", Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    private static final SharedPreferences getLegacySharedPrefsDurable(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("prefsSessionDurable", 0);
        C9612q.m13918g(sharedPreferences, "getSharedPreferences(\"pr…e\", Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    public static final boolean wasLegacyUsingAMOLEDTheme(Context context) {
        C9612q.m13917h(context, "<this>");
        return C9612q.m13922c(getLegacySharedPrefsDurable(context).getString("CACHE_KEY_THEME", null), "pureEvil");
    }
}