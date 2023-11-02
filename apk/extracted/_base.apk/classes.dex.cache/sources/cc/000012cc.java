package com.discord.chat.presentation.message;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.core.view.C1170a;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.referencedmessage.LoadedReferencedMessage;
import com.discord.chat.bridge.referencedmessage.ReferencedMessage;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.span.utilities.spannable.EmojiAccessibilitySpan;
import com.discord.span.utilities.spannable.SpoilerSpan;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b \u0010!J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\"\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, m14357d2 = {"Lcom/discord/chat/presentation/message/MessageViewAccessibilityDelegate;", "Landroidx/core/view/a;", "Landroid/content/Context;", "context", "Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;", "referencedMessage", "", "getReferencedMessageLabel", "Landroid/view/View;", ZeroconfModule.KEY_SERVICE_HOST, "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "", "onInitializeAccessibilityNodeInfo", "", "action", "Landroid/os/Bundle;", "args", "", "performAccessibilityAction", "Lcom/discord/chat/bridge/Message;", "message", "Lcom/discord/chat/bridge/Message;", "Lcom/discord/chat/presentation/message/view/MessageContentView;", "contentView", "Lcom/discord/chat/presentation/message/view/MessageContentView;", "Landroid/view/View$OnClickListener;", "onClick", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnLongClickListener;", "onLongClick", "Landroid/view/View$OnLongClickListener;", "<init>", "(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/message/view/MessageContentView;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageViewAccessibilityDelegate extends C1170a {
    private final MessageContentView contentView;
    private final Message message;
    private final View.OnClickListener onClick;
    private final View.OnLongClickListener onLongClick;

    public MessageViewAccessibilityDelegate(Message message, MessageContentView contentView, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        C9612q.m13917h(message, "message");
        C9612q.m13917h(contentView, "contentView");
        this.message = message;
        this.contentView = contentView;
        this.onClick = onClickListener;
        this.onLongClick = onLongClickListener;
    }

    private final CharSequence getReferencedMessageLabel(Context context, ReferencedMessage referencedMessage) {
        if (referencedMessage instanceof LoadedReferencedMessage) {
            return I18nUtilsKt.i18nFormat(context, I18nMessage.MOBILE_REPLYING_TO_A11Y_LABEL, new MessageViewAccessibilityDelegate$getReferencedMessageLabel$1(((LoadedReferencedMessage) referencedMessage).getMessage().getUsername()));
        }
        return null;
    }

    @Override // androidx.core.view.C1170a
    public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
        SpoilerSpan[] spoilerSpanArr;
        EmojiAccessibilitySpan[] emojiAccessibilitySpanArr;
        String m14046d0;
        C9612q.m13917h(host, "host");
        C9612q.m13917h(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.contentView.getText());
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), SpoilerSpan.class);
        C9612q.m13918g(spans, "augmentedText.getSpans(0… SpoilerSpan::class.java)");
        for (SpoilerSpan spoilerSpan : (SpoilerSpan[]) spans) {
            if (!spoilerSpan.isRevealed()) {
                int spanStart = spannableStringBuilder.getSpanStart(spoilerSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(spoilerSpan);
                Context context = host.getContext();
                C9612q.m13918g(context, "host.context");
                spannableStringBuilder.replace(spanStart, spanEnd, I18nUtilsKt.i18nFormat$default(context, I18nMessage.SPOILER_HIDDEN_A11Y_LABEL, null, 2, null));
            }
        }
        Object[] spans2 = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), EmojiAccessibilitySpan.class);
        C9612q.m13918g(spans2, "augmentedText.getSpans(0…sibilitySpan::class.java)");
        for (EmojiAccessibilitySpan emojiAccessibilitySpan : (EmojiAccessibilitySpan[]) spans2) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(emojiAccessibilitySpan), spannableStringBuilder.getSpanEnd(emojiAccessibilitySpan), (CharSequence) emojiAccessibilitySpan.getName());
        }
        ArrayList arrayList = new ArrayList();
        if (this.message.getUsername() != null) {
            arrayList.add(this.message.getUsername());
        }
        if (this.message.getTimestamp() != null) {
            arrayList.add(this.message.getTimestamp());
        }
        Context context2 = host.getContext();
        C9612q.m13918g(context2, "host.context");
        CharSequence referencedMessageLabel = getReferencedMessageLabel(context2, this.message.getReferencedMessage());
        if (referencedMessageLabel != null) {
            arrayList.add(referencedMessageLabel);
        }
        if (!arrayList.isEmpty()) {
            m14046d0 = C9553r.m14046d0(arrayList, ", ", null, null, 0, null, null, 62, null);
            spannableStringBuilder.replace(0, 0, (CharSequence) (m14046d0 + ", "));
        }
        info.m37626J0(spannableStringBuilder);
        info.m37605Y(AccessibilityNodeInfoCompat.C1178a.f3610i);
        info.m37560v0(15);
    }

    @Override // androidx.core.view.C1170a
    public boolean performAccessibilityAction(View host, int i, Bundle bundle) {
        View.OnLongClickListener onLongClickListener;
        C9612q.m13917h(host, "host");
        if (i != 16) {
            if (i == 32 && (onLongClickListener = this.onLongClick) != null) {
                onLongClickListener.onLongClick(host);
            }
        } else {
            View.OnClickListener onClickListener = this.onClick;
            if (onClickListener != null) {
                onClickListener.onClick(host);
            }
        }
        return super.performAccessibilityAction(host, i, bundle);
    }
}