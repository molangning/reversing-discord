package com.facebook.react.views.modal;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class ShowEvent extends Event<ShowEvent> {
    public static final String EVENT_NAME = "topShow";

    @Deprecated
    protected ShowEvent(int i) {
        this(-1, i);
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return EVENT_NAME;
    }

    public ShowEvent(int i, int i2) {
        super(i, i2);
    }
}