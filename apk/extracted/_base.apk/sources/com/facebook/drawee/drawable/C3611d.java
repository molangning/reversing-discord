package com.facebook.drawee.drawable;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.drawee.drawable.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3611d {
    /* renamed from: a */
    public static void m31527a(Drawable drawable, Drawable drawable2) {
        if (drawable2 != null && drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }

    /* renamed from: b */
    public static int m31526b(int i) {
        int i2 = i >>> 24;
        if (i2 == 255) {
            return -1;
        }
        return i2 == 0 ? -2 : -3;
    }

    /* renamed from: c */
    public static int m31525c(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    /* renamed from: d */
    public static void m31524d(Drawable drawable, Drawable.Callback callback, TransformCallback transformCallback) {
        if (drawable != null) {
            drawable.setCallback(callback);
            if (drawable instanceof InterfaceC3625o) {
                ((InterfaceC3625o) drawable).setTransformCallback(transformCallback);
            }
        }
    }

    /* renamed from: e */
    public static void m31523e(Drawable drawable, DrawableProperties drawableProperties) {
        if (drawable == null || drawableProperties == null) {
            return;
        }
        drawableProperties.m31544a(drawable);
    }
}
