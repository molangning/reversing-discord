package com.discord.chat.presentation.message.view;

import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Double;)V"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MediaMosaicView$bindAttachmentHolder$3 extends AbstractC9614s implements Function1<Double, Unit> {
    final /* synthetic */ MessagePartViewHolder $holder;
    final /* synthetic */ VideoAttachmentMessageAccessory $item;
    final /* synthetic */ MediaMosaicView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaMosaicView$bindAttachmentHolder$3(MediaMosaicView mediaMosaicView, VideoAttachmentMessageAccessory videoAttachmentMessageAccessory, MessagePartViewHolder messagePartViewHolder) {
        super(1);
        this.this$0 = mediaMosaicView;
        this.$item = videoAttachmentMessageAccessory;
        this.$holder = messagePartViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Double d) {
        invoke2(d);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Double d) {
        Function3 function3;
        function3 = this.this$0.onAttachmentClicked;
        if (function3 == null) {
            C9612q.m13900y("onAttachmentClicked");
            function3 = null;
        }
        function3.invoke(Integer.valueOf(this.$item.getIndex()), this.$item, this.$holder);
    }
}
