package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.discord.chat.presentation.message.view.ImageAttachmentView;
import com.discord.chat.presentation.message.view.UploadContext;
import com.discord.primitives.MessageId;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J\u00ad\u0001\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001b0\u001aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, m14357d2 = {"Lcom/discord/chat/presentation/message/viewholder/ImageAttachmentViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/bridge/attachment/Attachment;", "attachment", "", "maxWidthPx", "maxHeightPx", "radiusPx", "Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;", ViewProps.RESIZE_MODE, "Landroid/view/View$OnClickListener;", "onClicked", "Landroid/view/View$OnLongClickListener;", "onLongClicked", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "spoilerConfig", "", "useNewAltTextButton", "", "attachmentsOpacity", "showRemixButton", "isPartOfMosaic", "remixButtonIconColor", "remixButtonBackgroundColor", "Lcom/discord/primitives/MessageId;", "messageId", "Lkotlin/Function1;", "", "onTapRemix", "bind-Nlw0kPk", "(Lcom/discord/chat/bridge/attachment/Attachment;IIILcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Lcom/discord/chat/bridge/spoiler/SpoilerConfig;ZLjava/lang/Float;ZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "bind", "Lcom/discord/chat/presentation/message/view/ImageAttachmentView;", "view", "Lcom/discord/chat/presentation/message/view/ImageAttachmentView;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "<init>", "(Lcom/discord/chat/presentation/message/view/ImageAttachmentView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ImageAttachmentViewHolder extends MessagePartViewHolder {
    private final ChatEventHandler eventHandler;
    private final ImageAttachmentView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAttachmentViewHolder(ImageAttachmentView view, ChatEventHandler eventHandler) {
        super(view, null);
        C9612q.m13917h(view, "view");
        C9612q.m13917h(eventHandler, "eventHandler");
        this.view = view;
        this.eventHandler = eventHandler;
    }

    /* renamed from: bind-Nlw0kPk */
    public final void m41798bindNlw0kPk(Attachment attachment, int i, int i2, int i3, MediaContainingViewResizer.ResizeMode resizeMode, View.OnClickListener onClicked, View.OnLongClickListener onLongClickListener, SpoilerConfig spoilerConfig, boolean z, Float f, boolean z2, boolean z3, Integer num, Integer num2, String str, Function1<? super MessageId, Unit> onTapRemix) {
        C9612q.m13917h(attachment, "attachment");
        C9612q.m13917h(resizeMode, "resizeMode");
        C9612q.m13917h(onClicked, "onClicked");
        C9612q.m13917h(onTapRemix, "onTapRemix");
        String uploaderId = attachment.getUploaderId();
        String uploaderItemId = attachment.getUploaderItemId();
        ImageAttachmentViewHolder$bind$onCancelUpload$1 imageAttachmentViewHolder$bind$onCancelUpload$1 = new ImageAttachmentViewHolder$bind$onCancelUpload$1(uploaderId, uploaderItemId, this);
        ImageAttachmentView imageAttachmentView = this.view;
        String url = attachment.getUrl();
        int width = attachment.getWidth();
        int height = attachment.getHeight();
        boolean isSpoiler = attachment.isSpoiler();
        Integer progress = attachment.getProgress();
        UploadContext uploadContext = new UploadContext(uploaderId, uploaderItemId);
        Boolean obscure = attachment.getObscure();
        boolean booleanValue = obscure != null ? obscure.booleanValue() : false;
        Boolean obscureAwaitingScan = attachment.getObscureAwaitingScan();
        imageAttachmentView.setContent(url, width, height, i2, i, resizeMode, isSpoiler, spoilerConfig, i3, progress, imageAttachmentViewHolder$bind$onCancelUpload$1, uploadContext, f, booleanValue, obscureAwaitingScan != null ? obscureAwaitingScan.booleanValue() : false, z3);
        boolean z4 = true;
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.view, false, onClicked, 1, null);
        if (onLongClickListener != null) {
            NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(this.view, false, onLongClickListener, 1, null);
        }
        this.view.setDescription(attachment.getDescription(), attachment.getHint());
        this.view.showAltTextButton(z && attachment.getShowDescription(), attachment.getDescription(), new ImageAttachmentViewHolder$bind$2(this.eventHandler));
        ImageAttachmentView imageAttachmentView2 = this.view;
        if (z || !attachment.getShowDescription()) {
            z4 = false;
        }
        imageAttachmentView2.showDescription(z4, attachment.getDescription());
        this.view.m41770maybeShowRemixButtoncUe2JkQ(z2, attachment.isSpoiler(), num, num2, str, onTapRemix);
        this.view.updateMarginStart(z2, attachment.isSpoiler(), z3);
        this.view.setRole(attachment.getRole());
    }
}