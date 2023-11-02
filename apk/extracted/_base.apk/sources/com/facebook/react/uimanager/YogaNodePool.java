package com.facebook.react.uimanager;

import com.facebook.react.common.ClearableSynchronizedPool;
import com.facebook.yoga.YogaNode;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class YogaNodePool {
    private static final Object sInitLock = new Object();
    private static ClearableSynchronizedPool<YogaNode> sPool;

    public static ClearableSynchronizedPool<YogaNode> get() {
        ClearableSynchronizedPool<YogaNode> clearableSynchronizedPool;
        ClearableSynchronizedPool<YogaNode> clearableSynchronizedPool2 = sPool;
        if (clearableSynchronizedPool2 != null) {
            return clearableSynchronizedPool2;
        }
        synchronized (sInitLock) {
            if (sPool == null) {
                sPool = new ClearableSynchronizedPool<>(1024);
            }
            clearableSynchronizedPool = sPool;
        }
        return clearableSynchronizedPool;
    }
}
