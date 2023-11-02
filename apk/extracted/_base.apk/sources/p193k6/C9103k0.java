package p193k6;

/* renamed from: k6.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9103k0 {

    /* renamed from: a */
    private static final String[] f23916a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b */
    private static final int[] f23917b = {44100, 48000, 32000};

    /* renamed from: c */
    private static final int[] f23918c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d */
    private static final int[] f23919d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e */
    private static final int[] f23920e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f */
    private static final int[] f23921f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g */
    private static final int[] f23922g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: k6.k0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9104a {

        /* renamed from: a */
        public int f23923a;

        /* renamed from: b */
        public String f23924b;

        /* renamed from: c */
        public int f23925c;

        /* renamed from: d */
        public int f23926d;

        /* renamed from: e */
        public int f23927e;

        /* renamed from: f */
        public int f23928f;

        /* renamed from: g */
        public int f23929g;

        /* renamed from: a */
        public boolean m16646a(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            if (!C9103k0.m16648l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f23923a = i2;
            this.f23924b = C9103k0.f23916a[3 - i3];
            int i8 = C9103k0.f23917b[i5];
            this.f23926d = i8;
            int i9 = 2;
            if (i2 == 2) {
                this.f23926d = i8 / 2;
            } else if (i2 == 0) {
                this.f23926d = i8 / 4;
            }
            int i10 = (i >>> 9) & 1;
            this.f23929g = C9103k0.m16649k(i2, i3);
            if (i3 == 3) {
                if (i2 == 3) {
                    i7 = C9103k0.f23918c[i4 - 1];
                } else {
                    i7 = C9103k0.f23919d[i4 - 1];
                }
                this.f23928f = i7;
                this.f23925c = (((i7 * 12) / this.f23926d) + i10) * 4;
            } else {
                int i11 = 144;
                if (i2 == 3) {
                    if (i3 == 2) {
                        i6 = C9103k0.f23920e[i4 - 1];
                    } else {
                        i6 = C9103k0.f23921f[i4 - 1];
                    }
                    this.f23928f = i6;
                    this.f23925c = ((i6 * 144) / this.f23926d) + i10;
                } else {
                    int i12 = C9103k0.f23922g[i4 - 1];
                    this.f23928f = i12;
                    if (i3 == 1) {
                        i11 = 72;
                    }
                    this.f23925c = ((i11 * i12) / this.f23926d) + i10;
                }
            }
            if (((i >> 6) & 3) == 3) {
                i9 = 1;
            }
            this.f23927e = i9;
            return true;
        }
    }

    /* renamed from: j */
    public static int m16650j(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!m16648l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = f23917b[i5];
        if (i2 == 2) {
            i8 /= 2;
        } else if (i2 == 0) {
            i8 /= 4;
        }
        int i9 = (i >>> 9) & 1;
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = f23918c[i4 - 1];
            } else {
                i7 = f23919d[i4 - 1];
            }
            return (((i7 * 12) / i8) + i9) * 4;
        }
        if (i2 == 3) {
            if (i3 == 2) {
                i6 = f23920e[i4 - 1];
            } else {
                i6 = f23921f[i4 - 1];
            }
        } else {
            i6 = f23922g[i4 - 1];
        }
        int i10 = 144;
        if (i2 == 3) {
            return ((i6 * 144) / i8) + i9;
        }
        if (i3 == 1) {
            i10 = 72;
        }
        return ((i10 * i6) / i8) + i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static int m16649k(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        } else if (i2 != 2) {
            if (i2 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        } else {
            return 1152;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m16648l(int i) {
        return (i & (-2097152)) == -2097152;
    }

    /* renamed from: m */
    public static int m16647m(int i) {
        int i2;
        int i3;
        if (!m16648l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return m16649k(i2, i3);
    }
}
