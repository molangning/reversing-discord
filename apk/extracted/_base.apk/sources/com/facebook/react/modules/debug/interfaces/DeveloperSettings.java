package com.facebook.react.modules.debug.interfaces;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface DeveloperSettings {
    void addMenuItem(String str);

    boolean isAnimationFpsDebugEnabled();

    boolean isDeviceDebugEnabled();

    boolean isElementInspectorEnabled();

    boolean isFpsDebugEnabled();

    boolean isJSDevModeEnabled();

    boolean isJSMinifyEnabled();

    boolean isRemoteJSDebugEnabled();

    boolean isStartSamplingProfilerOnInit();

    void setRemoteJSDebugEnabled(boolean z);
}
