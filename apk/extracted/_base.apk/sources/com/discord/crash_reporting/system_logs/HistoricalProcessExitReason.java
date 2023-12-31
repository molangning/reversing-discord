package com.discord.crash_reporting.system_logs;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import p304qf.C11889v;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m14357d2 = {"Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason;", "", "()V", "exitReasonLookup", "", "", "", "lastReason", "Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;", "context", "Landroid/content/Context;", "Reason", "crash_reporting_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class HistoricalProcessExitReason {
    public static final HistoricalProcessExitReason INSTANCE = new HistoricalProcessExitReason();
    private static final Map<Integer, String> exitReasonLookup;

    @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m14357d2 = {"Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;", "", "reason", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getReason", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "crash_reporting_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Reason {
        private final String description;
        private final String reason;

        public Reason(String reason, String str) {
            C9612q.m13917h(reason, "reason");
            this.reason = reason;
            this.description = str;
        }

        public static /* synthetic */ Reason copy$default(Reason reason, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = reason.reason;
            }
            if ((i & 2) != 0) {
                str2 = reason.description;
            }
            return reason.copy(str, str2);
        }

        public final String component1() {
            return this.reason;
        }

        public final String component2() {
            return this.description;
        }

        public final Reason copy(String reason, String str) {
            C9612q.m13917h(reason, "reason");
            return new Reason(reason, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Reason) {
                Reason reason = (Reason) obj;
                return C9612q.m13922c(this.reason, reason.reason) && C9612q.m13922c(this.description, reason.description);
            }
            return false;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            int hashCode = this.reason.hashCode() * 31;
            String str = this.description;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.reason;
            String str2 = this.description;
            return "Reason(reason=" + str + ", description=" + str2 + ")";
        }
    }

    static {
        Map<Integer, String> m6751k;
        if (Build.VERSION.SDK_INT < 30) {
            m6751k = C11889v.m6754h();
        } else {
            m6751k = C11889v.m6751k(C11591x.m7577a(6, "ANR"), C11591x.m7577a(4, "CRASH"), C11591x.m7577a(5, "CRASH_NATIVE"), C11591x.m7577a(12, "DEPENDENCY_DIED"), C11591x.m7577a(9, "EXCESSIVE_RESOURCE_USAGE"), C11591x.m7577a(1, "EXIT_SELF"), C11591x.m7577a(7, "INITIALIZATION_FAILURE"), C11591x.m7577a(3, "LOW_MEMORY"), C11591x.m7577a(13, "OTHER"), C11591x.m7577a(8, "PERMISSION_CHANGE"), C11591x.m7577a(2, "SIGNALED"), C11591x.m7577a(0, "UNKNOWN"), C11591x.m7577a(10, "USER_REQUESTED"), C11591x.m7577a(11, "USER_STOPPED"));
        }
        exitReasonLookup = m6751k;
    }

    private HistoricalProcessExitReason() {
    }

    public final Reason lastReason(Context context) {
        ActivityManager activityManager;
        List historicalProcessExitReasons;
        Object m14054V;
        int reason;
        String description;
        int reason2;
        C9612q.m13917h(context, "context");
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Object systemService = context.getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager == null) {
            return null;
        }
        historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 1);
        C9612q.m13918g(historicalProcessExitReasons, "activityManager.getHisto…ssExitReasons(null, 0, 1)");
        m14054V = C9553r.m14054V(historicalProcessExitReasons);
        ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) m14054V;
        if (applicationExitInfo == null) {
            return null;
        }
        Map<Integer, String> map = exitReasonLookup;
        reason = applicationExitInfo.getReason();
        String str = map.get(Integer.valueOf(reason));
        if (str == null) {
            reason2 = applicationExitInfo.getReason();
            str = "Unknown " + reason2;
        }
        description = applicationExitInfo.getDescription();
        return new Reason(str, description);
    }
}
