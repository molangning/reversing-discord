package com.facebook.react.uimanager.common;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ViewUtil {
    public static int getUIManagerType(int i) {
        return i % 2 == 0 ? 2 : 1;
    }

    @Deprecated
    public static boolean isRootTag(int i) {
        return i % 10 == 1;
    }
}
