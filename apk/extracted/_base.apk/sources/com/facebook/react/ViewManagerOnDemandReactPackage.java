package com.facebook.react;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collection;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface ViewManagerOnDemandReactPackage {
    ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str);

    Collection<String> getViewManagerNames(ReactApplicationContext reactApplicationContext);
}
