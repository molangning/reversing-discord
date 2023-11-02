package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class FabricViewStateManager {
    private static final String TAG = "FabricViewStateManager";
    private StateWrapper mStateWrapper = null;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface HasFabricViewStateManager {
        FabricViewStateManager getFabricViewStateManager();
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface StateUpdateCallback {
        WritableMap getStateUpdate();
    }

    private void setState(StateWrapper stateWrapper, StateUpdateCallback stateUpdateCallback, int i) {
        WritableMap stateUpdate;
        if (stateWrapper == null) {
            C13677a.m1854j(TAG, "setState called without a StateWrapper");
        } else if (stateWrapper == this.mStateWrapper && i <= 60 && (stateUpdate = stateUpdateCallback.getStateUpdate()) != null) {
            stateWrapper.updateState(stateUpdate);
        }
    }

    public ReadableMap getStateData() {
        StateWrapper stateWrapper = this.mStateWrapper;
        if (stateWrapper != null) {
            return stateWrapper.getStateData();
        }
        return null;
    }

    public boolean hasStateWrapper() {
        return this.mStateWrapper != null;
    }

    public void setStateWrapper(StateWrapper stateWrapper) {
        this.mStateWrapper = stateWrapper;
    }

    public void setState(StateUpdateCallback stateUpdateCallback) {
        setState(this.mStateWrapper, stateUpdateCallback, 0);
    }
}
