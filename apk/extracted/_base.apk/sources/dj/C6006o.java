package dj;

import p355ti.C12796i;

/* renamed from: dj.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final /* synthetic */ class C6006o {
    /* renamed from: a */
    public static /* synthetic */ String m23898a(long j, int i) {
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i2 == 0) {
            return "0";
        }
        if (i2 > 0) {
            return Long.toString(j, i);
        }
        i = (i < 2 || i > 36) ? 10 : 10;
        int i3 = 64;
        char[] cArr = new char[64];
        int i4 = i - 1;
        if ((i & i4) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i3--;
                cArr[i3] = Character.forDigit(((int) j) & i4, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            long m3901a = (i & 1) == 0 ? (j >>> 1) / (i >>> 1) : C12796i.m3901a(j, i);
            long j2 = i;
            cArr[63] = Character.forDigit((int) (j - (m3901a * j2)), i);
            i3 = 63;
            while (m3901a > 0) {
                i3--;
                cArr[i3] = Character.forDigit((int) (m3901a % j2), i);
                m3901a /= j2;
            }
        }
        return new String(cArr, i3, 64 - i3);
    }
}
