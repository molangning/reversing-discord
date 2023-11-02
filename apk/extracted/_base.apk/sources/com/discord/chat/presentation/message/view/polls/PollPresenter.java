package com.discord.chat.presentation.message.view.polls;

import com.discord.chat.presentation.message.messagepart.PollMessageAccessory;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JM\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00042\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\nH&ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/polls/PollPresenter;", "", "Lcom/discord/chat/presentation/message/messagepart/PollMessageAccessory;", "accessory", "Lkotlin/Function3;", "Lcom/discord/primitives/ChannelId;", "Lcom/discord/primitives/MessageId;", "", "", "onTapAnswer", "Lkotlin/Function2;", "onTapSubmitVote", "bind", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public interface PollPresenter {
    void bind(PollMessageAccessory pollMessageAccessory, Function3<? super ChannelId, ? super MessageId, ? super String, Unit> function3, Function2<? super ChannelId, ? super MessageId, Unit> function2);
}
