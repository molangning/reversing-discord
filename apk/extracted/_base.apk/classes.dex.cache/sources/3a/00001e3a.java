package com.discord.reactevents;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a$\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0014\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b*\u00020\u0002H\u0002\u001a\u0014\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000e0\u000e*\u00020\u0002H\u0002¨\u0006\u000f"}, m14357d2 = {"emitReactNativeEvent", "", "Landroid/content/Context;", "eventName", "", "serializedEvent", "Lcom/facebook/react/bridge/WritableMap;", "emitReactNativeViewEvent", "targetTag", "", "getEventEmitter", "Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "kotlin.jvm.PlatformType", "getViewEventEmitter", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "react_events_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class EventEmitterUtilsKt {
    public static final void emitReactNativeEvent(Context context, String eventName, WritableMap serializedEvent) {
        C9612q.m13917h(context, "<this>");
        C9612q.m13917h(eventName, "eventName");
        C9612q.m13917h(serializedEvent, "serializedEvent");
        getEventEmitter(context).emit(eventName, serializedEvent);
    }

    public static final void emitReactNativeViewEvent(Context context, String eventName, WritableMap serializedEvent, int i) {
        C9612q.m13917h(context, "<this>");
        C9612q.m13917h(eventName, "eventName");
        C9612q.m13917h(serializedEvent, "serializedEvent");
        getViewEventEmitter(context).receiveEvent(i, eventName, serializedEvent);
    }

    private static final DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter(Context context) {
        C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) ((ReactContext) context).getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    private static final RCTEventEmitter getViewEventEmitter(Context context) {
        C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        return (RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class);
    }
}