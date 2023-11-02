package androidx.core.content.res;

import java.lang.reflect.Array;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.content.res.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0979g {
    /* renamed from: a */
    public static int[] m38249a(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[m38247c(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object[], java.lang.Object] */
    /* renamed from: b */
    public static <T> T[] m38248b(T[] tArr, int i, T t) {
        if (i + 1 > tArr.length) {
            ?? r0 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m38247c(i));
            System.arraycopy(tArr, 0, r0, 0, i);
            tArr = r0;
        }
        tArr[i] = t;
        return tArr;
    }

    /* renamed from: c */
    public static int m38247c(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }
}