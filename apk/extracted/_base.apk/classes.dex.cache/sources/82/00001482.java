package com.discord.chat.presentation.message.viewholder;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.threads.ThreadEmbed;
import com.discord.chat.bridge.threads.ThreadEmbedMessage;
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory;
import com.discord.chat.presentation.message.view.ThreadEmbedView;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$1;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$10;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$11;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$2;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$3;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$4;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$5;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$6;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$7;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$8;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$9;
import com.discord.primitives.MessageId;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nø\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m14357d2 = {"Lcom/discord/chat/presentation/message/viewholder/ThreadEmbedViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "threadEmbedView", "Lcom/discord/chat/presentation/message/view/ThreadEmbedView;", "(Lcom/discord/chat/presentation/message/view/ThreadEmbedView;)V", "bind", "", "threadItem", "Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;", "onTapThreadEmbed", "Lkotlin/Function1;", "Lcom/discord/primitives/MessageId;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ThreadEmbedViewHolder extends MessagePartViewHolder {
    private final ThreadEmbedView threadEmbedView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadEmbedViewHolder(ThreadEmbedView threadEmbedView) {
        super(threadEmbedView, null);
        C9612q.m13917h(threadEmbedView, "threadEmbedView");
        this.threadEmbedView = threadEmbedView;
    }

    public static final void bind$lambda$1$lambda$0(Function1 onTapThreadEmbed, ThreadEmbedMessageAccessory threadItem, View view) {
        C9612q.m13917h(onTapThreadEmbed, "$onTapThreadEmbed");
        C9612q.m13917h(threadItem, "$threadItem");
        onTapThreadEmbed.invoke(MessageId.m42073boximpl(threadItem.mo41659getMessageId3Eiw7ao()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.CharSequence] */
    public final void bind(final ThreadEmbedMessageAccessory threadItem, final Function1<? super MessageId, Unit> onTapThreadEmbed) {
        Message message;
        DraweeSpanStringBuilder draweeSpanStringBuilder;
        ?? contentlessPreviewText;
        String str;
        C9612q.m13917h(threadItem, "threadItem");
        C9612q.m13917h(onTapThreadEmbed, "onTapThreadEmbed");
        ThreadEmbed threadEmbed = threadItem.getThreadEmbed();
        ThreadEmbedView threadEmbedView = this.threadEmbedView;
        threadEmbedView.setTitle(threadEmbed.getTitle());
        threadEmbedView.setLabel(threadEmbed.getMessageCountLabel());
        Boolean archived = threadEmbed.getArchived();
        Boolean bool = Boolean.TRUE;
        threadEmbedView.setArchived(C9612q.m13922c(archived, bool), threadEmbed.getArchivedIconUrl());
        boolean z = true;
        String str2 = null;
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(threadEmbedView, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.viewholder.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThreadEmbedViewHolder.bind$lambda$1$lambda$0(Function1.this, threadItem, view);
            }
        }, 1, null);
        ThreadEmbedMessage referencedMessage = threadEmbed.getReferencedMessage();
        if (referencedMessage != null) {
            message = referencedMessage.getMessage();
        } else {
            message = null;
        }
        String str3 = "";
        if (message == null) {
            String messagePreviewString = threadEmbed.getMessagePreviewString();
            if (messagePreviewString != null) {
                str3 = messagePreviewString;
            }
            draweeSpanStringBuilder = new DraweeSpanStringBuilder(str3);
        } else if (message.getContent() != null) {
            StructurableText content = message.getContent();
            Context context = threadEmbedView.getContext();
            String m41436getId3Eiw7ao = message.m41436getId3Eiw7ao();
            boolean shouldAnimateEmoji = MessageKt.shouldAnimateEmoji(message);
            boolean shouldShowRoleDot = message.getShouldShowRoleDot();
            boolean shouldShowRoleOnName = message.getShouldShowRoleOnName();
            Paint.FontMetrics fontMetrics = threadEmbedView.getBinding().threadEmbedMostRecentMessageContent.getPaint().getFontMetrics();
            C9612q.m13918g(fontMetrics, "binding.threadEmbedMostR…Content.paint.fontMetrics");
            float baselineHeight = TextUtilsKt.getBaselineHeight(fontMetrics);
            TextPaint paint = threadEmbedView.getBinding().threadEmbedMostRecentMessageContent.getPaint();
            C9612q.m13918g(context, "context");
            C9612q.m13918g(paint, "paint");
            draweeSpanStringBuilder = TextUtilsKt.toSpannable(content, context, m41436getId3Eiw7ao, shouldAnimateEmoji, shouldShowRoleDot, shouldShowRoleOnName, paint, (r44 & 64) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : null, (r44 & 128) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : null, (r44 & 256) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : null, (r44 & 512) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : null, (r44 & 1024) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : null, (r44 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : null, (r44 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : null, (r44 & 8192) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : null, (r44 & 16384) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : null, (32768 & r44) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : null, (65536 & r44) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : null, (131072 & r44) != 0 ? false : true, (262144 & r44) != 0 ? ThemeManagerKt.getTheme() : null, (r44 & 524288) != 0 ? -1.0f : baselineHeight);
        } else {
            Context context2 = threadEmbedView.getContext();
            C9612q.m13918g(context2, "context");
            contentlessPreviewText = ThreadEmbedViewHolderKt.getContentlessPreviewText(context2, message);
            if (contentlessPreviewText != 0) {
                str3 = contentlessPreviewText;
            }
            draweeSpanStringBuilder = new DraweeSpanStringBuilder(str3);
        }
        if (message != null) {
            Context context3 = threadEmbedView.getContext();
            C9612q.m13918g(context3, "context");
            str = MessageKt.avatarUrl(message, context3);
        } else {
            str = null;
        }
        if (message != null) {
            str2 = message.getUsername();
        }
        if (!C9612q.m13922c(threadEmbed.getArchived(), bool) && message != null && message.getContent() != null) {
            z = false;
        }
        threadEmbedView.setMessage(str, str2, draweeSpanStringBuilder, z);
    }
}