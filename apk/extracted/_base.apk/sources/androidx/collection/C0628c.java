package androidx.collection;

/* renamed from: androidx.collection.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C0628c {

    /* renamed from: a */
    static final int[] f2133a = new int[0];

    /* renamed from: b */
    static final long[] f2134b = new long[0];

    /* renamed from: c */
    static final Object[] f2135c = new Object[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m39499a(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m39498b(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = (jArr[i4] > j ? 1 : (jArr[i4] == j ? 0 : -1));
            if (i5 < 0) {
                i3 = i4 + 1;
            } else if (i5 <= 0) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* renamed from: c */
    public static boolean m39497c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: d */
    public static int m39496d(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    /* renamed from: e */
    public static int m39495e(int i) {
        return m39496d(i * 4) / 4;
    }

    /* renamed from: f */
    public static int m39494f(int i) {
        return m39496d(i * 8) / 8;
    }
}
