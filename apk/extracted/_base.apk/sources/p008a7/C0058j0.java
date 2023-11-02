package p008a7;

import p195k8.C9208y;

/* renamed from: a7.j0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0058j0 {
    /* renamed from: a */
    public static int m41279a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static long m41278b(C9208y c9208y, int i, int i2) {
        boolean z;
        c9208y.m16099P(i);
        if (c9208y.m16097a() < 5) {
            return -9223372036854775807L;
        }
        int m16084n = c9208y.m16084n();
        if ((8388608 & m16084n) != 0 || ((2096896 & m16084n) >> 8) != i2) {
            return -9223372036854775807L;
        }
        boolean z2 = true;
        if ((m16084n & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && c9208y.m16111D() >= 7 && c9208y.m16097a() >= 7) {
            if ((c9208y.m16111D() & 16) != 16) {
                z2 = false;
            }
            if (z2) {
                byte[] bArr = new byte[6];
                c9208y.m16088j(bArr, 0, 6);
                return m41277c(bArr);
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: c */
    private static long m41277c(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
