package p437y4;

/* renamed from: y4.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13882g {

    /* renamed from: a */
    public static final int f35718a = m1315b();

    /* renamed from: b */
    private static int f35719b = 384;

    /* renamed from: c */
    private static volatile C13880f f35720c;

    /* renamed from: a */
    public static C13880f m1316a() {
        if (f35720c == null) {
            synchronized (C13882g.class) {
                if (f35720c == null) {
                    f35720c = new C13880f(f35719b, f35718a);
                }
            }
        }
        return f35720c;
    }

    /* renamed from: b */
    private static int m1315b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }
}
