package com.reactnativecommunity.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.TouchesHelper;

/* renamed from: com.reactnativecommunity.slider.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5404g extends Event<C5404g> {

    /* renamed from: a */
    private final double f15308a;

    public C5404g(int i, double d) {
        super(i);
        this.f15308a = d;
    }

    /* renamed from: b */
    private WritableMap m25260b() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(TouchesHelper.TARGET_KEY, getViewTag());
        createMap.putDouble("value", m25261a());
        return createMap;
    }

    /* renamed from: a */
    public double m25261a() {
        return this.f15308a;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        return m25260b();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topSlidingStart";
    }
}