package p278p4;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import p292q2.C11694h;

/* renamed from: p4.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11400k implements InterfaceC11392f {

    /* renamed from: a */
    private static C11400k f29697a;

    protected C11400k() {
    }

    /* renamed from: f */
    public static synchronized C11400k m8147f() {
        C11400k c11400k;
        synchronized (C11400k.class) {
            if (f29697a == null) {
                f29697a = new C11400k();
            }
            c11400k = f29697a;
        }
        return c11400k;
    }

    @Override // p278p4.InterfaceC11392f
    /* renamed from: a */
    public CacheKey mo8152a(ImageRequest imageRequest, Object obj) {
        return new C11383b(m8148e(imageRequest.getSourceUri()).toString(), imageRequest.getResizeOptions(), imageRequest.getRotationOptions(), imageRequest.getImageDecodeOptions(), null, null, obj);
    }

    @Override // p278p4.InterfaceC11392f
    /* renamed from: b */
    public CacheKey mo8151b(ImageRequest imageRequest, Uri uri, Object obj) {
        return new C11694h(m8148e(uri).toString());
    }

    @Override // p278p4.InterfaceC11392f
    /* renamed from: c */
    public CacheKey mo8150c(ImageRequest imageRequest, Object obj) {
        CacheKey cacheKey;
        String str;
        Postprocessor postprocessor = imageRequest.getPostprocessor();
        if (postprocessor != null) {
            CacheKey postprocessorCacheKey = postprocessor.getPostprocessorCacheKey();
            str = postprocessor.getClass().getName();
            cacheKey = postprocessorCacheKey;
        } else {
            cacheKey = null;
            str = null;
        }
        return new C11383b(m8148e(imageRequest.getSourceUri()).toString(), imageRequest.getResizeOptions(), imageRequest.getRotationOptions(), imageRequest.getImageDecodeOptions(), cacheKey, str, obj);
    }

    @Override // p278p4.InterfaceC11392f
    /* renamed from: d */
    public CacheKey mo8149d(ImageRequest imageRequest, Object obj) {
        return mo8151b(imageRequest, imageRequest.getSourceUri(), obj);
    }

    /* renamed from: e */
    protected Uri m8148e(Uri uri) {
        return uri;
    }
}
