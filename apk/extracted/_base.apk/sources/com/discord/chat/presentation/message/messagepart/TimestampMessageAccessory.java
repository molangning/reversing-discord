package com.discord.chat.presentation.message.messagepart;

import com.discord.fonts.DiscordFont;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\u0013\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J>\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, m14357d2 = {"Lcom/discord/chat/presentation/message/messagepart/TimestampMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "timestamp", "", "textColor", "", "discordFont", "Lcom/discord/fonts/DiscordFont;", "(Ljava/lang/String;Ljava/lang/String;ILcom/discord/fonts/DiscordFont;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDiscordFont", "()Lcom/discord/fonts/DiscordFont;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getTextColor", "()I", "getTimestamp", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "copy", "copy-AFFcxXc", "(Ljava/lang/String;Ljava/lang/String;ILcom/discord/fonts/DiscordFont;)Lcom/discord/chat/presentation/message/messagepart/TimestampMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TimestampMessageAccessory extends MessageAccessory {
    private final DiscordFont discordFont;
    private final String messageId;
    private final int textColor;
    private final String timestamp;

    private TimestampMessageAccessory(String str, String str2, int i, DiscordFont discordFont) {
        super(str, "timestamp " + str2, null);
        this.messageId = str;
        this.timestamp = str2;
        this.textColor = i;
        this.discordFont = discordFont;
    }

    public /* synthetic */ TimestampMessageAccessory(String str, String str2, int i, DiscordFont discordFont, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, discordFont);
    }

    /* renamed from: copy-AFFcxXc$default  reason: not valid java name */
    public static /* synthetic */ TimestampMessageAccessory m41750copyAFFcxXc$default(TimestampMessageAccessory timestampMessageAccessory, String str, String str2, int i, DiscordFont discordFont, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = timestampMessageAccessory.mo41659getMessageId3Eiw7ao();
        }
        if ((i2 & 2) != 0) {
            str2 = timestampMessageAccessory.timestamp;
        }
        if ((i2 & 4) != 0) {
            i = timestampMessageAccessory.textColor;
        }
        if ((i2 & 8) != 0) {
            discordFont = timestampMessageAccessory.discordFont;
        }
        return timestampMessageAccessory.m41752copyAFFcxXc(str, str2, i, discordFont);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41751component13Eiw7ao() {
        return mo41659getMessageId3Eiw7ao();
    }

    public final String component2() {
        return this.timestamp;
    }

    public final int component3() {
        return this.textColor;
    }

    public final DiscordFont component4() {
        return this.discordFont;
    }

    /* renamed from: copy-AFFcxXc  reason: not valid java name */
    public final TimestampMessageAccessory m41752copyAFFcxXc(String messageId, String timestamp, int i, DiscordFont discordFont) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(timestamp, "timestamp");
        C9612q.m13917h(discordFont, "discordFont");
        return new TimestampMessageAccessory(messageId, timestamp, i, discordFont, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TimestampMessageAccessory) {
            TimestampMessageAccessory timestampMessageAccessory = (TimestampMessageAccessory) obj;
            return MessageId.m42077equalsimpl0(mo41659getMessageId3Eiw7ao(), timestampMessageAccessory.mo41659getMessageId3Eiw7ao()) && C9612q.m13922c(this.timestamp, timestampMessageAccessory.timestamp) && this.textColor == timestampMessageAccessory.textColor && this.discordFont == timestampMessageAccessory.discordFont;
        }
        return false;
    }

    public final DiscordFont getDiscordFont() {
        return this.discordFont;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41659getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((MessageId.m42078hashCodeimpl(mo41659getMessageId3Eiw7ao()) * 31) + this.timestamp.hashCode()) * 31) + this.textColor) * 31) + this.discordFont.hashCode();
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(mo41659getMessageId3Eiw7ao());
        String str = this.timestamp;
        int i = this.textColor;
        DiscordFont discordFont = this.discordFont;
        return "TimestampMessageAccessory(messageId=" + m42079toStringimpl + ", timestamp=" + str + ", textColor=" + i + ", discordFont=" + discordFont + ")";
    }
}
