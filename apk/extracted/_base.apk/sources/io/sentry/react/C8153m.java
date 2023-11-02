package io.sentry.react;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.react.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8153m extends TurboReactPackage {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Map m18383b() {
        HashMap hashMap = new HashMap();
        hashMap.put("RNSentry", new ReactModuleInfo("RNSentry", "RNSentry", false, false, true, false, false));
        return hashMap;
    }

    @Override // com.facebook.react.TurboReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("RNSentry")) {
            return new RNSentryModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.TurboReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: io.sentry.react.l
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                Map m18383b;
                m18383b = C8153m.m18383b();
                return m18383b;
            }
        };
    }
}
