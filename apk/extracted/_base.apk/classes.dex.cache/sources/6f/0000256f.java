package com.facebook.react.fabric;

import com.facebook.react.bridge.JSIModuleProvider;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import p150i5.C7382a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class FabricJSIModuleProvider implements JSIModuleProvider<UIManager> {
    private final ComponentFactory mComponentFactory;
    private final ReactNativeConfig mConfig;
    private final ReactApplicationContext mReactApplicationContext;
    private final ViewManagerRegistry mViewManagerRegistry;

    public FabricJSIModuleProvider(ReactApplicationContext reactApplicationContext, ComponentFactory componentFactory, ReactNativeConfig reactNativeConfig, ViewManagerRegistry viewManagerRegistry) {
        this.mReactApplicationContext = reactApplicationContext;
        this.mComponentFactory = componentFactory;
        this.mConfig = reactNativeConfig;
        this.mViewManagerRegistry = viewManagerRegistry;
    }

    private FabricUIManager createUIManager(EventBeatManager eventBeatManager) {
        C7382a.m20813c(0L, "FabricJSIModuleProvider.createUIManager");
        FabricUIManager fabricUIManager = new FabricUIManager(this.mReactApplicationContext, this.mViewManagerRegistry, eventBeatManager);
        C7382a.m20809g(0L);
        return fabricUIManager;
    }

    @Override // com.facebook.react.bridge.JSIModuleProvider
    public UIManager get() {
        C7382a.m20813c(0L, "FabricJSIModuleProvider.get");
        EventBeatManager eventBeatManager = new EventBeatManager(this.mReactApplicationContext);
        FabricUIManager createUIManager = createUIManager(eventBeatManager);
        C7382a.m20813c(0L, "FabricJSIModuleProvider.registerBinding");
        new Binding().register(this.mReactApplicationContext.getCatalystInstance().getRuntimeExecutor(), this.mReactApplicationContext.getCatalystInstance().getRuntimeScheduler(), createUIManager, eventBeatManager, this.mComponentFactory, this.mConfig);
        C7382a.m20809g(0L);
        C7382a.m20809g(0L);
        return createUIManager;
    }
}