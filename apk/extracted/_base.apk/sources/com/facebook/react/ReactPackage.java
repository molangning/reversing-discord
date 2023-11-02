package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface ReactPackage {
    List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext);

    List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext);
}
