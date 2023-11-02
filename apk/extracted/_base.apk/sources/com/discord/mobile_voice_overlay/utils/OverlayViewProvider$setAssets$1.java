package com.discord.mobile_voice_overlay.utils;

import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets;
import com.discord.mobile_voice_overlay.views.OverlayView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"<anonymous>", "", "T", "Lcom/discord/mobile_voice_overlay/views/OverlayView;", "view", "invoke", "(Lcom/discord/mobile_voice_overlay/views/OverlayView;)V"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class OverlayViewProvider$setAssets$1<T> extends AbstractC9614s implements Function1<T, Unit> {
    final /* synthetic */ MobileVoiceOverlayAssets $assets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayViewProvider$setAssets$1(MobileVoiceOverlayAssets mobileVoiceOverlayAssets) {
        super(1);
        this.$assets = mobileVoiceOverlayAssets;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((OverlayView) obj);
        return Unit.f25302a;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    public final void invoke(OverlayView view) {
        C9612q.m13917h(view, "view");
        view.setAssets(this.$assets);
    }
}
