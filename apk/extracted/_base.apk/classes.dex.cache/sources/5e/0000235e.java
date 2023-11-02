package com.facebook.react;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.airbnb.android.react.lottie.C2707i;
import com.discord.codegen.RTNCodegenPackage;
import com.discord.kvstorage.KvStoragePackage;
import com.dooboolab.RNIap.C3558o;
import com.facebook.react.shell.MainPackageConfig;
import com.facebook.react.shell.MainReactPackage;
import com.github.yamill.orientation.C4350a;
import com.henninghall.date_picker.C5136a;
import com.horcrux.svg.SvgPackage;
import com.imagepicker.C5256c;
import com.mkuczera.C5275a;
import com.mrousavy.camera.C5301e;
import com.p046BV.LinearGradient.C2692a;
import com.reactnative.ivpusic.imagepicker.C5382e;
import com.reactnativecommunity.slider.C5402e;
import com.reactnativecommunity.webview.C5436e1;
import com.reactnativepagerview.C5485b;
import com.rnfs.C5514g;
import com.shopify.reactnative.skia.RNSkiaPackage;
import com.swmansion.reanimated.ReanimatedPackage;
import com.swmansion.rnscreens.C5622i;
import com.th3rdwave.safeareacontext.C5669c;
import ge.C6739a;
import io.sentry.react.C8153m;
import java.util.ArrayList;
import java.util.Arrays;
import ke.C9218b;
import me.C10446e;
import p002a1.C0010a;
import p105fe.C6407b;
import p138he.C7088f;
import p203kk.C9530a;
import p267oe.C11085a;
import p393w1.C13366c;
import p395w3.C13387a;
import p454z1.C14071c;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class PackageList {
    private Application application;
    private MainPackageConfig mConfig;
    private ReactNativeHost reactNativeHost;

    public PackageList(ReactNativeHost reactNativeHost) {
        this(reactNativeHost, (MainPackageConfig) null);
    }

    private Application getApplication() {
        ReactNativeHost reactNativeHost = this.reactNativeHost;
        if (reactNativeHost == null) {
            return this.application;
        }
        return reactNativeHost.getApplication();
    }

    private Context getApplicationContext() {
        return getApplication().getApplicationContext();
    }

    private ReactNativeHost getReactNativeHost() {
        return this.reactNativeHost;
    }

    private Resources getResources() {
        return getApplication().getResources();
    }

    public ArrayList<ReactPackage> getPackages() {
        return new ArrayList<>(Arrays.asList(new MainReactPackage(this.mConfig), new C14071c(), new KvStoragePackage(), new RTNCodegenPackage(), new C6739a(), new C6407b(), new C7088f(), new C5402e(), new C8153m(), new C10446e(), new RNSkiaPackage(), new C2707i(), new C0010a(), new C5136a(), new C9218b(), new C5514g(), new C11085a(), new C9530a(), new C5275a(), new C3558o(), new C5382e(), new C5256c(), new C2692a(), new C4350a(), new C5485b(), new ReanimatedPackage(), new C5669c(), new C5622i(), new SvgPackage(), new C5301e(), new C5436e1(), new C13366c(), new C13387a()));
    }

    public PackageList(Application application) {
        this(application, (MainPackageConfig) null);
    }

    public PackageList(ReactNativeHost reactNativeHost, MainPackageConfig mainPackageConfig) {
        this.reactNativeHost = reactNativeHost;
        this.mConfig = mainPackageConfig;
    }

    public PackageList(Application application, MainPackageConfig mainPackageConfig) {
        this.reactNativeHost = null;
        this.application = application;
        this.mConfig = mainPackageConfig;
    }
}