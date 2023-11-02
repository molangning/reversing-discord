package com.reactnativecommunity.netinfo;

import android.os.Build;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.reactnativecommunity.netinfo.C5390a;
import p138he.AbstractC7087e;
import p138he.C7085d;
import p138he.C7093k;

@ReactModule(name = NetInfoModule.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class NetInfoModule extends ReactContextBaseJavaModule implements C5390a.InterfaceC5391a {
    public static final String NAME = "RNCNetInfo";
    private final C5390a mAmazonConnectivityChecker;
    private final AbstractC7087e mConnectivityReceiver;
    private int numberOfListeners;

    public NetInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.numberOfListeners = 0;
        if (Build.VERSION.SDK_INT >= 24) {
            this.mConnectivityReceiver = new C7093k(reactApplicationContext);
        } else {
            this.mConnectivityReceiver = new C7085d(reactApplicationContext);
        }
        this.mAmazonConnectivityChecker = new C5390a(reactApplicationContext, this);
    }

    @ReactMethod
    public void addListener(String str) {
        this.numberOfListeners++;
        this.mConnectivityReceiver.f19381e = true;
    }

    @ReactMethod
    public void getCurrentState(String str, Promise promise) {
        this.mConnectivityReceiver.m21441d(str, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        this.mConnectivityReceiver.mo21432g();
        this.mAmazonConnectivityChecker.m25298g();
    }

    @Override // com.reactnativecommunity.netinfo.C5390a.InterfaceC5391a
    public void onAmazonFireDeviceConnectivityChanged(boolean z) {
        this.mConnectivityReceiver.m21437i(z);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mAmazonConnectivityChecker.m25294k();
        this.mConnectivityReceiver.mo21431j();
        this.mConnectivityReceiver.f19381e = false;
    }

    @ReactMethod
    public void removeListeners(Integer num) {
        int intValue = this.numberOfListeners - num.intValue();
        this.numberOfListeners = intValue;
        if (intValue == 0) {
            this.mConnectivityReceiver.f19381e = false;
        }
    }
}
