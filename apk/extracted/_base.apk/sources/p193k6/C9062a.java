package p193k6;

import p151i6.C7402m;
import p195k8.C9197r;
import p195k8.C9207x;

/* renamed from: k6.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9062a {

    /* renamed from: a */
    private static final int[] f23776a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    private static final int[] f23777b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: k6.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9064b {

        /* renamed from: a */
        public final int f23778a;

        /* renamed from: b */
        public final int f23779b;

        /* renamed from: c */
        public final String f23780c;

        private C9064b(int i, int i2, String str) {
            this.f23778a = i;
            this.f23779b = i2;
            this.f23780c = str;
        }
    }

    /* renamed from: a */
    public static byte[] m16788a(int i, int i2) {
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            int[] iArr = f23776a;
            if (i5 >= iArr.length) {
                break;
            }
            if (i == iArr[i5]) {
                i4 = i5;
            }
            i5++;
        }
        int i6 = -1;
        while (true) {
            int[] iArr2 = f23777b;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 == iArr2[i3]) {
                i6 = i3;
            }
            i3++;
        }
        if (i != -1 && i6 != -1) {
            return m16787b(2, i4, i6);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i + ", " + i2);
    }

    /* renamed from: b */
    public static byte[] m16787b(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    /* renamed from: c */
    private static int m16786c(C9207x c9207x) {
        int m16126h = c9207x.m16126h(5);
        if (m16126h == 31) {
            return c9207x.m16126h(6) + 32;
        }
        return m16126h;
    }

    /* renamed from: d */
    public static int m16785d(int i) {
        if (i != 2) {
            if (i != 5) {
                if (i != 29) {
                    if (i != 42) {
                        if (i != 22) {
                            return i != 23 ? 0 : 15;
                        }
                        return 1073741824;
                    }
                    return 16;
                }
                return 12;
            }
            return 11;
        }
        return 10;
    }

    /* renamed from: e */
    private static int m16784e(C9207x c9207x) {
        int m16126h = c9207x.m16126h(4);
        if (m16126h == 15) {
            return c9207x.m16126h(24);
        }
        if (m16126h < 13) {
            return f23776a[m16126h];
        }
        throw new C7402m();
    }

    /* renamed from: f */
    public static C9064b m16783f(C9207x c9207x, boolean z) {
        int m16786c = m16786c(c9207x);
        int m16784e = m16784e(c9207x);
        int m16126h = c9207x.m16126h(4);
        String str = "mp4a.40." + m16786c;
        if (m16786c == 5 || m16786c == 29) {
            m16784e = m16784e(c9207x);
            m16786c = m16786c(c9207x);
            if (m16786c == 22) {
                m16126h = c9207x.m16126h(4);
            }
        }
        if (z) {
            if (m16786c != 1 && m16786c != 2 && m16786c != 3 && m16786c != 4 && m16786c != 6 && m16786c != 7 && m16786c != 17) {
                switch (m16786c) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new C7402m("Unsupported audio object type: " + m16786c);
                }
            }
            m16781h(c9207x, m16786c, m16126h);
            switch (m16786c) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int m16126h2 = c9207x.m16126h(2);
                    if (m16126h2 == 2 || m16126h2 == 3) {
                        throw new C7402m("Unsupported epConfig: " + m16126h2);
                    }
            }
        }
        int i = f23777b[m16126h];
        if (i != -1) {
            return new C9064b(m16784e, i, str);
        }
        throw new C7402m();
    }

    /* renamed from: g */
    public static C9064b m16782g(byte[] bArr) {
        return m16783f(new C9207x(bArr), false);
    }

    /* renamed from: h */
    private static void m16781h(C9207x c9207x, int i, int i2) {
        if (c9207x.m16127g()) {
            C9197r.m16178h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (c9207x.m16127g()) {
            c9207x.m16116r(14);
        }
        boolean m16127g = c9207x.m16127g();
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                c9207x.m16116r(3);
            }
            if (m16127g) {
                if (i == 22) {
                    c9207x.m16116r(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    c9207x.m16116r(3);
                }
                c9207x.m16116r(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
