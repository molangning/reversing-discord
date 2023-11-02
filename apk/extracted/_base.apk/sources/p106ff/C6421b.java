package p106ff;

import p067df.InterfaceC5831b;

/* renamed from: ff.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6421b {

    /* renamed from: a */
    static final InterfaceC5831b<Object, Object> f18057a = new C6422a();

    /* renamed from: ff.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C6422a implements InterfaceC5831b<Object, Object> {
        C6422a() {
        }
    }

    /* renamed from: a */
    public static int m22786a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m22785b(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: c */
    public static <T> T m22784c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static int m22783d(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }
}
