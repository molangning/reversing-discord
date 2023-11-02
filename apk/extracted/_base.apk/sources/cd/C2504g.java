package cd;

import com.facebook.react.uimanager.ViewDefaults;

/* renamed from: cd.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C2504g {

    /* renamed from: c */
    private static final int[][] f6870c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a */
    private final EnumC2503f f6871a;

    /* renamed from: b */
    private final byte f6872b;

    private C2504g(int i) {
        this.f6871a = EnumC2503f.m33119a((i >> 3) & 3);
        this.f6872b = (byte) (i & 7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2504g m33118a(int i, int i2) {
        C2504g m33117b = m33117b(i, i2);
        if (m33117b != null) {
            return m33117b;
        }
        return m33117b(i ^ 21522, i2 ^ 21522);
    }

    /* renamed from: b */
    private static C2504g m33117b(int i, int i2) {
        int m33114e;
        int[][] iArr = f6870c;
        int i3 = ViewDefaults.NUMBER_OF_LINES;
        int i4 = 0;
        for (int[] iArr2 : iArr) {
            int i5 = iArr2[0];
            if (i5 != i && i5 != i2) {
                int m33114e2 = m33114e(i, i5);
                if (m33114e2 < i3) {
                    i4 = iArr2[1];
                    i3 = m33114e2;
                }
                if (i != i2 && (m33114e = m33114e(i2, i5)) < i3) {
                    i4 = iArr2[1];
                    i3 = m33114e;
                }
            } else {
                return new C2504g(iArr2[1]);
            }
        }
        if (i3 <= 3) {
            return new C2504g(i4);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m33114e(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public byte m33116c() {
        return this.f6872b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public EnumC2503f m33115d() {
        return this.f6871a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2504g)) {
            return false;
        }
        C2504g c2504g = (C2504g) obj;
        if (this.f6871a != c2504g.f6871a || this.f6872b != c2504g.f6872b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f6871a.ordinal() << 3) | this.f6872b;
    }
}
