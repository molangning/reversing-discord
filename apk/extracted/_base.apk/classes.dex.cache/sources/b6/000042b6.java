package p227m5;

import java.util.Arrays;

/* renamed from: m5.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10260a {

    /* renamed from: a */
    private static final char[] f26714a;

    /* renamed from: b */
    private static final byte[] f26715b;

    /* renamed from: c */
    private static final int[] f26716c;

    /* renamed from: d */
    private static final int[] f26717d;

    /* renamed from: e */
    private static final int[] f26718e;

    /* renamed from: f */
    private static final int[] f26719f;

    /* renamed from: g */
    private static final int[] f26720g;

    /* renamed from: h */
    private static final int[] f26721h;

    /* renamed from: i */
    private static final int[] f26722i;

    /* renamed from: j */
    private static final int[] f26723j;

    static {
        int i;
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f26714a = charArray;
        int length = charArray.length;
        f26715b = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            f26715b[i2] = (byte) f26714a[i2];
        }
        int[] iArr = new int[256];
        for (int i3 = 0; i3 < 32; i3++) {
            iArr[i3] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f26716c = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i4 = 128; i4 < 256; i4++) {
            if ((i4 & 224) == 192) {
                i = 2;
            } else if ((i4 & 240) == 224) {
                i = 3;
            } else if ((i4 & 248) == 240) {
                i = 4;
            } else {
                i = -1;
            }
            iArr2[i4] = i;
        }
        f26717d = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i5 = 33; i5 < 256; i5++) {
            if (Character.isJavaIdentifierPart((char) i5)) {
                iArr3[i5] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f26718e = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        f26719f = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = f26717d;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        f26720g = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        f26721h = iArr7;
        int[] iArr8 = new int[128];
        for (int i6 = 0; i6 < 32; i6++) {
            iArr8[i6] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f26722i = iArr8;
        int[] iArr9 = new int[256];
        f26723j = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i7 = 0; i7 < 10; i7++) {
            f26723j[i7 + 48] = i7;
        }
        for (int i8 = 0; i8 < 6; i8++) {
            int[] iArr10 = f26723j;
            int i9 = i8 + 10;
            iArr10[i8 + 97] = i9;
            iArr10[i8 + 65] = i9;
        }
    }

    /* renamed from: a */
    public static byte[] m11996a() {
        return (byte[]) f26715b.clone();
    }

    /* renamed from: b */
    public static char[] m11995b() {
        return (char[]) f26714a.clone();
    }
}