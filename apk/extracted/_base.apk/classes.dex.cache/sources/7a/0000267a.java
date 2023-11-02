package com.facebook.react.turbomodule.core;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.List;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class TurboModuleManagerDelegate {
    private static volatile boolean sIsSoLibraryLoaded;
    @InterfaceC6107a
    private final HybridData mHybridData;

    public TurboModuleManagerDelegate() {
        maybeLoadOtherSoLibraries();
        maybeLoadSoLibrary();
        this.mHybridData = initHybrid();
    }

    private static synchronized void maybeLoadSoLibrary() {
        synchronized (TurboModuleManagerDelegate.class) {
            if (!sIsSoLibraryLoaded) {
                SoLoader.m30164r("turbomodulejsijni");
                sIsSoLibraryLoaded = true;
            }
        }
    }

    public List<String> getEagerInitModuleNames() {
        return new ArrayList();
    }

    public abstract CxxModuleWrapper getLegacyCxxModule(String str);

    public abstract TurboModule getModule(String str);

    protected abstract HybridData initHybrid();

    protected synchronized void maybeLoadOtherSoLibraries() {
    }
}