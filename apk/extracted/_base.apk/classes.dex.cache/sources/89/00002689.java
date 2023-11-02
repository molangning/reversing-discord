package com.facebook.react.uimanager;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class FloatUtil {
    private static final float EPSILON = 1.0E-5f;

    public static boolean floatsEqual(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            if (Math.abs(f2 - f) < EPSILON) {
                return true;
            }
            return false;
        } else if (Float.isNaN(f) && Float.isNaN(f2)) {
            return true;
        } else {
            return false;
        }
    }
}