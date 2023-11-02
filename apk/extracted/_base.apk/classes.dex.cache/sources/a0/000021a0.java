package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import p394w2.C13379j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RoundedColorDrawable extends Drawable implements InterfaceC3617i {

    /* renamed from: l */
    float[] f9823l;

    /* renamed from: j */
    private final float[] f9821j = new float[8];

    /* renamed from: k */
    final float[] f9822k = new float[8];

    /* renamed from: m */
    final Paint f9824m = new Paint(1);

    /* renamed from: n */
    private boolean f9825n = false;

    /* renamed from: o */
    private float f9826o = 0.0f;

    /* renamed from: p */
    private float f9827p = 0.0f;

    /* renamed from: q */
    private int f9828q = 0;

    /* renamed from: r */
    private boolean f9829r = false;

    /* renamed from: s */
    private boolean f9830s = false;

    /* renamed from: t */
    final Path f9831t = new Path();

    /* renamed from: u */
    final Path f9832u = new Path();

    /* renamed from: v */
    private int f9833v = 0;

    /* renamed from: w */
    private final RectF f9834w = new RectF();

    /* renamed from: x */
    private int f9835x = 255;

    public RoundedColorDrawable(int i) {
        m31537i(i);
    }

    @TargetApi(11)
    /* renamed from: f */
    public static RoundedColorDrawable m31539f(ColorDrawable colorDrawable) {
        return new RoundedColorDrawable(colorDrawable.getColor());
    }

    /* renamed from: j */
    private void m31536j() {
        float[] fArr;
        float f;
        float[] fArr2;
        this.f9831t.reset();
        this.f9832u.reset();
        this.f9834w.set(getBounds());
        RectF rectF = this.f9834w;
        float f2 = this.f9826o;
        rectF.inset(f2 / 2.0f, f2 / 2.0f);
        int i = 0;
        if (this.f9825n) {
            this.f9832u.addCircle(this.f9834w.centerX(), this.f9834w.centerY(), Math.min(this.f9834w.width(), this.f9834w.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr = this.f9822k;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = (this.f9821j[i2] + this.f9827p) - (this.f9826o / 2.0f);
                i2++;
            }
            this.f9832u.addRoundRect(this.f9834w, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.f9834w;
        float f3 = this.f9826o;
        rectF2.inset((-f3) / 2.0f, (-f3) / 2.0f);
        float f4 = this.f9827p;
        if (this.f9829r) {
            f = this.f9826o;
        } else {
            f = 0.0f;
        }
        float f5 = f4 + f;
        this.f9834w.inset(f5, f5);
        if (this.f9825n) {
            this.f9831t.addCircle(this.f9834w.centerX(), this.f9834w.centerY(), Math.min(this.f9834w.width(), this.f9834w.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f9829r) {
            if (this.f9823l == null) {
                this.f9823l = new float[8];
            }
            while (true) {
                fArr2 = this.f9823l;
                if (i >= fArr2.length) {
                    break;
                }
                fArr2[i] = this.f9821j[i] - this.f9826o;
                i++;
            }
            this.f9831t.addRoundRect(this.f9834w, fArr2, Path.Direction.CW);
        } else {
            this.f9831t.addRoundRect(this.f9834w, this.f9821j, Path.Direction.CW);
        }
        float f6 = -f5;
        this.f9834w.inset(f6, f6);
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    /* renamed from: a */
    public void mo31499a(boolean z) {
        this.f9825n = z;
        m31536j();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    /* renamed from: b */
    public void mo31498b(float f) {
        if (this.f9827p != f) {
            this.f9827p = f;
            m31536j();
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    /* renamed from: c */
    public void mo31497c(float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2681c(z, "radius should be non negative");
        Arrays.fill(this.f9821j, f);
        m31536j();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    /* renamed from: d */
    public void mo31496d(boolean z) {
        if (this.f9830s != z) {
            this.f9830s = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f9824m.setColor(C3611d.m31525c(this.f9833v, this.f9835x));
        this.f9824m.setStyle(Paint.Style.FILL);
        this.f9824m.setFilterBitmap(m31538h());
        canvas.drawPath(this.f9831t, this.f9824m);
        if (this.f9826o != 0.0f) {
            this.f9824m.setColor(C3611d.m31525c(this.f9828q, this.f9835x));
            this.f9824m.setStyle(Paint.Style.STROKE);
            this.f9824m.setStrokeWidth(this.f9826o);
            canvas.drawPath(this.f9832u, this.f9824m);
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    /* renamed from: e */
    public void mo31495e(boolean z) {
        if (this.f9829r != z) {
            this.f9829r = z;
            m31536j();
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    /* renamed from: g */
    public void mo31493g(float[] fArr) {
        boolean z;
        if (fArr == null) {
            Arrays.fill(this.f9821j, 0.0f);
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C13379j.m2681c(z, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f9821j, 0, 8);
        }
        m31536j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9835x;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return C3611d.m31526b(C3611d.m31525c(this.f9833v, this.f9835x));
    }

    /* renamed from: h */
    public boolean m31538h() {
        return this.f9830s;
    }

    /* renamed from: i */
    public void m31537i(int i) {
        if (this.f9833v != i) {
            this.f9833v = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m31536j();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f9835x) {
            this.f9835x = i;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    public void setBorder(int i, float f) {
        if (this.f9828q != i) {
            this.f9828q = i;
            invalidateSelf();
        }
        if (this.f9826o != f) {
            this.f9826o = f;
            m31536j();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}