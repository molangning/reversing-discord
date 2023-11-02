package com.discord.jsitrace;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, m14357d2 = {"Lcom/discord/jsitrace/JSITraceCache;", "", "()V", "CACHE_KEY", "", JSITraceCache.CACHE_KEY_JSI_TRACE_ENABLED, "cache", "Landroid/content/SharedPreferences;", "Landroid/content/Context;", "getCache", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "isEnabled", "", "context", "setEnabled", "", ViewProps.ENABLED, "jsitrace_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class JSITraceCache {
    private static final String CACHE_KEY = "JSITraceCache";
    private static final String CACHE_KEY_JSI_TRACE_ENABLED = "CACHE_KEY_JSI_TRACE_ENABLED";
    public static final JSITraceCache INSTANCE = new JSITraceCache();

    private JSITraceCache() {
    }

    private final SharedPreferences getCache(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(CACHE_KEY, 0);
        C9612q.m13918g(sharedPreferences, "getSharedPreferences(CAC…EY, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    public final boolean isEnabled(Context context) {
        C9612q.m13917h(context, "context");
        return getCache(context).getBoolean(CACHE_KEY_JSI_TRACE_ENABLED, false);
    }

    public final void setEnabled(Context context, boolean z) {
        C9612q.m13917h(context, "context");
        SharedPreferences.Editor editor = getCache(context).edit();
        C9612q.m13918g(editor, "editor");
        editor.putBoolean(CACHE_KEY_JSI_TRACE_ENABLED, z);
        editor.apply();
    }
}
