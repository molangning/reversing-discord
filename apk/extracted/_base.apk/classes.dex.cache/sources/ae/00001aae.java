package com.discord.mobile_voice_overlay;

import android.content.Context;
import androidx.core.p018os.C1055e;
import com.discord.mobile_voice_overlay.MobileVoiceOverlay;
import com.discord.mobile_voice_overlay.views.OverlayVoiceSelectorBubbleDialog;
import com.discord.primitives.ChannelId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "", "channelId", "Lcom/discord/primitives/ChannelId;", "invoke-R7gqayM", "(J)V"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class MobileVoiceOverlay$selectorDialogProvider$1$1$3 extends AbstractC9614s implements Function1<ChannelId, Unit> {
    final /* synthetic */ OverlayVoiceSelectorBubbleDialog $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileVoiceOverlay$selectorDialogProvider$1$1$3(OverlayVoiceSelectorBubbleDialog overlayVoiceSelectorBubbleDialog) {
        super(1);
        this.$this_apply = overlayVoiceSelectorBubbleDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChannelId channelId) {
        m41948invokeR7gqayM(channelId.m42056unboximpl());
        return Unit.f25302a;
    }

    /* renamed from: invoke-R7gqayM */
    public final void m41948invokeR7gqayM(long j) {
        MobileVoiceOverlay.Companion companion = MobileVoiceOverlay.Companion;
        Context context = this.$this_apply.getContext();
        C9612q.m13918g(context, "context");
        companion.startHeadlessTask(context, "SelectChannel", C1055e.m37978a(C11591x.m7577a("channelId", String.valueOf(j)), C11591x.m7577a("connectToVoice", Boolean.TRUE)));
    }
}