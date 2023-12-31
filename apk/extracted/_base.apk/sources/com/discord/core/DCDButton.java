package com.discord.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import bb.C2239k;
import com.discord.core.databinding.DcdButtonBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0014J\u0012\u0010\u0014\u001a\u00020\u000e2\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u0016J\u0017\u0010\u0014\u001a\u00020\u000e2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J3\u0010\u0018\u001a\u00020\u000e2\b\b\u0001\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u0016¢\u0006\u0002\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000e2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u001f\u001a\u00020\u000eH\u0002J\u0010\u0010 \u001a\u00020\u000e2\b\b\u0001\u0010!\u001a\u00020\u0016J\u000e\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0012H\u0016J\u0018\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020)2\b\b\u0001\u0010*\u001a\u00020\u0016J\u0010\u0010+\u001a\u00020\u000e2\b\b\u0001\u0010,\u001a\u00020\u0016J\u000e\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u0012J\u000e\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u0016J\u0010\u00101\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u000103J\u0012\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000103H\u0016J\u0012\u00107\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000108H\u0016J\u0010\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020;H\u0002J\u0010\u0010<\u001a\u00020\u000e2\b\u0010=\u001a\u0004\u0018\u00010>J\u0017\u0010?\u001a\u00020\u000e2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\u000e\u0010@\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020BR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, m14357d2 = {"Lcom/discord/core/DCDButton;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/core/databinding/DcdButtonBinding;", "button", "Lcom/google/android/material/button/MaterialButton;", "progress", "Landroid/widget/ProgressBar;", "ellipsize", "", "behavior", "Landroid/text/TextUtils$TruncateAt;", "hasPadding", "", "onFinishInflate", "setBackgroundColor", "colorInt", "", "(Ljava/lang/Integer;)V", "setBackgroundRectangle", ViewProps.COLOR, "radiusPx", "strokeColor", "strokeWidth", "(IILjava/lang/Integer;I)V", "setBorderColor", "setButtonPadding", "setCornerRadius", "cornerRadius", "setDiscordFont", "font", "Lcom/discord/fonts/DiscordFont;", "setEnabled", ViewProps.ENABLED, "setIcon", "iconUrl", "", "iconSize", "setIconPadding", "iconPadding", "setLoading", "isLoading", "setMaxLines", "maxLines", "setOnClickButtonListener", "onClickListener", "Landroid/view/View$OnClickListener;", "setOnClickListener", "", "l", "setOnTouchListener", "Landroid/view/View$OnTouchListener;", "setProgressBarColor", "colorStateList", "Landroid/content/res/ColorStateList;", "setText", "text", "", "setTextColor", "setTextSizeSp", "sp", "", "core_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class DCDButton extends FrameLayout {
    private final DcdButtonBinding binding;
    private final MaterialButton button;
    private final ProgressBar progress;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DCDButton(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ DCDButton(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final boolean hasPadding() {
        return getPaddingStart() > 0 || getPaddingEnd() > 0 || getPaddingTop() > 0 || getPaddingBottom() > 0;
    }

    public static /* synthetic */ void setBackgroundRectangle$default(DCDButton dCDButton, int i, int i2, Integer num, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        dCDButton.setBackgroundRectangle(i, i2, num, i3);
    }

    private final void setButtonPadding() {
        if (hasPadding()) {
            this.button.setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getPaddingBottom());
            setPadding(0, 0, 0, 0);
        }
    }

    private final void setProgressBarColor(ColorStateList colorStateList) {
        this.progress.setIndeterminateTintList(colorStateList);
    }

    public final void ellipsize(TextUtils.TruncateAt behavior) {
        C9612q.m13917h(behavior, "behavior");
        this.button.setEllipsize(behavior);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setButtonPadding();
    }

    public final void setBackgroundColor(Integer num) {
        if (num != null) {
            setBackgroundColor(num.intValue());
        }
    }

    public final void setBackgroundRectangle(int i, int i2, Integer num, int i3) {
        setBackgroundColor(i);
        MaterialButton materialButton = this.button;
        C2239k.C2241b m33874a = C2239k.m33874a();
        m33874a.m33829o(i2);
        materialButton.setShapeAppearanceModel(m33874a.m33831m());
        if (num != null) {
            this.button.setStrokeColor(ColorStateList.valueOf(num.intValue()));
            this.button.setStrokeWidth(i3);
            return;
        }
        this.button.setStrokeWidth(0);
    }

    public final void setBorderColor(Integer num) {
        Unit unit;
        if (num != null) {
            this.button.setStrokeColor(ColorStateList.valueOf(num.intValue()));
            this.button.setStrokeWidth(SizeUtilsKt.getDpToPx(1));
            unit = Unit.f25302a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.button.setStrokeColor(null);
            this.button.setStrokeWidth(0);
        }
    }

    public final void setCornerRadius(int i) {
        this.button.setCornerRadius(i);
    }

    public final void setDiscordFont(DiscordFont font) {
        C9612q.m13917h(font, "font");
        DiscordFontUtilsKt.setDiscordFont(this.button, font);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.button.setEnabled(z);
    }

    public final void setIcon(String iconUrl, int i) {
        C9612q.m13917h(iconUrl, "iconUrl");
        ReactAssetUtilsKt.setReactIcon(this.button, iconUrl, i);
    }

    public final void setIconPadding(int i) {
        this.button.setIconPadding(i);
    }

    public final void setLoading(boolean z) {
        float f;
        int i;
        MaterialButton materialButton = this.button;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        materialButton.setTextScaleX(f);
        setClickable(!z);
        ProgressBar progressBar = this.progress;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
    }

    public final void setMaxLines(int i) {
        this.button.setMaxLines(i);
    }

    public final void setOnClickButtonListener(View.OnClickListener onClickListener) {
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.button, false, onClickListener, 1, null);
    }

    public final void setText(CharSequence charSequence) {
        this.button.setText(charSequence);
    }

    public final void setTextColor(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        this.button.setTextColor(i);
        this.button.setIconTint(ColorStateList.valueOf(i));
        this.progress.setIndeterminateTintList(ColorStateList.valueOf(i));
    }

    public final void setTextSizeSp(float f) {
        this.button.setTextSize(2, f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DCDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        DcdButtonBinding inflate = DcdButtonBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        MaterialButton materialButton = inflate.button;
        C9612q.m13918g(materialButton, "binding.button");
        this.button = materialButton;
        ProgressBar progressBar = inflate.progress;
        C9612q.m13918g(progressBar, "binding.progress");
        this.progress = progressBar;
        materialButton.setStateListAnimator(null);
        materialButton.setMinimumHeight(progressBar.getHeight());
        materialButton.setMinHeight(progressBar.getHeight());
        materialButton.setMinimumWidth(progressBar.getWidth());
        materialButton.setMinWidth(progressBar.getWidth());
        materialButton.setInsetTop(0);
        materialButton.setInsetBottom(0);
        setTextSizeSp(14.0f);
        setDiscordFont(DiscordFont.PrimarySemibold);
        setButtonPadding();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.button.setBackgroundTintList(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public Void setOnClickListener(View.OnClickListener onClickListener) {
        throw new IllegalAccessError("Use setButtonOnClickListener instead.");
    }

    @Override // android.view.View
    public Void setOnTouchListener(View.OnTouchListener onTouchListener) {
        throw new IllegalAccessError("Use setButtonOnClickListener instead.");
    }
}
