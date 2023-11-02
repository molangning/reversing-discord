package com.discord.crash_reporting;

import io.sentry.C7896d3;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
class WebrtcCrashReporting {
    WebrtcCrashReporting() {
    }

    static String reportWebrtcException(Throwable th2) {
        C7896d3.m19418g(th2);
        return th2.toString();
    }
}
