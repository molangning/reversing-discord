package com.facebook.react.views.image;

import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.request.Postprocessor;
import java.util.LinkedList;
import java.util.List;
import p292q2.C11691e;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class MultiPostprocessor implements Postprocessor {
    private final List<Postprocessor> mPostprocessors;

    private MultiPostprocessor(List<Postprocessor> list) {
        this.mPostprocessors = new LinkedList(list);
    }

    public static Postprocessor from(List<Postprocessor> list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return new MultiPostprocessor(list);
            }
            return list.get(0);
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public String getName() {
        StringBuilder sb2 = new StringBuilder();
        for (Postprocessor postprocessor : this.mPostprocessors) {
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            sb2.append(postprocessor.getName());
        }
        sb2.insert(0, "MultiPostProcessor (");
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public CacheKey getPostprocessorCacheKey() {
        LinkedList linkedList = new LinkedList();
        for (Postprocessor postprocessor : this.mPostprocessors) {
            linkedList.push(postprocessor.getPostprocessorCacheKey());
        }
        return new C11691e(linkedList);
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public CloseableReference<Bitmap> process(Bitmap bitmap, PlatformBitmapFactory platformBitmapFactory) {
        Bitmap bitmap2;
        CloseableReference<Bitmap> closeableReference = null;
        try {
            CloseableReference<Bitmap> closeableReference2 = null;
            for (Postprocessor postprocessor : this.mPostprocessors) {
                if (closeableReference2 != null) {
                    bitmap2 = closeableReference2.m31730D();
                } else {
                    bitmap2 = bitmap;
                }
                closeableReference = postprocessor.process(bitmap2, platformBitmapFactory);
                CloseableReference.m31715v(closeableReference2);
                closeableReference2 = closeableReference.clone();
            }
            return closeableReference.clone();
        } finally {
            CloseableReference.m31715v(closeableReference);
        }
    }
}