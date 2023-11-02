package com.facebook.react.views.swiperefresh;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RefreshEvent extends Event<RefreshEvent> {
    @Deprecated
    protected RefreshEvent(int i) {
        this(-1, i);
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topRefresh";
    }

    public RefreshEvent(int i, int i2) {
        super(i, i2);
    }
}