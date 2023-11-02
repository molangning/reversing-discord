package com.facebook.react.perflogger;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class NativeModulePerfLogger {
    private static volatile boolean sIsSoLibraryLoaded;
    private final HybridData mHybridData;

    protected NativeModulePerfLogger() {
        maybeLoadOtherSoLibraries();
        maybeLoadSoLibrary();
        this.mHybridData = initHybrid();
    }

    private static synchronized void maybeLoadSoLibrary() {
        synchronized (NativeModulePerfLogger.class) {
            if (!sIsSoLibraryLoaded) {
                SoLoader.m30164r("reactperfloggerjni");
                sIsSoLibraryLoaded = true;
            }
        }
    }

    protected abstract HybridData initHybrid();

    protected synchronized void maybeLoadOtherSoLibraries() {
    }

    public abstract void moduleCreateCacheHit(String str, int i);

    public abstract void moduleCreateConstructEnd(String str, int i);

    public abstract void moduleCreateConstructStart(String str, int i);

    public abstract void moduleCreateEnd(String str, int i);

    public abstract void moduleCreateFail(String str, int i);

    public abstract void moduleCreateSetUpEnd(String str, int i);

    public abstract void moduleCreateSetUpStart(String str, int i);

    public abstract void moduleCreateStart(String str, int i);

    public abstract void moduleDataCreateEnd(String str, int i);

    public abstract void moduleDataCreateStart(String str, int i);
}