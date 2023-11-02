package com.discord.cache;

import android.content.Context;
import android.content.SharedPreferences;
import com.discord.app_database.AppDatabaseModule;
import com.discord.cache.legacy.LegacyCacheUtilsKt;
import com.discord.logging.Log;
import com.discord.misc.utilities.time.TimeElapsed;
import com.discord.tti_manager.TTIMetrics;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.collections.C9560w;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9654p;
import tf.C12672a;

@ReactModule(name = "MMKVManager")
@Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\rH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0018\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rH\u0007R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m14357d2 = {"Lcom/discord/cache/CacheModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "fastCacheSharedPrefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "migrationSharedPrefs", "sharedPrefs", "clear", "", "getItem", "", "key", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getName", "getToken", "sanitized", "", "migrateAmoledThemeSetting", "context", "Lcom/facebook/react/bridge/ReactContext;", "migrateAuthToken", "migrateLegacySettings", "refresh", "exclude", "Lcom/facebook/react/bridge/ReadableArray;", "removeItem", "setItem", "value", "Companion", "cache_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class CacheModule extends ReactContextBaseJavaModule {
    private static final String CACHE_STORE_NAME = "CacheStore";
    public static final Companion Companion = new Companion(null);
    private static final HashSet<String> FAST_CACHE_KEYS;
    private static boolean cacheLoaded;
    private static final String logTag;
    private final SharedPreferences fastCacheSharedPrefs;
    private final SharedPreferences migrationSharedPrefs;
    private final SharedPreferences sharedPrefs;

    @Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0006j\b\u0012\u0004\u0012\u00020\u0004`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m14357d2 = {"Lcom/discord/cache/CacheModule$Companion;", "", "()V", "CACHE_STORE_NAME", "", "FAST_CACHE_KEYS", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "cacheLoaded", "", "logTag", "get", "Lcom/discord/cache/CacheModule;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "getOrNull", "quickInitCache", "", "applicationContext", "Landroid/content/Context;", "cache_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CacheModule get(ReactContext reactContext) {
            C9612q.m13917h(reactContext, "reactContext");
            CacheModule orNull = getOrNull(reactContext);
            C9612q.m13920e(orNull);
            return orNull;
        }

        public final CacheModule getOrNull(ReactContext reactContext) {
            C9612q.m13917h(reactContext, "reactContext");
            return (CacheModule) reactContext.getNativeModule(CacheModule.class);
        }

        public final void quickInitCache(Context applicationContext) {
            C9612q.m13917h(applicationContext, "applicationContext");
            C12672a.m4551b(false, false, null, null, 0, new CacheModule$Companion$quickInitCache$1(applicationContext), 31, null);
        }
    }

    static {
        HashSet<String> m14006e;
        m14006e = C9560w.m14006e("_clientStateKey", "_userIdKey", AppDatabaseModule.LAST_DATABASE_USER_ID_PREFERENCES_KEY, "token");
        FAST_CACHE_KEYS = m14006e;
        String simpleName = CacheModule.class.getSimpleName();
        C9612q.m13918g(simpleName, "CacheModule::class.java.simpleName");
        logTag = simpleName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        this.sharedPrefs = reactContext.getSharedPreferences(CACHE_STORE_NAME, 0);
        this.migrationSharedPrefs = reactContext.getSharedPreferences("MigrationPrefStore", 0);
        this.fastCacheSharedPrefs = reactContext.getSharedPreferences("FastCacheStore", 0);
        migrateLegacySettings(reactContext);
    }

    public static /* synthetic */ String getToken$default(CacheModule cacheModule, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return cacheModule.getToken(z);
    }

    private final void migrateAmoledThemeSetting(ReactContext reactContext) {
        boolean wasLegacyUsingAMOLEDTheme = LegacyCacheUtilsKt.wasLegacyUsingAMOLEDTheme(reactContext);
        SharedPreferences sharedPrefs = this.sharedPrefs;
        C9612q.m13918g(sharedPrefs, "sharedPrefs");
        SharedPreferences.Editor editor = sharedPrefs.edit();
        C9612q.m13918g(editor, "editor");
        if (wasLegacyUsingAMOLEDTheme) {
            editor.putString("legacy_useAMOLEDTheme", "true");
        } else {
            editor.remove("legacy_useAMOLEDTheme");
        }
        editor.apply();
    }

    private final void migrateAuthToken(ReactContext reactContext) {
        String legacyAuthToken;
        if (getItem("token") == null && (legacyAuthToken = LegacyCacheUtilsKt.getLegacyAuthToken(reactContext)) != null) {
            setItem("token", "\"" + legacyAuthToken + "\"");
        }
    }

    private final void migrateLegacySettings(ReactContext reactContext) {
        if (!this.migrationSharedPrefs.getBoolean("migrated_legacy", false)) {
            migrateAuthToken(reactContext);
            migrateAmoledThemeSetting(reactContext);
            SharedPreferences migrationSharedPrefs = this.migrationSharedPrefs;
            C9612q.m13918g(migrationSharedPrefs, "migrationSharedPrefs");
            SharedPreferences.Editor editor = migrationSharedPrefs.edit();
            C9612q.m13918g(editor, "editor");
            editor.putBoolean("migrated_legacy", true);
            editor.apply();
        }
    }

    @ReactMethod
    public final void clear() {
        SharedPreferences sharedPrefs = this.sharedPrefs;
        C9612q.m13918g(sharedPrefs, "sharedPrefs");
        SharedPreferences.Editor editor = sharedPrefs.edit();
        C9612q.m13918g(editor, "editor");
        editor.clear();
        editor.apply();
        SharedPreferences fastCacheSharedPrefs = this.fastCacheSharedPrefs;
        C9612q.m13918g(fastCacheSharedPrefs, "fastCacheSharedPrefs");
        SharedPreferences.Editor editor2 = fastCacheSharedPrefs.edit();
        C9612q.m13918g(editor2, "editor");
        editor2.clear();
        editor2.apply();
    }

    @ReactMethod
    public final void getItem(String key, Promise promise) {
        C9612q.m13917h(key, "key");
        C9612q.m13917h(promise, "promise");
        if (!cacheLoaded) {
            TTIMetrics tTIMetrics = TTIMetrics.INSTANCE;
            TTIMetrics.record$default(tTIMetrics, "WARNING: Cache accessed before parsed " + key, 0L, null, false, 14, null);
        }
        try {
            promise.resolve(this.sharedPrefs.getString(key, null));
        } catch (Throwable th2) {
            promise.reject(th2);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MMKVManager";
    }

    public final String getToken(boolean z) {
        String m13690r0;
        if (z) {
            String item = getItem("token");
            if (item != null) {
                m13690r0 = C9654p.m13690r0(item, "\"");
                return m13690r0;
            }
            return null;
        }
        return getItem("token");
    }

    @ReactMethod
    public final void refresh(ReadableArray exclude, Promise promise) {
        WritableNativeMap writableNativeMap;
        Set m14071G0;
        C9612q.m13917h(exclude, "exclude");
        C9612q.m13917h(promise, "promise");
        TimeElapsed timeElapsed = new TimeElapsed(0L, 1, null);
        TTIMetrics.record$default(TTIMetrics.INSTANCE, "Storage.refresh() Start", 0L, null, false, 14, null);
        try {
            writableNativeMap = new WritableNativeMap();
            ArrayList<Object> arrayList = exclude.toArrayList();
            C9612q.m13918g(arrayList, "exclude.toArrayList()");
            m14071G0 = C9553r.m14071G0(arrayList);
            Log log = Log.INSTANCE;
            String str = logTag;
            Log.i$default(log, str, "Refresh preferences excluding " + m14071G0, (Throwable) null, 4, (Object) null);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Iterator<T> it = this.sharedPrefs.getAll().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (!m14071G0.contains(str2)) {
                    C9612q.m13919f(value, "null cannot be cast to non-null type kotlin.String");
                    writableNativeMap.putString(str2, (String) value);
                }
            }
            promise.resolve(writableNativeMap);
            Log log2 = Log.INSTANCE;
            String str3 = logTag;
            String duration = timeElapsed.getDuration();
            Log.i$default(log2, str3, "Refreshed preferences in " + duration, (Throwable) null, 4, (Object) null);
        } catch (Throwable th3) {
            th = th3;
            try {
                promise.reject(th);
            } finally {
                TTIMetrics.record$default(TTIMetrics.INSTANCE, "Storage.refresh() End", 0L, null, false, 14, null);
            }
        }
    }

    @ReactMethod
    public final void removeItem(String key) {
        C9612q.m13917h(key, "key");
        SharedPreferences sharedPrefs = this.sharedPrefs;
        C9612q.m13918g(sharedPrefs, "sharedPrefs");
        SharedPreferences.Editor editor = sharedPrefs.edit();
        C9612q.m13918g(editor, "editor");
        editor.remove(key);
        editor.apply();
        if (FAST_CACHE_KEYS.contains(key)) {
            SharedPreferences fastCacheSharedPrefs = this.fastCacheSharedPrefs;
            C9612q.m13918g(fastCacheSharedPrefs, "fastCacheSharedPrefs");
            SharedPreferences.Editor editor2 = fastCacheSharedPrefs.edit();
            C9612q.m13918g(editor2, "editor");
            editor2.remove(key);
            editor2.apply();
        }
    }

    @ReactMethod
    public final void setItem(String key, String value) {
        C9612q.m13917h(key, "key");
        C9612q.m13917h(value, "value");
        SharedPreferences sharedPrefs = this.sharedPrefs;
        C9612q.m13918g(sharedPrefs, "sharedPrefs");
        SharedPreferences.Editor editor = sharedPrefs.edit();
        C9612q.m13918g(editor, "editor");
        editor.putString(key, value);
        editor.apply();
        if (FAST_CACHE_KEYS.contains(key)) {
            SharedPreferences fastCacheSharedPrefs = this.fastCacheSharedPrefs;
            C9612q.m13918g(fastCacheSharedPrefs, "fastCacheSharedPrefs");
            SharedPreferences.Editor editor2 = fastCacheSharedPrefs.edit();
            C9612q.m13918g(editor2, "editor");
            editor2.putString(key, value);
            editor2.apply();
        }
    }

    @ReactMethod
    public final String getItem(String key) {
        C9612q.m13917h(key, "key");
        HashSet<String> hashSet = FAST_CACHE_KEYS;
        if (hashSet.contains(key)) {
            if (!this.fastCacheSharedPrefs.getBoolean("initialized", false)) {
                SharedPreferences fastCacheSharedPrefs = this.fastCacheSharedPrefs;
                C9612q.m13918g(fastCacheSharedPrefs, "fastCacheSharedPrefs");
                SharedPreferences.Editor editor = fastCacheSharedPrefs.edit();
                C9612q.m13918g(editor, "editor");
                editor.putBoolean("initialized", true);
                for (String str : hashSet) {
                    editor.putString(str, this.sharedPrefs.getString(str, null));
                }
                editor.apply();
            }
            return this.fastCacheSharedPrefs.getString(key, null);
        }
        if (!cacheLoaded) {
            TTIMetrics tTIMetrics = TTIMetrics.INSTANCE;
            TTIMetrics.record$default(tTIMetrics, "WARNING: Cache accessed before parsed " + key, 0L, null, false, 14, null);
        }
        return this.sharedPrefs.getString(key, null);
    }
}
