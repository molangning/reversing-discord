package com.discord.mobile_voice_overlay.views;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import androidx.core.view.C1365w0;
import com.discord.mobile_voice_overlay.utils.WindowUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0018\u001a\u00020\u0013J\b\u0010\u0019\u001a\u00020\u001aH&J\u0012\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, m14357d2 = {"Lcom/discord/mobile_voice_overlay/views/OverlayDialog;", "Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSetId", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<anonymous parameter 0>", "", "isMoving", "()Z", "setMoving", "(Z)V", "onDialogClosed", "Lkotlin/Function1;", "", "getOnDialogClosed", "()Lkotlin/jvm/functions/Function1;", "setOnDialogClosed", "(Lkotlin/jvm/functions/Function1;)V", "closeDialog", "getClosingAnimator", "Landroid/animation/Animator;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "mobile_voice_overlay_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public abstract class OverlayDialog extends OverlayBubbleWrap {
    private Function1<? super OverlayDialog, Unit> onDialogClosed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayDialog(Context context) {
        super(context);
        C9612q.m13917h(context, "context");
        this.onDialogClosed = OverlayDialog$onDialogClosed$1.INSTANCE;
        setOnClickListener(new View.OnClickListener() { // from class: com.discord.mobile_voice_overlay.views.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverlayDialog._init_$lambda$0(OverlayDialog.this, view);
            }
        });
        WindowManager.LayoutParams windowLayoutParams = getWindowLayoutParams();
        windowLayoutParams.width = -1;
        windowLayoutParams.height = -1;
        windowLayoutParams.x = 0;
        windowLayoutParams.y = 0;
        WindowUtils.INSTANCE.addFlag(windowLayoutParams, 2);
        windowLayoutParams.dimAmount = 0.5f;
        setStateListAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(OverlayDialog this$0, View view) {
        C9612q.m13917h(this$0, "this$0");
        this$0.closeDialog();
    }

    public final void closeDialog() {
        if (!C1365w0.m37225T(this)) {
            this.onDialogClosed.invoke(this);
            return;
        }
        final Animator closingAnimator = getClosingAnimator();
        closingAnimator.addListener(new Animator.AnimatorListener() { // from class: com.discord.mobile_voice_overlay.views.OverlayDialog$closeDialog$lambda$3$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                C9612q.m13917h(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C9612q.m13917h(animator, "animator");
                OverlayDialog.this.getOnDialogClosed().invoke(OverlayDialog.this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                C9612q.m13917h(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C9612q.m13917h(animator, "animator");
            }
        });
        closingAnimator.start();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.discord.mobile_voice_overlay.views.OverlayDialog$closeDialog$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                C9612q.m13917h(v, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                C9612q.m13917h(v, "v");
                closingAnimator.end();
            }
        });
    }

    public abstract Animator getClosingAnimator();

    public final Function1<OverlayDialog, Unit> getOnDialogClosed() {
        return this.onDialogClosed;
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayBubbleWrap
    public boolean isMoving() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.discord.mobile_voice_overlay.views.OverlayBubbleWrap, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getWindowLayoutParams().x = 0;
        getWindowLayoutParams().y = 0;
        updateViewLayout();
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayBubbleWrap
    public void setMoving(boolean z) {
    }

    public final void setOnDialogClosed(Function1<? super OverlayDialog, Unit> function1) {
        C9612q.m13917h(function1, "<set-?>");
        this.onDialogClosed = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        this.onDialogClosed = OverlayDialog$onDialogClosed$1.INSTANCE;
        setOnClickListener(new View.OnClickListener() { // from class: com.discord.mobile_voice_overlay.views.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverlayDialog._init_$lambda$0(OverlayDialog.this, view);
            }
        });
        WindowManager.LayoutParams windowLayoutParams = getWindowLayoutParams();
        windowLayoutParams.width = -1;
        windowLayoutParams.height = -1;
        windowLayoutParams.x = 0;
        windowLayoutParams.y = 0;
        WindowUtils.INSTANCE.addFlag(windowLayoutParams, 2);
        windowLayoutParams.dimAmount = 0.5f;
        setStateListAnimator(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9612q.m13917h(context, "context");
        this.onDialogClosed = OverlayDialog$onDialogClosed$1.INSTANCE;
        setOnClickListener(new View.OnClickListener() { // from class: com.discord.mobile_voice_overlay.views.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverlayDialog._init_$lambda$0(OverlayDialog.this, view);
            }
        });
        WindowManager.LayoutParams windowLayoutParams = getWindowLayoutParams();
        windowLayoutParams.width = -1;
        windowLayoutParams.height = -1;
        windowLayoutParams.x = 0;
        windowLayoutParams.y = 0;
        WindowUtils.INSTANCE.addFlag(windowLayoutParams, 2);
        windowLayoutParams.dimAmount = 0.5f;
        setStateListAnimator(null);
    }
}
