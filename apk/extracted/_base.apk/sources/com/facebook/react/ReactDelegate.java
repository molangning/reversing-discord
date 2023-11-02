package com.facebook.react;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.devsupport.DoubleTapReloadRecognizer;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import p058d5.C5743a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactDelegate {
    private final Activity mActivity;
    private DoubleTapReloadRecognizer mDoubleTapReloadRecognizer;
    private boolean mFabricEnabled;
    private Bundle mLaunchOptions;
    private final String mMainComponentName;
    private ReactNativeHost mReactNativeHost;
    private ReactRootView mReactRootView;

    public ReactDelegate(Activity activity, ReactNativeHost reactNativeHost, String str, Bundle bundle) {
        this.mFabricEnabled = false;
        this.mActivity = activity;
        this.mMainComponentName = str;
        this.mLaunchOptions = bundle;
        this.mDoubleTapReloadRecognizer = new DoubleTapReloadRecognizer();
        this.mReactNativeHost = reactNativeHost;
    }

    private Bundle composeLaunchOptions(Bundle bundle) {
        if (isFabricEnabled()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("concurrentRoot", true);
        }
        return bundle;
    }

    private ReactNativeHost getReactNativeHost() {
        return this.mReactNativeHost;
    }

    protected ReactRootView createRootView() {
        ReactRootView reactRootView = new ReactRootView(this.mActivity);
        reactRootView.setIsFabric(isFabricEnabled());
        return reactRootView;
    }

    public ReactInstanceManager getReactInstanceManager() {
        return getReactNativeHost().getReactInstanceManager();
    }

    public ReactRootView getReactRootView() {
        return this.mReactRootView;
    }

    protected boolean isFabricEnabled() {
        return this.mFabricEnabled;
    }

    public void loadApp() {
        loadApp(this.mMainComponentName);
    }

    public void onActivityResult(int i, int i2, Intent intent, boolean z) {
        if (getReactNativeHost().hasInstance() && z) {
            getReactNativeHost().getReactInstanceManager().onActivityResult(this.mActivity, i, i2, intent);
        }
    }

    public boolean onBackPressed() {
        if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().onBackPressed();
            return true;
        }
        return false;
    }

    public void onHostDestroy() {
        ReactRootView reactRootView = this.mReactRootView;
        if (reactRootView != null) {
            reactRootView.unmountReactApplication();
            this.mReactRootView = null;
        }
        if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().onHostDestroy(this.mActivity);
        }
    }

    public void onHostPause() {
        if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().onHostPause(this.mActivity);
        }
    }

    public void onHostResume() {
        if (getReactNativeHost().hasInstance()) {
            if (this.mActivity instanceof DefaultHardwareBackBtnHandler) {
                ReactInstanceManager reactInstanceManager = getReactNativeHost().getReactInstanceManager();
                Activity activity = this.mActivity;
                reactInstanceManager.onHostResume(activity, (DefaultHardwareBackBtnHandler) activity);
                return;
            }
            throw new ClassCastException("Host Activity does not implement DefaultHardwareBackBtnHandler");
        }
    }

    public boolean shouldShowDevMenuOrReload(int i, KeyEvent keyEvent) {
        if (getReactNativeHost().hasInstance() && getReactNativeHost().getUseDeveloperSupport()) {
            if (i == 82) {
                getReactNativeHost().getReactInstanceManager().showDevOptionsDialog();
                return true;
            } else if (((DoubleTapReloadRecognizer) C5743a.m24583c(this.mDoubleTapReloadRecognizer)).didDoubleTapR(i, this.mActivity.getCurrentFocus())) {
                getReactNativeHost().getReactInstanceManager().getDevSupportManager().handleReloadJS();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void loadApp(String str) {
        if (this.mReactRootView == null) {
            ReactRootView createRootView = createRootView();
            this.mReactRootView = createRootView;
            createRootView.startReactApplication(getReactNativeHost().getReactInstanceManager(), str, this.mLaunchOptions);
            return;
        }
        throw new IllegalStateException("Cannot loadApp while app is already running.");
    }

    public ReactDelegate(Activity activity, ReactNativeHost reactNativeHost, String str, Bundle bundle, boolean z) {
        this.mFabricEnabled = false;
        this.mActivity = activity;
        this.mMainComponentName = str;
        this.mLaunchOptions = composeLaunchOptions(bundle);
        this.mDoubleTapReloadRecognizer = new DoubleTapReloadRecognizer();
        this.mReactNativeHost = reactNativeHost;
        this.mFabricEnabled = z;
    }
}
