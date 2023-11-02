package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.bridge.spoiler.SpoilerManager;
import com.discord.chat.bridge.spoiler.SpoilerType;
import com.discord.chat.databinding.SpoilerViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\nJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u001b\u001a\u00020\rJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\rH\u0002J\u000e\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/SpoilerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/SpoilerViewBinding;", "isOverlayVisible", "", "onHide", "Lkotlin/Function0;", "", "onReveal", "configure", "config", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "viewToBlur", "Landroid/view/ViewGroup;", "configureObscureOverlay", "label", "", "parent", "configureSpoilerOverlay", "handleObscureAwaitingScan", "isAwaitingScan", "makeObscureHideButtonHidden", "onClick", "showImage", "overlayView", "Landroid/view/View;", "resetOverlays", "setObscureLabelVisible", "isVisible", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SpoilerView extends FrameLayout {
    private final SpoilerViewBinding binding;
    private boolean isOverlayVisible;
    private Function0<Unit> onHide;
    private Function0<Unit> onReveal;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpoilerType.values().length];
            try {
                iArr[SpoilerType.OBSCURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpoilerView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ SpoilerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void configureObscureOverlay(String str, ViewGroup viewGroup) {
        View overlayView = this.binding.obscure.getOverlayView();
        ObscureOverlayView obscureOverlayView = this.binding.obscure;
        C9612q.m13918g(obscureOverlayView, "binding.obscure");
        obscureOverlayView.setVisibility(0);
        this.binding.obscure.configure(str, viewGroup, this.isOverlayVisible, onClick(true, overlayView), onClick(false, overlayView));
    }

    private final void configureSpoilerOverlay(String str) {
        View overlayView = this.binding.spoiler.getOverlayView();
        SpoilerOverlayView spoilerOverlayView = this.binding.spoiler;
        C9612q.m13918g(spoilerOverlayView, "binding.spoiler");
        spoilerOverlayView.setVisibility(0);
        this.binding.spoiler.configure(str, onClick(true, overlayView));
    }

    private final Function0<Unit> onClick(boolean z, View view) {
        return new SpoilerView$onClick$1(this, z, view);
    }

    private final void resetOverlays() {
        SpoilerOverlayView spoilerOverlayView = this.binding.spoiler;
        C9612q.m13918g(spoilerOverlayView, "binding.spoiler");
        spoilerOverlayView.setVisibility(8);
        ObscureOverlayView obscureOverlayView = this.binding.obscure;
        C9612q.m13918g(obscureOverlayView, "binding.obscure");
        obscureOverlayView.setVisibility(8);
    }

    public final void configure(SpoilerConfig spoilerConfig, ViewGroup viewToBlur) {
        C9612q.m13917h(viewToBlur, "viewToBlur");
        if (spoilerConfig != null) {
            resetOverlays();
            this.isOverlayVisible = SpoilerManager.INSTANCE.m41555isNotRevealedV2PEE7g(spoilerConfig.getAttributes().m41543getIdentifierBq9X6Gg());
            if (WhenMappings.$EnumSwitchMapping$0[spoilerConfig.getAttributes().getType().ordinal()] == 1) {
                configureObscureOverlay(spoilerConfig.getAttributes().getLabel(), viewToBlur);
            } else {
                configureSpoilerOverlay(spoilerConfig.getAttributes().getLabel());
            }
            this.onReveal = new SpoilerView$configure$1(spoilerConfig);
            this.onHide = new SpoilerView$configure$2(spoilerConfig);
            setVisibility(0);
            return;
        }
        this.isOverlayVisible = false;
        setVisibility(8);
    }

    public final void handleObscureAwaitingScan(boolean z) {
        this.binding.obscure.handleObscureAwaitingScan(z);
    }

    public final boolean isOverlayVisible() {
        return this.isOverlayVisible;
    }

    public final void makeObscureHideButtonHidden() {
        this.binding.obscure.makeHideButtonHidden();
    }

    public final void setObscureLabelVisible(boolean z) {
        this.binding.obscure.setLabelVisible(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpoilerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        SpoilerViewBinding inflate = SpoilerViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.onReveal = SpoilerView$onReveal$1.INSTANCE;
        this.onHide = SpoilerView$onHide$1.INSTANCE;
    }
}