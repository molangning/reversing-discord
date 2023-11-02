package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C0622b extends Drawable {

    /* renamed from: a */
    private float f2096a;

    /* renamed from: c */
    private final RectF f2098c;

    /* renamed from: d */
    private final Rect f2099d;

    /* renamed from: e */
    private float f2100e;

    /* renamed from: h */
    private ColorStateList f2103h;

    /* renamed from: i */
    private PorterDuffColorFilter f2104i;

    /* renamed from: j */
    private ColorStateList f2105j;

    /* renamed from: f */
    private boolean f2101f = false;

    /* renamed from: g */
    private boolean f2102g = true;

    /* renamed from: k */
    private PorterDuff.Mode f2106k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private final Paint f2097b = new Paint(5);

    public C0622b(ColorStateList colorStateList, float f) {
        this.f2096a = f;
        m39540e(colorStateList);
        this.f2098c = new RectF();
        this.f2099d = new Rect();
    }

    /* renamed from: a */
    private PorterDuffColorFilter m39544a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    /* renamed from: e */
    private void m39540e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2103h = colorStateList;
        this.f2097b.setColor(colorStateList.getColorForState(getState(), this.f2103h.getDefaultColor()));
    }

    /* renamed from: i */
    private void m39536i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f2098c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f2099d.set(rect);
        if (this.f2101f) {
            float m39534b = C0623c.m39534b(this.f2100e, this.f2096a, this.f2102g);
            this.f2099d.inset((int) Math.ceil(C0623c.m39535a(this.f2100e, this.f2096a, this.f2102g)), (int) Math.ceil(m39534b));
            this.f2098c.set(this.f2099d);
        }
    }

    /* renamed from: b */
    public ColorStateList m39543b() {
        return this.f2103h;
    }

    /* renamed from: c */
    public float m39542c() {
        return this.f2100e;
    }

    /* renamed from: d */
    public float m39541d() {
        return this.f2096a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f2097b;
        if (this.f2104i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.f2104i);
            z = true;
        } else {
            z = false;
        }
        RectF rectF = this.f2098c;
        float f = this.f2096a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: f */
    public void m39539f(ColorStateList colorStateList) {
        m39540e(colorStateList);
        invalidateSelf();
    }

    /* renamed from: g */
    public void m39538g(float f, boolean z, boolean z2) {
        if (f == this.f2100e && this.f2101f == z && this.f2102g == z2) {
            return;
        }
        this.f2100e = f;
        this.f2101f = z;
        this.f2102g = z2;
        m39536i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f2099d, this.f2096a);
    }

    /* renamed from: h */
    public void m39537h(float f) {
        if (f == this.f2096a) {
            return;
        }
        this.f2096a = f;
        m39536i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2105j;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || (((colorStateList = this.f2103h) != null && colorStateList.isStateful()) || super.isStateful())) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m39536i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f2103h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState != this.f2097b.getColor()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f2097b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f2105j;
        if (colorStateList2 != null && (mode = this.f2106k) != null) {
            this.f2104i = m39544a(colorStateList2, mode);
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f2097b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2097b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2105j = colorStateList;
        this.f2104i = m39544a(colorStateList, this.f2106k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2106k = mode;
        this.f2104i = m39544a(this.f2105j, mode);
        invalidateSelf();
    }
}