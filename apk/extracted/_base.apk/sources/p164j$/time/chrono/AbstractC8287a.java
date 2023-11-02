package p164j$.time.chrono;

import java.util.Locale;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.chrono.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8287a implements InterfaceC8293g {
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new Locale("ja", "JP", "JP");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((InterfaceC8293g) obj).getClass();
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC8287a) {
            ((AbstractC8287a) obj).getClass();
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ 72805;
    }

    public final String toString() {
        return "ISO";
    }
}
