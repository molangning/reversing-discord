package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface RNSScreenManagerInterface<T extends View> {
    void setActivityState(T t, float f);

    void setCustomAnimationOnSwipe(T t, boolean z);

    void setFullScreenSwipeEnabled(T t, boolean z);

    void setGestureEnabled(T t, boolean z);

    void setGestureResponseDistance(T t, ReadableMap readableMap);

    void setHideKeyboardOnSwipe(T t, boolean z);

    void setHomeIndicatorHidden(T t, boolean z);

    void setNativeBackButtonDismissalEnabled(T t, boolean z);

    void setNavigationBarColor(T t, Integer num);

    void setNavigationBarHidden(T t, boolean z);

    void setPreventNativeDismiss(T t, boolean z);

    void setReplaceAnimation(T t, String str);

    void setScreenOrientation(T t, String str);

    void setSheetAllowedDetents(T t, String str);

    void setSheetCornerRadius(T t, float f);

    void setSheetExpandsWhenScrolledToEdge(T t, boolean z);

    void setSheetGrabberVisible(T t, boolean z);

    void setSheetLargestUndimmedDetent(T t, String str);

    void setStackAnimation(T t, String str);

    void setStackPresentation(T t, String str);

    void setStatusBarAnimation(T t, String str);

    void setStatusBarColor(T t, Integer num);

    void setStatusBarHidden(T t, boolean z);

    void setStatusBarStyle(T t, String str);

    void setStatusBarTranslucent(T t, boolean z);

    void setSwipeDirection(T t, String str);

    void setTransitionDuration(T t, int i);
}
