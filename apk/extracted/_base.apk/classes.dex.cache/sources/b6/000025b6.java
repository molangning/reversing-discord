package com.facebook.react.modules.appearance;

import android.content.Context;
import androidx.appcompat.app.AppCompatDelegate;
import com.facebook.fbreact.specs.NativeAppearanceSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = NativeAppearanceSpec.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AppearanceModule extends NativeAppearanceSpec {
    private static final String APPEARANCE_CHANGED_EVENT_NAME = "appearanceChanged";
    private String mColorScheme;
    private final OverrideColorScheme mOverrideColorScheme;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface OverrideColorScheme {
        String getScheme();
    }

    public AppearanceModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null);
    }

    private String colorSchemeForCurrentConfiguration(Context context) {
        OverrideColorScheme overrideColorScheme = this.mOverrideColorScheme;
        if (overrideColorScheme != null) {
            return overrideColorScheme.getScheme();
        }
        if ((context.getResources().getConfiguration().uiMode & 48) != 32) {
            return "light";
        }
        return "dark";
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void addListener(String str) {
    }

    public void emitAppearanceChanged(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("colorScheme", str);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent(APPEARANCE_CHANGED_EVENT_NAME, createMap);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public String getColorScheme() {
        Context currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = getReactApplicationContext();
        }
        String colorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(currentActivity);
        this.mColorScheme = colorSchemeForCurrentConfiguration;
        return colorSchemeForCurrentConfiguration;
    }

    public void onConfigurationChanged(Context context) {
        String colorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(context);
        if (!this.mColorScheme.equals(colorSchemeForCurrentConfiguration)) {
            this.mColorScheme = colorSchemeForCurrentConfiguration;
            emitAppearanceChanged(colorSchemeForCurrentConfiguration);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void removeListeners(double d) {
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void setColorScheme(String str) {
        if (str.equals("dark")) {
            AppCompatDelegate.m40743O(2);
        } else if (str.equals("light")) {
            AppCompatDelegate.m40743O(1);
        } else if (str.equals("unspecified")) {
            AppCompatDelegate.m40743O(-1);
        }
    }

    public AppearanceModule(ReactApplicationContext reactApplicationContext, OverrideColorScheme overrideColorScheme) {
        super(reactApplicationContext);
        this.mColorScheme = "light";
        this.mOverrideColorScheme = overrideColorScheme;
        this.mColorScheme = colorSchemeForCurrentConfiguration(reactApplicationContext);
    }
}