package com.facebook.imagepipeline.request;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.InterfaceC3561Fn;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.listener.RequestListener;
import java.io.File;
import p075e3.C6104f;
import p394w2.C13375i;
import p435y2.C13869a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ImageRequest {
    public static final InterfaceC3561Fn<ImageRequest, Uri> REQUEST_TO_URI_FN = new C3870a();
    private static boolean sCacheHashcode;
    private static boolean sUseCachedHashcodeInEquals;
    private final BytesRange mBytesRange;
    private final CacheChoice mCacheChoice;
    private final Boolean mDecodePrefetches;
    private final int mDelayMs;
    private int mHashcode;
    private final ImageDecodeOptions mImageDecodeOptions;
    private final boolean mIsDiskCacheEnabled;
    private final boolean mIsMemoryCacheEnabled;
    private final boolean mLocalThumbnailPreviewsEnabled;
    private final RequestLevel mLowestPermittedRequestLevel;
    private final Postprocessor mPostprocessor;
    private final boolean mProgressiveRenderingEnabled;
    private final RequestListener mRequestListener;
    private final Priority mRequestPriority;
    private final ResizeOptions mResizeOptions;
    private final Boolean mResizingAllowedOverride;
    private final RotationOptions mRotationOptions;
    private File mSourceFile;
    private final Uri mSourceUri;
    private final int mSourceUriType;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum CacheChoice {
        SMALL,
        DEFAULT
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum RequestLevel {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        

        /* renamed from: j */
        private int f10876j;

        RequestLevel(int i) {
            this.f10876j = i;
        }

        /* renamed from: a */
        public static RequestLevel m30598a(RequestLevel requestLevel, RequestLevel requestLevel2) {
            return requestLevel.m30597b() > requestLevel2.m30597b() ? requestLevel : requestLevel2;
        }

        /* renamed from: b */
        public int m30597b() {
            return this.f10876j;
        }
    }

    /* renamed from: com.facebook.imagepipeline.request.ImageRequest$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class C3870a implements InterfaceC3561Fn<ImageRequest, Uri> {
        C3870a() {
        }

        @Override // com.facebook.common.internal.InterfaceC3561Fn
        /* renamed from: a */
        public Uri apply(ImageRequest imageRequest) {
            if (imageRequest != null) {
                return imageRequest.getSourceUri();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ImageRequest(ImageRequestBuilder imageRequestBuilder) {
        RotationOptions m30573m;
        this.mCacheChoice = imageRequestBuilder.m30582d();
        Uri m30572n = imageRequestBuilder.m30572n();
        this.mSourceUri = m30572n;
        this.mSourceUriType = getSourceUriType(m30572n);
        this.mProgressiveRenderingEnabled = imageRequestBuilder.m30568r();
        this.mLocalThumbnailPreviewsEnabled = imageRequestBuilder.m30570p();
        this.mImageDecodeOptions = imageRequestBuilder.m30580f();
        this.mResizeOptions = imageRequestBuilder.m30575k();
        if (imageRequestBuilder.m30573m() == null) {
            m30573m = RotationOptions.m31189a();
        } else {
            m30573m = imageRequestBuilder.m30573m();
        }
        this.mRotationOptions = m30573m;
        this.mBytesRange = imageRequestBuilder.m30583c();
        this.mRequestPriority = imageRequestBuilder.m30576j();
        this.mLowestPermittedRequestLevel = imageRequestBuilder.m30579g();
        this.mIsDiskCacheEnabled = imageRequestBuilder.m30571o();
        this.mIsMemoryCacheEnabled = imageRequestBuilder.m30569q();
        this.mDecodePrefetches = imageRequestBuilder.m30587I();
        this.mPostprocessor = imageRequestBuilder.m30578h();
        this.mRequestListener = imageRequestBuilder.m30577i();
        this.mResizingAllowedOverride = imageRequestBuilder.m30574l();
        this.mDelayMs = imageRequestBuilder.m30581e();
    }

    public static ImageRequest fromFile(File file) {
        if (file == null) {
            return null;
        }
        return fromUri(C6104f.m23569d(file));
    }

    public static ImageRequest fromUri(Uri uri) {
        if (uri == null) {
            return null;
        }
        return ImageRequestBuilder.m30567s(uri).m30585a();
    }

    public static void setCacheHashcode(boolean z) {
        sCacheHashcode = z;
    }

    public static void setUseCachedHashcodeInEquals(boolean z) {
        sUseCachedHashcodeInEquals = z;
    }

    public boolean equals(Object obj) {
        CacheKey cacheKey;
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        if (sUseCachedHashcodeInEquals) {
            int i = this.mHashcode;
            int i2 = imageRequest.mHashcode;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
        }
        if (this.mLocalThumbnailPreviewsEnabled != imageRequest.mLocalThumbnailPreviewsEnabled || this.mIsDiskCacheEnabled != imageRequest.mIsDiskCacheEnabled || this.mIsMemoryCacheEnabled != imageRequest.mIsMemoryCacheEnabled || !C13375i.m2691a(this.mSourceUri, imageRequest.mSourceUri) || !C13375i.m2691a(this.mCacheChoice, imageRequest.mCacheChoice) || !C13375i.m2691a(this.mSourceFile, imageRequest.mSourceFile) || !C13375i.m2691a(this.mBytesRange, imageRequest.mBytesRange) || !C13375i.m2691a(this.mImageDecodeOptions, imageRequest.mImageDecodeOptions) || !C13375i.m2691a(this.mResizeOptions, imageRequest.mResizeOptions) || !C13375i.m2691a(this.mRequestPriority, imageRequest.mRequestPriority) || !C13375i.m2691a(this.mLowestPermittedRequestLevel, imageRequest.mLowestPermittedRequestLevel) || !C13375i.m2691a(this.mDecodePrefetches, imageRequest.mDecodePrefetches) || !C13375i.m2691a(this.mResizingAllowedOverride, imageRequest.mResizingAllowedOverride) || !C13375i.m2691a(this.mRotationOptions, imageRequest.mRotationOptions)) {
            return false;
        }
        Postprocessor postprocessor = this.mPostprocessor;
        CacheKey cacheKey2 = null;
        if (postprocessor != null) {
            cacheKey = postprocessor.getPostprocessorCacheKey();
        } else {
            cacheKey = null;
        }
        Postprocessor postprocessor2 = imageRequest.mPostprocessor;
        if (postprocessor2 != null) {
            cacheKey2 = postprocessor2.getPostprocessorCacheKey();
        }
        if (!C13375i.m2691a(cacheKey, cacheKey2) || this.mDelayMs != imageRequest.mDelayMs) {
            return false;
        }
        return true;
    }

    @Deprecated
    public boolean getAutoRotateEnabled() {
        return this.mRotationOptions.m31183g();
    }

    public BytesRange getBytesRange() {
        return this.mBytesRange;
    }

    public CacheChoice getCacheChoice() {
        return this.mCacheChoice;
    }

    public int getDelayMs() {
        return this.mDelayMs;
    }

    public ImageDecodeOptions getImageDecodeOptions() {
        return this.mImageDecodeOptions;
    }

    public boolean getLocalThumbnailPreviewsEnabled() {
        return this.mLocalThumbnailPreviewsEnabled;
    }

    public RequestLevel getLowestPermittedRequestLevel() {
        return this.mLowestPermittedRequestLevel;
    }

    public Postprocessor getPostprocessor() {
        return this.mPostprocessor;
    }

    public int getPreferredHeight() {
        ResizeOptions resizeOptions = this.mResizeOptions;
        return resizeOptions != null ? resizeOptions.f10301b : RecyclerView.ItemAnimator.FLAG_MOVED;
    }

    public int getPreferredWidth() {
        ResizeOptions resizeOptions = this.mResizeOptions;
        return resizeOptions != null ? resizeOptions.f10300a : RecyclerView.ItemAnimator.FLAG_MOVED;
    }

    public Priority getPriority() {
        return this.mRequestPriority;
    }

    public boolean getProgressiveRenderingEnabled() {
        return this.mProgressiveRenderingEnabled;
    }

    public RequestListener getRequestListener() {
        return this.mRequestListener;
    }

    public ResizeOptions getResizeOptions() {
        return this.mResizeOptions;
    }

    public Boolean getResizingAllowedOverride() {
        return this.mResizingAllowedOverride;
    }

    public RotationOptions getRotationOptions() {
        return this.mRotationOptions;
    }

    public synchronized File getSourceFile() {
        if (this.mSourceFile == null) {
            this.mSourceFile = new File(this.mSourceUri.getPath());
        }
        return this.mSourceFile;
    }

    public Uri getSourceUri() {
        return this.mSourceUri;
    }

    public int getSourceUriType() {
        return this.mSourceUriType;
    }

    public int hashCode() {
        int i;
        CacheKey cacheKey;
        boolean z = sCacheHashcode;
        if (z) {
            i = this.mHashcode;
        } else {
            i = 0;
        }
        if (i == 0) {
            Postprocessor postprocessor = this.mPostprocessor;
            if (postprocessor != null) {
                cacheKey = postprocessor.getPostprocessorCacheKey();
            } else {
                cacheKey = null;
            }
            i = C13375i.m2690b(this.mCacheChoice, this.mSourceUri, Boolean.valueOf(this.mLocalThumbnailPreviewsEnabled), this.mBytesRange, this.mRequestPriority, this.mLowestPermittedRequestLevel, Boolean.valueOf(this.mIsDiskCacheEnabled), Boolean.valueOf(this.mIsMemoryCacheEnabled), this.mImageDecodeOptions, this.mDecodePrefetches, this.mResizeOptions, this.mRotationOptions, cacheKey, this.mResizingAllowedOverride, Integer.valueOf(this.mDelayMs));
            if (z) {
                this.mHashcode = i;
            }
        }
        return i;
    }

    public boolean isDiskCacheEnabled() {
        return this.mIsDiskCacheEnabled;
    }

    public boolean isMemoryCacheEnabled() {
        return this.mIsMemoryCacheEnabled;
    }

    public Boolean shouldDecodePrefetches() {
        return this.mDecodePrefetches;
    }

    public String toString() {
        return C13375i.m2689c(this).m2687b("uri", this.mSourceUri).m2687b("cacheChoice", this.mCacheChoice).m2687b("decodeOptions", this.mImageDecodeOptions).m2687b("postprocessor", this.mPostprocessor).m2687b("priority", this.mRequestPriority).m2687b("resizeOptions", this.mResizeOptions).m2687b("rotationOptions", this.mRotationOptions).m2687b("bytesRange", this.mBytesRange).m2687b("resizingAllowedOverride", this.mResizingAllowedOverride).m2686c("progressiveRenderingEnabled", this.mProgressiveRenderingEnabled).m2686c("localThumbnailPreviewsEnabled", this.mLocalThumbnailPreviewsEnabled).m2687b("lowestPermittedRequestLevel", this.mLowestPermittedRequestLevel).m2686c("isDiskCacheEnabled", this.mIsDiskCacheEnabled).m2686c("isMemoryCacheEnabled", this.mIsMemoryCacheEnabled).m2687b("decodePrefetches", this.mDecodePrefetches).m2688a("delayMs", this.mDelayMs).toString();
    }

    public static ImageRequest fromUri(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return fromUri(Uri.parse(str));
    }

    private static int getSourceUriType(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (C6104f.m23560m(uri)) {
            return 0;
        }
        if (C6104f.m23562k(uri)) {
            return C13869a.m1349c(C13869a.m1350b(uri.getPath())) ? 2 : 3;
        } else if (C6104f.m23563j(uri)) {
            return 4;
        } else {
            if (C6104f.m23566g(uri)) {
                return 5;
            }
            if (C6104f.m23561l(uri)) {
                return 6;
            }
            if (C6104f.m23567f(uri)) {
                return 7;
            }
            return C6104f.m23559n(uri) ? 8 : -1;
        }
    }
}
