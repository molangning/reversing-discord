package com.discord.bug_reporter;

import android.content.ContentResolver;
import com.discord.bug_reporter.ScreenshotDetector;
import com.discord.bug_reporter.react.events.ScreenshotTakenEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11591x;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m14357d2 = {"Lcom/discord/bug_reporter/ScreenshotHelperModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "addListener", "", "type", "", "appStateChanged", "isAppActive", "", "getName", "initialize", "registerEventListener", "removeEventListener", "removeListeners", "count", "", "Companion", "bug_reporter_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ScreenshotHelperModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    private static final String SCREENSHOT_TAKEN = "screenshotTaken";
    private final ReactApplicationContext reactContext;
    private final ReactEvents reactEvents;

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m14357d2 = {"Lcom/discord/bug_reporter/ScreenshotHelperModule$Companion;", "", "()V", "SCREENSHOT_TAKEN", "", "bug_reporter_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenshotHelperModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.reactEvents = new ReactEvents(C11591x.m7577a(SCREENSHOT_TAKEN, C9591f0.m13969b(ScreenshotTakenEvent.class)));
    }

    @ReactMethod
    public final void addListener(String type) {
        C9612q.m13917h(type, "type");
        if (C9612q.m13922c(type, SCREENSHOT_TAKEN)) {
            ScreenshotDetector.Companion.get().setScreenshotListener(new ScreenshotHelperModule$addListener$1(this));
        }
    }

    @ReactMethod
    public final void appStateChanged(boolean z) {
        ScreenshotDetector.Companion.get().setActive(z);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ScreenshotHelper";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        ScreenshotDetector.Companion companion = ScreenshotDetector.Companion;
        ContentResolver contentResolver = this.reactContext.getContentResolver();
        C9612q.m13918g(contentResolver, "reactContext.contentResolver");
        companion.init(contentResolver);
    }

    @ReactMethod
    public final void registerEventListener(String type) {
        C9612q.m13917h(type, "type");
        addListener(type);
    }

    @ReactMethod
    public final void removeEventListener(String type) {
        C9612q.m13917h(type, "type");
        if (C9612q.m13922c(type, SCREENSHOT_TAKEN)) {
            ScreenshotDetector.Companion.get().setScreenshotListener(null);
        }
    }

    @ReactMethod
    public final void removeListeners(int i) {
        removeEventListener(SCREENSHOT_TAKEN);
    }
}