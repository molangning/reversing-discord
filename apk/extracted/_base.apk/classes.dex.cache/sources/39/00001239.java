package com.discord.chat.presentation.list.delegate.messagebundling;

import android.content.Context;
import com.discord.chat.bridge.MediaType;
import com.discord.chat.presentation.events.CreateChatReactEventsKt;
import com.discord.chat.presentation.list.item.MessageItem;
import com.discord.chat.reactevents.ChatViewEventHandler;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.discord.reactevents.ReactEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m14357d2 = {"reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getEventHandler", "Lcom/discord/chat/reactevents/ChatViewEventHandler;", "Lcom/discord/chat/presentation/list/item/MessageItem;", "context", "Landroid/content/Context;", "chat_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageBundleDelegateUtilsKt {
    private static final ReactEvents reactEvents;

    static {
        ReactEvents createChatReactEvents = CreateChatReactEventsKt.createChatReactEvents();
        createChatReactEvents.exportEventConstants();
        reactEvents = createChatReactEvents;
    }

    public static final ChatViewEventHandler getEventHandler(MessageItem messageItem, Context context) {
        C9612q.m13917h(messageItem, "<this>");
        C9612q.m13917h(context, "context");
        return new ChatViewEventHandler(context, reactEvents, new MessageBundleDelegateUtilsKt$getEventHandler$2(messageItem)) { // from class: com.discord.chat.presentation.list.delegate.messagebundling.MessageBundleDelegateUtilsKt$getEventHandler$1
            private final Function4<MessageId, ChannelId, Integer, MediaType, Unit> onMessageLongPressed;
            private final Function2<MessageId, ChannelId, Unit> onMessageTapped;

            @Override // com.discord.chat.reactevents.ChatViewEventHandler, com.discord.chat.presentation.events.ChatEventHandler
            /* renamed from: getOnMessageLongPressed */
            public Function4<MessageId, ChannelId, Integer, MediaType, Unit> mo41622getOnMessageLongPressed() {
                return this.onMessageLongPressed;
            }

            @Override // com.discord.chat.reactevents.ChatViewEventHandler, com.discord.chat.presentation.events.ChatEventHandler
            /* renamed from: getOnMessageTapped */
            public Function2<MessageId, ChannelId, Unit> mo41623getOnMessageTapped() {
                return this.onMessageTapped;
            }
        };
    }
}