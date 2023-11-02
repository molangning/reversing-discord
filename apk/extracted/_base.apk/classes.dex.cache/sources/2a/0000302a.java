package com.th3rdwave.safeareacontext;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.uimanager.ViewManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u001e\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, m14357d2 = {"Lcom/th3rdwave/safeareacontext/c;", "Lcom/facebook/react/TurboReactPackage;", "", ZeroconfModule.KEY_SERVICE_NAME, "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lcom/facebook/react/bridge/NativeModule;", "getModule", "Lcom/facebook/react/module/model/ReactModuleInfoProvider;", "getReactModuleInfoProvider", "", "Lcom/facebook/react/uimanager/ViewManager;", "createViewManagers", "<init>", "()V", "react-native-safe-area-context_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.th3rdwave.safeareacontext.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5669c extends TurboReactPackage {
    /* renamed from: b */
    public static final Map m24782b(Map reactModuleInfoMap) {
        C9612q.m13917h(reactModuleInfoMap, "$reactModuleInfoMap");
        return reactModuleInfoMap;
    }

    @Override // com.facebook.react.TurboReactPackage, com.facebook.react.ReactPackage
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactContext) {
        List<ViewManager<?, ?>> m14101l;
        C9612q.m13917h(reactContext, "reactContext");
        m14101l = C9545j.m14101l(new SafeAreaProviderManager(), new SafeAreaViewManager());
        return m14101l;
    }

    @Override // com.facebook.react.TurboReactPackage
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(reactContext, "reactContext");
        if (C9612q.m13922c(name, SafeAreaContextModule.NAME)) {
            return new SafeAreaContextModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.TurboReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        final HashMap hashMap = new HashMap();
        Class cls = new Class[]{SafeAreaContextModule.class}[0];
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            hashMap.put(reactModule.name(), new ReactModuleInfo(reactModule.name(), cls.getName(), true, reactModule.needsEagerInit(), reactModule.hasConstants(), reactModule.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
        }
        return new ReactModuleInfoProvider() { // from class: com.th3rdwave.safeareacontext.b
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                Map m24782b;
                m24782b = C5669c.m24782b(hashMap);
                return m24782b;
            }
        };
    }
}