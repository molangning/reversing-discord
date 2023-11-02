package p437y4;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: y4.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13891n {
    /* renamed from: a */
    public static C13905z m1299a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(1024, 5);
        sparseIntArray.put(RecyclerView.ItemAnimator.FLAG_MOVED, 5);
        sparseIntArray.put(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, 5);
        sparseIntArray.put(8192, 5);
        sparseIntArray.put(16384, 5);
        sparseIntArray.put(32768, 5);
        sparseIntArray.put(65536, 5);
        sparseIntArray.put(131072, 5);
        sparseIntArray.put(262144, 2);
        sparseIntArray.put(524288, 2);
        sparseIntArray.put(1048576, 2);
        return new C13905z(m1297c(), m1298b(), sparseIntArray);
    }

    /* renamed from: b */
    private static int m1298b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return min / 2;
        }
        return (min / 4) * 3;
    }

    /* renamed from: c */
    private static int m1297c() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 3145728;
        }
        return min < 33554432 ? 6291456 : 12582912;
    }
}
