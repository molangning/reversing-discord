package com.discord.mobile_voice_overlay;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1365w0;
import com.discord.mobile_voice_overlay.views.OverlayMenuBubbleDialog;
import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "menuDialog", "Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MobileVoiceOverlay$voiceBubbleProvider$1$1$1 extends AbstractC9614s implements Function1<OverlayMenuBubbleDialog, Unit> {
    final /* synthetic */ Rect $marginRect;
    final /* synthetic */ OverlayVoiceBubble $voiceBubble;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileVoiceOverlay$voiceBubbleProvider$1$1$1(OverlayVoiceBubble overlayVoiceBubble, Rect rect) {
        super(1);
        this.$voiceBubble = overlayVoiceBubble;
        this.$marginRect = rect;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OverlayMenuBubbleDialog overlayMenuBubbleDialog) {
        invoke2(overlayMenuBubbleDialog);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(OverlayMenuBubbleDialog menuDialog) {
        C9612q.m13917h(menuDialog, "menuDialog");
        ViewGroup.LayoutParams layoutParams = menuDialog.getLinkedAnchorView().getLayoutParams();
        OverlayVoiceBubble overlayVoiceBubble = this.$voiceBubble;
        Rect rect = this.$marginRect;
        layoutParams.width = (overlayVoiceBubble.getWidth() - rect.left) - rect.right;
        layoutParams.height = overlayVoiceBubble.getHeight();
        menuDialog.getLinkedAnchorView().requestLayout();
        menuDialog.getLinkedAnchorView().setTag("Active Voice Bubble");
        final OverlayVoiceBubble overlayVoiceBubble2 = this.$voiceBubble;
        menuDialog.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.discord.mobile_voice_overlay.MobileVoiceOverlay$voiceBubbleProvider$1$1$1.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(final View v) {
                C9612q.m13917h(v, "v");
                final OverlayVoiceBubble overlayVoiceBubble3 = overlayVoiceBubble2;
                if (C1365w0.m37224U(v) && !v.isLayoutRequested()) {
                    View findViewWithTag = v.findViewWithTag("Active Voice Bubble");
                    C9612q.m13918g(findViewWithTag, "v.findViewWithTag(ANCHOR_TAG)");
                    overlayVoiceBubble3.anchorOn(findViewWithTag);
                    return;
                }
                v.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.discord.mobile_voice_overlay.MobileVoiceOverlay$voiceBubbleProvider$1$1$1$2$onViewAttachedToWindow$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        C9612q.m13917h(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        View findViewWithTag2 = v.findViewWithTag("Active Voice Bubble");
                        C9612q.m13918g(findViewWithTag2, "v.findViewWithTag(ANCHOR_TAG)");
                        overlayVoiceBubble3.anchorOn(findViewWithTag2);
                    }
                });
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                C9612q.m13917h(v, "v");
                if (C1365w0.m37225T(overlayVoiceBubble2)) {
                    overlayVoiceBubble2.setBubbleTouchable(true);
                    overlayVoiceBubble2.anchorOff(true);
                }
            }
        });
    }
}