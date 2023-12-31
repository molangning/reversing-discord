package com.discord.mobile_voice_overlay;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Handler;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.discord.mobile_voice_overlay.views.OverlayBubbleWrap;
import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "voiceBubble", "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MobileVoiceOverlay$onTrashVoiceBubble$1 extends AbstractC9614s implements Function1<OverlayVoiceBubble, Unit> {
    final /* synthetic */ MobileVoiceOverlay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileVoiceOverlay$onTrashVoiceBubble$1(MobileVoiceOverlay mobileVoiceOverlay) {
        super(1);
        this.this$0 = mobileVoiceOverlay;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OverlayVoiceBubble overlayVoiceBubble) {
        invoke2(overlayVoiceBubble);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(OverlayVoiceBubble voiceBubble) {
        C9612q.m13917h(voiceBubble, "voiceBubble");
        voiceBubble.moveToAnchorPoint();
        Animator invoke$lambda$2 = AnimatorInflater.loadAnimator(voiceBubble.getContext(), C3317R.animator.fade_out);
        final MobileVoiceOverlay mobileVoiceOverlay = this.this$0;
        invoke$lambda$2.setTarget(voiceBubble);
        C9612q.m13918g(invoke$lambda$2, "invoke$lambda$2");
        invoke$lambda$2.addListener(new Animator.AnimatorListener() { // from class: com.discord.mobile_voice_overlay.MobileVoiceOverlay$onTrashVoiceBubble$1$invoke$lambda$2$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                C9612q.m13917h(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C9612q.m13917h(animator, "animator");
                if (ThreadUtilsKt.isOnMainThread()) {
                    MobileVoiceOverlay.invokeJs$default(MobileVoiceOverlay.this, "onLayoutTrashed", null, 2, null);
                    return;
                }
                Handler uiHandler = ThreadUtilsKt.getUiHandler();
                final MobileVoiceOverlay mobileVoiceOverlay2 = MobileVoiceOverlay.this;
                uiHandler.post(new Runnable() { // from class: com.discord.mobile_voice_overlay.MobileVoiceOverlay$onTrashVoiceBubble$1$invoke$lambda$2$lambda$1$$inlined$postOrRunOnMainThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        MobileVoiceOverlay.invokeJs$default(MobileVoiceOverlay.this, "onLayoutTrashed", null, 2, null);
                    }
                });
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
        invoke$lambda$2.start();
        OverlayBubbleWrap.animateToCoordinate$default(voiceBubble, (int) voiceBubble.getX(), ((int) voiceBubble.getY()) + (voiceBubble.getHeight() / 2), null, 4, null);
    }
}