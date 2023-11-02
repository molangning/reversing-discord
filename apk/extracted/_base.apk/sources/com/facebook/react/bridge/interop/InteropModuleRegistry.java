package com.facebook.react.bridge.interop;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.config.ReactFeatureFlags;
import java.util.HashMap;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class InteropModuleRegistry {
    private final HashMap<Class, Object> supportedModules = new HashMap<>();

    private boolean checkReactFeatureFlagsConditions() {
        return ReactFeatureFlags.enableFabricRenderer && ReactFeatureFlags.unstable_useFabricInterop;
    }

    public <T extends JavaScriptModule> T getInteropModule(Class<T> cls) {
        if (checkReactFeatureFlagsConditions()) {
            return (T) this.supportedModules.get(cls);
        }
        return null;
    }

    public <T extends JavaScriptModule> void registerInteropModule(Class<T> cls, Object obj) {
        if (checkReactFeatureFlagsConditions()) {
            this.supportedModules.put(cls, obj);
        }
    }

    public <T extends JavaScriptModule> boolean shouldReturnInteropModule(Class<T> cls) {
        return checkReactFeatureFlagsConditions() && this.supportedModules.containsKey(cls);
    }
}
