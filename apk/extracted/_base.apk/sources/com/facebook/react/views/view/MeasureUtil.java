package com.facebook.react.views.view;

import android.view.View;
import com.facebook.yoga.YogaMeasureMode;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class MeasureUtil {
    public static int getMeasureSpec(float f, YogaMeasureMode yogaMeasureMode) {
        if (yogaMeasureMode == YogaMeasureMode.EXACTLY) {
            return View.MeasureSpec.makeMeasureSpec((int) f, 1073741824);
        }
        if (yogaMeasureMode == YogaMeasureMode.AT_MOST) {
            return View.MeasureSpec.makeMeasureSpec((int) f, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}
