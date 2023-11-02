package p195k8;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: k8.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9157d {

    /* renamed from: a */
    private static final byte[] f24110a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final String[] f24111b = {"", "A", "B", "C"};

    /* renamed from: a */
    public static String m16431a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: b */
    public static List<byte[]> m16430b(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    /* renamed from: c */
    public static String m16429c(C9209z c9209z) {
        char c;
        c9209z.m16060l(24);
        int m16067e = c9209z.m16067e(2);
        boolean m16068d = c9209z.m16068d();
        int m16067e2 = c9209z.m16067e(5);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            if (c9209z.m16068d()) {
                i |= 1 << i2;
            }
        }
        int i3 = 6;
        int[] iArr = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr[i4] = c9209z.m16067e(8);
        }
        int m16067e3 = c9209z.m16067e(8);
        Object[] objArr = new Object[5];
        objArr[0] = f24111b[m16067e];
        objArr[1] = Integer.valueOf(m16067e2);
        objArr[2] = Integer.valueOf(i);
        if (m16068d) {
            c = 'H';
        } else {
            c = 'L';
        }
        objArr[3] = Character.valueOf(c);
        objArr[4] = Integer.valueOf(m16067e3);
        StringBuilder sb2 = new StringBuilder(C9191p0.m16307D("hvc1.%s%d.%X.%c%d", objArr));
        while (i3 > 0 && iArr[i3 - 1] == 0) {
            i3--;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public static byte[] m16428d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f24110a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    /* renamed from: e */
    private static int m16427e(byte[] bArr, int i) {
        int length = bArr.length - f24110a.length;
        while (i <= length) {
            if (m16426f(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: f */
    private static boolean m16426f(byte[] bArr, int i) {
        if (bArr.length - i <= f24110a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f24110a;
            if (i2 < bArr2.length) {
                if (bArr[i + i2] != bArr2[i2]) {
                    return false;
                }
                i2++;
            } else {
                return true;
            }
        }
    }

    /* renamed from: g */
    public static Pair<Integer, Integer> m16425g(byte[] bArr) {
        C9208y c9208y = new C9208y(bArr);
        c9208y.m16099P(9);
        int m16111D = c9208y.m16111D();
        c9208y.m16099P(20);
        return Pair.create(Integer.valueOf(c9208y.m16107H()), Integer.valueOf(m16111D));
    }

    /* renamed from: h */
    public static boolean m16424h(List<byte[]> list) {
        if (list.size() != 1 || list.get(0).length != 1 || list.get(0)[0] != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static byte[][] m16423i(byte[] bArr) {
        int length;
        if (!m16426f(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            arrayList.add(Integer.valueOf(i));
            i = m16427e(bArr, i + f24110a.length);
        } while (i != -1);
        byte[][] bArr2 = new byte[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            if (i2 < arrayList.size() - 1) {
                length = ((Integer) arrayList.get(i2 + 1)).intValue();
            } else {
                length = bArr.length;
            }
            int i3 = length - intValue;
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, intValue, bArr3, 0, i3);
            bArr2[i2] = bArr3;
        }
        return bArr2;
    }
}