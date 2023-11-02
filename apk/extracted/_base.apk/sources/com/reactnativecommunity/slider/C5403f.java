package com.reactnativecommunity.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.TouchesHelper;

/* renamed from: com.reactnativecommunity.slider.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5403f extends Event<C5403f> {

    /* renamed from: a */
    private final double f15307a;

    public C5403f(int i, double d) {
        super(i);
        this.f15307a = d;
    }

    /* renamed from: b */
    private WritableMap m25262b() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(TouchesHelper.TARGET_KEY, getViewTag());
        createMap.putDouble("value", m25263a());
        return createMap;
    }

    /* renamed from: a */
    public double m25263a() {
        return this.f15307a;
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
        return m25262b();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topSlidingComplete";
    }
}
