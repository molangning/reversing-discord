package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.message.messagepart.ChannelPromptActionsAccessory;
import com.discord.chat.presentation.message.view.ChannelPromptActionsView;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J1\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\nø\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m14357d2 = {"Lcom/discord/chat/presentation/message/viewholder/ChannelPromptActionsViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "channelPromptActionsView", "Lcom/discord/chat/presentation/message/view/ChannelPromptActionsView;", "(Lcom/discord/chat/presentation/message/view/ChannelPromptActionsView;)V", "bind", "", "accessory", "Lcom/discord/chat/presentation/message/messagepart/ChannelPromptActionsAccessory;", "onTapChannelPromptButton", "Lkotlin/Function3;", "Lcom/discord/primitives/MessageId;", "Lcom/discord/primitives/ChannelId;", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChannelPromptActionsViewHolder extends MessagePartViewHolder {
    private final ChannelPromptActionsView channelPromptActionsView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelPromptActionsViewHolder(ChannelPromptActionsView channelPromptActionsView) {
        super(channelPromptActionsView, null);
        C9612q.m13917h(channelPromptActionsView, "channelPromptActionsView");
        this.channelPromptActionsView = channelPromptActionsView;
        channelPromptActionsView.setLayoutParams(new RecyclerView.C1772i(-2, -2));
    }

    public static final void bind$lambda$0(Function3 onTapChannelPromptButton, ChannelPromptActionsAccessory accessory, View view) {
        C9612q.m13917h(onTapChannelPromptButton, "$onTapChannelPromptButton");
        C9612q.m13917h(accessory, "$accessory");
        onTapChannelPromptButton.invoke(MessageId.m42073boximpl(accessory.mo41659getMessageId3Eiw7ao()), ChannelId.m42047boximpl(accessory.getMessage().m41434getChannelIdo4g7jtM()), "camera");
    }

    public static final void bind$lambda$1(Function3 onTapChannelPromptButton, ChannelPromptActionsAccessory accessory, View view) {
        C9612q.m13917h(onTapChannelPromptButton, "$onTapChannelPromptButton");
        C9612q.m13917h(accessory, "$accessory");
        onTapChannelPromptButton.invoke(MessageId.m42073boximpl(accessory.mo41659getMessageId3Eiw7ao()), ChannelId.m42047boximpl(accessory.getMessage().m41434getChannelIdo4g7jtM()), "emoji");
    }

    public static final void bind$lambda$2(Function3 onTapChannelPromptButton, ChannelPromptActionsAccessory accessory, View view) {
        C9612q.m13917h(onTapChannelPromptButton, "$onTapChannelPromptButton");
        C9612q.m13917h(accessory, "$accessory");
        onTapChannelPromptButton.invoke(MessageId.m42073boximpl(accessory.mo41659getMessageId3Eiw7ao()), ChannelId.m42047boximpl(accessory.getMessage().m41434getChannelIdo4g7jtM()), "gaming-stats");
    }

    public static final void bind$lambda$3(Function3 onTapChannelPromptButton, ChannelPromptActionsAccessory accessory, View view) {
        C9612q.m13917h(onTapChannelPromptButton, "$onTapChannelPromptButton");
        C9612q.m13917h(accessory, "$accessory");
        onTapChannelPromptButton.invoke(MessageId.m42073boximpl(accessory.mo41659getMessageId3Eiw7ao()), ChannelId.m42047boximpl(accessory.getMessage().m41434getChannelIdo4g7jtM()), "gif");
    }

    public final void bind(final ChannelPromptActionsAccessory accessory, final Function3<? super MessageId, ? super ChannelId, ? super String, Unit> onTapChannelPromptButton) {
        C9612q.m13917h(accessory, "accessory");
        C9612q.m13917h(onTapChannelPromptButton, "onTapChannelPromptButton");
        this.channelPromptActionsView.configure(accessory.getMessage(), new View.OnClickListener() { // from class: com.discord.chat.presentation.message.viewholder.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChannelPromptActionsViewHolder.bind$lambda$0(Function3.this, accessory, view);
            }
        }, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.viewholder.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChannelPromptActionsViewHolder.bind$lambda$1(Function3.this, accessory, view);
            }
        }, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.viewholder.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChannelPromptActionsViewHolder.bind$lambda$2(Function3.this, accessory, view);
            }
        }, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.viewholder.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChannelPromptActionsViewHolder.bind$lambda$3(Function3.this, accessory, view);
            }
        });
    }
}