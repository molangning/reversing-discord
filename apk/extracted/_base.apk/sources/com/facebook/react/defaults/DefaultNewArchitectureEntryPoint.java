package com.facebook.react.defaults;

import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007J&\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0015"}, m14357d2 = {"Lcom/facebook/react/defaults/DefaultNewArchitectureEntryPoint;", "", "()V", "concurrentReactEnabled", "", "getConcurrentReactEnabled$annotations", "getConcurrentReactEnabled", "()Z", "fabricEnabled", "getFabricEnabled$annotations", "getFabricEnabled", "privateConcurrentReactEnabled", "privateFabricEnabled", "privateTurboModulesEnabled", "turboModulesEnabled", "getTurboModulesEnabled$annotations", "getTurboModulesEnabled", "load", "", "dynamicLibraryName", "", "ReactAndroid_release"}, m14356k = 1, m14355mv = {1, 7, 1}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class DefaultNewArchitectureEntryPoint {
    public static final DefaultNewArchitectureEntryPoint INSTANCE = new DefaultNewArchitectureEntryPoint();
    private static boolean privateConcurrentReactEnabled;
    private static boolean privateFabricEnabled;
    private static boolean privateTurboModulesEnabled;

    private DefaultNewArchitectureEntryPoint() {
    }

    public static final boolean getConcurrentReactEnabled() {
        return privateConcurrentReactEnabled;
    }

    public static /* synthetic */ void getConcurrentReactEnabled$annotations() {
    }

    public static final boolean getFabricEnabled() {
        return privateFabricEnabled;
    }

    public static /* synthetic */ void getFabricEnabled$annotations() {
    }

    public static final boolean getTurboModulesEnabled() {
        return privateTurboModulesEnabled;
    }

    public static /* synthetic */ void getTurboModulesEnabled$annotations() {
    }

    public static final void load() {
        load$default(false, false, null, 7, null);
    }

    public static final void load(boolean z) {
        load$default(z, false, null, 6, null);
    }

    public static final void load(boolean z, boolean z2) {
        load$default(z, z2, null, 4, null);
    }

    public static final void load(boolean z, boolean z2, String dynamicLibraryName) {
        C9612q.m13917h(dynamicLibraryName, "dynamicLibraryName");
        ReactFeatureFlags.useTurboModules = z;
        ReactFeatureFlags.enableFabricRenderer = z2;
        ReactFeatureFlags.unstable_useFabricInterop = z2;
        privateFabricEnabled = z2;
        privateTurboModulesEnabled = z;
        privateConcurrentReactEnabled = z2;
        SoLoader.m30164r("react_newarchdefaults");
        SoLoader.m30164r(dynamicLibraryName);
    }

    public static /* synthetic */ void load$default(boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            str = "appmodules";
        }
        load(z, z2, str);
    }

    public static /* synthetic */ void load$default(DefaultNewArchitectureEntryPoint defaultNewArchitectureEntryPoint, boolean z, boolean z2, boolean z3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        if ((i & 8) != 0) {
            str = "appmodules";
        }
        defaultNewArchitectureEntryPoint.load(z, z2, z3, str);
    }

    public final void load(boolean z, boolean z2, boolean z3, String dynamicLibraryName) {
        C9612q.m13917h(dynamicLibraryName, "dynamicLibraryName");
        load(z, z2, dynamicLibraryName);
    }
}
