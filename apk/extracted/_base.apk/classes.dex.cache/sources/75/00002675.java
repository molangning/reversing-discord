package com.facebook.react.turbomodule.core;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p058d5.C5743a;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class TurboModuleManager implements JSIModule, TurboModuleRegistry {
    private static volatile boolean sIsSoLibraryLoaded;
    private final ModuleProvider<TurboModule> mCxxModuleProvider;
    private final List<String> mEagerInitModuleNames;
    @InterfaceC6107a
    private final HybridData mHybridData;
    private final ModuleProvider<TurboModule> mJavaModuleProvider;
    private final Object mModuleCleanupLock = new Object();
    private boolean mModuleCleanupStarted = false;
    private final Map<String, ModuleHolder> mModuleHolders = new HashMap();

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class ModuleHolder {
        private static volatile int sHolderCount;
        private volatile NativeModule mModule = null;
        private volatile boolean mIsTryingToCreate = false;
        private volatile boolean mIsDoneCreatingModule = false;
        private volatile int mModuleId = sHolderCount;

        public ModuleHolder() {
            sHolderCount++;
        }

        void endCreatingModule() {
            this.mIsTryingToCreate = false;
            this.mIsDoneCreatingModule = true;
        }

        NativeModule getModule() {
            return this.mModule;
        }

        int getModuleId() {
            return this.mModuleId;
        }

        boolean isCreatingModule() {
            return this.mIsTryingToCreate;
        }

        boolean isDoneCreatingModule() {
            return this.mIsDoneCreatingModule;
        }

        void setModule(NativeModule nativeModule) {
            this.mModule = nativeModule;
        }

        void startCreatingModule() {
            this.mIsTryingToCreate = true;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface ModuleProvider<T> {
        T getModule(String str);
    }

    public TurboModuleManager(RuntimeExecutor runtimeExecutor, final TurboModuleManagerDelegate turboModuleManagerDelegate, CallInvokerHolder callInvokerHolder, CallInvokerHolder callInvokerHolder2) {
        List<String> eagerInitModuleNames;
        maybeLoadSoLibrary();
        this.mHybridData = initHybrid(runtimeExecutor, (CallInvokerHolderImpl) callInvokerHolder, (CallInvokerHolderImpl) callInvokerHolder2, turboModuleManagerDelegate);
        installJSIBindings();
        if (turboModuleManagerDelegate == null) {
            eagerInitModuleNames = new ArrayList<>();
        } else {
            eagerInitModuleNames = turboModuleManagerDelegate.getEagerInitModuleNames();
        }
        this.mEagerInitModuleNames = eagerInitModuleNames;
        this.mJavaModuleProvider = new ModuleProvider<TurboModule>() { // from class: com.facebook.react.turbomodule.core.TurboModuleManager.1
            @Override // com.facebook.react.turbomodule.core.TurboModuleManager.ModuleProvider
            public TurboModule getModule(String str) {
                TurboModuleManagerDelegate turboModuleManagerDelegate2 = turboModuleManagerDelegate;
                if (turboModuleManagerDelegate2 == null) {
                    return null;
                }
                return turboModuleManagerDelegate2.getModule(str);
            }
        };
        this.mCxxModuleProvider = new ModuleProvider<TurboModule>() { // from class: com.facebook.react.turbomodule.core.TurboModuleManager.2
            @Override // com.facebook.react.turbomodule.core.TurboModuleManager.ModuleProvider
            public TurboModule getModule(String str) {
                CxxModuleWrapper legacyCxxModule;
                TurboModuleManagerDelegate turboModuleManagerDelegate2 = turboModuleManagerDelegate;
                if (turboModuleManagerDelegate2 == null || (legacyCxxModule = turboModuleManagerDelegate2.getLegacyCxxModule(str)) == null) {
                    return null;
                }
                C5743a.m24584b(legacyCxxModule instanceof TurboModule, "CxxModuleWrapper \"" + str + "\" is not a TurboModule");
                return (TurboModule) legacyCxxModule;
            }
        };
    }

    @InterfaceC6107a
    private TurboModule getJavaModule(String str) {
        TurboModule module = getModule(str);
        if (module instanceof CxxModuleWrapper) {
            return null;
        }
        return module;
    }

    @InterfaceC6107a
    private CxxModuleWrapper getLegacyCxxModule(String str) {
        TurboModule module = getModule(str);
        if (!(module instanceof CxxModuleWrapper)) {
            return null;
        }
        return (CxxModuleWrapper) module;
    }

    private NativeModule getOrCreateModule(String str, ModuleHolder moduleHolder, boolean z) {
        boolean z2;
        NativeModule module;
        synchronized (moduleHolder) {
            if (moduleHolder.isDoneCreatingModule()) {
                if (z) {
                    TurboModulePerfLogger.moduleCreateCacheHit(str, moduleHolder.getModuleId());
                }
                return moduleHolder.getModule();
            }
            boolean z3 = false;
            if (!moduleHolder.isCreatingModule()) {
                moduleHolder.startCreatingModule();
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                TurboModulePerfLogger.moduleCreateConstructStart(str, moduleHolder.getModuleId());
                NativeModule nativeModule = (NativeModule) this.mJavaModuleProvider.getModule(str);
                if (nativeModule == null) {
                    nativeModule = (NativeModule) this.mCxxModuleProvider.getModule(str);
                }
                TurboModulePerfLogger.moduleCreateConstructEnd(str, moduleHolder.getModuleId());
                TurboModulePerfLogger.moduleCreateSetUpStart(str, moduleHolder.getModuleId());
                if (nativeModule != null) {
                    synchronized (moduleHolder) {
                        moduleHolder.setModule(nativeModule);
                    }
                    nativeModule.initialize();
                }
                TurboModulePerfLogger.moduleCreateSetUpEnd(str, moduleHolder.getModuleId());
                synchronized (moduleHolder) {
                    moduleHolder.endCreatingModule();
                    moduleHolder.notifyAll();
                }
                return nativeModule;
            }
            synchronized (moduleHolder) {
                while (moduleHolder.isCreatingModule()) {
                    try {
                        moduleHolder.wait();
                    } catch (InterruptedException unused) {
                        z3 = true;
                    }
                }
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                module = moduleHolder.getModule();
            }
            return module;
        }
    }

    private native HybridData initHybrid(RuntimeExecutor runtimeExecutor, CallInvokerHolderImpl callInvokerHolderImpl, CallInvokerHolderImpl callInvokerHolderImpl2, TurboModuleManagerDelegate turboModuleManagerDelegate);

    private native void installJSIBindings();

    private static synchronized void maybeLoadSoLibrary() {
        synchronized (TurboModuleManager.class) {
            if (!sIsSoLibraryLoaded) {
                SoLoader.m30164r("turbomodulejsijni");
                sIsSoLibraryLoaded = true;
            }
        }
    }

    @Override // com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry
    public List<String> getEagerInitModuleNames() {
        return this.mEagerInitModuleNames;
    }

    @Override // com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry
    public TurboModule getModule(String str) {
        synchronized (this.mModuleCleanupLock) {
            if (this.mModuleCleanupStarted) {
                return null;
            }
            if (!this.mModuleHolders.containsKey(str)) {
                this.mModuleHolders.put(str, new ModuleHolder());
            }
            ModuleHolder moduleHolder = this.mModuleHolders.get(str);
            TurboModulePerfLogger.moduleCreateStart(str, moduleHolder.getModuleId());
            TurboModule turboModule = (TurboModule) getOrCreateModule(str, moduleHolder, true);
            if (turboModule != null) {
                TurboModulePerfLogger.moduleCreateEnd(str, moduleHolder.getModuleId());
            } else {
                TurboModulePerfLogger.moduleCreateFail(str, moduleHolder.getModuleId());
            }
            return turboModule;
        }
    }

    @Override // com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry
    public Collection<TurboModule> getModules() {
        ArrayList<ModuleHolder> arrayList = new ArrayList();
        synchronized (this.mModuleCleanupLock) {
            arrayList.addAll(this.mModuleHolders.values());
        }
        ArrayList arrayList2 = new ArrayList();
        for (ModuleHolder moduleHolder : arrayList) {
            synchronized (moduleHolder) {
                if (moduleHolder.getModule() != null) {
                    arrayList2.add((TurboModule) moduleHolder.getModule());
                }
            }
        }
        return arrayList2;
    }

    @Override // com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry
    public boolean hasModule(String str) {
        ModuleHolder moduleHolder;
        synchronized (this.mModuleCleanupLock) {
            moduleHolder = this.mModuleHolders.get(str);
        }
        if (moduleHolder != null) {
            synchronized (moduleHolder) {
                if (moduleHolder.getModule() != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.facebook.react.bridge.JSIModule
    public void initialize() {
    }

    @Override // com.facebook.react.bridge.JSIModule
    public void onCatalystInstanceDestroy() {
        synchronized (this.mModuleCleanupLock) {
            this.mModuleCleanupStarted = true;
        }
        for (Map.Entry<String, ModuleHolder> entry : this.mModuleHolders.entrySet()) {
            NativeModule orCreateModule = getOrCreateModule(entry.getKey(), entry.getValue(), false);
            if (orCreateModule != null) {
                orCreateModule.invalidate();
            }
        }
        this.mModuleHolders.clear();
        this.mHybridData.resetNative();
    }
}