package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.interaction.InteractionStatus;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.InteractionStatusViewBinding;
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
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.progress_dots.ProgressDots;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.span.utilities.BackgroundSpanDrawer;
import com.discord.span.utilities.SpannableExtensionsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J#\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/InteractionStatusView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/InteractionStatusViewBinding;", "setInteractionStatus", "", "messageId", "Lcom/discord/primitives/MessageId;", "interactionStatus", "Lcom/discord/chat/bridge/interaction/InteractionStatus;", "setInteractionStatus-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/interaction/InteractionStatus;)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class InteractionStatusView extends ConstraintLayout {
    private InteractionStatusViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InteractionStatusView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ InteractionStatusView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: setInteractionStatus-ntcYbpo  reason: not valid java name */
    public final void m41772setInteractionStatusntcYbpo(String messageId, InteractionStatus interactionStatus) {
        int i;
        DraweeSpanStringBuilder spannable;
        int textMuted;
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(interactionStatus, "interactionStatus");
        ProgressDots progressDots = this.binding.viewInteractionStatusLoadingDots;
        C9612q.m13918g(progressDots, "binding.viewInteractionStatusLoadingDots");
        int i2 = 0;
        if (interactionStatus.isLoading()) {
            i = 0;
        } else {
            i = 8;
        }
        progressDots.setVisibility(i);
        SimpleDraweeView simpleDraweeView = this.binding.viewInteractionStatusDangerIcon;
        C9612q.m13918g(simpleDraweeView, "binding.viewInteractionStatusDangerIcon");
        if (!interactionStatus.isFailed()) {
            i2 = 8;
        }
        simpleDraweeView.setVisibility(i2);
        TextView setInteractionStatus_ntcYbpo$lambda$2 = this.binding.viewInteractionStatusLabelMessage;
        C9612q.m13918g(setInteractionStatus_ntcYbpo$lambda$2, "setInteractionStatus_ntcYbpo$lambda$2");
        StructurableText text = interactionStatus.getText();
        Context context = setInteractionStatus_ntcYbpo$lambda$2.getContext();
        Paint.FontMetrics fontMetrics = setInteractionStatus_ntcYbpo$lambda$2.getPaint().getFontMetrics();
        C9612q.m13918g(fontMetrics, "paint.fontMetrics");
        float baselineHeight = TextUtilsKt.getBaselineHeight(fontMetrics);
        TextPaint paint = setInteractionStatus_ntcYbpo$lambda$2.getPaint();
        C9612q.m13918g(context, "context");
        C9612q.m13918g(paint, "paint");
        spannable = TextUtilsKt.toSpannable(text, context, messageId, false, false, false, paint, (r44 & 64) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : null, (r44 & 128) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : null, (r44 & 256) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : null, (r44 & 512) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : null, (r44 & 1024) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : null, (r44 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : null, (r44 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : null, (r44 & 8192) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : null, (r44 & 16384) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : null, (32768 & r44) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : null, (65536 & r44) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : null, (131072 & r44) != 0 ? false : false, (262144 & r44) != 0 ? ThemeManagerKt.getTheme() : null, (r44 & 524288) != 0 ? -1.0f : baselineHeight);
        SpannableExtensionsKt.coverWithSpan(spannable, new BackgroundSpanDrawer(setInteractionStatus_ntcYbpo$lambda$2));
        ViewUtilsKt.setOptionalText(setInteractionStatus_ntcYbpo$lambda$2, spannable);
        if (interactionStatus.isFailed()) {
            textMuted = ThemeManagerKt.getTheme().getTextDanger();
        } else {
            textMuted = ThemeManagerKt.getTheme().getTextMuted();
        }
        setInteractionStatus_ntcYbpo$lambda$2.setTextColor(textMuted);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractionStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        InteractionStatusViewBinding inflate = InteractionStatusViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        SimpleDraweeView _init_$lambda$0 = inflate.viewInteractionStatusDangerIcon;
        C9612q.m13918g(_init_$lambda$0, "_init_$lambda$0");
        ReactAssetUtilsKt.setReactAsset(_init_$lambda$0, ReactAsset.Warning);
        ColorUtilsKt.setTintColor(_init_$lambda$0, Integer.valueOf(ThemeManagerKt.getTheme().getTextDanger()));
    }
}
