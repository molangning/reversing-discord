package com.facebook.imagepipeline.postprocessors;

import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.facebook.imagepipeline.request.BasePostprocessor;
import p292q2.C11694h;
import p394w2.C13379j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class IterativeBoxBlurPostProcessor extends BasePostprocessor {

    /* renamed from: a */
    private final int f10544a;

    /* renamed from: b */
    private final int f10545b;

    /* renamed from: c */
    private CacheKey f10546c;

    public IterativeBoxBlurPostProcessor(int i, int i2) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        C13379j.m2682b(Boolean.valueOf(i2 > 0));
        this.f10544a = i;
        this.f10545b = i2;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    public CacheKey getPostprocessorCacheKey() {
        if (this.f10546c == null) {
            this.f10546c = new C11694h(String.format(null, "i%dr%d", Integer.valueOf(this.f10544a), Integer.valueOf(this.f10545b)));
        }
        return this.f10546c;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap bitmap) {
        NativeBlurFilter.m30954a(bitmap, this.f10544a, this.f10545b);
    }
}
