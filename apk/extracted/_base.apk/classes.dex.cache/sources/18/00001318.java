package com.discord.chat.presentation.message.messagepart;

import android.view.View;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.presentation.media.PortalUiModel;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B^\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0019\u0010(\u001a\u00020\u0004HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010 J\u0010\u0010*\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00101\u001a\u00020\u0010HÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\u0080\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020\u0006HÖ\u0001J\t\u0010:\u001a\u00020;HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u001f\u0010\u0003\u001a\u00020\u0004X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, m14357d2 = {"Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "Lcom/discord/chat/presentation/media/PortalUiModel;", "messageId", "Lcom/discord/primitives/MessageId;", "index", "", "attachment", "Lcom/discord/chat/bridge/attachment/Attachment;", "constrainedWidth", "radiusPx", "spoilerAttributes", "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "onLongClick", "Landroid/view/View$OnLongClickListener;", "useNewAltTextButton", "", "hideMediaPlayButton", "attachmentsOpacity", "", "(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;ZZLjava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAttachment", "()Lcom/discord/chat/bridge/attachment/Attachment;", "getAttachmentsOpacity", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getConstrainedWidth", "()I", "getHideMediaPlayButton", "()Z", "getIndex", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getOnLongClick", "()Landroid/view/View$OnLongClickListener;", "getRadiusPx", "getSpoilerAttributes", "()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "getUseNewAltTextButton", "component1", "component1-3Eiw7ao", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-a6FnO-k", "(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;ZZLjava/lang/Float;)Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;", "equals", "other", "", "hashCode", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class VideoAttachmentMessageAccessory extends MessageAccessory implements PortalUiModel {
    private final Attachment attachment;
    private final Float attachmentsOpacity;
    private final int constrainedWidth;
    private final boolean hideMediaPlayButton;
    private final int index;
    private final String messageId;
    private final View.OnLongClickListener onLongClick;
    private final int radiusPx;
    private final SpoilerAttributes spoilerAttributes;
    private final boolean useNewAltTextButton;

    private VideoAttachmentMessageAccessory(String str, int i, Attachment attachment, int i2, int i3, SpoilerAttributes spoilerAttributes, View.OnLongClickListener onLongClickListener, boolean z, boolean z2, Float f) {
        super(str, "video attachment " + i, null);
        this.messageId = str;
        this.index = i;
        this.attachment = attachment;
        this.constrainedWidth = i2;
        this.radiusPx = i3;
        this.spoilerAttributes = spoilerAttributes;
        this.onLongClick = onLongClickListener;
        this.useNewAltTextButton = z;
        this.hideMediaPlayButton = z2;
        this.attachmentsOpacity = f;
    }

    public /* synthetic */ VideoAttachmentMessageAccessory(String str, int i, Attachment attachment, int i2, int i3, SpoilerAttributes spoilerAttributes, View.OnLongClickListener onLongClickListener, boolean z, boolean z2, Float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, attachment, i2, i3, spoilerAttributes, onLongClickListener, z, z2, f);
    }

    /* renamed from: component1-3Eiw7ao */
    public final String m41757component13Eiw7ao() {
        return mo41659getMessageId3Eiw7ao();
    }

    public final Float component10() {
        return this.attachmentsOpacity;
    }

    public final int component2() {
        return getIndex();
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

    public final boolean component9() {
        return this.hideMediaPlayButton;
    }

    /* renamed from: copy-a6FnO-k */
    public final VideoAttachmentMessageAccessory m41758copya6FnOk(String messageId, int i, Attachment attachment, int i2, int i3, SpoilerAttributes spoilerAttributes, View.OnLongClickListener onLongClickListener, boolean z, boolean z2, Float f) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(attachment, "attachment");
        return new VideoAttachmentMessageAccessory(messageId, i, attachment, i2, i3, spoilerAttributes, onLongClickListener, z, z2, f, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoAttachmentMessageAccessory) {
            VideoAttachmentMessageAccessory videoAttachmentMessageAccessory = (VideoAttachmentMessageAccessory) obj;
            return MessageId.m42077equalsimpl0(mo41659getMessageId3Eiw7ao(), videoAttachmentMessageAccessory.mo41659getMessageId3Eiw7ao()) && getIndex() == videoAttachmentMessageAccessory.getIndex() && C9612q.m13922c(this.attachment, videoAttachmentMessageAccessory.attachment) && this.constrainedWidth == videoAttachmentMessageAccessory.constrainedWidth && this.radiusPx == videoAttachmentMessageAccessory.radiusPx && C9612q.m13922c(this.spoilerAttributes, videoAttachmentMessageAccessory.spoilerAttributes) && C9612q.m13922c(this.onLongClick, videoAttachmentMessageAccessory.onLongClick) && this.useNewAltTextButton == videoAttachmentMessageAccessory.useNewAltTextButton && this.hideMediaPlayButton == videoAttachmentMessageAccessory.hideMediaPlayButton && C9612q.m13922c(this.attachmentsOpacity, videoAttachmentMessageAccessory.attachmentsOpacity);
        }
        return false;
    }

    public final Attachment getAttachment() {
        return this.attachment;
    }

    public final Float getAttachmentsOpacity() {
        return this.attachmentsOpacity;
    }

    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    public final boolean getHideMediaPlayButton() {
        return this.hideMediaPlayButton;
    }

    @Override // com.discord.chat.presentation.media.PortalUiModel
    public int getIndex() {
        return this.index;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41659getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final View.OnLongClickListener getOnLongClick() {
        return this.onLongClick;
    }

    @Override // com.discord.chat.presentation.media.PortalUiModel
    public double getPortal() {
        return PortalUiModel.DefaultImpls.getPortal(this);
    }

    public final int getRadiusPx() {
        return this.radiusPx;
    }

    public final SpoilerAttributes getSpoilerAttributes() {
        return this.spoilerAttributes;
    }

    public final boolean getUseNewAltTextButton() {
        return this.useNewAltTextButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m42078hashCodeimpl = ((((((((MessageId.m42078hashCodeimpl(mo41659getMessageId3Eiw7ao()) * 31) + getIndex()) * 31) + this.attachment.hashCode()) * 31) + this.constrainedWidth) * 31) + this.radiusPx) * 31;
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
        boolean z2 = this.hideMediaPlayButton;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        Float f = this.attachmentsOpacity;
        return i3 + (f != null ? f.hashCode() : 0);
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(mo41659getMessageId3Eiw7ao());
        int index = getIndex();
        Attachment attachment = this.attachment;
        int i = this.constrainedWidth;
        int i2 = this.radiusPx;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        View.OnLongClickListener onLongClickListener = this.onLongClick;
        boolean z = this.useNewAltTextButton;
        boolean z2 = this.hideMediaPlayButton;
        Float f = this.attachmentsOpacity;
        return "VideoAttachmentMessageAccessory(messageId=" + m42079toStringimpl + ", index=" + index + ", attachment=" + attachment + ", constrainedWidth=" + i + ", radiusPx=" + i2 + ", spoilerAttributes=" + spoilerAttributes + ", onLongClick=" + onLongClickListener + ", useNewAltTextButton=" + z + ", hideMediaPlayButton=" + z2 + ", attachmentsOpacity=" + f + ")";
    }
}