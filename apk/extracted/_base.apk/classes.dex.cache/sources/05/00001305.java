package com.discord.chat.presentation.message.messagepart;

import android.view.View;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b/\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bz\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0019\u0010.\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010!J\t\u00100\u001a\u00020\u000fHÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010:\u001a\u00020\u000fHÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010\u001cJ¢\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u0013\u0010?\u001a\u00020\u000f2\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020\u0005HÖ\u0001J\t\u0010C\u001a\u00020DHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u001fR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\b)\u0010'R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, m14357d2 = {"Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "attachmentIndex", "", "attachment", "Lcom/discord/chat/bridge/attachment/Attachment;", "constrainedWidth", "radiusPx", "spoilerAttributes", "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "onLongClick", "Landroid/view/View$OnLongClickListener;", "useNewAltTextButton", "", "attachmentsOpacity", "", "showRemixButton", "isPartOfMosaic", "remixButtonIconColor", "remixButtonBackgroundColor", "(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;ZLjava/lang/Float;ZZLjava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAttachment", "()Lcom/discord/chat/bridge/attachment/Attachment;", "getAttachmentIndex", "()I", "getAttachmentsOpacity", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getConstrainedWidth", "()Z", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getOnLongClick", "()Landroid/view/View$OnLongClickListener;", "getRadiusPx", "getRemixButtonBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRemixButtonIconColor", "getShowRemixButton", "getSpoilerAttributes", "()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "getUseNewAltTextButton", "component1", "component1-3Eiw7ao", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-JJXpD5M", "(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;ZLjava/lang/Float;ZZLjava/lang/Integer;Ljava/lang/Integer;)Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;", "equals", "other", "", "hashCode", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ImageAttachmentMessageAccessory extends MessageAccessory {
    private final Attachment attachment;
    private final int attachmentIndex;
    private final Float attachmentsOpacity;
    private final int constrainedWidth;
    private final boolean isPartOfMosaic;
    private final String messageId;
    private final View.OnLongClickListener onLongClick;
    private final int radiusPx;
    private final Integer remixButtonBackgroundColor;
    private final Integer remixButtonIconColor;
    private final boolean showRemixButton;
    private final SpoilerAttributes spoilerAttributes;
    private final boolean useNewAltTextButton;

    private ImageAttachmentMessageAccessory(String str, int i, Attachment attachment, int i2, int i3, SpoilerAttributes spoilerAttributes, View.OnLongClickListener onLongClickListener, boolean z, Float f, boolean z2, boolean z3, Integer num, Integer num2) {
        super(str, "image attachment " + i, null);
        this.messageId = str;
        this.attachmentIndex = i;
        this.attachment = attachment;
        this.constrainedWidth = i2;
        this.radiusPx = i3;
        this.spoilerAttributes = spoilerAttributes;
        this.onLongClick = onLongClickListener;
        this.useNewAltTextButton = z;
        this.attachmentsOpacity = f;
        this.showRemixButton = z2;
        this.isPartOfMosaic = z3;
        this.remixButtonIconColor = num;
        this.remixButtonBackgroundColor = num2;
    }

    public /* synthetic */ ImageAttachmentMessageAccessory(String str, int i, Attachment attachment, int i2, int i3, SpoilerAttributes spoilerAttributes, View.OnLongClickListener onLongClickListener, boolean z, Float f, boolean z2, boolean z3, Integer num, Integer num2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, attachment, i2, i3, spoilerAttributes, onLongClickListener, z, f, z2, z3, num, num2);
    }

    /* renamed from: component1-3Eiw7ao */
    public final String m41705component13Eiw7ao() {
        return mo41659getMessageId3Eiw7ao();
    }

    public final boolean component10() {
        return this.showRemixButton;
    }

    public final boolean component11() {
        return this.isPartOfMosaic;
    }

    public final Integer component12() {
        return this.remixButtonIconColor;
    }

    public final Integer component13() {
        return this.remixButtonBackgroundColor;
    }

    public final int component2() {
        return this.attachmentIndex;
    }

    public final Attachment component3() {
        return this.attachment;
    }

    public final int component4() {
        return this.constrainedWidth;
    }

    public final int component5() {
        return this.radiusPx;
    }

    public final SpoilerAttributes component6() {
        return this.spoilerAttributes;
    }

    public final View.OnLongClickListener component7() {
        return this.onLongClick;
    }

    public final boolean component8() {
        return this.useNewAltTextButton;
    }

    public final Float component9() {
        return this.attachmentsOpacity;
    }

    /* renamed from: copy-JJXpD5M */
    public final ImageAttachmentMessageAccessory m41706copyJJXpD5M(String messageId, int i, Attachment attachment, int i2, int i3, SpoilerAttributes spoilerAttributes, View.OnLongClickListener onLongClickListener, boolean z, Float f, boolean z2, boolean z3, Integer num, Integer num2) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(attachment, "attachment");
        return new ImageAttachmentMessageAccessory(messageId, i, attachment, i2, i3, spoilerAttributes, onLongClickListener, z, f, z2, z3, num, num2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageAttachmentMessageAccessory) {
            ImageAttachmentMessageAccessory imageAttachmentMessageAccessory = (ImageAttachmentMessageAccessory) obj;
            return MessageId.m42077equalsimpl0(mo41659getMessageId3Eiw7ao(), imageAttachmentMessageAccessory.mo41659getMessageId3Eiw7ao()) && this.attachmentIndex == imageAttachmentMessageAccessory.attachmentIndex && C9612q.m13922c(this.attachment, imageAttachmentMessageAccessory.attachment) && this.constrainedWidth == imageAttachmentMessageAccessory.constrainedWidth && this.radiusPx == imageAttachmentMessageAccessory.radiusPx && C9612q.m13922c(this.spoilerAttributes, imageAttachmentMessageAccessory.spoilerAttributes) && C9612q.m13922c(this.onLongClick, imageAttachmentMessageAccessory.onLongClick) && this.useNewAltTextButton == imageAttachmentMessageAccessory.useNewAltTextButton && C9612q.m13922c(this.attachmentsOpacity, imageAttachmentMessageAccessory.attachmentsOpacity) && this.showRemixButton == imageAttachmentMessageAccessory.showRemixButton && this.isPartOfMosaic == imageAttachmentMessageAccessory.isPartOfMosaic && C9612q.m13922c(this.remixButtonIconColor, imageAttachmentMessageAccessory.remixButtonIconColor) && C9612q.m13922c(this.remixButtonBackgroundColor, imageAttachmentMessageAccessory.remixButtonBackgroundColor);
        }
        return false;
    }

    public final Attachment getAttachment() {
        return this.attachment;
    }

    public final int getAttachmentIndex() {
        return this.attachmentIndex;
    }

    public final Float getAttachmentsOpacity() {
        return this.attachmentsOpacity;
    }

    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41659getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final View.OnLongClickListener getOnLongClick() {
        return this.onLongClick;
    }

    public final int getRadiusPx() {
        return this.radiusPx;
    }

    public final Integer getRemixButtonBackgroundColor() {
        return this.remixButtonBackgroundColor;
    }

    public final Integer getRemixButtonIconColor() {
        return this.remixButtonIconColor;
    }

    public final boolean getShowRemixButton() {
        return this.showRemixButton;
    }

    public final SpoilerAttributes getSpoilerAttributes() {
        return this.spoilerAttributes;
    }

    public final boolean getUseNewAltTextButton() {
        return this.useNewAltTextButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m42078hashCodeimpl = ((((((((MessageId.m42078hashCodeimpl(mo41659getMessageId3Eiw7ao()) * 31) + this.attachmentIndex) * 31) + this.attachment.hashCode()) * 31) + this.constrainedWidth) * 31) + this.radiusPx) * 31;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        int hashCode = (m42078hashCodeimpl + (spoilerAttributes == null ? 0 : spoilerAttributes.hashCode())) * 31;
        View.OnLongClickListener onLongClickListener = this.onLongClick;
        int hashCode2 = (hashCode + (onLongClickListener == null ? 0 : onLongClickListener.hashCode())) * 31;
        boolean z = this.useNewAltTextButton;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        Float f = this.attachmentsOpacity;
        int hashCode3 = (i2 + (f == null ? 0 : f.hashCode())) * 31;
        boolean z2 = this.showRemixButton;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode3 + i3) * 31;
        boolean z3 = this.isPartOfMosaic;
        int i5 = (i4 + (z3 ? 1 : z3 ? 1 : 0)) * 31;
        Integer num = this.remixButtonIconColor;
        int hashCode4 = (i5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.remixButtonBackgroundColor;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final boolean isPartOfMosaic() {
        return this.isPartOfMosaic;
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(mo41659getMessageId3Eiw7ao());
        int i = this.attachmentIndex;
        Attachment attachment = this.attachment;
        int i2 = this.constrainedWidth;
        int i3 = this.radiusPx;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        View.OnLongClickListener onLongClickListener = this.onLongClick;
        boolean z = this.useNewAltTextButton;
        Float f = this.attachmentsOpacity;
        boolean z2 = this.showRemixButton;
        boolean z3 = this.isPartOfMosaic;
        Integer num = this.remixButtonIconColor;
        Integer num2 = this.remixButtonBackgroundColor;
        return "ImageAttachmentMessageAccessory(messageId=" + m42079toStringimpl + ", attachmentIndex=" + i + ", attachment=" + attachment + ", constrainedWidth=" + i2 + ", radiusPx=" + i3 + ", spoilerAttributes=" + spoilerAttributes + ", onLongClick=" + onLongClickListener + ", useNewAltTextButton=" + z + ", attachmentsOpacity=" + f + ", showRemixButton=" + z2 + ", isPartOfMosaic=" + z3 + ", remixButtonIconColor=" + num + ", remixButtonBackgroundColor=" + num2 + ")";
    }
}