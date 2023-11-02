package com.discord.mobile_voice_overlay;

import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "it", "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MobileVoiceOverlay$showOverlay$1$1 extends AbstractC9614s implements Function1<OverlayVoiceBubble, Unit> {
    final /* synthetic */ MobileVoiceOverlay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileVoiceOverlay$showOverlay$1$1(MobileVoiceOverlay mobileVoiceOverlay) {
        super(1);
        this.this$0 = mobileVoiceOverlay;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OverlayVoiceBubble overlayVoiceBubble) {
        invoke2(overlayVoiceBubble);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(OverlayVoiceBubble it) {
        C9612q.m13917h(it, "it");
        this.this$0.floatBubbleToHorizontalEdge(it);
    }
}