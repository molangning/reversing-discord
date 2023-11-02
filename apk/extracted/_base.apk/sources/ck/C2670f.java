package ck;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, m14357d2 = {"Lck/f;", "Ljava/util/logging/Handler;", "Ljava/util/logging/LogRecord;", "record", "", "publish", "flush", "close", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: ck.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C2670f extends Handler {

    /* renamed from: a */
    public static final C2670f f7166a = new C2670f();

    private C2670f() {
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        int m32740b;
        C9612q.m13917h(record, "record");
        C2669e c2669e = C2669e.f7165c;
        String loggerName = record.getLoggerName();
        C9612q.m13918g(loggerName, "record.loggerName");
        m32740b = C2671g.m32740b(record);
        String message = record.getMessage();
        C9612q.m13918g(message, "record.message");
        c2669e.m32745a(loggerName, m32740b, message, record.getThrown());
    }
}
