package com.discord.crash_reporting.system_logs;

import android.content.Context;
import android.content.SharedPreferences;
import com.discord.crash_reporting.system_logs.HistoricalProcessExitReason;
import com.discord.crash_reporting.system_logs.SystemLogUtils;
import com.discord.logging.Log;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J3\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\f0\u0011H\u0000¢\u0006\u0002\b\u0014R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m14357d2 = {"Lcom/discord/crash_reporting/system_logs/SystemLogReport;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "checkHashChanged", "", "context", "Landroid/content/Context;", "hash", "recordBreadcrumb", "", "msg", "category", "reportLastCrash", "cb", "Lkotlin/Function2;", "Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;", "Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;", "reportLastCrash$crash_reporting_release", "LastStoredTombstoneCache", "crash_reporting_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SystemLogReport {
    public static final SystemLogReport INSTANCE = new SystemLogReport();
    private static final String TAG = SystemLogReport.class.getSimpleName();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, m14357d2 = {"Lcom/discord/crash_reporting/system_logs/SystemLogReport$LastStoredTombstoneCache;", "", "()V", "CACHE_KEY", "", "cache", "Landroid/content/SharedPreferences;", "Landroid/content/Context;", "getCache", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "get", "context", "set", "", "hash", "crash_reporting_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class LastStoredTombstoneCache {
        private static final String CACHE_KEY = "LastStoredTombstoneCache";
        public static final LastStoredTombstoneCache INSTANCE = new LastStoredTombstoneCache();

        private LastStoredTombstoneCache() {
        }

        private final SharedPreferences getCache(Context context) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(CACHE_KEY, 0);
            C9612q.m13918g(sharedPreferences, "getSharedPreferences(CAC…EY, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }

        public final String get(Context context) {
            C9612q.m13917h(context, "context");
            return getCache(context).getString(CACHE_KEY, null);
        }

        public final void set(Context context, String hash) {
            C9612q.m13917h(context, "context");
            C9612q.m13917h(hash, "hash");
            SharedPreferences.Editor editor = getCache(context).edit();
            C9612q.m13918g(editor, "editor");
            editor.putString(CACHE_KEY, hash);
            editor.apply();
        }
    }

    private SystemLogReport() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkHashChanged(Context context, String str) {
        LastStoredTombstoneCache lastStoredTombstoneCache = LastStoredTombstoneCache.INSTANCE;
        if (C9612q.m13922c(lastStoredTombstoneCache.get(context), str)) {
            return false;
        }
        lastStoredTombstoneCache.set(context, str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordBreadcrumb(String str, String str2) {
        Log log = Log.INSTANCE;
        String TAG2 = TAG;
        C9612q.m13918g(TAG2, "TAG");
        Log.i$default(log, TAG2, "Breadcrumb, [" + str2 + "]: " + str, (Throwable) null, 4, (Object) null);
    }

    public final void reportLastCrash$crash_reporting_release(Context context, Function2<? super HistoricalProcessExitReason.Reason, ? super SystemLogUtils.Tombstone, Unit> cb) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(cb, "cb");
        SystemLogUtils.INSTANCE.fetchLastTombstone(new SystemLogReport$reportLastCrash$1(cb, context));
    }
}
