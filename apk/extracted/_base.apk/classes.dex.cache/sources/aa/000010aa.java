package com.discord.chat.bridge.referencedmessage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;", "", "()V", "Companion", "Lcom/discord/chat/bridge/referencedmessage/LoadedReferencedMessage;", "Lcom/discord/chat/bridge/referencedmessage/SystemReferencedMessage;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f(with = ReferencedMessageSerializer.class)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class ReferencedMessage {
    public static final Companion Companion = new Companion(null);

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReferencedMessage> serializer() {
            return ReferencedMessageSerializer.INSTANCE;
        }
    }

    private ReferencedMessage() {
    }

    public /* synthetic */ ReferencedMessage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}