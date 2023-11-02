package io.sentry.react;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RNSentryModule extends ReactContextBaseJavaModule {
    private final C8151k impl;

    public RNSentryModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.impl = new C8151k(reactApplicationContext);
    }

    @ReactMethod
    public void addBreadcrumb(ReadableMap readableMap) {
        this.impl.m18401j(readableMap);
    }

    @ReactMethod
    public void captureEnvelope(ReadableArray readableArray, ReadableMap readableMap, Promise promise) {
        this.impl.m18399l(readableArray, readableMap, promise);
    }

    @ReactMethod
    public void captureScreenshot(Promise promise) {
        this.impl.m18398m(promise);
    }

    @ReactMethod
    public void clearBreadcrumbs() {
        this.impl.m18396o();
    }

    @ReactMethod
    public void closeNativeSdk(Promise promise) {
        this.impl.m18395p(promise);
    }

    @ReactMethod
    public void crash() {
        this.impl.m18394q();
    }

    @ReactMethod
    public void disableNativeFramesTracking() {
        this.impl.m18393r();
    }

    @ReactMethod
    public void enableNativeFramesTracking() {
        this.impl.m18392s();
    }

    @ReactMethod
    public void fetchModules(Promise promise) {
        this.impl.m18391t(promise);
    }

    @ReactMethod
    public void fetchNativeAppStart(Promise promise) {
        this.impl.m18390u(promise);
    }

    @ReactMethod
    public void fetchNativeDeviceContexts(Promise promise) {
        this.impl.m18389v(promise);
    }

    @ReactMethod
    public void fetchNativeFrames(Promise promise) {
        this.impl.m18388w(promise);
    }

    @ReactMethod
    public void fetchNativeRelease(Promise promise) {
        this.impl.m18387x(promise);
    }

    @ReactMethod
    public void fetchNativeSdkInfo(Promise promise) {
        this.impl.m18386y(promise);
    }

    @ReactMethod
    public void fetchViewHierarchy(Promise promise) {
        this.impl.m18385z(promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSentry";
    }

    @ReactMethod
    public void initNativeSdk(ReadableMap readableMap, Promise promise) {
        this.impl.m18430D(readableMap, promise);
    }

    @ReactMethod
    public void setContext(String str, ReadableMap readableMap) {
        this.impl.m18419O(str, readableMap);
    }

    @ReactMethod
    public void setExtra(String str, String str2) {
        this.impl.m18416R(str, str2);
    }

    @ReactMethod
    public void setTag(String str, String str2) {
        this.impl.m18415S(str, str2);
    }

    @ReactMethod
    public void setUser(ReadableMap readableMap, ReadableMap readableMap2) {
        this.impl.m18414T(readableMap, readableMap2);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap startProfiling() {
        return this.impl.m18413U();
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap stopProfiling() {
        return this.impl.m18412V();
    }
}