package p233mf;

import java.util.concurrent.atomic.AtomicLong;
import nf.C10859a;

/* renamed from: mf.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10448b {
    /* renamed from: a */
    public static long m11528a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m11527b(j2, j)));
        return j2;
    }

    /* renamed from: b */
    public static long m11527b(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* renamed from: c */
    public static long m11526c(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                C10859a.m9887j(new IllegalStateException("More produced than requested: " + j3));
                j3 = 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }
}
