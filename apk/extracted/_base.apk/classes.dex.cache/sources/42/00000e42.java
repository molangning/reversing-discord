package com.discord.bridge;

import android.app.Application;
import com.discord.BuildConfig;
import com.discord.bundle_updater.BundleUpdater;
import com.facebook.react.ReactPackage;
import com.facebook.react.defaults.DefaultReactNativeHost;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014J\u0018\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0006H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m14357d2 = {"Lcom/discord/bridge/DCDReactNativeHost;", "Lcom/facebook/react/defaults/DefaultReactNativeHost;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "isHermesEnabled", "", "()Ljava/lang/Boolean;", "isNewArchEnabled", "()Z", "getBundleAssetName", "", "getJSBundleFile", "getJSMainModuleName", "getPackages", "Ljava/util/ArrayList;", "Lcom/facebook/react/ReactPackage;", "Lkotlin/collections/ArrayList;", "getUseDeveloperSupport", "app_googleRelease"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class DCDReactNativeHost extends DefaultReactNativeHost {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DCDReactNativeHost(Application application) {
        super(application);
        C9612q.m13917h(application, "application");
    }

    @Override // com.facebook.react.ReactNativeHost
    protected String getBundleAssetName() {
        return BundleUpdater.ANDROID_JS_BUNDLE_ASSET_NAME;
    }

    @Override // com.facebook.react.ReactNativeHost
    protected String getJSBundleFile() {
        File bundleLocation = BundleUpdater.Companion.instance().getBundleLocation();
        if (bundleLocation != null) {
            return bundleLocation.getAbsolutePath();
        }
        return null;
    }

    @Override // com.facebook.react.ReactNativeHost
    protected String getJSMainModuleName() {
        return BuildConfig.MAIN_MODULE;
    }

    @Override // com.facebook.react.ReactNativeHost
    public boolean getUseDeveloperSupport() {
        return false;
    }

    @Override // com.facebook.react.defaults.DefaultReactNativeHost
    protected Boolean isHermesEnabled() {
        return Boolean.TRUE;
    }

    @Override // com.facebook.react.defaults.DefaultReactNativeHost
    protected boolean isNewArchEnabled() {
        return false;
    }

    @Override // com.facebook.react.ReactNativeHost
    public ArrayList<ReactPackage> getPackages() {
        return new DCDPackageList(this).getPackages();
    }
}