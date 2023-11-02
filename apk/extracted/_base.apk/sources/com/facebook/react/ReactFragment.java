package com.facebook.react;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1686g;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactFragment extends Fragment implements PermissionAwareActivity {
    protected static final String ARG_COMPONENT_NAME = "arg_component_name";
    protected static final String ARG_FABRIC_ENABLED = "arg_fabric_enabled";
    protected static final String ARG_LAUNCH_OPTIONS = "arg_launch_options";
    private PermissionListener mPermissionListener;
    private ReactDelegate mReactDelegate;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class Builder {
        String mComponentName = null;
        Bundle mLaunchOptions = null;
        Boolean mFabricEnabled = null;

        public ReactFragment build() {
            return ReactFragment.newInstance(this.mComponentName, this.mLaunchOptions, this.mFabricEnabled);
        }

        public Builder setComponentName(String str) {
            this.mComponentName = str;
            return this;
        }

        public Builder setFabricEnabled(boolean z) {
            this.mFabricEnabled = Boolean.valueOf(z);
            return this;
        }

        public Builder setLaunchOptions(Bundle bundle) {
            this.mLaunchOptions = bundle;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ReactFragment newInstance(String str, Bundle bundle, Boolean bool) {
        ReactFragment reactFragment = new ReactFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString(ARG_COMPONENT_NAME, str);
        bundle2.putBundle(ARG_LAUNCH_OPTIONS, bundle);
        bundle2.putBoolean(ARG_FABRIC_ENABLED, bool.booleanValue());
        reactFragment.setArguments(bundle2);
        return reactFragment;
    }

    @Override // com.facebook.react.modules.core.PermissionAwareActivity
    public int checkPermission(String str, int i, int i2) {
        return getActivity().checkPermission(str, i, i2);
    }

    @Override // com.facebook.react.modules.core.PermissionAwareActivity
    @TargetApi(23)
    public int checkSelfPermission(String str) {
        return getActivity().checkSelfPermission(str);
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1688h
    public /* bridge */ /* synthetic */ CreationExtras getDefaultViewModelCreationExtras() {
        return C1686g.m36038a(this);
    }

    protected ReactDelegate getReactDelegate() {
        return this.mReactDelegate;
    }

    protected ReactNativeHost getReactNativeHost() {
        return ((ReactApplication) getActivity().getApplication()).getReactNativeHost();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.mReactDelegate.onActivityResult(i, i2, intent, false);
    }

    public boolean onBackPressed() {
        return this.mReactDelegate.onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Boolean bool;
        String str;
        Bundle bundle2;
        super.onCreate(bundle);
        if (getArguments() != null) {
            String string = getArguments().getString(ARG_COMPONENT_NAME);
            Bundle bundle3 = getArguments().getBundle(ARG_LAUNCH_OPTIONS);
            bool = Boolean.valueOf(getArguments().getBoolean(ARG_FABRIC_ENABLED));
            str = string;
            bundle2 = bundle3;
        } else {
            bool = null;
            str = null;
            bundle2 = null;
        }
        if (str != null) {
            this.mReactDelegate = new ReactDelegate(getActivity(), getReactNativeHost(), str, bundle2, bool.booleanValue());
            return;
        }
        throw new IllegalStateException("Cannot loadApp if component name is null");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mReactDelegate.loadApp();
        return this.mReactDelegate.getReactRootView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mReactDelegate.onHostDestroy();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.mReactDelegate.shouldShowDevMenuOrReload(i, keyEvent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.mReactDelegate.onHostPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        PermissionListener permissionListener = this.mPermissionListener;
        if (permissionListener != null && permissionListener.onRequestPermissionsResult(i, strArr, iArr)) {
            this.mPermissionListener = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.mReactDelegate.onHostResume();
    }

    @Override // com.facebook.react.modules.core.PermissionAwareActivity
    @TargetApi(23)
    public void requestPermissions(String[] strArr, int i, PermissionListener permissionListener) {
        this.mPermissionListener = permissionListener;
        requestPermissions(strArr, i);
    }
}
