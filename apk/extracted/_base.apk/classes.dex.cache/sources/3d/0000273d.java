package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.common.ViewUtil;
import p058d5.C5743a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactEventEmitter implements RCTModernEventEmitter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ReactEventEmitter";
    private RCTModernEventEmitter mFabricEventEmitter = null;
    private RCTEventEmitter mRCTEventEmitter = null;
    private final ReactApplicationContext mReactContext;

    public ReactEventEmitter(ReactApplicationContext reactApplicationContext) {
        this.mReactContext = reactApplicationContext;
    }

    private RCTEventEmitter getEventEmitter(int i) {
        int uIManagerType = ViewUtil.getUIManagerType(i);
        if (this.mRCTEventEmitter == null) {
            if (this.mReactContext.hasActiveReactInstance()) {
                this.mRCTEventEmitter = (RCTEventEmitter) this.mReactContext.getJSModule(RCTEventEmitter.class);
            } else {
                ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get RCTEventEmitter from Context for reactTag: " + i + " - uiManagerType: " + uIManagerType + " - No active Catalyst instance!"));
            }
        }
        return this.mRCTEventEmitter;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, WritableMap writableMap) {
        receiveEvent(-1, i, str, writableMap);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        C5743a.m24585a(writableArray.size() > 0);
        int i = writableArray.getMap(0).getInt(TouchesHelper.TARGET_KEY);
        if (ViewUtil.getUIManagerType(i) != 1 || getEventEmitter(i) == null) {
            return;
        }
        this.mRCTEventEmitter.receiveTouches(str, writableArray, writableArray2);
    }

    public void register(int i, RCTModernEventEmitter rCTModernEventEmitter) {
        this.mFabricEventEmitter = rCTModernEventEmitter;
    }

    public void unregister(int i) {
        if (i == 1) {
            this.mRCTEventEmitter = null;
        } else {
            this.mFabricEventEmitter = null;
        }
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i, int i2, String str, WritableMap writableMap) {
        receiveEvent(i, i2, str, false, 0, writableMap, 2);
    }

    public void register(int i, RCTEventEmitter rCTEventEmitter) {
        this.mRCTEventEmitter = rCTEventEmitter;
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i, int i2, String str, boolean z, int i3, WritableMap writableMap, int i4) {
        RCTModernEventEmitter rCTModernEventEmitter;
        int uIManagerType = ViewUtil.getUIManagerType(i2);
        if (uIManagerType == 2 && (rCTModernEventEmitter = this.mFabricEventEmitter) != null) {
            rCTModernEventEmitter.receiveEvent(i, i2, str, z, i3, writableMap, i4);
        } else if (uIManagerType == 1 && getEventEmitter(i2) != null) {
            this.mRCTEventEmitter.receiveEvent(i2, str, writableMap);
        } else {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot find EventEmitter for receiveEvent: SurfaceId[" + i + "] ReactTag[" + i2 + "] UIManagerType[" + uIManagerType + "] EventName[" + str + "]"));
        }
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveTouches(TouchEvent touchEvent) {
        RCTModernEventEmitter rCTModernEventEmitter;
        int viewTag = touchEvent.getViewTag();
        int uIManagerType = touchEvent.getUIManagerType();
        if (uIManagerType == 2 && (rCTModernEventEmitter = this.mFabricEventEmitter) != null) {
            rCTModernEventEmitter.receiveTouches(touchEvent);
        } else if (uIManagerType == 1 && getEventEmitter(viewTag) != null) {
            TouchesHelper.sendTouchesLegacy(this.mRCTEventEmitter, touchEvent);
        } else {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot find EventEmitter for receivedTouches: ReactTag[" + viewTag + "] UIManagerType[" + uIManagerType + "] EventName[" + touchEvent.getEventName() + "]"));
        }
    }
}