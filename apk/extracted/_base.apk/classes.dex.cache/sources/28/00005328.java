package p454z1;

import com.brentvatne.exoplayer.C2766c;
import com.brentvatne.exoplayer.InterfaceC2771f;
import com.brentvatne.exoplayer.ReactExoplayerViewManager;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collections;
import java.util.List;

/* renamed from: z1.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C14071c implements ReactPackage {

    /* renamed from: a */
    private InterfaceC2771f f36224a;

    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        if (this.f36224a == null) {
            this.f36224a = new C2766c(reactApplicationContext);
        }
        return Collections.singletonList(new ReactExoplayerViewManager(this.f36224a));
    }
}