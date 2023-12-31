package com.facebook.react;

import com.facebook.jni.HybridData;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.turbomodule.core.TurboModuleManagerDelegate;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class CompositeReactPackageTurboModuleManagerDelegate extends ReactPackageTurboModuleManagerDelegate {
    private static volatile boolean sIsSoLibraryLoaded;
    private final List<TurboModuleManagerDelegate> mDelegates;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class Builder extends ReactPackageTurboModuleManagerDelegate.Builder {
        private final List<ReactPackageTurboModuleManagerDelegate.Builder> mDelegatesBuilder;

        public Builder(List<ReactPackageTurboModuleManagerDelegate.Builder> list) {
            this.mDelegatesBuilder = list;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.ReactPackageTurboModuleManagerDelegate.Builder
        public ReactPackageTurboModuleManagerDelegate build(ReactApplicationContext reactApplicationContext, List<ReactPackage> list) {
            ArrayList arrayList = new ArrayList();
            for (ReactPackageTurboModuleManagerDelegate.Builder builder : this.mDelegatesBuilder) {
                arrayList.add(builder.build(reactApplicationContext, Collections.emptyList()));
            }
            return new CompositeReactPackageTurboModuleManagerDelegate(reactApplicationContext, list, arrayList);
        }
    }

    private CompositeReactPackageTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List<ReactPackage> list, List<TurboModuleManagerDelegate> list2) {
        super(reactApplicationContext, list);
        this.mDelegates = list2;
        for (TurboModuleManagerDelegate turboModuleManagerDelegate : list2) {
            addTurboModuleManagerDelegate(turboModuleManagerDelegate);
        }
    }

    private native void addTurboModuleManagerDelegate(TurboModuleManagerDelegate turboModuleManagerDelegate);

    @Override // com.facebook.react.turbomodule.core.TurboModuleManagerDelegate
    protected native HybridData initHybrid();

    @Override // com.facebook.react.turbomodule.core.TurboModuleManagerDelegate
    protected synchronized void maybeLoadOtherSoLibraries() {
        if (!sIsSoLibraryLoaded) {
            SoLoader.m30164r("turbomodulejsijni");
            sIsSoLibraryLoaded = true;
        }
    }
}
