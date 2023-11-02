package ae;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import pf.C11560f;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a6\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¨\u0006\n"}, m14357d2 = {"", "throwable", "Lcom/facebook/react/bridge/ReadableMap;", "a", "", "code", "message", "Lcom/facebook/react/bridge/WritableMap;", "userInfo", "b", "react-native-vision-camera_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: ae.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0149a {
    /* renamed from: a */
    private static final ReadableMap m41061a(Throwable th2) {
        String m7636b;
        WritableMap map = Arguments.createMap();
        map.putString("message", th2.getMessage());
        m7636b = C11560f.m7636b(th2);
        map.putString("stacktrace", m7636b);
        if (th2.getCause() != null) {
            Throwable cause = th2.getCause();
            C9612q.m13920e(cause);
            map.putMap("cause", m41061a(cause));
        }
        C9612q.m13918g(map, "map");
        return map;
    }

    /* renamed from: b */
    public static final ReadableMap m41060b(String str, String str2, Throwable th2, WritableMap writableMap) {
        ReadableMap readableMap;
        WritableMap map = Arguments.createMap();
        map.putString("code", str);
        map.putString("message", str2);
        if (th2 != null) {
            readableMap = m41061a(th2);
        } else {
            readableMap = null;
        }
        map.putMap("cause", readableMap);
        map.putMap("userInfo", writableMap);
        C9612q.m13918g(map, "map");
        return map;
    }

    /* renamed from: c */
    public static /* synthetic */ ReadableMap m41059c(String str, String str2, Throwable th2, WritableMap writableMap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            th2 = null;
        }
        if ((i & 8) != 0) {
            writableMap = null;
        }
        return m41060b(str, str2, th2, writableMap);
    }
}