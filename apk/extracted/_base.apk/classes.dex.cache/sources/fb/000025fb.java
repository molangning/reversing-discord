package com.facebook.react.modules.devtoolssettings;

import android.content.SharedPreferences;
import com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = NativeDevToolsSettingsManagerSpec.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DevToolsSettingsManagerModule extends NativeDevToolsSettingsManagerSpec {
    private static final String KEY_CONSOLE_PATCH_SETTINGS = "ConsolePatchSettings";
    private static final String KEY_PROFILING_SETTINGS = "ProfilingSettings";
    private static final String SHARED_PREFERENCES_PREFIX = "ReactNative__DevToolsSettings";
    private final SharedPreferences mSharedPreferences;

    public DevToolsSettingsManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mSharedPreferences = reactApplicationContext.getSharedPreferences(SHARED_PREFERENCES_PREFIX, 0);
    }

    @Override // com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec
    public String getConsolePatchSettings() {
        return this.mSharedPreferences.getString(KEY_CONSOLE_PATCH_SETTINGS, null);
    }

    @Override // com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec
    public String getProfilingSettings() {
        return this.mSharedPreferences.getString(KEY_PROFILING_SETTINGS, null);
    }

    @Override // com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec
    public void setConsolePatchSettings(String str) {
        SharedPreferences.Editor edit = this.mSharedPreferences.edit();
        edit.putString(KEY_CONSOLE_PATCH_SETTINGS, str);
        edit.apply();
    }

    @Override // com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec
    public void setProfilingSettings(String str) {
        this.mSharedPreferences.edit().putString(KEY_PROFILING_SETTINGS, str).apply();
    }
}