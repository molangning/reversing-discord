package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.databinding.ObscureOverlayViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import eightbitlab.com.blurview.BlurView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J:\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0011J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u001a\u001a\u00020\u000bJ\u000e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/ObscureOverlayView;", "Landroid/widget/FrameLayout;", "Lcom/discord/chat/presentation/message/view/SpoilerViewOverlay;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/ObscureOverlayViewBinding;", "configure", "", "header", "", "parent", "Landroid/view/ViewGroup;", "isOverlayVisible", "", "onReveal", "Lkotlin/Function0;", "onHide", "getOverlayView", "Landroid/view/View;", "handleObscureAwaitingScan", "isAwaitingScan", "handleRevealedState", "makeHideButtonHidden", "setLabelVisible", "isVisible", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ObscureOverlayView extends FrameLayout implements SpoilerViewOverlay {
    private final ObscureOverlayViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObscureOverlayView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ ObscureOverlayView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public static final void _init_$lambda$0(View view) {
    }

    private final void handleRevealedState(boolean z) {
        int i;
        BlurView blurView = this.binding.blurView;
        C9612q.m13918g(blurView, "binding.blurView");
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        blurView.setVisibility(i);
        IconButtonView iconButtonView = this.binding.hideButton;
        if (z) {
            i2 = 4;
        }
        iconButtonView.setImportantForAccessibility(i2);
    }

    public final void configure(String header, ViewGroup parent, boolean z, Function0<Unit> onReveal, Function0<Unit> onHide) {
        C9612q.m13917h(header, "header");
        C9612q.m13917h(parent, "parent");
        C9612q.m13917h(onReveal, "onReveal");
        C9612q.m13917h(onHide, "onHide");
        handleRevealedState(z);
        this.binding.blurView.setupWith(parent).mo23165g(24.0f).mo23171a(Color.argb(80, 0, 0, 0)).mo23168d(parent.getBackground()).mo23169c(true);
        this.binding.hideButton.configure(ReactAsset.HideMedia, I18nMessage.OBSCURED_CONTENT_HIDE_CONTENT_ALT, new ObscureOverlayView$configure$1(onHide, this));
        this.binding.revealButton.configure(ReactAsset.ShowMedia, I18nMessage.OBSCURED_CONTENT_SHOW_CONTENT_ALT, onReveal);
        this.binding.descriptionLabel.setText(header);
    }

    @Override // com.discord.chat.presentation.message.view.SpoilerViewOverlay
    public View getOverlayView() {
        BlurView blurView = this.binding.blurView;
        C9612q.m13918g(blurView, "binding.blurView");
        return blurView;
    }

    public final void handleObscureAwaitingScan(boolean z) {
        int i;
        ConstraintLayout constraintLayout = this.binding.overlayLayout;
        C9612q.m13918g(constraintLayout, "binding.overlayLayout");
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        constraintLayout.setVisibility(i);
    }

    public final void makeHideButtonHidden() {
        IconButtonView iconButtonView = this.binding.hideButton;
        C9612q.m13918g(iconButtonView, "binding.hideButton");
        iconButtonView.setVisibility(8);
    }

    public final void setLabelVisible(boolean z) {
        int i;
        TextView textView = this.binding.descriptionLabel;
        C9612q.m13918g(textView, "binding.descriptionLabel");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObscureOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        ObscureOverlayViewBinding inflate = ObscureOverlayViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        BlurView blurView = inflate.blurView;
        C9612q.m13918g(blurView, "binding.blurView");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(blurView, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ObscureOverlayView._init_$lambda$0(view);
            }
        }, 1, null);
        SimpleDraweeView it = inflate.mediaWarningIcon;
        C9612q.m13918g(it, "it");
        ReactAssetUtilsKt.setReactAsset(it, ReactAsset.MediaChannelNSFW);
        ColorUtilsKt.setTintColor(it, Integer.valueOf(ThemeManagerKt.getTheme().getWhite()));
        it.getHierarchy().m31463w(0);
        TextView textView = inflate.descriptionLabel;
        C9612q.m13918g(textView, "binding.descriptionLabel");
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryNormal);
    }
}