package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5227l extends RenderableView {

    /* renamed from: j */
    ReadableMap f14742j;

    /* renamed from: k */
    private C5223j f14743k;

    public C5227l(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: i */
    private static <T> T m25832i(T t) {
        t.getClass();
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo25837b(Canvas canvas, Paint paint, float f) {
        mo25709h();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        this.elements = new ArrayList<>();
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
                        ArrayList<C5241s> arrayList = virtualView.elements;
                        if (arrayList != null) {
                            this.elements.addAll(arrayList);
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                }
            }
        }
        setClientRect(rectF);
        mo25833g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m25836c(Canvas canvas, Paint paint, float f) {
        super.draw(canvas, paint, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C5223j m25835d() {
        return this.f14743k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        m25830k(canvas);
        clip(canvas, paint);
        mo25837b(canvas, paint, f);
        renderMarkers(canvas, paint, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Path mo25710e(Canvas canvas, Paint paint, Region.Op op) {
        Path path;
        Path path2 = new Path();
        Path.Op valueOf = Path.Op.valueOf(op.name());
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof C5238q) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                Matrix matrix = virtualView.mMatrix;
                if (virtualView instanceof C5227l) {
                    path = ((C5227l) virtualView).mo25710e(canvas, paint, op);
                } else {
                    path = virtualView.getPath(canvas, paint);
                }
                path.transform(matrix);
                path2.op(path, valueOf);
            }
        }
        return path2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C5223j m25834f() {
        return ((C5227l) m25832i(getTextRoot())).m25835d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo25833g() {
        m25834f().m25845n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        ((VirtualView) this).mPath = new Path();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof C5238q) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                ((VirtualView) this).mPath.addPath(virtualView.getPath(canvas, paint), virtualView.mMatrix);
            }
        }
        return ((VirtualView) this).mPath;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo25709h() {
        m25834f().m25844o(this, this.f14742j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        int reactTagForTouch;
        VirtualView virtualView;
        int hitTest;
        if (this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            Path clipPath = getClipPath();
            if (clipPath != null) {
                if (this.mClipRegionPath != clipPath) {
                    this.mClipRegionPath = clipPath;
                    RectF rectF = new RectF();
                    this.mClipBounds = rectF;
                    clipPath.computeBounds(rectF, true);
                    this.mClipRegion = getRegion(clipPath, this.mClipBounds);
                }
                if (!this.mClipRegion.contains(round, round2)) {
                    return -1;
                }
            }
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if (childAt instanceof VirtualView) {
                    if (!(childAt instanceof C5238q) && (hitTest = (virtualView = (VirtualView) childAt).hitTest(fArr2)) != -1) {
                        if (!virtualView.isResponsible() && hitTest == childAt.getId()) {
                            return getId();
                        }
                        return hitTest;
                    }
                } else if ((childAt instanceof SvgView) && (reactTagForTouch = ((SvgView) childAt).reactTagForTouch(fArr2[0], fArr2[1])) != childAt.getId()) {
                    return reactTagForTouch;
                }
            }
        }
        return -1;
    }

    /* renamed from: j */
    public void m25831j(ReadableMap readableMap) {
        this.f14742j = readableMap;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m25830k(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        Matrix matrix = this.mMatrix;
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        Matrix matrix2 = this.mTransform;
        if (matrix2 != null) {
            matrix2.mapRect(rectF);
        }
        this.f14743k = new C5223j(this.mScale, rectF.width(), rectF.height());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView
    public void resetProperties() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RenderableView) {
                ((RenderableView) childAt).resetProperties();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }
}
