package com.facebook.react.viewmanagers;

import android.view.View;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface AnimatableUnderlayViewManagerInterface<T extends View> {
    void setAnimatedBackgroundColorRgba(T t, String str);

    void setAnimatedBorderColorRgba(T t, String str);

    void setAnimatedBorderWidth(T t, float f);

    void setAnimatedBottomLeftRadius(T t, float f);

    void setAnimatedBottomRightRadius(T t, float f);

    void setAnimatedHeight(T t, float f);

    void setAnimatedTopLeftRadius(T t, float f);

    void setAnimatedTopRightRadius(T t, float f);

    void setAnimatedWidth(T t, float f);

    void setClipDirectionX(T t, String str);

    void setClipDirectionY(T t, String str);
}
