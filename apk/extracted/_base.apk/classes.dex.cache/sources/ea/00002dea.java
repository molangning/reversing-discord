package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import com.horcrux.svg.C5201a;
import p414x2.C13677a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5247v extends C5227l {

    /* renamed from: y */
    private static final float[] f14861y = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: l */
    private SVGLength f14862l;

    /* renamed from: m */
    private SVGLength f14863m;

    /* renamed from: n */
    private SVGLength f14864n;

    /* renamed from: o */
    private SVGLength f14865o;

    /* renamed from: p */
    private C5201a.EnumC5203b f14866p;

    /* renamed from: q */
    private C5201a.EnumC5203b f14867q;

    /* renamed from: r */
    private float f14868r;

    /* renamed from: s */
    private float f14869s;

    /* renamed from: t */
    private float f14870t;

    /* renamed from: u */
    private float f14871u;

    /* renamed from: v */
    String f14872v;

    /* renamed from: w */
    int f14873w;

    /* renamed from: x */
    private Matrix f14874x;

    public C5247v(ReactContext reactContext) {
        super(reactContext);
        this.f14874x = null;
    }

    public RectF getViewBox() {
        float f = this.f14868r;
        float f2 = this.mScale;
        float f3 = this.f14869s;
        return new RectF(f * f2, f3 * f2, (f + this.f14870t) * f2, (f3 + this.f14871u) * f2);
    }

    /* renamed from: l */
    public void m25679l(Dynamic dynamic) {
        this.f14865o = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: m */
    public void m25678m(Double d) {
        this.f14865o = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: n */
    public void m25677n(String str) {
        this.f14865o = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: o */
    public void m25676o(int i) {
        if (i != 0) {
            if (i == 1) {
                this.f14867q = C5201a.EnumC5203b.USER_SPACE_ON_USE;
            }
        } else {
            this.f14867q = C5201a.EnumC5203b.OBJECT_BOUNDING_BOX;
        }
        invalidate();
    }

    /* renamed from: p */
    public void m25675p(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f14861y;
            int m25661c = C5250x.m25661c(readableArray, fArr, this.mScale);
            if (m25661c == 6) {
                if (this.f14874x == null) {
                    this.f14874x = new Matrix();
                }
                this.f14874x.setValues(fArr);
            } else if (m25661c != -1) {
                C13677a.m1870H(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f14874x = null;
        }
        invalidate();
    }

    /* renamed from: q */
    public void m25674q(int i) {
        if (i != 0) {
            if (i == 1) {
                this.f14866p = C5201a.EnumC5203b.USER_SPACE_ON_USE;
            }
        } else {
            this.f14866p = C5201a.EnumC5203b.OBJECT_BOUNDING_BOX;
        }
        invalidate();
    }

    /* renamed from: r */
    public void m25673r(Dynamic dynamic) {
        this.f14864n = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: s */
    public void m25672s(Double d) {
        this.f14864n = SVGLength.m25997d(d);
        invalidate();
    }

    @Override // com.horcrux.svg.C5227l, com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            C5201a c5201a = new C5201a(C5201a.EnumC5202a.PATTERN, new SVGLength[]{this.f14862l, this.f14863m, this.f14864n, this.f14865o}, this.f14866p);
            c5201a.m25968d(this.f14867q);
            c5201a.m25965g(this);
            Matrix matrix = this.f14874x;
            if (matrix != null) {
                c5201a.m25966f(matrix);
            }
            SvgView svgView = getSvgView();
            C5201a.EnumC5203b enumC5203b = this.f14866p;
            C5201a.EnumC5203b enumC5203b2 = C5201a.EnumC5203b.USER_SPACE_ON_USE;
            if (enumC5203b == enumC5203b2 || this.f14867q == enumC5203b2) {
                c5201a.m25964h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(c5201a, this.mName);
        }
    }

    public void setAlign(String str) {
        this.f14872v = str;
        invalidate();
    }

    public void setMeetOrSlice(int i) {
        this.f14873w = i;
        invalidate();
    }

    public void setMinX(float f) {
        this.f14868r = f;
        invalidate();
    }

    public void setMinY(float f) {
        this.f14869s = f;
        invalidate();
    }

    public void setVbHeight(float f) {
        this.f14871u = f;
        invalidate();
    }

    public void setVbWidth(float f) {
        this.f14870t = f;
        invalidate();
    }

    /* renamed from: t */
    public void m25671t(String str) {
        this.f14864n = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: u */
    public void m25670u(Dynamic dynamic) {
        this.f14862l = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: v */
    public void m25669v(Double d) {
        this.f14862l = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: w */
    public void m25668w(String str) {
        this.f14862l = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: x */
    public void m25667x(Dynamic dynamic) {
        this.f14863m = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: y */
    public void m25666y(Double d) {
        this.f14863m = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: z */
    public void m25665z(String str) {
        this.f14863m = SVGLength.m25996e(str);
        invalidate();
    }
}