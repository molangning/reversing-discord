package gb;

/* renamed from: gb.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C6681p {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m22158a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (d * highestOneBit))) {
            int i2 = highestOneBit << 1;
            if (i2 <= 0) {
                return 1073741824;
            }
            return i2;
        }
        return highestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m22157b(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m22156c(Object obj) {
        return m22157b(obj == null ? 0 : obj.hashCode());
    }
}
