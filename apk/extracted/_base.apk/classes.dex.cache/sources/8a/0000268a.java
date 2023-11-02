package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ChoreographerCompat;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class GuardedFrameCallback extends ChoreographerCompat.FrameCallback {
    private final ReactContext mReactContext;

    public GuardedFrameCallback(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }

    @Override // com.facebook.react.modules.core.ChoreographerCompat.FrameCallback
    public final void doFrame(long j) {
        try {
            doFrameGuarded(j);
        } catch (RuntimeException e) {
            this.mReactContext.handleException(e);
        }
    }

    protected abstract void doFrameGuarded(long j);
}