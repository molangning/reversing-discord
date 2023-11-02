package com.facebook.react.uimanager;

import android.graphics.Rect;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface ReactClippingViewGroup {
    void getClippingRect(Rect rect);

    boolean getRemoveClippedSubviews();

    void setRemoveClippedSubviews(boolean z);

    void updateClippingRect();
}