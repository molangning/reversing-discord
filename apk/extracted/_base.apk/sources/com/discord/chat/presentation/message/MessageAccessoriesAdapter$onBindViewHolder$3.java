package com.discord.chat.presentation.message;

import com.discord.chat.presentation.message.messagepart.EmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import com.discord.chat.reactevents.ViewResizeMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m14357d2 = {"<anonymous>", "", "portal", "", "index", "", "invoke", "(Ljava/lang/Double;Ljava/lang/Integer;)V"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageAccessoriesAdapter$onBindViewHolder$3 extends AbstractC9614s implements Function2<Double, Integer, Unit> {
    final /* synthetic */ MessagePartViewHolder $holder;
    final /* synthetic */ MessageAccessory $part;
    final /* synthetic */ MessageAccessoriesAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAccessoriesAdapter$onBindViewHolder$3(MessageAccessoriesAdapter messageAccessoriesAdapter, MessagePartViewHolder messagePartViewHolder, MessageAccessory messageAccessory) {
        super(2);
        this.this$0 = messageAccessoriesAdapter;
        this.$holder = messagePartViewHolder;
        this.$part = messageAccessory;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Double d, Integer num) {
        invoke2(d, num);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Double d, Integer num) {
        this.this$0.m41634onMediaClickedl3ndGo(this.$holder, this.$part.mo41659getMessageId3Eiw7ao(), ((EmbedMessageAccessory) this.$part).getIndex(), "embed", d, num, ViewResizeMode.Fill);
    }
}
