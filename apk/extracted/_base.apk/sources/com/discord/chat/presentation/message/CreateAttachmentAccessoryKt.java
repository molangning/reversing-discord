package com.discord.chat.presentation.message;

import android.view.View;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.attachment.AttachmentType;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.FileAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.primitives.MessageFlag;
import com.discord.primitives.MessageFlagKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0000¨\u0006\u000b"}, m14357d2 = {"createAttachmentAccessory", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "Lcom/discord/chat/bridge/attachment/Attachment;", "message", "Lcom/discord/chat/bridge/Message;", "index", "", "constrainedWidth", "radiusPx", "onLongClick", "Landroid/view/View$OnLongClickListener;", "chat_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class CreateAttachmentAccessoryKt {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AttachmentType.values().length];
            try {
                iArr[AttachmentType.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttachmentType.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AttachmentType.File.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AttachmentType.Audio.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MessageAccessory createAttachmentAccessory(Attachment attachment, Message message, int i, int i2, int i3, View.OnLongClickListener onLongClickListener) {
        String m41436getId3Eiw7ao;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        FileAttachmentMessageAccessory fileAttachmentMessageAccessory;
        C9612q.m13917h(attachment, "<this>");
        C9612q.m13917h(message, "message");
        SpoilerAttributes forAttachment = SpoilerAttributes.Companion.forAttachment(attachment, message, i);
        if (!C9612q.m13922c(message.isCurrentUserMessageAuthor(), Boolean.TRUE) || (m41436getId3Eiw7ao = message.m41437getNonceN_6c4I0()) == null) {
            m41436getId3Eiw7ao = message.m41436getId3Eiw7ao();
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[attachment.type().ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        if (MessageFlagKt.hasMessageFlag(Long.valueOf(message.getFlags()), MessageFlag.IS_VOICE_MESSAGE)) {
                            return new AudioAttachmentMessageAccessory(m41436getId3Eiw7ao, message.m41433getAuthorIdwUX8bhU(), i, attachment, message.getAttachmentsOpacity(), null);
                        }
                        fileAttachmentMessageAccessory = new FileAttachmentMessageAccessory(m41436getId3Eiw7ao, i, attachment, forAttachment, attachment.getUploaderId(), attachment.getUploaderItemId(), message.getAttachmentsOpacity(), null);
                    } else {
                        throw new C11581q();
                    }
                } else {
                    fileAttachmentMessageAccessory = new FileAttachmentMessageAccessory(m41436getId3Eiw7ao, i, attachment, forAttachment, attachment.getUploaderId(), attachment.getUploaderItemId(), message.getAttachmentsOpacity(), null);
                }
                return fileAttachmentMessageAccessory;
            }
            Boolean useAttachmentGridLayout = message.getUseAttachmentGridLayout();
            if (useAttachmentGridLayout != null) {
                z3 = useAttachmentGridLayout.booleanValue();
            } else {
                z3 = false;
            }
            Boolean useAttachmentUploadPreview = message.getUseAttachmentUploadPreview();
            if (useAttachmentUploadPreview != null) {
                z4 = useAttachmentUploadPreview.booleanValue();
            } else {
                z4 = false;
            }
            if (z4 && attachment.getProgress() != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            return new VideoAttachmentMessageAccessory(m41436getId3Eiw7ao, i, attachment, i2, i3, forAttachment, onLongClickListener, z3, z5, message.getAttachmentsOpacity(), null);
        }
        Boolean useAttachmentGridLayout2 = message.getUseAttachmentGridLayout();
        if (useAttachmentGridLayout2 != null) {
            z = useAttachmentGridLayout2.booleanValue();
        } else {
            z = false;
        }
        Float attachmentsOpacity = message.getAttachmentsOpacity();
        Boolean showRemixButton = message.getShowRemixButton();
        if (showRemixButton != null) {
            z2 = showRemixButton.booleanValue();
        } else {
            z2 = false;
        }
        return new ImageAttachmentMessageAccessory(m41436getId3Eiw7ao, i, attachment, i2, i3, forAttachment, onLongClickListener, z, attachmentsOpacity, z2, false, message.getRemixButtonIconColor(), message.getRemixButtonBackgroundColor(), null);
    }
}
