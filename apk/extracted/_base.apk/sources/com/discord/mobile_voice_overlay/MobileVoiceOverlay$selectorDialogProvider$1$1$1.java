package com.discord.mobile_voice_overlay;

import com.discord.mobile_voice_overlay.utils.OverlayViewProvider;
import com.discord.mobile_voice_overlay.views.OverlayDialog;
import com.discord.mobile_voice_overlay.views.OverlayVoiceSelectorBubbleDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "it", "Lcom/discord/mobile_voice_overlay/views/OverlayDialog;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class MobileVoiceOverlay$selectorDialogProvider$1$1$1 extends AbstractC9614s implements Function1<OverlayDialog, Unit> {
    final /* synthetic */ OverlayViewProvider<OverlayVoiceSelectorBubbleDialog> $provider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileVoiceOverlay$selectorDialogProvider$1$1$1(OverlayViewProvider<OverlayVoiceSelectorBubbleDialog> overlayViewProvider) {
        super(1);
        this.$provider = overlayViewProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OverlayDialog overlayDialog) {
        invoke2(overlayDialog);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OverlayDialog it) {
        C9612q.m13917h(it, "it");
        this.$provider.removeViewFromOverlay();
    }
}
