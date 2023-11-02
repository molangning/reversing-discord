package com.facebook.react.viewmanagers;

import android.view.View;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface DCDZoomLayoutAndroidManagerInterface<T extends View> {
    void setGestureEnabled(T t, boolean z);

    void setMaximumZoomScale(T t, float f);

    void setMinimumZoomScale(T t, float f);

    void unzoom(T t);

    void zoomTo(T t, float f, float f2);
}