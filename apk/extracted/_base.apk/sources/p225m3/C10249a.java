package p225m3;

import android.util.SparseIntArray;

/* renamed from: m3.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10249a {

    /* renamed from: a */
    private static final SparseIntArray f26684a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(7);
        f26684a = sparseIntArray;
        sparseIntArray.append(1, -7829368);
        sparseIntArray.append(2, -65536);
        sparseIntArray.append(3, -256);
        sparseIntArray.append(4, -256);
        sparseIntArray.append(5, -16711936);
        sparseIntArray.append(6, -16711936);
        sparseIntArray.append(7, -16711936);
    }

    /* renamed from: a */
    public static int m12030a(int i) {
        return f26684a.get(i, -1);
    }
}
