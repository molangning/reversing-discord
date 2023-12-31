package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface StateWrapper {
    void destroyState();

    ReadableNativeMap getStateData();

    ReadableMapBuffer getStateDataMapBuffer();

    void updateState(WritableMap writableMap);
}