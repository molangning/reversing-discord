package p457z4;

import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.nativecode.NativeRoundingFilter;
import com.facebook.imagepipeline.request.BasePostprocessor;
import p292q2.C11694h;

/* renamed from: z4.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C14088a extends BasePostprocessor {
    private static final boolean ENABLE_ANTI_ALIASING = true;
    private CacheKey mCacheKey;
    private final boolean mEnableAntiAliasing;

    public C14088a() {
        this(true);
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    public CacheKey getPostprocessorCacheKey() {
        if (this.mCacheKey == null) {
            if (this.mEnableAntiAliasing) {
                this.mCacheKey = new C11694h("RoundAsCirclePostprocessor#AntiAliased");
            } else {
                this.mCacheKey = new C11694h("RoundAsCirclePostprocessor");
            }
        }
        return this.mCacheKey;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap bitmap) {
        NativeRoundingFilter.toCircleFast(bitmap, this.mEnableAntiAliasing);
    }

    public C14088a(boolean z) {
        this.mEnableAntiAliasing = z;
    }
}