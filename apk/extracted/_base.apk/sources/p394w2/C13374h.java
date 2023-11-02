package p394w2;

/* renamed from: w2.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13374h {
    /* renamed from: a */
    public static int m2692a(int... iArr) {
        boolean z;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }
}
