package com.facebook.react.uimanager;

import com.facebook.yoga.AbstractC4337a;
import com.facebook.yoga.YogaConfig;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactYogaConfigProvider {
    private static YogaConfig YOGA_CONFIG;

    public static YogaConfig get() {
        if (YOGA_CONFIG == null) {
            YogaConfig m29975a = AbstractC4337a.m29975a();
            YOGA_CONFIG = m29975a;
            m29975a.mo29974a(0.0f);
            YOGA_CONFIG.mo29973b(true);
        }
        return YOGA_CONFIG;
    }
}
