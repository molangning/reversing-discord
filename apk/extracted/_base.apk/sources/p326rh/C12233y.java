package p326rh;

/* renamed from: rh.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C12233y {
    /* renamed from: a */
    private static int m5690a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: b */
    private static int m5689b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: c */
    private static int m5688c(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: d */
    private static int m5687d(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return m5688c(b, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return m5689b(b, bArr[i]);
        }
        return m5690a(b);
    }

    /* renamed from: e */
    public static boolean m5686e(byte[] bArr) {
        return m5685f(bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public static boolean m5685f(byte[] bArr, int i, int i2) {
        return m5683h(bArr, i, i2) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        if (r7[r8] > (-65)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        if (r7[r8] > (-65)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        if (r7[r6] > (-65)) goto L51;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m5684g(int r6, byte[] r7, int r8, int r9) {
        /*
            if (r6 == 0) goto L86
            if (r8 < r9) goto L5
            return r6
        L5:
            byte r0 = (byte) r6
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L1c
            r6 = -62
            if (r0 < r6) goto L1b
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r3) goto L18
            goto L1b
        L18:
            r8 = r6
            goto L86
        L1b:
            return r2
        L1c:
            r4 = -16
            if (r0 >= r4) goto L49
            int r6 = r6 >> 8
            int r6 = ~r6
            byte r6 = (byte) r6
            if (r6 != 0) goto L34
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r6 < r9) goto L31
            int r6 = m5689b(r0, r8)
            return r6
        L31:
            r5 = r8
            r8 = r6
            r6 = r5
        L34:
            if (r6 > r3) goto L48
            r4 = -96
            if (r0 != r1) goto L3c
            if (r6 < r4) goto L48
        L3c:
            r1 = -19
            if (r0 != r1) goto L42
            if (r6 >= r4) goto L48
        L42:
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r3) goto L18
        L48:
            return r2
        L49:
            int r1 = r6 >> 8
            int r1 = ~r1
            byte r1 = (byte) r1
            if (r1 != 0) goto L5c
            int r6 = r8 + 1
            r1 = r7[r8]
            if (r6 < r9) goto L5a
            int r6 = m5689b(r0, r1)
            return r6
        L5a:
            r8 = 0
            goto L62
        L5c:
            int r6 = r6 >> 16
            byte r6 = (byte) r6
            r5 = r8
            r8 = r6
            r6 = r5
        L62:
            if (r8 != 0) goto L72
            int r8 = r6 + 1
            r6 = r7[r6]
            if (r8 < r9) goto L6f
            int r6 = m5688c(r0, r1, r6)
            return r6
        L6f:
            r5 = r8
            r8 = r6
            r6 = r5
        L72:
            if (r1 > r3) goto L85
            int r0 = r0 << 28
            int r1 = r1 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L85
            if (r8 > r3) goto L85
            int r8 = r6 + 1
            r6 = r7[r6]
            if (r6 <= r3) goto L86
        L85:
            return r2
        L86:
            int r6 = m5683h(r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p326rh.C12233y.m5684g(int, byte[], int, int):int");
    }

    /* renamed from: h */
    public static int m5683h(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        return m5682i(bArr, i, i2);
    }

    /* renamed from: i */
    private static int m5682i(byte[] bArr, int i, int i2) {
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b >= -62) {
                        i = i3 + 1;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return -1;
                } else if (b < -16) {
                    if (i3 >= i2 - 1) {
                        return m5687d(bArr, i3, i2);
                    }
                    int i4 = i3 + 1;
                    byte b2 = bArr[i3];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        i = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                } else if (i3 >= i2 - 2) {
                    return m5687d(bArr, i3, i2);
                } else {
                    int i5 = i3 + 1;
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                        int i6 = i5 + 1;
                        if (bArr[i5] <= -65) {
                            i3 = i6 + 1;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                    return -1;
                }
            }
            i = i3;
        }
        return 0;
    }
}
