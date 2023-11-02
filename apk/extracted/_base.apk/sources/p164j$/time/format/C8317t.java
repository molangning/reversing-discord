package p164j$.time.format;

import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.format.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8317t {

    /* renamed from: a */
    public static final C8317t f22347a = new C8317t();

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    private C8317t() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8317t) {
            ((C8317t) obj).getClass();
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 182;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
