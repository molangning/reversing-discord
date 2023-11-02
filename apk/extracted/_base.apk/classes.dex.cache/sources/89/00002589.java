package com.facebook.react.fabric.interop;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.uimanager.events.Event;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class InteropEvent extends Event<InteropEvent> {
    private final WritableMap mEventData;
    private final String mName;

    public InteropEvent(String str, WritableMap writableMap, int i, int i2) {
        super(i, i2);
        this.mName = str;
        this.mEventData = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @VisibleForTesting
    public WritableMap getEventData() {
        return this.mEventData;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return this.mName;
    }
}