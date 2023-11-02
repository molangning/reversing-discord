package p143hj;

/* renamed from: hj.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
class C7347a {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m20898a(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static double m20897b(double d) {
        while (Double.compare(0.0d, d) > 0) {
            d += 360.0d;
        }
        while (Double.compare(d, 360.0d) >= 0) {
            d -= 360.0d;
        }
        return d;
    }
}
