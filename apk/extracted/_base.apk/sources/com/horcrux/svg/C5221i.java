package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.ViewProps;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5221i extends C5227l {

    /* renamed from: l */
    SVGLength f14666l;

    /* renamed from: m */
    SVGLength f14667m;

    /* renamed from: n */
    SVGLength f14668n;

    /* renamed from: o */
    SVGLength f14669o;

    /* renamed from: p */
    Bitmap f14670p;

    /* renamed from: q */
    Canvas f14671q;

    public C5221i(ReactContext reactContext) {
        super(reactContext);
        this.f14670p = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        this.f14671q = new Canvas(this.f14670p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.C5227l
    /* renamed from: b */
    public void mo25837b(Canvas canvas, Paint paint, float f) {
        mo25709h();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof C5238q)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!ViewProps.NONE.equals(virtualView.mDisplay)) {
                        boolean z = virtualView instanceof RenderableView;
                        if (z) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int saveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas, this.mCTM);
                        virtualView.render(canvas, paint, this.mOpacity * f);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(canvas, saveAndSetupCanvas);
                        if (z) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                } else {
                    childAt.draw(canvas);
                }
            }
        }
        setClientRect(rectF);
        mo25833g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(this.f14671q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.C5227l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        canvas.translate((float) relativeOnWidth(this.f14666l), (float) relativeOnHeight(this.f14667m));
        canvas.clipRect(0.0f, 0.0f, (float) relativeOnWidth(this.f14668n), (float) relativeOnHeight(this.f14669o));
        super.draw(canvas, paint, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(this.f14671q, view, j);
    }

    /* renamed from: l */
    public void m25871l(Dynamic dynamic) {
        this.f14669o = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: m */
    public void m25870m(Double d) {
        this.f14669o = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: n */
    public void m25869n(String str) {
        this.f14669o = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: o */
    public void m25868o(Dynamic dynamic) {
        this.f14668n = SVGLength.m25998c(dynamic);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    /* renamed from: p */
    public void m25867p(Double d) {
        this.f14668n = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: q */
    public void m25866q(String str) {
        this.f14668n = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: r */
    public void m25865r(Dynamic dynamic) {
        this.f14666l = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: s */
    public void m25864s(Double d) {
        this.f14666l = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: t */
    public void m25863t(String str) {
        this.f14666l = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: u */
    public void m25862u(Dynamic dynamic) {
        this.f14667m = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: v */
    public void m25861v(Double d) {
        this.f14667m = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: w */
    public void m25860w(String str) {
        this.f14667m = SVGLength.m25996e(str);
        invalidate();
    }
}
