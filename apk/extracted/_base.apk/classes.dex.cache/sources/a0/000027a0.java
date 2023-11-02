package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface DCDSegmentedControlManagerInterface<T extends View> {
    void setAccessibilityRoleDescriptions(T t, ReadableArray readableArray);

    void setBackgroundColor(T t, String str);

    void setCornerRadius(T t, int i);

    void setCustomSelectedTintColor(T t, String str);

    void setSelectedSegmentIndex(T t, int i);

    void setSelectedTitleAttributes(T t, ReadableMap readableMap);

    void setTitleAttributes(T t, ReadableMap readableMap);

    void setValues(T t, ReadableArray readableArray);
}