package com.discord.chat.presentation.list.item;

import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m14357d2 = {"Lcom/discord/chat/presentation/list/item/AutomodSystemMessageItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "message", "Lcom/discord/chat/bridge/Message;", "messageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "allowChildGestures", "", "(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Z)V", "getAllowChildGestures", "()Z", "getMessage", "()Lcom/discord/chat/bridge/Message;", "getMessageContext", "()Lcom/discord/chat/presentation/root/MessageContext;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AutomodSystemMessageItem extends ChatListItem {
    private final boolean allowChildGestures;
    private final Message message;
    private final MessageContext messageContext;

    public /* synthetic */ AutomodSystemMessageItem(Message message, MessageContext messageContext, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        AutomodSystemMessageItem automodSystemMessageItem;
        Message message2;
        boolean z2;
        MessageContext messageContext2 = (i & 2) != 0 ? new MessageContext(false, false, null, null, null, null, null, false, false, false, false, false, null, 8191, null) : messageContext;
        if ((i & 4) != 0) {
            z2 = true;
            automodSystemMessageItem = this;
            message2 = message;
        } else {
            automodSystemMessageItem = this;
            message2 = message;
            z2 = z;
        }
        new AutomodSystemMessageItem(message2, messageContext2, z2);
    }

    public static /* synthetic */ AutomodSystemMessageItem copy$default(AutomodSystemMessageItem automodSystemMessageItem, Message message, MessageContext messageContext, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            message = automodSystemMessageItem.message;
        }
        if ((i & 2) != 0) {
            messageContext = automodSystemMessageItem.messageContext;
        }
        if ((i & 4) != 0) {
            z = automodSystemMessageItem.allowChildGestures;
        }
        return automodSystemMessageItem.copy(message, messageContext, z);
    }

    public final Message component1() {
        return this.message;
    }

    public final MessageContext component2() {
        return this.messageContext;
    }

    public final boolean component3() {
        return this.allowChildGestures;
    }

    public final AutomodSystemMessageItem copy(Message message, MessageContext messageContext, boolean z) {
        C9612q.m13917h(message, "message");
        C9612q.m13917h(messageContext, "messageContext");
        return new AutomodSystemMessageItem(message, messageContext, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AutomodSystemMessageItem) {
            AutomodSystemMessageItem automodSystemMessageItem = (AutomodSystemMessageItem) obj;
            return C9612q.m13922c(this.message, automodSystemMessageItem.message) && C9612q.m13922c(this.messageContext, automodSystemMessageItem.messageContext) && this.allowChildGestures == automodSystemMessageItem.allowChildGestures;
        }
        return false;
    }

    public final boolean getAllowChildGestures() {
        return this.allowChildGestures;
    }

    public final Message getMessage() {
        return this.message;
    }

    public final MessageContext getMessageContext() {
        return this.messageContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.message.hashCode() * 31) + this.messageContext.hashCode()) * 31;
        boolean z = this.allowChildGestures;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        Message message = this.message;
        MessageContext messageContext = this.messageContext;
        boolean z = this.allowChildGestures;
        return "AutomodSystemMessageItem(message=" + message + ", messageContext=" + messageContext + ", allowChildGestures=" + z + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutomodSystemMessageItem(Message message, MessageContext messageContext, boolean z) {
        super(MessageId.m42079toStringimpl(message.m41436getId3Eiw7ao()), null);
        C9612q.m13917h(message, "message");
        C9612q.m13917h(messageContext, "messageContext");
        this.message = message;
        this.messageContext = messageContext;
        this.allowChildGestures = z;
        if (!MessageKt.isAutomodSystemMessage(message)) {
            throw new IllegalArgumentException("Only automod system messages are allowed".toString());
        }
    }
}