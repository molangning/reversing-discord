package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5236p extends C5227l {

    /* renamed from: l */
    private SVGLength f14798l;

    /* renamed from: m */
    private SVGLength f14799m;

    /* renamed from: n */
    private SVGLength f14800n;

    /* renamed from: o */
    private SVGLength f14801o;

    /* renamed from: p */
    private String f14802p;

    /* renamed from: q */
    private String f14803q;

    /* renamed from: r */
    private float f14804r;

    /* renamed from: s */
    private float f14805s;

    /* renamed from: t */
    private float f14806t;

    /* renamed from: u */
    private float f14807u;

    /* renamed from: v */
    String f14808v;

    /* renamed from: w */
    int f14809w;

    /* renamed from: x */
    Matrix f14810x;

    public C5236p(ReactContext reactContext) {
        super(reactContext);
        this.f14810x = new Matrix();
    }

    /* renamed from: l */
    public void m25781l(Canvas canvas, Paint paint, float f, C5252y c5252y, float f2) {
        double parseDouble;
        int saveAndSetupCanvas = saveAndSetupCanvas(canvas, this.mCTM);
        this.f14810x.reset();
        C5249w c5249w = c5252y.f14886b;
        this.f14810x.setTranslate((float) c5249w.f14875a, (float) c5249w.f14876b);
        if ("auto".equals(this.f14803q)) {
            parseDouble = -1.0d;
        } else {
            parseDouble = Double.parseDouble(this.f14803q);
        }
        if (parseDouble == -1.0d) {
            parseDouble = c5252y.f14887c;
        }
        this.f14810x.preRotate(((float) parseDouble) + 180.0f);
        if ("strokeWidth".equals(this.f14802p)) {
            Matrix matrix = this.f14810x;
            float f3 = this.mScale;
            matrix.preScale(f2 / f3, f2 / f3);
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) (relativeOnWidth(this.f14800n) / this.mScale), (float) (relativeOnHeight(this.f14801o) / this.mScale));
        if (this.f14808v != null) {
            float f4 = this.f14804r;
            float f5 = this.mScale;
            float f6 = this.f14805s;
            Matrix m25664a = C5248v0.m25664a(new RectF(f4 * f5, f6 * f5, (f4 + this.f14806t) * f5, (f6 + this.f14807u) * f5), rectF, this.f14808v, this.f14809w);
            float[] fArr = new float[9];
            m25664a.getValues(fArr);
            this.f14810x.preScale(fArr[0], fArr[4]);
        }
        this.f14810x.preTranslate((float) (-relativeOnWidth(this.f14798l)), (float) (-relativeOnHeight(this.f14799m)));
        canvas.concat(this.f14810x);
        mo25837b(canvas, paint, f);
        restoreCanvas(canvas, saveAndSetupCanvas);
    }

    /* renamed from: m */
    public void m25780m(Dynamic dynamic) {
        this.f14801o = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: n */
    public void m25779n(Double d) {
        this.f14801o = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: o */
    public void m25778o(String str) {
        this.f14801o = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: p */
    public void m25777p(String str) {
        this.f14802p = str;
        invalidate();
    }

    /* renamed from: q */
    public void m25776q(Dynamic dynamic) {
        this.f14800n = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: r */
    public void m25775r(Double d) {
        this.f14800n = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: s */
    public void m25774s(String str) {
        this.f14800n = SVGLength.m25996e(str);
        invalidate();
    }

    @Override // com.horcrux.svg.C5227l, com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMarker(this, this.mName);
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
        }
    }

    public void setAlign(String str) {
        this.f14808v = str;
        invalidate();
    }

    public void setMeetOrSlice(int i) {
        this.f14809w = i;
        invalidate();
    }

    public void setMinX(float f) {
        this.f14804r = f;
        invalidate();
    }

    public void setMinY(float f) {
        this.f14805s = f;
        invalidate();
    }

    public void setVbHeight(float f) {
        this.f14807u = f;
        invalidate();
    }

    public void setVbWidth(float f) {
        this.f14806t = f;
        invalidate();
    }

    /* renamed from: t */
    public void m25773t(String str) {
        this.f14803q = str;
        invalidate();
    }

    /* renamed from: u */
    public void m25772u(Dynamic dynamic) {
        this.f14798l = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: v */
    public void m25771v(Double d) {
        this.f14798l = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: w */
    public void m25770w(String str) {
        this.f14798l = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: x */
    public void m25769x(Dynamic dynamic) {
        this.f14799m = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: y */
    public void m25768y(Double d) {
        this.f14799m = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: z */
    public void m25767z(String str) {
        this.f14799m = SVGLength.m25996e(str);
        invalidate();
    }
}