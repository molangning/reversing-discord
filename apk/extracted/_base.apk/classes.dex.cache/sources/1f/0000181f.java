package com.discord.image.animated_image.apng;

import com.discord.image.animated_image.apng.APNGView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "", "config", "Lcom/discord/image/animated_image/apng/APNGView$Config;", "invoke", "(Lcom/discord/image/animated_image/apng/APNGView$Config;)Ljava/lang/Boolean;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class APNGView$apngStateManager$4 extends AbstractC9614s implements Function1<APNGView.Config, Boolean> {
    final /* synthetic */ APNGView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public APNGView$apngStateManager$4(APNGView aPNGView) {
        super(1);
        this.this$0 = aPNGView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(APNGView.Config config) {
        boolean z;
        boolean hasFilename;
        C9612q.m13917h(config, "config");
        if (this.this$0.isAttachedToWindow()) {
            hasFilename = APNGView.Companion.hasFilename(config.getUrl());
            if (hasFilename) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}