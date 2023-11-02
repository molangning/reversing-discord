package com.discord.sticker.sticker_types;

import com.discord.sticker.sticker_types.RLottieImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "config", "Lcom/discord/sticker/sticker_types/RLottieImageView$Config;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class RLottieImageView$rLottieStateManager$5 extends AbstractC9614s implements Function1<RLottieImageView.Config, Unit> {
    final /* synthetic */ RLottieImageView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RLottieImageView$rLottieStateManager$5(RLottieImageView rLottieImageView) {
        super(1);
        this.this$0 = rLottieImageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RLottieImageView.Config config) {
        invoke2(config);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(RLottieImageView.Config config) {
        C9612q.m13917h(config, "config");
        this.this$0.fetchSticker(config);
    }
}