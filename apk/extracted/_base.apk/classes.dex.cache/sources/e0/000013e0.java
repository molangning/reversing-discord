package com.discord.chat.presentation.message.view.polls;

import com.discord.chat.presentation.message.messagepart.PollMessageAccessory;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "answerId", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class BasePollWithRecyclerView$bind$1 extends AbstractC9614s implements Function1<String, Unit> {
    final /* synthetic */ PollMessageAccessory $accessory;
    final /* synthetic */ Function3<ChannelId, MessageId, String, Unit> $onTapAnswer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BasePollWithRecyclerView$bind$1(Function3<? super ChannelId, ? super MessageId, ? super String, Unit> function3, PollMessageAccessory pollMessageAccessory) {
        super(1);
        this.$onTapAnswer = function3;
        this.$accessory = pollMessageAccessory;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(String answerId) {
        C9612q.m13917h(answerId, "answerId");
        this.$onTapAnswer.invoke(ChannelId.m42047boximpl(this.$accessory.m41728getChannelIdo4g7jtM()), MessageId.m42073boximpl(this.$accessory.mo41659getMessageId3Eiw7ao()), answerId);
    }
}