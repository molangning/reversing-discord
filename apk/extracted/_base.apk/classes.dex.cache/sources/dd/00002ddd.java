package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import com.horcrux.svg.C5201a;
import p414x2.C13677a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5234o extends C5209d {

    /* renamed from: q */
    private static final float[] f14787q = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: j */
    private SVGLength f14788j;

    /* renamed from: k */
    private SVGLength f14789k;

    /* renamed from: l */
    private SVGLength f14790l;

    /* renamed from: m */
    private SVGLength f14791m;

    /* renamed from: n */
    private ReadableArray f14792n;

    /* renamed from: o */
    private C5201a.EnumC5203b f14793o;

    /* renamed from: p */
    private Matrix f14794p;

    public C5234o(ReactContext reactContext) {
        super(reactContext);
        this.f14794p = null;
    }

    /* renamed from: b */
    public void m25796b(ReadableArray readableArray) {
        this.f14792n = readableArray;
        invalidate();
    }

    /* renamed from: c */
    public void m25795c(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f14787q;
            int m25661c = C5250x.m25661c(readableArray, fArr, this.mScale);
            if (m25661c == 6) {
                if (this.f14794p == null) {
                    this.f14794p = new Matrix();
                }
                this.f14794p.setValues(fArr);
            } else if (m25661c != -1) {
                C13677a.m1870H(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f14794p = null;
        }
        invalidate();
    }

    /* renamed from: d */
    public void m25794d(int i) {
        if (i != 0) {
            if (i == 1) {
                this.f14793o = C5201a.EnumC5203b.USER_SPACE_ON_USE;
            }
        } else {
            this.f14793o = C5201a.EnumC5203b.OBJECT_BOUNDING_BOX;
        }
        invalidate();
    }

    /* renamed from: e */
    public void m25793e(Dynamic dynamic) {
        this.f14788j = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: f */
    public void m25792f(Double d) {
        this.f14788j = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: g */
    public void m25791g(String str) {
        this.f14788j = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: h */
    public void m25790h(Dynamic dynamic) {
        this.f14790l = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: i */
    public void m25789i(Double d) {
        this.f14790l = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: j */
    public void m25788j(String str) {
        this.f14790l = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: k */
    public void m25787k(Dynamic dynamic) {
        this.f14789k = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: l */
    public void m25786l(Double d) {
        this.f14789k = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: m */
    public void m25785m(String str) {
        this.f14789k = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: n */
    public void m25784n(Dynamic dynamic) {
        this.f14791m = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: o */
    public void m25783o(Double d) {
        this.f14791m = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: p */
    public void m25782p(String str) {
        this.f14791m = SVGLength.m25996e(str);
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            C5201a c5201a = new C5201a(C5201a.EnumC5202a.LINEAR_GRADIENT, new SVGLength[]{this.f14788j, this.f14789k, this.f14790l, this.f14791m}, this.f14793o);
            c5201a.m25967e(this.f14792n);
            Matrix matrix = this.f14794p;
            if (matrix != null) {
                c5201a.m25966f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f14793o == C5201a.EnumC5203b.USER_SPACE_ON_USE) {
                c5201a.m25964h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(c5201a, this.mName);
        }
    }
}