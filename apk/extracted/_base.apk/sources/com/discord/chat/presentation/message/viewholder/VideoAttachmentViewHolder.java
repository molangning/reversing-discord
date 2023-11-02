package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.chat.presentation.message.view.UploadContext;
import com.discord.chat.presentation.message.view.VideoAttachmentView;
import com.discord.react_asset_fetcher.ReactAsset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0087\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\b0\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m14357d2 = {"Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "view", "Lcom/discord/chat/presentation/message/view/VideoAttachmentView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "(Lcom/discord/chat/presentation/message/view/VideoAttachmentView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "bind", "", "videoAttachmentItem", "Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;", "maxWidthPx", "", "maxHeightPx", "radiusPx", "onClicked", "Lkotlin/Function1;", "", "onLongClicked", "Landroid/view/View$OnLongClickListener;", "spoilerConfig", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "portal", "canPlayInline", "", "useNewAltTextButton", "hideMediaPlayButton", "attachmentsOpacity", "", "isPartOfMosaic", "(Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;IIILkotlin/jvm/functions/Function1;Landroid/view/View$OnLongClickListener;Lcom/discord/chat/bridge/spoiler/SpoilerConfig;DZZZLjava/lang/Float;Z)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class VideoAttachmentViewHolder extends MessagePartViewHolder {
    private final ChatEventHandler eventHandler;
    private final VideoAttachmentView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoAttachmentViewHolder(VideoAttachmentView view, ChatEventHandler eventHandler) {
        super(view, null);
        C9612q.m13917h(view, "view");
        C9612q.m13917h(eventHandler, "eventHandler");
        this.view = view;
        this.eventHandler = eventHandler;
    }

    public final void bind(VideoAttachmentMessageAccessory videoAttachmentItem, int i, int i2, int i3, Function1<? super Double, Unit> onClicked, View.OnLongClickListener onLongClickListener, SpoilerConfig spoilerConfig, double d, boolean z, boolean z2, boolean z3, Float f, boolean z4) {
        C9612q.m13917h(videoAttachmentItem, "videoAttachmentItem");
        C9612q.m13917h(onClicked, "onClicked");
        Attachment attachment = videoAttachmentItem.getAttachment();
        String uploaderId = attachment.getUploaderId();
        String uploaderItemId = attachment.getUploaderItemId();
        VideoAttachmentViewHolder$bind$onCancelUpload$1 videoAttachmentViewHolder$bind$onCancelUpload$1 = new VideoAttachmentViewHolder$bind$onCancelUpload$1(uploaderId, uploaderItemId, this);
        VideoAttachmentView videoAttachmentView = this.view;
        String videoUrl = attachment.getVideoUrl();
        C9612q.m13920e(videoUrl);
        String url = attachment.getUrl();
        int width = attachment.getWidth();
        int height = attachment.getHeight();
        boolean isSpoiler = attachment.isSpoiler();
        Integer progress = attachment.getProgress();
        UploadContext uploadContext = new UploadContext(uploaderId, uploaderItemId);
        String attachmentTagText = attachment.getAttachmentTagText();
        ReactAsset attachmentTagIcon = attachment.getAttachmentTagIcon();
        Integer attachmentTagBackgroundColor = attachment.getAttachmentTagBackgroundColor();
        Integer attachmentTagTextColor = attachment.getAttachmentTagTextColor();
        Boolean obscure = attachment.getObscure();
        boolean z5 = false;
        boolean booleanValue = obscure != null ? obscure.booleanValue() : false;
        Boolean obscureAwaitingScan = attachment.getObscureAwaitingScan();
        videoAttachmentView.setContent(videoUrl, url, width, height, i, i2, i3, isSpoiler, spoilerConfig, d, z, progress, z3, videoAttachmentViewHolder$bind$onCancelUpload$1, uploadContext, f, attachmentTagText, attachmentTagIcon, attachmentTagBackgroundColor, attachmentTagTextColor, booleanValue, obscureAwaitingScan != null ? obscureAwaitingScan.booleanValue() : false, z4);
        this.view.setDescription(attachment.getDescription(), attachment.getHint());
        this.view.showAltTextButton(z2 && attachment.getShowDescription(), attachment.getDescription(), new VideoAttachmentViewHolder$bind$1(this.eventHandler));
        VideoAttachmentView videoAttachmentView2 = this.view;
        if (!z2 && attachment.getShowDescription()) {
            z5 = true;
        }
        videoAttachmentView2.showDescription(z5, attachment.getDescription());
        this.view.setRole(attachment.getRole());
        this.view.setOnMediaClickListeners(onClicked, onLongClickListener);
    }
}
