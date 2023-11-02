package com.facebook.imagepipeline.request;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p314r4.C12056h;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class BasePostprocessor implements Postprocessor {
    public static final Bitmap.Config FALLBACK_BITMAP_CONFIGURATION = Bitmap.Config.ARGB_8888;
    private static Method sCopyBitmap;

    private static void internalCopyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (C12056h.m6420a() && bitmap.getConfig() == bitmap2.getConfig()) {
            try {
                if (sCopyBitmap == null) {
                    int i = Bitmaps.f10522a;
                    sCopyBitmap = Bitmaps.class.getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
                }
                sCopyBitmap.invoke(null, bitmap, bitmap2);
                return;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e4);
            }
        }
        new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public String getName() {
        return "Unknown postprocessor";
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public CacheKey getPostprocessorCacheKey() {
        return null;
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public CloseableReference<Bitmap> process(Bitmap bitmap, PlatformBitmapFactory platformBitmapFactory) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = FALLBACK_BITMAP_CONFIGURATION;
        }
        CloseableReference<Bitmap> mo9413d = platformBitmapFactory.mo9413d(width, height, config);
        try {
            process(mo9413d.m31730D(), bitmap);
            return mo9413d.clone();
        } finally {
            CloseableReference.m31715v(mo9413d);
        }
    }

    public void process(Bitmap bitmap) {
    }

    public void process(Bitmap bitmap, Bitmap bitmap2) {
        internalCopyBitmap(bitmap, bitmap2);
        process(bitmap);
    }
}
