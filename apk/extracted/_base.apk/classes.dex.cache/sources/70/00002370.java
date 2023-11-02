package com.facebook.react;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.core.PermissionListener;
import p058d5.C5743a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactActivityDelegate {
    private final Activity mActivity;
    private final String mMainComponentName;
    private PermissionListener mPermissionListener;
    private Callback mPermissionsCallback;
    private ReactDelegate mReactDelegate;

    @Deprecated
    public ReactActivityDelegate(Activity activity, String str) {
        this.mActivity = activity;
        this.mMainComponentName = str;
    }

    protected Bundle composeLaunchOptions() {
        Bundle launchOptions = getLaunchOptions();
        if (isFabricEnabled()) {
            if (launchOptions == null) {
                launchOptions = new Bundle();
            }
            launchOptions.putBoolean("concurrentRoot", true);
        }
        return launchOptions;
    }

    protected ReactRootView createRootView() {
        return new ReactRootView(getContext());
    }

    public Context getContext() {
        return (Context) C5743a.m24583c(this.mActivity);
    }

    protected Bundle getLaunchOptions() {
        return null;
    }

    public String getMainComponentName() {
        return this.mMainComponentName;
    }

    protected Activity getPlainActivity() {
        return (Activity) getContext();
    }

    public ReactInstanceManager getReactInstanceManager() {
        return this.mReactDelegate.getReactInstanceManager();
    }

    public ReactNativeHost getReactNativeHost() {
        return ((ReactApplication) getPlainActivity().getApplication()).getReactNativeHost();
    }

    protected boolean isFabricEnabled() {
        return false;
    }

    public void loadApp(String str) {
        this.mReactDelegate.loadApp(str);
        getPlainActivity().setContentView(this.mReactDelegate.getReactRootView());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.mReactDelegate.onActivityResult(i, i2, intent, true);
    }

    public boolean onBackPressed() {
        return this.mReactDelegate.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (getReactNativeHost().hasInstance()) {
            getReactInstanceManager().onConfigurationChanged(getContext(), configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        String mainComponentName = getMainComponentName();
        final Bundle composeLaunchOptions = composeLaunchOptions();
        this.mReactDelegate = new ReactDelegate(getPlainActivity(), getReactNativeHost(), mainComponentName, composeLaunchOptions) { // from class: com.facebook.react.ReactActivityDelegate.1
            @Override // com.facebook.react.ReactDelegate
            protected ReactRootView createRootView() {
                return ReactActivityDelegate.this.createRootView(composeLaunchOptions);
            }
        };
        if (mainComponentName != null) {
            loadApp(mainComponentName);
        }
    }

    public void onDestroy() {
        this.mReactDelegate.onHostDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (getReactNativeHost().hasInstance() && getReactNativeHost().getUseDeveloperSupport() && i == 90) {
            keyEvent.startTracking();
            return true;
        }
        return false;
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (getReactNativeHost().hasInstance() && getReactNativeHost().getUseDeveloperSupport() && i == 90) {
            getReactNativeHost().getReactInstanceManager().showDevOptionsDialog();
            return true;
        }
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.mReactDelegate.shouldShowDevMenuOrReload(i, keyEvent);
    }

    public boolean onNewIntent(Intent intent) {
        if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().onNewIntent(intent);
            return true;
        }
        return false;
    }

    public void onPause() {
        this.mReactDelegate.onHostPause();
    }

    public void onRequestPermissionsResult(final int i, final String[] strArr, final int[] iArr) {
        this.mPermissionsCallback = new Callback() { // from class: com.facebook.react.ReactActivityDelegate.2
            @Override // com.facebook.react.bridge.Callback
            public void invoke(Object... objArr) {
                if (ReactActivityDelegate.this.mPermissionListener != null && ReactActivityDelegate.this.mPermissionListener.onRequestPermissionsResult(i, strArr, iArr)) {
                    ReactActivityDelegate.this.mPermissionListener = null;
                }
            }
        };
    }

    public void onResume() {
        this.mReactDelegate.onHostResume();
        Callback callback = this.mPermissionsCallback;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.mPermissionsCallback = null;
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().onWindowFocusChange(z);
        }
    }

    @TargetApi(23)
    public void requestPermissions(String[] strArr, int i, PermissionListener permissionListener) {
        this.mPermissionListener = permissionListener;
        getPlainActivity().requestPermissions(strArr, i);
    }

    protected ReactRootView createRootView(Bundle bundle) {
        return new ReactRootView(getContext());
    }

    public ReactActivityDelegate(ReactActivity reactActivity, String str) {
        this.mActivity = reactActivity;
        this.mMainComponentName = str;
    }
}