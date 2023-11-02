package com.discord.foreground_service.utils;

import com.discord.crash_reporting.CrashReporting;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0000¢\u0006\u0002\b\u000bJ/\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0000¢\u0006\u0002\b\r¨\u0006\u000e"}, m14357d2 = {"Lcom/discord/foreground_service/utils/Log;", "", "()V", "i", "", "tag", "", "message", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "i$foreground_service_release", "w", "w$foreground_service_release", "foreground_service_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class Log {
    public static final Log INSTANCE = new Log();

    private Log() {
    }

    public static /* synthetic */ void i$foreground_service_release$default(Log log, String str, String str2, Exception exc, int i, Object obj) {
        if ((i & 4) != 0) {
            exc = null;
        }
        log.i$foreground_service_release(str, str2, exc);
    }

    public static /* synthetic */ void w$foreground_service_release$default(Log log, String str, String str2, Exception exc, int i, Object obj) {
        if ((i & 4) != 0) {
            exc = null;
        }
        log.w$foreground_service_release(str, str2, exc);
    }

    public final void i$foreground_service_release(String tag, String message, Exception exc) {
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(message, "message");
        CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, message, null, tag, 2, null);
        com.discord.logging.Log.INSTANCE.m31910i(tag, message, exc);
    }

    public final void w$foreground_service_release(String tag, String message, Exception exc) {
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(message, "message");
        CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, message, null, tag, 2, null);
        com.discord.logging.Log.INSTANCE.m31908w(tag, message, exc);
    }
}