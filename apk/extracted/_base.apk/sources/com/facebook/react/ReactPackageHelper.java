package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.ReactConstants;
import java.util.Iterator;
import java.util.List;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactPackageHelper {
    public static Iterable<ModuleHolder> getNativeModuleIterator(ReactPackage reactPackage, ReactApplicationContext reactApplicationContext, ReactInstanceManager reactInstanceManager) {
        final List<NativeModule> createNativeModules;
        C13677a.m1862b(ReactConstants.TAG, reactPackage.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        if (reactPackage instanceof ReactInstancePackage) {
            createNativeModules = ((ReactInstancePackage) reactPackage).createNativeModules(reactApplicationContext, reactInstanceManager);
        } else {
            createNativeModules = reactPackage.createNativeModules(reactApplicationContext);
        }
        return new Iterable<ModuleHolder>() { // from class: com.facebook.react.ReactPackageHelper.1

            /* renamed from: com.facebook.react.ReactPackageHelper$1$1 */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
            class C39121 implements Iterator<ModuleHolder>, p164j$.util.Iterator {
                int position = 0;

                C39121() {
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
                    return this.position < createNativeModules.size();
                }

                @Override // java.util.Iterator, p164j$.util.Iterator
                public void remove() {
                    throw new UnsupportedOperationException("Cannot remove methods ");
                }

                @Override // java.util.Iterator, p164j$.util.Iterator
                public ModuleHolder next() {
                    List list = createNativeModules;
                    int i = this.position;
                    this.position = i + 1;
                    return new ModuleHolder((NativeModule) list.get(i));
                }
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<ModuleHolder> iterator() {
                return new C39121();
            }
        };
    }
}
