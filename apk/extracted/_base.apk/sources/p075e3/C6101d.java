package p075e3;

import java.io.InputStream;
import p394w2.C13379j;

/* renamed from: e3.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6101d {
    /* renamed from: a */
    public static long m23576a(InputStream inputStream, long j) {
        boolean z;
        C13379j.m2677g(inputStream);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip <= 0) {
                if (inputStream.read() != -1) {
                    skip = 1;
                } else {
                    return j - j2;
                }
            }
            j2 -= skip;
        }
        return j;
    }
}
