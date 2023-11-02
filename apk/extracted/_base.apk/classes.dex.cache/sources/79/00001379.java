package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.databinding.InfoLinkViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/InfoLinkView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/InfoLinkViewBinding;", "configure", "", "text", "", "icon", "Lcom/discord/react_asset_fetcher/ReactAsset;", "onInfoLinkClicked", "Lkotlin/Function0;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class InfoLinkView extends FrameLayout {
    private final InfoLinkViewBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoLinkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        InfoLinkViewBinding inflate = InfoLinkViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
    }

    public static final void configure$lambda$0(Function0 onInfoLinkClicked, View view) {
        C9612q.m13917h(onInfoLinkClicked, "$onInfoLinkClicked");
        onInfoLinkClicked.invoke();
    }

    public final void configure(String text, ReactAsset icon, final Function0<Unit> onInfoLinkClicked) {
        C9612q.m13917h(text, "text");
        C9612q.m13917h(icon, "icon");
        C9612q.m13917h(onInfoLinkClicked, "onInfoLinkClicked");
        this.binding.description.setText(text);
        this.binding.description.setContentDescription(text);
        this.binding.description.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        TextView textView = this.binding.description;
        C9612q.m13918g(textView, "binding.description");
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryNormal);
        SimpleDraweeView simpleDraweeView = this.binding.icon;
        C9612q.m13918g(simpleDraweeView, "binding.icon");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, icon);
        SimpleDraweeView simpleDraweeView2 = this.binding.icon;
        C9612q.m13918g(simpleDraweeView2, "binding.icon");
        ColorUtilsKt.setTintColor(simpleDraweeView2, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        ConstraintLayout constraintLayout = this.binding.infoLinkContainer;
        C9612q.m13918g(constraintLayout, "binding.infoLinkContainer");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(constraintLayout, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InfoLinkView.configure$lambda$0(Function0.this, view);
            }
        }, 1, null);
    }

    public /* synthetic */ InfoLinkView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}