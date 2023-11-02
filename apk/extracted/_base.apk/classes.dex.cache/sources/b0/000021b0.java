package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface TransformCallback {
    void getRootBounds(RectF rectF);

    void getTransform(Matrix matrix);
}