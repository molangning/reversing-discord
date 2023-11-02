package com.facebook.react.defaults;

import android.app.Application;
import com.facebook.react.JSEngineResolutionAlgorithm;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, m14357d2 = {"Lcom/facebook/react/defaults/DefaultReactNativeHost;", "Lcom/facebook/react/ReactNativeHost;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "isHermesEnabled", "", "()Ljava/lang/Boolean;", "isNewArchEnabled", "()Z", "getJSEngineResolutionAlgorithm", "Lcom/facebook/react/JSEngineResolutionAlgorithm;", "getJSIModulePackage", "Lcom/facebook/react/bridge/JSIModulePackage;", "getReactPackageTurboModuleManagerDelegateBuilder", "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;", "ReactAndroid_release"}, m14356k = 1, m14355mv = {1, 7, 1}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class DefaultReactNativeHost extends ReactNativeHost {
    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultReactNativeHost(Application application) {
        super(application);
        C9612q.m13917h(application, "application");
    }

    @Override // com.facebook.react.ReactNativeHost
    protected JSEngineResolutionAlgorithm getJSEngineResolutionAlgorithm() {
        Boolean isHermesEnabled = isHermesEnabled();
        if (C9612q.m13922c(isHermesEnabled, Boolean.TRUE)) {
            return JSEngineResolutionAlgorithm.HERMES;
        }
        if (C9612q.m13922c(isHermesEnabled, Boolean.FALSE)) {
            return JSEngineResolutionAlgorithm.JSC;
        }
        if (isHermesEnabled == null) {
            return null;
        }
        throw new C11581q();
    }

    @Override // com.facebook.react.ReactNativeHost
    protected JSIModulePackage getJSIModulePackage() {
        return new DefaultJSIModulePackage(this);
    }

    @Override // com.facebook.react.ReactNativeHost
    protected ReactPackageTurboModuleManagerDelegate.Builder getReactPackageTurboModuleManagerDelegateBuilder() {
        return new DefaultTurboModuleManagerDelegate.Builder();
    }

    protected Boolean isHermesEnabled() {
        return null;
    }

    protected boolean isNewArchEnabled() {
        return false;
    }
}
