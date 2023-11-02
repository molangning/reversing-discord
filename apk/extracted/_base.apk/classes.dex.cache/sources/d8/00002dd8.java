package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.datasource.AbstractC3715b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import p208l3.C10035c;
import p359u2.C12827h;
import p380v4.AbstractC13062b;
import p380v4.AbstractC13063c;
import p414x2.C13677a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5229m extends RenderableView {

    /* renamed from: j */
    private SVGLength f14760j;

    /* renamed from: k */
    private SVGLength f14761k;

    /* renamed from: l */
    private SVGLength f14762l;

    /* renamed from: m */
    private SVGLength f14763m;

    /* renamed from: n */
    private String f14764n;

    /* renamed from: o */
    private int f14765o;

    /* renamed from: p */
    private int f14766p;

    /* renamed from: q */
    private String f14767q;

    /* renamed from: r */
    private int f14768r;

    /* renamed from: s */
    private final AtomicBoolean f14769s;

    /* renamed from: com.horcrux.svg.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5230a extends AbstractC3715b {
        C5230a() {
            C5229m.this = r1;
        }

        @Override // com.facebook.datasource.AbstractC3574b
        public void onFailureImpl(DataSource<CloseableReference<AbstractC13063c>> dataSource) {
            C5229m.this.f14769s.set(false);
            C13677a.m1867K(ReactConstants.TAG, dataSource.mo31711c(), "RNSVG: fetchDecodedImage failed!", new Object[0]);
        }

        @Override // com.facebook.imagepipeline.datasource.AbstractC3715b
        public void onNewResultImpl(Bitmap bitmap) {
            C5229m.this.f14769s.set(false);
            SvgView svgView = C5229m.this.getSvgView();
            if (svgView != null) {
                svgView.invalidate();
            }
        }
    }

    public C5229m(ReactContext reactContext) {
        super(reactContext);
        this.f14769s = new AtomicBoolean(false);
    }

    /* renamed from: c */
    private void m25826c(Canvas canvas, Paint paint, Bitmap bitmap, float f) {
        if (this.f14765o == 0 || this.f14766p == 0) {
            this.f14765o = bitmap.getWidth();
            this.f14766p = bitmap.getHeight();
        }
        RectF m25825d = m25825d();
        RectF rectF = new RectF(0.0f, 0.0f, this.f14765o, this.f14766p);
        C5248v0.m25664a(rectF, m25825d, this.f14767q, this.f14768r).mapRect(rectF);
        canvas.clipPath(getPath(canvas, paint));
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        this.mCTM.mapRect(rectF);
        setClientRect(rectF);
    }

    /* renamed from: d */
    private RectF m25825d() {
        double relativeOnWidth = relativeOnWidth(this.f14760j);
        double relativeOnHeight = relativeOnHeight(this.f14761k);
        double relativeOnWidth2 = relativeOnWidth(this.f14762l);
        double relativeOnHeight2 = relativeOnHeight(this.f14763m);
        if (relativeOnWidth2 == 0.0d) {
            relativeOnWidth2 = this.f14765o * this.mScale;
        }
        if (relativeOnHeight2 == 0.0d) {
            relativeOnHeight2 = this.f14766p * this.mScale;
        }
        return new RectF((float) relativeOnWidth, (float) relativeOnHeight, (float) (relativeOnWidth + relativeOnWidth2), (float) (relativeOnHeight + relativeOnHeight2));
    }

    /* renamed from: e */
    private void m25824e(ImagePipeline imagePipeline, ImageRequest imageRequest) {
        this.f14769s.set(true);
        imagePipeline.m31179d(imageRequest, this.mContext).mo31710d(new C5230a(), C12827h.m3853g());
    }

    /* renamed from: s */
    private void m25810s(ImagePipeline imagePipeline, ImageRequest imageRequest, Canvas canvas, Paint paint, float f) {
        DataSource<CloseableReference<AbstractC13063c>> m31175h = imagePipeline.m31175h(imageRequest, this.mContext);
        try {
            try {
                CloseableReference<AbstractC13063c> mo31018g = m31175h.mo31018g();
                if (mo31018g == null) {
                    return;
                }
                try {
                    try {
                        AbstractC13063c m31730D = mo31018g.m31730D();
                        if (!(m31730D instanceof AbstractC13062b)) {
                            return;
                        }
                        Bitmap mo3363o = ((AbstractC13062b) m31730D).mo3363o();
                        if (mo3363o == null) {
                            return;
                        }
                        m25826c(canvas, paint, mo3363o, f);
                    } finally {
                        CloseableReference.m31715v(mo31018g);
                    }
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        } finally {
            m31175h.close();
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        if (!this.f14769s.get()) {
            ImagePipeline m12512a = C10035c.m12512a();
            ImageRequest fromUri = ImageRequest.fromUri(new ImageSource(this.mContext, this.f14764n).getUri());
            if (m12512a.m31169n(fromUri)) {
                m25810s(m12512a, fromUri, canvas, paint, f * this.mOpacity);
            } else {
                m25824e(m12512a, fromUri);
            }
        }
    }

    /* renamed from: f */
    public void m25823f(Dynamic dynamic) {
        this.f14763m = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: g */
    public void m25822g(Double d) {
        this.f14763m = SVGLength.m25997d(d);
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        ((VirtualView) this).mPath = path;
        path.addRect(m25825d(), Path.Direction.CW);
        return ((VirtualView) this).mPath;
    }

    /* renamed from: h */
    public void m25821h(String str) {
        this.f14763m = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: i */
    public void m25820i(ReadableMap readableMap) {
        if (readableMap != null) {
            String string = readableMap.getString("uri");
            this.f14764n = string;
            if (string != null && !string.isEmpty()) {
                if (readableMap.hasKey("width") && readableMap.hasKey("height")) {
                    this.f14765o = readableMap.getInt("width");
                    this.f14766p = readableMap.getInt("height");
                } else {
                    this.f14765o = 0;
                    this.f14766p = 0;
                }
                if (Uri.parse(this.f14764n).getScheme() == null) {
                    ResourceDrawableIdHelper.getInstance().getResourceDrawableUri(this.mContext, this.f14764n);
                }
            }
        }
    }

    /* renamed from: j */
    public void m25819j(Dynamic dynamic) {
        this.f14762l = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: k */
    public void m25818k(Double d) {
        this.f14762l = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: l */
    public void m25817l(String str) {
        this.f14762l = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: m */
    public void m25816m(Dynamic dynamic) {
        this.f14760j = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: n */
    public void m25815n(Double d) {
        this.f14760j = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: o */
    public void m25814o(String str) {
        this.f14760j = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: p */
    public void m25813p(Dynamic dynamic) {
        this.f14761k = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: q */
    public void m25812q(Double d) {
        this.f14761k = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: r */
    public void m25811r(String str) {
        this.f14761k = SVGLength.m25996e(str);
        invalidate();
    }

    public void setAlign(String str) {
        this.f14767q = str;
        invalidate();
    }

    public void setMeetOrSlice(int i) {
        this.f14768r = i;
        invalidate();
    }
}