package com.discord.misc.utilities.time;

import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.flow.C9711d;
import kotlinx.coroutines.flow.Flow;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m14357d2 = {"intervalFlow", "Lkotlinx/coroutines/flow/Flow;", "", "periodMs", "", "initialDelayMs", "period", "Lkotlin/time/Duration;", "initialDelay", "intervalFlow-QTBD994", "(JJ)Lkotlinx/coroutines/flow/Flow;", "misc_utilities_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class IntervalFlowKt {
    public static final Flow<Unit> intervalFlow(long j, long j2) {
        return C9711d.m13460e(new IntervalFlowKt$intervalFlow$2(j2, j, null));
    }

    public static /* synthetic */ Flow intervalFlow$default(long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        return intervalFlow(j, j2);
    }

    /* renamed from: intervalFlow-QTBD994 */
    public static final Flow<Unit> m41946intervalFlowQTBD994(long j, long j2) {
        return C9711d.m13460e(new IntervalFlowKt$intervalFlow$1(j2, j, null));
    }

    /* renamed from: intervalFlow-QTBD994$default */
    public static /* synthetic */ Flow m41947intervalFlowQTBD994$default(long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        return m41946intervalFlowQTBD994(j, j2);
    }
}