package com.discord.media.engine;

import com.facebook.react.bridge.Callback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "overhead", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* renamed from: com.discord.media.engine.MediaEngineModule$speedTestConnectionInstanceGetNetworkOverhead$1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class C3246x456029f3 extends AbstractC9614s implements Function1<Integer, Unit> {
    final /* synthetic */ Callback $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3246x456029f3(Callback callback) {
        super(1);
        this.$callback = callback;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f25302a;
    }

    public final void invoke(int i) {
        this.$callback.invoke(Integer.valueOf(i));
    }
}