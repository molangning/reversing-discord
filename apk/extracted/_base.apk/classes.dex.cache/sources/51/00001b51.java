package com.discord.nearby;

import android.app.Activity;
import com.discord.nearby.reactevents.OnNearbyErrorEvent;
import com.discord.nearby.reactevents.OnNearbyMessageLostEvent;
import com.discord.nearby.reactevents.OnNearbyMessageReceivedEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import pf.C11591x;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0007J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0007J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\fH\u0007J\b\u0010\u0016\u001a\u00020\nH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m14357d2 = {"Lcom/discord/nearby/NearbyHelperModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "manager", "Lcom/discord/nearby/NearbyManager;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "addListener", "", "type", "", "getName", "listenForNearbyMessages", "publishNearbyMessage", "message", "removeListeners", "count", "", "setupNearbyPermission", "apiKey", "stopNearby", "nearby_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class NearbyHelperModule extends ReactContextBaseJavaModule {
    private final NearbyManager manager;
    private final ReactApplicationContext reactContext;
    private final ReactEvents reactEvents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyHelperModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.reactEvents = new ReactEvents(C11591x.m7577a("nearbyMessageReceived", C9591f0.m13969b(OnNearbyMessageReceivedEvent.class)), C11591x.m7577a("nearbyMessageLost", C9591f0.m13969b(OnNearbyMessageLostEvent.class)), C11591x.m7577a("nearbyError", C9591f0.m13969b(OnNearbyErrorEvent.class)));
        this.manager = new NearbyManager(new NearbyHelperModule$manager$1(this), new NearbyHelperModule$manager$2(this), new NearbyHelperModule$manager$3(this));
    }

    @ReactMethod
    public final void addListener(String type) {
        C9612q.m13917h(type, "type");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "NearbyHelper";
    }

    @ReactMethod
    public final void listenForNearbyMessages() {
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            this.manager.enableNearby(currentActivity);
        }
    }

    @ReactMethod
    public final void publishNearbyMessage(String message) {
        C9612q.m13917h(message, "message");
        this.manager.setOutboundMessage(message);
    }

    @ReactMethod
    public final void removeListeners(int i) {
    }

    @ReactMethod
    public final void setupNearbyPermission(String apiKey) {
        C9612q.m13917h(apiKey, "apiKey");
    }

    @ReactMethod
    public final void stopNearby() {
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            this.manager.disableNearby(currentActivity);
        }
    }
}