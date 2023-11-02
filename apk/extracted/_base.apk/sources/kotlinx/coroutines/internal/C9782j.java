package kotlinx.coroutines.internal;

import kotlin.Metadata;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, m14357d2 = {"", "a", "Z", "()Z", "ANDROID_DETECTED", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9782j {

    /* renamed from: a */
    private static final boolean f25593a;

    static {
        Object m7596b;
        try {
            C11583s.C11584a c11584a = C11583s.f30090k;
            m7596b = C11583s.m7596b(Class.forName("android.os.Build"));
        } catch (Throwable th2) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            m7596b = C11583s.m7596b(C11586t.m7587a(th2));
        }
        f25593a = C11583s.m7590h(m7596b);
    }

    /* renamed from: a */
    public static final boolean m13276a() {
        return f25593a;
    }
}
