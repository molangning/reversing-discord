package com.discord.bridge;

import com.facebook.react.ReactPackage;
import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022 \b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0002J\u001a\u0010\u000b\u001a\u00020\t2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\"\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0002¨\u0006\u0013"}, m14357d2 = {"Lcom/discord/bridge/DCDModuleProvider;", "", "Lkotlin/Function1;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "onNativeModule", "Lcom/facebook/react/uimanager/ViewManager;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "onViewManager", "Lcom/facebook/react/ReactPackage;", "getLegacyPackageForModuleWithViewManager", "getLegacyPackageForModule", "", "moduleName", "Lcom/facebook/react/bridge/NativeModule;", "Lcom/facebook/react/TurboReactPackage;", "getTurboPackageForModule", "<init>", "()V", "app_googleRelease"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class DCDModuleProvider {
    public static final DCDModuleProvider INSTANCE = new DCDModuleProvider();

    private DCDModuleProvider() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReactPackage getLegacyPackageForModuleWithViewManager$default(DCDModuleProvider dCDModuleProvider, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            function12 = null;
        }
        return dCDModuleProvider.getLegacyPackageForModuleWithViewManager(function1, function12);
    }

    public final ReactPackage getLegacyPackageForModule(Function1<? super ReactApplicationContext, ? extends ReactContextBaseJavaModule> onNativeModule) {
        C9612q.m13917h(onNativeModule, "onNativeModule");
        return getLegacyPackageForModuleWithViewManager$default(this, onNativeModule, null, 2, null);
    }

    public final ReactPackage getLegacyPackageForModuleWithViewManager(final Function1<? super ReactApplicationContext, ? extends ReactContextBaseJavaModule> function1, final Function1<? super ReactApplicationContext, ? extends ViewManager<?, LayoutShadowNode>> function12) {
        return new ReactPackage() { // from class: com.discord.bridge.DCDModuleProvider$getLegacyPackageForModuleWithViewManager$1
            @Override // com.facebook.react.ReactPackage
            public List<ReactContextBaseJavaModule> createNativeModules(ReactApplicationContext reactContext) {
                ReactContextBaseJavaModule reactContextBaseJavaModule;
                List<ReactContextBaseJavaModule> m14100m;
                C9612q.m13917h(reactContext, "reactContext");
                Function1<ReactApplicationContext, ReactContextBaseJavaModule> function13 = function1;
                if (function13 != null) {
                    reactContextBaseJavaModule = function13.invoke(reactContext);
                } else {
                    reactContextBaseJavaModule = null;
                }
                m14100m = C9545j.m14100m(reactContextBaseJavaModule);
                return m14100m;
            }

            @Override // com.facebook.react.ReactPackage
            public List<ViewManager<?, LayoutShadowNode>> createViewManagers(ReactApplicationContext reactContext) {
                ViewManager<?, LayoutShadowNode> viewManager;
                List<ViewManager<?, LayoutShadowNode>> m14100m;
                C9612q.m13917h(reactContext, "reactContext");
                Function1<ReactApplicationContext, ViewManager<?, LayoutShadowNode>> function13 = function12;
                if (function13 != null) {
                    viewManager = function13.invoke(reactContext);
                } else {
                    viewManager = null;
                }
                m14100m = C9545j.m14100m(viewManager);
                return m14100m;
            }
        };
    }

    public final TurboReactPackage getTurboPackageForModule(String moduleName, Function1<? super ReactApplicationContext, ? extends NativeModule> onNativeModule) {
        C9612q.m13917h(moduleName, "moduleName");
        C9612q.m13917h(onNativeModule, "onNativeModule");
        return new DCDModuleProvider$getTurboPackageForModule$1(moduleName, onNativeModule);
    }
}