package com.reactnativecommunity.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.TouchesHelper;

/* renamed from: com.reactnativecommunity.slider.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5399b extends Event<C5399b> {

    /* renamed from: a */
    private final double f15305a;

    /* renamed from: b */
    private final boolean f15306b;

    public C5399b(int i, double d, boolean z) {
        super(i);
        this.f15305a = d;
        this.f15306b = z;
    }

    /* renamed from: c */
    private WritableMap m25280c() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(TouchesHelper.TARGET_KEY, getViewTag());
        createMap.putDouble("value", m25282a());
        createMap.putBoolean("fromUser", m25281b());
        return createMap;
    }

    /* renamed from: a */
    public double m25282a() {
        return this.f15305a;
    }

    /* renamed from: b */
    public boolean m25281b() {
        return this.f15306b;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        return m25280c();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topChange";
    }
}