package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p150i5.C7384b;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class LazyReactPackage implements ReactPackage {
    @Deprecated
    public static ReactModuleInfoProvider getReactModuleInfoProviderViaReflection(LazyReactPackage lazyReactPackage) {
        return new ReactModuleInfoProvider() { // from class: com.facebook.react.LazyReactPackage.1
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public Map<String, ReactModuleInfo> getReactModuleInfos() {
                return Collections.emptyMap();
            }
        };
    }

    @Override // com.facebook.react.ReactPackage
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : getNativeModules(reactApplicationContext)) {
            C7384b.m20802a(0L, "createNativeModule").mo20798c();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, moduleSpec.getName());
            try {
                NativeModule nativeModule = moduleSpec.getProvider().get();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                C7384b.m20801b(0L).mo20798c();
                arrayList.add(nativeModule);
            } catch (Throwable th2) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                C7384b.m20801b(0L).mo20798c();
                throw th2;
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> viewManagers = getViewManagers(reactApplicationContext);
        if (viewManagers != null && !viewManagers.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (ModuleSpec moduleSpec : viewManagers) {
                arrayList.add((ViewManager) moduleSpec.getProvider().get());
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public Iterable<ModuleHolder> getNativeModuleIterator(ReactApplicationContext reactApplicationContext) {
        final Map<String, ReactModuleInfo> reactModuleInfos = getReactModuleInfoProvider().getReactModuleInfos();
        final List<ModuleSpec> nativeModules = getNativeModules(reactApplicationContext);
        return new Iterable<ModuleHolder>() { // from class: com.facebook.react.LazyReactPackage.2

            /* renamed from: com.facebook.react.LazyReactPackage$2$1 */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
            class C38921 implements Iterator<ModuleHolder>, p164j$.util.Iterator {
                int position = 0;

                C38921() {
                    C38912.this = r1;
                }

                @Override // p164j$.util.Iterator
                public /* synthetic */ void forEachRemaining(Consumer consumer) {
                    Iterator.CC.$default$forEachRemaining(this, consumer);
                }

                @Override // java.util.Iterator
                public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super ModuleHolder> consumer) {
                    forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                }

                @Override // java.util.Iterator, p164j$.util.Iterator
                public boolean hasNext() {
                    return this.position < nativeModules.size();
                }

                @Override // java.util.Iterator, p164j$.util.Iterator
                public void remove() {
                    throw new UnsupportedOperationException("Cannot remove native modules from the list");
                }

                @Override // java.util.Iterator, p164j$.util.Iterator
                public ModuleHolder next() {
                    List list = nativeModules;
                    int i = this.position;
                    this.position = i + 1;
                    ModuleSpec moduleSpec = (ModuleSpec) list.get(i);
                    String name = moduleSpec.getName();
                    ReactModuleInfo reactModuleInfo = (ReactModuleInfo) reactModuleInfos.get(name);
                    if (reactModuleInfo == null) {
                        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, name);
                        try {
                            NativeModule nativeModule = moduleSpec.getProvider().get();
                            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                            return new ModuleHolder(nativeModule);
                        } catch (Throwable th2) {
                            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                            throw th2;
                        }
                    }
                    return new ModuleHolder(reactModuleInfo, moduleSpec.getProvider());
                }
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<ModuleHolder> iterator() {
                return new C38921();
            }
        };
    }

    public abstract List<ModuleSpec> getNativeModules(ReactApplicationContext reactApplicationContext);

    public abstract ReactModuleInfoProvider getReactModuleInfoProvider();

    public List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}