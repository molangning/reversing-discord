package com.facebook.react.modules.deviceinfo;

import android.content.Context;
import com.facebook.fbreact.specs.NativeDeviceInfoSpec;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = NativeDeviceInfoSpec.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DeviceInfoModule extends NativeDeviceInfoSpec implements LifecycleEventListener {
    private float mFontScale;
    private ReadableMap mPreviousDisplayMetrics;
    private final ReactApplicationContext mReactApplicationContext;

    public DeviceInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(reactApplicationContext);
        this.mFontScale = reactApplicationContext.getResources().getConfiguration().fontScale;
        this.mReactApplicationContext = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public void emitUpdateDimensionsEvent() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        if (reactApplicationContext == null) {
            return;
        }
        if (reactApplicationContext.hasActiveReactInstance()) {
            WritableMap displayMetricsWritableMap = DisplayMetricsHolder.getDisplayMetricsWritableMap(this.mFontScale);
            ReadableMap readableMap = this.mPreviousDisplayMetrics;
            if (readableMap == null) {
                this.mPreviousDisplayMetrics = displayMetricsWritableMap.copy();
                return;
            } else if (!displayMetricsWritableMap.equals(readableMap)) {
                this.mPreviousDisplayMetrics = displayMetricsWritableMap.copy();
                this.mReactApplicationContext.emitDeviceEvent("didUpdateDimensions", displayMetricsWritableMap);
                return;
            } else {
                return;
            }
        }
        ReactSoftExceptionLogger.logSoftException(NativeDeviceInfoSpec.NAME, new ReactNoCrashSoftException("No active CatalystInstance, cannot emitUpdateDimensionsEvent"));
    }

    @Override // com.facebook.fbreact.specs.NativeDeviceInfoSpec
    public Map<String, Object> getTypedExportedConstants() {
        WritableMap displayMetricsWritableMap = DisplayMetricsHolder.getDisplayMetricsWritableMap(this.mFontScale);
        this.mPreviousDisplayMetrics = displayMetricsWritableMap.copy();
        HashMap hashMap = new HashMap();
        hashMap.put("Dimensions", displayMetricsWritableMap.toHashMap());
        return hashMap;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        if (reactApplicationContext != null) {
            reactApplicationContext.removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        if (reactApplicationContext == null) {
            return;
        }
        float f = reactApplicationContext.getResources().getConfiguration().fontScale;
        if (this.mFontScale != f) {
            this.mFontScale = f;
            emitUpdateDimensionsEvent();
        }
    }

    public DeviceInfoModule(Context context) {
        super(null);
        this.mReactApplicationContext = null;
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(context);
        this.mFontScale = context.getResources().getConfiguration().fontScale;
    }
}