package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.presentation.message.messagepart.PollMessageAccessory;
import com.discord.chat.presentation.message.view.polls.PollPresenter;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011JN\u0010\r\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00052\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u000bH\u0096\u0001ø\u0001\u0000R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m14357d2 = {"Lcom/discord/chat/presentation/message/viewholder/PollViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/view/polls/PollPresenter;", "Lcom/discord/chat/presentation/message/messagepart/PollMessageAccessory;", "accessory", "Lkotlin/Function3;", "Lcom/discord/primitives/ChannelId;", "Lcom/discord/primitives/MessageId;", "", "", "onTapAnswer", "Lkotlin/Function2;", "onTapSubmitVote", "bind", "pollView", "Lcom/discord/chat/presentation/message/view/polls/PollPresenter;", "<init>", "(Lcom/discord/chat/presentation/message/view/polls/PollPresenter;)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PollViewHolder extends MessagePartViewHolder implements PollPresenter {
    private final PollPresenter pollView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollViewHolder(PollPresenter pollView) {
        super((View) pollView, null);
        C9612q.m13917h(pollView, "pollView");
        this.pollView = pollView;
    }

    @Override // com.discord.chat.presentation.message.view.polls.PollPresenter
    public void bind(PollMessageAccessory accessory, Function3<? super ChannelId, ? super MessageId, ? super String, Unit> onTapAnswer, Function2<? super ChannelId, ? super MessageId, Unit> onTapSubmitVote) {
        C9612q.m13917h(accessory, "accessory");
        C9612q.m13917h(onTapAnswer, "onTapAnswer");
        C9612q.m13917h(onTapSubmitVote, "onTapSubmitVote");
        this.pollView.bind(accessory, onTapAnswer, onTapSubmitVote);
    }
}
