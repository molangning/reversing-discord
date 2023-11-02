package com.discord.misc.utilities.time;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;

@Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class TimeElapsed$durationMillis$2 extends AbstractC9614s implements Function0<Long> {
    final /* synthetic */ TimeElapsed this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeElapsed$durationMillis$2(TimeElapsed timeElapsed) {
        super(0);
        this.this$0 = timeElapsed;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        j = this.this$0.startTime;
        return Long.valueOf(currentTimeMillis - j);
    }
}