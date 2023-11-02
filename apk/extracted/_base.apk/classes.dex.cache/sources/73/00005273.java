package p437y4;

import android.util.SparseIntArray;

/* renamed from: y4.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13890m {

    /* renamed from: a */
    public static final int f35729a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static SparseIntArray m1301a(int i, int i2, int i3) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i <= i2) {
            sparseIntArray.put(i, i3);
            i *= 2;
        }
        return sparseIntArray;
    }

    /* renamed from: b */
    public static C13905z m1300b() {
        int i = f35729a;
        return new C13905z(4194304, i * 4194304, m1301a(131072, 4194304, i), 131072, 4194304, i);
    }
}