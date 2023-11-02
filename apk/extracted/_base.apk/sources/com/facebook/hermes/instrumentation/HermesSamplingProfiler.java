package com.facebook.hermes.instrumentation;

import com.facebook.soloader.SoLoader;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class HermesSamplingProfiler {
    static {
        SoLoader.m30164r("jsijniprofiler");
    }

    public static native void disable();

    public static native void dumpSampledTraceToFile(String str);

    public static native void enable();
}
