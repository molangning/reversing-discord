package com.discord.notifications.client;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\u0005J\u0010\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0005J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\fJ\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\fJ\u0016\u0010\u0019\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u001a\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u000fJ\u0016\u0010\u001c\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000fJ\u0016\u0010\u001e\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u000fJ\u0016\u0010 \u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u000fJ\u000e\u0010\"\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006$"}, m14357d2 = {"Lcom/discord/notifications/client/NotificationCache;", "", "()V", "cache", "Landroid/content/SharedPreferences;", "Landroid/content/Context;", "getCache", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "getBackgroundSyncRan", "", "context", "getCurrentUserId", "", "getCurrentUsername", "isAuthed", "", "isLightsEnabled", "isSoundsEnabled", "isVibrationsEnabled", "setBackgroundSyncRan", "", "setCurrentUserId", "userId", "setCurrentUsername", "username", "setIsAuthed", "setLightsEnabled", "lightsEnabled", "setNotifyEveryTime", "notifyEveryTime", "setSoundsEnabled", "soundsEnabled", "setVibrationsEnabled", "vibrationsEnabled", "shouldNotifyEveryTime", "Companion", "notification_client_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class NotificationCache {
    private static final String CACHE_KEY = "DiscordNotificationClient";
    private static final String CACHE_KEY_AUTHED = "CACHE_KEY_AUTHED";
    private static final String CACHE_KEY_CURRENT_USERNAME = "CACHE_KEY_CURRENT_USERNAME";
    private static final String CACHE_KEY_CURRENT_USER_ID = "CACHE_KEY_CURRENT_USER_ID";
    private static final String CACHE_KEY_LAST_BACKGROUND_SYNC_RAN = "CACHE_KEY_LAST_BACKGROUND_SYNC_RAN";
    private static final String CACHE_KEY_LIGHTS_ENABLED = "CACHE_KEY_LIGHTS_ENABLED";
    private static final String CACHE_KEY_NOTIFY_EVERY_TIME = "CACHE_KEY_NOTIFY_EVERY_TIME";
    private static final String CACHE_KEY_SOUNDS_ENABLED = "CACHE_KEY_SOUNDS_ENABLED";
    private static final String CACHE_KEY_VIBRATIONS_ENABLED = "CACHE_KEY_VIBRATIONS_ENABLED";
    public static final Companion Companion = new Companion(null);
    private SharedPreferences cache;

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m14357d2 = {"Lcom/discord/notifications/client/NotificationCache$Companion;", "", "()V", "CACHE_KEY", "", NotificationCache.CACHE_KEY_AUTHED, NotificationCache.CACHE_KEY_CURRENT_USERNAME, NotificationCache.CACHE_KEY_CURRENT_USER_ID, NotificationCache.CACHE_KEY_LAST_BACKGROUND_SYNC_RAN, NotificationCache.CACHE_KEY_LIGHTS_ENABLED, NotificationCache.CACHE_KEY_NOTIFY_EVERY_TIME, NotificationCache.CACHE_KEY_SOUNDS_ENABLED, NotificationCache.CACHE_KEY_VIBRATIONS_ENABLED, "notification_client_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final SharedPreferences getCache(Context context) {
        if (this.cache == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(CACHE_KEY, 0);
            C9612q.m13918g(sharedPreferences, "getSharedPreferences(CAC…EY, Context.MODE_PRIVATE)");
            this.cache = sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = this.cache;
        if (sharedPreferences2 == null) {
            C9612q.m13900y("cache");
            return null;
        }
        return sharedPreferences2;
    }

    public final long getBackgroundSyncRan(Context context) {
        C9612q.m13917h(context, "context");
        return getCache(context).getLong(CACHE_KEY_LAST_BACKGROUND_SYNC_RAN, 0L);
    }

    public final String getCurrentUserId(Context context) {
        C9612q.m13917h(context, "context");
        return getCache(context).getString(CACHE_KEY_CURRENT_USER_ID, null);
    }

    public final String getCurrentUsername(Context context) {
        C9612q.m13917h(context, "context");
        return getCache(context).getString(CACHE_KEY_CURRENT_USERNAME, null);
    }

    public final boolean isAuthed(Context context) {
        C9612q.m13917h(context, "context");
        return getCache(context).getBoolean(CACHE_KEY_AUTHED, false);
    }

    public final boolean isLightsEnabled(Context context) {
        C9612q.m13917h(context, "context");
        return getCache(context).getBoolean(CACHE_KEY_LIGHTS_ENABLED, true);
    }

    public final boolean isSoundsEnabled(Context context) {
        C9612q.m13917h(context, "context");
        return getCache(context).getBoolean(CACHE_KEY_SOUNDS_ENABLED, true);
    }

    public final boolean isVibrationsEnabled(Context context) {
        C9612q.m13917h(context, "context");
        return getCache(context).getBoolean(CACHE_KEY_VIBRATIONS_ENABLED, true);
    }

    public final void setBackgroundSyncRan(Context context) {
        C9612q.m13917h(context, "context");
        SharedPreferences.Editor editor = getCache(context).edit();
        C9612q.m13918g(editor, "editor");
        editor.putLong(CACHE_KEY_LAST_BACKGROUND_SYNC_RAN, System.currentTimeMillis());
        editor.apply();
    }

    public final void setCurrentUserId(Context context, String str) {
        C9612q.m13917h(context, "context");
        SharedPreferences.Editor editor = getCache(context).edit();
        C9612q.m13918g(editor, "editor");
        editor.putString(CACHE_KEY_CURRENT_USER_ID, str);
        editor.apply();
    }

    public final void setCurrentUsername(Context context, String str) {
        C9612q.m13917h(context, "context");
        SharedPreferences.Editor editor = getCache(context).edit();
        C9612q.m13918g(editor, "editor");
        editor.putString(CACHE_KEY_CURRENT_USERNAME, str);
        editor.apply();
    }

    public final void setIsAuthed(Context context, boolean z) {
        C9612q.m13917h(context, "context");
        SharedPreferences.Editor editor = getCache(context).edit();
        C9612q.m13918g(editor, "editor");
        editor.putBoolean(CACHE_KEY_AUTHED, z);
        editor.apply();
    }

    public final void setLightsEnabled(Context context, boolean z) {
        C9612q.m13917h(context, "context");
        SharedPreferences.Editor editor = getCache(context).edit();
        C9612q.m13918g(editor, "editor");
        editor.putBoolean(CACHE_KEY_LIGHTS_ENABLED, z);
        editor.apply();
    }

    public final void setNotifyEveryTime(Context context, boolean z) {
        C9612q.m13917h(context, "context");
        SharedPreferences.Editor editor = getCache(context).edit();
        C9612q.m13918g(editor, "editor");
        editor.putBoolean(CACHE_KEY_NOTIFY_EVERY_TIME, z);
        editor.apply();
    }

    public final void setSoundsEnabled(Context context, boolean z) {
        C9612q.m13917h(context, "context");
        SharedPreferences.Editor editor = getCache(context).edit();
        C9612q.m13918g(editor, "editor");
        editor.putBoolean(CACHE_KEY_SOUNDS_ENABLED, z);
        editor.apply();
    }

    public final void setVibrationsEnabled(Context context, boolean z) {
        C9612q.m13917h(context, "context");
        SharedPreferences.Editor editor = getCache(context).edit();
        C9612q.m13918g(editor, "editor");
        editor.putBoolean(CACHE_KEY_VIBRATIONS_ENABLED, z);
        editor.apply();
    }

    public final boolean shouldNotifyEveryTime(Context context) {
        C9612q.m13917h(context, "context");
        return getCache(context).getBoolean(CACHE_KEY_NOTIFY_EVERY_TIME, false);
    }
}