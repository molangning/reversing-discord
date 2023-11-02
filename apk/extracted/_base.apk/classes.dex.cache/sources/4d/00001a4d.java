package com.discord.minibsdiff;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "", "it", "", "invoke", "(J)Ljava/lang/Integer;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class BSDiff$chunkRange$1 extends AbstractC9614s implements Function1<Long, Integer> {
    final /* synthetic */ long $total;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BSDiff$chunkRange$1(long j) {
        super(1);
        this.$total = j;
    }

    public final Integer invoke(long j) {
        return Integer.valueOf((int) Math.min(this.$total - j, 1000000L));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Long l) {
        return invoke(l.longValue());
    }
}