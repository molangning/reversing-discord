package com.facebook.react.viewmanagers;

import android.view.View;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface DCDVisualEffectViewManagerInterface<T extends View> {
    void setBlurAmount(T t, float f);

    void setBlurTargetViewNativeId(T t, String str);

    void setBlurTintIOSParityCompensationRgba(T t, String str);

    void setBlurTintRgba(T t, String str);
}