package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.discord.chat.databinding.IconButtonViewBinding;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/IconButtonView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/IconButtonViewBinding;", "configure", "", "icon", "Lcom/discord/react_asset_fetcher/ReactAsset;", "alt", "Lcom/discord/react_strings/I18nMessage;", "onClick", "Lkotlin/Function0;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class IconButtonView extends FrameLayout {
    private final IconButtonViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconButtonView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ IconButtonView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public static final void configure$lambda$1(Function0 onClick, View view) {
        C9612q.m13917h(onClick, "$onClick");
        onClick.invoke();
    }

    public final void configure(ReactAsset icon, I18nMessage alt, final Function0<Unit> onClick) {
        C9612q.m13917h(icon, "icon");
        C9612q.m13917h(alt, "alt");
        C9612q.m13917h(onClick, "onClick");
        SimpleDraweeView it = this.binding.iconButton;
        C9612q.m13918g(it, "it");
        ReactAssetUtilsKt.setReactAsset(it, icon);
        I18nUtilsKt.i18nContentDescription$default(it, alt, (Function1) null, 2, (Object) null);
        FrameLayout frameLayout = this.binding.iconContainer;
        C9612q.m13918g(frameLayout, "binding.iconContainer");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(frameLayout, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IconButtonView.configure$lambda$1(Function0.this, view);
            }
        }, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        IconButtonViewBinding inflate = IconButtonViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        FrameLayout frameLayout = inflate.iconContainer;
        C9612q.m13918g(frameLayout, "binding.iconContainer");
        ViewClippingUtilsKt.clipToRoundedRectangle(frameLayout, SizeUtilsKt.getDpToPx(8));
        inflate.iconButton.getHierarchy().m31463w(0);
    }
}