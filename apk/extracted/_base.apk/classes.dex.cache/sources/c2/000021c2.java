package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.ScalingUtils;
import p394w2.C13375i;
import p394w2.C13379j;

/* renamed from: com.facebook.drawee.drawable.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3624n extends C3614f {

    /* renamed from: j */
    ScalingUtils.ScaleType f9951j;

    /* renamed from: k */
    Object f9952k;

    /* renamed from: l */
    PointF f9953l;

    /* renamed from: m */
    int f9954m;

    /* renamed from: n */
    int f9955n;

    /* renamed from: o */
    Matrix f9956o;

    /* renamed from: p */
    private Matrix f9957p;

    public C3624n(Drawable drawable, ScalingUtils.ScaleType scaleType) {
        super((Drawable) C13379j.m2677g(drawable));
        this.f9953l = null;
        this.f9954m = 0;
        this.f9955n = 0;
        this.f9957p = new Matrix();
        this.f9951j = scaleType;
    }

    /* renamed from: i */
    private void m31488i() {
        boolean z;
        ScalingUtils.ScaleType scaleType = this.f9951j;
        boolean z2 = true;
        if (scaleType instanceof ScalingUtils.InterfaceC3606m) {
            Object state = ((ScalingUtils.InterfaceC3606m) scaleType).getState();
            if (state != null && state.equals(this.f9952k)) {
                z = false;
            } else {
                z = true;
            }
            this.f9952k = state;
        } else {
            z = false;
        }
        if (this.f9954m == getCurrent().getIntrinsicWidth() && this.f9955n == getCurrent().getIntrinsicHeight()) {
            z2 = false;
        }
        if (z2 || z) {
            m31489h();
        }
    }

    @Override // com.facebook.drawee.drawable.C3614f, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m31488i();
        if (this.f9956o != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f9956o);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    @Override // com.facebook.drawee.drawable.C3614f, com.facebook.drawee.drawable.TransformCallback
    public void getTransform(Matrix matrix) {
        getParentTransform(matrix);
        m31488i();
        Matrix matrix2 = this.f9956o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: h */
    void m31489h() {
        float f;
        float f2;
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f9954m = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f9955n = intrinsicHeight;
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            if (intrinsicWidth == width && intrinsicHeight == height) {
                current.setBounds(bounds);
                this.f9956o = null;
                return;
            } else if (this.f9951j == ScalingUtils.ScaleType.f9836a) {
                current.setBounds(bounds);
                this.f9956o = null;
                return;
            } else {
                current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                ScalingUtils.ScaleType scaleType = this.f9951j;
                Matrix matrix = this.f9957p;
                PointF pointF = this.f9953l;
                if (pointF != null) {
                    f = pointF.x;
                } else {
                    f = 0.5f;
                }
                if (pointF != null) {
                    f2 = pointF.y;
                } else {
                    f2 = 0.5f;
                }
                scaleType.getTransform(matrix, bounds, intrinsicWidth, intrinsicHeight, f, f2);
                this.f9956o = this.f9957p;
                return;
            }
        }
        current.setBounds(bounds);
        this.f9956o = null;
    }

    /* renamed from: j */
    public PointF m31487j() {
        return this.f9953l;
    }

    /* renamed from: k */
    public ScalingUtils.ScaleType m31486k() {
        return this.f9951j;
    }

    /* renamed from: l */
    public void m31485l(PointF pointF) {
        if (C13375i.m2691a(this.f9953l, pointF)) {
            return;
        }
        if (pointF == null) {
            this.f9953l = null;
        } else {
            if (this.f9953l == null) {
                this.f9953l = new PointF();
            }
            this.f9953l.set(pointF);
        }
        m31489h();
        invalidateSelf();
    }

    /* renamed from: m */
    public void m31484m(ScalingUtils.ScaleType scaleType) {
        if (C13375i.m2691a(this.f9951j, scaleType)) {
            return;
        }
        this.f9951j = scaleType;
        this.f9952k = null;
        m31489h();
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.drawable.C3614f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        m31489h();
    }

    @Override // com.facebook.drawee.drawable.C3614f
    public Drawable setCurrent(Drawable drawable) {
        Drawable current = super.setCurrent(drawable);
        m31489h();
        return current;
    }
}