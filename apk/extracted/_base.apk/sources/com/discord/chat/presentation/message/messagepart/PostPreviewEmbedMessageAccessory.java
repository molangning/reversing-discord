package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B,\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\u0014\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J@\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, m14357d2 = {"Lcom/discord/chat/presentation/message/messagepart/PostPreviewEmbedMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "postPreviewEmbed", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "index", "", "spoilerAttributes", "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "(Ljava/lang/String;Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;ILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIndex", "()I", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getPostPreviewEmbed", "()Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "getSpoilerAttributes", "()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "copy", "copy-AFFcxXc", "(Ljava/lang/String;Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;ILcom/discord/chat/bridge/spoiler/SpoilerAttributes;)Lcom/discord/chat/presentation/message/messagepart/PostPreviewEmbedMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PostPreviewEmbedMessageAccessory extends MessageAccessory {
    private final int index;
    private final String messageId;
    private final PostPreviewEmbed postPreviewEmbed;
    private final SpoilerAttributes spoilerAttributes;

    public /* synthetic */ PostPreviewEmbedMessageAccessory(String str, PostPreviewEmbed postPreviewEmbed, int i, SpoilerAttributes spoilerAttributes, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, postPreviewEmbed, i, (i2 & 8) != 0 ? null : spoilerAttributes, null);
    }

    public /* synthetic */ PostPreviewEmbedMessageAccessory(String str, PostPreviewEmbed postPreviewEmbed, int i, SpoilerAttributes spoilerAttributes, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, postPreviewEmbed, i, spoilerAttributes);
    }

    /* renamed from: copy-AFFcxXc$default  reason: not valid java name */
    public static /* synthetic */ PostPreviewEmbedMessageAccessory m41729copyAFFcxXc$default(PostPreviewEmbedMessageAccessory postPreviewEmbedMessageAccessory, String str, PostPreviewEmbed postPreviewEmbed, int i, SpoilerAttributes spoilerAttributes, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = postPreviewEmbedMessageAccessory.mo41659getMessageId3Eiw7ao();
        }
        if ((i2 & 2) != 0) {
            postPreviewEmbed = postPreviewEmbedMessageAccessory.postPreviewEmbed;
        }
        if ((i2 & 4) != 0) {
            i = postPreviewEmbedMessageAccessory.index;
        }
        if ((i2 & 8) != 0) {
            spoilerAttributes = postPreviewEmbedMessageAccessory.spoilerAttributes;
        }
        return postPreviewEmbedMessageAccessory.m41731copyAFFcxXc(str, postPreviewEmbed, i, spoilerAttributes);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41730component13Eiw7ao() {
        return mo41659getMessageId3Eiw7ao();
    }

    public final PostPreviewEmbed component2() {
        return this.postPreviewEmbed;
    }

    public final int component3() {
        return this.index;
    }

    public final SpoilerAttributes component4() {
        return this.spoilerAttributes;
    }

    /* renamed from: copy-AFFcxXc  reason: not valid java name */
    public final PostPreviewEmbedMessageAccessory m41731copyAFFcxXc(String messageId, PostPreviewEmbed postPreviewEmbed, int i, SpoilerAttributes spoilerAttributes) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(postPreviewEmbed, "postPreviewEmbed");
        return new PostPreviewEmbedMessageAccessory(messageId, postPreviewEmbed, i, spoilerAttributes, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PostPreviewEmbedMessageAccessory) {
            PostPreviewEmbedMessageAccessory postPreviewEmbedMessageAccessory = (PostPreviewEmbedMessageAccessory) obj;
            return MessageId.m42077equalsimpl0(mo41659getMessageId3Eiw7ao(), postPreviewEmbedMessageAccessory.mo41659getMessageId3Eiw7ao()) && C9612q.m13922c(this.postPreviewEmbed, postPreviewEmbedMessageAccessory.postPreviewEmbed) && this.index == postPreviewEmbedMessageAccessory.index && C9612q.m13922c(this.spoilerAttributes, postPreviewEmbedMessageAccessory.spoilerAttributes);
        }
        return false;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41659getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final PostPreviewEmbed getPostPreviewEmbed() {
        return this.postPreviewEmbed;
    }

    public final SpoilerAttributes getSpoilerAttributes() {
        return this.spoilerAttributes;
    }

    public int hashCode() {
        int m42078hashCodeimpl = ((((MessageId.m42078hashCodeimpl(mo41659getMessageId3Eiw7ao()) * 31) + this.postPreviewEmbed.hashCode()) * 31) + this.index) * 31;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        return m42078hashCodeimpl + (spoilerAttributes == null ? 0 : spoilerAttributes.hashCode());
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(mo41659getMessageId3Eiw7ao());
        PostPreviewEmbed postPreviewEmbed = this.postPreviewEmbed;
        int i = this.index;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        return "PostPreviewEmbedMessageAccessory(messageId=" + m42079toStringimpl + ", postPreviewEmbed=" + postPreviewEmbed + ", index=" + i + ", spoilerAttributes=" + spoilerAttributes + ")";
    }

    private PostPreviewEmbedMessageAccessory(String str, PostPreviewEmbed postPreviewEmbed, int i, SpoilerAttributes spoilerAttributes) {
        super(str, "post preview embed " + i, null);
        this.messageId = str;
        this.postPreviewEmbed = postPreviewEmbed;
        this.index = i;
        this.spoilerAttributes = spoilerAttributes;
    }
}
