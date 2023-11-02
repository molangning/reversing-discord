package com.facebook.react.views.image;

import android.graphics.Shader;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.react.common.ReactConstants;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ImageResizeMode {
    private static final String RESIZE_MODE_CENTER = "center";
    private static final String RESIZE_MODE_CONTAIN = "contain";
    private static final String RESIZE_MODE_COVER = "cover";
    private static final String RESIZE_MODE_REPEAT = "repeat";
    private static final String RESIZE_MODE_STRETCH = "stretch";

    public static Shader.TileMode defaultTileMode() {
        return Shader.TileMode.CLAMP;
    }

    public static ScalingUtils.ScaleType defaultValue() {
        return ScalingUtils.ScaleType.f9844i;
    }

    public static ScalingUtils.ScaleType toScaleType(String str) {
        if (RESIZE_MODE_CONTAIN.equals(str)) {
            return ScalingUtils.ScaleType.f9840e;
        }
        if (RESIZE_MODE_COVER.equals(str)) {
            return ScalingUtils.ScaleType.f9844i;
        }
        if (RESIZE_MODE_STRETCH.equals(str)) {
            return ScalingUtils.ScaleType.f9836a;
        }
        if (RESIZE_MODE_CENTER.equals(str)) {
            return ScalingUtils.ScaleType.f9843h;
        }
        if (RESIZE_MODE_REPEAT.equals(str)) {
            return ScaleTypeStartInside.INSTANCE;
        }
        if (str != null) {
            C13677a.m1870H(ReactConstants.TAG, "Invalid resize mode: '" + str + "'");
        }
        return defaultValue();
    }

    public static Shader.TileMode toTileMode(String str) {
        if (!RESIZE_MODE_CONTAIN.equals(str) && !RESIZE_MODE_COVER.equals(str) && !RESIZE_MODE_STRETCH.equals(str) && !RESIZE_MODE_CENTER.equals(str)) {
            if (RESIZE_MODE_REPEAT.equals(str)) {
                return Shader.TileMode.REPEAT;
            }
            if (str != null) {
                C13677a.m1870H(ReactConstants.TAG, "Invalid resize mode: '" + str + "'");
            }
            return defaultTileMode();
        }
        return Shader.TileMode.CLAMP;
    }
}
