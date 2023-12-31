package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.automod.AutoModerationContext;
import com.discord.chat.presentation.message.messagepart.FlaggedMessageActionBarAccessory;
import com.discord.chat.presentation.message.view.FlaggedMessageActionBarView;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JE\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\n2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\nø\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m14357d2 = {"Lcom/discord/chat/presentation/message/viewholder/FlaggedMessageActionBarViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "actionBarView", "Lcom/discord/chat/presentation/message/view/FlaggedMessageActionBarView;", "(Lcom/discord/chat/presentation/message/view/FlaggedMessageActionBarView;)V", "bind", "", "messageActionBarAccessory", "Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageActionBarAccessory;", "onTapAutoModerationActions", "Lkotlin/Function2;", "Lcom/discord/primitives/MessageId;", "Lcom/discord/primitives/ChannelId;", "onTapAutoModerationFeedback", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class FlaggedMessageActionBarViewHolder extends MessagePartViewHolder {
    private final FlaggedMessageActionBarView actionBarView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlaggedMessageActionBarViewHolder(FlaggedMessageActionBarView actionBarView) {
        super(actionBarView, null);
        C9612q.m13917h(actionBarView, "actionBarView");
        this.actionBarView = actionBarView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(Function2 onTapAutoModerationActions, String messageId, long j, View view) {
        C9612q.m13917h(onTapAutoModerationActions, "$onTapAutoModerationActions");
        C9612q.m13917h(messageId, "$messageId");
        onTapAutoModerationActions.invoke(MessageId.m42073boximpl(messageId), ChannelId.m42047boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(Function2 onTapAutoModerationFeedback, String messageId, long j, View view) {
        C9612q.m13917h(onTapAutoModerationFeedback, "$onTapAutoModerationFeedback");
        C9612q.m13917h(messageId, "$messageId");
        onTapAutoModerationFeedback.invoke(MessageId.m42073boximpl(messageId), ChannelId.m42047boximpl(j));
    }

    public final void bind(FlaggedMessageActionBarAccessory messageActionBarAccessory, final Function2<? super MessageId, ? super ChannelId, Unit> onTapAutoModerationActions, final Function2<? super MessageId, ? super ChannelId, Unit> onTapAutoModerationFeedback) {
        C9612q.m13917h(messageActionBarAccessory, "messageActionBarAccessory");
        C9612q.m13917h(onTapAutoModerationActions, "onTapAutoModerationActions");
        C9612q.m13917h(onTapAutoModerationFeedback, "onTapAutoModerationFeedback");
        AutoModerationContext autoModerationContext = messageActionBarAccessory.getAutoModerationContext();
        final long m41434getChannelIdo4g7jtM = messageActionBarAccessory.getMessage().m41434getChannelIdo4g7jtM();
        final String m41436getId3Eiw7ao = messageActionBarAccessory.getMessage().m41436getId3Eiw7ao();
        this.actionBarView.setActions(autoModerationContext, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.viewholder.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FlaggedMessageActionBarViewHolder.bind$lambda$0(Function2.this, m41436getId3Eiw7ao, m41434getChannelIdo4g7jtM, view);
            }
        }, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.viewholder.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FlaggedMessageActionBarViewHolder.bind$lambda$1(Function2.this, m41436getId3Eiw7ao, m41434getChannelIdo4g7jtM, view);
            }
        });
    }
}
