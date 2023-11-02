package p241n4;

/* renamed from: n4.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10500a {
    /* renamed from: a */
    public void m11355a(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] < 11) {
                iArr[i] = 100;
            }
        }
    }

    /* renamed from: b */
    public int[] m11354b(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = i;
            i += iArr[i2];
        }
        return iArr2;
    }

    /* renamed from: c */
    public int m11353c(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }
}
