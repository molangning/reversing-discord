package p437y4;

import android.util.SparseIntArray;

/* renamed from: y4.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13888k {

    /* renamed from: a */
    private static final SparseIntArray f35728a = new SparseIntArray(0);

    /* renamed from: a */
    public static C13905z m1304a() {
        return new C13905z(0, m1303b(), f35728a);
    }

    /* renamed from: b */
    private static int m1303b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }
}
