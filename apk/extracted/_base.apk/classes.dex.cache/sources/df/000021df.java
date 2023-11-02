package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class NativeAnimatedTurboModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "NativeAnimatedTurboModule";

    public NativeAnimatedTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void addAnimatedEventToView(double d, String str, ReadableMap readableMap);

    @ReactMethod
    @InterfaceC6107a
    public abstract void addListener(String str);

    @ReactMethod
    @InterfaceC6107a
    public abstract void connectAnimatedNodeToView(double d, double d2);

    @ReactMethod
    @InterfaceC6107a
    public abstract void connectAnimatedNodes(double d, double d2);

    @ReactMethod
    @InterfaceC6107a
    public abstract void createAnimatedNode(double d, ReadableMap readableMap);

    @ReactMethod
    @InterfaceC6107a
    public abstract void disconnectAnimatedNodeFromView(double d, double d2);

    @ReactMethod
    @InterfaceC6107a
    public abstract void disconnectAnimatedNodes(double d, double d2);

    @ReactMethod
    @InterfaceC6107a
    public abstract void dropAnimatedNode(double d);

    @ReactMethod
    @InterfaceC6107a
    public abstract void extractAnimatedNodeOffset(double d);

    @ReactMethod
    @InterfaceC6107a
    public abstract void finishOperationBatch();

    @ReactMethod
    @InterfaceC6107a
    public abstract void flattenAnimatedNodeOffset(double d);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void getValue(double d, Callback callback);

    @ReactMethod
    @InterfaceC6107a
    public void queueAndExecuteBatchedOperations(ReadableArray readableArray) {
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void removeAnimatedEventFromView(double d, String str, double d2);

    @ReactMethod
    @InterfaceC6107a
    public abstract void removeListeners(double d);

    @ReactMethod
    @InterfaceC6107a
    public abstract void restoreDefaultValues(double d);

    @ReactMethod
    @InterfaceC6107a
    public abstract void setAnimatedNodeOffset(double d, double d2);

    @ReactMethod
    @InterfaceC6107a
    public abstract void setAnimatedNodeValue(double d, double d2);

    @ReactMethod
    @InterfaceC6107a
    public abstract void startAnimatingNode(double d, double d2, ReadableMap readableMap, Callback callback);

    @ReactMethod
    @InterfaceC6107a
    public abstract void startListeningToAnimatedNodeValue(double d);

    @ReactMethod
    @InterfaceC6107a
    public abstract void startOperationBatch();

    @ReactMethod
    @InterfaceC6107a
    public abstract void stopAnimation(double d);

    @ReactMethod
    @InterfaceC6107a
    public abstract void stopListeningToAnimatedNodeValue(double d);

    @ReactMethod
    @InterfaceC6107a
    public void updateAnimatedNodeConfig(double d, ReadableMap readableMap) {
    }
}