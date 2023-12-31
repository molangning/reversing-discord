package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridLayout;
import com.discord.chat.C2912R;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.chat.presentation.message.viewholder.ImageAttachmentViewHolder;
import com.discord.chat.presentation.message.viewholder.ImageAttachmentViewHolder$bind$1;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import com.discord.chat.presentation.message.viewholder.VideoAttachmentViewHolder;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p304qf.C11880m;

@Metadata(m14358d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010!\u001a\u00020 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002JX\u0010\u0017\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u00132\u001e\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u0015R\u0014\u0010\u0018\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n0\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR.\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u001f¨\u0006&"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/MediaMosaicView;", "Landroid/widget/GridLayout;", "", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "attachments", "", "shouldOnlyUpdateBindings", "attachment", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "createAttachmentHolder", "holder", "", "maxWidthPx", "maxHeightPx", "", "bindAttachmentHolder", "constrainedWidth", "Lkotlin/Function1;", "onAttachmentSpoilerClicked", "Lkotlin/Function3;", "onAttachmentClicked", "setAttachments", "spacingPx", "I", "", "", "attachmentHolders", "Ljava/util/Map;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function3;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MediaMosaicView extends GridLayout {
    private Map<Long, MessagePartViewHolder> attachmentHolders;
    private int constrainedWidth;
    private Function3<? super Integer, ? super MessageAccessory, ? super MessagePartViewHolder, Unit> onAttachmentClicked;
    private Function1<? super Integer, Unit> onAttachmentSpoilerClicked;
    private final int spacingPx;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaMosaicView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ MediaMosaicView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void bindAttachmentHolder(final MessagePartViewHolder messagePartViewHolder, MessageAccessory messageAccessory, int i, int i2) {
        SpoilerConfig spoilerConfig = null;
        if (messagePartViewHolder instanceof ImageAttachmentViewHolder) {
            C9612q.m13919f(messageAccessory, "null cannot be cast to non-null type com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory");
            final ImageAttachmentMessageAccessory imageAttachmentMessageAccessory = (ImageAttachmentMessageAccessory) messageAccessory;
            ImageAttachmentViewHolder imageAttachmentViewHolder = (ImageAttachmentViewHolder) messagePartViewHolder;
            Attachment attachment = imageAttachmentMessageAccessory.getAttachment();
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MediaMosaicView.bindAttachmentHolder$lambda$1(MediaMosaicView.this, imageAttachmentMessageAccessory, messagePartViewHolder, view);
                }
            };
            int radiusPx = imageAttachmentMessageAccessory.getRadiusPx();
            MediaContainingViewResizer.ResizeMode resizeMode = MediaContainingViewResizer.ResizeMode.Cover;
            View.OnLongClickListener onLongClick = imageAttachmentMessageAccessory.getOnLongClick();
            SpoilerAttributes spoilerAttributes = imageAttachmentMessageAccessory.getSpoilerAttributes();
            if (spoilerAttributes != null) {
                spoilerConfig = spoilerAttributes.configure(new MediaMosaicView$bindAttachmentHolder$2(this, imageAttachmentMessageAccessory));
            }
            imageAttachmentViewHolder.m41798bindNlw0kPk(attachment, i, i2, radiusPx, resizeMode, onClickListener, onLongClick, spoilerConfig, true, imageAttachmentMessageAccessory.getAttachmentsOpacity(), false, true, imageAttachmentMessageAccessory.getRemixButtonIconColor(), imageAttachmentMessageAccessory.getRemixButtonBackgroundColor(), imageAttachmentMessageAccessory.mo41659getMessageId3Eiw7ao(), (r35 & 32768) != 0 ? ImageAttachmentViewHolder$bind$1.INSTANCE : null);
        } else if (messagePartViewHolder instanceof VideoAttachmentViewHolder) {
            C9612q.m13919f(messageAccessory, "null cannot be cast to non-null type com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory");
            VideoAttachmentMessageAccessory videoAttachmentMessageAccessory = (VideoAttachmentMessageAccessory) messageAccessory;
            VideoAttachmentViewHolder videoAttachmentViewHolder = (VideoAttachmentViewHolder) messagePartViewHolder;
            int radiusPx2 = videoAttachmentMessageAccessory.getRadiusPx();
            MediaMosaicView$bindAttachmentHolder$3 mediaMosaicView$bindAttachmentHolder$3 = new MediaMosaicView$bindAttachmentHolder$3(this, videoAttachmentMessageAccessory, messagePartViewHolder);
            View.OnLongClickListener onLongClick2 = videoAttachmentMessageAccessory.getOnLongClick();
            SpoilerAttributes spoilerAttributes2 = videoAttachmentMessageAccessory.getSpoilerAttributes();
            if (spoilerAttributes2 != null) {
                spoilerConfig = spoilerAttributes2.configure(new MediaMosaicView$bindAttachmentHolder$4(this, videoAttachmentMessageAccessory));
            }
            videoAttachmentViewHolder.bind(videoAttachmentMessageAccessory, i, i2, radiusPx2, mediaMosaicView$bindAttachmentHolder$3, onLongClick2, spoilerConfig, videoAttachmentMessageAccessory.getPortal(), false, true, videoAttachmentMessageAccessory.getHideMediaPlayButton(), videoAttachmentMessageAccessory.getAttachmentsOpacity(), true);
        } else {
            throw new IllegalStateException(("Invalid accessory type: " + messagePartViewHolder).toString());
        }
    }

    public static final void bindAttachmentHolder$lambda$1(MediaMosaicView this$0, ImageAttachmentMessageAccessory item, MessagePartViewHolder holder, View view) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(item, "$item");
        C9612q.m13917h(holder, "$holder");
        Function3<? super Integer, ? super MessageAccessory, ? super MessagePartViewHolder, Unit> function3 = this$0.onAttachmentClicked;
        if (function3 == null) {
            C9612q.m13900y("onAttachmentClicked");
            function3 = null;
        }
        function3.invoke(Integer.valueOf(item.getAttachmentIndex()), item, holder);
    }

    private final MessagePartViewHolder createAttachmentHolder(MessageAccessory messageAccessory, ChatEventHandler chatEventHandler) {
        if (messageAccessory instanceof ImageAttachmentMessageAccessory) {
            Context context = getContext();
            C9612q.m13918g(context, "context");
            return new ImageAttachmentViewHolder(new ImageAttachmentView(context, null, 2, null), chatEventHandler);
        } else if (messageAccessory instanceof VideoAttachmentMessageAccessory) {
            Context context2 = getContext();
            C9612q.m13918g(context2, "context");
            return new VideoAttachmentViewHolder(new VideoAttachmentView(context2, null, 2, null), chatEventHandler);
        } else {
            throw new IllegalStateException(("Invalid accessory type: " + messageAccessory).toString());
        }
    }

    private final boolean shouldOnlyUpdateBindings(List<? extends MessageAccessory> list) {
        int m14093t;
        Set m14071G0;
        Set m14071G02;
        m14093t = C9546k.m14093t(list, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (MessageAccessory messageAccessory : list) {
            arrayList.add(Long.valueOf(messageAccessory.getItemId().longValue()));
        }
        m14071G0 = C9553r.m14071G0(arrayList);
        Map<Long, MessagePartViewHolder> map = this.attachmentHolders;
        if (map == null) {
            C9612q.m13900y("attachmentHolders");
            map = null;
        }
        m14071G02 = C9553r.m14071G0(map.keySet());
        return m14071G0.equals(m14071G02);
    }

    public final void setAttachments(List<? extends MessageAccessory> attachments, int i, ChatEventHandler eventHandler, Function1<? super Integer, Unit> onAttachmentSpoilerClicked, Function3<? super Integer, ? super MessageAccessory, ? super MessagePartViewHolder, Unit> onAttachmentClicked) {
        Iterable<C11880m> m14069I0;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C9612q.m13917h(attachments, "attachments");
        C9612q.m13917h(eventHandler, "eventHandler");
        C9612q.m13917h(onAttachmentSpoilerClicked, "onAttachmentSpoilerClicked");
        C9612q.m13917h(onAttachmentClicked, "onAttachmentClicked");
        this.onAttachmentSpoilerClicked = onAttachmentSpoilerClicked;
        this.onAttachmentClicked = onAttachmentClicked;
        if (this.attachmentHolders != null && shouldOnlyUpdateBindings(attachments) && this.constrainedWidth == i) {
            for (MessageAccessory messageAccessory : attachments) {
                Map<Long, MessagePartViewHolder> map = this.attachmentHolders;
                if (map == null) {
                    C9612q.m13900y("attachmentHolders");
                    map = null;
                }
                MessagePartViewHolder messagePartViewHolder = map.get(messageAccessory.getItemId());
                if (messagePartViewHolder != null) {
                    bindAttachmentHolder(messagePartViewHolder, messageAccessory, messagePartViewHolder.itemView.getWidth(), messagePartViewHolder.itemView.getHeight());
                }
            }
            return;
        }
        this.constrainedWidth = i;
        this.attachmentHolders = new LinkedHashMap();
        removeAllViews();
        int i9 = 6;
        setColumnCount(6);
        int size = attachments.size();
        int width = MessageAccessoriesView.Companion.getWidth(i);
        int i10 = 2;
        int i11 = 3;
        int i12 = (width - (this.spacingPx * 2)) / 3;
        m14069I0 = C9553r.m14069I0(attachments);
        int i13 = 0;
        int i14 = 0;
        for (C11880m c11880m : m14069I0) {
            if (size != i10 && size != i11 && size != 4) {
                i2 = size % 3;
                if (c11880m.m6780c() >= i2) {
                    i2 = i11;
                }
            } else {
                i2 = i10;
            }
            if (size == i11) {
                if (c11880m.m6780c() == 0) {
                    i3 = 4;
                } else {
                    i3 = i10;
                }
            } else {
                i3 = i9 / i2;
            }
            if (size == i11 && c11880m.m6780c() == 0) {
                i4 = i10;
            } else {
                i4 = 1;
            }
            if (size == i11) {
                if (c11880m.m6780c() == 0) {
                    i5 = (i12 * 2) + this.spacingPx;
                } else {
                    i5 = i12;
                }
            } else {
                i5 = (width - ((i2 - 1) * this.spacingPx)) / i2;
            }
            if (size != i11) {
                if (size != 4 && i2 < i11) {
                    i6 = (i12 * 2) + this.spacingPx;
                } else {
                    i6 = i12;
                }
            } else {
                i6 = i5;
            }
            if (size == i11 && c11880m.m6780c() == 2) {
                i13 += 4;
            }
            MessagePartViewHolder createAttachmentHolder = createAttachmentHolder((MessageAccessory) c11880m.m6779d(), eventHandler);
            bindAttachmentHolder(createAttachmentHolder, (MessageAccessory) c11880m.m6779d(), i5, i6);
            View view = createAttachmentHolder.itemView;
            int i15 = width;
            GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
            layoutParams.width = i5;
            layoutParams.height = i6;
            layoutParams.columnSpec = GridLayout.spec(i13, i3);
            layoutParams.rowSpec = GridLayout.spec(i14, i4);
            if (i13 > 0) {
                i7 = this.spacingPx;
            } else {
                i7 = 0;
            }
            layoutParams.leftMargin = i7;
            if (i14 > 0) {
                i8 = this.spacingPx;
            } else {
                i8 = 0;
            }
            layoutParams.topMargin = i8;
            view.setLayoutParams(layoutParams);
            addView(createAttachmentHolder.itemView);
            Map<Long, MessagePartViewHolder> map2 = this.attachmentHolders;
            if (map2 == null) {
                C9612q.m13900y("attachmentHolders");
                map2 = null;
            }
            map2.put(((MessageAccessory) c11880m.m6779d()).getItemId(), createAttachmentHolder);
            i13 += i3;
            if (i13 >= 6) {
                i14++;
                i9 = 6;
                width = i15;
                i10 = 2;
                i11 = 3;
                i13 = 0;
            } else {
                i9 = 6;
                width = i15;
                i10 = 2;
                i11 = 3;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaMosaicView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        this.spacingPx = context.getResources().getDimensionPixelSize(C2912R.dimen.message_media_grid_spacing);
        ViewClippingUtilsKt.clipToRoundedRectangle(this, context.getResources().getDimensionPixelSize(C2912R.dimen.message_media_radius));
    }
}