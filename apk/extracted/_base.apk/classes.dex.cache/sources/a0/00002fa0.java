package com.swmansion.reanimated;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.react.views.image.ReactImageView;
import com.facebook.react.views.view.ReactViewBackgroundDrawable;
import java.lang.reflect.Field;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactNativeUtils {
    private static Field mBorderRadiusField;

    public static float getBorderRadius(View view) {
        if (view.getBackground() != null) {
            Drawable background = view.getBackground();
            if (background instanceof ReactViewBackgroundDrawable) {
                return ((ReactViewBackgroundDrawable) background).getFullBorderRadius();
            }
        } else if (view instanceof ReactImageView) {
            try {
                if (mBorderRadiusField == null) {
                    Field declaredField = ReactImageView.class.getDeclaredField("mBorderRadius");
                    mBorderRadiusField = declaredField;
                    declaredField.setAccessible(true);
                }
                float f = mBorderRadiusField.getFloat(view);
                if (Float.isNaN(f)) {
                    return 0.0f;
                }
                return f;
            } catch (IllegalAccessException | NoSuchFieldException | NullPointerException unused) {
            }
        }
        return 0.0f;
    }
}