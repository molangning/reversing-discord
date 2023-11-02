package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import com.horcrux.svg.C5201a;
import p414x2.C13677a;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5204a0 extends C5209d {

    /* renamed from: s */
    private static final float[] f14595s = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: j */
    private SVGLength f14596j;

    /* renamed from: k */
    private SVGLength f14597k;

    /* renamed from: l */
    private SVGLength f14598l;

    /* renamed from: m */
    private SVGLength f14599m;

    /* renamed from: n */
    private SVGLength f14600n;

    /* renamed from: o */
    private SVGLength f14601o;

    /* renamed from: p */
    private ReadableArray f14602p;

    /* renamed from: q */
    private C5201a.EnumC5203b f14603q;

    /* renamed from: r */
    private Matrix f14604r;

    public C5204a0(ReactContext reactContext) {
        super(reactContext);
        this.f14604r = null;
    }

    /* renamed from: b */
    public void m25962b(Dynamic dynamic) {
        this.f14600n = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: c */
    public void m25961c(Double d) {
        this.f14600n = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: d */
    public void m25960d(String str) {
        this.f14600n = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: e */
    public void m25959e(Dynamic dynamic) {
        this.f14601o = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: f */
    public void m25958f(Double d) {
        this.f14601o = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: g */
    public void m25957g(String str) {
        this.f14601o = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: h */
    public void m25956h(Dynamic dynamic) {
        this.f14596j = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: i */
    public void m25955i(Double d) {
        this.f14596j = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: j */
    public void m25954j(String str) {
        this.f14596j = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: k */
    public void m25953k(Dynamic dynamic) {
        this.f14597k = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: l */
    public void m25952l(Double d) {
        this.f14597k = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: m */
    public void m25951m(String str) {
        this.f14597k = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: n */
    public void m25950n(ReadableArray readableArray) {
        this.f14602p = readableArray;
        invalidate();
    }

    /* renamed from: o */
    public void m25949o(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f14595s;
            int m25661c = C5250x.m25661c(readableArray, fArr, this.mScale);
            if (m25661c == 6) {
                if (this.f14604r == null) {
                    this.f14604r = new Matrix();
                }
                this.f14604r.setValues(fArr);
            } else if (m25661c != -1) {
                C13677a.m1870H(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f14604r = null;
        }
        invalidate();
    }

    /* renamed from: p */
    public void m25948p(int i) {
        if (i != 0) {
            if (i == 1) {
                this.f14603q = C5201a.EnumC5203b.USER_SPACE_ON_USE;
            }
        } else {
            this.f14603q = C5201a.EnumC5203b.OBJECT_BOUNDING_BOX;
        }
        invalidate();
    }

    /* renamed from: q */
    public void m25947q(Dynamic dynamic) {
        this.f14598l = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: r */
    public void m25946r(Double d) {
        this.f14598l = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: s */
    public void m25945s(String str) {
        this.f14598l = SVGLength.m25996e(str);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            C5201a c5201a = new C5201a(C5201a.EnumC5202a.RADIAL_GRADIENT, new SVGLength[]{this.f14596j, this.f14597k, this.f14598l, this.f14599m, this.f14600n, this.f14601o}, this.f14603q);
            c5201a.m25967e(this.f14602p);
            Matrix matrix = this.f14604r;
            if (matrix != null) {
                c5201a.m25966f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f14603q == C5201a.EnumC5203b.USER_SPACE_ON_USE) {
                c5201a.m25964h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(c5201a, this.mName);
        }
    }

    /* renamed from: t */
    public void m25944t(Dynamic dynamic) {
        this.f14599m = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: u */
    public void m25943u(Double d) {
        this.f14599m = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: v */
    public void m25942v(String str) {
        this.f14599m = SVGLength.m25996e(str);
        invalidate();
    }
}
