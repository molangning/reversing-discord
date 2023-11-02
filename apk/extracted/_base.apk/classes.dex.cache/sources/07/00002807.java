package com.facebook.react.views.image;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.facebook.common.references.CloseableReference;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.drawable.RoundedColorDrawable;
import com.facebook.drawee.drawable.RunnableC3609b;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.C3628a;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.C3637b;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.postprocessors.IterativeBoxBlurPostProcessor;
import com.facebook.imagepipeline.request.BasePostprocessor;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.MultiSourceHelper;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.facebook.yoga.C4340d;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import p075e3.C6104f;
import p293q3.C11698c;
import p394w2.C13375i;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactImageView extends C3637b {
    public static final int REMOTE_IMAGE_FADE_DURATION_MS = 300;
    private static float[] sComputedCornerRadii = new float[4];
    private static final Matrix sTileMatrix = new Matrix();
    private int mBackgroundColor;
    private RoundedColorDrawable mBackgroundImageDrawable;
    private int mBorderColor;
    private float[] mBorderCornerRadii;
    private float mBorderRadius;
    private float mBorderWidth;
    private ImageSource mCachedImageSource;
    private Object mCallerContext;
    private ControllerListener mControllerForTesting;
    private Drawable mDefaultImageDrawable;
    private ReactImageDownloadListener mDownloadListener;
    private final AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    private int mFadeDurationMs;
    private GlobalImageLoadListener mGlobalImageLoadListener;
    private ReadableMap mHeaders;
    private ImageSource mImageSource;
    private boolean mIsDirty;
    private IterativeBoxBlurPostProcessor mIterativeBoxBlurPostProcessor;
    private Drawable mLoadingImageDrawable;
    private int mOverlayColor;
    private boolean mProgressiveRenderingEnabled;
    private ImageResizeMethod mResizeMethod;
    private ScalingUtils.ScaleType mScaleType;
    private final List<ImageSource> mSources;
    private Shader.TileMode mTileMode;
    private TilePostprocessor mTilePostprocessor;
    private boolean mUseSmallCache;
    private RoundingOutlineProvider viewOutlineProvider;

    @SuppressLint({"NewApi"})
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RoundingOutlineProvider extends ViewOutlineProvider {
        Float radius;

        private RoundingOutlineProvider() {
            ReactImageView.this = r1;
            this.radius = Float.valueOf(0.0f);
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.radius.floatValue());
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class TilePostprocessor extends BasePostprocessor {
        private TilePostprocessor() {
            ReactImageView.this = r1;
        }

        @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
        public CloseableReference<Bitmap> process(Bitmap bitmap, PlatformBitmapFactory platformBitmapFactory) {
            Rect rect = new Rect(0, 0, ReactImageView.this.getWidth(), ReactImageView.this.getHeight());
            ReactImageView.this.mScaleType.getTransform(ReactImageView.sTileMatrix, rect, bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(bitmap, ReactImageView.this.mTileMode, ReactImageView.this.mTileMode);
            bitmapShader.setLocalMatrix(ReactImageView.sTileMatrix);
            paint.setShader(bitmapShader);
            CloseableReference<Bitmap> m31203a = platformBitmapFactory.m31203a(ReactImageView.this.getWidth(), ReactImageView.this.getHeight());
            try {
                new Canvas(m31203a.m31730D()).drawRect(rect, paint);
                return m31203a.clone();
            } finally {
                CloseableReference.m31715v(m31203a);
            }
        }
    }

    public ReactImageView(Context context, AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, GlobalImageLoadListener globalImageLoadListener, Object obj) {
        super(context, buildHierarchy(context));
        this.mResizeMethod = ImageResizeMethod.AUTO;
        this.mSources = new LinkedList();
        this.mBackgroundColor = 0;
        this.mBorderRadius = Float.NaN;
        this.mScaleType = ImageResizeMode.defaultValue();
        this.mTileMode = ImageResizeMode.defaultTileMode();
        this.mFadeDurationMs = -1;
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mGlobalImageLoadListener = globalImageLoadListener;
        this.mCallerContext = obj;
    }

    private static GenericDraweeHierarchy buildHierarchy(Context context) {
        C3628a m31421a = C3628a.m31421a(0.0f);
        m31421a.m31403s(true);
        return new GenericDraweeHierarchyBuilder(context.getResources()).m31449K(m31421a).m31447a();
    }

    private void getCornerRadii(float[] fArr) {
        float f;
        float f2;
        float f3;
        float f4;
        if (!C4340d.m29971a(this.mBorderRadius)) {
            f = this.mBorderRadius;
        } else {
            f = 0.0f;
        }
        float[] fArr2 = this.mBorderCornerRadii;
        if (fArr2 != null && !C4340d.m29971a(fArr2[0])) {
            f2 = this.mBorderCornerRadii[0];
        } else {
            f2 = f;
        }
        fArr[0] = f2;
        float[] fArr3 = this.mBorderCornerRadii;
        if (fArr3 != null && !C4340d.m29971a(fArr3[1])) {
            f3 = this.mBorderCornerRadii[1];
        } else {
            f3 = f;
        }
        fArr[1] = f3;
        float[] fArr4 = this.mBorderCornerRadii;
        if (fArr4 != null && !C4340d.m29971a(fArr4[2])) {
            f4 = this.mBorderCornerRadii[2];
        } else {
            f4 = f;
        }
        fArr[2] = f4;
        float[] fArr5 = this.mBorderCornerRadii;
        if (fArr5 != null && !C4340d.m29971a(fArr5[3])) {
            f = this.mBorderCornerRadii[3];
        }
        fArr[3] = f;
    }

    private boolean hasMultipleSources() {
        return this.mSources.size() > 1;
    }

    private boolean isTiled() {
        return this.mTileMode != Shader.TileMode.CLAMP;
    }

    private void setSourceImage() {
        this.mImageSource = null;
        if (this.mSources.isEmpty()) {
            this.mSources.add(ImageSource.getTransparentBitmapImageSource(getContext()));
        } else if (hasMultipleSources()) {
            MultiSourceHelper.MultiSourceResult bestSourceForSize = MultiSourceHelper.getBestSourceForSize(getWidth(), getHeight(), this.mSources);
            this.mImageSource = bestSourceForSize.getBestResult();
            this.mCachedImageSource = bestSourceForSize.getBestResultInCache();
            return;
        }
        this.mImageSource = this.mSources.get(0);
    }

    private boolean shouldResize(ImageSource imageSource) {
        ImageResizeMethod imageResizeMethod = this.mResizeMethod;
        if (imageResizeMethod == ImageResizeMethod.AUTO) {
            if (C6104f.m23563j(imageSource.getUri()) || C6104f.m23562k(imageSource.getUri())) {
                return true;
            }
            return false;
        } else if (imageResizeMethod == ImageResizeMethod.RESIZE) {
            return true;
        } else {
            return false;
        }
    }

    private void warnImageSource(String str) {
    }

    public ImageSource getImageSource() {
        return this.mImageSource;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void maybeUpdateView() {
        if (!this.mIsDirty) {
            return;
        }
        if (hasMultipleSources() && (getWidth() <= 0 || getHeight() <= 0)) {
            return;
        }
        setSourceImage();
        ImageSource imageSource = this.mImageSource;
        if (imageSource == null) {
            return;
        }
        boolean shouldResize = shouldResize(imageSource);
        if (shouldResize && (getWidth() <= 0 || getHeight() <= 0)) {
            return;
        }
        if (isTiled() && (getWidth() <= 0 || getHeight() <= 0)) {
            return;
        }
        GenericDraweeHierarchy hierarchy = getHierarchy();
        hierarchy.m31466t(this.mScaleType);
        Drawable drawable = this.mDefaultImageDrawable;
        if (drawable != null) {
            hierarchy.m31483A(drawable, this.mScaleType);
        }
        Drawable drawable2 = this.mLoadingImageDrawable;
        if (drawable2 != null) {
            hierarchy.m31483A(drawable2, ScalingUtils.ScaleType.f9842g);
        }
        getCornerRadii(sComputedCornerRadii);
        C3628a m31471o = hierarchy.m31471o();
        float[] fArr = sComputedCornerRadii;
        float f = fArr[0];
        float f2 = fArr[1];
        ResizeOptions resizeOptions = null;
        if (f == f2 && f == fArr[2] && f == fArr[3] && f > 0.0f) {
            if (this.viewOutlineProvider == null) {
                this.viewOutlineProvider = new RoundingOutlineProvider();
            }
            this.viewOutlineProvider.radius = Float.valueOf(sComputedCornerRadii[0]);
            setClipToOutline(true);
            setOutlineProvider(this.viewOutlineProvider);
        } else {
            m31471o.m31407o(f, f2, fArr[2], fArr[3]);
        }
        RoundedColorDrawable roundedColorDrawable = this.mBackgroundImageDrawable;
        if (roundedColorDrawable != null) {
            roundedColorDrawable.setBorder(this.mBorderColor, this.mBorderWidth);
            this.mBackgroundImageDrawable.mo31493g(m31471o.m31418d());
            hierarchy.m31465u(this.mBackgroundImageDrawable);
        }
        m31471o.m31410l(this.mBorderColor, this.mBorderWidth);
        int i = this.mOverlayColor;
        if (i != 0) {
            m31471o.m31405q(i);
        } else {
            m31471o.m31401u(C3628a.EnumC3629a.BITMAP_ONLY);
        }
        hierarchy.m31480D(m31471o);
        int i2 = this.mFadeDurationMs;
        if (i2 < 0) {
            if (this.mImageSource.isResource()) {
                i2 = 0;
            } else {
                i2 = REMOTE_IMAGE_FADE_DURATION_MS;
            }
        }
        hierarchy.m31463w(i2);
        LinkedList linkedList = new LinkedList();
        IterativeBoxBlurPostProcessor iterativeBoxBlurPostProcessor = this.mIterativeBoxBlurPostProcessor;
        if (iterativeBoxBlurPostProcessor != null) {
            linkedList.add(iterativeBoxBlurPostProcessor);
        }
        TilePostprocessor tilePostprocessor = this.mTilePostprocessor;
        if (tilePostprocessor != null) {
            linkedList.add(tilePostprocessor);
        }
        Postprocessor from = MultiPostprocessor.from(linkedList);
        if (shouldResize) {
            resizeOptions = new ResizeOptions(getWidth(), getHeight());
        }
        ImageRequestBuilder m30594B = ImageRequestBuilder.m30567s(this.mImageSource.getUri()).m30595A(from).m30591E(resizeOptions).m30566t(true).m30594B(this.mProgressiveRenderingEnabled);
        if (this.mUseSmallCache) {
            m30594B.m30564v(ImageRequest.CacheChoice.SMALL);
        } else {
            m30594B.m30564v(ImageRequest.CacheChoice.DEFAULT);
        }
        ReactNetworkImageRequest fromBuilderWithHeaders = ReactNetworkImageRequest.fromBuilderWithHeaders(m30594B, this.mHeaders);
        GlobalImageLoadListener globalImageLoadListener = this.mGlobalImageLoadListener;
        if (globalImageLoadListener != null) {
            globalImageLoadListener.onLoadAttempt(this.mImageSource.getUri());
        }
        this.mDraweeControllerBuilder.m31599y();
        this.mDraweeControllerBuilder.m31598z(true).m31628A(this.mCallerContext).mo3373b(getController()).m31625D(fromBuilderWithHeaders);
        ImageSource imageSource2 = this.mCachedImageSource;
        if (imageSource2 != null) {
            ImageRequestBuilder m30594B2 = ImageRequestBuilder.m30567s(imageSource2.getUri()).m30595A(from).m30591E(resizeOptions).m30566t(true).m30594B(this.mProgressiveRenderingEnabled);
            if (this.mUseSmallCache) {
                m30594B2.m30564v(ImageRequest.CacheChoice.SMALL);
            } else {
                m30594B2.m30564v(ImageRequest.CacheChoice.DEFAULT);
            }
            this.mDraweeControllerBuilder.m31624E(m30594B2.m30585a());
        }
        ReactImageDownloadListener reactImageDownloadListener = this.mDownloadListener;
        if (reactImageDownloadListener != null && this.mControllerForTesting != null) {
            C11698c c11698c = new C11698c();
            c11698c.m7157a(this.mDownloadListener);
            c11698c.m7157a(this.mControllerForTesting);
            this.mDraweeControllerBuilder.m31626C(c11698c);
        } else {
            ControllerListener controllerListener = this.mControllerForTesting;
            if (controllerListener != null) {
                this.mDraweeControllerBuilder.m31626C(controllerListener);
            } else if (reactImageDownloadListener != null) {
                this.mDraweeControllerBuilder.m31626C(reactImageDownloadListener);
            }
        }
        ReactImageDownloadListener reactImageDownloadListener2 = this.mDownloadListener;
        if (reactImageDownloadListener2 != null) {
            hierarchy.m31481C(reactImageDownloadListener2);
        }
        setController(this.mDraweeControllerBuilder.build());
        this.mIsDirty = false;
        this.mDraweeControllerBuilder.m31599y();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            if (!this.mIsDirty && !hasMultipleSources() && !isTiled()) {
                z = false;
            } else {
                z = true;
            }
            this.mIsDirty = z;
            maybeUpdateView();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (this.mBackgroundColor != i) {
            this.mBackgroundColor = i;
            this.mBackgroundImageDrawable = new RoundedColorDrawable(i);
            this.mIsDirty = true;
        }
    }

    public void setBlurRadius(float f) {
        int pixelFromDIP = ((int) PixelUtil.toPixelFromDIP(f)) / 2;
        if (pixelFromDIP == 0) {
            this.mIterativeBoxBlurPostProcessor = null;
        } else {
            this.mIterativeBoxBlurPostProcessor = new IterativeBoxBlurPostProcessor(2, pixelFromDIP);
        }
        this.mIsDirty = true;
    }

    public void setBorderColor(int i) {
        if (this.mBorderColor != i) {
            this.mBorderColor = i;
            this.mIsDirty = true;
        }
    }

    public void setBorderRadius(float f) {
        if (FloatUtil.floatsEqual(this.mBorderRadius, f)) {
            return;
        }
        this.mBorderRadius = f;
        this.mIsDirty = true;
    }

    public void setBorderWidth(float f) {
        float pixelFromDIP = PixelUtil.toPixelFromDIP(f);
        if (!FloatUtil.floatsEqual(this.mBorderWidth, pixelFromDIP)) {
            this.mBorderWidth = pixelFromDIP;
            this.mIsDirty = true;
        }
    }

    public void setControllerListener(ControllerListener controllerListener) {
        this.mControllerForTesting = controllerListener;
        this.mIsDirty = true;
        maybeUpdateView();
    }

    public void setDefaultSource(String str) {
        Drawable resourceDrawable = ResourceDrawableIdHelper.getInstance().getResourceDrawable(getContext(), str);
        if (!C13375i.m2691a(this.mDefaultImageDrawable, resourceDrawable)) {
            this.mDefaultImageDrawable = resourceDrawable;
            this.mIsDirty = true;
        }
    }

    public void setFadeDuration(int i) {
        this.mFadeDurationMs = i;
    }

    public void setHeaders(ReadableMap readableMap) {
        this.mHeaders = readableMap;
    }

    public void setLoadingIndicatorSource(String str) {
        RunnableC3609b runnableC3609b;
        Drawable resourceDrawable = ResourceDrawableIdHelper.getInstance().getResourceDrawable(getContext(), str);
        if (resourceDrawable != null) {
            runnableC3609b = new RunnableC3609b(resourceDrawable, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
        } else {
            runnableC3609b = null;
        }
        if (!C13375i.m2691a(this.mLoadingImageDrawable, runnableC3609b)) {
            this.mLoadingImageDrawable = runnableC3609b;
            this.mIsDirty = true;
        }
    }

    public void setOverlayColor(int i) {
        if (this.mOverlayColor != i) {
            this.mOverlayColor = i;
            this.mIsDirty = true;
        }
    }

    public void setProgressiveRenderingEnabled(boolean z) {
        this.mProgressiveRenderingEnabled = z;
    }

    public void setResizeMethod(ImageResizeMethod imageResizeMethod) {
        if (this.mResizeMethod != imageResizeMethod) {
            this.mResizeMethod = imageResizeMethod;
            this.mIsDirty = true;
        }
    }

    public void setScaleType(ScalingUtils.ScaleType scaleType) {
        if (this.mScaleType != scaleType) {
            this.mScaleType = scaleType;
            this.mIsDirty = true;
        }
    }

    public void setShouldNotifyLoadEvents(boolean z) {
        boolean z2;
        if (this.mDownloadListener != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            return;
        }
        if (!z) {
            this.mDownloadListener = null;
        } else {
            final EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) getContext(), getId());
            this.mDownloadListener = new ReactImageDownloadListener<ImageInfo>() { // from class: com.facebook.react.views.image.ReactImageView.1
                @Override // com.facebook.react.views.image.ReactImageDownloadListener, com.facebook.drawee.controller.ControllerListener
                public void onFailure(String str, Throwable th2) {
                    eventDispatcherForReactTag.dispatchEvent(ImageLoadEvent.createErrorEvent(UIManagerHelper.getSurfaceId(ReactImageView.this), ReactImageView.this.getId(), th2));
                }

                @Override // com.facebook.react.views.image.ReactImageDownloadListener
                public void onProgressChange(int i, int i2) {
                    eventDispatcherForReactTag.dispatchEvent(ImageLoadEvent.createProgressEvent(UIManagerHelper.getSurfaceId(ReactImageView.this), ReactImageView.this.getId(), ReactImageView.this.mImageSource.getSource(), i, i2));
                }

                @Override // com.facebook.react.views.image.ReactImageDownloadListener, com.facebook.drawee.controller.ControllerListener
                public void onSubmit(String str, Object obj) {
                    eventDispatcherForReactTag.dispatchEvent(ImageLoadEvent.createLoadStartEvent(UIManagerHelper.getSurfaceId(ReactImageView.this), ReactImageView.this.getId()));
                }

                @Override // com.facebook.react.views.image.ReactImageDownloadListener, com.facebook.drawee.controller.ControllerListener
                public void onFinalImageSet(String str, ImageInfo imageInfo, Animatable animatable) {
                    if (imageInfo != null) {
                        eventDispatcherForReactTag.dispatchEvent(ImageLoadEvent.createLoadEvent(UIManagerHelper.getSurfaceId(ReactImageView.this), ReactImageView.this.getId(), ReactImageView.this.mImageSource.getSource(), imageInfo.getWidth(), imageInfo.getHeight()));
                        eventDispatcherForReactTag.dispatchEvent(ImageLoadEvent.createLoadEndEvent(UIManagerHelper.getSurfaceId(ReactImageView.this), ReactImageView.this.getId()));
                    }
                }
            };
        }
        this.mIsDirty = true;
    }

    public void setSource(ReadableArray readableArray) {
        boolean z;
        double d;
        double d2;
        LinkedList<ImageSource> linkedList = new LinkedList();
        if (readableArray != null && readableArray.size() != 0) {
            boolean z2 = false;
            if (readableArray.size() == 1) {
                ReadableMap map = readableArray.getMap(0);
                ImageSource imageSource = new ImageSource(getContext(), map.getString("uri"));
                if (Uri.EMPTY.equals(imageSource.getUri())) {
                    warnImageSource(map.getString("uri"));
                    imageSource = ImageSource.getTransparentBitmapImageSource(getContext());
                }
                linkedList.add(imageSource);
            } else {
                int i = 0;
                while (i < readableArray.size()) {
                    ReadableMap map2 = readableArray.getMap(i);
                    String string = map2.getString("uri");
                    if (map2.hasKey("isForceCached")) {
                        z = map2.getBoolean("isForceCached");
                    } else {
                        z = z2;
                    }
                    if (map2.hasKey("width")) {
                        d = map2.getDouble("width");
                    } else {
                        d = 0.0d;
                    }
                    if (map2.hasKey("height")) {
                        d2 = map2.getDouble("height");
                    } else {
                        d2 = 0.0d;
                    }
                    ImageSource imageSource2 = new ImageSource(getContext(), string, d, d2, z);
                    if (Uri.EMPTY.equals(imageSource2.getUri())) {
                        warnImageSource(string);
                        imageSource2 = ImageSource.getTransparentBitmapImageSource(getContext());
                    }
                    linkedList.add(imageSource2);
                    i++;
                    z2 = false;
                }
            }
        } else {
            linkedList.add(ImageSource.getTransparentBitmapImageSource(getContext()));
        }
        if (this.mSources.equals(linkedList)) {
            return;
        }
        this.mSources.clear();
        for (ImageSource imageSource3 : linkedList) {
            this.mSources.add(imageSource3);
        }
        this.mIsDirty = true;
    }

    public void setTileMode(Shader.TileMode tileMode) {
        if (this.mTileMode != tileMode) {
            this.mTileMode = tileMode;
            if (isTiled()) {
                this.mTilePostprocessor = new TilePostprocessor();
            } else {
                this.mTilePostprocessor = null;
            }
            this.mIsDirty = true;
        }
    }

    public void setUseSmallCache(boolean z) {
        if (this.mUseSmallCache != z) {
            this.mUseSmallCache = z;
            this.mIsDirty = true;
        }
    }

    public void updateCallerContext(Object obj) {
        if (!C13375i.m2691a(this.mCallerContext, obj)) {
            this.mCallerContext = obj;
            this.mIsDirty = true;
        }
    }

    public void setBorderRadius(float f, int i) {
        if (this.mBorderCornerRadii == null) {
            float[] fArr = new float[4];
            this.mBorderCornerRadii = fArr;
            Arrays.fill(fArr, Float.NaN);
        }
        if (FloatUtil.floatsEqual(this.mBorderCornerRadii[i], f)) {
            return;
        }
        this.mBorderCornerRadii[i] = f;
        this.mIsDirty = true;
    }
}