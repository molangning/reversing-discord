package p373ui;

import kotlin.Metadata;
import kotlin.time.C9662a;
import kotlin.time.Duration;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0005\u001a\"\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m14357d2 = {"", "valueNs", "originNs", "Lkotlin/time/Duration;", "a", "(JJ)J", "origin1Ns", "origin2Ns", "c", "value1Ns", "value2Ns", "b", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: ui.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12983d {
    /* renamed from: a */
    public static final long m3534a(long j, long j2) {
        boolean z;
        if ((1 | (j2 - 1)) == Long.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Duration.m13649L(C9662a.m13603t(j2, EnumC12982c.DAYS));
        }
        return m3533b(j, j2);
    }

    /* renamed from: b */
    private static final long m3533b(long j, long j2) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) < 0) {
            long j4 = 1000000;
            long j5 = (j % j4) - (j2 % j4);
            Duration.C9661a c9661a = Duration.f25397k;
            return Duration.m13654G(C9662a.m13603t((j / j4) - (j2 / j4), EnumC12982c.MILLISECONDS), C9662a.m13603t(j5, EnumC12982c.NANOSECONDS));
        }
        Duration.C9661a c9661a2 = Duration.f25397k;
        return C9662a.m13603t(j3, EnumC12982c.NANOSECONDS);
    }

    /* renamed from: c */
    public static final long m3532c(long j, long j2) {
        boolean z;
        boolean z2 = true;
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == j2) {
                return Duration.f25397k.m13624b();
            }
            return Duration.m13649L(C9662a.m13603t(j2, EnumC12982c.DAYS));
        }
        if ((1 | (j - 1)) != Long.MAX_VALUE) {
            z2 = false;
        }
        if (z2) {
            return C9662a.m13603t(j, EnumC12982c.DAYS);
        }
        return m3533b(j, j2);
    }
}