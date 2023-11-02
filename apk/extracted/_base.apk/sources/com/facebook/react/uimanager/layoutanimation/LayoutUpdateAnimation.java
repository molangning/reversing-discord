package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class LayoutUpdateAnimation extends AbstractLayoutAnimation {
    private static final boolean USE_TRANSLATE_ANIMATION = false;

    @Override // com.facebook.react.uimanager.layoutanimation.AbstractLayoutAnimation
    Animation createAnimationImpl(View view, int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2 = false;
        if (view.getX() == i && view.getY() == i2) {
            z = false;
        } else {
            z = true;
        }
        if (view.getWidth() != i3 || view.getHeight() != i4) {
            z2 = true;
        }
        if (!z && !z2) {
            return null;
        }
        return new PositionAndSizeAnimation(view, i, i2, i3, i4);
    }

    @Override // com.facebook.react.uimanager.layoutanimation.AbstractLayoutAnimation
    boolean isValid() {
        return this.mDurationMs > 0;
    }
}
