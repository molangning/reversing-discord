package p177jb;

import p102fb.C6378h;

/* renamed from: jb.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8893d {
    /* renamed from: a */
    public static int m17066a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m17065b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: c */
    public static long m17064c(long... jArr) {
        boolean z;
        if (jArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C6378h.m22840d(z);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }
}
