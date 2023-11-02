package com.discord.device.events;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableNativeMap;
import kotlin.Metadata;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/device/events/DeviceThermalStateChangedEvent;", "Lcom/discord/reactevents/ReactEvent;", "state", "", "(I)V", "serialize", "Lcom/facebook/react/bridge/WritableNativeMap;", "device_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class DeviceThermalStateChangedEvent implements ReactEvent {
    private final int state;

    public DeviceThermalStateChangedEvent(int i) {
        this.state = i;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableNativeMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("state", Integer.valueOf(this.state)));
    }
}
