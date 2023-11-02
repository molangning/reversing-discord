package dj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9652n;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, m14357d2 = {"", "a", "I", "MAX_CHARS_IN_POOL", "kotlinx-serialization-json"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: dj.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5980d {

    /* renamed from: a */
    private static final int f17019a;

    static {
        Object m7596b;
        int i;
        Integer m13769m;
        try {
            C11583s.C11584a c11584a = C11583s.f30090k;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            C9612q.m13918g(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            m13769m = C9652n.m13769m(property);
            m7596b = C11583s.m7596b(m13769m);
        } catch (Throwable th2) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            m7596b = C11583s.m7596b(C11586t.m7587a(th2));
        }
        if (C11583s.m7591g(m7596b)) {
            m7596b = null;
        }
        Integer num = (Integer) m7596b;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2097152;
        }
        f17019a = i;
    }
}