package com.facebook.react.fabric.mounting;

import android.view.View;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.yoga.YogaMeasureMode;

/* renamed from: com.facebook.react.fabric.mounting.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final /* synthetic */ class C4101a {
    /* renamed from: a */
    public static float m30369a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 0) {
            return Float.POSITIVE_INFINITY;
        }
        return size;
    }

    /* renamed from: b */
    public static float m30368b(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static YogaMeasureMode m30367c(float f, float f2) {
        if (f == f2) {
            return YogaMeasureMode.EXACTLY;
        }
        if (Float.isInfinite(f2)) {
            return YogaMeasureMode.UNDEFINED;
        }
        return YogaMeasureMode.AT_MOST;
    }

    /* renamed from: d */
    public static float m30366d(float f, float f2) {
        if (f == f2) {
            return PixelUtil.toPixelFromDIP(f2);
        }
        if (Float.isInfinite(f2)) {
            return Float.POSITIVE_INFINITY;
        }
        return PixelUtil.toPixelFromDIP(f2);
    }
}