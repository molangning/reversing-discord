package com.discord.sticker.sticker_types;

import com.discord.sticker.sticker_types.RLottieImageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "", "it", "Lcom/discord/sticker/sticker_types/RLottieImageView$Config;", "invoke", "(Lcom/discord/sticker/sticker_types/RLottieImageView$Config;)Ljava/lang/Boolean;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class RLottieImageView$rLottieStateManager$4 extends AbstractC9614s implements Function1<RLottieImageView.Config, Boolean> {
    final /* synthetic */ RLottieImageView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RLottieImageView$rLottieStateManager$4(RLottieImageView rLottieImageView) {
        super(1);
        this.this$0 = rLottieImageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(RLottieImageView.Config it) {
        C9612q.m13917h(it, "it");
        return Boolean.valueOf(this.this$0.isAttachedToWindow());
    }
}
