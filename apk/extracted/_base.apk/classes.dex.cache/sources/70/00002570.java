package com.facebook.react.fabric;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;
import p150i5.C7382a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class FabricSoLoader {
    private static volatile boolean sDidInit = false;

    public static void staticInit() {
        if (sDidInit) {
            return;
        }
        C7382a.m20813c(0L, "FabricSoLoader.staticInit::load:fabricjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
        SoLoader.m30164r("fabricjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
        C7382a.m20809g(0L);
        sDidInit = true;
    }
}