package com.mrousavy.camera.frameprocessor;

import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.Map;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
@Keep
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class FrameProcessorPluginRegistry {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Map<String, InterfaceC5303a> Plugins = new HashMap();

    /* renamed from: com.mrousavy.camera.frameprocessor.FrameProcessorPluginRegistry$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC5303a {
        /* renamed from: a */
        FrameProcessorPlugin m25523a(Map<String, Object> map);
    }

    @InterfaceC6107a
    @Keep
    public static void addFrameProcessorPlugin(String str, InterfaceC5303a interfaceC5303a) {
        Plugins.put(str, interfaceC5303a);
    }

    @InterfaceC6107a
    @Keep
    public static FrameProcessorPlugin getPlugin(String str, Map<String, Object> map) {
        InterfaceC5303a interfaceC5303a = Plugins.get(str);
        if (interfaceC5303a == null) {
            return null;
        }
        return interfaceC5303a.m25523a(map);
    }
}
