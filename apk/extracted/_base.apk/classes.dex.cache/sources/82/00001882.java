package com.discord.image.fresco.postprocessors.processors;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.BasePostprocessor;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p292q2.C11694h;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, m14357d2 = {"Lcom/discord/image/fresco/postprocessors/processors/GrayscalePostprocessor;", "Lcom/facebook/imagepipeline/request/BasePostprocessor;", "()V", "getName", "", "getPostprocessorCacheKey", "Lcom/facebook/cache/common/CacheKey;", "process", "", "destBitmap", "Landroid/graphics/Bitmap;", "sourceBitmap", "fresco_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class GrayscalePostprocessor extends BasePostprocessor {
    public static final GrayscalePostprocessor INSTANCE = new GrayscalePostprocessor();

    private GrayscalePostprocessor() {
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    public String getName() {
        String simpleName = GrayscalePostprocessor.class.getSimpleName();
        C9612q.m13918g(simpleName, "javaClass.simpleName");
        return simpleName;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    public CacheKey getPostprocessorCacheKey() {
        return new C11694h(getName());
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap destBitmap, Bitmap sourceBitmap) {
        C9612q.m13917h(destBitmap, "destBitmap");
        C9612q.m13917h(sourceBitmap, "sourceBitmap");
        super.process(destBitmap, sourceBitmap);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        new Canvas(destBitmap).drawBitmap(sourceBitmap, 0.0f, 0.0f, paint);
    }
}