package p195k8;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: k8.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9204w {

    /* renamed from: a */
    public static final byte[] f24210a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f24211b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f24212c = new Object();

    /* renamed from: d */
    private static int[] f24213d = new int[10];

    /* renamed from: k8.w$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9205a {

        /* renamed from: a */
        public final int f24214a;

        /* renamed from: b */
        public final int f24215b;

        /* renamed from: c */
        public final boolean f24216c;

        public C9205a(int i, int i2, boolean z) {
            this.f24214a = i;
            this.f24215b = i2;
            this.f24216c = z;
        }
    }

    /* renamed from: k8.w$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9206b {

        /* renamed from: a */
        public final int f24217a;

        /* renamed from: b */
        public final int f24218b;

        /* renamed from: c */
        public final int f24219c;

        /* renamed from: d */
        public final int f24220d;

        /* renamed from: e */
        public final int f24221e;

        /* renamed from: f */
        public final int f24222f;

        /* renamed from: g */
        public final float f24223g;

        /* renamed from: h */
        public final boolean f24224h;

        /* renamed from: i */
        public final boolean f24225i;

        /* renamed from: j */
        public final int f24226j;

        /* renamed from: k */
        public final int f24227k;

        /* renamed from: l */
        public final int f24228l;

        /* renamed from: m */
        public final boolean f24229m;

        public C9206b(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, boolean z2, int i7, int i8, int i9, boolean z3) {
            this.f24217a = i;
            this.f24218b = i2;
            this.f24219c = i3;
            this.f24220d = i4;
            this.f24221e = i5;
            this.f24222f = i6;
            this.f24223g = f;
            this.f24224h = z;
            this.f24225i = z2;
            this.f24226j = i7;
            this.f24227k = i8;
            this.f24228l = i9;
            this.f24229m = z3;
        }
    }

    /* renamed from: a */
    public static void m16144a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static void m16143b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                int i4 = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i4 == 0) {
                    i2++;
                }
                if (i4 != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    /* renamed from: c */
    public static int m16142c(byte[] bArr, int i, int i2, boolean[] zArr) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3 = i2 - i;
        boolean z4 = false;
        if (i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m16144a(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m16144a(zArr);
            return i - 2;
        } else if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m16144a(zArr);
            return i - 1;
        } else {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b = bArr[i5];
                if ((b & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                        m16144a(zArr);
                        return i6;
                    }
                    i5 -= 2;
                }
                i5 += 3;
            }
            if (i3 <= 2 ? i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !zArr[2] || bArr[i2 - 2] != 0 || bArr[i4] != 1 : bArr[i2 - 3] != 0 || bArr[i2 - 2] != 0 || bArr[i4] != 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            zArr[0] = z2;
            if (i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : !(bArr[i2 - 2] != 0 || bArr[i4] != 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
            zArr[1] = z3;
            if (bArr[i4] == 0) {
                z4 = true;
            }
            zArr[2] = z4;
            return i2;
        }
    }

    /* renamed from: d */
    private static int m16141d(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: e */
    public static int m16140e(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* renamed from: f */
    public static int m16139f(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    /* renamed from: g */
    public static boolean m16138g(String str, byte b) {
        if ("video/avc".equals(str) && (b & 31) == 6) {
            return true;
        }
        if ("video/hevc".equals(str) && ((b & 126) >> 1) == 39) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static C9205a m16137h(byte[] bArr, int i, int i2) {
        C9209z c9209z = new C9209z(bArr, i, i2);
        c9209z.m16060l(8);
        int m16064h = c9209z.m16064h();
        int m16064h2 = c9209z.m16064h();
        c9209z.m16061k();
        return new C9205a(m16064h, m16064h2, c9209z.m16068d());
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014e  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p195k8.C9204w.C9206b m16136i(byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p195k8.C9204w.m16136i(byte[], int, int):k8.w$b");
    }

    /* renamed from: j */
    private static void m16135j(C9209z c9209z, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((c9209z.m16065g() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    /* renamed from: k */
    public static int m16134k(byte[] bArr, int i) {
        int i2;
        synchronized (f24212c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = m16141d(bArr, i3, i);
                    if (i3 < i) {
                        int[] iArr = f24213d;
                        if (iArr.length <= i4) {
                            f24213d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f24213d[i4] = i3;
                        i3 += 3;
                        i4++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f24213d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
