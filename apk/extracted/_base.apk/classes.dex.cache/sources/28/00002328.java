package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import p075e3.C6104f;
import p394w2.C13379j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ImageRequestBuilder {

    /* renamed from: n */
    private RequestListener f10890n;

    /* renamed from: q */
    private int f10893q;

    /* renamed from: a */
    private Uri f10877a = null;

    /* renamed from: b */
    private ImageRequest.RequestLevel f10878b = ImageRequest.RequestLevel.FULL_FETCH;

    /* renamed from: c */
    private ResizeOptions f10879c = null;

    /* renamed from: d */
    private RotationOptions f10880d = null;

    /* renamed from: e */
    private ImageDecodeOptions f10881e = ImageDecodeOptions.m31194a();

    /* renamed from: f */
    private ImageRequest.CacheChoice f10882f = ImageRequest.CacheChoice.DEFAULT;

    /* renamed from: g */
    private boolean f10883g = ImagePipelineConfig.m31157F().m31105a();

    /* renamed from: h */
    private boolean f10884h = false;

    /* renamed from: i */
    private Priority f10885i = Priority.HIGH;

    /* renamed from: j */
    private Postprocessor f10886j = null;

    /* renamed from: k */
    private boolean f10887k = true;

    /* renamed from: l */
    private boolean f10888l = true;

    /* renamed from: m */
    private Boolean f10889m = null;

    /* renamed from: o */
    private BytesRange f10891o = null;

    /* renamed from: p */
    private Boolean f10892p = null;

    /* renamed from: com.facebook.imagepipeline.request.ImageRequestBuilder$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C3871a extends RuntimeException {
        public C3871a(String str) {
            super("Invalid request builder: " + str);
        }
    }

    private ImageRequestBuilder() {
    }

    /* renamed from: b */
    public static ImageRequestBuilder m30584b(ImageRequest imageRequest) {
        return m30567s(imageRequest.getSourceUri()).m30562x(imageRequest.getImageDecodeOptions()).m30565u(imageRequest.getBytesRange()).m30564v(imageRequest.getCacheChoice()).m30561y(imageRequest.getLocalThumbnailPreviewsEnabled()).m30560z(imageRequest.getLowestPermittedRequestLevel()).m30595A(imageRequest.getPostprocessor()).m30594B(imageRequest.getProgressiveRenderingEnabled()).m30592D(imageRequest.getPriority()).m30591E(imageRequest.getResizeOptions()).m30593C(imageRequest.getRequestListener()).m30590F(imageRequest.getRotationOptions()).m30589G(imageRequest.shouldDecodePrefetches()).m30563w(imageRequest.getDelayMs());
    }

    /* renamed from: s */
    public static ImageRequestBuilder m30567s(Uri uri) {
        return new ImageRequestBuilder().m30588H(uri);
    }

    /* renamed from: A */
    public ImageRequestBuilder m30595A(Postprocessor postprocessor) {
        this.f10886j = postprocessor;
        return this;
    }

    /* renamed from: B */
    public ImageRequestBuilder m30594B(boolean z) {
        this.f10883g = z;
        return this;
    }

    /* renamed from: C */
    public ImageRequestBuilder m30593C(RequestListener requestListener) {
        this.f10890n = requestListener;
        return this;
    }

    /* renamed from: D */
    public ImageRequestBuilder m30592D(Priority priority) {
        this.f10885i = priority;
        return this;
    }

    /* renamed from: E */
    public ImageRequestBuilder m30591E(ResizeOptions resizeOptions) {
        this.f10879c = resizeOptions;
        return this;
    }

    /* renamed from: F */
    public ImageRequestBuilder m30590F(RotationOptions rotationOptions) {
        this.f10880d = rotationOptions;
        return this;
    }

    /* renamed from: G */
    public ImageRequestBuilder m30589G(Boolean bool) {
        this.f10889m = bool;
        return this;
    }

    /* renamed from: H */
    public ImageRequestBuilder m30588H(Uri uri) {
        C13379j.m2677g(uri);
        this.f10877a = uri;
        return this;
    }

    /* renamed from: I */
    public Boolean m30587I() {
        return this.f10889m;
    }

    /* renamed from: J */
    protected void m30586J() {
        Uri uri = this.f10877a;
        if (uri != null) {
            if (C6104f.m23561l(uri)) {
                if (this.f10877a.isAbsolute()) {
                    if (!this.f10877a.getPath().isEmpty()) {
                        try {
                            Integer.parseInt(this.f10877a.getPath().substring(1));
                        } catch (NumberFormatException unused) {
                            throw new C3871a("Resource URI path must be a resource id.");
                        }
                    } else {
                        throw new C3871a("Resource URI must not be empty");
                    }
                } else {
                    throw new C3871a("Resource URI path must be absolute.");
                }
            }
            if (C6104f.m23566g(this.f10877a) && !this.f10877a.isAbsolute()) {
                throw new C3871a("Asset URI path must be absolute.");
            }
            return;
        }
        throw new C3871a("Source must be set!");
    }

    /* renamed from: a */
    public ImageRequest m30585a() {
        m30586J();
        return new ImageRequest(this);
    }

    /* renamed from: c */
    public BytesRange m30583c() {
        return this.f10891o;
    }

    /* renamed from: d */
    public ImageRequest.CacheChoice m30582d() {
        return this.f10882f;
    }

    /* renamed from: e */
    public int m30581e() {
        return this.f10893q;
    }

    /* renamed from: f */
    public ImageDecodeOptions m30580f() {
        return this.f10881e;
    }

    /* renamed from: g */
    public ImageRequest.RequestLevel m30579g() {
        return this.f10878b;
    }

    /* renamed from: h */
    public Postprocessor m30578h() {
        return this.f10886j;
    }

    /* renamed from: i */
    public RequestListener m30577i() {
        return this.f10890n;
    }

    /* renamed from: j */
    public Priority m30576j() {
        return this.f10885i;
    }

    /* renamed from: k */
    public ResizeOptions m30575k() {
        return this.f10879c;
    }

    /* renamed from: l */
    public Boolean m30574l() {
        return this.f10892p;
    }

    /* renamed from: m */
    public RotationOptions m30573m() {
        return this.f10880d;
    }

    /* renamed from: n */
    public Uri m30572n() {
        return this.f10877a;
    }

    /* renamed from: o */
    public boolean m30571o() {
        return this.f10887k && C6104f.m23560m(this.f10877a);
    }

    /* renamed from: p */
    public boolean m30570p() {
        return this.f10884h;
    }

    /* renamed from: q */
    public boolean m30569q() {
        return this.f10888l;
    }

    /* renamed from: r */
    public boolean m30568r() {
        return this.f10883g;
    }

    @Deprecated
    /* renamed from: t */
    public ImageRequestBuilder m30566t(boolean z) {
        if (z) {
            return m30590F(RotationOptions.m31189a());
        }
        return m30590F(RotationOptions.m31186d());
    }

    /* renamed from: u */
    public ImageRequestBuilder m30565u(BytesRange bytesRange) {
        this.f10891o = bytesRange;
        return this;
    }

    /* renamed from: v */
    public ImageRequestBuilder m30564v(ImageRequest.CacheChoice cacheChoice) {
        this.f10882f = cacheChoice;
        return this;
    }

    /* renamed from: w */
    public ImageRequestBuilder m30563w(int i) {
        this.f10893q = i;
        return this;
    }

    /* renamed from: x */
    public ImageRequestBuilder m30562x(ImageDecodeOptions imageDecodeOptions) {
        this.f10881e = imageDecodeOptions;
        return this;
    }

    /* renamed from: y */
    public ImageRequestBuilder m30561y(boolean z) {
        this.f10884h = z;
        return this;
    }

    /* renamed from: z */
    public ImageRequestBuilder m30560z(ImageRequest.RequestLevel requestLevel) {
        this.f10878b = requestLevel;
        return this;
    }
}