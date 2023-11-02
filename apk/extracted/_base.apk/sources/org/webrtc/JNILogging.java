package org.webrtc;

import org.webrtc.Logging;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
class JNILogging {
    private final Loggable loggable;

    public JNILogging(Loggable loggable) {
        this.loggable = loggable;
    }

    @CalledByNative
    public void logToInjectable(String str, Integer num, String str2) {
        this.loggable.onLogMessage(str, Logging.Severity.values()[num.intValue()], str2);
    }
}
