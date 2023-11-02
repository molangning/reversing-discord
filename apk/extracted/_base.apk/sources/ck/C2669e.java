package ck;

import android.util.Log;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9654p;
import kotlin.text.C9659r;
import okhttp3.OkHttpClient;
import p304qf.C11889v;
import p390vj.C13346e;
import p471zj.C14298e;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J1\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0007R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016¨\u0006\u001a"}, m14357d2 = {"Lck/e;", "", "", "loggerName", "d", "logger", "tag", "", "c", "", "logLevel", "message", "", "t", "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "b", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/logging/Logger;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "configuredLoggers", "", "Ljava/util/Map;", "knownLoggers", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: ck.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C2669e {

    /* renamed from: b */
    private static final Map<String, String> f7164b;

    /* renamed from: c */
    public static final C2669e f7165c = new C2669e();

    /* renamed from: a */
    private static final CopyOnWriteArraySet<Logger> f7163a = new CopyOnWriteArraySet<>();

    static {
        String str;
        Map<String, String> m6742t;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = OkHttpClient.class.getPackage();
        if (r2 != null) {
            str = r2.getName();
        } else {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        String name = OkHttpClient.class.getName();
        C9612q.m13918g(name, "OkHttpClient::class.java.name");
        linkedHashMap.put(name, "okhttp.OkHttpClient");
        String name2 = C14298e.class.getName();
        C9612q.m13918g(name2, "Http2::class.java.name");
        linkedHashMap.put(name2, "okhttp.Http2");
        String name3 = C13346e.class.getName();
        C9612q.m13918g(name3, "TaskRunner::class.java.name");
        linkedHashMap.put(name3, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        m6742t = C11889v.m6742t(linkedHashMap);
        f7164b = m6742t;
    }

    private C2669e() {
    }

    /* renamed from: c */
    private final void m32743c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f7163a.add(logger)) {
            C9612q.m13918g(logger, "logger");
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else if (Log.isLoggable(str2, 4)) {
                level = Level.INFO;
            } else {
                level = Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(C2670f.f7166a);
        }
    }

    /* renamed from: d */
    private final String m32742d(String str) {
        String m13674a1;
        String str2 = f7164b.get(str);
        if (str2 != null) {
            return str2;
        }
        m13674a1 = C9659r.m13674a1(str, 23);
        return m13674a1;
    }

    /* renamed from: a */
    public final void m32745a(String loggerName, int i, String message, Throwable th2) {
        int m13709Y;
        int min;
        C9612q.m13917h(loggerName, "loggerName");
        C9612q.m13917h(message, "message");
        String m32742d = m32742d(loggerName);
        if (Log.isLoggable(m32742d, i)) {
            if (th2 != null) {
                message = message + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + Log.getStackTraceString(th2);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                m13709Y = C9654p.m13709Y(message, '\n', i2, false, 4, null);
                if (m13709Y == -1) {
                    m13709Y = length;
                }
                while (true) {
                    min = Math.min(m13709Y, i2 + 4000);
                    String substring = message.substring(i2, min);
                    C9612q.m13918g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i, m32742d, substring);
                    if (min >= m13709Y) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    /* renamed from: b */
    public final void m32744b() {
        for (Map.Entry<String, String> entry : f7164b.entrySet()) {
            m32743c(entry.getKey(), entry.getValue());
        }
    }
}
