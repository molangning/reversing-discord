package com.discord.emoji_picker;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.discord.emoji_picker.EmojiPickerRow;
import com.discord.image.fresco.SetOptionalImageUrlKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012¨\u0006\u001b"}, m14357d2 = {"Lcom/discord/emoji_picker/EmojiPickerRowView;", "Landroid/widget/LinearLayout;", "", "Lcom/discord/emoji_picker/EmojiPickerRow$Emoji;", "emojis", "", "configureRowEmojiViews", "Lcom/discord/emoji_picker/EmojiPickerRow;", "rowData", "createRowEmojiViews", "setRowData", "Lkotlin/Function1;", "", "onPressEmoji", "Lkotlin/jvm/functions/Function1;", "getOnPressEmoji", "()Lkotlin/jvm/functions/Function1;", "setOnPressEmoji", "(Lkotlin/jvm/functions/Function1;)V", "onLongPressEmoji", "getOnLongPressEmoji", "setOnLongPressEmoji", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "emoji_picker_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class EmojiPickerRowView extends LinearLayout {
    public static final Companion Companion = new Companion(null);
    private static final GradientDrawable placeholder;
    private Function1<? super String, Unit> onLongPressEmoji;
    private Function1<? super String, Unit> onPressEmoji;

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m14357d2 = {"Lcom/discord/emoji_picker/EmojiPickerRowView$Companion;", "", "()V", ReactTextInputShadowNode.PROP_PLACEHOLDER, "Landroid/graphics/drawable/GradientDrawable;", "emoji_picker_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(ThemeManagerKt.getTheme().getBackgroundAccent());
        placeholder = gradientDrawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiPickerRowView(Context context) {
        super(context);
        C9612q.m13917h(context, "context");
        this.onPressEmoji = EmojiPickerRowView$onPressEmoji$1.INSTANCE;
        this.onLongPressEmoji = EmojiPickerRowView$onLongPressEmoji$1.INSTANCE;
        setOrientation(0);
    }

    private final void configureRowEmojiViews(List<EmojiPickerRow.Emoji> list) {
        float f;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                C9545j.m14094s();
            }
            final EmojiPickerRow.Emoji emoji = (EmojiPickerRow.Emoji) obj;
            View childAt = getChildAt(i);
            C9612q.m13919f(childAt, "null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) childAt;
            if (emoji == null) {
                simpleDraweeView.setImageURI((String) null);
                simpleDraweeView.setVisibility(4);
            } else {
                SetOptionalImageUrlKt.setOptionalImageUrl$default(simpleDraweeView, emoji.getUrl(), false, null, 6, null);
                simpleDraweeView.setVisibility(0);
                simpleDraweeView.setContentDescription(emoji.getName());
                if (emoji.getDisabled()) {
                    f = 0.2f;
                } else {
                    f = 1.0f;
                }
                simpleDraweeView.setAlpha(f);
                NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView, false, new View.OnClickListener() { // from class: com.discord.emoji_picker.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        EmojiPickerRowView.configureRowEmojiViews$lambda$2$lambda$0(EmojiPickerRowView.this, emoji, view);
                    }
                }, 1, null);
                NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(simpleDraweeView, false, new View.OnLongClickListener() { // from class: com.discord.emoji_picker.b
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean configureRowEmojiViews$lambda$2$lambda$1;
                        configureRowEmojiViews$lambda$2$lambda$1 = EmojiPickerRowView.configureRowEmojiViews$lambda$2$lambda$1(EmojiPickerRowView.this, emoji, view);
                        return configureRowEmojiViews$lambda$2$lambda$1;
                    }
                }, 1, null);
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureRowEmojiViews$lambda$2$lambda$0(EmojiPickerRowView this$0, EmojiPickerRow.Emoji emoji, View view) {
        C9612q.m13917h(this$0, "this$0");
        this$0.onPressEmoji.invoke(emoji.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean configureRowEmojiViews$lambda$2$lambda$1(EmojiPickerRowView this$0, EmojiPickerRow.Emoji emoji, View view) {
        C9612q.m13917h(this$0, "this$0");
        this$0.onLongPressEmoji.invoke(emoji.getName());
        return true;
    }

    private final void createRowEmojiViews(EmojiPickerRow emojiPickerRow) {
        int i;
        removeAllViews();
        int dpToPx = SizeUtilsKt.getDpToPx(emojiPickerRow.getItemSize());
        int size = emojiPickerRow.getItems().size();
        int dpToPx2 = (SizeUtilsKt.getDpToPx(emojiPickerRow.getRowContentWidth()) - (dpToPx * size)) / (size - 1);
        int dpToPx3 = SizeUtilsKt.getDpToPx(emojiPickerRow.getRowContentPaddingVertical());
        int i2 = 0;
        for (Object obj : emojiPickerRow.getItems()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C9545j.m14094s();
            }
            EmojiPickerRow.Emoji emoji = (EmojiPickerRow.Emoji) obj;
            if (i2 == 0) {
                i = 0;
            } else {
                i = dpToPx2;
            }
            SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
            RippleUtilsKt.addCircleRipple$default(simpleDraweeView, false, 1, null);
            ((GenericDraweeHierarchy) simpleDraweeView.getHierarchy()).m31460z(placeholder);
            ((GenericDraweeHierarchy) simpleDraweeView.getHierarchy()).m31466t(ScalingUtils.ScaleType.f9840e);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dpToPx, dpToPx);
            layoutParams.setMargins(i, dpToPx3, 0, dpToPx3);
            simpleDraweeView.setLayoutParams(layoutParams);
            addView(simpleDraweeView);
            i2 = i3;
        }
    }

    public final Function1<String, Unit> getOnLongPressEmoji() {
        return this.onLongPressEmoji;
    }

    public final Function1<String, Unit> getOnPressEmoji() {
        return this.onPressEmoji;
    }

    public final void setOnLongPressEmoji(Function1<? super String, Unit> function1) {
        C9612q.m13917h(function1, "<set-?>");
        this.onLongPressEmoji = function1;
    }

    public final void setOnPressEmoji(Function1<? super String, Unit> function1) {
        C9612q.m13917h(function1, "<set-?>");
        this.onPressEmoji = function1;
    }

    public final void setRowData(EmojiPickerRow rowData) {
        C9612q.m13917h(rowData, "rowData");
        if (rowData.getItems().size() != getChildCount()) {
            createRowEmojiViews(rowData);
        }
        configureRowEmojiViews(rowData.getItems());
    }
}
