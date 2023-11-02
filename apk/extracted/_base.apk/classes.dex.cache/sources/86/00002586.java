package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.fabric.FabricSoLoader;
import com.facebook.react.uimanager.events.BatchEventDispatchedListener;
import p077e5.InterfaceC6107a;

@SuppressLint({"MissingNativeLoadLibrary"})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class EventBeatManager implements BatchEventDispatchedListener {
    @InterfaceC6107a
    private final HybridData mHybridData = initHybrid();
    private final ReactApplicationContext mReactApplicationContext;

    static {
        FabricSoLoader.staticInit();
    }

    public EventBeatManager(ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }

    private static native HybridData initHybrid();

    private native void tick();

    @Override // com.facebook.react.uimanager.events.BatchEventDispatchedListener
    public void onBatchEventDispatched() {
        tick();
    }
}