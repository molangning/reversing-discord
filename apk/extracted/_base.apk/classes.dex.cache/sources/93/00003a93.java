package p164j$.time;

import java.io.Serializable;

/* renamed from: j$.time.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8285b extends AbstractC8286c implements Serializable {

    /* renamed from: a */
    private final AbstractC8329o f22290a;

    public C8285b(ZoneOffset zoneOffset) {
        this.f22290a = zoneOffset;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8285b) {
            return this.f22290a.equals(((C8285b) obj).f22290a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22290a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f22290a + "]";
    }
}