package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.C0579u0;
import p155ia.C7489k;

/* renamed from: com.google.android.material.internal.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4895f extends C0579u0 {

    /* renamed from: A */
    private final Rect f13743A;

    /* renamed from: B */
    private int f13744B;

    /* renamed from: C */
    protected boolean f13745C;

    /* renamed from: D */
    boolean f13746D;

    /* renamed from: y */
    private Drawable f13747y;

    /* renamed from: z */
    private final Rect f13748z;

    public C4895f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f13747y;
        if (drawable != null) {
            if (this.f13746D) {
                this.f13746D = false;
                Rect rect = this.f13748z;
                Rect rect2 = this.f13743A;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f13745C) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f13744B, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f13747y;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f13747y;
        if (drawable != null && drawable.isStateful()) {
            this.f13747y.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f13747y;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f13744B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f13747y;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0579u0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f13746D = z | this.f13746D;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f13746D = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f13747y;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f13747y);
            }
            this.f13747y = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f13744B == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f13744B != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f13744B = i;
            if (i == 119 && this.f13747y != null) {
                this.f13747y.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f13747y;
    }

    public C4895f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13748z = new Rect();
        this.f13743A = new Rect();
        this.f13744B = 119;
        this.f13745C = true;
        this.f13746D = false;
        TypedArray m26945h = C4908m.m26945h(context, attributeSet, C7489k.f20456V1, i, 0, new int[0]);
        this.f13744B = m26945h.getInt(C7489k.f20471X1, this.f13744B);
        Drawable drawable = m26945h.getDrawable(C7489k.f20464W1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f13745C = m26945h.getBoolean(C7489k.f20478Y1, true);
        m26945h.recycle();
    }
}
