package com.discord.mobile_voice_overlay.views;

import android.content.Context;
import android.content.Intent;
import androidx.core.p018os.C1055e;
import com.discord.mobile_voice_overlay.MobileVoiceOverlay;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData;
import com.discord.react_activities.ReactActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class OverlayMenuBubbleDialog$setData$4 extends AbstractC9614s implements Function0<Unit> {
    final /* synthetic */ MobileVoiceOverlayData $data;
    final /* synthetic */ OverlayMenuBubbleDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayMenuBubbleDialog$setData$4(OverlayMenuBubbleDialog overlayMenuBubbleDialog, MobileVoiceOverlayData mobileVoiceOverlayData) {
        super(0);
        this.this$0 = overlayMenuBubbleDialog;
        this.$data = mobileVoiceOverlayData;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2() {
        Context context = this.this$0.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", null, this.this$0.getContext(), ReactActivity.Registry.getMainActivity());
        intent.addCategory("android.intent.category.HOME");
        intent.addFlags(268435456);
        context.startActivity(intent);
        MobileVoiceOverlay.Companion companion = MobileVoiceOverlay.Companion;
        Context context2 = this.this$0.getContext();
        C9612q.m13918g(context2, "context");
        companion.startHeadlessTask(context2, "SelectChannel", C1055e.m37978a(C11591x.m7577a("channelId", String.valueOf(this.$data.m41953getChannelIdo4g7jtM()))));
    }
}