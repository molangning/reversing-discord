package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import p006a5.C0025b;
import p394w2.C13379j;

/* renamed from: com.facebook.drawee.drawable.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC3622l extends Drawable implements InterfaceC3617i, InterfaceC3625o {

    /* renamed from: E */
    Matrix f9926E;

    /* renamed from: F */
    Matrix f9927F;

    /* renamed from: L */
    private TransformCallback f9933L;

    /* renamed from: j */
    private final Drawable f9934j;

    /* renamed from: t */
    float[] f9944t;

    /* renamed from: y */
    RectF f9949y;

    /* renamed from: k */
    protected boolean f9935k = false;

    /* renamed from: l */
    protected boolean f9936l = false;

    /* renamed from: m */
    protected float f9937m = 0.0f;

    /* renamed from: n */
    protected final Path f9938n = new Path();

    /* renamed from: o */
    protected boolean f9939o = true;

    /* renamed from: p */
    protected int f9940p = 0;

    /* renamed from: q */
    protected final Path f9941q = new Path();

    /* renamed from: r */
    private final float[] f9942r = new float[8];

    /* renamed from: s */
    final float[] f9943s = new float[8];

    /* renamed from: u */
    final RectF f9945u = new RectF();

    /* renamed from: v */
    final RectF f9946v = new RectF();

    /* renamed from: w */
    final RectF f9947w = new RectF();

    /* renamed from: x */
    final RectF f9948x = new RectF();

    /* renamed from: z */
    final Matrix f9950z = new Matrix();

    /* renamed from: A */
    final Matrix f9922A = new Matrix();

    /* renamed from: B */
    final Matrix f9923B = new Matrix();

    /* renamed from: C */
    final Matrix f9924C = new Matrix();

    /* renamed from: D */
    final Matrix f9925D = new Matrix();

    /* renamed from: G */
    final Matrix f9928G = new Matrix();

    /* renamed from: H */
    private float f9929H = 0.0f;

    /* renamed from: I */
    private boolean f9930I = false;

    /* renamed from: J */
    private boolean f9931J = false;

    /* renamed from: K */
    private boolean f9932K = true;

    public AbstractC3622l(Drawable drawable) {
        this.f9934j = drawable;
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    /* renamed from: a */
    public void mo31499a(boolean z) {
        this.f9935k = z;
        this.f9932K = true;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    /* renamed from: b */
    public void mo31498b(float f) {
        if (this.f9929H != f) {
            this.f9929H = f;
            this.f9932K = true;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    /* renamed from: c */
    public void mo31497c(float f) {
        boolean z;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2675i(z);
        Arrays.fill(this.f9942r, f);
        if (i != 0) {
            z2 = true;
        }
        this.f9936l = z2;
        this.f9932K = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f9934j.clearColorFilter();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    /* renamed from: d */
    public void mo31496d(boolean z) {
        if (this.f9931J != z) {
            this.f9931J = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (C0025b.m41375d()) {
            C0025b.m41378a("RoundedDrawable#draw");
        }
        this.f9934j.draw(canvas);
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    /* renamed from: e */
    public void mo31495e(boolean z) {
        if (this.f9930I != z) {
            this.f9930I = z;
            this.f9932K = true;
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public boolean m31494f() {
        return this.f9931J;
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    /* renamed from: g */
    public void mo31493g(float[] fArr) {
        boolean z;
        boolean z2;
        if (fArr == null) {
            Arrays.fill(this.f9942r, 0.0f);
            this.f9936l = false;
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C13379j.m2681c(z, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f9942r, 0, 8);
            this.f9936l = false;
            for (int i = 0; i < 8; i++) {
                boolean z3 = this.f9936l;
                if (fArr[i] > 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f9936l = z3 | z2;
            }
        }
        this.f9932K = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9934j.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f9934j.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f9934j.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f9934j.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f9934j.getOpacity();
    }

    /* renamed from: h */
    public boolean mo31492h() {
        return this.f9935k || this.f9936l || this.f9937m > 0.0f;
    }

    /* renamed from: i */
    public void m31491i() {
        float[] fArr;
        float f;
        if (this.f9932K) {
            this.f9941q.reset();
            RectF rectF = this.f9945u;
            float f2 = this.f9937m;
            rectF.inset(f2 / 2.0f, f2 / 2.0f);
            if (this.f9935k) {
                this.f9941q.addCircle(this.f9945u.centerX(), this.f9945u.centerY(), Math.min(this.f9945u.width(), this.f9945u.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.f9943s;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (this.f9942r[i] + this.f9929H) - (this.f9937m / 2.0f);
                    i++;
                }
                this.f9941q.addRoundRect(this.f9945u, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f9945u;
            float f3 = this.f9937m;
            rectF2.inset((-f3) / 2.0f, (-f3) / 2.0f);
            this.f9938n.reset();
            float f4 = this.f9929H;
            if (this.f9930I) {
                f = this.f9937m;
            } else {
                f = 0.0f;
            }
            float f5 = f4 + f;
            this.f9945u.inset(f5, f5);
            if (this.f9935k) {
                this.f9938n.addCircle(this.f9945u.centerX(), this.f9945u.centerY(), Math.min(this.f9945u.width(), this.f9945u.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f9930I) {
                if (this.f9944t == null) {
                    this.f9944t = new float[8];
                }
                for (int i2 = 0; i2 < this.f9943s.length; i2++) {
                    this.f9944t[i2] = this.f9942r[i2] - this.f9937m;
                }
                this.f9938n.addRoundRect(this.f9945u, this.f9944t, Path.Direction.CW);
            } else {
                this.f9938n.addRoundRect(this.f9945u, this.f9942r, Path.Direction.CW);
            }
            float f6 = -f5;
            this.f9945u.inset(f6, f6);
            this.f9938n.setFillType(Path.FillType.WINDING);
            this.f9932K = false;
        }
    }

    /* renamed from: j */
    public void m31490j() {
        Matrix matrix;
        TransformCallback transformCallback = this.f9933L;
        if (transformCallback != null) {
            transformCallback.getTransform(this.f9923B);
            this.f9933L.getRootBounds(this.f9945u);
        } else {
            this.f9923B.reset();
            this.f9945u.set(getBounds());
        }
        this.f9947w.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        this.f9948x.set(this.f9934j.getBounds());
        this.f9950z.setRectToRect(this.f9947w, this.f9948x, Matrix.ScaleToFit.FILL);
        if (this.f9930I) {
            RectF rectF = this.f9949y;
            if (rectF == null) {
                this.f9949y = new RectF(this.f9945u);
            } else {
                rectF.set(this.f9945u);
            }
            RectF rectF2 = this.f9949y;
            float f = this.f9937m;
            rectF2.inset(f, f);
            if (this.f9926E == null) {
                this.f9926E = new Matrix();
            }
            this.f9926E.setRectToRect(this.f9945u, this.f9949y, Matrix.ScaleToFit.FILL);
        } else {
            Matrix matrix2 = this.f9926E;
            if (matrix2 != null) {
                matrix2.reset();
            }
        }
        if (!this.f9923B.equals(this.f9924C) || !this.f9950z.equals(this.f9922A) || ((matrix = this.f9926E) != null && !matrix.equals(this.f9927F))) {
            this.f9939o = true;
            this.f9923B.invert(this.f9925D);
            this.f9928G.set(this.f9923B);
            if (this.f9930I) {
                this.f9928G.postConcat(this.f9926E);
            }
            this.f9928G.preConcat(this.f9950z);
            this.f9924C.set(this.f9923B);
            this.f9922A.set(this.f9950z);
            if (this.f9930I) {
                Matrix matrix3 = this.f9927F;
                if (matrix3 == null) {
                    this.f9927F = new Matrix(this.f9926E);
                } else {
                    matrix3.set(this.f9926E);
                }
            } else {
                Matrix matrix4 = this.f9927F;
                if (matrix4 != null) {
                    matrix4.reset();
                }
            }
        }
        if (!this.f9945u.equals(this.f9946v)) {
            this.f9932K = true;
            this.f9946v.set(this.f9945u);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f9934j.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f9934j.setAlpha(i);
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    public void setBorder(int i, float f) {
        if (this.f9940p != i || this.f9937m != f) {
            this.f9940p = i;
            this.f9937m = f;
            this.f9932K = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        this.f9934j.setColorFilter(i, mode);
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3625o
    public void setTransformCallback(TransformCallback transformCallback) {
        this.f9933L = transformCallback;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f9934j.setColorFilter(colorFilter);
    }
}