package com.facebook.react.turbomodule.core;

import com.facebook.jni.HybridData;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.soloader.SoLoader;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class CallInvokerHolderImpl implements CallInvokerHolder {
    private static volatile boolean sIsSoLibraryLoaded;
    private final HybridData mHybridData;

    private CallInvokerHolderImpl(HybridData hybridData) {
        maybeLoadSoLibrary();
        this.mHybridData = hybridData;
    }

    private static synchronized void maybeLoadSoLibrary() {
        synchronized (CallInvokerHolderImpl.class) {
            if (!sIsSoLibraryLoaded) {
                SoLoader.m30164r("turbomodulejsijni");
                sIsSoLibraryLoaded = true;
            }
        }
    }
}