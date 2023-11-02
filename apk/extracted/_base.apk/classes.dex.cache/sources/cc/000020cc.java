package com.discord.timers;

import com.discord.codegen.NativeTimersSpec;
import com.discord.reactevents.ReactEvents;
import com.discord.timers.reactevents.IntervalEvent;
import com.discord.timers.reactevents.TimerEvent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m14357d2 = {"Lcom/discord/timers/TimersModule;", "Lcom/discord/codegen/NativeTimersSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "timersManager", "Lcom/discord/timers/TimersManager;", "addListener", "", "type", "", "clearInterval", "id", "", "clearTimeout", "getName", "onCatalystInstanceDestroy", "removeListeners", "count", "", "setInterval", "timeout", "setTimeout", "Companion", "react_timers_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class TimersModule extends NativeTimersSpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "TimersModule";
    private final ReactEvents reactEvents;
    private final TimersManager timersManager;

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m14357d2 = {"Lcom/discord/timers/TimersModule$Companion;", "", "()V", "NAME", "", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "react_timers_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeModule create(ReactApplicationContext reactContext) {
            C9612q.m13917h(reactContext, "reactContext");
            return new TimersModule(reactContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimersModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        this.reactEvents = new ReactEvents(C11591x.m7577a("timer", C9591f0.m13969b(TimerEvent.class)), C11591x.m7577a("interval", C9591f0.m13969b(IntervalEvent.class)));
        this.timersManager = new TimersManager(reactContext);
    }

    @ReactMethod
    public final void addListener(String type) {
        C9612q.m13917h(type, "type");
    }

    @Override // com.discord.codegen.NativeTimersSpec
    public void clearInterval(double d) {
        this.timersManager.clearInterval((int) d);
    }

    @Override // com.discord.codegen.NativeTimersSpec
    public void clearTimeout(double d) {
        this.timersManager.clearTimeout((int) d);
    }

    @Override // com.discord.codegen.NativeTimersSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "TimersModule";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.timersManager.clean();
    }

    @ReactMethod
    public final void removeListeners(int i) {
    }

    @Override // com.discord.codegen.NativeTimersSpec
    public void setInterval(double d, double d2) {
        this.timersManager.setInterval((int) d, d2, new TimersModule$setInterval$1(this, d));
    }

    @Override // com.discord.codegen.NativeTimersSpec
    public void setTimeout(double d, double d2) {
        this.timersManager.setTimeout((int) d, d2, new TimersModule$setTimeout$1(this, d));
    }
}