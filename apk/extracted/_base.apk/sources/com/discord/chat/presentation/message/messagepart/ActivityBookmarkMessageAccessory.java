package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.codedlinks.ActivityBookmarkEmbedImpl;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0019\u0010\u0012\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, m14357d2 = {"Lcom/discord/chat/presentation/message/messagepart/ActivityBookmarkMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "codedLinkIndex", "", "activityBookmarkEmbed", "Lcom/discord/chat/bridge/codedlinks/ActivityBookmarkEmbedImpl;", "constrainedWidth", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/ActivityBookmarkEmbedImpl;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getActivityBookmarkEmbed", "()Lcom/discord/chat/bridge/codedlinks/ActivityBookmarkEmbedImpl;", "getCodedLinkIndex", "()I", "getConstrainedWidth", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "copy", "copy-AFFcxXc", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/ActivityBookmarkEmbedImpl;I)Lcom/discord/chat/presentation/message/messagepart/ActivityBookmarkMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ActivityBookmarkMessageAccessory extends MessageAccessory {
    private final ActivityBookmarkEmbedImpl activityBookmarkEmbed;
    private final int codedLinkIndex;
    private final int constrainedWidth;
    private final String messageId;

    private ActivityBookmarkMessageAccessory(String str, int i, ActivityBookmarkEmbedImpl activityBookmarkEmbedImpl, int i2) {
        super(str, "activity launcher " + i, null);
        this.messageId = str;
        this.codedLinkIndex = i;
        this.activityBookmarkEmbed = activityBookmarkEmbedImpl;
        this.constrainedWidth = i2;
    }

    public /* synthetic */ ActivityBookmarkMessageAccessory(String str, int i, ActivityBookmarkEmbedImpl activityBookmarkEmbedImpl, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, activityBookmarkEmbedImpl, i2);
    }

    /* renamed from: copy-AFFcxXc$default  reason: not valid java name */
    public static /* synthetic */ ActivityBookmarkMessageAccessory m41656copyAFFcxXc$default(ActivityBookmarkMessageAccessory activityBookmarkMessageAccessory, String str, int i, ActivityBookmarkEmbedImpl activityBookmarkEmbedImpl, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = activityBookmarkMessageAccessory.mo41659getMessageId3Eiw7ao();
        }
        if ((i3 & 2) != 0) {
            i = activityBookmarkMessageAccessory.codedLinkIndex;
        }
        if ((i3 & 4) != 0) {
            activityBookmarkEmbedImpl = activityBookmarkMessageAccessory.activityBookmarkEmbed;
        }
        if ((i3 & 8) != 0) {
            i2 = activityBookmarkMessageAccessory.constrainedWidth;
        }
        return activityBookmarkMessageAccessory.m41658copyAFFcxXc(str, i, activityBookmarkEmbedImpl, i2);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41657component13Eiw7ao() {
        return mo41659getMessageId3Eiw7ao();
    }

    public final int component2() {
        return this.codedLinkIndex;
    }

    public final ActivityBookmarkEmbedImpl component3() {
        return this.activityBookmarkEmbed;
    }

    public final int component4() {
        return this.constrainedWidth;
    }

    /* renamed from: copy-AFFcxXc  reason: not valid java name */
    public final ActivityBookmarkMessageAccessory m41658copyAFFcxXc(String messageId, int i, ActivityBookmarkEmbedImpl activityBookmarkEmbed, int i2) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(activityBookmarkEmbed, "activityBookmarkEmbed");
        return new ActivityBookmarkMessageAccessory(messageId, i, activityBookmarkEmbed, i2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivityBookmarkMessageAccessory) {
            ActivityBookmarkMessageAccessory activityBookmarkMessageAccessory = (ActivityBookmarkMessageAccessory) obj;
            return MessageId.m42077equalsimpl0(mo41659getMessageId3Eiw7ao(), activityBookmarkMessageAccessory.mo41659getMessageId3Eiw7ao()) && this.codedLinkIndex == activityBookmarkMessageAccessory.codedLinkIndex && C9612q.m13922c(this.activityBookmarkEmbed, activityBookmarkMessageAccessory.activityBookmarkEmbed) && this.constrainedWidth == activityBookmarkMessageAccessory.constrainedWidth;
        }
        return false;
    }

    public final ActivityBookmarkEmbedImpl getActivityBookmarkEmbed() {
        return this.activityBookmarkEmbed;
    }

    public final int getCodedLinkIndex() {
        return this.codedLinkIndex;
    }

    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao  reason: not valid java name */
    public String mo41659getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (((((MessageId.m42078hashCodeimpl(mo41659getMessageId3Eiw7ao()) * 31) + this.codedLinkIndex) * 31) + this.activityBookmarkEmbed.hashCode()) * 31) + this.constrainedWidth;
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(mo41659getMessageId3Eiw7ao());
        int i = this.codedLinkIndex;
        ActivityBookmarkEmbedImpl activityBookmarkEmbedImpl = this.activityBookmarkEmbed;
        int i2 = this.constrainedWidth;
        return "ActivityBookmarkMessageAccessory(messageId=" + m42079toStringimpl + ", codedLinkIndex=" + i + ", activityBookmarkEmbed=" + activityBookmarkEmbedImpl + ", constrainedWidth=" + i2 + ")";
    }
}
