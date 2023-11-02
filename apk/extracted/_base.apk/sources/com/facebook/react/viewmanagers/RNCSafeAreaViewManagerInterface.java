package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface RNCSafeAreaViewManagerInterface<T extends View> {
    void setEdges(T t, ReadableMap readableMap);

    void setMode(T t, String str);
}
