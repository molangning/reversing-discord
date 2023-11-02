package com.facebook.react.modules.accessibilityinfo;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.fbreact.specs.NativeAccessibilityInfoSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = NativeAccessibilityInfoSpec.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AccessibilityInfoModule extends NativeAccessibilityInfoSpec implements LifecycleEventListener {
    private static final String ACCESSIBILITY_SERVICE_EVENT_NAME = "accessibilityServiceDidChange";
    private static final String REDUCE_MOTION_EVENT_NAME = "reduceMotionDidChange";
    private static final String TOUCH_EXPLORATION_EVENT_NAME = "touchExplorationDidChange";
    private final ContentObserver animationScaleObserver;
    private AccessibilityManager mAccessibilityManager;
    private ReactAccessibilityServiceChangeListener mAccessibilityServiceChangeListener;
    private boolean mAccessibilityServiceEnabled;
    private final ContentResolver mContentResolver;
    private int mRecommendedTimeout;
    private boolean mReduceMotionEnabled;
    private boolean mTouchExplorationEnabled;
    private ReactTouchExplorationStateChangeListener mTouchExplorationStateChangeListener;

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(21)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class ReactAccessibilityServiceChangeListener implements AccessibilityManager.AccessibilityStateChangeListener {
        private ReactAccessibilityServiceChangeListener() {
            AccessibilityInfoModule.this = r1;
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z) {
            AccessibilityInfoModule.this.updateAndSendAccessibilityServiceChangeEvent(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(21)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class ReactTouchExplorationStateChangeListener implements AccessibilityManager.TouchExplorationStateChangeListener {
        private ReactTouchExplorationStateChangeListener() {
            AccessibilityInfoModule.this = r1;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            AccessibilityInfoModule.this.updateAndSendTouchExplorationChangeEvent(z);
        }
    }

    public AccessibilityInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.animationScaleObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule.1
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                onChange(z, null);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z, Uri uri) {
                if (AccessibilityInfoModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                    AccessibilityInfoModule.this.updateAndSendReduceMotionChangeEvent();
                }
            }
        };
        this.mReduceMotionEnabled = false;
        this.mTouchExplorationEnabled = false;
        this.mAccessibilityServiceEnabled = false;
        this.mAccessibilityManager = (AccessibilityManager) reactApplicationContext.getApplicationContext().getSystemService("accessibility");
        this.mContentResolver = getReactApplicationContext().getContentResolver();
        this.mTouchExplorationEnabled = this.mAccessibilityManager.isTouchExplorationEnabled();
        this.mAccessibilityServiceEnabled = this.mAccessibilityManager.isEnabled();
        this.mReduceMotionEnabled = getIsReduceMotionEnabledValue();
        this.mTouchExplorationStateChangeListener = new ReactTouchExplorationStateChangeListener();
        this.mAccessibilityServiceChangeListener = new ReactAccessibilityServiceChangeListener();
    }

    @TargetApi(21)
    private boolean getIsReduceMotionEnabledValue() {
        float f;
        String string = Settings.Global.getString(this.mContentResolver, "transition_animation_scale");
        if (string != null) {
            f = Float.parseFloat(string);
        } else {
            f = 1.0f;
        }
        if (Float.valueOf(f).floatValue() == 0.0f) {
            return true;
        }
        return false;
    }

    public void updateAndSendAccessibilityServiceChangeEvent(boolean z) {
        if (this.mAccessibilityServiceEnabled != z) {
            this.mAccessibilityServiceEnabled = z;
            if (getReactApplicationContextIfActiveOrWarn() != null) {
                getReactApplicationContext().emitDeviceEvent(ACCESSIBILITY_SERVICE_EVENT_NAME, Boolean.valueOf(this.mAccessibilityServiceEnabled));
            }
        }
    }

    public void updateAndSendReduceMotionChangeEvent() {
        boolean isReduceMotionEnabledValue = getIsReduceMotionEnabledValue();
        if (this.mReduceMotionEnabled != isReduceMotionEnabledValue) {
            this.mReduceMotionEnabled = isReduceMotionEnabledValue;
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent(REDUCE_MOTION_EVENT_NAME, Boolean.valueOf(this.mReduceMotionEnabled));
            }
        }
    }

    public void updateAndSendTouchExplorationChangeEvent(boolean z) {
        if (this.mTouchExplorationEnabled != z) {
            this.mTouchExplorationEnabled = z;
            if (getReactApplicationContextIfActiveOrWarn() != null) {
                getReactApplicationContext().emitDeviceEvent(TOUCH_EXPLORATION_EVENT_NAME, Boolean.valueOf(this.mTouchExplorationEnabled));
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void announceForAccessibility(String str) {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.getText().add(str);
            obtain.setClassName(AccessibilityInfoModule.class.getName());
            obtain.setPackageName(getReactApplicationContext().getPackageName());
            this.mAccessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void getRecommendedTimeoutMillis(double d, Callback callback) {
        int recommendedTimeoutMillis;
        if (Build.VERSION.SDK_INT < 29) {
            callback.invoke(Integer.valueOf((int) d));
            return;
        }
        recommendedTimeoutMillis = this.mAccessibilityManager.getRecommendedTimeoutMillis((int) d, 4);
        this.mRecommendedTimeout = recommendedTimeoutMillis;
        callback.invoke(Integer.valueOf(recommendedTimeoutMillis));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        updateAndSendTouchExplorationChangeEvent(this.mAccessibilityManager.isTouchExplorationEnabled());
        updateAndSendAccessibilityServiceChangeEvent(this.mAccessibilityManager.isEnabled());
        updateAndSendReduceMotionChangeEvent();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isAccessibilityServiceEnabled(Callback callback) {
        callback.invoke(Boolean.valueOf(this.mAccessibilityServiceEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isReduceMotionEnabled(Callback callback) {
        callback.invoke(Boolean.valueOf(this.mReduceMotionEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isTouchExplorationEnabled(Callback callback) {
        callback.invoke(Boolean.valueOf(this.mTouchExplorationEnabled));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    @TargetApi(21)
    public void onHostPause() {
        this.mAccessibilityManager.removeTouchExplorationStateChangeListener(this.mTouchExplorationStateChangeListener);
        this.mAccessibilityManager.removeAccessibilityStateChangeListener(this.mAccessibilityServiceChangeListener);
        this.mContentResolver.unregisterContentObserver(this.animationScaleObserver);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    @TargetApi(21)
    public void onHostResume() {
        this.mAccessibilityManager.addTouchExplorationStateChangeListener(this.mTouchExplorationStateChangeListener);
        this.mAccessibilityManager.addAccessibilityStateChangeListener(this.mAccessibilityServiceChangeListener);
        this.mContentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, this.animationScaleObserver);
        updateAndSendTouchExplorationChangeEvent(this.mAccessibilityManager.isTouchExplorationEnabled());
        updateAndSendAccessibilityServiceChangeEvent(this.mAccessibilityManager.isEnabled());
        updateAndSendReduceMotionChangeEvent();
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void setAccessibilityFocus(double d) {
    }
}