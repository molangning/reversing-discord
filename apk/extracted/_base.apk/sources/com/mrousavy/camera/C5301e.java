package com.mrousavy.camera;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9544i;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, m14357d2 = {"Lcom/mrousavy/camera/e;", "Lcom/facebook/react/ReactPackage;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "Lcom/facebook/react/bridge/NativeModule;", "createNativeModules", "Lcom/facebook/react/uimanager/ViewManager;", "createViewManagers", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5301e implements ReactPackage {
    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> m14109d;
        C9612q.m13917h(reactContext, "reactContext");
        m14109d = C9544i.m14109d(new CameraViewModule(reactContext));
        return m14109d;
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactContext) {
        List<ViewManager<?, ?>> m14109d;
        C9612q.m13917h(reactContext, "reactContext");
        m14109d = C9544i.m14109d(new CameraViewManager());
        return m14109d;
    }
}
