package com.discord.chat.presentation.message.decorations;

import com.discord.channel_spine.ChannelSpineView;
import com.discord.chat.C2912R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "Lcom/discord/channel_spine/ChannelSpineView;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SpineDrawer$splineView$2 extends AbstractC9614s implements Function0<ChannelSpineView> {
    final /* synthetic */ SpineDrawer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpineDrawer$splineView$2(SpineDrawer spineDrawer) {
        super(0);
        this.this$0 = spineDrawer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ChannelSpineView invoke() {
        ChannelSpineView channelSpineView = new ChannelSpineView(this.this$0.getContext(), null, 2, null);
        channelSpineView.setVerticalPadding(0);
        channelSpineView.setHorizontalPadding(channelSpineView.getContext().getResources().getDimensionPixelSize(C2912R.dimen.thread_spine_end_padding));
        channelSpineView.setNumRows(1);
        return channelSpineView;
    }
}