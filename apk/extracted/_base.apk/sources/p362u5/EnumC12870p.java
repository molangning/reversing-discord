package p362u5;

import android.util.SparseArray;

/* renamed from: u5.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC12870p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: q */
    private static final SparseArray<EnumC12870p> f33493q;

    /* renamed from: j */
    private final int f33495j;

    static {
        EnumC12870p enumC12870p = DEFAULT;
        EnumC12870p enumC12870p2 = UNMETERED_ONLY;
        EnumC12870p enumC12870p3 = UNMETERED_OR_DAILY;
        EnumC12870p enumC12870p4 = FAST_IF_RADIO_AWAKE;
        EnumC12870p enumC12870p5 = NEVER;
        EnumC12870p enumC12870p6 = UNRECOGNIZED;
        SparseArray<EnumC12870p> sparseArray = new SparseArray<>();
        f33493q = sparseArray;
        sparseArray.put(0, enumC12870p);
        sparseArray.put(1, enumC12870p2);
        sparseArray.put(2, enumC12870p3);
        sparseArray.put(3, enumC12870p4);
        sparseArray.put(4, enumC12870p5);
        sparseArray.put(-1, enumC12870p6);
    }

    EnumC12870p(int i) {
        this.f33495j = i;
    }
}
