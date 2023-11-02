package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p394w2.C13379j;

/* renamed from: com.facebook.drawee.drawable.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3607a extends Drawable implements Drawable.Callback, TransformCallback, InterfaceC3625o {

    /* renamed from: j */
    private TransformCallback f9858j;

    /* renamed from: l */
    private final Drawable[] f9860l;

    /* renamed from: m */
    private final InterfaceC3610c[] f9861m;

    /* renamed from: k */
    private final DrawableProperties f9859k = new DrawableProperties();

    /* renamed from: n */
    private final Rect f9862n = new Rect();

    /* renamed from: o */
    private boolean f9863o = false;

    /* renamed from: p */
    private boolean f9864p = false;

    /* renamed from: q */
    private boolean f9865q = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.drawee.drawable.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3608a implements InterfaceC3610c {

        /* renamed from: j */
        final /* synthetic */ int f9866j;

        C3608a(int i) {
            this.f9866j = i;
        }

        @Override // com.facebook.drawee.drawable.InterfaceC3610c
        public Drawable getDrawable() {
            return C3607a.this.m31533b(this.f9866j);
        }

        @Override // com.facebook.drawee.drawable.InterfaceC3610c
        public Drawable setDrawable(Drawable drawable) {
            return C3607a.this.m31530e(this.f9866j, drawable);
        }
    }

    public C3607a(Drawable[] drawableArr) {
        int i = 0;
        C13379j.m2677g(drawableArr);
        this.f9860l = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f9860l;
            if (i < drawableArr2.length) {
                C3611d.m31524d(drawableArr2[i], this, this);
                i++;
            } else {
                this.f9861m = new InterfaceC3610c[drawableArr2.length];
                return;
            }
        }
    }

    /* renamed from: a */
    private InterfaceC3610c m31534a(int i) {
        return new C3608a(i);
    }

    /* renamed from: b */
    public Drawable m31533b(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        if (i >= this.f9860l.length) {
            z2 = false;
        }
        C13379j.m2682b(Boolean.valueOf(z2));
        return this.f9860l[i];
    }

    /* renamed from: c */
    public InterfaceC3610c m31532c(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        if (i >= this.f9861m.length) {
            z2 = false;
        }
        C13379j.m2682b(Boolean.valueOf(z2));
        InterfaceC3610c[] interfaceC3610cArr = this.f9861m;
        if (interfaceC3610cArr[i] == null) {
            interfaceC3610cArr[i] = m31534a(i);
        }
        return this.f9861m[i];
    }

    /* renamed from: d */
    public int m31531d() {
        return this.f9860l.length;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f9860l;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public Drawable m31530e(int i, Drawable drawable) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        if (i >= this.f9860l.length) {
            z2 = false;
        }
        C13379j.m2682b(Boolean.valueOf(z2));
        Drawable drawable2 = this.f9860l[i];
        if (drawable != drawable2) {
            if (drawable != null && this.f9865q) {
                drawable.mutate();
            }
            C3611d.m31524d(this.f9860l[i], null, null);
            C3611d.m31524d(drawable, null, null);
            C3611d.m31523e(drawable, this.f9859k);
            C3611d.m31527a(drawable, this);
            C3611d.m31524d(drawable, this, this);
            this.f9864p = false;
            this.f9860l[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f9860l;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (i2 <= 0) {
            return -1;
        }
        return i2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f9860l;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (i2 <= 0) {
            return -1;
        }
        return i2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f9860l.length == 0) {
            return -2;
        }
        int i = 1;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f9860l;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    i2 = Drawable.resolveOpacity(i2, drawable.getOpacity());
                }
                i++;
            } else {
                return i2;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f9862n;
        while (true) {
            Drawable[] drawableArr = this.f9860l;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.getPadding(rect2);
                    rect.left = Math.max(rect.left, rect2.left);
                    rect.top = Math.max(rect.top, rect2.top);
                    rect.right = Math.max(rect.right, rect2.right);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                }
                i++;
            } else {
                return true;
            }
        }
    }

    @Override // com.facebook.drawee.drawable.TransformCallback
    public void getRootBounds(RectF rectF) {
        TransformCallback transformCallback = this.f9858j;
        if (transformCallback != null) {
            transformCallback.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // com.facebook.drawee.drawable.TransformCallback
    public void getTransform(Matrix matrix) {
        TransformCallback transformCallback = this.f9858j;
        if (transformCallback != null) {
            transformCallback.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f9864p) {
            this.f9863o = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.f9860l;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.f9863o;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f9863o = z2 | z;
                i++;
            }
            this.f9864p = true;
        }
        return this.f9863o;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f9860l;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.mutate();
                }
                i++;
            } else {
                this.f9865q = true;
                return this;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f9860l;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setBounds(rect);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f9860l;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && drawable.setLevel(i)) {
                    z = true;
                }
                i2++;
            } else {
                return z;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f9860l;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null && drawable.setState(iArr)) {
                    z = true;
                }
                i++;
            } else {
                return z;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f9859k.m31543b(i);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f9860l;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.setAlpha(i);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f9859k.m31542c(colorFilter);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f9860l;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f9859k.m31541d(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f9860l;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setDither(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f9859k.m31540e(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f9860l;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setFilterBitmap(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f9860l;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setHotspot(f, f2);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3625o
    public void setTransformCallback(TransformCallback transformCallback) {
        this.f9858j = transformCallback;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f9860l;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setVisible(z, z2);
                }
                i++;
            } else {
                return visible;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
