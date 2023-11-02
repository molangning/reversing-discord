package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Provider;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class TurboReactPackage implements ReactPackage {

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class ModuleHolderProvider implements Provider<NativeModule> {
        private final String mName;
        private final ReactApplicationContext mReactContext;

        public ModuleHolderProvider(String str, ReactApplicationContext reactApplicationContext) {
            TurboReactPackage.this = r1;
            this.mName = str;
            this.mReactContext = reactApplicationContext;
        }

        @Override // javax.inject.Provider
        public NativeModule get() {
            return TurboReactPackage.this.getModule(this.mName, this.mReactContext);
        }
    }

    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        throw new UnsupportedOperationException("In case of TurboModules, createNativeModules is not supported. NativeModuleRegistry should instead use getModuleList or getModule method");
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

    public abstract NativeModule getModule(String str, ReactApplicationContext reactApplicationContext);

    public Iterable<ModuleHolder> getNativeModuleIterator(final ReactApplicationContext reactApplicationContext) {
        final Iterator<Map.Entry<String, ReactModuleInfo>> it = getReactModuleInfoProvider().getReactModuleInfos().entrySet().iterator();
        return new Iterable<ModuleHolder>() { // from class: com.facebook.react.TurboReactPackage.1

            /* renamed from: com.facebook.react.TurboReactPackage$1$1 */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
            class C39181 implements Iterator<ModuleHolder>, p164j$.util.Iterator {
                Map.Entry<String, ReactModuleInfo> nextEntry = null;

                C39181() {
                    C39171.this = r1;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x000a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private void findNext() {
                    /*
                        r3 = this;
                    L0:
                        com.facebook.react.TurboReactPackage$1 r0 = com.facebook.react.TurboReactPackage.C39171.this
                        java.util.Iterator r0 = r2
                        boolean r0 = r0.hasNext()
                        if (r0 == 0) goto L28
                        com.facebook.react.TurboReactPackage$1 r0 = com.facebook.react.TurboReactPackage.C39171.this
                        java.util.Iterator r0 = r2
                        java.lang.Object r0 = r0.next()
                        java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                        java.lang.Object r1 = r0.getValue()
                        com.facebook.react.module.model.ReactModuleInfo r1 = (com.facebook.react.module.model.ReactModuleInfo) r1
                        boolean r2 = com.facebook.react.config.ReactFeatureFlags.useTurboModules
                        if (r2 == 0) goto L25
                        boolean r1 = r1.isTurboModule()
                        if (r1 == 0) goto L25
                        goto L0
                    L25:
                        r3.nextEntry = r0
                        return
                    L28:
                        r0 = 0
                        r3.nextEntry = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.TurboReactPackage.C39171.C39181.findNext():void");
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
                    if (this.nextEntry == null) {
                        findNext();
                    }
                    if (this.nextEntry != null) {
                        return true;
                    }
                    return false;
                }

                @Override // java.util.Iterator, p164j$.util.Iterator
                public void remove() {
                    throw new UnsupportedOperationException("Cannot remove native modules from the list");
                }

                @Override // java.util.Iterator, p164j$.util.Iterator
                public ModuleHolder next() {
                    if (this.nextEntry == null) {
                        findNext();
                    }
                    Map.Entry<String, ReactModuleInfo> entry = this.nextEntry;
                    if (entry != null) {
                        findNext();
                        C39171 c39171 = C39171.this;
                        return new ModuleHolder(entry.getValue(), new ModuleHolderProvider(entry.getKey(), reactApplicationContext));
                    }
                    throw new NoSuchElementException("ModuleHolder not found");
                }
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<ModuleHolder> iterator() {
                return new C39181();
            }
        };
    }

    public abstract ReactModuleInfoProvider getReactModuleInfoProvider();

    protected List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}