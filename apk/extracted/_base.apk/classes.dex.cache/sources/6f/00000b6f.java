package ck;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m14357d2 = {"Ljava/util/logging/LogRecord;", "", "b", "(Ljava/util/logging/LogRecord;)I", "androidLevel", "okhttp"}, m14356k = 2, m14355mv = {1, 4, 0})
/* renamed from: ck.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C2671g {
    /* renamed from: b */
    public static final int m32740b(LogRecord logRecord) {
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            return 5;
        }
        if (logRecord.getLevel().intValue() == Level.INFO.intValue()) {
            return 4;
        }
        return 3;
    }
}