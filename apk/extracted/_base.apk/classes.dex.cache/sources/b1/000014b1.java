package com.discord.chat.presentation.separator;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.C2912R;
import com.discord.chat.databinding.SeparatorSummaryViewBinding;
import com.discord.chat.presentation.separator.SummarySeparatorView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m14357d2 = {"Lcom/discord/chat/presentation/separator/SummarySeparatorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/SeparatorSummaryViewBinding;", "setDividerColor", "", ViewProps.COLOR, "", "setIsBeforeContent", "isBeforeContent", "", "setJumpToBottomHandler", "onJumpToBottom", "Landroid/view/View$OnClickListener;", "setMoreActionsHandler", "onMoreActions", "setText", "text", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SummarySeparatorView extends ConstraintLayout {
    private final SeparatorSummaryViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SummarySeparatorView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ SummarySeparatorView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public static final void lambda$2$lambda$1(SeparatorSummaryViewBinding this_with, View view) {
        boolean z;
        C9612q.m13917h(this_with, "$this_with");
        SimpleDraweeView jumpButton = this_with.jumpButton;
        C9612q.m13918g(jumpButton, "jumpButton");
        boolean z2 = true;
        if (jumpButton.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this_with.jumpButton.performClick();
            return;
        }
        SimpleDraweeView moreButton = this_with.moreButton;
        C9612q.m13918g(moreButton, "moreButton");
        if (moreButton.getVisibility() != 0) {
            z2 = false;
        }
        if (z2) {
            this_with.moreButton.performClick();
        }
    }

    public final void setDividerColor(int i) {
        SeparatorSummaryViewBinding separatorSummaryViewBinding = this.binding;
        SimpleDraweeView indicatorTop = separatorSummaryViewBinding.indicatorTop;
        C9612q.m13918g(indicatorTop, "indicatorTop");
        ColorUtilsKt.setTintColor(indicatorTop, Integer.valueOf(i));
        SimpleDraweeView indicatorBottom = separatorSummaryViewBinding.indicatorBottom;
        C9612q.m13918g(indicatorBottom, "indicatorBottom");
        ColorUtilsKt.setTintColor(indicatorBottom, Integer.valueOf(i));
        separatorSummaryViewBinding.rightBar.setBackgroundColor(i);
        SimpleDraweeView icon = separatorSummaryViewBinding.icon;
        C9612q.m13918g(icon, "icon");
        ColorUtilsKt.setTintColor(icon, Integer.valueOf(i));
        separatorSummaryViewBinding.middleText.setTextColor(i);
    }

    public final void setIsBeforeContent(boolean z) {
        SeparatorSummaryViewBinding separatorSummaryViewBinding = this.binding;
        if (z) {
            separatorSummaryViewBinding.indicatorTop.setVisibility(0);
            separatorSummaryViewBinding.indicatorBottom.setVisibility(8);
            separatorSummaryViewBinding.jumpButton.setVisibility(0);
            separatorSummaryViewBinding.moreButton.setVisibility(8);
            separatorSummaryViewBinding.topGuideline.setGuidelineBegin(SizeUtilsKt.getDpToPx(4));
            separatorSummaryViewBinding.bottomGuideline.setGuidelineEnd(0);
            return;
        }
        separatorSummaryViewBinding.indicatorTop.setVisibility(8);
        separatorSummaryViewBinding.indicatorBottom.setVisibility(0);
        separatorSummaryViewBinding.jumpButton.setVisibility(8);
        separatorSummaryViewBinding.moreButton.setVisibility(0);
        separatorSummaryViewBinding.topGuideline.setGuidelineBegin(0);
        separatorSummaryViewBinding.bottomGuideline.setGuidelineEnd(SizeUtilsKt.getDpToPx(4));
    }

    public final void setJumpToBottomHandler(View.OnClickListener onJumpToBottom) {
        C9612q.m13917h(onJumpToBottom, "onJumpToBottom");
        SimpleDraweeView simpleDraweeView = this.binding.jumpButton;
        C9612q.m13918g(simpleDraweeView, "binding.jumpButton");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView, false, onJumpToBottom, 1, null);
    }

    public final void setMoreActionsHandler(View.OnClickListener onMoreActions) {
        C9612q.m13917h(onMoreActions, "onMoreActions");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, onMoreActions, 1, null);
        SimpleDraweeView simpleDraweeView = this.binding.moreButton;
        C9612q.m13918g(simpleDraweeView, "binding.moreButton");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView, false, onMoreActions, 1, null);
    }

    public final void setText(CharSequence text) {
        C9612q.m13917h(text, "text");
        this.binding.middleText.setText(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummarySeparatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        final SeparatorSummaryViewBinding inflate = SeparatorSummaryViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.binding = inflate;
        View root = inflate.getRoot();
        C9612q.m13918g(root, "root");
        Resources resources = context.getResources();
        int i = C2912R.dimen.message_divider_margin_horiz;
        root.setPaddingRelative(resources.getDimensionPixelSize(i), root.getPaddingTop(), context.getResources().getDimensionPixelSize(i), root.getPaddingBottom());
        TextView lambda$2$lambda$0 = inflate.middleText;
        C9612q.m13918g(lambda$2$lambda$0, "lambda$2$lambda$0");
        ViewClippingUtilsKt.clipToRoundedRectangle(lambda$2$lambda$0, SizeUtilsKt.getDpToPx(4));
        DiscordFontUtilsKt.setDiscordFont(lambda$2$lambda$0, DiscordFont.PrimarySemibold);
        SetTextSizeSpKt.setTextSizeSp(lambda$2$lambda$0, 12.0f);
        SimpleDraweeView indicatorTop = inflate.indicatorTop;
        C9612q.m13918g(indicatorTop, "indicatorTop");
        ReactAssetUtilsKt.setReactAsset(indicatorTop, ReactAsset.SummaryIndicatorStart);
        SimpleDraweeView indicatorBottom = inflate.indicatorBottom;
        C9612q.m13918g(indicatorBottom, "indicatorBottom");
        ReactAssetUtilsKt.setReactAsset(indicatorBottom, ReactAsset.SummaryIndicatorEnd);
        SimpleDraweeView icon = inflate.icon;
        C9612q.m13918g(icon, "icon");
        ReactAssetUtilsKt.setReactAsset(icon, ReactAsset.Summary);
        SimpleDraweeView jumpButton = inflate.jumpButton;
        C9612q.m13918g(jumpButton, "jumpButton");
        ReactAssetUtilsKt.setReactAsset(jumpButton, ReactAsset.JumpToBottom);
        SimpleDraweeView jumpButton2 = inflate.jumpButton;
        C9612q.m13918g(jumpButton2, "jumpButton");
        ColorUtilsKt.setTintColor(jumpButton2, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        SimpleDraweeView moreButton = inflate.moreButton;
        C9612q.m13918g(moreButton, "moreButton");
        ReactAssetUtilsKt.setReactAsset(moreButton, ReactAsset.More);
        SimpleDraweeView moreButton2 = inflate.moreButton;
        C9612q.m13918g(moreButton2, "moreButton");
        ColorUtilsKt.setTintColor(moreButton2, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        FrameLayout buttonWrapper = inflate.buttonWrapper;
        C9612q.m13918g(buttonWrapper, "buttonWrapper");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(buttonWrapper, false, new View.OnClickListener() { // from class: f2.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SummarySeparatorView.lambda$2$lambda$1(SeparatorSummaryViewBinding.this, view);
            }
        }, 1, null);
    }
}