package com.facebook.react;

import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.TurboModuleManagerDelegate;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import p058d5.C5743a;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class ReactPackageTurboModuleManagerDelegate extends TurboModuleManagerDelegate {
    private final List<ModuleProvider> mModuleProviders = new ArrayList();
    private final Map<ModuleProvider, Map<String, ReactModuleInfo>> mPackageModuleInfos = new HashMap();

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class Builder {
        private ReactApplicationContext mContext;
        private List<ReactPackage> mPackages;

        public ReactPackageTurboModuleManagerDelegate build() {
            C5743a.m24582d(this.mContext, "The ReactApplicationContext must be provided to create ReactPackageTurboModuleManagerDelegate");
            C5743a.m24582d(this.mPackages, "A set of ReactPackages must be provided to create ReactPackageTurboModuleManagerDelegate");
            return build(this.mContext, this.mPackages);
        }

        public abstract ReactPackageTurboModuleManagerDelegate build(ReactApplicationContext reactApplicationContext, List<ReactPackage> list);

        public Builder setPackages(List<ReactPackage> list) {
            this.mPackages = new ArrayList(list);
            return this;
        }

        public Builder setReactApplicationContext(ReactApplicationContext reactApplicationContext) {
            this.mContext = reactApplicationContext;
            return this;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface ModuleProvider {
        NativeModule getModule(String str);
    }

    public ReactPackageTurboModuleManagerDelegate(final ReactApplicationContext reactApplicationContext, List<ReactPackage> list) {
        String name;
        ReactModuleInfo reactModuleInfo;
        for (ReactPackage reactPackage : list) {
            if (reactPackage instanceof TurboReactPackage) {
                final TurboReactPackage turboReactPackage = (TurboReactPackage) reactPackage;
                ModuleProvider moduleProvider = new ModuleProvider() { // from class: com.facebook.react.ReactPackageTurboModuleManagerDelegate.1
                    @Override // com.facebook.react.ReactPackageTurboModuleManagerDelegate.ModuleProvider
                    public NativeModule getModule(String str) {
                        return turboReactPackage.getModule(str, reactApplicationContext);
                    }
                };
                this.mModuleProviders.add(moduleProvider);
                this.mPackageModuleInfos.put(moduleProvider, turboReactPackage.getReactModuleInfoProvider().getReactModuleInfos());
            } else if (shouldSupportLegacyPackages() && (reactPackage instanceof LazyReactPackage)) {
                LazyReactPackage lazyReactPackage = (LazyReactPackage) reactPackage;
                List<ModuleSpec> nativeModules = lazyReactPackage.getNativeModules(reactApplicationContext);
                final HashMap hashMap = new HashMap();
                for (ModuleSpec moduleSpec : nativeModules) {
                    hashMap.put(moduleSpec.getName(), moduleSpec.getProvider());
                }
                ModuleProvider moduleProvider2 = new ModuleProvider() { // from class: com.facebook.react.ReactPackageTurboModuleManagerDelegate.2
                    @Override // com.facebook.react.ReactPackageTurboModuleManagerDelegate.ModuleProvider
                    public NativeModule getModule(String str) {
                        Provider provider = (Provider) hashMap.get(str);
                        if (provider != null) {
                            return (NativeModule) provider.get();
                        }
                        return null;
                    }
                };
                this.mModuleProviders.add(moduleProvider2);
                this.mPackageModuleInfos.put(moduleProvider2, lazyReactPackage.getReactModuleInfoProvider().getReactModuleInfos());
            } else if (!shouldSupportLegacyPackages() || !(reactPackage instanceof ReactInstancePackage)) {
                if (shouldSupportLegacyPackages()) {
                    List<NativeModule> createNativeModules = reactPackage.createNativeModules(reactApplicationContext);
                    final HashMap hashMap2 = new HashMap();
                    HashMap hashMap3 = new HashMap();
                    for (NativeModule nativeModule : createNativeModules) {
                        Class<?> cls = nativeModule.getClass();
                        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
                        if (reactModule != null) {
                            name = reactModule.name();
                        } else {
                            name = nativeModule.getName();
                        }
                        if (reactModule != null) {
                            reactModuleInfo = new ReactModuleInfo(name, cls.getName(), reactModule.canOverrideExistingModule(), true, reactModule.hasConstants(), reactModule.isCxxModule(), TurboModule.class.isAssignableFrom(cls));
                        } else {
                            reactModuleInfo = new ReactModuleInfo(name, cls.getName(), nativeModule.canOverrideExistingModule(), true, true, CxxModuleWrapper.class.isAssignableFrom(cls), TurboModule.class.isAssignableFrom(cls));
                        }
                        hashMap3.put(name, reactModuleInfo);
                        hashMap2.put(name, nativeModule);
                    }
                    ModuleProvider moduleProvider3 = new ModuleProvider() { // from class: com.facebook.react.ReactPackageTurboModuleManagerDelegate.3
                        @Override // com.facebook.react.ReactPackageTurboModuleManagerDelegate.ModuleProvider
                        public NativeModule getModule(String str) {
                            return (NativeModule) hashMap2.get(str);
                        }
                    };
                    this.mModuleProviders.add(moduleProvider3);
                    this.mPackageModuleInfos.put(moduleProvider3, hashMap3);
                }
            }
        }
    }

    private TurboModule resolveModule(String str) {
        NativeModule nativeModule = null;
        for (ModuleProvider moduleProvider : this.mModuleProviders) {
            try {
                ReactModuleInfo reactModuleInfo = this.mPackageModuleInfos.get(moduleProvider).get(str);
                if (reactModuleInfo != null && reactModuleInfo.isTurboModule() && (nativeModule == null || reactModuleInfo.canOverrideExistingModule())) {
                    NativeModule module = moduleProvider.getModule(str);
                    if (module != null) {
                        nativeModule = module;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        if (!(nativeModule instanceof TurboModule)) {
            return null;
        }
        return (TurboModule) nativeModule;
    }

    private static boolean shouldSupportLegacyPackages() {
        return ReactFeatureFlags.enableBridgelessArchitecture && ReactFeatureFlags.unstable_useTurboModuleInterop;
    }

    @Override // com.facebook.react.turbomodule.core.TurboModuleManagerDelegate
    public List<String> getEagerInitModuleNames() {
        ArrayList arrayList = new ArrayList();
        for (ModuleProvider moduleProvider : this.mModuleProviders) {
            for (ReactModuleInfo reactModuleInfo : this.mPackageModuleInfos.get(moduleProvider).values()) {
                if (reactModuleInfo.isTurboModule() && reactModuleInfo.needsEagerInit()) {
                    arrayList.add(reactModuleInfo.name());
                }
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.turbomodule.core.TurboModuleManagerDelegate
    @InterfaceC6107a
    public CxxModuleWrapper getLegacyCxxModule(String str) {
        TurboModule resolveModule = resolveModule(str);
        if (resolveModule == null || !(resolveModule instanceof CxxModuleWrapper)) {
            return null;
        }
        return (CxxModuleWrapper) resolveModule;
    }

    @Override // com.facebook.react.turbomodule.core.TurboModuleManagerDelegate
    public TurboModule getModule(String str) {
        TurboModule resolveModule = resolveModule(str);
        if (resolveModule == null || (resolveModule instanceof CxxModuleWrapper)) {
            return null;
        }
        return resolveModule;
    }
}