package com.discord.chat.bridge.messageframe;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m14357d2 = {"Lcom/discord/chat/bridge/messageframe/MessageFrame;", "", "()V", "type", "Lcom/discord/chat/bridge/messageframe/MessageFrameType;", "getType", "()Lcom/discord/chat/bridge/messageframe/MessageFrameType;", "Companion", "Lcom/discord/chat/bridge/messageframe/MessageFrameJump;", "Lcom/discord/chat/bridge/messageframe/MessageFrameMediaViewer;", "Lcom/discord/chat/bridge/messageframe/UnknownMessageFrame;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f(with = MessageFrameSerializer.class)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class MessageFrame {
    public static final Companion Companion = new Companion(null);

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/messageframe/MessageFrame$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/messageframe/MessageFrame;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MessageFrame> serializer() {
            return MessageFrameSerializer.INSTANCE;
        }
    }

    private MessageFrame() {
    }

    public /* synthetic */ MessageFrame(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract MessageFrameType getType();
}
