package gb;

import java.util.Arrays;
import p102fb.C6377g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: gb.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6667l {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m22188a(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m22187b(int i, int i2) {
        return i & (~i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m22186c(int i, int i2) {
        return i & i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m22185d(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m22184e(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m22183f(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int m22156c = C6681p.m22156c(obj);
        int i4 = m22156c & i;
        int m22181h = m22181h(obj3, i4);
        if (m22181h == 0) {
            return -1;
        }
        int m22187b = m22187b(m22156c, i);
        int i5 = -1;
        while (true) {
            i2 = m22181h - 1;
            i3 = iArr[i2];
            if (m22187b(i3, i) != m22187b || !C6377g.m22845a(obj, objArr[i2]) || (objArr2 != null && !C6377g.m22845a(obj2, objArr2[i2]))) {
                int m22186c = m22186c(i3, i);
                if (m22186c == 0) {
                    return -1;
                }
                i5 = i2;
                m22181h = m22186c;
            }
        }
        int m22186c2 = m22186c(i3, i);
        if (i5 == -1) {
            m22180i(obj3, i4, m22186c2);
        } else {
            iArr[i5] = m22185d(iArr[i5], m22186c2, i);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m22182g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m22181h(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & 65535;
        }
        return ((int[]) obj)[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m22180i(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m22179j(int i) {
        return Math.max(4, C6681p.m22158a(i + 1, 1.0d));
    }
}
