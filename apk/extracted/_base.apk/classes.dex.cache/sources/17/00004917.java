package p285pc;

import p136hc.C7060f;

/* renamed from: pc.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11495e {

    /* renamed from: h */
    private static final C11495e[] f29835h = m7986a();

    /* renamed from: a */
    private final int f29836a;

    /* renamed from: b */
    private final int f29837b;

    /* renamed from: c */
    private final int f29838c;

    /* renamed from: d */
    private final int f29839d;

    /* renamed from: e */
    private final int f29840e;

    /* renamed from: f */
    private final C11498c f29841f;

    /* renamed from: g */
    private final int f29842g;

    /* renamed from: pc.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11497b {

        /* renamed from: a */
        private final int f29843a;

        /* renamed from: b */
        private final int f29844b;

        /* renamed from: a */
        public int m7977a() {
            return this.f29843a;
        }

        /* renamed from: b */
        public int m7976b() {
            return this.f29844b;
        }

        private C11497b(int i, int i2) {
            this.f29843a = i;
            this.f29844b = i2;
        }
    }

    private C11495e(int i, int i2, int i3, int i4, int i5, C11498c c11498c) {
        C11497b[] m7975a;
        this.f29836a = i;
        this.f29837b = i2;
        this.f29838c = i3;
        this.f29839d = i4;
        this.f29840e = i5;
        this.f29841f = c11498c;
        int m7974b = c11498c.m7974b();
        int i6 = 0;
        for (C11497b c11497b : c11498c.m7975a()) {
            i6 += c11497b.m7977a() * (c11497b.m7976b() + m7974b);
        }
        this.f29842g = i6;
    }

    /* renamed from: a */
    private static C11495e[] m7986a() {
        return new C11495e[]{new C11495e(1, 10, 10, 8, 8, new C11498c(5, new C11497b(1, 3))), new C11495e(2, 12, 12, 10, 10, new C11498c(7, new C11497b(1, 5))), new C11495e(3, 14, 14, 12, 12, new C11498c(10, new C11497b(1, 8))), new C11495e(4, 16, 16, 14, 14, new C11498c(12, new C11497b(1, 12))), new C11495e(5, 18, 18, 16, 16, new C11498c(14, new C11497b(1, 18))), new C11495e(6, 20, 20, 18, 18, new C11498c(18, new C11497b(1, 22))), new C11495e(7, 22, 22, 20, 20, new C11498c(20, new C11497b(1, 30))), new C11495e(8, 24, 24, 22, 22, new C11498c(24, new C11497b(1, 36))), new C11495e(9, 26, 26, 24, 24, new C11498c(28, new C11497b(1, 44))), new C11495e(10, 32, 32, 14, 14, new C11498c(36, new C11497b(1, 62))), new C11495e(11, 36, 36, 16, 16, new C11498c(42, new C11497b(1, 86))), new C11495e(12, 40, 40, 18, 18, new C11498c(48, new C11497b(1, 114))), new C11495e(13, 44, 44, 20, 20, new C11498c(56, new C11497b(1, 144))), new C11495e(14, 48, 48, 22, 22, new C11498c(68, new C11497b(1, 174))), new C11495e(15, 52, 52, 24, 24, new C11498c(42, new C11497b(2, 102))), new C11495e(16, 64, 64, 14, 14, new C11498c(56, new C11497b(2, 140))), new C11495e(17, 72, 72, 16, 16, new C11498c(36, new C11497b(4, 92))), new C11495e(18, 80, 80, 18, 18, new C11498c(48, new C11497b(4, 114))), new C11495e(19, 88, 88, 20, 20, new C11498c(56, new C11497b(4, 144))), new C11495e(20, 96, 96, 22, 22, new C11498c(68, new C11497b(4, 174))), new C11495e(21, 104, 104, 24, 24, new C11498c(56, new C11497b(6, 136))), new C11495e(22, 120, 120, 18, 18, new C11498c(68, new C11497b(6, 175))), new C11495e(23, 132, 132, 20, 20, new C11498c(62, new C11497b(8, 163))), new C11495e(24, 144, 144, 22, 22, new C11498c(62, new C11497b(8, 156), new C11497b(2, 155))), new C11495e(25, 8, 18, 6, 16, new C11498c(7, new C11497b(1, 5))), new C11495e(26, 8, 32, 6, 14, new C11498c(11, new C11497b(1, 10))), new C11495e(27, 12, 26, 10, 24, new C11498c(14, new C11497b(1, 16))), new C11495e(28, 12, 36, 10, 16, new C11498c(18, new C11497b(1, 22))), new C11495e(29, 16, 36, 14, 16, new C11498c(24, new C11497b(1, 32))), new C11495e(30, 16, 48, 14, 22, new C11498c(28, new C11497b(1, 49)))};
    }

    /* renamed from: h */
    public static C11495e m7979h(int i, int i2) {
        C11495e[] c11495eArr;
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            for (C11495e c11495e : f29835h) {
                if (c11495e.f29837b == i && c11495e.f29838c == i2) {
                    return c11495e;
                }
            }
            throw C7060f.m21471a();
        }
        throw C7060f.m21471a();
    }

    /* renamed from: b */
    public int m7985b() {
        return this.f29840e;
    }

    /* renamed from: c */
    public int m7984c() {
        return this.f29839d;
    }

    /* renamed from: d */
    public C11498c m7983d() {
        return this.f29841f;
    }

    /* renamed from: e */
    public int m7982e() {
        return this.f29838c;
    }

    /* renamed from: f */
    public int m7981f() {
        return this.f29837b;
    }

    /* renamed from: g */
    public int m7980g() {
        return this.f29842g;
    }

    /* renamed from: i */
    public int m7978i() {
        return this.f29836a;
    }

    public String toString() {
        return String.valueOf(this.f29836a);
    }

    /* renamed from: pc.e$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11498c {

        /* renamed from: a */
        private final int f29845a;

        /* renamed from: b */
        private final C11497b[] f29846b;

        /* renamed from: a */
        public C11497b[] m7975a() {
            return this.f29846b;
        }

        /* renamed from: b */
        public int m7974b() {
            return this.f29845a;
        }

        private C11498c(int i, C11497b c11497b) {
            this.f29845a = i;
            this.f29846b = new C11497b[]{c11497b};
        }

        private C11498c(int i, C11497b c11497b, C11497b c11497b2) {
            this.f29845a = i;
            this.f29846b = new C11497b[]{c11497b, c11497b2};
        }
    }
}