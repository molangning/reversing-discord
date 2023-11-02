package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import p414x2.C13677a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.u0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5246u0 extends RenderableView {

    /* renamed from: j */
    private String f14856j;

    /* renamed from: k */
    private SVGLength f14857k;

    /* renamed from: l */
    private SVGLength f14858l;

    /* renamed from: m */
    private SVGLength f14859m;

    /* renamed from: n */
    private SVGLength f14860n;

    public C5246u0(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: b */
    public void m25692b(Dynamic dynamic) {
        this.f14860n = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: c */
    public void m25691c(Double d) {
        this.f14860n = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: d */
    public void m25690d(String str) {
        this.f14860n = SVGLength.m25996e(str);
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f14856j);
        if (definedTemplate == null) {
            C13677a.m1870H(ReactConstants.TAG, "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f14856j + " is not defined.");
            return;
        }
        definedTemplate.clearCache();
        canvas.translate((float) relativeOnWidth(this.f14857k), (float) relativeOnHeight(this.f14858l));
        boolean z = definedTemplate instanceof RenderableView;
        if (z) {
            ((RenderableView) definedTemplate).mergeProperties(this);
        }
        int saveAndSetupCanvas = definedTemplate.saveAndSetupCanvas(canvas, this.mCTM);
        clip(canvas, paint);
        if (definedTemplate instanceof C5210d0) {
            ((C5210d0) definedTemplate).m25914l(canvas, paint, f, (float) relativeOnWidth(this.f14859m), (float) relativeOnHeight(this.f14860n));
        } else {
            definedTemplate.draw(canvas, paint, f * this.mOpacity);
        }
        setClientRect(definedTemplate.getClientRect());
        definedTemplate.restoreCanvas(canvas, saveAndSetupCanvas);
        if (z) {
            ((RenderableView) definedTemplate).resetProperties();
        }
    }

    /* renamed from: e */
    public void m25689e(String str) {
        this.f14856j = str;
        invalidate();
    }

    /* renamed from: f */
    public void m25688f(Dynamic dynamic) {
        this.f14859m = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: g */
    public void m25687g(Double d) {
        this.f14859m = SVGLength.m25997d(d);
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f14856j);
        if (definedTemplate == null) {
            C13677a.m1870H(ReactConstants.TAG, "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f14856j + " is not defined.");
            return null;
        }
        Path path = definedTemplate.getPath(canvas, paint);
        Path path2 = new Path();
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) relativeOnWidth(this.f14857k), (float) relativeOnHeight(this.f14858l));
        path.transform(matrix, path2);
        return path2;
    }

    /* renamed from: h */
    public void m25686h(String str) {
        this.f14859m = SVGLength.m25996e(str);
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        if (this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f14856j);
            if (definedTemplate == null) {
                C13677a.m1870H(ReactConstants.TAG, "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f14856j + " is not defined.");
                return -1;
            }
            int hitTest = definedTemplate.hitTest(fArr2);
            if (hitTest != -1) {
                if (!definedTemplate.isResponsible() && hitTest == definedTemplate.getId()) {
                    return getId();
                }
                return hitTest;
            }
        }
        return -1;
    }

    /* renamed from: i */
    public void m25685i(Dynamic dynamic) {
        this.f14857k = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: j */
    public void m25684j(Double d) {
        this.f14857k = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: k */
    public void m25683k(String str) {
        this.f14857k = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: l */
    public void m25682l(Dynamic dynamic) {
        this.f14858l = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: m */
    public void m25681m(Double d) {
        this.f14858l = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: n */
    public void m25680n(String str) {
        this.f14858l = SVGLength.m25996e(str);
        invalidate();
    }
}