package com.facebook.drawee.drawable;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DrawableProperties {

    /* renamed from: a */
    private int f9816a = -1;

    /* renamed from: b */
    private boolean f9817b = false;

    /* renamed from: c */
    private ColorFilter f9818c = null;

    /* renamed from: d */
    private int f9819d = -1;

    /* renamed from: e */
    private int f9820e = -1;

    @SuppressLint({"Range"})
    /* renamed from: a */
    public void m31544a(Drawable drawable) {
        boolean z;
        if (drawable == null) {
            return;
        }
        int i = this.f9816a;
        if (i != -1) {
            drawable.setAlpha(i);
        }
        if (this.f9817b) {
            drawable.setColorFilter(this.f9818c);
        }
        int i2 = this.f9819d;
        boolean z2 = true;
        if (i2 != -1) {
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            drawable.setDither(z);
        }
        int i3 = this.f9820e;
        if (i3 != -1) {
            if (i3 == 0) {
                z2 = false;
            }
            drawable.setFilterBitmap(z2);
        }
    }

    /* renamed from: b */
    public void m31543b(int i) {
        this.f9816a = i;
    }

    /* renamed from: c */
    public void m31542c(ColorFilter colorFilter) {
        boolean z;
        this.f9818c = colorFilter;
        if (colorFilter != null) {
            z = true;
        } else {
            z = false;
        }
        this.f9817b = z;
    }

    /* renamed from: d */
    public void m31541d(boolean z) {
        this.f9819d = z ? 1 : 0;
    }

    /* renamed from: e */
    public void m31540e(boolean z) {
        this.f9820e = z ? 1 : 0;
    }
}
