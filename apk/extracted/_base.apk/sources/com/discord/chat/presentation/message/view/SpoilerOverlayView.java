package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.discord.chat.C2912R;
import com.discord.chat.databinding.SpoilerOverlayViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/SpoilerOverlayView;", "Landroid/widget/FrameLayout;", "Lcom/discord/chat/presentation/message/view/SpoilerViewOverlay;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/SpoilerOverlayViewBinding;", "configure", "", "label", "", "onReveal", "Lkotlin/Function0;", "getOverlayView", "Landroid/view/View;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SpoilerOverlayView extends FrameLayout implements SpoilerViewOverlay {
    private final SpoilerOverlayViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpoilerOverlayView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ SpoilerOverlayView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configure$lambda$1(Function0 onReveal, View view) {
        C9612q.m13917h(onReveal, "$onReveal");
        onReveal.invoke();
    }

    public final void configure(String label, final Function0<Unit> onReveal) {
        C9612q.m13917h(label, "label");
        C9612q.m13917h(onReveal, "onReveal");
        this.binding.label.setText(label);
        FrameLayout frameLayout = this.binding.overlayContainer;
        C9612q.m13918g(frameLayout, "binding.overlayContainer");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(frameLayout, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpoilerOverlayView.configure$lambda$1(Function0.this, view);
            }
        }, 1, null);
    }

    @Override // com.discord.chat.presentation.message.view.SpoilerViewOverlay
    public View getOverlayView() {
        FrameLayout frameLayout = this.binding.overlayContainer;
        C9612q.m13918g(frameLayout, "binding.overlayContainer");
        return frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpoilerOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        SpoilerOverlayViewBinding inflate = SpoilerOverlayViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView _init_$lambda$0 = inflate.label;
        C9612q.m13918g(_init_$lambda$0, "_init_$lambda$0");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimaryBold);
        _init_$lambda$0.setBackgroundColor(ColorUtilsKt.getColorCompat(context, C2912R.color.primary_800));
        ViewClippingUtilsKt.clipToCircle(_init_$lambda$0);
        inflate.overlayContainer.setBackgroundColor(ThemeManagerKt.getTheme().getSpoilerHiddenBackground());
    }
}
