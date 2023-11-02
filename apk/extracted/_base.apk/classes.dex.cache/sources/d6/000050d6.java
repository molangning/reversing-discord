package p404wc;

import lc.C10119a;

/* renamed from: wc.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13478j {

    /* renamed from: a */
    private final C10119a f34705a;

    /* renamed from: b */
    private final C13488s f34706b;

    public AbstractC13478j(C10119a c10119a) {
        this.f34705a = c10119a;
        this.f34706b = new C13488s(c10119a);
    }

    /* renamed from: a */
    public static AbstractC13478j m2414a(C10119a c10119a) {
        if (c10119a.m12265d(1)) {
            return new C13475g(c10119a);
        }
        if (!c10119a.m12265d(2)) {
            return new C13479k(c10119a);
        }
        int m2381g = C13488s.m2381g(c10119a, 1, 4);
        if (m2381g != 4) {
            if (m2381g != 5) {
                int m2381g2 = C13488s.m2381g(c10119a, 1, 5);
                if (m2381g2 != 12) {
                    if (m2381g2 != 13) {
                        switch (C13488s.m2381g(c10119a, 1, 7)) {
                            case 56:
                                return new C13473e(c10119a, "310", "11");
                            case 57:
                                return new C13473e(c10119a, "320", "11");
                            case 58:
                                return new C13473e(c10119a, "310", "13");
                            case 59:
                                return new C13473e(c10119a, "320", "13");
                            case 60:
                                return new C13473e(c10119a, "310", "15");
                            case 61:
                                return new C13473e(c10119a, "320", "15");
                            case 62:
                                return new C13473e(c10119a, "310", "17");
                            case 63:
                                return new C13473e(c10119a, "320", "17");
                            default:
                                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(c10119a)));
                        }
                    }
                    return new C13472d(c10119a);
                }
                return new C13471c(c10119a);
            }
            return new C13470b(c10119a);
        }
        return new C13469a(c10119a);
    }

    /* renamed from: b */
    public final C13488s m2413b() {
        return this.f34706b;
    }

    /* renamed from: c */
    public final C10119a m2412c() {
        return this.f34705a;
    }

    /* renamed from: d */
    public abstract String mo2411d();
}