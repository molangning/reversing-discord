package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.automod.AutoModerationContext;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\u0010\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m14357d2 = {"Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageActionBarAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "message", "Lcom/discord/chat/bridge/Message;", "autoModerationContext", "Lcom/discord/chat/bridge/automod/AutoModerationContext;", "(Ljava/lang/String;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/automod/AutoModerationContext;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAutoModerationContext", "()Lcom/discord/chat/bridge/automod/AutoModerationContext;", "getMessage", "()Lcom/discord/chat/bridge/Message;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component3", "copy", "copy-u7_MRrM", "(Ljava/lang/String;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/automod/AutoModerationContext;)Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageActionBarAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class FlaggedMessageActionBarAccessory extends MessageAccessory {
    private final AutoModerationContext autoModerationContext;
    private final Message message;
    private final String messageId;

    private FlaggedMessageActionBarAccessory(String str, Message message, AutoModerationContext autoModerationContext) {
        super(str, "flagged message actions", null);
        this.messageId = str;
        this.message = message;
        this.autoModerationContext = autoModerationContext;
    }

    public /* synthetic */ FlaggedMessageActionBarAccessory(String str, Message message, AutoModerationContext autoModerationContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, message, autoModerationContext);
    }

    /* renamed from: copy-u7_MRrM$default */
    public static /* synthetic */ FlaggedMessageActionBarAccessory m41683copyu7_MRrM$default(FlaggedMessageActionBarAccessory flaggedMessageActionBarAccessory, String str, Message message, AutoModerationContext autoModerationContext, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flaggedMessageActionBarAccessory.mo41659getMessageId3Eiw7ao();
        }
        if ((i & 2) != 0) {
            message = flaggedMessageActionBarAccessory.message;
        }
        if ((i & 4) != 0) {
            autoModerationContext = flaggedMessageActionBarAccessory.autoModerationContext;
        }
        return flaggedMessageActionBarAccessory.m41685copyu7_MRrM(str, message, autoModerationContext);
    }

    /* renamed from: component1-3Eiw7ao */
    public final String m41684component13Eiw7ao() {
        return mo41659getMessageId3Eiw7ao();
    }

    public final Message component2() {
        return this.message;
    }

    public final AutoModerationContext component3() {
        return this.autoModerationContext;
    }

    /* renamed from: copy-u7_MRrM */
    public final FlaggedMessageActionBarAccessory m41685copyu7_MRrM(String messageId, Message message, AutoModerationContext autoModerationContext) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(message, "message");
        C9612q.m13917h(autoModerationContext, "autoModerationContext");
        return new FlaggedMessageActionBarAccessory(messageId, message, autoModerationContext, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlaggedMessageActionBarAccessory) {
            FlaggedMessageActionBarAccessory flaggedMessageActionBarAccessory = (FlaggedMessageActionBarAccessory) obj;
            return MessageId.m42077equalsimpl0(mo41659getMessageId3Eiw7ao(), flaggedMessageActionBarAccessory.mo41659getMessageId3Eiw7ao()) && C9612q.m13922c(this.message, flaggedMessageActionBarAccessory.message) && C9612q.m13922c(this.autoModerationContext, flaggedMessageActionBarAccessory.autoModerationContext);
        }
        return false;
    }

    public final AutoModerationContext getAutoModerationContext() {
        return this.autoModerationContext;
    }

    public final Message getMessage() {
        return this.message;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41659getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (((MessageId.m42078hashCodeimpl(mo41659getMessageId3Eiw7ao()) * 31) + this.message.hashCode()) * 31) + this.autoModerationContext.hashCode();
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(mo41659getMessageId3Eiw7ao());
        Message message = this.message;
        AutoModerationContext autoModerationContext = this.autoModerationContext;
        return "FlaggedMessageActionBarAccessory(messageId=" + m42079toStringimpl + ", message=" + message + ", autoModerationContext=" + autoModerationContext + ")";
    }
}