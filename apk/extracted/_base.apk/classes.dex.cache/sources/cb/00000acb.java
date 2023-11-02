package cd;

import com.facebook.react.uimanager.ViewDefaults;
import lc.C10120b;
import p136hc.C7060f;

/* renamed from: cd.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2507j {

    /* renamed from: e */
    private static final int[] f6887e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f */
    private static final C2507j[] f6888f = m33109b();

    /* renamed from: a */
    private final int f6889a;

    /* renamed from: b */
    private final int[] f6890b;

    /* renamed from: c */
    private final C2509b[] f6891c;

    /* renamed from: d */
    private final int f6892d;

    /* renamed from: cd.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2508a {

        /* renamed from: a */
        private final int f6893a;

        /* renamed from: b */
        private final int f6894b;

        C2508a(int i, int i2) {
            this.f6893a = i;
            this.f6894b = i2;
        }

        /* renamed from: a */
        public int m33100a() {
            return this.f6893a;
        }

        /* renamed from: b */
        public int m33099b() {
            return this.f6894b;
        }
    }

    /* renamed from: cd.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2509b {

        /* renamed from: a */
        private final int f6895a;

        /* renamed from: b */
        private final C2508a[] f6896b;

        C2509b(int i, C2508a... c2508aArr) {
            this.f6895a = i;
            this.f6896b = c2508aArr;
        }

        /* renamed from: a */
        public C2508a[] m33098a() {
            return this.f6896b;
        }

        /* renamed from: b */
        public int m33097b() {
            return this.f6895a;
        }
    }

    private C2507j(int i, int[] iArr, C2509b... c2509bArr) {
        C2508a[] m33098a;
        this.f6889a = i;
        this.f6890b = iArr;
        this.f6891c = c2509bArr;
        int m33097b = c2509bArr[0].m33097b();
        int i2 = 0;
        for (C2508a c2508a : c2509bArr[0].m33098a()) {
            i2 += c2508a.m33100a() * (c2508a.m33099b() + m33097b);
        }
        this.f6892d = i2;
    }

    /* renamed from: b */
    private static C2507j[] m33109b() {
        return new C2507j[]{new C2507j(1, new int[0], new C2509b(7, new C2508a(1, 19)), new C2509b(10, new C2508a(1, 16)), new C2509b(13, new C2508a(1, 13)), new C2509b(17, new C2508a(1, 9))), new C2507j(2, new int[]{6, 18}, new C2509b(10, new C2508a(1, 34)), new C2509b(16, new C2508a(1, 28)), new C2509b(22, new C2508a(1, 22)), new C2509b(28, new C2508a(1, 16))), new C2507j(3, new int[]{6, 22}, new C2509b(15, new C2508a(1, 55)), new C2509b(26, new C2508a(1, 44)), new C2509b(18, new C2508a(2, 17)), new C2509b(22, new C2508a(2, 13))), new C2507j(4, new int[]{6, 26}, new C2509b(20, new C2508a(1, 80)), new C2509b(18, new C2508a(2, 32)), new C2509b(26, new C2508a(2, 24)), new C2509b(16, new C2508a(4, 9))), new C2507j(5, new int[]{6, 30}, new C2509b(26, new C2508a(1, 108)), new C2509b(24, new C2508a(2, 43)), new C2509b(18, new C2508a(2, 15), new C2508a(2, 16)), new C2509b(22, new C2508a(2, 11), new C2508a(2, 12))), new C2507j(6, new int[]{6, 34}, new C2509b(18, new C2508a(2, 68)), new C2509b(16, new C2508a(4, 27)), new C2509b(24, new C2508a(4, 19)), new C2509b(28, new C2508a(4, 15))), new C2507j(7, new int[]{6, 22, 38}, new C2509b(20, new C2508a(2, 78)), new C2509b(18, new C2508a(4, 31)), new C2509b(18, new C2508a(2, 14), new C2508a(4, 15)), new C2509b(26, new C2508a(4, 13), new C2508a(1, 14))), new C2507j(8, new int[]{6, 24, 42}, new C2509b(24, new C2508a(2, 97)), new C2509b(22, new C2508a(2, 38), new C2508a(2, 39)), new C2509b(22, new C2508a(4, 18), new C2508a(2, 19)), new C2509b(26, new C2508a(4, 14), new C2508a(2, 15))), new C2507j(9, new int[]{6, 26, 46}, new C2509b(30, new C2508a(2, 116)), new C2509b(22, new C2508a(3, 36), new C2508a(2, 37)), new C2509b(20, new C2508a(4, 16), new C2508a(4, 17)), new C2509b(24, new C2508a(4, 12), new C2508a(4, 13))), new C2507j(10, new int[]{6, 28, 50}, new C2509b(18, new C2508a(2, 68), new C2508a(2, 69)), new C2509b(26, new C2508a(4, 43), new C2508a(1, 44)), new C2509b(24, new C2508a(6, 19), new C2508a(2, 20)), new C2509b(28, new C2508a(6, 15), new C2508a(2, 16))), new C2507j(11, new int[]{6, 30, 54}, new C2509b(20, new C2508a(4, 81)), new C2509b(30, new C2508a(1, 50), new C2508a(4, 51)), new C2509b(28, new C2508a(4, 22), new C2508a(4, 23)), new C2509b(24, new C2508a(3, 12), new C2508a(8, 13))), new C2507j(12, new int[]{6, 32, 58}, new C2509b(24, new C2508a(2, 92), new C2508a(2, 93)), new C2509b(22, new C2508a(6, 36), new C2508a(2, 37)), new C2509b(26, new C2508a(4, 20), new C2508a(6, 21)), new C2509b(28, new C2508a(7, 14), new C2508a(4, 15))), new C2507j(13, new int[]{6, 34, 62}, new C2509b(26, new C2508a(4, 107)), new C2509b(22, new C2508a(8, 37), new C2508a(1, 38)), new C2509b(24, new C2508a(8, 20), new C2508a(4, 21)), new C2509b(22, new C2508a(12, 11), new C2508a(4, 12))), new C2507j(14, new int[]{6, 26, 46, 66}, new C2509b(30, new C2508a(3, 115), new C2508a(1, 116)), new C2509b(24, new C2508a(4, 40), new C2508a(5, 41)), new C2509b(20, new C2508a(11, 16), new C2508a(5, 17)), new C2509b(24, new C2508a(11, 12), new C2508a(5, 13))), new C2507j(15, new int[]{6, 26, 48, 70}, new C2509b(22, new C2508a(5, 87), new C2508a(1, 88)), new C2509b(24, new C2508a(5, 41), new C2508a(5, 42)), new C2509b(30, new C2508a(5, 24), new C2508a(7, 25)), new C2509b(24, new C2508a(11, 12), new C2508a(7, 13))), new C2507j(16, new int[]{6, 26, 50, 74}, new C2509b(24, new C2508a(5, 98), new C2508a(1, 99)), new C2509b(28, new C2508a(7, 45), new C2508a(3, 46)), new C2509b(24, new C2508a(15, 19), new C2508a(2, 20)), new C2509b(30, new C2508a(3, 15), new C2508a(13, 16))), new C2507j(17, new int[]{6, 30, 54, 78}, new C2509b(28, new C2508a(1, 107), new C2508a(5, 108)), new C2509b(28, new C2508a(10, 46), new C2508a(1, 47)), new C2509b(28, new C2508a(1, 22), new C2508a(15, 23)), new C2509b(28, new C2508a(2, 14), new C2508a(17, 15))), new C2507j(18, new int[]{6, 30, 56, 82}, new C2509b(30, new C2508a(5, 120), new C2508a(1, 121)), new C2509b(26, new C2508a(9, 43), new C2508a(4, 44)), new C2509b(28, new C2508a(17, 22), new C2508a(1, 23)), new C2509b(28, new C2508a(2, 14), new C2508a(19, 15))), new C2507j(19, new int[]{6, 30, 58, 86}, new C2509b(28, new C2508a(3, 113), new C2508a(4, 114)), new C2509b(26, new C2508a(3, 44), new C2508a(11, 45)), new C2509b(26, new C2508a(17, 21), new C2508a(4, 22)), new C2509b(26, new C2508a(9, 13), new C2508a(16, 14))), new C2507j(20, new int[]{6, 34, 62, 90}, new C2509b(28, new C2508a(3, 107), new C2508a(5, 108)), new C2509b(26, new C2508a(3, 41), new C2508a(13, 42)), new C2509b(30, new C2508a(15, 24), new C2508a(5, 25)), new C2509b(28, new C2508a(15, 15), new C2508a(10, 16))), new C2507j(21, new int[]{6, 28, 50, 72, 94}, new C2509b(28, new C2508a(4, 116), new C2508a(4, 117)), new C2509b(26, new C2508a(17, 42)), new C2509b(28, new C2508a(17, 22), new C2508a(6, 23)), new C2509b(30, new C2508a(19, 16), new C2508a(6, 17))), new C2507j(22, new int[]{6, 26, 50, 74, 98}, new C2509b(28, new C2508a(2, 111), new C2508a(7, 112)), new C2509b(28, new C2508a(17, 46)), new C2509b(30, new C2508a(7, 24), new C2508a(16, 25)), new C2509b(24, new C2508a(34, 13))), new C2507j(23, new int[]{6, 30, 54, 78, 102}, new C2509b(30, new C2508a(4, 121), new C2508a(5, 122)), new C2509b(28, new C2508a(4, 47), new C2508a(14, 48)), new C2509b(30, new C2508a(11, 24), new C2508a(14, 25)), new C2509b(30, new C2508a(16, 15), new C2508a(14, 16))), new C2507j(24, new int[]{6, 28, 54, 80, 106}, new C2509b(30, new C2508a(6, 117), new C2508a(4, 118)), new C2509b(28, new C2508a(6, 45), new C2508a(14, 46)), new C2509b(30, new C2508a(11, 24), new C2508a(16, 25)), new C2509b(30, new C2508a(30, 16), new C2508a(2, 17))), new C2507j(25, new int[]{6, 32, 58, 84, 110}, new C2509b(26, new C2508a(8, 106), new C2508a(4, 107)), new C2509b(28, new C2508a(8, 47), new C2508a(13, 48)), new C2509b(30, new C2508a(7, 24), new C2508a(22, 25)), new C2509b(30, new C2508a(22, 15), new C2508a(13, 16))), new C2507j(26, new int[]{6, 30, 58, 86, 114}, new C2509b(28, new C2508a(10, 114), new C2508a(2, 115)), new C2509b(28, new C2508a(19, 46), new C2508a(4, 47)), new C2509b(28, new C2508a(28, 22), new C2508a(6, 23)), new C2509b(30, new C2508a(33, 16), new C2508a(4, 17))), new C2507j(27, new int[]{6, 34, 62, 90, 118}, new C2509b(30, new C2508a(8, 122), new C2508a(4, 123)), new C2509b(28, new C2508a(22, 45), new C2508a(3, 46)), new C2509b(30, new C2508a(8, 23), new C2508a(26, 24)), new C2509b(30, new C2508a(12, 15), new C2508a(28, 16))), new C2507j(28, new int[]{6, 26, 50, 74, 98, 122}, new C2509b(30, new C2508a(3, 117), new C2508a(10, 118)), new C2509b(28, new C2508a(3, 45), new C2508a(23, 46)), new C2509b(30, new C2508a(4, 24), new C2508a(31, 25)), new C2509b(30, new C2508a(11, 15), new C2508a(31, 16))), new C2507j(29, new int[]{6, 30, 54, 78, 102, 126}, new C2509b(30, new C2508a(7, 116), new C2508a(7, 117)), new C2509b(28, new C2508a(21, 45), new C2508a(7, 46)), new C2509b(30, new C2508a(1, 23), new C2508a(37, 24)), new C2509b(30, new C2508a(19, 15), new C2508a(26, 16))), new C2507j(30, new int[]{6, 26, 52, 78, 104, 130}, new C2509b(30, new C2508a(5, 115), new C2508a(10, 116)), new C2509b(28, new C2508a(19, 47), new C2508a(10, 48)), new C2509b(30, new C2508a(15, 24), new C2508a(25, 25)), new C2509b(30, new C2508a(23, 15), new C2508a(25, 16))), new C2507j(31, new int[]{6, 30, 56, 82, 108, 134}, new C2509b(30, new C2508a(13, 115), new C2508a(3, 116)), new C2509b(28, new C2508a(2, 46), new C2508a(29, 47)), new C2509b(30, new C2508a(42, 24), new C2508a(1, 25)), new C2509b(30, new C2508a(23, 15), new C2508a(28, 16))), new C2507j(32, new int[]{6, 34, 60, 86, 112, 138}, new C2509b(30, new C2508a(17, 115)), new C2509b(28, new C2508a(10, 46), new C2508a(23, 47)), new C2509b(30, new C2508a(10, 24), new C2508a(35, 25)), new C2509b(30, new C2508a(19, 15), new C2508a(35, 16))), new C2507j(33, new int[]{6, 30, 58, 86, 114, 142}, new C2509b(30, new C2508a(17, 115), new C2508a(1, 116)), new C2509b(28, new C2508a(14, 46), new C2508a(21, 47)), new C2509b(30, new C2508a(29, 24), new C2508a(19, 25)), new C2509b(30, new C2508a(11, 15), new C2508a(46, 16))), new C2507j(34, new int[]{6, 34, 62, 90, 118, 146}, new C2509b(30, new C2508a(13, 115), new C2508a(6, 116)), new C2509b(28, new C2508a(14, 46), new C2508a(23, 47)), new C2509b(30, new C2508a(44, 24), new C2508a(7, 25)), new C2509b(30, new C2508a(59, 16), new C2508a(1, 17))), new C2507j(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new C2509b(30, new C2508a(12, 121), new C2508a(7, 122)), new C2509b(28, new C2508a(12, 47), new C2508a(26, 48)), new C2509b(30, new C2508a(39, 24), new C2508a(14, 25)), new C2509b(30, new C2508a(22, 15), new C2508a(41, 16))), new C2507j(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new C2509b(30, new C2508a(6, 121), new C2508a(14, 122)), new C2509b(28, new C2508a(6, 47), new C2508a(34, 48)), new C2509b(30, new C2508a(46, 24), new C2508a(10, 25)), new C2509b(30, new C2508a(2, 15), new C2508a(64, 16))), new C2507j(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new C2509b(30, new C2508a(17, 122), new C2508a(4, 123)), new C2509b(28, new C2508a(29, 46), new C2508a(14, 47)), new C2509b(30, new C2508a(49, 24), new C2508a(10, 25)), new C2509b(30, new C2508a(24, 15), new C2508a(46, 16))), new C2507j(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new C2509b(30, new C2508a(4, 122), new C2508a(18, 123)), new C2509b(28, new C2508a(13, 46), new C2508a(32, 47)), new C2509b(30, new C2508a(48, 24), new C2508a(14, 25)), new C2509b(30, new C2508a(42, 15), new C2508a(32, 16))), new C2507j(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C2509b(30, new C2508a(20, 117), new C2508a(4, 118)), new C2509b(28, new C2508a(40, 47), new C2508a(7, 48)), new C2509b(30, new C2508a(43, 24), new C2508a(22, 25)), new C2509b(30, new C2508a(10, 15), new C2508a(67, 16))), new C2507j(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new C2509b(30, new C2508a(19, 118), new C2508a(6, 119)), new C2509b(28, new C2508a(18, 47), new C2508a(31, 48)), new C2509b(30, new C2508a(34, 24), new C2508a(34, 25)), new C2509b(30, new C2508a(20, 15), new C2508a(61, 16)))};
    }

    /* renamed from: c */
    public static C2507j m33108c(int i) {
        int i2 = ViewDefaults.NUMBER_OF_LINES;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = f6887e;
            if (i3 < iArr.length) {
                int i5 = iArr[i3];
                if (i5 == i) {
                    return m33102i(i3 + 7);
                }
                int m33114e = C2504g.m33114e(i, i5);
                if (m33114e < i2) {
                    i4 = i3 + 7;
                    i2 = m33114e;
                }
                i3++;
            } else if (i2 <= 3) {
                return m33102i(i4);
            } else {
                return null;
            }
        }
    }

    /* renamed from: g */
    public static C2507j m33104g(int i) {
        if (i % 4 == 1) {
            try {
                return m33102i((i - 17) / 4);
            } catch (IllegalArgumentException unused) {
                throw C7060f.m21471a();
            }
        }
        throw C7060f.m21471a();
    }

    /* renamed from: i */
    public static C2507j m33102i(int i) {
        if (i > 0 && i <= 40) {
            return f6888f[i - 1];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C10120b m33110a() {
        int m33106e = m33106e();
        C10120b c10120b = new C10120b(m33106e);
        c10120b.m12243q(0, 0, 9, 9);
        int i = m33106e - 8;
        c10120b.m12243q(i, 0, 8, 9);
        c10120b.m12243q(0, i, 9, 8);
        int length = this.f6890b.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f6890b[i2] - 2;
            for (int i4 = 0; i4 < length; i4++) {
                if ((i2 != 0 || (i4 != 0 && i4 != length - 1)) && (i2 != length - 1 || i4 != 0)) {
                    c10120b.m12243q(this.f6890b[i4] - 2, i3, 5, 5);
                }
            }
        }
        int i5 = m33106e - 17;
        c10120b.m12243q(6, 9, 1, i5);
        c10120b.m12243q(9, 6, i5, 1);
        if (this.f6889a > 6) {
            int i6 = m33106e - 11;
            c10120b.m12243q(i6, 0, 3, 6);
            c10120b.m12243q(0, i6, 6, 3);
        }
        return c10120b;
    }

    /* renamed from: d */
    public int[] m33107d() {
        return this.f6890b;
    }

    /* renamed from: e */
    public int m33106e() {
        return (this.f6889a * 4) + 17;
    }

    /* renamed from: f */
    public C2509b m33105f(EnumC2503f enumC2503f) {
        return this.f6891c[enumC2503f.ordinal()];
    }

    /* renamed from: h */
    public int m33103h() {
        return this.f6892d;
    }

    /* renamed from: j */
    public int m33101j() {
        return this.f6889a;
    }

    public String toString() {
        return String.valueOf(this.f6889a);
    }
}