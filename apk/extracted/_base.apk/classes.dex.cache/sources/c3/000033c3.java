package p119g9;

import p029b9.C2190n;

/* renamed from: g9.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6579b {
    /* renamed from: a */
    public static boolean m22385a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static <T> boolean m22384b(T[] tArr, T t) {
        int i;
        if (tArr != null) {
            i = tArr.length;
        } else {
            i = 0;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            } else if (C2190n.m34004b(tArr[i2], t)) {
                if (i2 >= 0) {
                    return true;
                }
            } else {
                i2++;
            }
        }
        return false;
    }
}