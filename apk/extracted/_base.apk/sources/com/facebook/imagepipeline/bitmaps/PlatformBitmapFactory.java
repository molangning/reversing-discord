package com.facebook.imagepipeline.bitmaps;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class PlatformBitmapFactory {
    /* renamed from: a */
    public CloseableReference<Bitmap> m31203a(int i, int i2) {
        return m31202b(i, i2, Bitmap.Config.ARGB_8888);
    }

    /* renamed from: b */
    public CloseableReference<Bitmap> m31202b(int i, int i2, Bitmap.Config config) {
        return m31201c(i, i2, config, null);
    }

    /* renamed from: c */
    public CloseableReference<Bitmap> m31201c(int i, int i2, Bitmap.Config config, Object obj) {
        return mo9413d(i, i2, config);
    }

    /* renamed from: d */
    public abstract CloseableReference<Bitmap> mo9413d(int i, int i2, Bitmap.Config config);
}
