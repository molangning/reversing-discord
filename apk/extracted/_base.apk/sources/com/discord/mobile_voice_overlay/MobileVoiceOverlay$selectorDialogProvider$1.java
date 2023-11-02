package com.discord.mobile_voice_overlay;

import com.discord.mobile_voice_overlay.utils.OverlayViewProvider;
import com.discord.mobile_voice_overlay.views.OverlayVoiceSelectorBubbleDialog;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog;", "provider", "Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MobileVoiceOverlay$selectorDialogProvider$1 extends AbstractC9614s implements Function1<OverlayViewProvider<OverlayVoiceSelectorBubbleDialog>, OverlayVoiceSelectorBubbleDialog> {
    final /* synthetic */ MobileVoiceOverlay this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileVoiceOverlay$selectorDialogProvider$1(MobileVoiceOverlay mobileVoiceOverlay) {
        super(1);
        this.this$0 = mobileVoiceOverlay;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OverlayVoiceSelectorBubbleDialog invoke(OverlayViewProvider<OverlayVoiceSelectorBubbleDialog> provider) {
        ReactApplicationContext reactApplicationContext;
        C9612q.m13917h(provider, "provider");
        reactApplicationContext = this.this$0.context;
        OverlayVoiceSelectorBubbleDialog overlayVoiceSelectorBubbleDialog = new OverlayVoiceSelectorBubbleDialog(reactApplicationContext);
        MobileVoiceOverlay mobileVoiceOverlay = this.this$0;
        overlayVoiceSelectorBubbleDialog.setOnDialogClosed(new MobileVoiceOverlay$selectorDialogProvider$1$1$1(provider));
        overlayVoiceSelectorBubbleDialog.setOnTextChanged(new MobileVoiceOverlay$selectorDialogProvider$1$1$2(mobileVoiceOverlay));
        overlayVoiceSelectorBubbleDialog.setOnChannelSelected(new MobileVoiceOverlay$selectorDialogProvider$1$1$3(overlayVoiceSelectorBubbleDialog));
        return overlayVoiceSelectorBubbleDialog;
    }
}
