package com.discord.mobile_voice_overlay.views;

import com.discord.primitives.ChannelId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "", "it", "Lcom/discord/primitives/ChannelId;", "invoke-R7gqayM", "(J)V"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class OverlayVoiceSelectorBubbleDialog$onChannelSelected$1 extends AbstractC9614s implements Function1<ChannelId, Unit> {
    public static final OverlayVoiceSelectorBubbleDialog$onChannelSelected$1 INSTANCE = new OverlayVoiceSelectorBubbleDialog$onChannelSelected$1();

    OverlayVoiceSelectorBubbleDialog$onChannelSelected$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChannelId channelId) {
        m41966invokeR7gqayM(channelId.m42056unboximpl());
        return Unit.f25302a;
    }

    /* renamed from: invoke-R7gqayM */
    public final void m41966invokeR7gqayM(long j) {
    }
}