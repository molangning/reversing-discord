package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface ClipViewManagerInterface<T extends View> {
    void setClipToCircle(T t, boolean z);

    void setCutouts(T t, ReadableArray readableArray);
}