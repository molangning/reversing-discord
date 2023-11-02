package p355ti;

/* renamed from: ti.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final /* synthetic */ class C12796i {
    /* renamed from: a */
    public static /* synthetic */ long m3901a(long j, long j2) {
        if (j2 < 0) {
            return (j ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? 0L : 1L;
        } else if (j >= 0) {
            return j / j2;
        } else {
            long j3 = ((j >>> 1) / j2) << 1;
            return j3 + (((j - (j3 * j2)) ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? 0 : 1);
        }
    }
}
